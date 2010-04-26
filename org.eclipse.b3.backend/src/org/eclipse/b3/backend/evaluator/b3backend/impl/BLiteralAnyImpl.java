/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3NotLValueException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.Any;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLiteral Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BLiteralAnyImpl extends BPatternLiteralExpressionImpl implements BLiteralAny {
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
	 * @generated
	 */
	protected BLiteralAnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BLITERAL_ANY;
	}

	@Override
	public Object evaluate(BExecutionContext ctx) throws CoreException {
		return Any.ANY;
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// TODO: This may not be correct - should perhaps return Object.class
		//
		return Any.class;
	}

	@Override
	public LValue getLValue(BExecutionContext ctx) throws Throwable {
		throw new B3NotLValueException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPatternLiteralExpressionImpl#matches(java.lang.CharSequence)
	 */
	@Override
	public boolean matches(CharSequence candidate) {
		return true;
	}
} // BLiteralAnyImpl
