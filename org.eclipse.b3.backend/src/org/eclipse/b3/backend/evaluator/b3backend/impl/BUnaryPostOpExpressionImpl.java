/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUnary Post Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BUnaryPostOpExpressionImpl extends BUnaryOpExpressionImpl implements BUnaryPostOpExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "<copyright>Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r</copyright>";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUnaryPostOpExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BUNARY_POST_OP_EXPRESSION;
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		LValue lval = expr.getLValue(ctx);
		if(lval == null)
			throw BackendHelper.createException(expr, "Expression is not an assignable value");
		Object preopValue = lval.get();
		lval.set(ctx.callFunction(functionName, 
				new Object[]{preopValue},
				new Type[]{ expr.getDeclaredType(ctx) }
		));
		return preopValue;
	}
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return expr.getLValue(ctx).getDeclaredType();
	}
} //BUnaryPostOpExpressionImpl
