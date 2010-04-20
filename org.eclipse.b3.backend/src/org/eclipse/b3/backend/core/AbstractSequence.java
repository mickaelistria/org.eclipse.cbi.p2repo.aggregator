package org.eclipse.b3.backend.core;

import java.util.Iterator;

public abstract class AbstractSequence<T, S> implements Iterable<S> {

	protected boolean fromInclusive;

	protected boolean toInclusive;

	protected boolean ascending;

	public abstract T includeFrom(Boolean flag);

	public abstract T includeTo(Boolean flag);

	public abstract Iterator<S> iterator();

	public abstract T step(S step);

}
