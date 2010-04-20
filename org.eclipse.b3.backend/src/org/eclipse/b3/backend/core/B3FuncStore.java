package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.FunctionCandidateAdapterFactory;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class B3FuncStore {
	private static class ContextualFunctionCandidateSource extends
			TypeUtils.CandidateSource<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> {

		private class FunctionCandidateIterator implements
				Iterator<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> {

			private Iterator<IFunction> functionListIterator = functionList.iterator();

			public boolean hasNext() {
				return functionListIterator.hasNext();
			}

			public FunctionCandidateAdapterFactory.IFunctionCandidateAdapter next() {
				return FunctionCandidateAdapterFactory.eINSTANCE.adapt(functionListIterator.next());
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		}

		private List<IFunction> functionList;

		private BExecutionContext callContext;

		private Object[] callParameters;

		public ContextualFunctionCandidateSource(List<IFunction> list, BExecutionContext context, Object[] parameters) {
			functionList = list;
			// we need the following context parameters to be able to call guards
			callContext = context;
			callParameters = parameters;
		}

		@Override
		public boolean isCandidateAccepted(FunctionCandidateAdapterFactory.IFunctionCandidateAdapter candidateAdapter,
				Type[] parameterTypes) {
			IFunction candidate = candidateAdapter.getTarget();
			BGuard guard = candidate.getGuard();

			if(guard == null)
				return true;

			try {
				return guard.accepts(candidate, callContext, callParameters, parameterTypes);
			}
			catch(Throwable t) {
				// TODO we may want to collect the errors and report them later
				throw new Error(t);
			}
		}

		public Iterator<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> iterator() {
			return new FunctionCandidateIterator();
		}

	}

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
			else
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

	// /**
	// * Find the best function matching the parameters.
	// *
	// * @param name
	// * @param parameters
	// * @param types
	// * @param ctx
	// * @return best function, or null, if none was found.
	// * @throws B3EngineException
	// * if there are exceptions while evaluating guards, or underlying issues.
	// */
	// private IFunction getBestFunction(String name, Object[] parameters, Type[] types, BExecutionContext ctx)
	// throws B3EngineException {
	// List<IFunction> list = effective.get(name);
	// List<IFunction> candidates = null;
	// IFunction found = null;
	// if(list.size() < 1)
	// throw new B3NoSuchFunctionException(name); // something is really wrong if that happens here
	// perFunction: for(IFunction f : list) {
	// Type[] pt = f.getParameterTypes();
	// if(!f.isVarArgs()) {
	// if(types.length != pt.length)
	// continue perFunction; // not a match
	// for(int i = 0; i < pt.length; i++) {
	// if(!TypeUtils.isAssignableFrom(pt[i], types[i]))
	// continue perFunction;
	// }
	// // found a candidate
	// if(found != null) {
	// // lazy creation of candidate list (typically there is only one candidate)
	// if(candidates == null)
	// candidates = new ArrayList<IFunction>();
	// candidates.add(found);
	// }
	// found = f;
	// }
	// else {
	// // for varargs
	// // A java function must have an array as the last argument to be compatible
	// if(f instanceof BJavaFunction && !TypeUtils.isArray(pt[pt.length - 1]))
	// throw new IllegalArgumentException("A function with name: '" + name
	// + "', declared to have varargs does not have an array as its last parameter");
	// // list can be one item shorter than the list
	// if(types.length < pt.length - 1)
	// continue perFunction; // not a match - list is too short
	//
	// // compare all types except last (which is the varargs spec)
	// int limit = pt.length - 1;
	// for(int i = 0; i < limit; i++) {
	// if(!TypeUtils.isAssignableFrom(pt[i], types[i]))
	// continue perFunction;
	// }
	// Type varArgsType;
	// // check compatibility of varargs
	// if(types.length >= pt.length) {
	// // java functions have an array type for varargs, B3 functions declare it as a regular type, and
	// // the calling logic passes it as a List.
	// if(f instanceof BJavaFunction)
	// varArgsType = TypeUtils.getArrayComponentType(pt[pt.length-1]);
	// else
	// varArgsType = pt[pt.length - 1];
	// if(varArgsType != Object.class) // no need to check if type is object - anything goes
	// for(int i = limit; i < types.length; i++)
	// if(!TypeUtils.isAssignableFrom(varArgsType, types[i])) // incompatible var arg
	// continue perFunction;
	//
	// // found a candidate
	// if(found != null) {
	// // lazy creation of candidate list (typically there is only one candidate)
	// if(candidates != null)
	// candidates = new ArrayList<IFunction>();
	// candidates.add(found);
	// }
	// found = f;
	// }
	// }
	// }
	// // all candidates found - now return best match
	// if(candidates == null) {// if there were < 2 candidates
	// if(found == null)
	// return null;
	//
	// BGuard guard = found.getGuard();
	// if(guard != null) {
	// try {
	// if(guard.accepts(found, ctx, parameters, types))
	// return found;
	// }
	// catch(Throwable e) {
	// throw new B3EngineException("evaluation of guard ended with exception", e);
	// }
	// throw new B3NotAcceptedByGuardException(name, types);
	// }
	// return found;
	// }
	// candidates.add(found); // to make it easier to process all
	// int best = Integer.MAX_VALUE;
	// IFunction bestFunc = null;
	// List<Throwable> exceptions = null;
	// eachCandidate: for(IFunction candidate : candidates) {
	// BGuard guard = candidate.getGuard();
	// if(guard != null) {
	// try {
	// if(!guard.accepts(candidate, ctx, parameters, types))
	// continue eachCandidate;
	// }
	// catch(Throwable e) {
	// if(exceptions == null)
	// exceptions = new ArrayList<Throwable>();
	// exceptions.add(e);
	// e.printStackTrace();
	// continue eachCandidate;
	// }
	// }
	//
	// int distance = specificity(candidate, types);
	// if(distance < best) {
	// if(distance == 0)
	// return candidate; // unbeatable
	// best = distance;
	// bestFunc = candidate;
	// }
	// }
	//
	// // TODO: HANDLE GUARD FAILURES DIFFERENTLY ? GIVE UP AT ONCE ?
	// if(bestFunc == null) {
	// if(exceptions != null)
	// throw new B3EngineException(
	// "evaluation of guard ended with exception(s) see stacktraces - showing first out of "
	// + Integer.toString(exceptions.size()), exceptions.get(0));
	//
	// throw new B3NotAcceptedByGuardException(name, types);
	// }
	// return bestFunc;
	// }

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
			else
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

		return toBeCalled.getReturnTypeForParameterTypes(types, ctx);
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
				if(hasEqualSignature(f, f2)) {
					if(!hasCompatibleReturnType(f2, f))
						throw new B3IncompatibleReturnTypeException(f2.getReturnType(), f.getReturnType());
					overloaded.add(f2);
				}
			}
		parentList.removeAll(overloaded);
		parentList.addAll(thisList);
		return parentList;
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
			types, new ContextualFunctionCandidateSource(list, ctx, parameters));

		switch(candidateFunctions.size()) {
			case 0: // no candidate function found
				throw new B3NoSuchFunctionSignatureException(name, types, list);
			case 1: // one candidate function found
				return candidateFunctions.getFirst().getTarget();
			default: // more than one candidate function found (the function call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException(name, types);
		}
	}

	// /**
	// * Computes the specificity distance of the function.
	// *
	// * @param f
	// * @param types
	// * @return parameter distance from stated types - 0 is most specific
	// */
	// public int specificity(IFunction f, Type[] types) {
	// Type[] pt = f.getParameterTypes();
	// int distance = 0;
	// for(int i = 0; i < pt.length; i++)
	// distance += TypeUtils.typeDistance(pt[i], types[i]);
	// //
	// // Class ptc = pt[i].getClass();
	// // if(ptc.isInterface())
	// // distance += (1+TypeUtils.interfaceDistance(ptc, types[i]));
	// // else
	// // distance += TypeUtils.classDistance(ptc, types[i]);
	// // }
	// return distance;
	// }

	/**
	 * Returns true if the overloaded type is assignable from the overloading type.
	 * 
	 * @param overloaded
	 * @param overloading
	 * @return
	 */
	private boolean hasCompatibleReturnType(IFunction overloaded, IFunction overloading) {
		Type at = overloaded.getReturnType();
		Type bt = overloading.getReturnType();
		return at.getClass().isAssignableFrom(bt.getClass());
	}

	/**
	 * Returns true if the functions have the same number of parameters, compatible var args flag,
	 * compatible classFunction flag,
	 * and equal parameter types.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private boolean hasEqualSignature(IFunction a, IFunction b) {
		Type[] pta = a.getParameterTypes();
		Type[] ptb = b.getParameterTypes();
		if(pta.length != ptb.length)
			return false;
		if(a.isClassFunction() != b.isClassFunction())
			return false;
		if(a.isVarArgs() != b.isVarArgs())
			return false;
		for(int i = 0; i < pta.length; i++)
			if(!pta[i].equals(ptb[i]))
				return false;
		return true;
	}
}
