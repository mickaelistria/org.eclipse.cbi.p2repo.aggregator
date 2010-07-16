package org.eclipse.b3.build.core.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class ContextAdapterFactory extends AdapterFactoryImpl {
	public static ContextAdapterFactory eINSTANCE = new ContextAdapterFactory();

	public ContextAdapter adapt(Notifier target) {
		return adapt(target, ContextAdapter.class);
	}

	/**
	 * Type safe variant of adapt
	 * 
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(Notifier target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new ContextAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == ContextAdapter.class;
	}
}
