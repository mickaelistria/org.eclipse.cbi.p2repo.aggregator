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

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.emf.common.notify.Notification;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification msg) {
		int featureId = msg.getFeatureID(BParameterDeclaration.class);
		if(featureId == B3backendPackage.BPARAMETER_DECLARATION__TYPE)
			associatedInfo.clear(); // brutal

		// TODO Auto-generated method stub
		super.notifyChanged(msg);
	}

	public void setAssociatedInfo(Object key, Type t) {
		associatedInfo.put(key, t);
	}
}
