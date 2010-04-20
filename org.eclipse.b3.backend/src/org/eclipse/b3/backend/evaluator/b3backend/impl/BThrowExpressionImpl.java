/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3UserException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BThrow Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BThrowExpressionImpl extends BUnaryExpressionImpl implements BThrowExpression {
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
	protected BThrowExpressionImpl() {
		super();
	}

	/**
	 * Throws an exception that is the result of evaluating the expression, or a B3UserException
	 * if the result of the expression is something other than a Throwable.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Object e = expr.evaluate(ctx);
		if(!(e instanceof Throwable))
			throw new B3UserException(this, e);
		throw (Throwable) e;
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// TODO: this is lying - evaluation of a throw is really void
		return Object.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BTHROW_EXPRESSION;
	}
} // BThrowExpressionImpl
