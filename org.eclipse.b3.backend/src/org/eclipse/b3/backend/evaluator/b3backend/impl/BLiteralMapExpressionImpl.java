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
import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLiteral Map Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BLiteralMapExpressionImpl extends BExpressionImpl implements BLiteralMapExpression {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BMapEntry> entries;

	/**
	 * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected Type keyType;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected Type valueType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BLiteralMapExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyType(Type newKeyType, NotificationChain msgs) {
		Type oldKeyType = keyType;
		keyType = newKeyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, oldKeyType, newKeyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(Type newValueType, NotificationChain msgs) {
		Type oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, oldValueType, newValueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
		switch (featureID) {
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				return getEntries();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				return getKeyType();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				return getValueType();
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
		switch (featureID) {
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				return basicSetKeyType(null, msgs);
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				return basicSetValueType(null, msgs);
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
		switch (featureID) {
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				return entries != null && !entries.isEmpty();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				return keyType != null;
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				return valueType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends BMapEntry>)newValue);
				return;
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				setKeyType((Type)newValue);
				return;
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				setValueType((Type)newValue);
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
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				getEntries().clear();
				return;
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				setKeyType((Type)null);
				return;
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				setValueType((Type)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BMapEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<BMapEntry>(BMapEntry.class, this, B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getKeyType() {
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * keyType may not be an EObject, if not, no notification is generated on change.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setKeyType(Type newKeyType) {
		if(newKeyType != keyType) {
			NotificationChain msgs = null;
			if(keyType != null && keyType instanceof EObject)
				msgs = ((InternalEObject) keyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, null, msgs);
			if(newKeyType != null && newKeyType instanceof EObject)
				msgs = ((InternalEObject) newKeyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, null, msgs);
			msgs = basicSetKeyType(newKeyType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, newKeyType, newKeyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * valueType may not be an EObject, if it is not, no notification is generated on change.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setValueType(Type newValueType) {
		if(newValueType != valueType) {
			NotificationChain msgs = null;
			if(valueType != null && valueType instanceof EObject)
				msgs = ((InternalEObject) valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, null, msgs);
			if(newValueType != null && newValueType instanceof EObject)
				msgs = ((InternalEObject) newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, newValueType,
				newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BLITERAL_MAP_EXPRESSION;
	}
} // BLiteralMapExpressionImpl
