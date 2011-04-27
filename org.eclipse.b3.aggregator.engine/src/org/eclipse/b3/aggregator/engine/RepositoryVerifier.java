package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregate;
import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.Configuration;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.PackedStrategy;
import org.eclipse.b3.aggregator.impl.ContributionImpl;
import org.eclipse.b3.aggregator.util.SpecialQueries;
import org.eclipse.b3.aggregator.util.VerificationDiagnostic;
import org.eclipse.b3.p2.InstallableUnit;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.p2.util.P2Bridge;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.internal.p2.director.Explanation;
import org.eclipse.equinox.internal.p2.director.Explanation.HardRequirement;
import org.eclipse.equinox.internal.p2.director.Explanation.MissingIU;
import org.eclipse.equinox.internal.p2.director.Explanation.Singleton;
import org.eclipse.equinox.internal.p2.director.QueryableArray;
import org.eclipse.equinox.internal.p2.engine.InstallableUnitOperand;
import org.eclipse.equinox.internal.p2.engine.Operand;
import org.eclipse.equinox.internal.p2.engine.ProvisioningPlan;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.internal.p2.touchpoint.eclipse.PublisherUtil;
import org.eclipse.equinox.internal.provisional.p2.director.PlannerStatus;
import org.eclipse.equinox.internal.provisional.p2.director.ProfileChangeRequest;
import org.eclipse.equinox.internal.provisional.p2.director.RequestStatus;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.engine.IProfile;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.engine.ProvisioningContext;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnitPatch;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.planner.IPlanner;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.artifact.IFileArtifactRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class RepositoryVerifier extends BuilderPhase {

	public static class AnalyzedPlannerStatus implements IStatus {

		protected PlannerStatus plannerStatus;

		protected ArrayList<VerificationDiagnostic> verificationDiagnostics = new ArrayList<VerificationDiagnostic>();

		public AnalyzedPlannerStatus(PlannerStatus plannerStatus) {
			this.plannerStatus = plannerStatus;

			RequestStatus requestStatus = plannerStatus.getRequestStatus();
			if(requestStatus == null)
				return;

			Set<Explanation> explanations = requestStatus.getExplanations();
			if(explanations == null)
				return;

			// The set of the root problem explanations
			LinkedHashSet<Explanation> rootProblems = new LinkedHashSet<Explanation>();

			// The map of dependency chain explanations
			HashMap<IInstallableUnit, IRequirement> links = new HashMap<IInstallableUnit, IRequirement>();

			for(Explanation explanation : explanations) {
				if(explanation instanceof HardRequirement) {
					// This represents one link in the chain of dependencies from the root requirement
					// (the verification IU) to the conflicting/missing IU
					HardRequirement link = (HardRequirement) explanation;

					links.put(link.iu, link.req);
				}
				else if(explanation instanceof MissingIU || explanation instanceof Singleton)
					// MissingIU means we have a missing dependency problem
					// Singleton means we have a dependency version conflict problem
					rootProblems.add(explanation);
			}

			// The cache of IInstallableUnit to aggregator model element URI mappings
			HashMap<IInstallableUnit, String> modelElementURICache = new HashMap<IInstallableUnit, String>();

			for(Explanation rootProblem : rootProblems) {
				if(rootProblem instanceof MissingIU) {
					IInstallableUnit iu = ((MissingIU) rootProblem).iu;
					String elementURI = findModelElementURI(iu, links, modelElementURICache);

					if(elementURI != null)
						verificationDiagnostics.add(new VerificationDiagnostic(
							rootProblem.toString(), org.eclipse.emf.common.util.URI.createURI(elementURI),
							VerificationDiagnostic.MISSING_IU));
				}
				else if(rootProblem instanceof Singleton) {
					IInstallableUnit[] ius = ((Singleton) rootProblem).ius;
					HashSet<String> elementURIs = new HashSet<String>(ius.length);

					for(IInstallableUnit iu : ius)
						elementURIs.add(findModelElementURI(iu, links, modelElementURICache));
					// just in case we failed to find the model element URIs for some of the conflicting IUs
					elementURIs.remove(null);

					for(String elementURI : elementURIs)
						verificationDiagnostics.add(new VerificationDiagnostic(
							rootProblem.toString(), org.eclipse.emf.common.util.URI.createURI(elementURI),
							VerificationDiagnostic.CONFLICTING_IU, elementURIs));
				}
			}
		}

		/**
		 * Walk the dependency chain from the specified IU up and return the model element URI for the first encountered IU for which the model
		 * element URI information is known (either because it was cached or because the IU happens to have the information directly attached).
		 * 
		 * @param iu
		 *            the IU from which to fun the model element URI
		 * @param links
		 *            a map of dependency chain links
		 * @param modelElementURICache
		 *            a cache if the model element URIs
		 * @return the model element URI of the first IU found in the dependency chain for which the information is known or <code>null</code> if the
		 *         information is not know for any IU from the chain
		 */
		protected String findModelElementURI(IInstallableUnit iu, HashMap<IInstallableUnit, IRequirement> links,
				HashMap<IInstallableUnit, String> modelElementURICache) {
			if(modelElementURICache.containsKey(iu))
				return modelElementURICache.get(iu); // may return null in case of a dependency loop

			String elementURI = iu.getProperty(Builder.PROP_AGGREGATOR_MODEL_ELEMENT_URI);

			// we need to put the value to the map even when it is null to prevent possible infinite loop
			modelElementURICache.put(iu, elementURI);

			// walk the dependency chain up if the IU doesn't have the model element URI information attached
			if(elementURI == null) {
				for(Entry<IInstallableUnit, IRequirement> link : links.entrySet()) {
					if(link.getValue().isMatch(iu)) {
						elementURI = findModelElementURI(link.getKey(), links, modelElementURICache);
						if(elementURI != null) {
							modelElementURICache.put(iu, elementURI);
							break;
						}
					}
				}
			}

			return elementURI;
		}

		public IStatus[] getChildren() {
			return plannerStatus.getChildren();
		}

		public int getCode() {
			return plannerStatus.getCode();
		}

		public Throwable getException() {
			return plannerStatus.getException();
		}

		public String getMessage() {
			return plannerStatus.getMessage();
		}

		public PlannerStatus getPlannerStatus() {
			return plannerStatus;
		}

		public String getPlugin() {
			return plannerStatus.getPlugin();
		}

		public int getSeverity() {
			return plannerStatus.getSeverity();
		}

		public List<VerificationDiagnostic> getVerificationDiagnostics() {
			return verificationDiagnostics;
		}

		public boolean isMultiStatus() {
			return plannerStatus.isMultiStatus();
		}

		public boolean isOK() {
			return plannerStatus.isOK();
		}

		public boolean matches(int severityMask) {
			return plannerStatus.matches(severityMask);
		}

	}

	private static IInstallableUnit[] getRootIUs(IMetadataRepository site, String iuName, Version version,
			IProgressMonitor monitor) throws CoreException {
		IQuery<IInstallableUnit> query = QueryUtil.createIUQuery(iuName, version);
		IQueryResult<IInstallableUnit> roots = site.query(query, monitor);

		if(roots.isEmpty())
			throw ExceptionUtils.fromMessage("IU %s not found", iuName); //$NON-NLS-1$

		return roots.toArray(IInstallableUnit.class);
	}

	private Aggregate aggregate;

	public RepositoryVerifier(Builder builder, Aggregate aggregate) {
		super(builder);
		this.aggregate = aggregate;
	}

	private boolean addLeafmostContributions(Set<Explanation> explanations, Map<String, Contribution> contributions,
			IRequirement prq) {
		boolean contribsFound = false;
		for(Explanation explanation : explanations) {
			if(explanation instanceof Singleton) {
				if(contribsFound)
					// All explicit contributions for Singletons are added at
					// top level. We just want to find out if this Singleton
					// is the leaf problem here, not add anything
					continue;

				for(IInstallableUnit iu : ((Singleton) explanation).ius) {
					if(prq.isMatch(iu)) {
						// A singleton is always a leaf problem. Add
						// contributions if we can find any
						if(!findContributions(iu.getId()).isEmpty()) {
							contribsFound = true;
							break;
						}
					}
				}
				continue;
			}

			IInstallableUnit iu;
			IRequirement crq;
			if(explanation instanceof HardRequirement) {
				HardRequirement hrq = (HardRequirement) explanation;
				iu = hrq.iu;
				crq = hrq.req;
			}
			else if(explanation instanceof MissingIU) {
				MissingIU miu = (MissingIU) explanation;
				iu = miu.iu;
				crq = miu.req;
			}
			else
				continue;

			if(prq.isMatch(iu)) {
				// This IU would have fulfilled the failing request but it
				// has apparent problems of its own.
				if(addLeafmostContributions(explanations, contributions, crq)) {
					contribsFound = true;
					continue;
				}

				for(Contribution contrib : findContributions(iu, crq)) {
					contributions.put(contrib.getLabel(), contrib);
					contribsFound = true;
				}
				continue;
			}
		}
		return contribsFound;
	}

	private ProvisioningContext createContext(URI site) {
		List<MetadataRepositoryReference> validationRepos = getBuilder().getAggregator().getValidationRepositories();
		int top = validationRepos.size();
		List<URI> sites = new ArrayList<URI>(top + 1);
		sites.add(site);

		URI[] repoLocations = new URI[top + 1];
		for(int idx = 0; idx < top; ++idx) {
			MetadataRepositoryReference mdRef = validationRepos.get(idx);
			if(mdRef.isEnabled())
				sites.add(URI.create(mdRef.getResolvedLocation()));
		}
		repoLocations = sites.toArray(new URI[sites.size()]);
		ProvisioningContext context = new ProvisioningContext(getBuilder().getProvisioningAgent());
		context.setMetadataRepositories(repoLocations);
		context.setArtifactRepositories(repoLocations);
		return context;
	}

	private List<Contribution> findContributions(IInstallableUnit iu, IRequirement rq) {
		List<Contribution> contribs = Collections.emptyList();
		if(!(rq instanceof IRequiredCapability))
			return contribs;

		IRequiredCapability cap = (IRequiredCapability) rq;
		if(Builder.NAMESPACE_OSGI_BUNDLE.equals(cap.getNamespace()) ||
				IInstallableUnit.NAMESPACE_IU_ID.equals(cap.getNamespace()))
			contribs = findContributions(cap.getName());

		if(contribs.isEmpty())
			// Not found, try the owner of the requirement
			contribs = findContributions(iu.getId());
		return contribs;
	}

	private List<Contribution> findContributions(String componentId) {
		List<Contribution> result = null;
		for(Contribution contrib : getBuilder().getAggregator().getAggregateContributions(aggregate, true))
			for(MappedRepository repository : contrib.getRepositories(true))
				for(MappedUnit mu : repository.getUnits(true))
					if(componentId.equals(mu.getName())) {
						if(result == null)
							result = new ArrayList<Contribution>();
						result.add(contrib);
					}
		return result == null
				? Collections.<Contribution> emptyList()
				: result;
	}

	private Set<IInstallableUnit> getUnpatchedTransitiveScope(IQueryable<IInstallableUnit> collectedStuff,
			IInstallableUnitPatch patch, IProfile profile, IPlanner planner, URI repoLocation, SubMonitor monitor)
			throws CoreException {
		IMetadataRepositoryManager mdrMgr = P2Utils.getRepositoryManager(
			getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);
		try {
			monitor.beginTask(null, 10);
			IQuery<IInstallableUnit> query = SpecialQueries.createPatchApplicabilityQuery(patch);
			IQueryResult<IInstallableUnit> result = collectedStuff.query(query, monitor.newChild(1));

			IInstallableUnit[] rootArr = result.toArray(IInstallableUnit.class);
			// Add as root IU's to a request
			ProfileChangeRequest request = new ProfileChangeRequest(profile);
			for(IInstallableUnit rootIU : rootArr)
				request.setInstallableUnitProfileProperty(
					rootIU, IProfile.PROP_PROFILE_ROOT_IU, Boolean.TRUE.toString());
			request.addInstallableUnits(rootArr);

			ProvisioningContext context = new ProvisioningContext(getBuilder().getProvisioningAgent());
			context.setMetadataRepositories(new URI[] { repoLocation });
			// we don't pass the main monitor since we expect a possible failure which is silently ignored
			// to avoid this, we use a null monitor and when the plan is ready, we add the full amount of ticks
			// to the main monitor
			ProvisioningPlan plan = (ProvisioningPlan) planner.getProvisioningPlan(
				request, context, new NullProgressMonitor());
			monitor.worked(8);
			IStatus status = plan.getStatus();
			if(status.isOK()) {
				HashSet<IInstallableUnit> units = new HashSet<IInstallableUnit>();
				units.add(patch);
				Operand[] ops = plan.getOperands();
				for(Operand op : ops) {
					if(!(op instanceof InstallableUnitOperand))
						continue;

					InstallableUnitOperand iuOp = (InstallableUnitOperand) op;
					IInstallableUnit iu = iuOp.second();
					if(iu != null)
						units.add(iu);
				}
				return units;
			}
			return Collections.emptySet();
		}
		finally {
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), mdrMgr);
		}
	}

	InstallableUnit resolvePartialIU(IInstallableUnit iu, SubMonitor subMon) throws CoreException {
		IArtifactRepositoryManager arMgr = P2Utils.getRepositoryManager(
			getBuilder().getProvisioningAgent(), IArtifactRepositoryManager.class);
		String info = "Converting partial IU for " + iu.getId() + "...";
		subMon.beginTask(info, IProgressMonitor.UNKNOWN);
		LogUtils.debug(info);

		try {
			// Scan all mapped repositories for this IU
			//
			IInstallableUnit miu = null;
			MetadataRepository mdr = null;
			contribs: for(Contribution contrib : getBuilder().getAggregator().getContributions(true))

				for(MappedRepository repo : contrib.getRepositories(true)) {
					MetadataRepository candidate = repo.getMetadataRepository();
					for(IInstallableUnit candidateIU : candidate.getInstallableUnits())
						if(iu.getId().equals(candidateIU.getId()) && iu.getVersion().equals(candidateIU.getVersion())) {
							mdr = candidate;
							miu = candidateIU;
							break contribs;
						}
				}

			if(mdr == null)
				throw ExceptionUtils.fromMessage(
					"Unable to locate mapped repository for IU %s/%s", iu.getId(), iu.getVersion());

			IArtifactRepository sourceAr = arMgr.loadRepository(mdr.getLocation(), subMon.newChild(10));
			File tempRepositoryFolder = getBuilder().getTempRepositoryFolder();
			tempRepositoryFolder.mkdirs();

			URI tempRepositoryURI = Builder.createURI(tempRepositoryFolder);
			IFileArtifactRepository tempAr;
			try {
				tempAr = (IFileArtifactRepository) arMgr.loadRepository(tempRepositoryURI, subMon.newChild(1));
			}
			catch(ProvisionException e) {
				tempAr = (IFileArtifactRepository) arMgr.createRepository(tempRepositoryURI, "temporary artifacts"
						+ " artifacts", Builder.SIMPLE_ARTIFACTS_TYPE, Collections.<String, String> emptyMap()); //$NON-NLS-1$
			}

			Collection<IArtifactKey> artifacts = miu.getArtifacts();
			IArtifactKey key = artifacts.iterator().next();
			ArrayList<String> errors = new ArrayList<String>();
			MirrorGenerator.mirror(
				artifacts, null, sourceAr, tempAr, PackedStrategy.UNPACK_AS_SIBLING, errors, subMon.newChild(1));
			int numErrors = errors.size();
			if(numErrors > 0) {
				IStatus[] children = new IStatus[numErrors];
				for(int idx = 0; idx < numErrors; ++idx)
					children[idx] = new Status(IStatus.ERROR, Engine.PLUGIN_ID, errors.get(idx));
				MultiStatus status = new MultiStatus(
					Engine.PLUGIN_ID, IStatus.ERROR, children, "Unable to mirror", null);
				throw new CoreException(status);
			}

			File bundleFile = tempAr.getArtifactFile(key);
			if(bundleFile == null)
				throw ExceptionUtils.fromMessage(
					"Unable to resolve partial IU. Artifact file for %s could not be found", key);

			IInstallableUnit preparedIU = PublisherUtil.createBundleIU(key, bundleFile);
			if(preparedIU == null)
				throw ExceptionUtils.fromMessage(
					"Unable to resolve partial IU. Artifact file for %s did not contain a bundle manifest", key);
			InstallableUnit newIU = P2Bridge.importToModel(preparedIU);

			List<IInstallableUnit> allIUs = mdr.getInstallableUnits();
			allIUs.remove(miu);
			allIUs.add(newIU);
			return newIU;
		}
		catch(CoreException e) {
			for(Contribution contrib : findContributions(iu.getId()))
				getBuilder().sendEmail(contrib, Collections.singletonList(e.getMessage()));
			throw e;
		}
		finally {
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), arMgr);
		}
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		String taskLabel = Builder.getAggregateLabel(aggregate);

		Builder builder = getBuilder();
		Aggregator aggregator = builder.getAggregator();
		List<Configuration> configs = aggregator.getConfigurations();
		int configCount = configs.size();
		SubMonitor subMon = SubMonitor.convert(monitor, configCount * 100);

		LogUtils.info("Starting planner verification for aggregate: " + taskLabel); //$NON-NLS-1$
		long start = TimeUtils.getNow();

		String profilePrefix = Builder.PROFILE_ID + '_';

		for(Contribution contrib : aggregator.getAggregateContributions(aggregate, true))
			((ContributionImpl) contrib).setStatus(null);

		final Set<IInstallableUnit> unitsToAggregate = builder.getUnitsToAggregate(aggregate);
		IProfileRegistry profileRegistry = P2Utils.getProfileRegistry(builder.getProvisioningAgent());
		IPlanner planner = P2Utils.getPlanner(builder.getProvisioningAgent());
		IMetadataRepositoryManager mdrMgr = P2Utils.getRepositoryManager(
			builder.getProvisioningAgent(), IMetadataRepositoryManager.class);
		try {
			URI repoLocation = builder.getSourceCompositeURI();
			Set<IInstallableUnit> validationOnlyIUs = null;
			List<MetadataRepositoryReference> validationRepos = aggregator.getValidationRepositories();
			for(MetadataRepositoryReference validationRepo : validationRepos) {
				if(validationRepo.isEnabled()) {
					if(validationOnlyIUs == null)
						validationOnlyIUs = new HashSet<IInstallableUnit>();
					validationOnlyIUs.addAll(validationRepo.getMetadataRepository().getInstallableUnits());
				}
			}
			if(validationOnlyIUs == null)
				validationOnlyIUs = Collections.emptySet();

			IMetadataRepository sourceRepo = mdrMgr.loadRepository(repoLocation, subMon.newChild(1));
			for(Configuration config : configs) {
				if(!config.isEnabled())
					continue;

				String configName = config.getName();
				String info = format("Verifying config %s...", configName); //$NON-NLS-1$
				LogUtils.info(info);
				subMon.setTaskName(info);

				Map<String, String> props = new HashMap<String, String>();
				// TODO Where is FLAVOR gone?
				//props.put(IProfile.PROP_FLAVOR, "tooling"); //$NON-NLS-1$
				props.put(IProfile.PROP_ENVIRONMENTS, config.getOSGiEnvironmentString());
				props.put(IProfile.PROP_INSTALL_FEATURES, "true");

				IProfile profile = null;
				String profileId = profilePrefix + configName;

				profile = profileRegistry.getProfile(profileId);
				if(profile == null)
					profile = profileRegistry.addProfile(profileId, props);

				IInstallableUnit[] rootArr = getRootIUs(
					sourceRepo, builder.getVerificationIUName(aggregate), Builder.ALL_CONTRIBUTED_CONTENT_VERSION,
					subMon.newChild(9));

				// Add as root IU's to a request
				ProfileChangeRequest request = new ProfileChangeRequest(profile);
				for(IInstallableUnit rootIU : rootArr)
					request.setInstallableUnitProfileProperty(
						rootIU, IProfile.PROP_PROFILE_ROOT_IU, Boolean.TRUE.toString());
				request.addInstallableUnits(rootArr);

				while(true) {
					ProvisioningContext context = createContext(repoLocation);
					ProvisioningPlan plan = (ProvisioningPlan) planner.getProvisioningPlan(
						request, context,
						subMon.newChild(80, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));

					IStatus status = plan.getStatus();
					if(status.getSeverity() == IStatus.ERROR) {
						sendEmails((PlannerStatus) status);
						LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
						throw new CoreException(new AnalyzedPlannerStatus((PlannerStatus) status));
					}

					boolean hadPartials = false;

					Set<IInstallableUnit> suspectedValidationOnlyIUs = null;
					Operand[] ops = plan.getOperands();
					for(Operand op : ops) {
						if(!(op instanceof InstallableUnitOperand))
							continue;

						InstallableUnitOperand iuOp = (InstallableUnitOperand) op;
						IInstallableUnit iu = iuOp.second();
						if(iu == null)
							continue;

						// skip all IUs generated for verification purposes
						if(Boolean.parseBoolean(iu.getProperty(org.eclipse.b3.aggregator.engine.Builder.PROP_AGGREGATOR_VERIFICATION_IU)))
							continue;

						if(validationOnlyIUs.contains(iu)) {
							// This IU should not be included unless it is also included in one of
							// the contributed repositories
							if(suspectedValidationOnlyIUs == null)
								suspectedValidationOnlyIUs = new HashSet<IInstallableUnit>();
							suspectedValidationOnlyIUs.add(iu);
						}
						else {
							if(!unitsToAggregate.contains(iu)) {
								if(Boolean.valueOf(iu.getProperty(IInstallableUnit.PROP_PARTIAL_IU)).booleanValue()) {
									iu = resolvePartialIU(iu, subMon.newChild(1));
									hadPartials = true;
								}
								unitsToAggregate.add(iu);
							}
						}
					}

					Iterator<IInstallableUnit> itor = sourceRepo.query(
						QueryUtil.createIUPatchQuery(), subMon.newChild(1)).iterator();

					IQueryable<IInstallableUnit> collectedStuff = null;
					while(itor.hasNext()) {
						IInstallableUnitPatch patch = (IInstallableUnitPatch) itor.next();
						if(!unitsToAggregate.contains(patch))
							continue;

						if(collectedStuff == null) {
							collectedStuff = new QueryableArray(
								unitsToAggregate.toArray(new IInstallableUnit[unitsToAggregate.size()]));
						}

						Set<IInstallableUnit> units = getUnpatchedTransitiveScope(
							collectedStuff, patch, profile, planner, repoLocation, subMon.newChild(1));
						for(IInstallableUnit iu : units) {
							if(validationOnlyIUs.contains(iu)) {
								// This IU should not be included unless it is also included in one of
								// the contributed repositories
								if(suspectedValidationOnlyIUs == null)
									suspectedValidationOnlyIUs = new HashSet<IInstallableUnit>();
								suspectedValidationOnlyIUs.add(iu);
							}
							else {
								if(!unitsToAggregate.contains(iu)) {
									if(Boolean.valueOf(iu.getProperty(IInstallableUnit.PROP_PARTIAL_IU)).booleanValue()) {
										iu = resolvePartialIU(iu, subMon.newChild(1));
										hadPartials = true;
									}
									unitsToAggregate.add(iu);
								}
							}
						}
					}

					if(suspectedValidationOnlyIUs != null) {
						// Prune the set of IU's that we suspect are there for validation
						// purposes only using the source repository
						//
						final Set<IInstallableUnit> candidates = suspectedValidationOnlyIUs;
						final boolean hadPartialsHolder[] = new boolean[] { false };

						Iterator<IInstallableUnit> allIUs = sourceRepo.query(
							QueryUtil.createIUAnyQuery(), subMon.newChild(1)).iterator();

						while(allIUs.hasNext()) {
							IInstallableUnit iu = allIUs.next();
							if(candidates.contains(iu) && !unitsToAggregate.contains(iu)) {
								try {
									if(Boolean.valueOf(iu.getProperty(IInstallableUnit.PROP_PARTIAL_IU)).booleanValue()) {
										iu = resolvePartialIU(iu, SubMonitor.convert(new NullProgressMonitor()));
										hadPartialsHolder[0] = true;
									}
								}
								catch(CoreException e) {
									throw new RuntimeException(e);
								}
								unitsToAggregate.add(iu);
							}
						}
					}

					// exit the loop if there are no more partial IUs
					if(!hadPartials)
						break;

					LogUtils.info("Partial IU's encountered. Verifying %s again...", configName); //$NON-NLS-1$
				}
			}

			builder.getAllUnitsToAggregate().addAll(unitsToAggregate);

			LogUtils.info("Verification successful"); //$NON-NLS-1$
		}
		catch(RuntimeException e) {
			throw ExceptionUtils.wrap(e);
		}
		finally {
			MonitorUtils.done(subMon);
			P2Utils.ungetProfileRegistry(builder.getProvisioningAgent(), profileRegistry);
			P2Utils.ungetPlanner(builder.getProvisioningAgent(), planner);
			P2Utils.ungetRepositoryManager(builder.getProvisioningAgent(), mdrMgr);

			LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		}
	}

	private void sendEmails(PlannerStatus plannerStatus) {
		Builder builder = getBuilder();
		if(!builder.getAggregator().isSendmail())
			return;

		ArrayList<String> errors = new ArrayList<String>();
		RequestStatus requestStatus = plannerStatus.getRequestStatus();
		if(requestStatus == null)
			return;

		Set<Explanation> explanations = requestStatus.getExplanations();
		Map<String, Contribution> contribs = new HashMap<String, Contribution>();
		for(Explanation explanation : explanations) {
			String msg = explanation.toString();
			LogUtils.error(msg);
			errors.add(msg);
			if(explanation instanceof Singleton) {
				// A singleton is always a leaf problem. Add contributions
				// if we can find any. They are all culprits
				for(IInstallableUnit iu : ((Singleton) explanation).ius) {
					for(Contribution contrib : findContributions(iu.getId()))
						contribs.put(contrib.getLabel(), contrib);
				}
				continue;
			}

			IInstallableUnit iu;
			IRequirement crq;
			if(explanation instanceof HardRequirement) {
				HardRequirement hrq = (HardRequirement) explanation;
				iu = hrq.iu;
				crq = hrq.req;
			}
			else if(explanation instanceof MissingIU) {
				MissingIU miu = (MissingIU) explanation;
				iu = miu.iu;
				crq = miu.req;
			}
			else
				continue;

			// Find the leafmost contributions for the problem. We don't want to
			// blame consuming contributors
			if(!addLeafmostContributions(explanations, contribs, crq)) {
				for(Contribution contrib : findContributions(iu, crq))
					contribs.put(contrib.getLabel(), contrib);
			}
		}
		if(contribs.isEmpty())
			builder.sendEmail(null, errors);
		else {
			for(Contribution contrib : contribs.values())
				builder.sendEmail(contrib, errors);
		}
	}
}
