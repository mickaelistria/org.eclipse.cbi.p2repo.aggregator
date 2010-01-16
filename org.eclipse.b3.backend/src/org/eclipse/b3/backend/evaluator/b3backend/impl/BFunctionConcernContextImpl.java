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

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.ParameterPredicate;

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
 * An implementation of the model object '<em><b>BFunction Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#getParameterPredicates <em>Parameter Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFunctionConcernContextImpl extends BConcernContextImpl implements BFunctionConcernContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePredicate()
	 * @generated
	 * @ordered
	 */
	protected BFunctionNamePredicate namePredicate;

	/**
	 * The cached value of the '{@link #getParameterPredicates() <em>Parameter Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterPredicate> parameterPredicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFunctionConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BFUNCTION_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionNamePredicate getNamePredicate() {
		return namePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BFunctionNamePredicate newNamePredicate, NotificationChain msgs) {
		BFunctionNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, oldNamePredicate, newNamePredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePredicate(BFunctionNamePredicate newNamePredicate) {
		if (newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if (namePredicate != null)
				msgs = ((InternalEObject)namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
			if (newNamePredicate != null)
				msgs = ((InternalEObject)newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, newNamePredicate, newNamePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterPredicate> getParameterPredicates() {
		if (parameterPredicates == null) {
			parameterPredicates = new EObjectContainmentEList<ParameterPredicate>(ParameterPredicate.class, this, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES);
		}
		return parameterPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return basicSetNamePredicate(null, msgs);
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES:
				return ((InternalEList<?>)getParameterPredicates()).basicRemove(otherEnd, msgs);
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return getNamePredicate();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES:
				return getParameterPredicates();
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				setNamePredicate((BFunctionNamePredicate)newValue);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES:
				getParameterPredicates().clear();
				getParameterPredicates().addAll((Collection<? extends ParameterPredicate>)newValue);
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				setNamePredicate((BFunctionNamePredicate)null);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES:
				getParameterPredicates().clear();
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return namePredicate != null;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETER_PREDICATES:
				return parameterPredicates != null && !parameterPredicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BFunctionConcernContextImpl
