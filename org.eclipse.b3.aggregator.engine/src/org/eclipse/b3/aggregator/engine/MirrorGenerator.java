package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.b3.aggregator.engine.maven.indexer.IMaven2Indexer;
import org.eclipse.b3.aggregator.engine.maven.indexer.IndexerUtils;
import org.eclipse.b3.aggregator.loader.IRepositoryLoader;
import org.eclipse.b3.aggregator.p2.MetadataRepository;
import org.eclipse.b3.aggregator.p2.RepositoryReference;
import org.eclipse.b3.aggregator.util.GeneralUtils;
import org.eclipse.b3.aggregator.util.LogUtils;
import org.eclipse.b3.aggregator.util.MonitorUtils;
import org.eclipse.b3.aggregator.util.P2Utils;
import org.eclipse.b3.aggregator.util.RepositoryLoaderUtils;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.aggregator.util.TimeUtils;
import org.eclipse.b3.util.ExceptionUtils;
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
import org.eclipse.equinox.p2.repository.artifact.spi.ArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.spi.ProcessingStepDescriptor;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class MirrorGenerator extends BuilderPhase {
	/**
	 * A request to restore the canonical form after a raw copy of the optimized form
	 */
	private static class CanonicalizeRequest extends MirrorRequest {
		private IArtifactDescriptor optimizedDescriptor;

		private IArtifactDescriptor canonicalDescriptor;

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IArtifactDescriptor canonicalDescriptor,
				IArtifactRepository targetRepository) {
			this(optimizedDescriptor, canonicalDescriptor, targetRepository, targetRepository);
		}

		public CanonicalizeRequest(IArtifactDescriptor optimizedDescriptor, IArtifactDescriptor canonicalDescriptor,
				IArtifactRepository sourceRepository, IArtifactRepository targetRepository) {
			super(canonicalDescriptor.getArtifactKey(), targetRepository, null, null);
			this.optimizedDescriptor = optimizedDescriptor;
			this.canonicalDescriptor = canonicalDescriptor;
			setSourceRepository(sourceRepository);
		}

		@Override
		public void perform(IArtifactRepository sourceRepository, IProgressMonitor monitor) {
			setSourceRepository(sourceRepository);
			setResult(transfer(canonicalDescriptor, optimizedDescriptor, monitor));
		}
	}

	static void mirror(Collection<IArtifactKey> keysToInstall, IArtifactRepository cache, IArtifactRepository source,
			IArtifactRepository dest, PackedStrategy strategy, List<String> errors, IProgressMonitor monitor) {
		IQueryResult<IArtifactKey> result = source.query(ArtifactKeyQuery.ALL_KEYS, null);
		IArtifactKey[] keys = result.toArray(IArtifactKey.class);
		MonitorUtils.begin(monitor, keys.length * 100);

		for(IArtifactKey key : keys) {
			// We must iterate here since EMF lists use identity comparison
			// ant not equals.
			boolean found = false;
			for(IArtifactKey keyToInstall : keysToInstall) {
				if(keyToInstall.equals(key)) {
					found = true;
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
					throw ExceptionUtils.fromMessage("Found no usable descriptor for artifact %s in repository %s",
							key, dest.getLocation());

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
						mirror(sourceForCopy, dest, canonical, createDestinationDescriptor(key, false),
								MonitorUtils.subMonitor(monitor, 90));
					}
					break;
				case COPY:
					if(!checkIfTargetPresent(dest, key, true)) {
						LogUtils.debug("    doing copy of optimized artifact");
						mirror(sourceForCopy, dest, optimized, createDestinationDescriptor(key, true),
								MonitorUtils.subMonitor(monitor, 90));
					}
					break;
				default:
					if(keyStrategy == PackedStrategy.UNPACK) {
						if(!checkIfTargetPresent(dest, key, false)) {
							LogUtils.debug("    doing copy of optimized artifact into canonical target");
							unpack(sourceForCopy, dest, optimized, createDestinationDescriptor(key, false),
									MonitorUtils.subMonitor(monitor, 90));
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
						mirror(sourceForCopy, dest, optimized, createDestinationDescriptor(key, true),
								MonitorUtils.subMonitor(monitor, 70));
					}

					if(isVerify)
						LogUtils.debug("    unpacking optimized artifact for verification");
					else {
						if(checkIfTargetPresent(dest, key, false))
							break;
						LogUtils.debug("    unpacking optimized artifact");
					}

					unpackToSibling(dest, getArtifactDescriptor(dest, key, true), createDestinationDescriptor(key,
							false), isVerify, MonitorUtils.subMonitor(monitor, 20));
				}
			}
			catch(CoreException e) {
				errors.add(Builder.getExceptionMessages(e));
				dest.removeDescriptor(key);
				LogUtils.error(e, e.getMessage());
			}
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

		throw ExceptionUtils.fromMessage(result.getException(), "Unable to mirror artifact %s from repository %s: %s",
				sourceDesc.getArtifactKey(), source.getLocation(), result.getMessage());
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

	private static IArtifactDescriptor createDestinationDescriptor(IArtifactKey key, boolean optimized) {
		ArtifactDescriptor desc = new ArtifactDescriptor(key);
		if(optimized) {
			desc.setProperty(IArtifactDescriptor.FORMAT, "packed");
			desc.setProcessingSteps(new ProcessingStepDescriptor[] { new ProcessingStepDescriptor(
					"org.eclipse.equinox.p2.processing.Pack200Unpacker", null, true) });
		}
		return desc;
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
		return desc != null && "packed".equals(desc.getProperty(IArtifactDescriptor.FORMAT))
				&& ProcessingStepHandler.canProcess(desc);
	}

	private static void unpack(IArtifactRepository source, IArtifactRepository target, IArtifactDescriptor optimized,
			IArtifactDescriptor canonical, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, canonical, source, target);
		request.perform(source, monitor);
		IStatus result = request.getResult();
		if(result.getSeverity() != IStatus.ERROR
				|| result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
			return;
		}

		result = extractRootCause(result);
		throw ExceptionUtils.fromMessage(result.getException(), "Unable to unpack artifact %s in repository %s: %s",
				optimized.getArtifactKey(), target.getLocation(), result.getMessage());
	}

	private static void unpackToSibling(IArtifactRepository target, IArtifactDescriptor optimized,
			IArtifactDescriptor canonical, boolean verifyOnly, IProgressMonitor monitor) throws CoreException {
		CanonicalizeRequest request = new CanonicalizeRequest(optimized, canonical, target);
		request.perform(target, monitor);
		IStatus result = request.getResult();
		if(result.getSeverity() != IStatus.ERROR
				|| result.getCode() == org.eclipse.equinox.p2.core.ProvisionException.ARTIFACT_EXISTS) {
			if(verifyOnly)
				target.removeDescriptor(getArtifactDescriptor(target, canonical.getArtifactKey(), false));
			return;
		}

		result = extractRootCause(result);
		throw ExceptionUtils.fromMessage(result.getException(), "Unable to unpack artifact %s in repository %s: %s",
				optimized.getArtifactKey(), target.getLocation(), result.getMessage());
	}

	private IMetadataRepositoryManager mdrMgr = null;

	private IArtifactRepositoryManager arMgr = null;

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

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		LogUtils.info("Starting mirror generation");
		long start = TimeUtils.getNow();

		Builder builder = getBuilder();
		File destination = new File(builder.getBuildRoot(), Builder.REPO_FOLDER_FINAL);
		URI finalURI = Builder.createURI(destination);

		File aggregateDestination = new File(destination, Builder.REPO_FOLDER_AGGREGATE);
		URI aggregateURI = Builder.createURI(aggregateDestination);

		mdrMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);
		arMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IArtifactRepositoryManager.class);
		arCache = null;
		SubMonitor subMon = SubMonitor.convert(monitor, 1000);
		boolean artifactErrors = false;
		try {
			boolean isCleanBuild = builder.isCleanBuild();
			Aggregator aggregator = builder.getAggregator();

			subMon.setTaskName("Mirroring meta-data and artifacts...");
			MonitorUtils.subTask(subMon, "Initializing");
			IArtifactRepository aggregateAr = null;
			if(!isCleanBuild) {
				arMgr.removeRepository(finalURI);
				arMgr.removeRepository(aggregateURI);
				aggregateDestination.mkdirs();
				for(File oldLocation : destination.listFiles()) {
					if(oldLocation.equals(aggregateDestination))
						continue;
					if(oldLocation.equals(new File(destination, "compositeArtifacts.jar"))) {
						oldLocation.delete();
						continue;
					}
					oldLocation.renameTo(new File(aggregateDestination, oldLocation.getName()));
				}
				try {
					aggregateAr = arMgr.loadRepository(aggregateURI, subMon.newChild(5));
				}
				catch(ProvisionException e) {
				}
			}

			if(aggregateAr == null) {
				Map<String, String> properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));
				properties.put(Publisher.PUBLISH_PACK_FILES_AS_SIBLINGS, Boolean.toString(true));
				String label = builder.getAggregator().getLabel();
				aggregateAr = arMgr.createRepository(aggregateURI,
						label + " artifacts", Builder.SIMPLE_ARTIFACTS_TYPE, properties); //$NON-NLS-1$
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
			String label = aggregator.getLabel();
			IMetadataRepository aggregateMdr = mdrMgr.createRepository(aggregateURI, label,
					Builder.SIMPLE_METADATA_TYPE, properties);
			MonitorUtils.worked(subMon, 10);

			Set<IInstallableUnit> unitsToAggregate = builder.getUnitsToAggregate();
			Set<IArtifactKey> keysToExclude = getArtifactKeysToExclude();

			SubMonitor childMonitor = subMon.newChild(900, SubMonitor.SUPPRESS_BEGINTASK
					| SubMonitor.SUPPRESS_SETTASKNAME);
			List<Contribution> contribs = aggregator.getContributions(true);

			MonitorUtils.begin(childMonitor, contribs.size() * 100 + 20);
			boolean aggregatedMdrIsEmpty = true;
			boolean aggregatedArIsEmpty = true;

			PackedStrategy packedStrategy = aggregator.getPackedStrategy();

			// If maven result is required, prepare the maven metadata structure
			MavenRepositoryHelper mavenHelper = null;
			if(aggregator.isMavenResult()) {
				List<InstallableUnitMapping> iusToMaven = new ArrayList<InstallableUnitMapping>();
				for(Contribution contrib : contribs) {
					SubMonitor contribMonitor = childMonitor.newChild(10);
					List<MappedRepository> repos = contrib.getRepositories(true);
					List<String> errors = new ArrayList<String>();
					MonitorUtils.begin(contribMonitor, repos.size() * 100);
					for(MappedRepository repo : repos) {
						if(!repo.isMirrorArtifacts()) {
							errors.add(String.format(
									"Repository %s must be set to mirror artifacts if maven result is required",
									repo.getLocation()));
							MonitorUtils.worked(contribMonitor, 100);
							continue;
						}

						MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
						ArrayList<IInstallableUnit> iusToMirror = null;
						for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
							if(!unitsToAggregate.contains(iu))
								continue;

							if(iusToMirror == null)
								iusToMirror = new ArrayList<IInstallableUnit>();
							iusToMirror.add(iu);
						}

						List<MavenMapping> allMavenMappings = contrib.getAllMavenMappings();
						if(iusToMirror != null)
							for(IInstallableUnit iu : iusToMirror)
								iusToMaven.add(new InstallableUnitMapping(iu, allMavenMappings));

						MonitorUtils.worked(contribMonitor, 100);
					}
					if(errors.size() > 0) {
						artifactErrors = true;
						builder.sendEmail(contrib, errors);
					}
					MonitorUtils.done(contribMonitor);
				}

				mavenHelper = MavenManager.createMavenStructure(iusToMaven);

				if(aggregateAr instanceof SimpleArtifactRepository) {
					SimpleArtifactRepository simpleAr = ((SimpleArtifactRepository) aggregateAr);
					simpleAr.setRules(mavenHelper.getMappingRules());
					simpleAr.initializeAfterLoad(aggregateURI);
				}
				else
					throw ExceptionUtils.fromMessage("Unexpected repository implementation: Expected %s, found %s",
							SimpleArtifactRepository.class.getName(), aggregateAr.getClass().getName());

				if(packedStrategy != PackedStrategy.SKIP && packedStrategy != PackedStrategy.UNPACK
						&& packedStrategy != PackedStrategy.UNPACK_AS_SIBLING) {
					packedStrategy = PackedStrategy.UNPACK_AS_SIBLING;
					LogUtils.info("Maven result is required, changing packed strategy from %s to %s",
							aggregator.getPackedStrategy().getName(), packedStrategy.getName());
				}
			}
			else {
				List<String[]> mappingRules = new ArrayList<String[]>();
				List<ArtifactDescriptor> referencedArtifacts = new ArrayList<ArtifactDescriptor>();
				for(Contribution contrib : contribs) {
					SubMonitor contribMonitor = childMonitor.newChild(10);
					List<MappedRepository> repos = contrib.getRepositories(true);
					List<String> errors = new ArrayList<String>();
					MonitorUtils.begin(contribMonitor, repos.size() * 100);
					for(MappedRepository repo : repos) {
						int ticksRemaining = 100;

						// Create rules only if the artifacts are mapped from a non-p2 repository
						if("p2".equals(repo.getNature())) {
							MonitorUtils.worked(contribMonitor, 100);
							continue;
						}

						MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
						ArrayList<IInstallableUnit> iusToRefer = null;
						for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
							if(!unitsToAggregate.contains(iu))
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
										String location = "${repoUrl}/non-p2/" + repo.getNature() + '/'
												+ key.getClassifier() + '/' + (originalPath != null
														? (originalPath + '/')
														: "") + originalId + '_' + versionString + '.'
												+ key.getClassifier();

										mappingRules.add(new String[] {
												"(& (classifier=" + GeneralUtils.encodeFilterValue(key.getClassifier())
														+ ") (id=" + GeneralUtils.encodeFilterValue(key.getId())
														+ ") (version="
														+ GeneralUtils.encodeFilterValue(iu.getVersion().toString())
														+ "))", location });
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
					if(errors.size() > 0) {
						artifactErrors = true;
						builder.sendEmail(contrib, errors);
					}
					MonitorUtils.done(contribMonitor);
				}

				if(aggregateAr instanceof SimpleArtifactRepository) {
					SimpleArtifactRepository simpleAr = ((SimpleArtifactRepository) aggregateAr);
					List<String[]> ruleList = new ArrayList<String[]>(Arrays.asList(simpleAr.getRules()));
					ruleList.addAll(mappingRules);
					simpleAr.setRules(ruleList.toArray(new String[ruleList.size()][]));
					simpleAr.initializeAfterLoad(aggregateURI);
					for(IArtifactDescriptor ad : referencedArtifacts)
						simpleAr.addDescriptor(ad);
					simpleAr.save();
					aggregatedArIsEmpty = false;
				}
				else
					throw ExceptionUtils.fromMessage("Unexpected repository implementation: Expected %s, found %s",
							SimpleArtifactRepository.class.getName(), aggregateAr.getClass().getName());
			}

			for(Contribution contrib : contribs) {
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
					ArrayList<IInstallableUnit> iusToMirror = null;
					ArrayList<IArtifactKey> keysToMirror = null;
					for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
						if(!unitsToAggregate.remove(iu))
							continue;

						if(iusToMirror == null)
							iusToMirror = new ArrayList<IInstallableUnit>();
						iusToMirror.add(iu);
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

					if(iusToMirror != null) {
						String msg = format("Mirroring meta-data from from %s", childMdr.getLocation());
						LogUtils.info(msg);
						contribMonitor.subTask(msg);
						mirror(iusToMirror, childMdr, aggregateMdr, contribMonitor.newChild(5,
								SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
						aggregatedMdrIsEmpty = false;
					}
					else
						MonitorUtils.worked(contribMonitor, 5);

					if(keysToMirror != null) {
						String msg = format("Mirroring artifacts from from %s", childMdr.getLocation());
						LogUtils.info(msg);
						contribMonitor.subTask(msg);
						IArtifactRepository childAr = getArtifactRepository(repo, contribMonitor.newChild(1,
								SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
						mirror(keysToMirror, tempAr, childAr, aggregateAr, packedStrategy, errors,
								contribMonitor.newChild(94, SubMonitor.SUPPRESS_BEGINTASK
										| SubMonitor.SUPPRESS_SETTASKNAME));
						aggregatedArIsEmpty = false;
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

			List<IInstallableUnit> categories = builder.getCategoryIUs();
			if(!categories.isEmpty()) {
				mirror(categories, null, aggregateMdr, childMonitor.newChild(20));
				aggregatedMdrIsEmpty = false;
			}

			new File(destination, "compositeArtifacts.jar").delete();
			new File(destination, "compositeContent.jar").delete();
			new File(destination, "content.jar").delete();
			new File(destination, "artifacts.jar").delete();
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
				MavenManager.saveMetadata(
						org.eclipse.emf.common.util.URI.createFileURI(aggregateDestination.getAbsolutePath()),
						mavenHelper.getTop());

				IMaven2Indexer indexer = IndexerUtils.getIndexer("nexus");
				if(indexer != null) {
					LogUtils.info("Adding maven index");
					indexer.updateLocalIndex(new File(aggregateDestination.getAbsolutePath()).toURI(), false);
				}
				MonitorUtils.worked(childMonitor, 10);
				LogUtils.info("Done adding maven metadata");
			}

			if(reposWithReferencedMetadata.isEmpty()) {
				// The aggregated meta-data can serve as the final repository so
				// let's move it.
				//
				LogUtils.info("Making the aggregated metadata repository final at %s", finalURI);
				File oldLocation = new File(aggregateDestination, "content.jar");
				File newLocation = new File(destination, oldLocation.getName());
				oldLocation.renameTo(newLocation);
				mdrMgr.removeRepository(aggregateURI);
			}
			else {
				// Set up the final composite repositories
				LogUtils.info("Building final metadata composite at %s", finalURI);
				properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));

				String name = builder.getAggregator().getLabel();
				mdrMgr.removeRepository(finalURI);
				CompositeMetadataRepository compositeMdr = (CompositeMetadataRepository) mdrMgr.createRepository(
						finalURI, name, Builder.COMPOSITE_METADATA_TYPE, properties);

				for(MappedRepository referenced : reposWithReferencedMetadata)
					compositeMdr.addChild(referenced.getMetadataRepository().getLocation());

				if(aggregatedMdrIsEmpty) {
					mdrMgr.removeRepository(aggregateURI);
					File mdrFile = new File(aggregateDestination, "content.jar");
					mdrFile.delete();
				}
				else
					compositeMdr.addChild(finalURI.relativize(aggregateURI));

				LogUtils.info("Done building final metadata composite");
			}
			MonitorUtils.worked(childMonitor, 10);

			if(reposWithReferencedArtifacts.isEmpty()) {
				// The aggregation can serve as the final repository.
				//
				LogUtils.info("Making the aggregated artifact repository final at %s", finalURI);
				for(String name : aggregateDestination.list()) {
					if("content.jar".equals(name))
						continue;

					File oldLocation = new File(aggregateDestination, name);
					File newLocation = new File(destination, name);
					oldLocation.renameTo(newLocation);
					aggregateDestination.delete();
				}
				arMgr.removeRepository(aggregateURI);
			}
			else {
				// Set up the final composite repositories
				LogUtils.info("Building final artifact composite at %s", finalURI);
				properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));

				String name = builder.getAggregator().getLabel();
				arMgr.removeRepository(finalURI);
				CompositeArtifactRepository compositeAr = (CompositeArtifactRepository) arMgr.createRepository(
						finalURI, name + " artifacts", Builder.COMPOSITE_ARTIFACTS_TYPE, properties); //$NON-NLS-1$

				for(MappedRepository referenced : reposWithReferencedArtifacts)
					compositeAr.addChild(referenced.getMetadataRepository().getLocation());

				if(aggregatedArIsEmpty) {
					arMgr.removeRepository(aggregateURI);
					File arFile = new File(aggregateDestination, "artifacts.jar");
					arFile.delete();
				}
				else
					compositeAr.addChild(finalURI.relativize(aggregateURI));

				LogUtils.info("Done building final artifact composite");
			}

			// Remove the aggregation in case it's now empty.
			//
			String[] content = aggregateDestination.list();
			if(content != null && content.length == 0)
				aggregateDestination.delete();

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

	private void mirror(List<IInstallableUnit> iusToMirror, MetadataRepository source, final IMetadataRepository dest,
			IProgressMonitor monitor) throws CoreException {
		dest.addInstallableUnits(iusToMirror);

		Builder builder = getBuilder();
		if(source != null && builder.isMirrorReferences()) {
			for(RepositoryReference ref : source.getRepositoryReferences()) {
				URI location = ref.getLocation();
				String refKey = location.toString();
				String refType = ref.getType() == IRepository.TYPE_METADATA
						? "meta-data"
						: "artifacts";
				if(!builder.isMatchedReference(refKey)) {
					LogUtils.debug("- %s reference %s was ruled out by inclusion/exclusion patterns", refType, refKey);
					continue;
				}

				if(refKey.endsWith("/site.xml"))
					location = URI.create(refKey.substring(0, refKey.length() - 8));

				LogUtils.debug("- mirroring %s reference %s", refType, refKey);
				dest.addReference(location, ref.getNickname(), ref.getType(), 0);
			}
		}
	}

}
