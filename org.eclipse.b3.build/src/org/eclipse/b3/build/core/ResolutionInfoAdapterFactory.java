package org.eclipse.b3.build.core;

import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class ResolutionInfoAdapterFactory extends AdapterFactoryImpl {
	public static ResolutionInfoAdapterFactory eINSTANCE = new ResolutionInfoAdapterFactory();

	public ResolutionInfoAdapter adapt(BuildUnit target) {
		return adapt(target, ResolutionInfoAdapter.class);
	}

	/**
	 * Type safe variant of adapt
	 * 
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(BuildUnit target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	public ResolutionInfoAdapter adapt(RequiredCapability target) {
		return adapt(target, ResolutionInfoAdapter.class);
	}

	public <T> T adapt(RequiredCapability target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new ResolutionInfoAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == ResolutionInfoAdapter.class;
	}
}
