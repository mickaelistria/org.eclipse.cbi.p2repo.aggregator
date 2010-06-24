package org.eclipse.b3.build.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.ParentContextIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.BuildContext;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.impl.BuildContextImpl;

/**
 * Iterates over the effective "horizon" of build units (advised units have been supplanted).
 * 
 */
public class EffectiveUnitIterator implements Iterator<BuildUnit>, Iterable<BuildUnit> {

	private Map<Class<? extends BuildUnit>, BuildUnit> unitStore = new HashMap<Class<? extends BuildUnit>, BuildUnit>();

	private Iterator<BuildUnit> itor;

	public EffectiveUnitIterator(BExecutionContext ctx) {
		ParentContextIterator pitor = new ParentContextIterator(ctx, BuildContext.class);
		if(pitor.hasNext())
			collectUnits((BuildContext) pitor.next(), pitor);
		itor = unitStore.values().iterator();
	}

	private void collectUnits(BuildContext ctx, Iterator<BExecutionContext> pitor) {
		if(pitor.hasNext())
			collectUnits((BuildContext) pitor.next(), pitor);
		unitStore.putAll(((BuildContextImpl) ctx).getBuildUnitStore());
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

}
