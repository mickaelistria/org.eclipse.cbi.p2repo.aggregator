/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.engine.maven;

import java.util.Map;

import org.eclipse.equinox.internal.provisional.p2.metadata.IArtifactKey;
import org.eclipse.equinox.internal.provisional.p2.metadata.ICopyright;
import org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.internal.provisional.p2.metadata.ILicense;
import org.eclipse.equinox.internal.provisional.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.internal.provisional.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointData;
import org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointType;
import org.eclipse.equinox.internal.provisional.p2.metadata.IUpdateDescriptor;
import org.eclipse.equinox.internal.provisional.p2.metadata.Version;

/**
 * @author Filip Hrbek (filip.hrbek@cloudsmith.com)
 * 
 */
public class InstallableUnitOverrider implements IInstallableUnit {
	private IInstallableUnit installableUnit;

	private String id;

	private IRequiredCapability[] requiredCapabilities;

	private IArtifactKey[] artifacts;

	public InstallableUnitOverrider(IInstallableUnit iu) {
		installableUnit = iu;
	}

	@SuppressWarnings("unchecked")
	public int compareTo(Object o) {
		return installableUnit.compareTo(o);
	}

	public IArtifactKey[] getArtifacts() {
		if(artifacts != null)
			return artifacts;

		return installableUnit.getArtifacts();
	}

	public ICopyright getCopyright() {
		return installableUnit.getCopyright();
	}

	public String getFilter() {
		return installableUnit.getFilter();
	}

	public IInstallableUnitFragment[] getFragments() {
		return installableUnit.getFragments();
	}

	public String getId() {
		if(id != null)
			return id;

		return installableUnit.getId();
	}

	public ILicense getLicense() {
		return installableUnit.getLicense();
	}

	public IRequiredCapability[] getMetaRequiredCapabilities() {
		return installableUnit.getMetaRequiredCapabilities();
	}

	@SuppressWarnings("rawtypes")
	public Map getProperties() {
		return installableUnit.getProperties();
	}

	public String getProperty(String key) {
		return installableUnit.getProperty(key);
	}

	public IProvidedCapability[] getProvidedCapabilities() {
		return installableUnit.getProvidedCapabilities();
	}

	public IRequiredCapability[] getRequiredCapabilities() {
		if(requiredCapabilities != null)
			return requiredCapabilities;

		return installableUnit.getRequiredCapabilities();
	}

	public ITouchpointData[] getTouchpointData() {
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

	public boolean isFragment() {
		return installableUnit.isFragment();
	}

	public boolean isResolved() {
		return installableUnit.isResolved();
	}

	public boolean isSingleton() {
		return installableUnit.isSingleton();
	}

	public void overrideArtifacts(IArtifactKey[] artifacts) {
		this.artifacts = artifacts;
	}

	public void overrideId(String id) {
		this.id = id;
	}

	public void overrideRequiredCapabilities(IRequiredCapability[] requiredCapabilities) {
		this.requiredCapabilities = requiredCapabilities;
	}

	public boolean satisfies(IRequiredCapability candidate) {
		return installableUnit.satisfies(candidate);
	}

	public IInstallableUnit unresolved() {
		return installableUnit.unresolved();
	}

}
