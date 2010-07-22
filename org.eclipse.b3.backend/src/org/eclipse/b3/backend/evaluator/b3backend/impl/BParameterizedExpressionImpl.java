/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BParameterized Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterizedExpressionImpl#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BParameterizedExpressionImpl extends BExpressionImpl implements BParameterizedExpression {
	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected BParameterList parameterList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BParameterizedExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParameterList(BParameterList newParameterList, NotificationChain msgs) {
		BParameterList oldParameterList = parameterList;
		parameterList = newParameterList;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST, oldParameterList,
				newParameterList);
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
			case B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST:
				return getParameterList();
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
			case B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
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
			case B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST:
				return parameterList != null;
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
			case B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST:
				setParameterList((BParameterList) newValue);
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
		return B3backendPackage.Literals.BPARAMETERIZED_EXPRESSION;
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
			case B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST:
				setParameterList((BParameterList) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BParameterList getParameterList() {
		if(parameterList == null)
			parameterList = B3backendFactory.eINSTANCE.createBParameterList();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParameterList(BParameterList newParameterList) {
		if(newParameterList != parameterList) {
			NotificationChain msgs = null;
			if(parameterList != null)
				msgs = ((InternalEObject) parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST, null, msgs);
			if(newParameterList != null)
				msgs = ((InternalEObject) newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST, null, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BPARAMETERIZED_EXPRESSION__PARAMETER_LIST, newParameterList,
				newParameterList));
	}

} // BParameterizedExpressionImpl
