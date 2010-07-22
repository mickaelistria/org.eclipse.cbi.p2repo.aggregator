/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.core.adapters;

import java.lang.reflect.Type;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * The resolution info adapter associates an instance of ResolutionInfo with a (weak) key.
 * The intended use is that a resolver associates information about its resolution progress.
 */
public class TypeAdapter extends AdapterImpl {
	WeakHashMap<Object, Type> associatedInfo = new WeakHashMap<Object, Type>();

	public Type getAssociatedInfo(Object key) {
		return associatedInfo.get(key);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == TypeAdapter.class;
	}

	public void setAssociatedInfo(Object key, Type t) {
		associatedInfo.put(key, t);
	}
}
