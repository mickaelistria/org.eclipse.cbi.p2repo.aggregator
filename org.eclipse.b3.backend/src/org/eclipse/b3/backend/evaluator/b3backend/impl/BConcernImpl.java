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
import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BConcern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getSuperConcerns <em>Super Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getPropertySets <em>Property Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BConcernImpl extends BAdviceImpl implements BConcern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<BFunction> functions;

	/**
	 * The default value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected static final Type CONTAINER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected Type containerType = CONTAINER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperConcerns() <em>Super Concerns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> superConcerns;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCONCERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCONCERN__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcern> getSuperConcerns() {
		if (superConcerns == null) {
			superConcerns = new EObjectResolvingEList<BConcern>(BConcern.class, this, B3backendPackage.BCONCERN__SUPER_CONCERNS);
		}
		return superConcerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentWithInverseEList<BFunction>(BFunction.class, this, B3backendPackage.BCONCERN__FUNCTIONS, B3backendPackage.BFUNCTION__CONTAINER);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getContainerType() {
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(Type newContainerType) {
		Type oldContainerType = containerType;
		containerType = newContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCONCERN__CONTAINER_TYPE, oldContainerType, containerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if (propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(BPropertySet.class, this, B3backendPackage.BCONCERN__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return getFunctions();
			case B3backendPackage.BCONCERN__CONTAINER_TYPE:
				return getContainerType();
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				return getDocumentation();
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				return getSuperConcerns();
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return getPropertySets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BCONCERN__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends BFunction>)newValue);
				return;
			case B3backendPackage.BCONCERN__CONTAINER_TYPE:
				setContainerType((Type)newValue);
				return;
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				getSuperConcerns().clear();
				getSuperConcerns().addAll((Collection<? extends BConcern>)newValue);
				return;
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>)newValue);
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3backendPackage.BCONCERN__CONTAINER_TYPE:
				setContainerType(CONTAINER_TYPE_EDEFAULT);
				return;
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				getSuperConcerns().clear();
				return;
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				getPropertySets().clear();
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3backendPackage.BCONCERN__CONTAINER_TYPE:
				return CONTAINER_TYPE_EDEFAULT == null ? containerType != null : !CONTAINER_TYPE_EDEFAULT.equals(containerType);
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				return superConcerns != null && !superConcerns.isEmpty();
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BFunctionContainer.class) {
			switch (derivedFeatureID) {
				case B3backendPackage.BCONCERN__FUNCTIONS: return B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS;
				case B3backendPackage.BCONCERN__CONTAINER_TYPE: return B3backendPackage.BFUNCTION_CONTAINER__CONTAINER_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BFunctionContainer.class) {
			switch (baseFeatureID) {
				case B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS: return B3backendPackage.BCONCERN__FUNCTIONS;
				case B3backendPackage.BFUNCTION_CONTAINER__CONTAINER_TYPE: return B3backendPackage.BCONCERN__CONTAINER_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (containerType: ");
		result.append(containerType);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //BConcernImpl
