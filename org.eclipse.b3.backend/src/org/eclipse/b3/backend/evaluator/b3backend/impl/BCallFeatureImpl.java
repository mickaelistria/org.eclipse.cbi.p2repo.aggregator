/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
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

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCall Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BCallFeatureImpl extends BCallExpressionImpl implements BCallFeature {
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
	protected BCallFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCALL_FEATURE;
	}

	/**
	 * A target call has a funcExpr that evaluates to the target.
	 * A function of 'name' is then called with the evaluated funcExpr as the first
	 * argument.
	 * 
	 * @param ctx
	 * @return the produced result from the function
	 * @throws Throwable
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			Object target = funcExpr.evaluate(ctx);
			EList<BParameter> pList = getParameterList().getParameters();
			int nbrParams = pList.size() + 1;
			Object[] parameters = new Object[nbrParams];
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			parameters[counter] = target;
			// first parameter always have its actual type
			tparameters[counter++] = safeTypeOf(target, funcExpr.getDeclaredType(ctx));
			for(BParameter p : pList) {
				BExpression e = p.getExpr();
				parameters[counter] = e.evaluate(ctx);
				tparameters[counter++] = e.getDeclaredType(ctx);
			}
			return ctx.callFunction(name, parameters, tparameters);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Call failed - see details.");
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// if call is on the form "x.f(...)" => "f(x,...)"

		Throwable lastError = null;
		try {
			EList<BParameter> pList = getParameterList().getParameters();
			int nbrParams = pList.size() + 1;
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			tparameters[counter++] = funcExpr.getDeclaredType(ctx);
			for(BParameter p : pList) {
				tparameters[counter++] = p.getExpr().getDeclaredType(ctx);
			}
			return ctx.getDeclaredFunctionType(name, tparameters);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Determening return type of Call failed - see details.");

	}

} // BCallFeatureImpl
