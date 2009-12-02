/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.b3.backend.evaluator.typesystem.B3ParameterizedType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

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
	 * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected Type keyType;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' reference.
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
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BLITERAL_MAP_EXPRESSION;
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
		if (keyType != null && ((EObject)keyType).eIsProxy()) {
			InternalEObject oldKeyType = (InternalEObject)keyType;
			keyType = (Type)eResolveProxy(oldKeyType);
			if (keyType != oldKeyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, oldKeyType, keyType));
			}
		}
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetKeyType() {
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyType(Type newKeyType) {
		Type oldKeyType = keyType;
		keyType = newKeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE, oldKeyType, keyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getValueType() {
		if (valueType != null && ((EObject)valueType).eIsProxy()) {
			InternalEObject oldValueType = (InternalEObject)valueType;
			valueType = (Type)eResolveProxy(oldValueType);
			if (valueType != oldValueType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, oldValueType, valueType));
			}
		}
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(Type newValueType) {
		Type oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE, oldValueType, valueType));
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
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__ENTRIES:
				return getEntries();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__KEY_TYPE:
				if (resolve) return getKeyType();
				return basicGetKeyType();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION__VALUE_TYPE:
				if (resolve) return getValueType();
				return basicGetValueType();
		}
		return super.eGet(featureID, resolve, coreType);
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

	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Type kt = keyType == null ? String.class : keyType;
		Type vt = valueType == null ? Object.class : valueType;
		Map<Object,Object> map = new LinkedHashMap<Object, Object>(entries.size());
		int counter = 0;
		for(BMapEntry mapentry : entries) {
			Object key = mapentry.getKey().evaluate(ctx);
			Object value = mapentry.getValue().evaluate(ctx);
			if(!rawClassFromType(kt).isAssignableFrom(key.getClass()))
				throw BackendHelper.createException(mapentry.getKey(), 
						"Map creation error for entry {0}. "
						+"A Map<{0},{0}>, does not accept a key of type {0}.",
						new Object[] {new Integer(counter), kt, vt, key.getClass()});
			if(!rawClassFromType(vt).isAssignableFrom(value.getClass()))
				throw BackendHelper.createException(mapentry.getKey(), 
						"Map creation error for entry {0}. "
						+"A Map<{0},{0}>, does not accept a value of type {0}.",
						new Object[] {new Integer(counter), kt, vt, value.getClass()});
			map.put(key, value);
			counter++;
			}
		return map;
	}
	@SuppressWarnings("unchecked")
	public static Class<?> rawClassFromType(Type t) {
		if( t instanceof ParameterizedType)
			return (Class)((ParameterizedType)t).getRawType();
		return (Class)t;
	}
	/**
	 * Returns the declared ekey and value types or String for key, and Object for data if not specified.
	 * TODO: the common super type could be computed instead.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		Type kt = keyType == null ? String.class : keyType;
		Type vt = valueType == null ? Object.class : valueType;
		return new B3ParameterizedType(Map.class, new Type[] { kt, vt });
	}

} //BLiteralMapExpressionImpl