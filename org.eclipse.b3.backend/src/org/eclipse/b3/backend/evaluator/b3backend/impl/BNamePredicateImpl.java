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

import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BPatternLiteralExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BName Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl#getNamePattern <em>Name Pattern</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BNamePredicateImpl extends EObjectImpl implements BNamePredicate {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamePattern() <em>Name Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNamePattern()
	 * @generated
	 * @ordered
	 */
	protected BPatternLiteralExpression namePattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BNamePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamePattern(BPatternLiteralExpression newNamePattern, NotificationChain msgs) {
		BPatternLiteralExpression oldNamePattern = namePattern;
		namePattern = newNamePattern;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BNAME_PREDICATE__NAME_PATTERN, oldNamePattern, newNamePattern);
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
			case B3backendPackage.BNAME_PREDICATE__NAME:
				return getName();
			case B3backendPackage.BNAME_PREDICATE__NAME_PATTERN:
				return getNamePattern();
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
			case B3backendPackage.BNAME_PREDICATE__NAME_PATTERN:
				return basicSetNamePattern(null, msgs);
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
			case B3backendPackage.BNAME_PREDICATE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BNAME_PREDICATE__NAME_PATTERN:
				return namePattern != null;
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
			case B3backendPackage.BNAME_PREDICATE__NAME:
				setName((String) newValue);
				return;
			case B3backendPackage.BNAME_PREDICATE__NAME_PATTERN:
				setNamePattern((BPatternLiteralExpression) newValue);
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
			case B3backendPackage.BNAME_PREDICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BNAME_PREDICATE__NAME_PATTERN:
				setNamePattern((BPatternLiteralExpression) null);
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPatternLiteralExpression getNamePattern() {
		return namePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Matches name parameter against a literal, ANY, or Regexp. If literal is specified, this match is used,
	 * if pattern expression is ANY, or Regexp, the name is matches against this expression. Throws B3InteralError
	 * if expression is something else, or if all are null.
	 * TODO: Add model validation
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean matches(String name) {
		String namePattern = getName(); // simple compare against a string
		if(namePattern != null)
			return namePattern.equals(name);

		// this is a name pattern of some sort
		// currently supporting ANY, or Regexp - pattern matching not done as
		// full expressions.
		BExpression expr = getNamePattern();
		if(expr instanceof BLiteralAny)
			return true;

		if(expr instanceof BPatternLiteralExpression)
			return ((BPatternLiteralExpression) expr).matches(name);
		throw new B3InternalError(
			"Attempt to match a BNamePredicate without a valid pattern type (literal, any, simple, or regexp");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BNAME_PREDICATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNamePattern(BPatternLiteralExpression newNamePattern) {
		if(newNamePattern != namePattern) {
			NotificationChain msgs = null;
			if(namePattern != null)
				msgs = ((InternalEObject) namePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BNAME_PREDICATE__NAME_PATTERN, null, msgs);
			if(newNamePattern != null)
				msgs = ((InternalEObject) newNamePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BNAME_PREDICATE__NAME_PATTERN, null, msgs);
			msgs = basicSetNamePattern(newNamePattern, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BNAME_PREDICATE__NAME_PATTERN, newNamePattern, newNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BNAME_PREDICATE;
	}

} // BNamePredicateImpl
