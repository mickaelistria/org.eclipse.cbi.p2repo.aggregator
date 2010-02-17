package org.eclipse.b3.build.core;

import java.util.Iterator;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathVector;

public class EffectivePathVectorIterator implements Iterator<PathVector> {
	private Iterator<PathVector> itor;
	
	public EffectivePathVectorIterator(BExecutionContext ctx, PathGroup pathGroup) throws Throwable {
		if(pathGroup == null) {
			itor = SingletonIterator.nullIterator();
			return;
		}
		SerialIterator<PathVector> sitor = new SerialIterator<PathVector>();
		for(ConditionalPathVector cpv : pathGroup.getPathVectors())
			sitor.addIterator(new EffectivePathVectorIterator(ctx, cpv));
		itor = sitor;
	}
	public EffectivePathVectorIterator(BExecutionContext ctx, ConditionalPathVector cpv) throws  Throwable {
		if(cpv != null && (cpv.getCondExpr() == null || cpv.getCondExpr().evaluate(ctx) != Boolean.FALSE))
			itor = cpv.getPathVectors().iterator();
		else
			itor = SingletonIterator.nullIterator(); // skip if condition is false
	}
	public boolean hasNext() {
		return itor.hasNext();
	}

	public PathVector next() {
		return itor.next();
	}

	public void remove() {
		itor.remove();
	}

}
