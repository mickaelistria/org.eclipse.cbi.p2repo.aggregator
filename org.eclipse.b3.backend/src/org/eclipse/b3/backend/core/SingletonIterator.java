package org.eclipse.b3.backend.core;

import java.util.Iterator;

public class SingletonIterator<E> implements Iterator<E> {
	public static <T> SingletonIterator<T> nullIterator() {
		return new SingletonIterator<T>(null);
	}

	private E theNext;

	public SingletonIterator(E object) {
		theNext = object;
	}

	public boolean hasNext() {
		return theNext != null;
	}

	public E next() {
		E result = theNext;
		theNext = null;
		return result;
	}

	public void remove() {
		throw new UnsupportedOperationException("Can not remove from singleton iterator");

	}

}
