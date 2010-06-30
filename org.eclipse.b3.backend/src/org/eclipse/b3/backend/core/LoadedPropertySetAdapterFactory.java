package org.eclipse.b3.backend.core;

import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class LoadedPropertySetAdapterFactory extends AdapterFactoryImpl {
	public static LoadedPropertySetAdapterFactory eINSTANCE = new LoadedPropertySetAdapterFactory();

	public LoadedPropertySetAdapter adapt(BPropertySet target) {
		return adapt(target, LoadedPropertySetAdapter.class);
	}

	/**
	 * Type safe variant of adapt
	 * 
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(BPropertySet target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new LoadedPropertySetAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == LoadedPropertySetAdapter.class;
	}
}
