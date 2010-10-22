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

import org.eclipse.b3.backend.core.datatypes.IntegerWithRadix;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralInteger;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLiteral Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BLiteralIntegerImpl extends BLiteralExpressionImpl implements BLiteralInteger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BLiteralIntegerImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl#setValue(java.lang.Object)
	 */
	@Override
	public void setValue(Object newValue) {
		if(!(newValue instanceof Integer || newValue instanceof IntegerWithRadix))
			throw new IllegalArgumentException("The value of a BLiteralInteger must be Integer or IntegerWithRadix");
		super.setValue(newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BLITERAL_INTEGER;
	}

} // BLiteralIntegerImpl
