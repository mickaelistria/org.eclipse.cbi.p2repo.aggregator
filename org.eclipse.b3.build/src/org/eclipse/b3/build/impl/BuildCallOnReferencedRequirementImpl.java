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
import org.eclipse.b3.build.BuildCallOnReferencedRequirement;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Call On Referenced Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.BuildCallOnReferencedRequirementImpl#getRequiredCapabilityReference <em>Required Capability Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildCallOnReferencedRequirementImpl extends BuildCallSingleImpl implements
		BuildCallOnReferencedRequirement {
	/**
	 * The cached value of the '{@link #getRequiredCapabilityReference() <em>Required Capability Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilityReference()
	 * @generated
	 * @ordered
	 */
	protected RequiredCapability requiredCapabilityReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildCallOnReferencedRequirementImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallSingleImpl#basicGetRequiredCapability()
	 */
	@Override
	public RequiredCapability basicGetRequiredCapability() {
		return getRequiredCapabilityReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability basicGetRequiredCapabilityReference() {
		return requiredCapabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE:
				if(resolve)
					return getRequiredCapabilityReference();
				return basicGetRequiredCapabilityReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE:
				return requiredCapabilityReference != null;
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
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE:
				setRequiredCapabilityReference((RequiredCapability) newValue);
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
		return B3BuildPackage.Literals.BUILD_CALL_ON_REFERENCED_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE:
				setRequiredCapabilityReference((RequiredCapability) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability getRequiredCapabilityReference() {
		if(requiredCapabilityReference != null && requiredCapabilityReference.eIsProxy()) {
			InternalEObject oldRequiredCapabilityReference = (InternalEObject) requiredCapabilityReference;
			requiredCapabilityReference = (RequiredCapability) eResolveProxy(oldRequiredCapabilityReference);
			if(requiredCapabilityReference != oldRequiredCapabilityReference) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE,
						B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE,
						oldRequiredCapabilityReference, requiredCapabilityReference));
			}
		}
		return requiredCapabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCapabilityReference(RequiredCapability newRequiredCapabilityReference) {
		RequiredCapability oldRequiredCapabilityReference = requiredCapabilityReference;
		requiredCapabilityReference = newRequiredCapabilityReference;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE,
				oldRequiredCapabilityReference, requiredCapabilityReference));
	}

} // BuildCallOnReferencedRequirementImpl
