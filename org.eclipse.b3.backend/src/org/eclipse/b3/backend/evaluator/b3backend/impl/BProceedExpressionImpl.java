/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BProceed Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BProceedExpressionImpl extends BExpressionImpl implements BProceedExpression {
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
	protected BProceedExpressionImpl() {
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
		return B3backendPackage.Literals.BPROCEED_EXPRESSION;
	}

	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// find the mapping context to proceed in
		BWrappingContext wrappingCtx = ctx.getContext(BWrappingContext.class);
		if(wrappingCtx == null)
			throw B3BackendException.fromMessage(
				this, "A proceed expression could not find a corresponding context to proceed in.");
		IFunction original = wrappingCtx.getFunctionWrapper().getOriginal();
		return original.internalCall(
			wrappingCtx.getWrappedContext(), wrappingCtx.getParameters(), wrappingCtx.getParameterTypes());
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// find the mapping context to proceed in
		BWrappingContext wrappingCtx = ctx.getContext(BWrappingContext.class);
		if(wrappingCtx == null)
			throw B3BackendException.fromMessage(
				this, "A proceed expression could not find a corresponding context to proceed in.");
		IFunction original = wrappingCtx.getFunctionWrapper().getOriginal();
		return original.getDeclaredType(ctx);
	}
} // BProceedExpressionImpl
