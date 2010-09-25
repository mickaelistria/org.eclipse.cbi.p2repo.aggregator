package org.eclipse.b3.backend.core.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

public class TypeAdapterFactory extends AdapterFactoryImpl {
	public static TypeAdapterFactory eINSTANCE = new TypeAdapterFactory();

	public TypeAdapter adapt(EObject target) {
		return adapt(target, TypeAdapter.class);
	}

	/**
	 * Type safe variant of adapt
	 * 
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	public <T> T adapt(EObject target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == TypeAdapter.class;
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new TypeAdapter();
	}
}
