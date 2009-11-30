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

import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B3 Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl#getRawType <em>Raw Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl#getActualArgumentsList <em>Actual Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class B3ParameterizedTypeImpl extends EObjectImpl implements B3ParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getOwnerType() <em>Owner Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerType()
	 * @generated
	 * @ordered
	 */
	protected Type ownerType;

	/**
	 * The cached value of the '{@link #getRawType() <em>Raw Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawType()
	 * @generated
	 * @ordered
	 */
	protected Type rawType;

	/**
	 * The cached value of the '{@link #getActualArgumentsList() <em>Actual Arguments List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArgumentsList()
	 * @generated
	 * @ordered
	 */
	protected Type actualArgumentsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3ParameterizedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.B3_PARAMETERIZED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnerType() {
		if (ownerType != null && ((EObject)ownerType).eIsProxy()) {
			InternalEObject oldOwnerType = (InternalEObject)ownerType;
			ownerType = (Type)eResolveProxy(oldOwnerType);
			if (ownerType != oldOwnerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE, oldOwnerType, ownerType));
			}
		}
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetOwnerType() {
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerType(Type newOwnerType) {
		Type oldOwnerType = ownerType;
		ownerType = newOwnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE, oldOwnerType, ownerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getRawType() {
		if (rawType != null && ((EObject)rawType).eIsProxy()) {
			InternalEObject oldRawType = (InternalEObject)rawType;
			rawType = (Type)eResolveProxy(oldRawType);
			if (rawType != oldRawType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE, oldRawType, rawType));
			}
		}
		return rawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetRawType() {
		return rawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawType(Type newRawType) {
		Type oldRawType = rawType;
		rawType = newRawType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE, oldRawType, rawType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getActualArgumentsList() {
		if (actualArgumentsList != null && ((EObject)actualArgumentsList).eIsProxy()) {
			InternalEObject oldActualArgumentsList = (InternalEObject)actualArgumentsList;
			actualArgumentsList = (Type)eResolveProxy(oldActualArgumentsList);
			if (actualArgumentsList != oldActualArgumentsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST, oldActualArgumentsList, actualArgumentsList));
			}
		}
		return actualArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetActualArgumentsList() {
		return actualArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualArgumentsList(Type newActualArgumentsList) {
		Type oldActualArgumentsList = actualArgumentsList;
		actualArgumentsList = newActualArgumentsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST, oldActualArgumentsList, actualArgumentsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getActualTypeArguments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE:
				if (resolve) return getOwnerType();
				return basicGetOwnerType();
			case B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE:
				if (resolve) return getRawType();
				return basicGetRawType();
			case B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST:
				if (resolve) return getActualArgumentsList();
				return basicGetActualArgumentsList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE:
				setOwnerType((Type)newValue);
				return;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE:
				setRawType((Type)newValue);
				return;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST:
				setActualArgumentsList((Type)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE:
				setOwnerType((Type)null);
				return;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE:
				setRawType((Type)null);
				return;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST:
				setActualArgumentsList((Type)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE:
				return ownerType != null;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__RAW_TYPE:
				return rawType != null;
			case B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST:
				return actualArgumentsList != null;
		}
		return super.eIsSet(featureID);
	}

} //B3ParameterizedTypeImpl
