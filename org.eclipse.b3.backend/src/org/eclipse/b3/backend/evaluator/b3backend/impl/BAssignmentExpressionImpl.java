/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAssignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BAssignmentExpressionImpl extends BBinaryOpExpressionImpl implements BAssignmentExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAssignmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BASSIGNMENT_EXPRESSION;
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
//		if(leftExpr instanceof BDefValue && ((BDefValue)leftExpr).isImmutable()) {
//			// must evaluate first
//			Object r = rightExpr.evaluate(ctx);
//			((BDefValue)leftExpr)
//		}
		Object r = rightExpr.evaluate(ctx);
		LValue lval = leftExpr.getLValue(ctx);
		// Simple type inference : TODO - should probably not be done this way, but in a separate phase
		if(lval.getDeclaredType() == null)
			lval.setDeclaredType(rightExpr.getDeclaredType(ctx));
		// straight assignment
		if(functionName == null || "".equals(functionName) || "=".equals(functionName))
			return lval.set(r);
		Object[] params = new Object[] { lval.get(), rightExpr.evaluate(ctx) };
		Type[] types = new Type[] { lval.getDeclaredType(), rightExpr.getDeclaredType(ctx) };
		// remove the trailing = from +=, *= <<= etc. before calling
		String fn = functionName.endsWith("=") ? functionName.substring(0,functionName.length()-1) : functionName;
		return lval.set(ctx.callFunction(fn, params, types));
	}
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return leftExpr.getDeclaredType(ctx);
	}
} //BAssignmentExpressionImpl
