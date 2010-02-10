/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.engine.maven;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.ITouchpointData;
import org.eclipse.equinox.p2.metadata.ITouchpointType;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;
import org.eclipse.equinox.p2.metadata.Version;
import org.osgi.framework.Filter;

/**
 * @author Filip Hrbek (filip.hrbek@cloudsmith.com)
 * 
 */
public class InstallableUnitOverrider implements IInstallableUnit {
	private IInstallableUnit installableUnit;

	private String id;

	private Collection<IRequirement> requirements;

	private Collection<IArtifactKey> artifacts;

	public InstallableUnitOverrider(IInstallableUnit iu) {
		installableUnit = iu;
	}

	public int compareTo(IInstallableUnit other) {
		return installableUnit.compareTo(other);
	}

	public Collection<IArtifactKey> getArtifacts() {
		if(artifacts != null)
			return artifacts;

		return installableUnit.getArtifacts();
	}

	public ICopyright getCopyright() {
		return installableUnit.getCopyright();
	}

	public ICopyright getCopyright(String locale) {
		return installableUnit.getCopyright(locale);
	}

	public Filter getFilter() {
		return installableUnit.getFilter();
	}

	public List<IInstallableUnitFragment> getFragments() {
		return installableUnit.getFragments();
	}

	public String getId() {
		if(id != null)
			return id;

		return installableUnit.getId();
	}

	public Collection<ILicense> getLicenses() {
		return installableUnit.getLicenses();
	}

	public ILicense[] getLicenses(String locale) {
		return installableUnit.getLicenses(locale);
	}

	public Collection<IRequirement> getMetaRequiredCapabilities() {
		return installableUnit.getMetaRequiredCapabilities();
	}

	public Map<String, String> getProperties() {
		return installableUnit.getProperties();
	}

	public String getProperty(String key) {
		return installableUnit.getProperty(key);
	}

	public String getProperty(String key, String locale) {
		return installableUnit.getProperty(key, locale);
	}

	public Collection<IProvidedCapability> getProvidedCapabilities() {
		return installableUnit.getProvidedCapabilities();
	}

	public Collection<IRequirement> getRequiredCapabilities() {
		if(requirements != null)
			return requirements;

		return installableUnit.getRequiredCapabilities();
	}

	public List<ITouchpointData> getTouchpointData() {
		return installableUnit.getTouchpointData();
	}

	public ITouchpointType getTouchpointType() {
		return installableUnit.getTouchpointType();
	}

	public IUpdateDescriptor getUpdateDescriptor() {
		return installableUnit.getUpdateDescriptor();
	}

	public Version getVersion() {
		return installableUnit.getVersion();
	}

	public boolean isResolved() {
		return installableUnit.isResolved();
	}

	public boolean isSingleton() {
		return installableUnit.isSingleton();
	}

	public void overrideArtifacts(Collection<IArtifactKey> artifacts) {
		this.artifacts.clear();
		this.artifacts.addAll(artifacts);
	}

	public void overrideId(String id) {
		this.id = id;
	}

	public void overrideRequirements(Collection<IRequirement> requirements) {
		this.requirements.clear();
		this.requirements.addAll(requirements);
	}

	public boolean satisfies(IRequirement candidate) {
		return installableUnit.satisfies(candidate);
	}

	public IInstallableUnit unresolved() {
		return installableUnit.unresolved();
	}

}
