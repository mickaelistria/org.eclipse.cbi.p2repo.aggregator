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
import org.eclipse.b3.build.BuildCallOnDeclaredRequirement;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Call On Declared Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuildCallOnDeclaredRequirementImpl#getRequiredCapabilityDeclaration <em>Required Capability Declaration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuildCallOnDeclaredRequirementImpl extends BuildCallSingleImpl implements BuildCallOnDeclaredRequirement {
	/**
	 * The cached value of the '{@link #getRequiredCapabilityDeclaration() <em>Required Capability Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredCapabilityDeclaration()
	 * @generated
	 * @ordered
	 */
	protected RequiredCapability requiredCapabilityDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuildCallOnDeclaredRequirementImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallSingleImpl#basicGetRequiredCapability()
	 */
	@Override
	public RequiredCapability basicGetRequiredCapability() {
		return getRequiredCapabilityDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRequiredCapabilityDeclaration(RequiredCapability newRequiredCapabilityDeclaration,
			NotificationChain msgs) {
		RequiredCapability oldRequiredCapabilityDeclaration = requiredCapabilityDeclaration;
		requiredCapabilityDeclaration = newRequiredCapabilityDeclaration;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET,
				B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION,
				oldRequiredCapabilityDeclaration, newRequiredCapabilityDeclaration);
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
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION:
				return getRequiredCapabilityDeclaration();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION:
				return basicSetRequiredCapabilityDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION:
				return requiredCapabilityDeclaration != null;
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
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION:
				setRequiredCapabilityDeclaration((RequiredCapability) newValue);
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
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION:
				setRequiredCapabilityDeclaration((RequiredCapability) null);
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
	public RequiredCapability getRequiredCapabilityDeclaration() {
		return requiredCapabilityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequiredCapabilityDeclaration(RequiredCapability newRequiredCapabilityDeclaration) {
		if(newRequiredCapabilityDeclaration != requiredCapabilityDeclaration) {
			NotificationChain msgs = null;
			if(requiredCapabilityDeclaration != null)
				msgs = ((InternalEObject) requiredCapabilityDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION, null, msgs);
			if(newRequiredCapabilityDeclaration != null)
				msgs = ((InternalEObject) newRequiredCapabilityDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION, null, msgs);
			msgs = basicSetRequiredCapabilityDeclaration(newRequiredCapabilityDeclaration, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION,
				newRequiredCapabilityDeclaration, newRequiredCapabilityDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_CALL_ON_DECLARED_REQUIREMENT;
	}

} // BuildCallOnDeclaredRequirementImpl
