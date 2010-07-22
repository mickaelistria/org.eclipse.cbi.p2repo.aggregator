package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchVariableException;
import org.eclipse.b3.backend.core.exceptions.B3VariableRedefinitionException;

/**
 * Facades a ValueMap by only allowing access to a particular set of mapped entries.
 * The set of values can not be extended, but it is possible to read and write already defined
 * values under their mapped names.
 * 
 */
public class ValueMapFacade extends ValueMap {
	private class ListWrapper implements List<Object> {
		private List<Object> wrapped;

		ListWrapper(List<Object> wrapped) {
			this.wrapped = wrapped;
		}

		public void add(int index, Object element) {
			dirty = true;
			wrapped.add(index, element);
		}

		public boolean add(Object o) {
			dirty = true;
			return wrapped.add(o);
		}

		public boolean addAll(Collection<? extends Object> c) {
			dirty = true;
			return wrapped.addAll(c);
		}

		public boolean addAll(int index, Collection<? extends Object> c) {
			dirty = true;
			return wrapped.addAll(index, c);
		}

		public void clear() {
			dirty = true;
			wrapped.clear();
		}

		public boolean contains(Object o) {
			return wrapped.contains(o);
		}

		public boolean containsAll(Collection<?> c) {
			return wrapped.containsAll(c);
		}

		public Object get(int index) {
			return wrapped.get(index);
		}

		public int indexOf(Object o) {
			return wrapped.indexOf(o);
		}

		public boolean isEmpty() {
			return wrapped.isEmpty();
		}

		public Iterator<Object> iterator() {
			return wrapped.iterator();
		}

		public int lastIndexOf(Object o) {
			return wrapped.lastIndexOf(o);
		}

		public ListIterator<Object> listIterator() {
			return wrapped.listIterator();
		}

		public ListIterator<Object> listIterator(int index) {
			return wrapped.listIterator(index);
		}

		public Object remove(int index) {
			dirty = true;
			return wrapped.remove(index);
		}

		public boolean remove(Object o) {
			dirty = true;
			return wrapped.remove(o);
		}

		public boolean removeAll(Collection<?> c) {
			dirty = true;
			return wrapped.removeAll(c);
		}

		public boolean retainAll(Collection<?> c) {
			dirty = true;
			return wrapped.retainAll(c);
		}

		public Object set(int index, Object element) {
			dirty = true;
			return wrapped.set(index, element);
		}

		public int size() {
			return wrapped.size();
		}

		public List<Object> subList(int fromIndex, int toIndex) {
			return new ListWrapper(wrapped.subList(fromIndex, toIndex));
		}

		public Object[] toArray() {
			return wrapped.toArray();
		}

		public <T> T[] toArray(T[] a) {
			return wrapped.toArray(a);
		}

	}

	private Map<String, String> mappings = null;

	private ValueMap facaded;

	private boolean dirty;

	public ValueMapFacade(Map<String, String> mappings, ValueMap facaded) {
		this.mappings = mappings;
		this.facaded = facaded;
		this.dirty = false;
	}

	@Override
	public boolean containsKey(String key) {
		return mappings.containsKey(key);
	}

	@Override
	public void defineFinalValue(String name, Object value) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineFinalValue(String name, Object value, Type type) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineFinalVariable(String name, Object value) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineFinalVariable(String name, Object value, Type type) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineValue(String name, Object value) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineValue(String name, Object value, Type t) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineVariable(String name, Object value) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public void defineVariable(String name, Object value, Type type) throws B3VariableRedefinitionException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}

	@Override
	public Object get(String key) throws B3NoSuchVariableException {
		String xkey = mappings.get(key);
		if(xkey == null)
			throw new B3NoSuchVariableException(key);
		return facaded.get(xkey);
	}

	@Override
	public Object[] getParameterArray() {
		return facaded.getParameterArray();
	}

	@Override
	public Type getType(String key) throws B3NoSuchVariableException {
		String xkey = mappings.get(key);
		if(xkey == null)
			throw new B3NoSuchVariableException(key);
		return facaded.getType(xkey);
	}

	/**
	 * Returns true if any of the mapped values were changed.
	 * 
	 * @return
	 */
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public boolean isFinal(String key) {
		String xkey = mappings.get(key);
		if(xkey == null)
			return false;
		return facaded.isFinal(xkey);
	}

	@Override
	public boolean isImmutable(String key) {
		String xkey = mappings.get(key);
		if(xkey == null)
			return false;
		return facaded.isImmutable(xkey);
	}

	@SuppressWarnings("unchecked")
	public void monitorVarargs(String key) throws B3EngineException {
		boolean d = dirty; // maintain the dirty state
		List<Object> varargs = (List<Object>) get(key);
		set(key, new ListWrapper(varargs));
		dirty = d;
	}

	@Override
	public Object set(String key, Object value) throws B3EngineException {
		String xkey = mappings.get(key);
		if(xkey == null)
			throw new B3NoSuchVariableException(key);
		dirty = true;
		return facaded.set(xkey, value);
	}

	@Override
	public void setType(String key, Type t) throws B3NoSuchVariableException {
		throw new UnsupportedOperationException("The ValueMapFacade is immutable");
	}
}
