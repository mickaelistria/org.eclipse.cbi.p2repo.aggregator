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

import java.util.List;
import java.util.WeakHashMap;

import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * This adapter allows association of an EList<RequiredCapability> with any EObject.
 */
public class SyntheticRequirementsAdapter extends AdapterImpl {
	WeakHashMap<Object, List<RequiredCapability>> associatedInfo = new WeakHashMap<Object, List<RequiredCapability>>();

	public List<RequiredCapability> getAssociatedInfo(Object key) {
		return associatedInfo.get(key);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == SyntheticRequirementsAdapter.class;
	}

	public void setAssociatedInfo(Object key, List<RequiredCapability> requiredCapabilities) {
		associatedInfo.put(key, requiredCapabilities);
	}
}
