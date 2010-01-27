/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/
package org.eclipse.b3.aggregator.engine.maven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.engine.maven.pom.Build;
import org.eclipse.b3.aggregator.engine.maven.pom.CiManagement;
import org.eclipse.b3.aggregator.engine.maven.pom.Contributor;
import org.eclipse.b3.aggregator.engine.maven.pom.ContributorsType;
import org.eclipse.b3.aggregator.engine.maven.pom.DependenciesType;
import org.eclipse.b3.aggregator.engine.maven.pom.Dependency;
import org.eclipse.b3.aggregator.engine.maven.pom.DependencyManagement;
import org.eclipse.b3.aggregator.engine.maven.pom.Developer;
import org.eclipse.b3.aggregator.engine.maven.pom.DevelopersType;
import org.eclipse.b3.aggregator.engine.maven.pom.DistributionManagement;
import org.eclipse.b3.aggregator.engine.maven.pom.IssueManagement;
import org.eclipse.b3.aggregator.engine.maven.pom.License;
import org.eclipse.b3.aggregator.engine.maven.pom.LicensesType;
import org.eclipse.b3.aggregator.engine.maven.pom.MailingList;
import org.eclipse.b3.aggregator.engine.maven.pom.MailingListsType;
import org.eclipse.b3.aggregator.engine.maven.pom.ModulesType;
import org.eclipse.b3.aggregator.engine.maven.pom.Organization;
import org.eclipse.b3.aggregator.engine.maven.pom.Parent;
import org.eclipse.b3.aggregator.engine.maven.pom.PluginRepositoriesType;
import org.eclipse.b3.aggregator.engine.maven.pom.PomPackage;
import org.eclipse.b3.aggregator.engine.maven.pom.Prerequisites;
import org.eclipse.b3.aggregator.engine.maven.pom.Profile;
import org.eclipse.b3.aggregator.engine.maven.pom.ProfilesType;
import org.eclipse.b3.aggregator.engine.maven.pom.PropertiesType;
import org.eclipse.b3.aggregator.engine.maven.pom.Reporting;
import org.eclipse.b3.aggregator.engine.maven.pom.ReportsType;
import org.eclipse.b3.aggregator.engine.maven.pom.RepositoriesType;
import org.eclipse.b3.aggregator.engine.maven.pom.Repository;
import org.eclipse.b3.aggregator.engine.maven.pom.Scm;
import org.eclipse.b3.aggregator.engine.maven.pom.impl.ModelImpl;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl;

/**
 * @author Filip Hrbek (filip.hrbek@cloudsmith.com)
 * 
 */
public class ResolvedModel extends ResolvedModelBase {
	private String repoRoot;

	private ModelImpl original;

	private Map<String, String> propertyMap;

	private String artifactId;

	private boolean artifactIdResolved;

	private Build build;

	private boolean buildResolved;

	private CiManagement ciManagement;

	private boolean ciManagementResolved;

	private ContributorsType contributors;

	private boolean contributorsResolved;

	private DependenciesType dependencies;

	private boolean dependenciesResolved;

	private DependencyManagement dependencyManagement;

	private boolean dependencyManagementResolved;

	private String description;

	private boolean descriptionResolved;

	private DevelopersType developers;

	private boolean developersResolved;

	private DistributionManagement distributionManagement;

	private boolean distributionManagementResolved;

	private String groupId;

	private boolean groupIdResolved;

	private String inceptionYear;

	private boolean inceptionYearResolved;

	private IssueManagement issueManagement;

	private boolean issueManagementResolved;

	private LicensesType licenses;

	private boolean licensesResolved;

	private MailingListsType mailingLists;

	private boolean mailingListsResolved;

	private String modelVersion;

	private boolean modelVersionResolved;

	private ModulesType modules;

	private boolean modulesResolved;

	private String name;

	private boolean nameResolved;

	private Organization organization;

	private boolean organizationResolved;

	private String packaging;

