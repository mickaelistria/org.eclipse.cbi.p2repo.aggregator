package org.eclipse.b3.backend.core;

import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.FunctionCandidateAdapterFactory;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class B3FuncStore {
	private class TypeIterator implements Iterator<IFunction> {
		UberIterator allFunctionsIterator;

		IFunction theNext = null;

		Class<?> functionType = null;

		Type firstType = null;

		private TypeIterator(UberIterator allFunctionsIterator, Type firstType, Class<?> functionType) {
			this.allFunctionsIterator = allFunctionsIterator;
			this.functionType = functionType;
			this.firstType = firstType;
			computeNext();
		}

		private void computeNext() {
			theNext = null;
			if(!allFunctionsIterator.hasNext())
				return;
			while(theNext == null && allFunctionsIterator.hasNext()) {
				IFunction f = allFunctionsIterator.next();
				if(functionType == null || functionType.isAssignableFrom(f.getClass())) {
					if(!TypeUtils.isAssignableFrom(f.getParameterTypes()[0], firstType))
						continue;
					theNext = f;
				}
			}
		}

		public boolean hasNext() {
			return theNext != null;
		}

		public IFunction next() {
			IFunction result = theNext;
			computeNext();
			return result;
		}

		/**
		 * Throws {@link UnsupportedOperationException}.
		 */
		public void remove() {
			throw new UnsupportedOperationException("remove from function iterator not allowed");
		}

	}

	/**
	 * Iterator capable of iterating over all functions when initialized with an iterator of all possible
	 * function names.
	 */
	private class UberIterator implements Iterator<IFunction> {
		Iterator<String> keyIterator;

		Iterator<IFunction> currentIterator;

		private UberIterator(Iterator<String> allKeysIterator) {
			keyIterator = allKeysIterator;
			currentIterator = keyIterator.hasNext()
					? getFunctionIterator(keyIterator.next())
					: emptyFunctionList().iterator();
		}

		public boolean hasNext() {
			return currentIterator.hasNext() || keyIterator.hasNext();
		}

		public IFunction next() {
			if(currentIterator.hasNext())
				return currentIterator.next();
			String key = keyIterator.next();
			currentIterator = getFunctionIterator(key);
			return currentIterator.next();
		}

		/**
		 * Throws {@link UnsupportedOperationException}.
		 */
		public void remove() {
			throw new UnsupportedOperationException("remove from function iterator not allowed");
		}

	}

	private static List<IFunction> emptyFunctionList() {
		return Collections.emptyList();
	}

	private Set<String> dirtyFunctions = new HashSet<String>();

	private Map<String, List<IFunction>> defined;

	private Map<String, List<IFunction>> effective;

	private B3FuncStore parentStore;

	public B3FuncStore(B3FuncStore parent) {
		parentStore = parent;
		defined = new HashMap<String, List<IFunction>>();
		effective = new HashMap<String, List<IFunction>>();
	}

	public Object callFunction(String functionName, Object[] parameters, Type[] types, BExecutionContext ctx)
			throws Throwable {
		// if the cache is dirty for name - update the cache
		if(dirtyFunctions.contains(functionName))
			updateCache(functionName);

		// find the best matching function, call it, or throw B3NoSuchFunctionException

		// if there is no function here for the name, delegate the task (do not want to add things to this
		// cache for non overloaded functions).
		List<IFunction> f = getFunctionsByName(functionName);
		if(f == null || f.size() < 1) {
			if(parentStore == null)
				throw new B3NoSuchFunctionException(functionName);
			return parentStore.callFunction(functionName, parameters, types, ctx);
		}

		IFunction toBeCalled = getMostSpecificFunction(functionName, parameters, types, ctx);

		return toBeCalled.call(ctx.createOuterContext(), parameters, types);
	}

	/**
	 * - If a function with the exact same name and parameters is already installed then:
	 * - is this allowed ? would mean an override of same function in same scope
	 * 
	 * @param name
	 * @param func
	 */
	public void defineFunction(String name, IFunction func) {
		dirtyFunctions.add(name);
		effective.remove(name);

		List<IFunction> list = defined.get(name);
		if(list == null)
			defined.put(name, list = new ArrayList<IFunction>());
		list.add(func);

	}

	public Iterable<IFunction> functionIterable() {
		return new Iterable<IFunction>() {

			public Iterator<IFunction> iterator() {
				return getFunctionIterator();
			}
		};
	}

	public Iterable<IFunction> functionIterable(final String name) {
		return new Iterable<IFunction>() {

			public Iterator<IFunction> iterator() {
				return getFunctionIterator(name);
			}
		};
	}

	public Type getDeclaredFunctionType(String functionName, Type[] types, BExecutionContext ctx)
			throws B3EngineException {
		// find the best matching function, and return its type, or throw B3NoSuchFunctionException

		// if there is no function here for the name, delegate the task (do not want to add things to this
		// cache for non overloaded functions).
		List<IFunction> f = getFunctionsByName(functionName);
		if(f == null || f.size() < 1) {
			if(parentStore == null)
				throw new B3NoSuchFunctionException(functionName);
			return parentStore.getDeclaredFunctionType(functionName, types, ctx);
		}
		// if the cache is dirty for name - update the cache
		if(dirtyFunctions.contains(functionName))
			updateCache(functionName);

		// TODO: CHEATING !!! When evaluating the type, the parameter values are not present.
		// Most guards would only look at the types, but an instance guard actually cares. However,
		// the important is to find the return type of the function. Guards needs to know that they will
		// be called with all parameters set to null (i.e. they can't guard against that). A better typesystem
		// solution is required. There are several bad situations (e.g. finding a function that when not instance
		// guarded is not found) - but no worse than where there are no guards :)
		// TODO: TYPESYSTEM.
		//
		Object[] fakeParameters = new Object[types.length];
		IFunction toBeCalled = getMostSpecificFunction(functionName, fakeParameters, types, ctx);

		return toBeCalled.getReturnTypeForParameterTypes(types);
	}

	// /**
	// * Updates cache for all functions.
	// * @throws B3EngineException
	// */
	// private void updateCache() throws B3EngineException {
	// for(String name : dirtyFunctions)
	// effective.put(name, getEffectiveList(name, getFunctionsByName(name).size()));
	// dirtyFunctions.clear();
	// }
	private List<IFunction> getEffectiveList(String name, int size) throws B3EngineException {
		if(parentStore == null) {
			List<IFunction> thisList = getFunctionsByName(name);
			List<IFunction> result = new ArrayList<IFunction>(size + thisList.size());
			result.addAll(thisList);
			return result;
		}
		List<IFunction> thisList = getFunctionsByName(name);
		List<IFunction> parentList = parentStore.getEffectiveList(name, size + thisList.size());
		List<IFunction> overloaded = new ArrayList<IFunction>();
		for(IFunction f : thisList)
			for(IFunction f2 : parentList) {
				// if f has same signature as f2, make it hide predecessor
				if(TypeUtils.hasEqualSignature(f, f2)) {
					if(!TypeUtils.hasCompatibleReturnType(f2, f))
						throw new B3IncompatibleReturnTypeException(f2.getReturnType(), f.getReturnType());
					overloaded.add(f2);
				}
			}
		parentList.removeAll(overloaded);
		parentList.addAll(thisList);
		return parentList;
	}

	/**
	 * Returns an iterator over all visible functions. This is an expensive operation.
	 * 
	 * @return
	 */
	public Iterator<IFunction> getFunctionIterator() {
		// (note: cache gets updated per name by the UberIterator)

		// construct set of all keys
		Set<String> allKeys = new HashSet<String>();
		for(B3FuncStore fs = this; fs != null; fs = fs.parentStore)
			if(fs.defined != null)
				allKeys.addAll(fs.defined.keySet());
		// use uber iterator to iterate over all names and resulting lists
		UberIterator itor = new UberIterator(allKeys.iterator());
		return itor;
	}

	/**
	 * Returns an iterator over all visible functions having a given name.
	 * 
	 * @param name
	 * @return
	 */
	public Iterator<IFunction> getFunctionIterator(String name) {
		// if the cache is dirty for name - update the cache
		if(dirtyFunctions.contains(name))
			try {
				updateCache(name);
			}
			catch(B3EngineException e) {
				e.printStackTrace();
				throw new B3InternalError("Failed to update function cache", e);
			}

		List<IFunction> f = effective.get(name);
		if(f == null)
			return parentStore == null
					? emptyFunctionList().iterator()
					: parentStore.getFunctionIterator(name);
		return f.iterator();
	}

	/**
	 * Returns an iterator over all visible functions having a first parameter assignable to type. The
	 * optional functionType parameter makes the selection limited to a particular subclasses of IFunction.
	 * 
	 * @param name
	 * @return
	 */
	public Iterator<IFunction> getFunctionIterator(Type type, Class<?> functionType) {
		// (note: cache gets updated per name by the UberIterator)

		// construct set of all keys
		Set<String> allKeys = new HashSet<String>();
		for(B3FuncStore fs = this; fs != null; fs = fs.parentStore)
			if(fs.defined != null)
				allKeys.addAll(fs.defined.keySet());
		// use uber iterator to iterate over all names and resulting lists
		UberIterator itor = new UberIterator(allKeys.iterator());

		return new TypeIterator(itor, type, functionType);
	}

	/**
	 * Returns the list of functions defined in this func store for name (or an empty list).
	 * 
	 * @param name
	 * @return
	 */
	private List<IFunction> getFunctionsByName(String name) {
		if(defined == null)
			return Collections.emptyList();
		List<IFunction> result = defined.get(name);
		if(result == null)
			return Collections.emptyList();
		return result;
	}

	/**
	 * Find the most specific function matching the parameters.
	 * 
	 * @param name
	 * @param parameters
	 * @param types
	 * @param ctx
	 * @return best function, or null, if none was found.
	 * @throws B3EngineException
	 *             if there are exceptions while evaluating guards, or underlying issues.
	 */
	private IFunction getMostSpecificFunction(String name, Object[] parameters, Type[] types, BExecutionContext ctx)
			throws B3EngineException {
		List<IFunction> list = effective.get(name);

		if(list.isEmpty())
			throw new B3NoSuchFunctionException(name); // something is really wrong if that happens here

		LinkedList<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> candidateFunctions = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
			types, new TypeUtils.GuardedFunctionCandidateSource(list /* , ctx, parameters */));

		switch(candidateFunctions.size()) {
			case 0: // no candidate function found
				throw new B3NoSuchFunctionSignatureException(name, types, list);
			case 1: // one candidate function found
				return candidateFunctions.getFirst().getTarget();
			default: // more than one candidate function found (the function call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException(name, types);
		}
	}

	public void printDump(PrintStream x, int indent) {
		final StringBuffer indentBuf = new StringBuffer(indent);
		for(int i = 0; i < indent; i++)
			indentBuf.append(" ");
		if(defined == null)
			return;
		x.printf("%sFunctions\n", indentBuf.toString());
		indentBuf.append("  ");
		final String is = indentBuf.toString();

		for(Entry<String, List<IFunction>> v : defined.entrySet()) {
			final StringBuffer buf = new StringBuffer();
			List<IFunction> functions = v.getValue();
			for(IFunction f : functions) {
				buf.append(is);
				buf.append("func ");
				buf.append(f.getName());
				buf.append("(");
				boolean first = true;
				for(BParameterDeclaration p : f.getParameters()) {
					if(!first) {
						buf.append(", ");
						first = false;
					}
					buf.append(p.getType().toString());
					buf.append(" ");
					buf.append(p.getName());
				}
				buf.append(")\n");
				x.print(buf);
			}
		}
	}

	public void undefineFunction(String name, BFunction func) {
		dirtyFunctions.add(name);
		effective.remove(name);
		if(defined == null)
			return;
		List<IFunction> fList = defined.get(name);
		if(fList == null)
			return;
		fList.remove(func);
	}

	public void updateCache(String name) throws B3EngineException {
		// if(!dirtyFunctions.contains(name))
		// return;
		effective.put(name, getEffectiveList(name, getFunctionsByName(name).size()));
		dirtyFunctions.remove(name);
	}

}
