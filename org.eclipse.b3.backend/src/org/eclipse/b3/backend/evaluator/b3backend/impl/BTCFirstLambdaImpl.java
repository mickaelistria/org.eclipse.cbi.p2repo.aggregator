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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTCFirstLambda;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.inference.ITypeConstraint;
import org.eclipse.b3.backend.inference.ITypeExpression;
import org.eclipse.b3.backend.inference.ITypeScheme;
import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.Lists;

/**
 * <!-- begin-user-doc -->
 * The BTCFirstLambda implementation produces constraints for
 * selectFunction(name, (X1..Xn)=>produce(X0), X1, Xn)
 * 
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BTCFirstLambdaImpl extends BTypeCalculatorImpl implements BTCFirstLambda {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BTCFirstLambdaImpl() {
		super();
	}

	/**
	 * Produces constraints for a function invocation where the first parameter must be a lambda.
	 * 
	 * variable(expr) = selectFunction(name, (params[1]..params[n])=>product(params[0]), params[0]..params[n])
	 * i.e. a function that returns what the first lambda returns, and where the lambda takes the arguments 1-n.
	 */
	@Override
	public List<ITypeConstraint> getConstraints(String name, BExpression scope, ITypeScheme typeScheme,
			List<ITypeExpression> parameterTypes, ITypeExpression lhs) {
		ArrayList<ITypeConstraint> result = Lists.newArrayList();
		ITypeExpression theLambda = parameterTypes.get(0);

		ITypeExpression[] exprs = new ITypeExpression[parameterTypes.size()];
		// select('invoke', (X0..Xn)=>Y, X0..Xn)
		ITypeExpression product = typeScheme.product(theLambda);
		exprs[0] = typeScheme.lambda(product, parameterTypes.subList(1, parameterTypes.size()));
		for(int i = 1; i < parameterTypes.size(); i++)
			exprs[i] = parameterTypes.get(i);

		result.add(typeScheme.constraint(lhs, typeScheme.select(name, product, scope, exprs)));
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public B3FunctionType getSignature(Type[] types) {
		B3FunctionType result = B3backendFactory.eINSTANCE.createB3FunctionType();

		if(types.length <= 1 || !(types[0] instanceof B3FunctionType))
			result.setReturnType(TypeUtils.coerceToEObjectType(Object.class));
		else {
			B3FunctionType ft = (B3FunctionType) types[0];
			result.setReturnType(ft.getReturnTypeForParameterTypes(types));
		}
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
		return B3backendPackage.Literals.BTC_FIRST_LAMBDA;
	}

} // BTCFirstLambdaImpl
