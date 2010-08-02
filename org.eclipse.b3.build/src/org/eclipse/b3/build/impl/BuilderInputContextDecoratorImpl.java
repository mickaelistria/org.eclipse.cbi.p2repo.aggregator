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

import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderInputContextDecorator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Input Context Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.BuilderInputContextDecoratorImpl#getWithExpr <em>With Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderInputContextDecoratorImpl extends BuilderInputDecoratorImpl implements BuilderInputContextDecorator {
	/**
	 * The cached value of the '{@link #getWithExpr() <em>With Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithExpr()
	 * @generated
	 * @ordered
	 */
	protected BWithExpression withExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderInputContextDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithExpr(BWithExpression newWithExpr, NotificationChain msgs) {
		BWithExpression oldWithExpr = withExpr;
		withExpr = newWithExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR, oldWithExpr,
				newWithExpr);
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR:
				return getWithExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR:
				return basicSetWithExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR:
				return withExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR:
				setWithExpr((BWithExpression) newValue);
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
		return B3BuildPackage.Literals.BUILDER_INPUT_CONTEXT_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR:
				setWithExpr((BWithExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWithExpression getWithExpr() {
		return withExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithExpr(BWithExpression newWithExpr) {
		if(newWithExpr != withExpr) {
			NotificationChain msgs = null;
			if(withExpr != null)
				msgs = ((InternalEObject) withExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR, null, msgs);
			if(newWithExpr != null)
				msgs = ((InternalEObject) newWithExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR, null, msgs);
			msgs = basicSetWithExpr(newWithExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR, newWithExpr,
				newWithExpr));
	}

} // BuilderInputContextDecoratorImpl
