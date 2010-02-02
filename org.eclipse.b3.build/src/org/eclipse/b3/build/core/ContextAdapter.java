package org.eclipse.b3.build.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * The context adapter allows association of 0:M BEecutionContext(s) with any EObject.
 * The adapter implements List<BEecutionContext> as a convenience to enable association of more than
 * one context.
 * TODO: Should probably be synchronized
 */
public class ContextAdapter extends AdapterImpl implements List<BExecutionContext>{
	private List<BExecutionContext> contexts = new ArrayList<BExecutionContext>();
	

	@Override
	public boolean isAdapterForType(Object type) {
		return type == ContextAdapter.class;
	}


	public boolean add(BExecutionContext o) {
		return contexts.add(o);
	}


	public void add(int index, BExecutionContext element) {
		contexts.add(index, element);		
	}


	public boolean addAll(Collection<? extends BExecutionContext> c) {
		return contexts.addAll(c);
	}


	public boolean addAll(int index, Collection<? extends BExecutionContext> c) {
		return contexts.addAll(index, c);
	}


	public void clear() {
		contexts.clear();		
	}


	public boolean contains(Object o) {
		return contexts.contains(o);
	}


	public boolean containsAll(Collection<?> c) {
		return contexts.containsAll(c);
	}


	public BExecutionContext get(int index) {
		return contexts.get(index);
	}


	public int indexOf(Object o) {
		return contexts.indexOf(o);
	}


	public boolean isEmpty() {
		return contexts.isEmpty();
	}


	public Iterator<BExecutionContext> iterator() {
		return contexts.iterator();
	}


	public int lastIndexOf(Object o) {
		return contexts.lastIndexOf(o);
	}


	public ListIterator<BExecutionContext> listIterator() {
		return contexts.listIterator();
	}


	public ListIterator<BExecutionContext> listIterator(int index) {
		return contexts.listIterator(index);
	}


	public boolean remove(Object o) {
		return contexts.remove(o);
	}


	public BExecutionContext remove(int index) {
		return contexts.remove(index);
	}


	public boolean removeAll(Collection<?> c) {
		return contexts.removeAll(c);
	}


	public boolean retainAll(Collection<?> c) {
		return contexts.retainAll(c);
	}


	public BExecutionContext set(int index, BExecutionContext element) {
		return contexts.set(index, element);
	}


	public int size() {
		return contexts.size();
	}


	public List<BExecutionContext> subList(int fromIndex, int toIndex) {
		return contexts.subList(fromIndex, toIndex);
	}


	public Object[] toArray() {
		return contexts.toArray();
	}


	public <T> T[] toArray(T[] a) {
		return contexts.toArray(a);
	}
	public void addUnique(BExecutionContext ctx) {
		if(!contains(ctx))
			add(ctx);
	}
}
