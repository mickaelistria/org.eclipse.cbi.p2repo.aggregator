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

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.emf.common.notify.Notification;
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
