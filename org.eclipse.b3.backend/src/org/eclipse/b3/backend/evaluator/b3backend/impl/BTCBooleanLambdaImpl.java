/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.datatypes.Any;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BTCBooleanLambda;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.inference.ITypeConstraint;
import org.eclipse.b3.backend.inference.ITypeExpression;
import org.eclipse.b3.backend.inference.ITypeScheme;
import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTC Boolean Lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BTCBooleanLambdaImpl extends BTCLastLambdaImpl implements BTCBooleanLambda {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BTCBooleanLambdaImpl() {
		super();
	}

	/**
	 * Constrain selectFunction(f, ?<T>, (T)=>Boolean)=>List<T>
	 * selectFunction(f, ?<T>, (X1..)* _ (.. Xn)*, (X1.., T, ..Xn)=>Boolean)=>List<T>
	 */
	@Override
	public List<ITypeConstraint> getConstraints(String funcName, BExpression expr, ITypeScheme typeScheme,
			List<ITypeExpression> parameterConstraints, ITypeExpression lhs) {
		List<ITypeConstraint> result = Lists.newArrayList();
		if(parameterConstraints.size() < 2)
			return result; // give up - this bad case should not have happened

		ITypeExpression any = typeScheme.type(Any.class);

		ITypeExpression[] exprs = new ITypeExpression[parameterConstraints.size()];
		exprs[0] = parameterConstraints.get(0);

		// The '_' in the parameters (or auto curry) is the generic type argument 0 of what exprs[0] resolve to
		ITypeExpression curryConstraint = typeScheme.generic(0, exprs[0]);
		final int lambdaArgsCount = parameterConstraints.size() - 2;
		ITypeExpression[] lambdaConstraints = new ITypeExpression[lambdaArgsCount == 0
				? 1
				: lambdaArgsCount];
		if(lambdaArgsCount == 0)
			lambdaConstraints[0] = curryConstraint; // auto curry
		else
			// replace the 'any' with the curry
			for(int i = 0; i < lambdaArgsCount; i++) {
				exprs[i + 1] = lambdaConstraints[i] = parameterConstraints.get(i + 1);
				if(lambdaConstraints[i].matches(any))
					lambdaConstraints[i] = curryConstraint;
			}

		ITypeExpression product = typeScheme.parameterizedType(typeScheme.type(List.class), curryConstraint);
		exprs[exprs.length - 1] = typeScheme.lambda(typeScheme.type(Boolean.class), lambdaConstraints);
		result.add(typeScheme.constraint(lhs, typeScheme.select(funcName, product, expr, exprs)));
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Type Calculator for f(?<T>,<U1>...<Un>, f(<U1>..<Un>)=>Boolean)=>List<T>
	 * Where an Any in U1..Un is replaced by T.
	 * Example:
	 * select(Iterator<Integer>, 20, _, {u1, u2 | u2 > u1; })
	 * results in signature for the select call of:
	 * (Iterator<Integer>, Integer, Integer, (Integer, Integer)=>Boolean)=>List<Integer>
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public B3FunctionType getSignature(Type[] types) {
		B3FunctionType result = B3backendFactory.eINSTANCE.createB3FunctionType();
		result.setFunctionType(BFunction.class);
		int ix = types.length - 1;

		// must have at least iterator, and lambda as parameters
		if(types.length < 2 || !(types[ix] instanceof B3FunctionType)) {
			result.setReturnType(TypeUtils.coerceToEObjectType(Object.class));
			if(B3Debug.typer) {
				B3Debug.trace("BTCBooleanLambda - non conformant call detected - returning ()=>Object");
			}
			return result; // non conforming, return ()=>Object
		}
		// determine curry type
		Type[] curryGenericArgs = TypeUtils.getTypeArguments(types[0]);
		// if generic is not 1 arg, it is either wrong i.e. Iterator<K, V>, or erased in runtime - use Object
		Type curryType = TypeUtils.coerceToEObjectType(curryGenericArgs.length == 1
				? curryGenericArgs[0]
				: Object.class);

		// The commonTypes are parameters both in the system function, and in the lambda
		Type[] commonTypes = new Type[types.length - 2];
		for(int i = 1; i < types.length - 1; i++)
			commonTypes[i - 1] = TypeUtils.coerceToEObjectAndResolveAny(types[i], curryType);

		// Compute the (resulting) lambda signature
		// (type[0-n])=>Boolean
		B3FunctionType lambda = B3backendFactory.eINSTANCE.createB3FunctionType();
		lambda.setFunctionType(B3Function.class);
		if(commonTypes.length == 0) // auto curry
			lambda.getParameterTypes().add(TypeUtils.coerceToEObjectType(curryType));
		else
			for(int i = 0; i < commonTypes.length; i++)
				lambda.getParameterTypes().add(commonTypes[i]);
		lambda.setReturnType(TypeUtils.coerceToEObjectType(Boolean.class));
		// Set all parameters in resulting type
		result.getParameterTypes().add(TypeUtils.coerceToEObjectType(types[0])); // the iterator/iterable
		for(int i = 0; i < commonTypes.length; i++)
			result.getParameterTypes().add(commonTypes[i]);
		result.getParameterTypes().add(lambda);
		B3ParameterizedType returnType = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		returnType.setRawType(TypeUtils.coerceToEObjectType(List.class));
		returnType.getActualArgumentsList().add(curryType);
		result.setReturnType(returnType);
		if(B3Debug.typer)
			B3Debug.trace("BTCBooleanLambda()=> ", result);

		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BTC_BOOLEAN_LAMBDA;
	}
} // BTCBooleanLambdaImpl
