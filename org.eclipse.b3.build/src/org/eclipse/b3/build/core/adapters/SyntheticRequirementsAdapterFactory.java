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
	public boolean isFactoryForType(Object type) {
		return type == SyntheticRequirementsAdapter.class;
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new SyntheticRequirementsAdapter();
	}
}