	private boolean packagingResolved;

	private PluginRepositoriesType pluginRepositories;

	private boolean pluginRepositoriesResolved;

	private Prerequisites prerequisites;

	private boolean prerequisitesResolved;

	private ProfilesType profiles;

	private boolean profilesResolved;

	private Reporting reporting;

	private boolean reportingResolved;

	private RepositoriesType repositories;

	private boolean repositoriesResolved;

	private Scm scm;

	private boolean scmResolved;

	private String url;

	private boolean urlResolved;

	private String version;

	private boolean versionResolved;

	public ResolvedModel(String repoRoot, ModelImpl original) {
		this.repoRoot = repoRoot;
		this.original = original;

		propertyMap = null;
	}

	public String getArtifactId() {
		if(!artifactIdResolved) {
			artifactIdResolved = true;
			artifactId = resolveFeature(PomPackage.MODEL__ARTIFACT_ID);
		}

		return artifactId;
	}

	public Build getBuild() {
		if(!buildResolved) {
			buildResolved = true;
			build = resolveFeature(PomPackage.MODEL__BUILD);
		}

		return build;
	}

	public CiManagement getCiManagement() {
		if(!ciManagementResolved) {
			ciManagementResolved = true;
			ciManagement = resolveFeature(PomPackage.MODEL__CI_MANAGEMENT);
		}

		return ciManagement;
	}

	public ContributorsType getContributors() {
		if(!contributorsResolved) {
			contributorsResolved = true;
			contributors = resolveWrappedListFeature(PomPackage.MODEL__CONTRIBUTORS,
					PomPackage.CONTRIBUTORS_TYPE__CONTRIBUTOR, ContributorsType.class, Contributor.class);
		}

		return contributors;
	}

	public DependenciesType getDependencies() {
		if(!dependenciesResolved) {
			dependenciesResolved = true;
			dependencies = resolveWrappedListFeature(PomPackage.MODEL__DEPENDENCIES,
					PomPackage.DEPENDENCIES_TYPE__DEPENDENCY, DependenciesType.class, Dependency.class);
		}

		return dependencies;
	}

	public DependencyManagement getDependencyManagement() {
		if(!dependencyManagementResolved) {
			dependencyManagementResolved = true;
			dependencyManagement = resolveFeature(PomPackage.MODEL__DEPENDENCY_MANAGEMENT);
		}

		return dependencyManagement;
	}

	public String getDescription() {
		if(!descriptionResolved) {
			descriptionResolved = true;
			description = resolveFeature(PomPackage.MODEL__DESCRIPTION);
		}

		return description;
	}

	public DevelopersType getDevelopers() {
		if(!developersResolved) {
			developersResolved = true;
			developers = resolveWrappedListFeature(PomPackage.MODEL__DEVELOPERS, PomPackage.DEVELOPERS_TYPE__DEVELOPER,
					DevelopersType.class, Developer.class);
		}

		return developers;
	}

	public DistributionManagement getDistributionManagement() {
		if(!distributionManagementResolved) {
			distributionManagementResolved = true;
			distributionManagement = resolveFeature(PomPackage.MODEL__DISTRIBUTION_MANAGEMENT);
		}

		return distributionManagement;
	}

	public String getGroupId() {
		if(!groupIdResolved) {
			groupIdResolved = true;
			groupId = resolveFeature(PomPackage.MODEL__GROUP_ID);
		}

		return groupId;
	}

	public String getInceptionYear() {
		if(!inceptionYearResolved) {
			inceptionYearResolved = true;
			inceptionYear = resolveFeature(PomPackage.MODEL__INCEPTION_YEAR);
		}

		return inceptionYear;
	}

	public IssueManagement getIssueManagement() {
		if(!issueManagementResolved) {
			issueManagementResolved = true;
			issueManagement = resolveFeature(PomPackage.MODEL__ISSUE_MANAGEMENT);
		}

		return issueManagement;
	}

