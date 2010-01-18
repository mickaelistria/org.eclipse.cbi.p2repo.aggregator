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

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BProperty Set Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetOperationImpl#getPropertySet <em>Property Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPropertySetOperationImpl extends BPropertyOperationImpl implements BPropertySetOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getPropertySet() <em>Property Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySet()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet propertySet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPropertySetOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BPROPERTY_SET_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet getPropertySet() {
		return propertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySet(BPropertySet newPropertySet, NotificationChain msgs) {
		BPropertySet oldPropertySet = propertySet;
		propertySet = newPropertySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET, oldPropertySet, newPropertySet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySet(BPropertySet newPropertySet) {
		if (newPropertySet != propertySet) {
			NotificationChain msgs = null;
			if (propertySet != null)
				msgs = ((InternalEObject)propertySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET, null, msgs);
			if (newPropertySet != null)
				msgs = ((InternalEObject)newPropertySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET, null, msgs);
			msgs = basicSetPropertySet(newPropertySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET, newPropertySet, newPropertySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET:
				return basicSetPropertySet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET:
				return getPropertySet();
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
			case B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET:
				setPropertySet((BPropertySet)newValue);
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
			case B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET:
				setPropertySet((BPropertySet)null);
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
			case B3backendPackage.BPROPERTY_SET_OPERATION__PROPERTY_SET:
				return propertySet != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		return getPropertySet().evaluate(ctx);
	}
	@Override
	public Object evaluateDefaults(BExecutionContext ctx) throws Throwable {
		return getPropertySet().evaluateDefaults(ctx);
	}
} //BPropertySetOperationImpl
