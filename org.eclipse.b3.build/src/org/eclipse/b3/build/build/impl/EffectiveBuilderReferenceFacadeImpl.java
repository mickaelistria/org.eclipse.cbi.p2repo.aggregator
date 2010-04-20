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

import java.util.Collection;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effective Builder Reference Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl#getBuilderReference <em>Builder
 * Reference</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EffectiveBuilderReferenceFacadeImpl extends EffectiveFacadeImpl implements EffectiveBuilderReferenceFacade {
	/**
	 * The cached value of the '{@link #getBuilderReference() <em>Builder Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuilderReference()
	 * @generated
	 * @ordered
	 */
	protected BuilderReference builderReference;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EffectiveBuilderReferenceFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuilderReference basicGetBuilderReference() {
		return builderReference;
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
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE:
				if(resolve)
					return getBuilderReference();
				return basicGetBuilderReference();
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES:
				return getAliases();
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
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE:
				return builderReference != null;
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES:
				return aliases != null && !aliases.isEmpty();
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
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE:
				setBuilderReference((BuilderReference) newValue);
				return;
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>) newValue);
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
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE:
				setBuilderReference((BuilderReference) null);
				return;
			case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES:
				getAliases().clear();
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
	public EList<String> getAliases() {
		if(aliases == null) {
			aliases = new EDataTypeUniqueEList<String>(
				String.class, this, B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES);
		}
		return aliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuilderReference getBuilderReference() {
		if(builderReference != null && builderReference.eIsProxy()) {
			InternalEObject oldBuilderReference = (InternalEObject) builderReference;
			builderReference = (BuilderReference) eResolveProxy(oldBuilderReference);
			if(builderReference != oldBuilderReference) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE,
						B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE, oldBuilderReference,
						builderReference));
			}
		}
		return builderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBuilderReference(BuilderReference newBuilderReference) {
		BuilderReference oldBuilderReference = builderReference;
		builderReference = newBuilderReference;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE,
				oldBuilderReference, builderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.EFFECTIVE_BUILDER_REFERENCE_FACADE;
	}

} // EffectiveBuilderReferenceFacadeImpl