	public LicensesType getLicenses() {
		if(!licensesResolved) {
			licensesResolved = true;
			licenses = resolveWrappedListFeature(PomPackage.MODEL__LICENSES, PomPackage.LICENSES_TYPE__LICENSE,
					LicensesType.class, License.class);
		}

		return licenses;
	}

	public MailingListsType getMailingLists() {
		if(!mailingListsResolved) {
			mailingListsResolved = true;
			mailingLists = resolveWrappedListFeature(PomPackage.MODEL__MAILING_LISTS,
					PomPackage.MAILING_LISTS_TYPE__MAILING_LIST, MailingListsType.class, MailingList.class);
		}

		return mailingLists;
	}

	public String getModelVersion() {
		if(!modelVersionResolved) {
			modelVersionResolved = true;
			modelVersion = resolveFeature(PomPackage.MODEL__MODEL_VERSION);
		}

		return modelVersion;
	}

	public ModulesType getModules() {
		if(!modulesResolved) {
			modulesResolved = true;
			modules = resolveWrappedListFeature(PomPackage.MODEL__MODULES, PomPackage.MODULES_TYPE__MODULE,
					ModulesType.class, String.class);
		}

		return modules;
	}

	public String getName() {
		if(!nameResolved) {
			nameResolved = true;
			name = resolveFeature(PomPackage.MODEL__NAME);
		}

		return name;
	}

	public Organization getOrganization() {
		if(!organizationResolved) {
			organizationResolved = true;
			organization = resolveFeature(PomPackage.MODEL__ORGANIZATION);
		}

		return organization;
	}

	public String getPackaging() {
		if(!packagingResolved) {
			packagingResolved = true;
			packaging = resolveFeature(PomPackage.MODEL__PACKAGING);
		}

		return packaging;
	}

	public Parent getParent() {
		return original.getParent();
	}

	public PluginRepositoriesType getPluginRepositories() {
		if(!pluginRepositoriesResolved) {
			pluginRepositoriesResolved = true;
			pluginRepositories = resolveWrappedListFeature(PomPackage.MODEL__PLUGIN_REPOSITORIES,
					PomPackage.PLUGIN_REPOSITORIES_TYPE__PLUGIN_REPOSITORY, PluginRepositoriesType.class,
					Repository.class);
		}

		return pluginRepositories;
	}

	public Prerequisites getPrerequisites() {
		if(!prerequisitesResolved) {
			prerequisitesResolved = true;
			prerequisites = resolveFeature(PomPackage.MODEL__PREREQUISITES);
		}

		return prerequisites;
	}

	public ProfilesType getProfiles() {
		if(!profilesResolved) {
			profilesResolved = true;
			profiles = resolveWrappedListFeature(PomPackage.MODEL__PROFILES, PomPackage.PROFILES_TYPE__PROFILE,
					ProfilesType.class, Profile.class);
		}

		return profiles;
	}

	public PropertiesType getProperties() {
		throw new UnsupportedOperationException("Use POM.getFullPropertyMap() instead");
	}

	public Map<String, String> getPropertyMap() throws CoreException {
		if(propertyMap == null) {
			propertyMap = new HashMap<String, String>();

			String version = getVersion();
			propertyMap.put("version", version);
			propertyMap.put("pom.version", version);
			propertyMap.put("project.version", version);

			String name = getName();
			propertyMap.put("pom.name", name);
			propertyMap.put("project.name", name);

			propertyMap.putAll(getPropertiesAsMap());

			Parent parent = getParent();
			if(parent != null) {
				propertyMap.put("parent.version", parent.getVersion());

				ResolvedModel parentModel = POM.getPOM(repoRoot, parent.getGroupId(), parent.getArtifactId(),
						parent.getVersion()).getResolvedProject();

				for(Map.Entry<String, String> entry : parentModel.getPropertyMap().entrySet())
					if(!propertyMap.containsKey(entry.getKey()))
						propertyMap.put(entry.getKey(), entry.getValue());
			}
		}

		return propertyMap;
	}

