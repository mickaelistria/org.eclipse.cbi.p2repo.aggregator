package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.PackedStrategy;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.engine.maven.InstallableUnitMapping;
import org.eclipse.b3.aggregator.engine.maven.MavenRepositoryHelper;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.IOUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.equinox.internal.p2.artifact.repository.MirrorRequest;
import org.eclipse.equinox.internal.p2.artifact.repository.RawMirrorRequest;
import org.eclipse.equinox.internal.p2.artifact.repository.simple.SimpleArtifactRepository;
import org.eclipse.equinox.internal.p2.repository.Transport;
import org.eclipse.equinox.internal.provisional.p2.artifact.repository.processing.ProcessingStepHandler;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.artifact.ArtifactKeyQuery;
import org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IFileArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.spi.ArtifactDescriptor;
import org.eclipse.equinox.spi.p2.publisher.PublisherHelper;

public class MirrorGenerator extends BuilderPhase {
	/**
	 * A request to restore the canonical form after a raw copy of the optimized form
	 */
	private static class CanonicalizeRequest extends MirrorRequest {
		private IArtifactDescriptor optimizedDescriptor;

		/** Set during perform, clients may read this field to access the destination file. */
		File destination;

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IArtifactRepository sourceRepository,
				IFileArtifactRepository targetRepository, Transport transport) {
			super(optimizedDescriptor.getArtifactKey(), targetRepository, null, null, transport);
			this.optimizedDescriptor = optimizedDescriptor;
			setSourceRepository(sourceRepository);
		}

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IFileArtifactRepository targetRepository,
				Transport transport) {
			this(optimizedDescriptor, targetRepository, targetRepository, transport);
		}

		@Override
		public void perform(IArtifactRepository sourceRepository, IProgressMonitor monitor) {
			SubMonitor subMon = SubMonitor.convert(monitor, 100);
			try {
				IFileArtifactRepository fbTarget = (IFileArtifactRepository) target;
				IArtifactKey artifactKey = optimizedDescriptor.getArtifactKey();
				destination = fbTarget.getArtifactFile(new ArtifactDescriptor(artifactKey));
				OutputStream out = null;
				try {
					File destFolder = destination.getParentFile();
					destFolder.mkdirs();
					if(!destFolder.isDirectory())
						throw new IOException("Unable to create path " + destFolder.getAbsolutePath());

					out = new BufferedOutputStream(new FileOutputStream(destination));
					IStatus status = sourceRepository.getArtifact(optimizedDescriptor, out, subMon.newChild(90));
					if(!status.isOK()) {
						setResult(status);
						return;
					}
				}
				catch(IOException e) {
					setResult(new Status(IStatus.ERROR, Engine.PLUGIN_ID, e.getMessage(), e));
					return;
				}
				finally {
					IOUtils.close(out);
				}
				ArtifactDescriptor canonical = (ArtifactDescriptor) PublisherHelper.createArtifactDescriptor(
					artifactKey, destination);
				for(Map.Entry<String, String> entry : optimizedDescriptor.getProperties().entrySet()) {
					String propKey = entry.getKey();
					if(propKey.equals(IArtifactDescriptor.DOWNLOAD_MD5) ||
							propKey.equals(IArtifactDescriptor.DOWNLOAD_SIZE) ||
							propKey.equals(IArtifactDescriptor.ARTIFACT_SIZE) ||
							propKey.equals(IArtifactDescriptor.FORMAT) || propKey.equals("artifact.uuid"))
						continue;
					canonical.setProperty(entry.getKey(), entry.getValue());
				}
				fbTarget.addDescriptor(canonical, subMon.newChild(10));
				setResult(Status.OK_STATUS);
			}
			finally {
				MonitorUtils.done(monitor);
			}
		}
	}

	private static boolean checkIfTargetPresent(IArtifactRepository destination, IArtifactKey key, boolean packed) {
		IArtifactDescriptor found = getArtifactDescriptor(destination, key, packed);
		if(found != null) {
			LogUtils.debug("    %s artifact is already present", packed
					? "optimized"
					: "canonical");
			return true;
		}
		return false;
	}

	// VERSION USING nio from JAVA7:
	// /**
	// * Create a link to existingFile in the same directory but using newSimpleFilename as the link name.
	// */
	// private static void createLink(List<String> errors, File existingFile, String newSimpleFilename) {
	// if(newSimpleFilename.equals(existingFile.getName()))
	// return;
	// try {
	// String destDir = existingFile.getParent();
	// FileSystem fs = FileSystems.getDefault();
	// try {
	// Files.createLink(fs.getPath(destDir, newSimpleFilename), fs.getPath(existingFile.getCanonicalPath()));
	// }
	// catch(IOException e) {
	// LogUtils.error(e, e.getMessage());
	// errors.add(Builder.getExceptionMessages(e));
	// }
	// }
	// catch(NoClassDefFoundError notAvailable) {
	// String msg = "Cannot create link, necessary package 'java.nio.file' is not available. Please consider using Java 7 or greater.";
	// LogUtils.error(msg);
	// errors.add(msg);
	// }
	// }

	/**
	 * Create a link to existingFile in the same directory but using newSimpleFilename as the link name.
	 * This implementation only works on *nix :(
	 */
	private static void createLink(List<String> errors, File existingFile, String newSimpleFilename) {
		if(newSimpleFilename.equals(existingFile.getName()))
			return;
		String os = System.getProperty("os.name").toLowerCase();
		if(os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0) {
			try {
				Runtime.getRuntime().exec(
					new String[] { "/bin/ln", existingFile.getName(), newSimpleFilename }, null,
					existingFile.getParentFile());
			}
			catch(IOException e) {
				String msg = "Cannot create link.";
				LogUtils.error(e, msg);
				errors.add(msg + " cause: " + e.getMessage());
			}
		}
		else {
			String msg = "Cannot create link, currently supported only on *nix operating systems.";
			LogUtils.error(msg);
			errors.add(msg);
		}
	}

	private static void createMavenJarLink(File existingFile, IArtifactKey key,
			Map<IArtifactKey, IInstallableUnit> keyedIUs, MavenRepositoryHelper mavenHelper, List<String> errors)
			throws CoreException {
		if(mavenHelper != null && keyedIUs != null) {
			IInstallableUnit iu = keyedIUs.get(key);
			InstallableUnitMapping unitMapping = mavenHelper.getTop().findUnit(iu);
			String existingExtension = null;
			int lastDot = existingFile.getName().lastIndexOf('.');
			if(lastDot != -1)
				existingExtension = existingFile.getName().substring(lastDot + 1);
			String newPath = unitMapping.getFileName(existingExtension, true);
			createLink(errors, existingFile, newPath);
		}
	}

	private static IStatus extractDeeperRootCause(IStatus status) {
		if(status == null)
			return null;

		if(status.isMultiStatus()) {
			IStatus[] children = ((MultiStatus) status).getChildren();
			for(int i = 0; i < children.length; i++) {
				IStatus deeper = extractDeeperRootCause(children[i]);
				if(deeper != null)
					return deeper;
			}
		}

		Throwable t = status.getException();
		if(t instanceof CoreException) {
			IStatus deeper = extractDeeperRootCause(((CoreException) t).getStatus());
			if(deeper != null)
				return deeper;
		}
		return status.getSeverity() == IStatus.ERROR
				? status
				: null;
	}

	/**
	 * Extract the root cause. The root cause is the first severe non-MultiStatus status containing an exception when
	 * searching depth first otherwise null.
	 * 
	 * @param status
	 * @return root cause
	 */
	private static IStatus extractRootCause(IStatus status) {
		IStatus rootCause = extractDeeperRootCause(status);
		return rootCause == null
				? status
				: rootCause;
	}

	private static IArtifactDescriptor getArtifactDescriptor(IArtifactRepository destination, IArtifactKey key,
			boolean packed) {
		for(IArtifactDescriptor candidate : destination.getArtifactDescriptors(key)) {
			if(isPacked(candidate)) {
				if(packed)
					return candidate;
			}
			else {
				if(!packed)
					return candidate;
			}
		}
		return null;
	}

	private static boolean isPacked(IArtifactDescriptor desc) {
		return desc != null && "packed".equals(desc.getProperty(IArtifactDescriptor.FORMAT)) &&
				ProcessingStepHandler.canProcess(desc);
	}

	static void mirror(Collection<IArtifactKey> keysToInstall, Map<IArtifactKey, IInstallableUnit> keyedIUs,
			IArtifactRepository cache, IArtifactRepository source, IFileArtifactRepository dest, Transport transport,
			PackedStrategy strategy, List<String> errors, MavenRepositoryHelper mavenHelper, IProgressMonitor monitor) {
		IQueryResult<IArtifactKey> result = source.query(ArtifactKeyQuery.ALL_KEYS, null);
		IArtifactKey[] keys = result.toArray(IArtifactKey.class);
		MonitorUtils.begin(monitor, keys.length * 100);

		for(IArtifactKey key : keys) {
			// We must iterate here since EMF lists use identity comparison
			// ant not equals.
			boolean found = false;
			Iterator<IArtifactKey> keyIterator = keysToInstall.iterator();
			while(keyIterator.hasNext()) {
				IArtifactKey keyToInstall = keyIterator.next();
				if(keyToInstall.equals(key)) {
					found = true;
					keyIterator.remove();
					break;
				}
			}

			if(!found)
				continue;

			LogUtils.info("- mirroring artifact %s", key);

			IArtifactRepository sourceForCopy;
			if(cache != null && cache.contains(key))
				sourceForCopy = cache;
			else
				sourceForCopy = source;

			PackedStrategy keyStrategy;

			if(!"osgi.bundle".equals(key.getClassifier()))
				//
				// Only osgi.bundles will contain .class files so we get rid of
				// excessive use of pack200 here.
				//
				keyStrategy = PackedStrategy.SKIP;
			else
				keyStrategy = strategy;

			try {
				IArtifactDescriptor[] aDescs = sourceForCopy.getArtifactDescriptors(key);
				// Typically one that has no format and one that is packed.
				// If so,
				// just copy the packed one.
				//
				IArtifactDescriptor optimized = null;
				IArtifactDescriptor canonical = null;
				for(IArtifactDescriptor desc : aDescs) {
					if(isPacked(desc))
						optimized = desc;
					else
						canonical = desc;
				}

				if(optimized == null && canonical == null)
					throw ExceptionUtils.fromMessage(
						"Found no usable descriptor for artifact %s in repository %s", key, dest.getLocation());

				if(keyStrategy == PackedStrategy.SKIP && canonical == null) {
					LogUtils.warning("    canonical artifact unavailable, using optimized one instead");
					keyStrategy = PackedStrategy.COPY;
				}
				else if(keyStrategy != PackedStrategy.SKIP && optimized == null)
					keyStrategy = PackedStrategy.SKIP;

				switch(keyStrategy) {
					case SKIP:
						if(!checkIfTargetPresent(dest, key, false)) {
							LogUtils.debug("    doing copy of canonical artifact");
							IArtifactDescriptor destDesc = mirror(
								sourceForCopy, dest, canonical, new ArtifactDescriptor(canonical), transport,
								MonitorUtils.subMonitor(monitor, 90));
							if(dest instanceof SimpleArtifactRepository) { // is there a better way to find the result File?
								URI destURI = ((SimpleArtifactRepository) dest).createLocation((ArtifactDescriptor) destDesc);
								File destFile = URIUtil.toFile(destURI);
								createMavenJarLink(destFile, key, keyedIUs, mavenHelper, errors);
							}
						}
						break;
					case COPY:
						if(!checkIfTargetPresent(dest, key, true)) {
							LogUtils.debug("    doing copy of optimized artifact");
							mirror(
								sourceForCopy, dest, optimized, new ArtifactDescriptor(optimized), transport,
								MonitorUtils.subMonitor(monitor, 90));
						}
						break;
					default:
						if(keyStrategy == PackedStrategy.UNPACK) {
							if(!checkIfTargetPresent(dest, key, false)) {
								LogUtils.debug("    doing copy of optimized artifact into canonical target");
								unpack(sourceForCopy, dest, optimized, transport, MonitorUtils.subMonitor(monitor, 90));
							}
							continue;
						}

						boolean isVerify = keyStrategy == PackedStrategy.VERIFY;
						if(checkIfTargetPresent(dest, key, true)) {
							if(isVerify)
								// Treat the target as verified.
								break;
						}
						else {
							LogUtils.debug("    doing copy of optimized artifact");
							mirror(
								sourceForCopy, dest, optimized, new ArtifactDescriptor(optimized), transport,
								MonitorUtils.subMonitor(monitor, 70));
						}

						if(isVerify)
							LogUtils.debug("    unpacking optimized artifact for verification");
						else {
							if(checkIfTargetPresent(dest, key, false))
								break;
							LogUtils.debug("    unpacking optimized artifact");
						}

						File destFile = unpackToSibling(
							dest, getArtifactDescriptor(dest, key, true), transport, isVerify,
							MonitorUtils.subMonitor(monitor, 20));

						createMavenJarLink(destFile, key, keyedIUs, mavenHelper, errors);
				}
			}
			catch(CoreException e) {
				LogUtils.error(e, e.getMessage());
				errors.add(Builder.getExceptionMessages(e));
				dest.removeDescriptor(key, MonitorUtils.subMonitor(monitor, 2));
			}
		}

		// the collection of keys to install should now be empty unless some artifacts could not be found
		for(IArtifactKey key : keysToInstall) {
			String msg = "Artifact " + key + " could not be found in the artifact repository (" + source.getLocation() +
					")";
			LogUtils.error(msg);
			errors.add(msg);
		}

		MonitorUtils.done(monitor);
	}

	static IArtifactDescriptor mirror(IArtifactRepository source, IArtifactRepository dest,
			IArtifactDescriptor sourceDesc, IArtifactDescriptor targetDesc, Transport transport,
			IProgressMonitor monitor) throws CoreException {
		if(dest.contains(targetDesc))
			return targetDesc;

		RawMirrorRequest request = new RawMirrorRequest(sourceDesc, targetDesc, dest, transport);
		request.perform(source, monitor);
		IStatus result = request.getResult();
		switch(result.getSeverity()) {
			case IStatus.INFO:
				LogUtils.info(result.getMessage());
			case IStatus.OK:
				// Unfortunately, this doesn't necessarily mean that everything is OK. Zero sized files are
				// silently ignored. See bug 290986
				// We can't have that here.
				if(getArtifactDescriptor(dest, targetDesc.getArtifactKey(), isPacked(targetDesc)) != null)
					// All is well.
					return targetDesc;

				result = new Status(IStatus.ERROR, Engine.PLUGIN_ID, "Zero bytes copied");
				break;
			case IStatus.CANCEL:
				LogUtils.warning("Aggregation cancelled while mirroring artifact %s", sourceDesc.getArtifactKey());
				throw new OperationCanceledException();
			default:
				if(result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
					LogUtils.warning("  copy failed. Artifact %s is already present", sourceDesc.getArtifactKey());
					return targetDesc;
				}
				result = extractRootCause(result);
		}

		throw ExceptionUtils.fromMessage(
			result.getException(), "Unable to mirror artifact %s from repository %s: %s", sourceDesc.getArtifactKey(),
			source.getLocation(), result.getMessage());
	}

	private static void unpack(IArtifactRepository source, IFileArtifactRepository target,
			IArtifactDescriptor optimized, Transport transport, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, source, target, transport);
		request.perform(source, monitor);
		IStatus result = request.getResult();
		if(result.getSeverity() != IStatus.ERROR ||
				result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
			return;
		}

		result = extractRootCause(result);
		throw ExceptionUtils.fromMessage(
			result.getException(), "Unable to unpack artifact %s in repository %s: %s", optimized.getArtifactKey(),
			target.getLocation(), result.getMessage());
	}

	private static File unpackToSibling(IFileArtifactRepository target, IArtifactDescriptor optimized,
			Transport transport, boolean verifyOnly, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, target, transport);
		MonitorUtils.begin(monitor, 20);
		try {
			request.perform(target, MonitorUtils.subMonitor(monitor, 18));
			IStatus result = request.getResult();
			if(result.getSeverity() != IStatus.ERROR ||
					result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
				if(verifyOnly)
					target.removeDescriptor(
						getArtifactDescriptor(target, optimized.getArtifactKey(), false),
						MonitorUtils.subMonitor(monitor, 2));
				return request.destination;
			}

			result = extractRootCause(result);
			throw ExceptionUtils.fromMessage(
				result.getException(), "Unable to unpack artifact %s in repository %s: %s", optimized.getArtifactKey(),
				target.getLocation(), result.getMessage());
		}
		finally {
			MonitorUtils.done(monitor);
		}
	}

	private final ValidationSet validationSet;

	public MirrorGenerator(Builder builder, ValidationSet validationSet) {
		super(builder);
		this.validationSet = validationSet;
	}

	private Transport getTransport() {
		return getBuilder().getTransport();
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		LogUtils.info("Starting artifacts mirroring");
		long start = TimeUtils.getNow();

		Builder builder = getBuilder();

		Aggregation aggregation = builder.getAggregation();
		PackedStrategy packedStrategy = aggregation.getPackedStrategy();
		List<Contribution> contribs = validationSet.getAllContributions();
		Set<IInstallableUnit> unitsToAggregate = builder.getUnitsToAggregate(validationSet);
		Set<IArtifactKey> keysToExclude = builder.getArtifactKeysToExcludeFromMirroring();

		SubMonitor subMon = SubMonitor.convert(monitor, 20 + 100 * contribs.size());
		boolean artifactErrors = false;
		try {
			IArtifactRepository tempAr = builder.getTemporaryArtifactRepository(subMon.newChild(10));
			IFileArtifactRepository aggregationAr = builder.getAggregationArtifactRepository(subMon.newChild(10));
			for(Contribution contrib : contribs) {
				SubMonitor contribMonitor = subMon.newChild(100);
				List<MappedRepository> repos = contrib.getRepositories(true);
				List<String> errors = new ArrayList<String>();
				MonitorUtils.begin(contribMonitor, repos.size() * 100);
				for(MappedRepository repo : repos) {
					if(builder.isMapVerbatim(repo) || !repo.isMirrorArtifacts()) {
						MonitorUtils.worked(contribMonitor, 100);
						continue;
					}
					MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
					ArrayList<IArtifactKey> keysToMirror = null;
					Map<IArtifactKey, IInstallableUnit> keyedIUs = new HashMap<IArtifactKey, IInstallableUnit>();
					for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
						if(!unitsToAggregate.contains(iu))
							continue;

						for(IArtifactKey ak : iu.getArtifacts()) {
							if(!keysToExclude.add(ak))
								continue;

							if(keysToMirror == null)
								keysToMirror = new ArrayList<IArtifactKey>();
							keysToMirror.add(ak);
							keyedIUs.put(ak, iu);
						}
					}

					if(keysToMirror != null) {
						String msg = format("Mirroring artifacts from %s", childMdr.getLocation());
						LogUtils.info(msg);
						contribMonitor.subTask(msg);
						IArtifactRepository childAr = builder.getArtifactRepository(
							repo,
							contribMonitor.newChild(1, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
						mirror(
							keysToMirror,
							keyedIUs,
							tempAr,
							childAr,
							aggregationAr,
							getTransport(),
							packedStrategy,
							errors,
							builder.getMavenHelper(),
							contribMonitor.newChild(94, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
					}
					else
						MonitorUtils.worked(contribMonitor, 95);
				}
				if(errors.size() > 0) {
					artifactErrors = true;
					builder.sendEmail(contrib, errors);
					for(String err : errors)
						LogUtils.error("Error during mirroring: " + err);
				}
				MonitorUtils.done(contribMonitor);
			}
		}
		finally {
			MonitorUtils.done(monitor);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		if(artifactErrors)
			throw ExceptionUtils.fromMessage("Not all artifacts could be mirrored, see log for details");
	}
}
