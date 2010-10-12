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
	public boolean isFactoryForType(Object type) {
		return type == ResolutionInfoAdapter.class;
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		return new ResolutionInfoAdapter();
	}
}
