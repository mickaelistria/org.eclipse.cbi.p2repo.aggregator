/*******************************************************************************
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/
package org.eclipse.b3.aggregator.engine;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Category;
import org.eclipse.b3.aggregator.Configuration;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.ExclusionRule;
import org.eclipse.b3.aggregator.InstallableUnitType;
import org.eclipse.b3.aggregator.MapRule;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.ValidConfigurationsRule;
import org.eclipse.b3.aggregator.util.InstallableUnitUtils;
import org.eclipse.b3.aggregator.util.LogUtils;
import org.eclipse.b3.aggregator.util.MonitorUtils;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.buckminster.osgi.filter.Filter;
import org.eclipse.buckminster.osgi.filter.FilterFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.internal.provisional.p2.metadata.MetadataFactory;
import org.eclipse.equinox.internal.provisional.p2.metadata.MetadataFactory.InstallableUnitDescription;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.publisher.AbstractPublisherAction;
import org.eclipse.equinox.p2.publisher.IPublisherInfo;
import org.eclipse.equinox.p2.publisher.IPublisherResult;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.osgi.framework.InvalidSyntaxException;

/**
 * This action creates the feature that contains all features and bundles that are listed in the build contributions.
 * 
 * @see Builder#ALL_CONTRIBUTED_CONTENT_FEATURE
 */
public class VerificationFeatureAction extends AbstractPublisherAction {
	static class RepositoryRequirement {
		MappedRepository repository;

		IRequirement requirement;
	}

