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

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCatch</b></em>'.
 * The BTryExpression makes use of the BCatch's type and variable name and will evaluate the
 * BCatch that matches a caught exception. (i.e. there is no exception handling in this class).
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getCatchExpr <em>Catch Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BCatchImpl extends EObjectImpl implements BCatch {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getCatchExpr() <em>Catch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCatchExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression catchExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCatchExpr(BExpression newCatchExpr, NotificationChain msgs) {
		BExpression oldCatchExpr = catchExpr;
		catchExpr = newCatchExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCATCH__CATCH_EXPR, oldCatchExpr, newCatchExpr);
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
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCATCH__TYPE, oldType, newType);
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
			case B3backendPackage.BCATCH__NAME:
				return getName();
			case B3backendPackage.BCATCH__TYPE:
				return getType();
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return getCatchExpr();
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
			case B3backendPackage.BCATCH__TYPE:
				return basicSetType(null, msgs);
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return basicSetCatchExpr(null, msgs);
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
			case B3backendPackage.BCATCH__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BCATCH__TYPE:
				return type != null;
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return catchExpr != null;
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
			case B3backendPackage.BCATCH__NAME:
				setName((String) newValue);
				return;
			case B3backendPackage.BCATCH__TYPE:
				setType((Type) newValue);
				return;
			case B3backendPackage.BCATCH__CATCH_EXPR:
				setCatchExpr((BExpression) newValue);
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
			case B3backendPackage.BCATCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BCATCH__TYPE:
				setType((Type) null);
				return;
			case B3backendPackage.BCATCH__CATCH_EXPR:
				setCatchExpr((BExpression) null);
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
	public BExpression getCatchExpr() {
		return catchExpr;
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
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCatchExpr(BExpression newCatchExpr) {
		if(newCatchExpr != catchExpr) {
			NotificationChain msgs = null;
			if(catchExpr != null)
				msgs = ((InternalEObject) catchExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCATCH__CATCH_EXPR, null, msgs);
			if(newCatchExpr != null)
				msgs = ((InternalEObject) newCatchExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCATCH__CATCH_EXPR, null, msgs);
			msgs = basicSetCatchExpr(newCatchExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCATCH__CATCH_EXPR, newCatchExpr, newCatchExpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setType(Type newType) {
		if(!(newType instanceof EObject)) {
			B3ParameterizedType wrappedType = B3backendFactory.eINSTANCE.createB3ParameterizedType();
			wrappedType.setRawType(newType);
			newType = wrappedType;
		}
		setTypeGen(newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * exceptionType may not be an EObject, and if it is not no notification is generated on change.
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypeGen(Type newType) {
		if(newType != type) {
			NotificationChain msgs = null;
			if(type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCATCH__TYPE, null, msgs);
			if(newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCATCH__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__TYPE, newType, newType));
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
		return B3backendPackage.Literals.BCATCH;
	}

} // BCatchImpl
