package org.eclipse.b3.backend.core;

import java.util.Iterator;


public abstract class AbstractSequence<T,S> implements Iterable<S>{

	protected boolean fromInclusive;
	protected boolean toInclusive;
	protected boolean ascending;

	public abstract Iterator<S> iterator();
	public abstract T step(S step);

	@SuppressWarnings("unchecked")
	public T includeFrom(Boolean flag) {
		this.fromInclusive = flag.booleanValue();
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T includeTo(Boolean flag) {
		this.toInclusive = flag.booleanValue();
		return (T) this;
	}

}