	public Reporting getReporting() {
		if(!reportingResolved) {
			reportingResolved = true;
			reporting = resolveFeature(PomPackage.MODEL__REPORTING);
		}

		return reporting;
	}

	public ReportsType getReports() {
		throw new UnsupportedOperationException("reports resolution is not supported in this version");
	}

	public RepositoriesType getRepositories() {
		if(!repositoriesResolved) {
			repositoriesResolved = true;
			repositories = resolveWrappedListFeature(PomPackage.MODEL__REPOSITORIES,
					PomPackage.REPOSITORIES_TYPE__REPOSITORY, RepositoriesType.class, Repository.class);
		}

		return repositories;
	}

	public Scm getScm() {
		if(!scmResolved) {
			scmResolved = true;
			scm = resolveFeature(PomPackage.MODEL__SCM);
		}

		return scm;
	}

	public String getUrl() {
		if(!urlResolved) {
			urlResolved = true;
			url = resolveFeature(PomPackage.MODEL__URL);
		}

		return url;
	}

	public String getVersion() {
		if(!versionResolved) {
			versionResolved = true;
			version = resolveFeature(PomPackage.MODEL__VERSION);
		}

		return version;
	}

	public boolean isSetPackaging() {
		return getPackaging() != null;
	}

	private Map<String, String> getPropertiesAsMap() throws CoreException {
		Map<String, String> propertyMap = new HashMap<String, String>();
		PropertiesType propertiesType = original.getProperties();
		if(propertiesType != null) {
			FeatureMap properties = original.getProperties().getAny();
			for(int i = properties.size() - 1; i >= 0; i--) {
				Entry entry = properties.get(i);
				FeatureMap valueMap = ((AnyTypeImpl) entry.getValue()).getMixed();
				String value;
				switch(valueMap.size()) {
				case 0:
					value = null;
					break;
				case 1:
					value = (String) ((AnyTypeImpl) entry.getValue()).getMixed().getValue(0);
					break;
				default:
					throw ExceptionUtils.fromMessage("Unexpected property map size: %d", valueMap.size());
				}

				propertyMap.put(entry.getEStructuralFeature().getName(), value);
			}
		}

		return propertyMap;
	}

	@SuppressWarnings("unchecked")
	private <T> T resolveFeature(int featureID) {
		try {
			T result = (T) original.eGet(featureID, false, false);
			if(result instanceof String)
				result = (T) StringUtils.trimmedOrNull((String) result);

			if(result == null) {
				Parent parent = getParent();
				if(parent != null)
					result = (T) POM.getPOM(repoRoot, parent.getGroupId(), parent.getArtifactId(), parent.getVersion()).getResolvedProject().resolveFeature(
							featureID);
			}

			if(result instanceof String)
				result = (T) POM.expandProperties((String) result, getPropertyMap());
			return result;
		}
		catch(CoreException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private <T, L> T resolveWrappedListFeature(int wrapperID, int featureID, Class<T> wrapperClass,
			Class<L> featureClass) {
		try {
			ModelImpl model = original;
			T result = wrapperClass.newInstance();
			List<L> list = new EObjectContainmentEList<L>(featureClass, (InternalEObject) result, featureID);
			((EObjectImpl) result).eSet(wrapperID, list);
			while(model != null) {
				T semiResult = (T) model.eGet(featureID, false, false);
				if(semiResult != null) {
					List<L> semiList = (List<L>) ((EObjectImpl) semiResult).eGet(wrapperID, false, false);
					if(semiList != null)
						list.addAll(semiList);
				}
				Parent parent = model.getParent();
				if(parent != null)
					model = (ModelImpl) POM.getPOM(repoRoot, parent.getGroupId(), parent.getArtifactId(),
							parent.getVersion()).getProject();
				else
					model = null;
			}

			return result;
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
