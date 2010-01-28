package org.eclipse.b3.build.core;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class B3EngineAdapterFactory extends AdapterFactoryImpl {

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		if(type == ResolutionInfoAdapter.class)
			return new ResolutionInfoAdapter();
		return null;
	}
	@Override
	public boolean isFactoryForType(Object type) {
		if(type == ResolutionInfoAdapter.class)
			return true;
		return false;
	}
	/**
	 * Typesafe variant of adapt
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(Notifier target,  Class<T> type) {
		return type.cast(super.adapt(target, type));
	}
}
