/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 */
package org.eclipse.b3.aggregator.p2.provider;

import org.eclipse.b3.aggregator.util.CapabilityNamespaceImageProvider;
import org.eclipse.b3.p2.RequiredCapability;
import org.eclipse.emf.common.notify.AdapterFactory;

public class RequiredCapabilityItemProvider extends org.eclipse.b3.p2.provider.RequiredCapabilityItemProvider {
	public RequiredCapabilityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		RequiredCapability rc = (RequiredCapability) object;

		Object image = CapabilityNamespaceImageProvider.getImage(rc.getNamespace());
		if(image == null)
			image = getResourceLocator().getImage("full/obj16/RequiredCapability");

		return overlayImage(object, image);
	}
}
