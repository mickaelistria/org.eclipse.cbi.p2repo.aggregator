/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.IAggregatorConstants;
import org.eclipse.b3.aggregator.InstallableUnitType;
import org.eclipse.b3.aggregator.Status;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.aggregator.p2.InstallableUnit;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.VersionedId;
import org.eclipse.equinox.p2.metadata.MetadataFactory.InstallableUnitDescription;

/**
 * @author Karel Brezina
 * 
 */
public class InstallableUnitUtils {
	private static final Pattern proxyFragmentPattern = Pattern.compile("^//@metadataRepository/@installableUnits\\[id='([^']*)',version='([^']*)'\\]$");

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

	/**
	 * Obtains the name and version information either from the proxy URI fragment or from attributes. So, it works for
	 * both genuine instance or proxy.
	 */
	public static VersionedId getVersionedName(InstallableUnit iu) {
		if(((EObject) iu).eIsProxy())
			return getVersionedNameFromProxy(iu);
		else
			return new VersionedId(iu.getId(), iu.getVersion());
	}

	/**
	 * Obtains the name and version information from the proxy URI fragment
	 */
	public static VersionedId getVersionedNameFromProxy(InstallableUnit iu) {
		return getVersionedNameFromProxy((InternalEObject) iu);
	}

	// needed for dynamic EMF
	public static VersionedId getVersionedNameFromProxy(InternalEObject iu) {
		URI uri = iu.eProxyURI();
		if(uri == null)
			return null;

		String frag = uri.fragment();
		if(frag == null)
			return null;

		Matcher m = proxyFragmentPattern.matcher(frag);
		try {
			return m.matches()
					? new VersionedId(URLDecoder.decode(m.group(1), "UTF-8"), m.group(2))
					: null;
		}
		catch(UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
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
