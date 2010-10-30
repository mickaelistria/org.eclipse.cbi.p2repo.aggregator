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

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BTCPluggable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTC Pluggable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTCPluggableImpl#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BTCPluggableImpl extends BTypeCalculatorImpl implements BTCPluggable {
	/**
	 * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunc()
	 * @generated
	 * @ordered
	 */
	protected BJavaFunction func;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BTCPluggableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BJavaFunction basicGetFunc() {
		return func;
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
			case B3backendPackage.BTC_PLUGGABLE__FUNC:
				if(resolve)
					return getFunc();
				return basicGetFunc();
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
			case B3backendPackage.BTC_PLUGGABLE__FUNC:
				return func != null;
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
			case B3backendPackage.BTC_PLUGGABLE__FUNC:
				setFunc((BJavaFunction) newValue);
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
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BTC_PLUGGABLE__FUNC:
				setFunc((BJavaFunction) null);
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
	public BJavaFunction getFunc() {
		if(func != null && func.eIsProxy()) {
			InternalEObject oldFunc = (InternalEObject) func;
			func = (BJavaFunction) eResolveProxy(oldFunc);
			if(func != oldFunc) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3backendPackage.BTC_PLUGGABLE__FUNC, oldFunc, func));
			}
		}
		return func;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public B3FunctionType getSignature(Type[] types) {
		try {
			return (B3FunctionType) func.internalCall(null, new Object[] { types }, new Type[] { types.getClass() });
		}
		catch(Throwable x) {
			System.err.println("type calculator faile for tc: " + func.getName());
			x.printStackTrace();
		}
		// TODO: NOT A VERY ROBUST SOLUTION
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFunc(BJavaFunction newFunc) {
		BJavaFunction oldFunc = func;
		func = newFunc;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BTC_PLUGGABLE__FUNC, oldFunc, func));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BTC_PLUGGABLE;
	}

} // BTCPluggableImpl
