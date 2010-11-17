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
import org.eclipse.b3.backend.inference.ITypeExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * The resolution info adapter associates an instance of ResolutionInfo with a (weak) key.
 * The intended use is that a resolver associates information about its resolution progress.
 */
public class TypeAdapter extends AdapterImpl {
	private static class TypeAdapterData {
		Type t;

		ITypeExpression expr;
	}

	// Default size seems to be 10 slots - which is overkill
	private WeakHashMap<Object, TypeAdapterData> associatedInfo = new WeakHashMap<Object, TypeAdapterData>(3);

	/**
	 * Gets a Type set in the adapter for the given key, or null if no type have been
	 * set.
	 * 
	 * @param key
	 * @return
	 */
	public Type getAssociatedType(Object key) {
		TypeAdapterData adapterData = associatedInfo.get(key);
		return adapterData == null
				? null
				: adapterData.t;
	}

	/**
	 * Gets an ITypeExpression set in the adapter for the given key, or null if no expression have been
	 * set.
	 * 
	 * @param key
	 * @return
	 */
	public ITypeExpression getAssociatedTypeExpression(Object key) {
		TypeAdapterData adapterData = associatedInfo.get(key);
		return adapterData == null
				? null
				: adapterData.expr;
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

		super.notifyChanged(msg);
	}

	/**
	 * Stores a Type in the adapter for given key.
	 * 
	 * @param key
	 * @param t
	 */
	public void setAssociatedType(Object key, Type t) {
		TypeAdapterData adapterData = associatedInfo.get(key);
		if(adapterData == null) {
			adapterData = new TypeAdapterData();
			adapterData.t = t;
			associatedInfo.put(key, adapterData);
		}
		else
			adapterData.t = t;
	}

	/**
	 * Stores a ITypeExpression in the adapter for the given key.
	 * 
	 * @param key
	 * @param expr
	 */
	public void setAssociatedTypeExpression(Object key, ITypeExpression expr) {
		TypeAdapterData adapterData = associatedInfo.get(key);
		if(adapterData == null) {
			adapterData = new TypeAdapterData();
			adapterData.expr = expr;
			associatedInfo.put(key, adapterData);
		}
		else
			adapterData.expr = expr;
	}
}
