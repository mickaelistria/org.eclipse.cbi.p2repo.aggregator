/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BIf Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl#getConditionExpr <em>Condition Expr </em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl#getThenExpr <em>Then Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BIfExpressionImpl extends BExpressionImpl implements BIfExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getConditionExpr() <em>Condition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConditionExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression conditionExpr;

	/**
	 * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getThenExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression thenExpr;

	/**
	 * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getElseExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression elseExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BIfExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConditionExpr(BExpression newConditionExpr, NotificationChain msgs) {
		BExpression oldConditionExpr = conditionExpr;
		conditionExpr = newConditionExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR, oldConditionExpr,
				newConditionExpr);
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
	public NotificationChain basicSetElseExpr(BExpression newElseExpr, NotificationChain msgs) {
		BExpression oldElseExpr = elseExpr;
		elseExpr = newElseExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__ELSE_EXPR, oldElseExpr, newElseExpr);
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
	public NotificationChain basicSetThenExpr(BExpression newThenExpr, NotificationChain msgs) {
		BExpression oldThenExpr = thenExpr;
		thenExpr = newThenExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__THEN_EXPR, oldThenExpr, newThenExpr);
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
			case B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR:
				return getConditionExpr();
			case B3backendPackage.BIF_EXPRESSION__THEN_EXPR:
				return getThenExpr();
			case B3backendPackage.BIF_EXPRESSION__ELSE_EXPR:
				return getElseExpr();
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
			case B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR:
				return basicSetConditionExpr(null, msgs);
			case B3backendPackage.BIF_EXPRESSION__THEN_EXPR:
				return basicSetThenExpr(null, msgs);
			case B3backendPackage.BIF_EXPRESSION__ELSE_EXPR:
				return basicSetElseExpr(null, msgs);
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
			case B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR:
				return conditionExpr != null;
			case B3backendPackage.BIF_EXPRESSION__THEN_EXPR:
				return thenExpr != null;
			case B3backendPackage.BIF_EXPRESSION__ELSE_EXPR:
				return elseExpr != null;
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
			case B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR:
				setConditionExpr((BExpression) newValue);
				return;
			case B3backendPackage.BIF_EXPRESSION__THEN_EXPR:
				setThenExpr((BExpression) newValue);
				return;
			case B3backendPackage.BIF_EXPRESSION__ELSE_EXPR:
				setElseExpr((BExpression) newValue);
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
			case B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR:
				setConditionExpr((BExpression) null);
				return;
			case B3backendPackage.BIF_EXPRESSION__THEN_EXPR:
				setThenExpr((BExpression) null);
				return;
			case B3backendPackage.BIF_EXPRESSION__ELSE_EXPR:
				setElseExpr((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Object cond = conditionExpr.evaluate(ctx);
		if(!(cond instanceof Boolean))
			throw BackendHelper.createException(
				conditionExpr, "If-condition is not a Boolean, was : {0}", new Object[] { cond.getClass().toString() });
		if(((Boolean) cond).booleanValue())
			return thenExpr.evaluate(ctx);
		if(elseExpr != null)
			return elseExpr.evaluate(ctx);
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getConditionExpr() {
		return conditionExpr;
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return TypeUtils.getCommonSuperType(new Type[] { thenExpr.getDeclaredType(ctx), elseExpr.getDeclaredType(ctx) });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getElseExpr() {
		return elseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getThenExpr() {
		return thenExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConditionExpr(BExpression newConditionExpr) {
		if(newConditionExpr != conditionExpr) {
			NotificationChain msgs = null;
			if(conditionExpr != null)
				msgs = ((InternalEObject) conditionExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR, null, msgs);
			if(newConditionExpr != null)
				msgs = ((InternalEObject) newConditionExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR, null, msgs);
			msgs = basicSetConditionExpr(newConditionExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__CONDITION_EXPR, newConditionExpr,
				newConditionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setElseExpr(BExpression newElseExpr) {
		if(newElseExpr != elseExpr) {
			NotificationChain msgs = null;
			if(elseExpr != null)
				msgs = ((InternalEObject) elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__ELSE_EXPR, null, msgs);
			if(newElseExpr != null)
				msgs = ((InternalEObject) newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__ELSE_EXPR, null, msgs);
			msgs = basicSetElseExpr(newElseExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__ELSE_EXPR, newElseExpr, newElseExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThenExpr(BExpression newThenExpr) {
		if(newThenExpr != thenExpr) {
			NotificationChain msgs = null;
			if(thenExpr != null)
				msgs = ((InternalEObject) thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__THEN_EXPR, null, msgs);
			if(newThenExpr != null)
				msgs = ((InternalEObject) newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BIF_EXPRESSION__THEN_EXPR, null, msgs);
			msgs = basicSetThenExpr(newThenExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BIF_EXPRESSION__THEN_EXPR, newThenExpr, newThenExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BIF_EXPRESSION;
	}
} // BIfExpressionImpl
