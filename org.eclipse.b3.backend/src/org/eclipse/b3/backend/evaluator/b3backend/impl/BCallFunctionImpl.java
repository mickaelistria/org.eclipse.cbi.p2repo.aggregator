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
import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCall Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BCallFunctionImpl extends BCallExpressionImpl implements BCallFunction {
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
	protected BCallFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCALL_FUNCTION;
	}

	/**
	 * Checks for progress monitor cancellation, and if not canceled calls the function
	 * resulting from evaluating the funcExpr.
	 * i.e. handle a call on the form (a)(x,y);
	 * 
	 * @throws OperationCanceledException
	 *             if operation was canceled.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			Object target = funcExpr.evaluate(ctx);
			EList<BParameter> pList = getParameterList().getParameters();
			int nbrParams = pList.size();
			Object[] parameters = new Object[nbrParams];
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			for(BParameter p : pList) {
				BExpression e = p.getExpr();
				parameters[counter] = e.evaluate(ctx);
				// first parameter always have its actual type (unless it is null)
				tparameters[counter] = counter == 0 && parameters[counter] != null
						? safeTypeOf(parameters[counter], e.getDeclaredType(ctx))
						: e.getDeclaredType(ctx);
				counter++;
			}
			if(target instanceof Class<?>) {
				if(parameters.length != 1)
					throw B3BackendException.fromMessage(this,
							"Attempt to cast to {0} using more than one pbject to cast", new Object[] { target });
				try {
					return ((Class<?>) target).cast(parameters[0]);
				}
				catch(ClassCastException e) {
					throw B3BackendException.fromMessage(this, e, "Can not perform cast", new Object[] {});
				}
			}
			if(!(target instanceof BFunction))
				throw B3BackendException.fromMessage(this, "Attempt to call non Function - was type : {0}",
						new Object[] { target.getClass() });

			// if the function comes with a closure, call it in an inner context, else a fresh outer context.
			// TODO: Don't know if this treatment is needed elsewhere as well...
			BExecutionContext useCtx = ((BFunction) target).getClosure();
			useCtx = useCtx == null
					? ctx.createOuterContext()
					: useCtx.createInnerContext();
			return ((BFunction) target).call(useCtx, parameters, tparameters);

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
		Throwable lastError = null;
		try {
			Type t = funcExpr.getDeclaredType(ctx);
			if(t instanceof B3MetaClass) {
				return ((B3MetaClass) t).getInstanceClass(); // the class this meta class represents (i.e. what it casts
																// to).
			}
			if(!(t instanceof B3FunctionType))
				throw BackendHelper.createException(this, "call on non BFunction - has type : {0}", new Object[] { t });
			return ((B3FunctionType) t).getReturnType();

		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Determening return type of Call failed - see details.");

	}

} // BCallFunctionImpl
