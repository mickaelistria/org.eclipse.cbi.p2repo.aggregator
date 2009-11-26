/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSwitch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl#getCaseList <em>Case List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BSwitchExpressionImpl extends BExpressionImpl implements BSwitchExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "<copyright>Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r</copyright>";

	/**
	 * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpression switchExpression;

	/**
	 * The cached value of the '{@link #getCaseList() <em>Case List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseList()
	 * @generated
	 * @ordered
	 */
	protected BCase caseList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSwitchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BSWITCH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getSwitchExpression() {
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpression(BExpression newSwitchExpression, NotificationChain msgs) {
		BExpression oldSwitchExpression = switchExpression;
		switchExpression = newSwitchExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, oldSwitchExpression, newSwitchExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchExpression(BExpression newSwitchExpression) {
		if (newSwitchExpression != switchExpression) {
			NotificationChain msgs = null;
			if (switchExpression != null)
				msgs = ((InternalEObject)switchExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			if (newSwitchExpression != null)
				msgs = ((InternalEObject)newSwitchExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			msgs = basicSetSwitchExpression(newSwitchExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION, newSwitchExpression, newSwitchExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCase getCaseList() {
		return caseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseList(BCase newCaseList, NotificationChain msgs) {
		BCase oldCaseList = caseList;
		caseList = newCaseList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST, oldCaseList, newCaseList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseList(BCase newCaseList) {
		if (newCaseList != caseList) {
			NotificationChain msgs = null;
			if (caseList != null)
				msgs = ((InternalEObject)caseList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST, null, msgs);
			if (newCaseList != null)
				msgs = ((InternalEObject)newCaseList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST, null, msgs);
			msgs = basicSetCaseList(newCaseList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST, newCaseList, newCaseList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return basicSetSwitchExpression(null, msgs);
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return basicSetCaseList(null, msgs);
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
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return getSwitchExpression();
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return getCaseList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((BExpression)newValue);
				return;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				setCaseList((BCase)newValue);
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
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((BExpression)null);
				return;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				setCaseList((BCase)null);
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
			case B3backendPackage.BSWITCH_EXPRESSION__SWITCH_EXPRESSION:
				return switchExpression != null;
			case B3backendPackage.BSWITCH_EXPRESSION__CASE_LIST:
				return caseList != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Object switchValue = switchExpression == null ? Boolean.TRUE : switchExpression.evaluate(ctx);
		// guard against no cases - value is null
		return caseList != null ? caseList.evaluate(ctx, switchValue) : null;
	}
	/**
	 * Returns the common type of all cases.
	 * TODO: Optimize by caching - the type does not change over time, unless a case expression
	 * is changed.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		ArrayList<Type> typeList = new ArrayList<Type>();
		for(BCase c = caseList; c != null; c = c.getNextCase()) {
			typeList.add(c.getDeclaredType(ctx));
		}
		return TypeUtils.getCommonSuperType(typeList.toArray(new Type[typeList.size()]));
	}
} //BSwitchExpressionImpl
