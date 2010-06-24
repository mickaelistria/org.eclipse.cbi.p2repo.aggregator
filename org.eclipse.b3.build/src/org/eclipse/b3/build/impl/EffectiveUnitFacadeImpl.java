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
package org.eclipse.b3.build.impl;

import java.util.Collection;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.EffectiveUnitFacade;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effective Unit Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EffectiveUnitFacadeImpl extends EffectiveFacadeImpl implements EffectiveUnitFacade {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected BuildUnit unit;

	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectiveCapabilityFacade> providedCapabilities;

	/**
	 * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectiveRequirementFacade> requiredCapabilities;

	/**
	 * The cached value of the '{@link #getMetaRequiredCapabilities() <em>Meta Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMetaRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectiveRequirementFacade> metaRequiredCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EffectiveUnitFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildUnit basicGetUnit() {
		return unit;
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
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT:
				if(resolve)
					return getUnit();
				return basicGetUnit();
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES:
				return getMetaRequiredCapabilities();
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
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>) getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES:
				return ((InternalEList<?>) getMetaRequiredCapabilities()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT:
				return unit != null;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES:
				return metaRequiredCapabilities != null && !metaRequiredCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT:
				setUnit((BuildUnit) newValue);
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends EffectiveCapabilityFacade>) newValue);
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends EffectiveRequirementFacade>) newValue);
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES:
				getMetaRequiredCapabilities().clear();
				getMetaRequiredCapabilities().addAll((Collection<? extends EffectiveRequirementFacade>) newValue);
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
		return B3BuildPackage.Literals.EFFECTIVE_UNIT_FACADE;
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
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT:
				setUnit((BuildUnit) null);
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES:
				getMetaRequiredCapabilities().clear();
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
	public EList<EffectiveRequirementFacade> getMetaRequiredCapabilities() {
		if(metaRequiredCapabilities == null) {
			metaRequiredCapabilities = new EObjectContainmentEList<EffectiveRequirementFacade>(
				EffectiveRequirementFacade.class, this,
				B3BuildPackage.EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES);
		}
		return metaRequiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EffectiveCapabilityFacade> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<EffectiveCapabilityFacade>(
				EffectiveCapabilityFacade.class, this, B3BuildPackage.EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EffectiveRequirementFacade> getRequiredCapabilities() {
		if(requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentEList<EffectiveRequirementFacade>(
				EffectiveRequirementFacade.class, this, B3BuildPackage.EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildUnit getUnit() {
		if(unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject) unit;
			unit = (BuildUnit) eResolveProxy(oldUnit);
			if(unit != oldUnit) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnit(BuildUnit newUnit) {
		BuildUnit oldUnit = unit;
		unit = newUnit;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.EFFECTIVE_UNIT_FACADE__UNIT, oldUnit, unit));
	}

} // EffectiveUnitFacadeImpl
