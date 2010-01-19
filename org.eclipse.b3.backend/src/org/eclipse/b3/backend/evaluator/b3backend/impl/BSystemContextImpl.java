/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>BSystem Context</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BSystemContextImpl extends BExecutionContextImpl implements BSystemContext {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BSystemContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BSYSTEM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc --> TODO: Translate exceptions from not finding method etc. into B3 Exceptions <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object callFunction(String functionName, Object[] parameters, Type[] types, BExecutionContext ctx)
			throws Throwable {
		Method m = findMethod(functionName, types);
		if(m == null)
			throw new B3NoSuchFunctionSignatureException(functionName, types);

		Object[] callParameters = new Object[parameters.length - 1];
		for(int i = 1; i < parameters.length; i++)
			callParameters[i - 1] = parameters[i];

		try {
			// invoke handles unwrap of non primitive types
			return TypeUtils.autoBox(m.invoke(parameters[0], callParameters));
		} catch(InvocationTargetException e) {
			throw e.getCause();
		}
	}

	private Method findMethod(String functionName, Type[] types) throws Throwable {
		// In Java, all calls refer to an instance/class (which must be in the first parameter)
		if(types.length == 0)
			throw new B3NoSuchFunctionSignatureException(functionName, types);

		Class<?> objectType = TypeUtils.getRaw(types[0]);
		Class<?>[] parameterTypes = new Class<?>[types.length - 1];

		for(int i = 1; i < types.length; i++)
			parameterTypes[i - 1] = TypeUtils.getRaw(types[i]);

		Method candidate = null;
		// state:
		// 0 = no candidate method found
		// 1 = one candidate method found
		// other = more than one candidate method found (the method call is ambiguous)
		byte state = 0;

		METHOD: for(Method method : objectType.getMethods()) {
			if(!functionName.equals(method.getName()))
				continue METHOD;

			Type[] methodParameterTypes = method.getParameterTypes();

			// don't bother if the parameter counts don't match
			if(methodParameterTypes.length != parameterTypes.length)
				continue METHOD;

			int exactMatch = 0;
			for(int i = 0; i < parameterTypes.length; ++i) {
				if(!(TypeUtils.isAssignableFrom(methodParameterTypes[i], parameterTypes[i])
						&& (exactMatch += TypeUtils.isAssignableFrom(parameterTypes[i], methodParameterTypes[i])
								? 1 : 0) == exactMatch || TypeUtils.isCoercibleFrom(methodParameterTypes[i],
						parameterTypes[i])
						&& (exactMatch += TypeUtils.primitivize(parameterTypes[i]) == methodParameterTypes[i]
								? 1 : 0) == exactMatch))
					continue METHOD;
			}

			// if the method's declared parameters types match exactly the actual parameter types, then stop the search
			// and return that method immediately
			if(exactMatch == parameterTypes.length)
				return objectType.getMethod(method.getName(), method.getParameterTypes());

			switch(state) {
			case 0: // no candidate method found so far
				candidate = method;
				++state;
				continue METHOD;

			case 1: // one candidate method has been found so far
				Type[] candidateMethodParameterTypes = candidate.getParameterTypes();

				// check if the current method is more specific than the selected one
				IS_MORE_SPECIFIC: {
					for(int i = 0; i < parameterTypes.length; ++i) {
						if(!(TypeUtils.isAssignableFrom(candidateMethodParameterTypes[i], methodParameterTypes[i]) || TypeUtils
								.isCoercibleFrom(candidateMethodParameterTypes[i], methodParameterTypes[i])))
							break IS_MORE_SPECIFIC;
					}
					candidate = method;
					continue METHOD;
				}

				// verify that the current method is less specific than the selected one
				IS_LESS_SPECIFIC: {
					for(int i = 0; i < parameterTypes.length; ++i) {
						if(!(TypeUtils.isAssignableFrom(methodParameterTypes[i], candidateMethodParameterTypes[i]) || TypeUtils
								.isCoercibleFrom(methodParameterTypes[i], candidateMethodParameterTypes[i])))
							break IS_LESS_SPECIFIC;
					}
					continue METHOD;
				}

				// the method is neither less nor more specific, so it is ambiguous
				++state;
			}
		}

		switch(state) {
		case 0: // no candidate method found
			return null;
		case 1: // one candidate method found
			return objectType.getMethod(candidate.getName(), candidate.getParameterTypes());
		default: // more than one candidate method found (the method call is ambiguous)
			throw new B3AmbiguousFunctionSignatureException(functionName, types);
		}
	}

	@Override
	public Type getDeclaredFunctionType(String functionName, Type[] types) throws Throwable {
		Method m = findMethod(functionName, types);
		if(m == null)
			throw new B3NoSuchFunctionSignatureException(functionName, types);
		return TypeUtils.objectify(m.getReturnType());
	}

} // BSystemContextImpl
