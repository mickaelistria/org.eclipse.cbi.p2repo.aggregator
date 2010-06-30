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
import org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCall Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCallNamedFunctionImpl#getFuncRef <em>Func Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BCallNamedFunctionImpl extends BCallExpressionImpl implements BCallNamedFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFuncRef() <em>Func Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFuncRef()
	 * @generated
	 * @ordered
	 */
	protected IFunction funcRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BCallNamedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFunction basicGetFuncRef() {
		return funcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF:
				if(resolve)
					return getFuncRef();
				return basicGetFuncRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF:
				return funcRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF:
				setFuncRef((IFunction) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCALL_NAMED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF:
				setFuncRef((IFunction) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Checks for progress monitor cancellation, and if not canceled calls the function.
	 * 
	 * @throws OperationCanceledException
	 *             if operation was canceled.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		throw new IllegalAccessError("DO NOT CALL BCallNamedFunction.evaluate");

		// if(ctx.getProgressMonitor().isCanceled())
		// throw new OperationCanceledException();
		// Throwable lastError = null;
		// try {
		// EList<BParameter> pList = getParameterList().getParameters();
		// int nbrParams = pList.size();
		// Object[] parameters = new Object[nbrParams];
		// Type[] tparameters = new Type[nbrParams];
		// int counter = 0;
		// for(BParameter p : pList) {
		// BExpression e = p.getExpr();
		// parameters[counter] = e.evaluate(ctx);
		// // first parameter always have its actual type
		// tparameters[counter] = counter == 0 && parameters[counter] != null
		// ? safeTypeOf(parameters[counter], e.getDeclaredType(ctx))
		// : e.getDeclaredType(ctx);
		// counter++;
		// }
		// String fName = getFuncRef() == null
		// ? name
		// : getFuncRef().getName();
		// return ctx.callFunction(fName, parameters, tparameters);
		// }
		// catch(B3NoSuchFunctionSignatureException e) {
		// lastError = e;
		// }
		// catch(B3NoSuchFunctionException e) {
		// lastError = e;
		// }
		// throw B3BackendException.fromMessage(this, lastError, "Call failed - see details.");
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// if call is on the form "x.f(...)" => "f(x,...)"

		Throwable lastError = null;
		try {
			EList<BParameter> pList = getParameterList().getParameters();
			int nbrParams = pList.size();
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			for(BParameter p : pList) {
				tparameters[counter++] = p.getExpr().getDeclaredType(ctx);
			}
			String fName = getFuncRef() == null
					? name
					: getFuncRef().getName();

			return ctx.getDeclaredFunctionType(fName, tparameters);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Determening return type of Call failed - see details.");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFunction getFuncRef() {
		if(funcRef != null && funcRef.eIsProxy()) {
			InternalEObject oldFuncRef = (InternalEObject) funcRef;
			funcRef = (IFunction) eResolveProxy(oldFuncRef);
			if(funcRef != oldFuncRef) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF, oldFuncRef,
						funcRef));
			}
		}
		return funcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFuncRef(IFunction newFuncRef) {
		IFunction oldFuncRef = funcRef;
		funcRef = newFuncRef;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCALL_NAMED_FUNCTION__FUNC_REF, oldFuncRef, funcRef));
	}

} // BCallNamedFunctionImpl
