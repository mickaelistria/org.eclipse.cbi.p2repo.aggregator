/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSystem Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BSystemContextImpl extends BExecutionContextImpl implements BSystemContext {
	private static class MethodCandidate extends TypeUtils.AdaptingJavaCandidate<Method> {

		public MethodCandidate(Method aMethod) {
			super(aMethod);
		}

		public Method getMethod() {
			return adaptedObject;
		}

		@Override
		public String getName() {
			return adaptedObject.getName();
		}

		public boolean isVarArgs() {
			return adaptedObject.isVarArgs();
		}

		@Override
		protected Type[] getJavaParameterTypes() {
			return adaptedObject.getGenericParameterTypes();
		}

	}

	private static class MethodCandidateSource extends TypeUtils.CandidateSource<MethodCandidate> {

		private class MethodCandidateIterator implements Iterator<MethodCandidate> {

			private int currentIndex;

			public boolean hasNext() {
				return currentIndex < methods.length;
			}

			public MethodCandidate next() {
				return new MethodCandidate(methods[currentIndex++]);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		}

		private Method[] methods;

		public MethodCandidateSource(Class<?> aClass) {
			methods = aClass.getMethods();
		}

		public Iterator<MethodCandidate> iterator() {
			return new MethodCandidateIterator();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected BSystemContextImpl() {
		super();
		// must have a func store as functions are added after children are created.
		// A system context also never gets parent set, so there is no other chance of doing this.
		createFuncStore();
	}

	// /**
	// * <!-- begin-user-doc -->
	// * TODO: Translate exceptions from not finding method etc. into B3 Exceptions
	// * <!-- end-user-doc -->
	// *
	// * @generated NOT
	// */
	// public Object callFunction(String functionName, Object[] parameters, Type[] types, BExecutionContext ctx)
	// throws Throwable {
	// Method method = findMethod(functionName, types);
	// Class<?>[] methodParameterTypes = method.getParameterTypes();
	// Object[] callParameters = new Object[methodParameterTypes.length];
	//
	// if(method.isVarArgs()
	// && (types.length - 1 != methodParameterTypes.length || !methodParameterTypes[methodParameterTypes.length - 1]
	// .isAssignableFrom(TypeUtils.getRaw(types[methodParameterTypes.length])))) {
	//
	// for(int i = 1; i < methodParameterTypes.length; ++i)
	// callParameters[i - 1] = parameters[i];
	//
	// Class<?> varargComponentType = methodParameterTypes[methodParameterTypes.length - 1].getComponentType();
	//
	// Object varargArray = Array.newInstance(varargComponentType, types.length - methodParameterTypes.length);
	//
	// for(int i = methodParameterTypes.length; i < types.length; ++i)
	// Array.set(varargArray, i - methodParameterTypes.length, parameters[i]);
	//
	// callParameters[methodParameterTypes.length - 1] = varargArray;
	// } else {
	// for(int i = 1; i < methodParameterTypes.length + 1; ++i)
	// callParameters[i - 1] = parameters[i];
	// }
	//
	// try {
	// // invoke handles unwrap of non primitive types
	// return method.invoke(parameters[0], callParameters);
	// } catch(InvocationTargetException e) {
	// throw e.getCause();
	// }
	// }

	@Override
	public Type getDeclaredFunctionType(String functionName, Type[] types) throws Throwable {
		Method m = findMethod(functionName, types);

		return TypeUtils.objectify(m.getGenericReturnType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Loads a method, and defines it in this context. If finding and loading a method worked, true is returned,
	 * else false. Error conditions that should surface to a a user are thrown as a {@link B3EngineException},
	 * most notably {@link B3AmbiguousFunctionSignatureException} which denotes that more than one signature
	 * was found for the type parameters.
	 * <!-- end-user-doc -->
	 * 
	 * @throws B3EngineException
	 * @throws B3AmbiguousFunctionSignatureException
	 * @generated NOT
	 */
	public IFunction loadMethod(String functionName, Type[] types) throws B3EngineException {
		Method method = null;
		try {
			method = findMethod(functionName, types);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			return null;
		}
		catch(SecurityException e) {
			throw new B3InternalError("Security exception while loading method", e);
		}
		catch(NoSuchMethodException e) {
			return null;
		}
		return loadFunction(method);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BSYSTEM_CONTEXT;
	}

	private Method findMethod(String methodName, Type[] types) throws B3NoSuchFunctionSignatureException,
			B3AmbiguousFunctionSignatureException, SecurityException, NoSuchMethodException {
		// in Java, all calls refer to an instance/class (which must be in the first parameter)
		if(types.length == 0)
			throw new B3NoSuchFunctionSignatureException(methodName, types);

		Class<?> objectType = TypeUtils.getRaw(types[0]);
		Type[] parameterTypes = new Type[types.length - 1];

		System.arraycopy(types, 1, parameterTypes, 0, parameterTypes.length);

		LinkedList<MethodCandidate> candidateMethods = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
			methodName, parameterTypes, new MethodCandidateSource(objectType));

		switch(candidateMethods.size()) {
			case 0: // no candidate method found
				throw new B3NoSuchFunctionSignatureException(methodName, types);
			case 1: { // one candidate method found
				Method candidateMethod = candidateMethods.getFirst().getMethod();

				// return the result of a call to java.lang.Class.getMethod() to get the most specific implementation
				// of the candidate method
				return objectType.getMethod(candidateMethod.getName(), candidateMethod.getParameterTypes());
			}
			default: // more than one candidate method found (the method call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException(methodName, types);
		}
	}

} // BSystemContextImpl
