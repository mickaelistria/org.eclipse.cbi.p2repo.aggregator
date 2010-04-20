package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.BuildUnit;
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
