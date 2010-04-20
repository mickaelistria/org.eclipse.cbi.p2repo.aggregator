/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGuard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl#getGuardExpr <em>Guard Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BGuardExpressionImpl extends BGuardImpl implements BGuardExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getGuardExpr() <em>Guard Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression guardExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BGuardExpressionImpl() {
		super();
	}

	// @Override
	public boolean accepts(BFunction f, BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable {
		String[] parameterNames = f.getParameterNames();
		BExecutionContext octx = ctx.createOuterContext();
		for(int i = 0; i < types.length; i++)
			octx.defineFinalValue(parameterNames[i], types[i], types[i].getClass());
		Object result = guardExpr.evaluate(octx);
		return (result instanceof Boolean && ((Boolean) result) == Boolean.TRUE)
				? true
				: false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetGuardExpr(BExpression newGuardExpr, NotificationChain msgs) {
		BExpression oldGuardExpr = guardExpr;
		guardExpr = newGuardExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, oldGuardExpr, newGuardExpr);
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return getGuardExpr();
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return basicSetGuardExpr(null, msgs);
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return guardExpr != null;
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				setGuardExpr((BExpression) newValue);
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				setGuardExpr((BExpression) null);
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
	public BExpression getGuardExpr() {
		return guardExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGuardExpr(BExpression newGuardExpr) {
		if(newGuardExpr != guardExpr) {
			NotificationChain msgs = null;
			if(guardExpr != null)
				msgs = ((InternalEObject) guardExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, null, msgs);
			if(newGuardExpr != null)
				msgs = ((InternalEObject) newGuardExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, null, msgs);
			msgs = basicSetGuardExpr(newGuardExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, newGuardExpr, newGuardExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BGUARD_EXPRESSION;
	}
} // BGuardExpressionImpl
