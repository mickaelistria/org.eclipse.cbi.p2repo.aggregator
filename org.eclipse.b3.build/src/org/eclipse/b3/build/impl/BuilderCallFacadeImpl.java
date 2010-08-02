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

import java.util.Collection;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderCall;
import org.eclipse.b3.build.BuilderCallFacade;
import org.eclipse.b3.build.RequiredCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Call Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.BuilderCallFacadeImpl#getBuilderReference <em>Builder Reference</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.BuilderCallFacadeImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.BuilderCallFacadeImpl#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderCallFacadeImpl extends EObjectImpl implements BuilderCallFacade {
	/**
	 * The cached value of the '{@link #getBuilderReference() <em>Builder Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderReference()
	 * @generated
	 * @ordered
	 */
	protected BuilderCall builderReference;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliases;

	/**
	 * The cached value of the '{@link #getRequiredCapability() <em>Required Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapability()
	 * @generated
	 * @ordered
	 */
	protected RequiredCapability requiredCapability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderCallFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderCall basicGetBuilderReference() {
		return builderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability basicGetRequiredCapability() {
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE:
				if(resolve)
					return getBuilderReference();
				return basicGetBuilderReference();
			case B3BuildPackage.BUILDER_CALL_FACADE__ALIASES:
				return getAliases();
			case B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY:
				if(resolve)
					return getRequiredCapability();
				return basicGetRequiredCapability();
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
			case B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE:
				return builderReference != null;
			case B3BuildPackage.BUILDER_CALL_FACADE__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY:
				return requiredCapability != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE:
				setBuilderReference((BuilderCall) newValue);
				return;
			case B3BuildPackage.BUILDER_CALL_FACADE__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>) newValue);
				return;
			case B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY:
				setRequiredCapability((RequiredCapability) newValue);
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
		return B3BuildPackage.Literals.BUILDER_CALL_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE:
				setBuilderReference((BuilderCall) null);
				return;
			case B3BuildPackage.BUILDER_CALL_FACADE__ALIASES:
				getAliases().clear();
				return;
			case B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY:
				setRequiredCapability((RequiredCapability) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAliases() {
		if(aliases == null) {
			aliases = new EDataTypeUniqueEList<String>(String.class, this, B3BuildPackage.BUILDER_CALL_FACADE__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderCall getBuilderReference() {
		if(builderReference != null && builderReference.eIsProxy()) {
			InternalEObject oldBuilderReference = (InternalEObject) builderReference;
			builderReference = (BuilderCall) eResolveProxy(oldBuilderReference);
			if(builderReference != oldBuilderReference) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE,
						oldBuilderReference, builderReference));
			}
		}
		return builderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability getRequiredCapability() {
		if(requiredCapability != null && requiredCapability.eIsProxy()) {
			InternalEObject oldRequiredCapability = (InternalEObject) requiredCapability;
			requiredCapability = (RequiredCapability) eResolveProxy(oldRequiredCapability);
			if(requiredCapability != oldRequiredCapability) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY,
						oldRequiredCapability, requiredCapability));
			}
		}
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilderReference(BuilderCall newBuilderReference) {
		BuilderCall oldBuilderReference = builderReference;
		builderReference = newBuilderReference;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CALL_FACADE__BUILDER_REFERENCE, oldBuilderReference,
				builderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCapability(RequiredCapability newRequiredCapability) {
		RequiredCapability oldRequiredCapability = requiredCapability;
		requiredCapability = newRequiredCapability;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CALL_FACADE__REQUIRED_CAPABILITY, oldRequiredCapability,
				requiredCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aliases: ");
		result.append(aliases);
		result.append(')');
		return result.toString();
	}

} // BuilderCallFacadeImpl
