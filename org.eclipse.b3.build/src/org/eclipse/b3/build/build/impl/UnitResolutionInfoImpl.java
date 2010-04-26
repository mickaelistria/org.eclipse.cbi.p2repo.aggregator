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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.UnitResolutionInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Resolution Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.UnitResolutionInfoImpl#getUnit <em>Unit</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.UnitResolutionInfoImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UnitResolutionInfoImpl extends ResolutionInfoImpl implements UnitResolutionInfo {
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected BExecutionContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UnitResolutionInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExecutionContext basicGetContext() {
		return context;
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
			case B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT:
				if(resolve)
					return getUnit();
				return basicGetUnit();
			case B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT:
				if(resolve)
					return getContext();
				return basicGetContext();
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
			case B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT:
				return unit != null;
			case B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT:
				return context != null;
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
			case B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT:
				setUnit((BuildUnit) newValue);
				return;
			case B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT:
				setContext((BExecutionContext) newValue);
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
		return B3BuildPackage.Literals.UNIT_RESOLUTION_INFO;
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
			case B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT:
				setUnit((BuildUnit) null);
				return;
			case B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT:
				setContext((BExecutionContext) null);
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
	public BExecutionContext getContext() {
		if(context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (BExecutionContext) eResolveProxy(oldContext);
			if(context != oldContext) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT, oldContext, context));
			}
		}
		return context;
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
						this, Notification.RESOLVE, B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT, oldUnit, unit));
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
	public void setContext(BExecutionContext newContext) {
		BExecutionContext oldContext = context;
		context = newContext;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_RESOLUTION_INFO__CONTEXT, oldContext, context));
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
				this, Notification.SET, B3BuildPackage.UNIT_RESOLUTION_INFO__UNIT, oldUnit, unit));
	}

} // UnitResolutionInfoImpl
