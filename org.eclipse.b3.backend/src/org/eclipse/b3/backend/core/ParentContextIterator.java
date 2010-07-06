package org.eclipse.b3.backend.core;

import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Iterates over contexts, the first context returned is the context passed in as start to the constructor.
 * If the context to return should be (the possibly null) parent context, pass the parent as starting context.
 * 
 */
public class ParentContextIterator implements Iterator<BExecutionContext> {

	private BExecutionContext current;

	private Class<? extends BExecutionContext> limit;

	public ParentContextIterator(BExecutionContext start) {
		current = start;
		limit = BExecutionContext.class;
	}

	public ParentContextIterator(BExecutionContext start, Class<? extends BExecutionContext> limit) {
		current = start;
		this.limit = limit;
		if(current != null && !limit.isAssignableFrom(current.getClass()))
			next();
	}

	public boolean hasNext() {
		return current != null;
	}

	public BExecutionContext next() {
		BExecutionContext result = current;
		if(current != null)
			do {
				current = current.getParentContext();
			} while(current != null && !limit.isAssignableFrom(current.getClass()));
		return result;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
