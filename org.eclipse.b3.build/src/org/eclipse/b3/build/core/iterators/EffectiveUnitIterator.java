/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.core.iterators;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.b3.backend.core.iterators.ParentContextIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;

/**
 * Iterates over the effective "horizon" of build units (advised units have been supplanted).
 * 
 */
public class EffectiveUnitIterator implements Iterator<BuildUnit> {

	public static class UnitProxies extends EffectiveUnitIterator {
		public UnitProxies(BExecutionContext ctx) {
			super(ctx);
		}

		@Override
		public BuildUnit next() {
			BuildUnit u = super.next();
			if(Proxy.isProxyClass(u.getClass()))
				return u;
			return BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getProxy();
		}
	}

	private Map<Class<? extends BuildUnit>, BuildUnit> unitStore = new HashMap<Class<? extends BuildUnit>, BuildUnit>();

	private Iterator<BuildUnit> itor;

	public EffectiveUnitIterator(BExecutionContext ctx) {
		ParentContextIterator pitor = new ParentContextIterator(ctx, BContext.class);
		if(pitor.hasNext())
			collectUnits(pitor.next(), pitor);
		itor = unitStore.values().iterator();
	}

	public boolean hasNext() {
		return itor.hasNext();
	}

	public Iterator<BuildUnit> iterator() {
		return itor;
	}

	public BuildUnit next() {
		return itor.next();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	private void collectUnits(BExecutionContext ctx, Iterator<BExecutionContext> pitor) {
		if(pitor.hasNext())
			collectUnits(pitor.next(), pitor);
		Map<Object, Object> m = ctx.getMapOfThings(BuildUnit.class);
		// unitStore.putAll(((BuildContextImpl) ctx).getBuildUnitStore());
		for(Entry<Object, Object> entry : m.entrySet())
			unitStore.put((Class<? extends BuildUnit>) entry.getKey(), (BuildUnit) entry.getValue());
	}
}
