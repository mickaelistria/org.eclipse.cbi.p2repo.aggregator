package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MavenMapping;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.PackedStrategy;
import org.eclipse.b3.aggregator.engine.maven.InstallableUnitMapping;
import org.eclipse.b3.aggregator.engine.maven.MavenManager;
import org.eclipse.b3.aggregator.engine.maven.MavenRepositoryHelper;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.p2.loader.IRepositoryLoader;
import org.eclipse.b3.p2.maven.indexer.IMaven2Indexer;
import org.eclipse.b3.p2.maven.indexer.IndexerUtils;
import org.eclipse.b3.p2.util.IUUtils;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.b3.p2.util.RepositoryLoaderUtils;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.IOUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository;
import org.eclipse.equinox.internal.p2.artifact.repository.MirrorRequest;
import org.eclipse.equinox.internal.p2.artifact.repository.RawMirrorRequest;
import org.eclipse.equinox.internal.p2.artifact.repository.simple.SimpleArtifactDescriptor;
import org.eclipse.equinox.internal.p2.artifact.repository.simple.SimpleArtifactRepository;
import org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository;
import org.eclipse.equinox.internal.provisional.p2.artifact.repository.processing.ProcessingStepHandler;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.publisher.Publisher;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.artifact.ArtifactKeyQuery;
import org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.artifact.IFileArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.spi.ArtifactDescriptor;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.eclipse.equinox.spi.p2.publisher.PublisherHelper;

