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

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.PathVector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Path Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl#getCondExpr <em>Cond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl#getPathVectors <em>Path Vectors</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConditionalPathVectorImpl extends EObjectImpl implements ConditionalPathVector {
	/**
	 * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression condExpr;

	/**
	 * The cached value of the '{@link #getPathVectors() <em>Path Vectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPathVectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVector> pathVectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConditionalPathVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCondExpr(BExpression newCondExpr, NotificationChain msgs) {
		BExpression oldCondExpr = condExpr;
		condExpr = newCondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR, oldCondExpr, newCondExpr);
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
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR:
				return getCondExpr();
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS:
				return getPathVectors();
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
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR:
				return basicSetCondExpr(null, msgs);
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS:
				return ((InternalEList<?>) getPathVectors()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR:
				return condExpr != null;
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS:
				return pathVectors != null && !pathVectors.isEmpty();
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
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR:
				setCondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS:
				getPathVectors().clear();
				getPathVectors().addAll((Collection<? extends PathVector>) newValue);
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
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR:
				setCondExpr((BExpression) null);
				return;
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS:
				getPathVectors().clear();
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
	public BExpression getCondExpr() {
		return condExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PathVector> getPathVectors() {
		if(pathVectors == null) {
			pathVectors = new EObjectContainmentEList<PathVector>(
				PathVector.class, this, B3BuildPackage.CONDITIONAL_PATH_VECTOR__PATH_VECTORS);
		}
		return pathVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCondExpr(BExpression newCondExpr) {
		if(newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if(condExpr != null)
				msgs = ((InternalEObject) condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR, null, msgs);
			if(newCondExpr != null)
				msgs = ((InternalEObject) newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONDITIONAL_PATH_VECTOR__COND_EXPR, newCondExpr, newCondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.CONDITIONAL_PATH_VECTOR;
	}

} // ConditionalPathVectorImpl
