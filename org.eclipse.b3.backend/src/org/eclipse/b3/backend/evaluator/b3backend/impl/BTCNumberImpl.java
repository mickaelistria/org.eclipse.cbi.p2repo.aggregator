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
import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BTCNumber;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTC Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BTCNumberImpl extends BTypeCalculatorImpl implements BTCNumber {

	/**
	 * Computes the most generic of a sequence of Number types
	 * 
	 * @param types
	 * @return
	 * @generated NOT
	 */
	public static Type numberGenericityCalculator(Type[] types) {
		if(types.length == 1) {
			return types[0];
		}
		if(types.length == 2) {
			Type at = types[0];
			Type bt = types[1];
			Class<?> a = TypeUtils.getRaw(at);
			Class<?> b = TypeUtils.getRaw(bt);
			if(a == BigDecimal.class)
				return at;
			if(b == BigDecimal.class)
				return bt;
			if(a == Double.class)
				return at;
			if(b == Double.class)
				return bt;
			if(a == Float.class)
				return at;
			if(b == Float.class)
				return bt;
			if(a == BigInteger.class)
				return at;
			if(b == BigInteger.class)
				return bt;
			if(a == Long.class)
				return at;
			if(b == Long.class)
				return bt;
			if(a == Integer.class)
				return at;
			if(b == Integer.class)
				return bt;
			if(a == Short.class)
				return at;
			if(b == Short.class)
				return bt;
			if(a == Byte.class)
				return at;
			if(b == Byte.class)
				return bt;
		}

		// give up...
		return Number.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BTCNumberImpl() {
		super();
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
		result.setFunctionType(BFunction.class);
		result.setReturnType(numberGenericityCalculator(types));
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
		return B3backendPackage.Literals.BTC_NUMBER;
	}
} // BTCNumberImpl
