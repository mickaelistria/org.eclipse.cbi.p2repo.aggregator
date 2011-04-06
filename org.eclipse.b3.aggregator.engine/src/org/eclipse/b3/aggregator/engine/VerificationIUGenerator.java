package org.eclipse.b3.aggregator.engine;

import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.aggregator.Aggregate;
import org.eclipse.b3.p2.util.P2Utils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.equinox.internal.p2.core.helpers.FileUtils;
import org.eclipse.equinox.p2.publisher.IPublisherAction;
import org.eclipse.equinox.p2.publisher.Publisher;
import org.eclipse.equinox.p2.publisher.PublisherInfo;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class VerificationIUGenerator extends BuilderPhase {
	private Aggregate aggregate;

	public VerificationIUGenerator(Builder builder, Aggregate aggregate) {
		super(builder);
		this.aggregate = aggregate;
	}

	private IPublisherAction[] createActions(IMetadataRepository mdr) {
		return new IPublisherAction[] { new VerificationIUAction(getBuilder(), aggregate, mdr) };
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		String taskLabel = Builder.getAggregateLabel(aggregate);

		long start = TimeUtils.getNow();
		MonitorUtils.begin(monitor, "Verifying Features for aggregate: " + taskLabel, 100);
		String info = "Starting generation of verification feature for aggregate: " + taskLabel;
		LogUtils.info(info);
		MonitorUtils.subTask(monitor, info);

		String name = getBuilder().getAggregatorr().getLabel();
		if(aggregate != null)
			name += " / " + aggregate.getLabel();
		name += " Verification repository";

		File globalLocation = new File(getBuilder().getBuildRoot(), Builder.REPO_FOLDER_INTERIM);
		File location = new File(globalLocation, Builder.REPO_FOLDER_VERIFICATION +
				getBuilder().getAggregateSubdirectory(aggregate));
		FileUtils.deleteAll(location);

		Map<String, String> properties = new HashMap<String, String>();
		URI locationURI = Builder.createURI(location);

		IMetadataRepositoryManager mdrMgr = P2Utils.getRepositoryManager(
			getBuilder().getProvisioningAgent(), IMetadataRepositoryManager.class);

		try {
			mdrMgr.removeRepository(locationURI);

			// TODO Use this to activate the "version enumeration" policy workaround
			// IMetadataRepository mdr = mdrMgr.createRepository(locationURI, name, Builder.INTERNAL_METADATA_TYPE,
			// properties);
			IMetadataRepository mdr = (aggregate == null)
					? mdrMgr.createRepository(locationURI, name, Builder.SIMPLE_METADATA_TYPE, properties)
					: mdrMgr.loadRepository(locationURI, MonitorUtils.subMonitor(monitor, 5));

			PublisherInfo pubInfo = new PublisherInfo();
			pubInfo.setMetadataRepository(mdr);
			Publisher publisher = new Publisher(pubInfo);
			IStatus result = publisher.publish(createActions(mdr), MonitorUtils.subMonitor(monitor, 90));
			if(result.getSeverity() == IStatus.ERROR)
				throw new CoreException(result);

			getBuilder().getSourceComposite().addChild(mdr.getLocation());
		}
		finally {
			P2Utils.ungetRepositoryManager(getBuilder().getProvisioningAgent(), mdrMgr);
			MonitorUtils.done(monitor);
		}
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
	}
}