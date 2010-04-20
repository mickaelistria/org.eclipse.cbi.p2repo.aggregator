/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BBinary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BBinaryExpressionImpl extends BExpressionImpl implements BBinaryExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLeftExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression leftExpr;

	/**
	 * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRightExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression rightExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BBinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLeftExpr(BExpression newLeftExpr, NotificationChain msgs) {
		BExpression oldLeftExpr = leftExpr;
		leftExpr = newLeftExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
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
	public NotificationChain basicSetRightExpr(BExpression newRightExpr, NotificationChain msgs) {
		BExpression oldRightExpr = rightExpr;
		rightExpr = newRightExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
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
			case B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR:
				return getLeftExpr();
			case B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR:
				return getRightExpr();
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
			case B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR:
				return basicSetLeftExpr(null, msgs);
			case B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR:
				return basicSetRightExpr(null, msgs);
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
			case B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR:
				return leftExpr != null;
			case B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR:
				return rightExpr != null;
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
			case B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((BExpression) newValue);
				return;
			case B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((BExpression) newValue);
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
			case B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((BExpression) null);
				return;
			case B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((BExpression) null);
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
	public BExpression getLeftExpr() {
		return leftExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getRightExpr() {
		return rightExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLeftExpr(BExpression newLeftExpr) {
		if(newLeftExpr != leftExpr) {
			NotificationChain msgs = null;
			if(leftExpr != null)
				msgs = ((InternalEObject) leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			if(newLeftExpr != null)
				msgs = ((InternalEObject) newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			msgs = basicSetLeftExpr(newLeftExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BBINARY_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRightExpr(BExpression newRightExpr) {
		if(newRightExpr != rightExpr) {
			NotificationChain msgs = null;
			if(rightExpr != null)
				msgs = ((InternalEObject) rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			if(newRightExpr != null)
				msgs = ((InternalEObject) newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			msgs = basicSetRightExpr(newRightExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BBINARY_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BBINARY_EXPRESSION;
	}

} // BBinaryExpressionImpl
