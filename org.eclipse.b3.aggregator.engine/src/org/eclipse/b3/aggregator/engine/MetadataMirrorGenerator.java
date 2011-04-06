package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregate;
import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.IRepositoryReference;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class MetadataMirrorGenerator extends BuilderPhase {

	private IMetadataRepositoryManager mdrMgr = null;

	private Aggregate aggregate;

	public MetadataMirrorGenerator(Builder builder, Aggregate aggregate) {
		super(builder);
		this.aggregate = aggregate;
	}

	private void mirror(List<IInstallableUnit> iusToMirror, MetadataRepository source, final IMetadataRepository dest,
			IProgressMonitor monitor) throws CoreException {
		dest.addInstallableUnits(iusToMirror);

		Builder builder = getBuilder();
		if(source != null && builder.isMirrorReferences()) {
			List<IRepositoryReference> refs = new ArrayList<IRepositoryReference>();
			for(IRepositoryReference ref : source.getReferences()) {
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

				refs.add(new org.eclipse.equinox.p2.repository.spi.RepositoryReference(
					location, ref.getNickname(), ref.getType(), 0));
			}

			dest.addReferences(refs);
		}
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		String taskLabel = Builder.getAggregateLabel(aggregate);

		LogUtils.info("Starting mirroring of meta-data for aggregate: " + taskLabel);
		long start = TimeUtils.getNow();

		Builder builder = getBuilder();
		File destination = new File(builder.getBuildRoot(), Builder.REPO_FOLDER_FINAL);
		File aggregateDestination = new File(destination, Builder.REPO_FOLDER_AGGREGATE +
				builder.getAggregateSubdirectory(aggregate));
		URI aggregateURI = Builder.createURI(aggregateDestination);

		mdrMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);
		SubMonitor subMon = SubMonitor.convert(monitor, 1000);
		boolean artifactErrors = false;
		try {
			Aggregator aggregator = builder.getAggregatorr();

			subMon.setTaskName("Mirroring meta-data for aggregate: " + taskLabel + "...");
			MonitorUtils.subTask(subMon, "Initializing");

			MonitorUtils.worked(subMon, 5);

			Map<String, String> properties = new HashMap<String, String>();
			properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));
			String label = aggregator.getLabel() + (aggregate == null
					? ""
					: " / " + aggregate.getLabel());
			IMetadataRepository aggregateMdr = mdrMgr.createRepository(
				aggregateURI, label, Builder.SIMPLE_METADATA_TYPE, properties);
			MonitorUtils.worked(subMon, 10);

			Set<IInstallableUnit> unitsToAggregate = builder.getUnitsToAggregate(aggregate);

			SubMonitor childMonitor = subMon.newChild(900, SubMonitor.SUPPRESS_BEGINTASK |
					SubMonitor.SUPPRESS_SETTASKNAME);
			List<Contribution> contribs = aggregator.getAggregateContributions(aggregate, true);

			MonitorUtils.begin(childMonitor, contribs.size() * 100 + 20);

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
					for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
						if(!unitsToAggregate.remove(iu))
							continue;

						if(iusToMirror == null)
							iusToMirror = new ArrayList<IInstallableUnit>();

						iusToMirror.add(iu);
					}

					if(iusToMirror != null) {
						String msg = format("Mirroring meta-data from %s", childMdr.getLocation());
						LogUtils.info(msg);
						contribMonitor.subTask(msg);
						mirror(
							iusToMirror, childMdr, aggregateMdr,
							contribMonitor.newChild(5, SubMonitor.SUPPRESS_BEGINTASK | SubMonitor.SUPPRESS_SETTASKNAME));
					}
					else
						MonitorUtils.worked(contribMonitor, 5);
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
			}

			// Remove the aggregation in case it's now empty.
			//
			String[] content = aggregateDestination.list();
			if(content != null && content.length == 0) {
				// remove the entry from the map of units to aggregate too, as the keys from the map are used to generate children
				// of the final composite repository by the final phase of the build process
				builder.removeUnitsToAggregate(aggregate);
				if(!aggregateDestination.delete())
					throw ExceptionUtils.fromMessage("Unable to remove %s", aggregateDestination.getAbsolutePath());
			}

			MonitorUtils.done(childMonitor);
		}
		finally {
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), mdrMgr);
			mdrMgr = null;
			MonitorUtils.done(subMon);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		if(artifactErrors)
			throw ExceptionUtils.fromMessage("Not all artifacts could be mirrored, see log for details");
	}

}
