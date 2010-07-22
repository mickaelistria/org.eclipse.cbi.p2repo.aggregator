/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.core.adapters;

import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.internal.BuildUnitUtils;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * The proxy adapter is used to obtain the "instance interface" of a unit, and a proxy that implements this
 * interface, and all interfaces declared by the unit.
 * Obtain the adapter via the {@link BuildUnitProxyAdapterFactory#adapt(org.eclipse.emf.common.notify.Notifier, Class) }
 * 
 */
public class BuildUnitProxyAdapter extends AdapterImpl {
	Class<? extends BuildUnit> iface = null;

	BuildUnit proxy = null;

	public BuildUnitProxyAdapter(BuildUnit unit) {
		iface = BuildUnitUtils.getBuildUnitInterface(unit);
		proxy = BuildUnitUtils.createBuildUnitProxy(unit);
	}

	public Class<? extends BuildUnit> getIface() {
		return iface;
	}

	public BuildUnit getProxy() {
		return proxy;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == BuildUnitProxyAdapter.class;
	}
}
