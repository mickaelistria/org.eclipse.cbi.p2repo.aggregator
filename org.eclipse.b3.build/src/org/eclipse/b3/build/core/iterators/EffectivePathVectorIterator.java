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

import java.util.Iterator;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.ConditionalPathVector;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.PathVector;

public class EffectivePathVectorIterator implements Iterator<PathVector> {

	private Iterator<PathVector> itor;

	public EffectivePathVectorIterator(BExecutionContext ctx, ConditionalPathVector cpv) throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		if(cpv != null && (cpv.getCondExpr() == null || evaluator.doEvaluate(cpv.getCondExpr(), ctx) != Boolean.FALSE))
			itor = cpv.getPathVectors().iterator();
		else
			itor = SingletonIterator.nullIterator(); // skip if condition is false
	}

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
