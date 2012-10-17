package org.eclipse.b3.aggregator.engine;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.LogUtils;
import org.eclipse.b3.util.MonitorUtils;
import org.eclipse.b3.util.TimeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.internal.p2.core.helpers.FileUtils;
import org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository;
import org.eclipse.equinox.internal.p2.metadata.repository.LocalMetadataRepository;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

public class SourceCompositeGenerator extends BuilderPhase {
	private final ValidationSet validationSet;

	public SourceCompositeGenerator(Builder builder, ValidationSet validationSet) {
		super(builder);
		this.validationSet = validationSet;
	}

	private IRepository<IInstallableUnit> createLocalMdr(URI locationBase, MetadataRepository mdr)
			throws URISyntaxException, NoSuchAlgorithmException {
		URI location = new URI(locationBase.toString() + "/transformed/" + encode(mdr.getLocation().toString()));
		LocalMetadataRepository localMdr = new LocalMetadataRepository(
			getBuilder().getProvisioningAgent(), location, mdr.getName(), mdr.getProperties());
		localMdr.setDescription(mdr.getDescription());
		localMdr.setProvider(mdr.getProvider());
		localMdr.addInstallableUnits(mdr.getInstallableUnits());
		localMdr.setProperty(IRepository.PROP_COMPRESSED, "true");
		return localMdr;
	}

	private String encode(String location) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		StringBuilder encoded = new StringBuilder();
		for(byte b : digest.digest(location.getBytes()))
			encoded.append(String.format("%02x", Byte.valueOf(b)));

		return encoded.toString();
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		List<Contribution> contribs = validationSet.getAllContributions();

		SubMonitor subMon = SubMonitor.convert(monitor, 100 + contribs.size() * 100);
		String info = "Starting generation of composite repository";
		LogUtils.info(info);
		subMon.setTaskName("Generating composite from all sources...");

		long start = TimeUtils.getNow();

		String name = validationSet.getLabel() + " Source Composite";
		boolean errorsFound = false;

		Builder builder = getBuilder();
		IMetadataRepositoryManager mdrMgr = builder.getMdrManager();
		URI sourceLocationURI = builder.getSourceCompositeURI(validationSet);
		mdrMgr.removeRepository(sourceLocationURI);
		FileUtils.deleteAll(new File(builder.getBuildRoot(), Builder.REPO_FOLDER_INTERIM));

		Map<String, String> properties = new HashMap<String, String>();
		properties.put(Builder.PROP_ATOMIC_COMPOSITE_LOADING, Boolean.toString(true));
		CompositeMetadataRepository compositeMdr = (CompositeMetadataRepository) mdrMgr.createRepository(
			sourceLocationURI, name, Builder.COMPOSITE_METADATA_TYPE, properties);
		getBuilder().setSourceComposite(validationSet, compositeMdr);

		MonitorUtils.worked(subMon, 100);
		for(Contribution contrib : contribs) {
			SubMonitor contribMonitor = subMon.newChild(100);
			List<MappedRepository> repos = contrib.getRepositories(true);
			MonitorUtils.begin(contribMonitor, repos.size() * 200);
			List<String> errors = new ArrayList<String>();
			for(MappedRepository repo : repos) {
				try {
					URI childLocation = new URI(repo.getResolvedLocation());
					LogUtils.info("Adding child meta-data repository %s", childLocation);

					// if the original repository is not p2 compatible, persist its virtual metadata as a local p2
					// repository
					if(!"p2".equals(repo.getNature()))
						childLocation = createLocalMdr(sourceLocationURI, ResourceUtils.getMetadataRepository(repo)).getLocation();
					compositeMdr.addChild(childLocation);
				}
				catch(Exception e) {
					String msg = Builder.getExceptionMessages(e);
					errors.add(msg);
					LogUtils.error(e, msg);
				}
				contribMonitor.worked(200);
			}
			MonitorUtils.done(contribMonitor);
			if(!errors.isEmpty()) {
				getBuilder().sendEmail(contrib, errors);
				errorsFound = true;
			}
		}
		MonitorUtils.done(monitor);
		LogUtils.info("Done. Took %s", TimeUtils.getFormattedDuration(start)); //$NON-NLS-1$
		if(errorsFound)
			throw ExceptionUtils.fromMessage("CompositeRepository generation was not successful");
	}
}
