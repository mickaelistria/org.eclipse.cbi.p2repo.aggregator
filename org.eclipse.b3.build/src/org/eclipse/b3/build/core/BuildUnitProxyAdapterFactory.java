package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class BuildUnitProxyAdapterFactory extends AdapterFactoryImpl {
	public static BuildUnitProxyAdapterFactory eINSTANCE = new BuildUnitProxyAdapterFactory();
	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new BuildUnitProxyAdapter((BuildUnit) target);
	}
	@Override
	public boolean isFactoryForType(Object type) {
		return type == BuildUnitProxyAdapter.class;
	}
	/**
	 * Type safe variant of adapt
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(BuildUnit target,  Class<T> type) {
		return type.cast(super.adapt(target, type));
	}
	public BuildUnitProxyAdapter adapt(BuildUnit target) {
		return adapt(target, BuildUnitProxyAdapter.class);
	}
}
