package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.CompositeChild;
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

	private IMetadataRepositoryManager mdrMgr;

	private CompositeChild compositeChild;

	public MetadataMirrorGenerator(Builder builder, CompositeChild compositeChild) {
		super(builder);
		this.compositeChild = compositeChild;
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
		String taskLabel = Builder.getCompositeChildLabel(compositeChild);

		LogUtils.info("Starting mirroring of meta-data for compositeChild: " + taskLabel);
		long start = TimeUtils.getNow();

		Builder builder = getBuilder();
		File destination = new File(builder.getBuildRoot(), Builder.REPO_FOLDER_FINAL);
		File compositeChildDestination = new File(destination, Builder.REPO_FOLDER_AGGREGATE +
				builder.getCompositeChildSubdirectory(compositeChild));
		URI compositeChildURI = Builder.createURI(compositeChildDestination);

		mdrMgr = P2Utils.getRepositoryManager(getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);
		SubMonitor subMon = SubMonitor.convert(monitor, 1000);
		boolean artifactErrors = false;
		try {
			Set<IInstallableUnit> unitsToCompositeChild = builder.getUnitsToCompositeChild(compositeChild);

			if(unitsToCompositeChild.size() > 0) {
				subMon.setTaskName("Mirroring meta-data for compositeChild: " + taskLabel + "...");
				MonitorUtils.subTask(subMon, "Initializing");

				MonitorUtils.worked(subMon, 5);

				Aggregator aggregator = builder.getAggregator();

				Map<String, String> properties = new HashMap<String, String>();
				properties.put(IRepository.PROP_COMPRESSED, Boolean.toString(true));
				String label = aggregator.getLabel() + (compositeChild == null
						? ""
						: " / " + compositeChild.getLabel());
				IMetadataRepository compositeChildMdr = mdrMgr.createRepository(
					compositeChildURI, label, Builder.SIMPLE_METADATA_TYPE, properties);
				MonitorUtils.worked(subMon, 10);

				SubMonitor childMonitor = subMon.newChild(900, SubMonitor.SUPPRESS_BEGINTASK |
						SubMonitor.SUPPRESS_SETTASKNAME);
				List<Contribution> contribs = aggregator.getCompositeChildContributions(compositeChild, true);

				MonitorUtils.begin(childMonitor, contribs.size() * 100 + 20);

				for(Contribution contrib : contribs) {
					SubMonitor contribMonitor = childMonitor.newChild(100);
					List<MappedRepository> repos = contrib.getRepositories(true);
					MonitorUtils.begin(contribMonitor, repos.size() * 100);

					for(MappedRepository repo : repos) {
						if(builder.isMapVerbatim(repo)) {
							MonitorUtils.worked(contribMonitor, 100);
							continue;
						}

						MetadataRepository childMdr = ResourceUtils.getMetadataRepository(repo);
						ArrayList<IInstallableUnit> iusToMirror = null;
						for(IInstallableUnit iu : childMdr.getInstallableUnits()) {
							if(!unitsToCompositeChild.remove(iu))
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
								iusToMirror,
								childMdr,
								compositeChildMdr,
								contribMonitor.newChild(5, SubMonitor.SUPPRESS_BEGINTASK |
										SubMonitor.SUPPRESS_SETTASKNAME));
						}
						else
							MonitorUtils.worked(contribMonitor, 5);
					}
					MonitorUtils.done(contribMonitor);
				}

				// TODO currently we mirror the custom categories for the main/implicit compositeChild only - make this work with other compositeChilds too
				if(compositeChild == null) {
					List<IInstallableUnit> categories = builder.getCategoryIUs();
					if(!categories.isEmpty()) {
						mirror(categories, null, compositeChildMdr, childMonitor.newChild(20));
					}
				}

				// Remove the aggregation in case it's now empty.
				//
				String[] content = compositeChildDestination.list();
				if(content != null && content.length == 0) {
					// remove the entry from the map of units to compositeChild too, as the keys from the map are used to generate children
					// of the final composite repository by the final phase of the build process
					builder.removeUnitsToCompositeChild(compositeChild);
					if(!compositeChildDestination.delete())
						throw ExceptionUtils.fromMessage("Unable to remove %s", compositeChildDestination.getAbsolutePath());
				}

				MonitorUtils.done(childMonitor);
			}
			else
				builder.removeUnitsToCompositeChild(compositeChild);
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
