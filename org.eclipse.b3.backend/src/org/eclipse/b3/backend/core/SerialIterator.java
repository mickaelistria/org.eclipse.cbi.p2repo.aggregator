package org.eclipse.b3.backend.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SerialIterator<E> implements Iterator<E> {

	List<Iterator<E>> iterators = new ArrayList<Iterator<E>>();
	int index = 0;
	public SerialIterator() {
		
	}
	public SerialIterator (Iterator<E> itor) {
		iterators.add(itor);
	}
	public void addIterator(Iterator<E> itor) {
		iterators.add(itor);
	}
	public boolean hasNext() {
		while(index < iterators.size() && !iterators.get(index).hasNext())
			index++;
		return index < iterators.size();
	}

	public E next() {
		return iterators.get(index).next();
	}

	public void remove() {
		iterators.get(index).remove();
	}

}
