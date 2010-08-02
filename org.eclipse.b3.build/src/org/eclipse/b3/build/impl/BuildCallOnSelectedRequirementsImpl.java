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
package org.eclipse.b3.build.impl;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildCallOnSelectedRequirements;
import org.eclipse.b3.build.CapabilityPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Call On Selected Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.BuildCallOnSelectedRequirementsImpl#getRequiredPredicate <em>Required Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildCallOnSelectedRequirementsImpl extends BuildCallMultipleImpl implements
		BuildCallOnSelectedRequirements {
	/**
	 * The cached value of the '{@link #getRequiredPredicate() <em>Required Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPredicate()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPredicate requiredPredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildCallOnSelectedRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredPredicate(CapabilityPredicate newRequiredPredicate, NotificationChain msgs) {
		CapabilityPredicate oldRequiredPredicate = requiredPredicate;
		requiredPredicate = newRequiredPredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE,
				oldRequiredPredicate, newRequiredPredicate);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE:
				return getRequiredPredicate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE:
				return basicSetRequiredPredicate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE:
				return requiredPredicate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE:
				setRequiredPredicate((CapabilityPredicate) newValue);
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
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_CALL_ON_SELECTED_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE:
				setRequiredPredicate((CapabilityPredicate) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPredicate getRequiredPredicate() {
		return requiredPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPredicate(CapabilityPredicate newRequiredPredicate) {
		if(newRequiredPredicate != requiredPredicate) {
			NotificationChain msgs = null;
			if(requiredPredicate != null)
				msgs = ((InternalEObject) requiredPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE, null, msgs);
			if(newRequiredPredicate != null)
				msgs = ((InternalEObject) newRequiredPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE, null, msgs);
			msgs = basicSetRequiredPredicate(newRequiredPredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE,
				newRequiredPredicate, newRequiredPredicate));
	}

} // BuildCallOnSelectedRequirementsImpl
