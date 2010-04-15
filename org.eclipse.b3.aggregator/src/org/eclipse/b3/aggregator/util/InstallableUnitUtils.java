/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.IAggregatorConstants;
import org.eclipse.b3.aggregator.InstallableUnitType;
import org.eclipse.b3.aggregator.Status;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.p2.InstallableUnit;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.MetadataFactory.InstallableUnitDescription;

/**
 * @author Karel Brezina
 * 
 */
public class InstallableUnitUtils {
	public static Status getStatus(InstallableUnit iu) {
		synchronized(iu) {
			return StringUtils.trimmedOrNull(iu.getId()) != null
					? AggregatorFactory.eINSTANCE.createStatus(StatusCode.OK)
					: AggregatorFactory.eINSTANCE.createStatus(StatusCode.BROKEN);
		}
	}

	public static InstallableUnitType getType(IInstallableUnit iu) {
		if("true".equalsIgnoreCase(iu.getProperty(InstallableUnitDescription.PROP_TYPE_CATEGORY)))
			return InstallableUnitType.CATEGORY;
		if(iu.getId().endsWith(IAggregatorConstants.FEATURE_SUFFIX))
			return InstallableUnitType.FEATURE;
		if("true".equalsIgnoreCase(iu.getProperty(InstallableUnitDescription.PROP_TYPE_GROUP)))
			return InstallableUnitType.PRODUCT;
		if(isOSGiFragment(iu))
			return InstallableUnitType.FRAGMENT;
		if(isOSGiBundle(iu))
			return InstallableUnitType.BUNDLE;
		return InstallableUnitType.OTHER;
	}

	private static boolean isOSGiBundle(IInstallableUnit iu) {
		for(IProvidedCapability rc : iu.getProvidedCapabilities())
			if(IAggregatorConstants.NAMESPACE_TYPE.equals(rc.getNamespace())
					&& (IAggregatorConstants.CAPABILITY_TYPE_BUNDLE.equals(rc.getName()) || IAggregatorConstants.CAPABILITY_TYPE_SOURCE.equals(rc.getName())))
				return true;
		return false;
	}

	private static boolean isOSGiFragment(IInstallableUnit iu) {
		for(IProvidedCapability rc : iu.getProvidedCapabilities())
			if(IAggregatorConstants.NAMESPACE_OSGI_FRAGMENT.equals(rc.getNamespace()))
				return true;
		return false;
	}

}
