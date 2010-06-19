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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.EffectiveCapabilityFacade;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effective Capability Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.EffectiveCapabilityFacadeImpl#getProvidedCapability <em>Provided Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectiveCapabilityFacadeImpl extends EffectiveFacadeImpl implements EffectiveCapabilityFacade {
	/**
	 * The cached value of the '{@link #getProvidedCapability() <em>Provided Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedCapability()
	 * @generated
	 * @ordered
	 */
	protected Capability providedCapability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectiveCapabilityFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetProvidedCapability() {
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY:
				if(resolve)
					return getProvidedCapability();
				return basicGetProvidedCapability();
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
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY:
				return providedCapability != null;
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
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY:
				setProvidedCapability((Capability) newValue);
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
		return B3BuildPackage.Literals.EFFECTIVE_CAPABILITY_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY:
				setProvidedCapability((Capability) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getProvidedCapability() {
		if(providedCapability != null && providedCapability.eIsProxy()) {
			InternalEObject oldProvidedCapability = (InternalEObject) providedCapability;
			providedCapability = (Capability) eResolveProxy(oldProvidedCapability);
			if(providedCapability != oldProvidedCapability) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY,
						oldProvidedCapability, providedCapability));
			}
		}
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedCapability(Capability newProvidedCapability) {
		Capability oldProvidedCapability = providedCapability;
		providedCapability = newProvidedCapability;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY,
				oldProvidedCapability, providedCapability));
	}

} // EffectiveCapabilityFacadeImpl