	private static Filter createFilter(List<Configuration> configs) {
		List<Configuration> enabledConfigs = getEnabledConfigs(configs);

		if(!(enabledConfigs == null || enabledConfigs.isEmpty())) {
			StringBuilder filterBld = new StringBuilder();
			if(enabledConfigs.size() > 1)
				filterBld.append("(|");

			for(Configuration config : enabledConfigs) {
				filterBld.append("(&(osgi.os=");
				filterBld.append(config.getOperatingSystem().getLiteral());
				filterBld.append(")(osgi.ws=");
				filterBld.append(config.getWindowSystem().getLiteral());
				filterBld.append(")(osgi.arch=");
				filterBld.append(config.getArchitecture().getLiteral());
				filterBld.append("))");
			}
			if(enabledConfigs.size() > 1)
				filterBld.append(')');
			try {
				return FilterFactory.newInstance(filterBld.toString());
			}
			catch(InvalidSyntaxException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

	private static List<Configuration> getEnabledConfigs(List<Configuration> configs) {
		List<Configuration> enabledConfigs = new ArrayList<Configuration>();

		for(Configuration config : configs)
			if(config.isEnabled())
				enabledConfigs.add(config);

		return enabledConfigs;
	}

	private final Builder builder;

	private final IMetadataRepository mdr;

	public VerificationFeatureAction(Builder builder, IMetadataRepository mdr) {
		this.builder = builder;
		this.mdr = mdr;
	}

	@Override
	public IStatus perform(IPublisherInfo publisherInfo, IPublisherResult results, IProgressMonitor monitor) {
		InstallableUnitDescription iu = new MetadataFactory.InstallableUnitDescription();
		iu.setId(Builder.ALL_CONTRIBUTED_CONTENT_FEATURE);
		iu.setVersion(Builder.ALL_CONTRIBUTED_CONTENT_VERSION);
		iu.setProperty(InstallableUnitDescription.PROP_TYPE_GROUP, Boolean.TRUE.toString());
		iu.addProvidedCapabilities(Collections.singletonList(createSelfCapability(iu.getId(), iu.getVersion())));

		Map<String, RepositoryRequirement> required = new HashMap<String, RepositoryRequirement>();

		boolean errorsFound = false;
		List<Contribution> contribs = builder.getAggregator().getContributions();
		SubMonitor subMon = SubMonitor.convert(monitor, 2 + contribs.size());
		try {
			Set<String> explicit = new HashSet<String>();
			for(Contribution contrib : builder.getAggregator().getContributions(true)) {
				ArrayList<String> errors = new ArrayList<String>();
				for(MappedRepository repository : contrib.getRepositories(true)) {
					List<IInstallableUnit> allIUs;

					try {
						allIUs = ResourceUtils.getMetadataRepository(repository).getInstallableUnits();
					}
					catch(CoreException e) {
						errors.add(e.getMessage());
						continue;
					}

					if(repository.isMapExclusive()) {
						for(MappedUnit mu : repository.getUnits(true)) {
							if(mu instanceof Category) {
								addCategoryContent(mu.resolveAsSingleton(), repository, allIUs, required, errors,
										explicit);
								continue;
							}
							addRequirementFor(repository, mu.getRequiredCapability(), required, errors, explicit, true);
						}
					}
					else {
						// Verify that all products and features can be installed.
						//
						List<MapRule> mapRules = repository.getMapRules();
						allIUs: for(IInstallableUnit riu : allIUs) {
							// We assume that all groups that are not categories are either products or
							// features.
							//
							InstallableUnitType riuType = InstallableUnitUtils.getType(riu);
							if(riuType == InstallableUnitType.PRODUCT || riuType == InstallableUnitType.FEATURE) {
								Filter filter = null;
								for(MapRule rule : mapRules) {
									if(riu.getId().equals(rule.getName())
											&& rule.getVersionRange().isIncluded(riu.getVersion())) {
										if(rule instanceof ExclusionRule) {
											builder.addMappingExclusion(repository,
													MetadataFactory.createRequiredCapability(
															IInstallableUnit.NAMESPACE_IU_ID, riu.getId(),
															new VersionRange(riu.getVersion(), true, riu.getVersion(),
																	true), null, false, false), null);
											continue allIUs;
										}
										if(rule instanceof ValidConfigurationsRule) {
											filter = createFilter(((ValidConfigurationsRule) rule).getValidConfigurations());
										}
									}
								}
								addRequirementFor(repository, riu, filter, required, errors, explicit, false);
							}
						}
					}
				}
				if(errors.size() > 0) {
					errorsFound = true;
					builder.sendEmail(contrib, errors);
				}
				MonitorUtils.worked(subMon, 1);
			}
			if(errorsFound)
				return new Status(IStatus.ERROR, Engine.PLUGIN_ID, "Features without repositories");

			IRequirement[] rcArr = new IRequirement[required.size()];
			int idx = 0;
			for(RepositoryRequirement rc : required.values())
				rcArr[idx++] = rc.requirement;
			iu.setRequiredCapabilities(rcArr);
			mdr.addInstallableUnits(new IInstallableUnit[] { MetadataFactory.createInstallableUnit(iu) });
			return Status.OK_STATUS;
		}
		finally {
			MonitorUtils.done(subMon);
		}
	}

	private void addCategoryContent(IInstallableUnit category, MappedRepository repository,
			List<IInstallableUnit> allIUs, Map<String, RepositoryRequirement> required, List<String> errors,
			Set<String> explicit) {
		// We don't map categories verbatim here. They are added elsewhere. We do
		// map their contents though.
		requirements: for(IRequirement rc : category.getRequiredCapabilities()) {
			for(IInstallableUnit riu : allIUs) {
				if(riu.satisfies(rc)) {
					if("true".equalsIgnoreCase(riu.getProperty(InstallableUnitDescription.PROP_TYPE_CATEGORY))) {
						// Nested category
						addCategoryContent(riu, repository, allIUs, required, errors, explicit);
						continue requirements;
					}

					// TODO Get rid of buckminster filters!
					String filterStr = rc.getFilter().toString();
					Filter filter = null;
					if(filterStr != null) {
						try {
							filter = FilterFactory.newInstance(filterStr);
						}
						catch(InvalidSyntaxException e) {
							throw new RuntimeException(e);
						}
					}
					addRequirementFor(repository, riu, filter, required, errors, explicit, false);
					continue requirements;
				}
			}

			// Categorized IU is not found
			//
			String error = format("Category %s includes a requirement for %s that cannot be fulfilled",
					category.getId(), rc);
			errors.add(error);
			LogUtils.error(error);
		}
	}

	private void addRequirementFor(MappedRepository mr, IInstallableUnit iu, Filter filter,
			Map<String, RepositoryRequirement> requirements, List<String> errors, Set<String> explicit,
			boolean isExplicit) {
		String id = iu.getId();
		Version v = iu.getVersion();
		if(builder.excludeFromVerification(iu)) {
			LogUtils.debug("%s/%s excluded from verification", id, v);
			return;
		}

		VersionRange range = null;
		if(!Version.emptyVersion.equals(v))
			range = new VersionRange(v, true, v, true);

		Filter iuFilter = filter;
		// TODO Get rid of buckminster filters
		String iuFilterStr = StringUtils.trimmedOrNull(iu.getFilter().toString());
		if(iuFilterStr != null) {
			if(filter != null)
				try {
					iuFilter = FilterFactory.newInstance(iuFilterStr).addFilterWithAnd(filter);
				}
				catch(InvalidSyntaxException e) {
				}
		}
		IRequiredCapability rc = MetadataFactory.createRequiredCapability(IInstallableUnit.NAMESPACE_IU_ID, id, range,
				iuFilter, false, false);

		RepositoryRequirement rq = new RepositoryRequirement();
		rq.repository = mr;
		rq.requirement = rc;
		RepositoryRequirement old = requirements.put(id, rq);
		if(old == null || old.requirement.equals(rc)) {
			if(isExplicit)
				explicit.add(id);
			return;
		}

		// TODO Dangerous cast
		Version oldVersion = ((IRequiredCapability) old.requirement).getRange().getMinimum();
		if(explicit.contains(id)) {
			if(!isExplicit) {
				LogUtils.debug("%s/%s excluded since version %s is explicitly mapped", id, v, oldVersion);
				builder.addMappingExclusion(mr, rc, old.requirement);
				// Reinstate the old one
				requirements.put(id, old);
			}
			else {
				String error;
				if(v.equals(oldVersion))
					error = format("%s/%s is explicitly mapped more than once but with different configurations", id, v);
				else
					error = format("%s is explicitly mapped using both version %s and %s", id, v, oldVersion);
				errors.add(error);
				LogUtils.error(error);
			}
			return;
		}

		if(isExplicit) {
			LogUtils.debug("%s/%s excluded since version %s is explicitly mapped", id, oldVersion, v);
			builder.addMappingExclusion(old.repository, old.requirement, rc);
			explicit.add(id);
			return;
		}

		int cmp = v.compareTo(oldVersion);
		if(cmp < 0) {
			// The previous version was higher
			//
			builder.addMappingExclusion(mr, rc, old.requirement);
			LogUtils.debug("%s/%s excluded since a higher version (%s) was found", id, v, oldVersion);

			// Reinstate the old one
			requirements.put(id, old);
		}
		else {
			builder.addMappingExclusion(old.repository, old.requirement, rc);
			LogUtils.debug("%s/%s excluded since a higher version (%s) was found", id, oldVersion, v);
		}
	}

	private void addRequirementFor(MappedRepository mr, IRequiredCapability rc,
			Map<String, RepositoryRequirement> requirements, List<String> errors, Set<String> explicit,
			boolean isExplicit) {

		String id = rc.getName();
		RepositoryRequirement rq = new RepositoryRequirement();
		rq.repository = mr;
		rq.requirement = rc;
		RepositoryRequirement old = requirements.put(id, rq);
		if(old == null || old.requirement.equals(rc)) {
			if(isExplicit)
				explicit.add(id);
			return;
		}

		// TODO Dangerous cast
		VersionRange oldVersionRange = ((IRequiredCapability) old.requirement).getRange();
		VersionRange newVersionRange = rc.getRange();
		if(explicit.contains(id)) {
			if(!isExplicit) {
				LogUtils.debug("%s/%s excluded since version %s is explicitly mapped", id, newVersionRange,
						oldVersionRange);
				builder.addMappingExclusion(mr, rc, old.requirement);
				// Reinstate the old one
				requirements.put(id, old);
			}
			else {
				String error;
				if(newVersionRange.intersect(oldVersionRange) != null)
					error = format("%s is explicitly mapped more than once but with differnet configurations", id);
				else
					error = format(
							"%s is explicitly mapped more than once using non-overlapping version ranges %s and %s",
							id, newVersionRange, oldVersionRange);
				errors.add(error);
				LogUtils.error(error);
			}
			return;
		}

		if(isExplicit) {
			LogUtils.debug("%s/%s excluded since version %s is explicitly mapped", id, oldVersionRange, newVersionRange);
			builder.addMappingExclusion(old.repository, old.requirement, rc);
			explicit.add(id);
			return;
		}

		// we assume that non-explicitly mapped IUs have trivial version range (min=max)
		Version newVersionMax = newVersionRange.getMaximum();
		Version oldVersionMax = oldVersionRange.getMaximum();

		int cmp = newVersionMax.compareTo(oldVersionMax);
		if(cmp < 0) {
			// The previous version was higher
			//
			builder.addMappingExclusion(mr, rc, old.requirement);
			LogUtils.debug("%s/%s excluded since a higher version (%s) was found", id, newVersionMax, oldVersionMax);

			// Reinstate the old one
			requirements.put(id, old);
		}
		else {
			builder.addMappingExclusion(old.repository, old.requirement, rc);
			LogUtils.debug("%s/%s excluded since a higher version (%s) was found", id, oldVersionMax, newVersionMax);
		}
	}
}
