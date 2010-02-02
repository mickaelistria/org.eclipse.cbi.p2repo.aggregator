package org.eclipse.b3.backend.core;

import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Iterates over contexts, starting with the context passed as start. 
 * For each context, its effective concerns are returned until there are no more effective concerns in any parent
 * context.
 *
 */
public class EffectiveConcernIterator implements Iterator<BConcern> {

	private ParentContextIterator pitor;
	private Iterator<BConcern> citor;
	public EffectiveConcernIterator(BExecutionContext start) {
		pitor = new ParentContextIterator(start);
		citor = null;
		while(pitor.hasNext() && (citor == null || !citor.hasNext())) {
			BExecutionContext ctx = pitor.next();
			citor = ctx.getEffectiveConcerns().iterator();
		}
	}
	public boolean hasNext() {
		return citor != null && citor.hasNext();
	}

	public BConcern next() {
		BConcern result = citor.next();
		// if there are no more in current citor, get the next citor with elements
		if(!citor.hasNext()) {
			citor = null;
			while(pitor.hasNext() && (citor == null || !citor.hasNext())) {
				BExecutionContext ctx = pitor.next();
				citor = ctx.getEffectiveConcerns().iterator();
			}			
		}
		return result;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
