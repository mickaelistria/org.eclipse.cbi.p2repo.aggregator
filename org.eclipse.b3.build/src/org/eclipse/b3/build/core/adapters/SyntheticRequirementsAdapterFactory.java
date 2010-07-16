package org.eclipse.b3.build.core.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class SyntheticRequirementsAdapterFactory extends AdapterFactoryImpl {
	public static SyntheticRequirementsAdapterFactory eINSTANCE = new SyntheticRequirementsAdapterFactory();

	public SyntheticRequirementsAdapter adapt(Notifier target) {
		return adapt(target, SyntheticRequirementsAdapter.class);
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
		return new SyntheticRequirementsAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == SyntheticRequirementsAdapter.class;
	}
}
