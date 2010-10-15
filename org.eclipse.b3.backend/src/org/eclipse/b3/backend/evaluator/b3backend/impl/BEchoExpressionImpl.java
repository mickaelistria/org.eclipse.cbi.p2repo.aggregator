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
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BEchoExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BEcho Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BEchoExpressionImpl#getExpression <em>Expression</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BEchoExpressionImpl#getEchoExpression <em>Echo Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BEchoExpressionImpl extends BExpressionImpl implements BEchoExpression {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpression expression;

	/**
	 * The cached value of the '{@link #getEchoExpression() <em>Echo Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEchoExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpression echoExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BEchoExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEchoExpression(BExpression newEchoExpression, NotificationChain msgs) {
		BExpression oldEchoExpression = echoExpression;
		echoExpression = newEchoExpression;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION, oldEchoExpression,
				newEchoExpression);
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
	public NotificationChain basicSetExpression(BExpression newExpression, NotificationChain msgs) {
		BExpression oldExpression = expression;
		expression = newExpression;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BECHO_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
			case B3backendPackage.BECHO_EXPRESSION__EXPRESSION:
				return getExpression();
			case B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION:
				return getEchoExpression();
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
			case B3backendPackage.BECHO_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION:
				return basicSetEchoExpression(null, msgs);
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
			case B3backendPackage.BECHO_EXPRESSION__EXPRESSION:
				return expression != null;
			case B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION:
				return echoExpression != null;
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
			case B3backendPackage.BECHO_EXPRESSION__EXPRESSION:
				setExpression((BExpression) newValue);
				return;
			case B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION:
				setEchoExpression((BExpression) newValue);
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
			case B3backendPackage.BECHO_EXPRESSION__EXPRESSION:
				setExpression((BExpression) null);
				return;
			case B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION:
				setEchoExpression((BExpression) null);
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
	public BExpression getEchoExpression() {
		return echoExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEchoExpression(BExpression newEchoExpression) {
		if(newEchoExpression != echoExpression) {
			NotificationChain msgs = null;
			if(echoExpression != null)
				msgs = ((InternalEObject) echoExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION, null, msgs);
			if(newEchoExpression != null)
				msgs = ((InternalEObject) newEchoExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION, null, msgs);
			msgs = basicSetEchoExpression(newEchoExpression, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BECHO_EXPRESSION__ECHO_EXPRESSION, newEchoExpression,
				newEchoExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExpression(BExpression newExpression) {
		if(newExpression != expression) {
			NotificationChain msgs = null;
			if(expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BECHO_EXPRESSION__EXPRESSION, null, msgs);
			if(newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BECHO_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BECHO_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BECHO_EXPRESSION;
	}

} // BEchoExpressionImpl
