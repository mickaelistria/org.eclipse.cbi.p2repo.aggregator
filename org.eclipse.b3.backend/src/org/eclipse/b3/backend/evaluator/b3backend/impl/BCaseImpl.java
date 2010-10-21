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

import java.util.Collection;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
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
 * An implementation of the model object '<em><b>BCase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl#getConditionExpr <em>Condition Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl#getThenExpr <em>Then Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BCaseImpl extends EObjectImpl implements BCase {
	/**
	 * The cached value of the '{@link #getConditionExpr() <em>Condition Expr</em>}' containment reference list.
	 * <!-- begin-user-doc -->x x
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConditionExpr()
	 * @generated
	 * @ordered
	 */
	protected EList<BExpression> conditionExpr;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BCaseImpl() {
		super();
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
				this, Notification.SET, B3backendPackage.BCASE__THEN_EXPR, oldThenExpr, newThenExpr);
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
			case B3backendPackage.BCASE__CONDITION_EXPR:
				return getConditionExpr();
			case B3backendPackage.BCASE__THEN_EXPR:
				return getThenExpr();
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
			case B3backendPackage.BCASE__CONDITION_EXPR:
				return ((InternalEList<?>) getConditionExpr()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BCASE__THEN_EXPR:
				return basicSetThenExpr(null, msgs);
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
			case B3backendPackage.BCASE__CONDITION_EXPR:
				return conditionExpr != null && !conditionExpr.isEmpty();
			case B3backendPackage.BCASE__THEN_EXPR:
				return thenExpr != null;
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
			case B3backendPackage.BCASE__CONDITION_EXPR:
				getConditionExpr().clear();
				getConditionExpr().addAll((Collection<? extends BExpression>) newValue);
				return;
			case B3backendPackage.BCASE__THEN_EXPR:
				setThenExpr((BExpression) newValue);
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
			case B3backendPackage.BCASE__CONDITION_EXPR:
				getConditionExpr().clear();
				return;
			case B3backendPackage.BCASE__THEN_EXPR:
				setThenExpr((BExpression) null);
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
	public EList<BExpression> getConditionExpr() {
		if(conditionExpr == null) {
			conditionExpr = new EObjectContainmentEList<BExpression>(
				BExpression.class, this, B3backendPackage.BCASE__CONDITION_EXPR);
		}
		return conditionExpr;
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean matches(Object a, Object b) {
		Type[] ai = a.getClass().getGenericInterfaces();
		Type[] bi = b.getClass().getGenericInterfaces();
		Type aType = null;
		for(int i = 0; i < ai.length; i++) {
			Type t = ai[i];
			if(t instanceof ParameterizedType && ((ParameterizedType) t).getRawType() == Comparable.class) {
				aType = ((ParameterizedType) t).getActualTypeArguments()[0];
				break;
			}
		}
		Type bType = null;
		for(int i = 0; i < bi.length; i++) {
			Type t = bi[i];
			if(t instanceof ParameterizedType && ((ParameterizedType) t).getRawType() == Comparable.class) {
				bType = ((ParameterizedType) t).getActualTypeArguments()[0];
				break;
			}
		}
		Class bClass = bType != null && bType instanceof Class
				? ((Class) bType)
				: null;
		Class aClass = aType != null && aType instanceof Class
				? ((Class) aType)
				: null;
		if(aClass == null && bClass == null)
			return false;

		if(aClass != null && aClass.isAssignableFrom(b.getClass()))
			if(((Comparable) a).compareTo(b) == 0)
				return true;
		if(bClass != null && bClass.isAssignableFrom(a.getClass()))
			if(((Comparable) a).compareTo(b) == 0)
				return true;
		return false;
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
						B3backendPackage.BCASE__THEN_EXPR, null, msgs);
			if(newThenExpr != null)
				msgs = ((InternalEObject) newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCASE__THEN_EXPR, null, msgs);
			msgs = basicSetThenExpr(newThenExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCASE__THEN_EXPR, newThenExpr, newThenExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCASE;
	}

} // BCaseImpl
