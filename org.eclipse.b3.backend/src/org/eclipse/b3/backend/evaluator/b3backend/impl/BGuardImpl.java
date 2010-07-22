/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGuard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardImpl#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BGuardImpl extends EObjectImpl implements BGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

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
	protected BGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean accepts(IFunction function, Type[] types) throws Throwable {

		Object[] paramsToUse = types;
		Type[] typesToUse = new Type[types.length];
		for(int i = 0; i < types.length; i++) {
			paramsToUse[i] = types[i];
			typesToUse[i] = types[i].getClass();
		}

		Object x = func.internalCall(null, paramsToUse, typesToUse); // Note: null context
		return x instanceof Boolean
				? ((Boolean) x).booleanValue()
				: Boolean.FALSE.booleanValue();
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
			case B3backendPackage.BGUARD__FUNC:
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
			case B3backendPackage.BGUARD__FUNC:
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
			case B3backendPackage.BGUARD__FUNC:
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
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BGUARD;
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
			case B3backendPackage.BGUARD__FUNC:
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
						this, Notification.RESOLVE, B3backendPackage.BGUARD__FUNC, oldFunc, func));
			}
		}
		return func;
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BGUARD__FUNC, oldFunc, func));
	}

} // BGuardImpl