public class MirrorGenerator extends BuilderPhase {
	/**
	 * A request to restore the canonical form after a raw copy of the optimized form
	 */
	private static class CanonicalizeRequest extends MirrorRequest {
		private IArtifactDescriptor optimizedDescriptor;

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IArtifactRepository sourceRepository,
				IFileArtifactRepository targetRepository) {
			super(optimizedDescriptor.getArtifactKey(), targetRepository, null, null);
			this.optimizedDescriptor = optimizedDescriptor;
			setSourceRepository(sourceRepository);
		}

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IFileArtifactRepository targetRepository) {
			this(optimizedDescriptor, targetRepository, targetRepository);
		}

		@Override
		public void perform(IArtifactRepository sourceRepository, IProgressMonitor monitor) {
			IFileArtifactRepository fbTarget = (IFileArtifactRepository) target;
			IArtifactKey artifactKey = optimizedDescriptor.getArtifactKey();
			File destination = fbTarget.getArtifactFile(new ArtifactDescriptor(artifactKey));
			OutputStream out = null;
			try {
				File destFolder = destination.getParentFile();
				destFolder.mkdirs();
				if(!destFolder.isDirectory())
					throw new IOException("Unable to create path " + destFolder.getAbsolutePath());

				out = new BufferedOutputStream(new FileOutputStream(destination));
				IStatus status = sourceRepository.getArtifact(optimizedDescriptor, out, monitor);
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
			fbTarget.addDescriptor(canonical);
			setResult(Status.OK_STATUS);
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

	static void mirror(Collection<IArtifactKey> keysToInstall, IArtifactRepository cache, IArtifactRepository source,
			IFileArtifactRepository dest, PackedStrategy strategy, List<String> errors, IProgressMonitor monitor) {
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
							mirror(
								sourceForCopy, dest, canonical, new ArtifactDescriptor(canonical),
								MonitorUtils.subMonitor(monitor, 90));
						}
						break;
					case COPY:
						if(!checkIfTargetPresent(dest, key, true)) {
							LogUtils.debug("    doing copy of optimized artifact");
							mirror(
								sourceForCopy, dest, optimized, new ArtifactDescriptor(optimized),
								MonitorUtils.subMonitor(monitor, 90));
						}
						break;
					default:
						if(keyStrategy == PackedStrategy.UNPACK) {
							if(!checkIfTargetPresent(dest, key, false)) {
								LogUtils.debug("    doing copy of optimized artifact into canonical target");
								unpack(sourceForCopy, dest, optimized, MonitorUtils.subMonitor(monitor, 90));
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
								sourceForCopy, dest, optimized, new ArtifactDescriptor(optimized),
								MonitorUtils.subMonitor(monitor, 70));
						}

						if(isVerify)
							LogUtils.debug("    unpacking optimized artifact for verification");
						else {
							if(checkIfTargetPresent(dest, key, false))
								break;
							LogUtils.debug("    unpacking optimized artifact");
						}

						unpackToSibling(
							dest, getArtifactDescriptor(dest, key, true), isVerify,
							MonitorUtils.subMonitor(monitor, 20));
				}
			}
			catch(CoreException e) {
				LogUtils.error(e, e.getMessage());
				errors.add(Builder.getExceptionMessages(e));
				dest.removeDescriptor(key);
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
			IArtifactDescriptor sourceDesc, IArtifactDescriptor targetDesc, IProgressMonitor monitor)
			throws CoreException {
		if(dest.contains(targetDesc))
			return targetDesc;

		RawMirrorRequest request = new RawMirrorRequest(sourceDesc, targetDesc, dest);
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
			IArtifactDescriptor optimized, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, source, target);
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

	private static void unpackToSibling(IFileArtifactRepository target, IArtifactDescriptor optimized,
			boolean verifyOnly, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, target);
		request.perform(target, monitor);
		IStatus result = request.getResult();
		if(result.getSeverity() != IStatus.ERROR ||
				result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
			if(verifyOnly)
				target.removeDescriptor(getArtifactDescriptor(target, optimized.getArtifactKey(), false));
			return;
		}

		result = extractRootCause(result);
		throw ExceptionUtils.fromMessage(
			result.getException(), "Unable to unpack artifact %s in repository %s: %s", optimized.getArtifactKey(),
			target.getLocation(), result.getMessage());
	}

	private IMetadataRepositoryManager mdrMgr;

	private IArtifactRepositoryManager arMgr;

	private Map<MetadataRepositoryReference, IArtifactRepository> arCache;

	public MirrorGenerator(Builder builder) {
		super(builder);
	}

	public Set<IArtifactKey> getArtifactKeysToExclude() throws CoreException {
		Builder builder = getBuilder();
		Aggregator aggregator = builder.getAggregator();

		HashSet<IArtifactKey> keysToExclude = new HashSet<IArtifactKey>();
		List<Contribution> contribs = aggregator.getContributions();
		for(Contribution contrib : contribs) {
			for(MappedRepository repo : contrib.getRepositories(true)) {
				if(repo.isMirrorArtifacts())
					continue;

				for(IInstallableUnit iu : ResourceUtils.getMetadataRepository(repo).getInstallableUnits())
					keysToExclude.addAll(iu.getArtifacts());
			}
		}
		return keysToExclude;
	}

	private IArtifactRepository getArtifactRepository(MetadataRepositoryReference repo, IProgressMonitor monitor)
			throws CoreException {
		if(arCache == null)
			arCache = new HashMap<MetadataRepositoryReference, IArtifactRepository>();

		IArtifactRepository ar = arCache.get(repo);
		if(ar == null) {
			IConfigurationElement config = RepositoryLoaderUtils.getLoaderFor(repo.getNature());
			if(config == null)
				throw ExceptionUtils.fromMessage("No loader for %s", repo.getNature());
			IRepositoryLoader repoLoader = (IRepositoryLoader) config.createExecutableExtension("class");
			arCache.put(repo, ar = repoLoader.getArtifactRepository(ResourceUtils.getMetadataRepository(repo), monitor));
		}

		return ar;
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		LogUtils.info("Starting artifacts mirroring");
		long start = TimeUtils.getNow();

		Builder builder = getBuilder();
		File destination = new File(builder.getBuildRoot(), Builder.REPO_FOLDER_FINAL);
		URI finalURI = Builder.createURI(destination);

		File compositeChildDestination = new File(destination, Builder.REPO_FOLDER_AGGREGATE);
		URI compositeChildURI = Builder.createURI(compositeChildDestination);

		arMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IArtifactRepositoryManager.class);
		arCache = null;

		Aggregator aggregator = builder.getAggregator();
		String aggregatorLabel = aggregator.getLabel();

		SubMonitor subMon = SubMonitor.convert(monitor, 1000);
		boolean artifactErrors = false;
		try {
			boolean isCleanBuild = builder.isCleanBuild();

			subMon.setTaskName("Mirroring artifacts...");
			MonitorUtils.subTask(subMon, "Initializing");
			IFileArtifactRepository compositeChildAr = null;
			if(!isCleanBuild) {
				arMgr.removeRepository(finalURI);
				arMgr.removeRepository(compositeChildURI);
				compositeChildDestination.mkdirs();
				for(File oldLocation : destination.listFiles()) {
					if(oldLocation.equals(compositeChildDestination))
						continue;
					if(oldLocation.equals(new File(destination, "compositeArtifacts.jar"))) {
						if(!oldLocation.delete())
							throw ExceptionUtils.fromMessage("Unable to remove %s", oldLocation.getAbsolutePath());
						continue;
					}

					File newLocation = new File(compositeChildDestination, oldLocation.getName());
					if(!oldLocation.renameTo(newLocation))
						throw ExceptionUtils.fromMessage(
							"Unable to move %s to %s", oldLocation.getAbsolutePath(), newLocation.getAbsolutePath());
				}
				try {
					compositeChildAr = (IFileArtifactRepository) arMgr.loadRepository(compositeChildURI, subMon.newChild(5));
				}
				catch(ProvisionException e) {
				}
			}

			if(compositeChildAr == null) {
				Map<String, String> properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));
				properties.put(Publisher.PUBLISH_PACK_FILES_AS_SIBLINGS, Boolean.toString(true));
				compositeChildAr = (IFileArtifactRepository) arMgr.createRepository(compositeChildURI, aggregatorLabel +
						" artifacts", Builder.SIMPLE_ARTIFACTS_TYPE, properties); //$NON-NLS-1$
			}
			MonitorUtils.worked(subMon, 5);

			IArtifactRepository tempAr;
			try {
				tempAr = arMgr.loadRepository(Builder.createURI(builder.getTempRepositoryFolder()), subMon.newChild(1));
			}
			catch(ProvisionException e) {
				tempAr = null;
			}

			Map<String, String> properties = new HashMap<String, String>();
			properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));
			MonitorUtils.worked(subMon, 10);

			Set<IInstallableUnit> allUnitsToAggregate = builder.getAllUnitsToAggregate();
			Set<IArtifactKey> keysToExclude = getArtifactKeysToExclude();

			SubMonitor childMonitor = subMon.newChild(900, SubMonitor.SUPPRESS_BEGINTASK |
					SubMonitor.SUPPRESS_SETTASKNAME);
			// get contributions of the main (implicit) compositeChild
			List<Contribution> allContribs = aggregator.getContributions(true);

			MonitorUtils.begin(childMonitor, allContribs.size() * 100 + 20);
			boolean compositeChilddArIsEmpty = true;

			PackedStrategy packedStrategy = aggregator.getPackedStrategy();

			// If maven result is required, prepare the maven metadata structure
			MavenRepositoryHelper mavenHelper = null;
			if(aggregator.isMavenResult()) {
				Set<IInstallableUnit> copyOfAllUnitsToAggregate = new HashSet<IInstallableUnit>(allUnitsToAggregate);
				List<InstallableUnitMapping> iusToMaven = new ArrayList<InstallableUnitMapping>();
				for(Contribution contrib : allContribs) {
					SubMonitor contribMonitor = childMonitor.newChild(10);
					List<MappedRepository> repos = contrib.getRepositories(true);
					List<String> errors = new ArrayList<String>();
					MonitorUtils.begin(contribMonitor, repos.size() * 100);
					for(MappedRepository repo : repos) {
						if(!repo.isMirrorArtifacts()) {
							String msg = String.format(
								"Repository %s must be set to mirror artifacts if maven result is required",
								repo.getLocation());
							LogUtils.error(msg);
							errors.add(msg);
							MonitorUtils.worked(contribMonitor, 100);
							continue;
						}

						MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
						ArrayList<IInstallableUnit> iusToMirror = null;
						for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
							if(!copyOfAllUnitsToAggregate.remove(iu))
								continue;

							if(iusToMirror == null)
								iusToMirror = new ArrayList<IInstallableUnit>();
							iusToMirror.add(iu);
						}

						List<MavenMapping> allMavenMappings = contrib.getAllMavenMappings();
						if(iusToMirror != null)
							for(IInstallableUnit iu : iusToMirror)
								iusToMaven.add(new InstallableUnitMapping(contrib, iu, allMavenMappings));

						MonitorUtils.worked(contribMonitor, 100);
					}
					if(errors.size() > 0) {
						artifactErrors = true;
						builder.sendEmail(contrib, errors);

						throw ExceptionUtils.fromMessage("All repositories must be set to mirror artifacts if maven result is required");
					}
					MonitorUtils.done(contribMonitor);
				}

				mavenHelper = MavenManager.createMavenStructure(iusToMaven);

				if(compositeChildAr instanceof SimpleArtifactRepository) {
					SimpleArtifactRepository simpleAr = ((SimpleArtifactRepository) compositeChildAr);
					simpleAr.setRules(mavenHelper.getMappingRules());
					simpleAr.initializeAfterLoad(compositeChildURI);
				}
				else
					throw ExceptionUtils.fromMessage(
						"Unexpected repository implementation: Expected %s, found %s",
						SimpleArtifactRepository.class.getName(), compositeChildAr.getClass().getName());

				if(packedStrategy != PackedStrategy.SKIP && packedStrategy != PackedStrategy.UNPACK &&
						packedStrategy != PackedStrategy.UNPACK_AS_SIBLING) {
					packedStrategy = PackedStrategy.UNPACK_AS_SIBLING;
					LogUtils.info(
						"Maven result is required, changing packed strategy from %s to %s",
						aggregator.getPackedStrategy().getName(), packedStrategy.getName());
				}
			}

			List<String[]> mappingRules = new ArrayList<String[]>();
			List<ArtifactDescriptor> referencedArtifacts = new ArrayList<ArtifactDescriptor>();
			Set<IInstallableUnit> copyOfUnitsToCompositeChild = null;

			// add rules for artifacts mapped from non-p2 repositories
			for(Contribution contrib : allContribs) {
				SubMonitor contribMonitor = childMonitor.newChild(10);
				List<MappedRepository> repos = contrib.getRepositories(true);
				MonitorUtils.begin(contribMonitor, repos.size() * 100);
				for(MappedRepository repo : repos) {
					int ticksRemaining = 100;

					// Create rules only if the artifacts are mapped from a non-p2 repository
					if("p2".equals(repo.getNature())) {
						MonitorUtils.worked(contribMonitor, 100);
						continue;
					}

					if(copyOfUnitsToCompositeChild == null)
						copyOfUnitsToCompositeChild = new HashSet<IInstallableUnit>(allUnitsToAggregate);

					MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
					ArrayList<IInstallableUnit> iusToRefer = null;
					for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
						if(!copyOfUnitsToCompositeChild.remove(iu))
							continue;

						if(iusToRefer == null)
							iusToRefer = new ArrayList<IInstallableUnit>();
						iusToRefer.add(iu);
					}

					IArtifactRepository ar;
					if(iusToRefer != null) {
						int ticks = 50;
						ar = getArtifactRepository(repo, contribMonitor.newChild(ticks));
						ticksRemaining -= ticks;
						for(IInstallableUnit iu : iusToRefer) {
							String versionString = iu.getVersion().getOriginal();
							if(versionString == null)
								versionString = iu.getVersion().toString();
							String originalPath = iu.getProperty(IRepositoryLoader.PROP_ORIGINAL_PATH);
							String originalId = iu.getProperty(IRepositoryLoader.PROP_ORIGINAL_ID);
							if(originalId == null)
								originalId = iu.getId();

							for(IArtifactKey key : iu.getArtifacts()) {
								if(repo.isMirrorArtifacts()) {
									String location = "${repoUrl}/non-p2/" + repo.getNature() + '/' +
											key.getClassifier() + '/' + (originalPath != null
													? (originalPath + '/')
													: "") + originalId + '_' + versionString + '.' +
											key.getClassifier();

									mappingRules.add(new String[] {
											"(& (classifier=" + IUUtils.encodeFilterValue(key.getClassifier()) +
													") (id=" + IUUtils.encodeFilterValue(key.getId()) + ") (version=" +
													IUUtils.encodeFilterValue(iu.getVersion().toString()) + "))",
											location });
								}
								else {
									for(IArtifactDescriptor desc : ar.getArtifactDescriptors(key)) {
										String ref = ((SimpleArtifactDescriptor) desc).getRepositoryProperty(SimpleArtifactDescriptor.ARTIFACT_REFERENCE);
										SimpleArtifactDescriptor ad = new SimpleArtifactDescriptor(desc);
										ad.setRepositoryProperty(SimpleArtifactDescriptor.ARTIFACT_REFERENCE, ref);
										referencedArtifacts.add(ad);
									}
								}
							}
						}
					}

					MonitorUtils.worked(contribMonitor, ticksRemaining);
				}
				MonitorUtils.done(contribMonitor);
			}

			if(mappingRules.size() > 0 || referencedArtifacts.size() > 0) {
				if(compositeChildAr instanceof SimpleArtifactRepository) {
					SimpleArtifactRepository simpleAr = ((SimpleArtifactRepository) compositeChildAr);
					List<String[]> ruleList = new ArrayList<String[]>(Arrays.asList(simpleAr.getRules()));
					ruleList.addAll(mappingRules);
					simpleAr.setRules(ruleList.toArray(new String[ruleList.size()][]));
					simpleAr.initializeAfterLoad(compositeChildURI);
					for(IArtifactDescriptor ad : referencedArtifacts)
						simpleAr.addDescriptor(ad);
					simpleAr.save();
					compositeChilddArIsEmpty = false;
				}
				else
					throw ExceptionUtils.fromMessage(
						"Unexpected repository implementation: Expected %s, found %s",
						SimpleArtifactRepository.class.getName(), compositeChildAr.getClass().getName());
			}

			for(Contribution contrib : allContribs) {
				SubMonitor contribMonitor = childMonitor.newChild(100);
				List<MappedRepository> repos = contrib.getRepositories(true);
				List<String> errors = new ArrayList<String>();
				MonitorUtils.begin(contribMonitor, repos.size() * 100);
				for(MappedRepository repo : repos) {
					if(builder.isMapVerbatim(repo)) {
						MonitorUtils.worked(contribMonitor, 100);
						continue;
					}

					MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
					ArrayList<IArtifactKey> keysToMirror = null;
					for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
						if(!allUnitsToAggregate.remove(iu))
							continue;

						if(!repo.isMirrorArtifacts())
							continue;

						for(IArtifactKey ak : iu.getArtifacts()) {
							if(!keysToExclude.add(ak))
								continue;

							if(keysToMirror == null)
								keysToMirror = new ArrayList<IArtifactKey>();
							keysToMirror.add(ak);
						}
					}

					if(keysToMirror != null) {
						String msg = format("Mirroring artifacts from %s", childMdr.getLocation());
						LogUtils.info(msg);
						contribMonitor.subTask(msg);
						IArtifactRepository childAr = getArtifactRepository(
							repo,
							contribMonitor.newChild(1, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
						mirror(
							keysToMirror,
							tempAr,
							childAr,
							compositeChildAr,
							packedStrategy,
							errors,
							contribMonitor.newChild(94, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
						compositeChilddArIsEmpty = false;
					}
					else
						MonitorUtils.worked(contribMonitor, 95);
				}
				if(errors.size() > 0) {
					artifactErrors = true;
					builder.sendEmail(contrib, errors);
				}
				MonitorUtils.done(contribMonitor);
			}

			// @fmtOff
			for(String fileName : new String[] {
					"compositeArtifacts.jar", "compositeContent.jar", "content.jar", "artifacts.jar" }) {
				// @fmtOn
				File file = new File(destination, fileName);
				if(file.exists() && !file.delete())
					throw ExceptionUtils.fromMessage("Unable to remove %s", file.getAbsolutePath());
			}
			MonitorUtils.worked(childMonitor, 10);

			List<MappedRepository> reposWithReferencedArtifacts = new ArrayList<MappedRepository>();
			List<MappedRepository> reposWithReferencedMetadata = new ArrayList<MappedRepository>();

			for(Contribution contrib : aggregator.getContributions(true)) {
				for(MappedRepository repo : contrib.getRepositories(true)) {
					if(builder.isMapVerbatim(repo)) {
						reposWithReferencedArtifacts.add(repo);
						reposWithReferencedMetadata.add(repo);
					}
					else if(!repo.isMirrorArtifacts() && "p2".equals(repo.getNature()))
						reposWithReferencedArtifacts.add(repo);
				}
			}

			if(mavenHelper != null) {
				LogUtils.info("Adding maven metadata");
				Map<Contribution, List<String>> errors = new HashMap<Contribution, List<String>>();

				MavenManager.saveMetadata(
					org.eclipse.emf.common.util.URI.createFileURI(compositeChildDestination.getAbsolutePath()),
					mavenHelper.getTop(), errors);

				if(errors.size() > 0) {
					artifactErrors = true;
					for(Map.Entry<Contribution, List<String>> entry : errors.entrySet())
						builder.sendEmail(entry.getKey(), entry.getValue());
				}

				IMaven2Indexer indexer = IndexerUtils.getIndexer("nexus");
				if(indexer != null) {
					LogUtils.info("Adding maven index");
					indexer.updateLocalIndex(new File(compositeChildDestination.getAbsolutePath()).toURI(), false);
				}
				MonitorUtils.worked(childMonitor, 10);
				LogUtils.info("Done adding maven metadata");
			}

			mdrMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);

			Collection<String> compositeChildChildrenSubdirectories = builder.getChildrenSubdirectories();

			if(reposWithReferencedMetadata.isEmpty() && compositeChildChildrenSubdirectories.size() <= 1) {
				// The compositeChildd meta-data can serve as the final repository so
				// let's move it.
				//
				LogUtils.info("Making the compositeChildd metadata repository final at %s", finalURI);
				File oldLocation = new File(compositeChildDestination, "content.jar");
				File newLocation = new File(destination, oldLocation.getName());
				if(!oldLocation.renameTo(newLocation))
					throw ExceptionUtils.fromMessage(
						"Unable to move %s to %s", oldLocation.getAbsolutePath(), newLocation.getAbsolutePath());
				mdrMgr.removeRepository(compositeChildURI);
			}
			else {
				// Set up the final composite repositories
				LogUtils.info("Building final metadata composite at %s", finalURI);
				properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));

				mdrMgr.removeRepository(finalURI);
				CompositeMetadataRepository compositeMdr = (CompositeMetadataRepository) mdrMgr.createRepository(
					finalURI, aggregatorLabel, Builder.COMPOSITE_METADATA_TYPE, properties);

				for(String compositeChildChildrenSubdirectory : compositeChildChildrenSubdirectories)
					compositeMdr.addChild(URI.create(Builder.REPO_FOLDER_AGGREGATE + compositeChildChildrenSubdirectory));

				for(MappedRepository referenced : reposWithReferencedMetadata)
					compositeMdr.addChild(referenced.getMetadataRepository().getLocation());

				LogUtils.info("Done building final metadata composite");
			}
			MonitorUtils.worked(childMonitor, 10);

			if(reposWithReferencedArtifacts.isEmpty()) {
				// The aggregation can serve as the final repository.
				//
				LogUtils.info("Making the compositeChildd artifact repository final at %s", finalURI);
				for(String name : compositeChildDestination.list()) {
					if("content.jar".equals(name) || compositeChildChildrenSubdirectories.contains("/" + name))
						continue;

					File oldLocation = new File(compositeChildDestination, name);
					File newLocation = new File(destination, name);
					if(!oldLocation.renameTo(newLocation))
						throw ExceptionUtils.fromMessage(
							"Unable to move %s to %s", oldLocation.getAbsolutePath(), newLocation.getAbsolutePath());
				}
				arMgr.removeRepository(compositeChildURI);
			}
			else {
				// Set up the final composite repositories
				LogUtils.info("Building final artifact composite at %s", finalURI);
				properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));

				arMgr.removeRepository(finalURI);
				CompositeArtifactRepository compositeAr = (CompositeArtifactRepository) arMgr.createRepository(
					finalURI, aggregatorLabel + " artifacts", Builder.COMPOSITE_ARTIFACTS_TYPE, properties); //$NON-NLS-1$

				for(MappedRepository referenced : reposWithReferencedArtifacts)
					compositeAr.addChild(referenced.getMetadataRepository().getLocation());

				if(compositeChilddArIsEmpty) {
					arMgr.removeRepository(compositeChildURI);
					File arFile = new File(compositeChildDestination, "artifacts.jar");
					if(!arFile.delete())
						throw ExceptionUtils.fromMessage("Unable to remove %s", arFile.getAbsolutePath());
				}
				else
					compositeAr.addChild(finalURI.relativize(compositeChildURI));

				LogUtils.info("Done building final artifact composite");
			}

			// Remove the aggregation in case it's now empty.
			//
			String[] content = compositeChildDestination.list();
			if(content != null && content.length == 0)
				if(!compositeChildDestination.delete())
					throw ExceptionUtils.fromMessage("Unable to remove %s", compositeChildDestination.getAbsolutePath());

			MonitorUtils.done(childMonitor);
		}
		finally {
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), mdrMgr);
			mdrMgr = null;
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), arMgr);
			arMgr = null;
			MonitorUtils.done(subMon);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		if(artifactErrors)
			throw ExceptionUtils.fromMessage("Not all artifacts could be mirrored, see log for details");
	}
}
