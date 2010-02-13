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

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.ValueMap;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildResult;
import org.eclipse.b3.build.build.PathVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildResultImpl#getPathVectors <em>Path Vectors</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildResultImpl#getValueMap <em>Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildResultImpl extends EObjectImpl implements BuildResult {
	/**
	 * The cached value of the '{@link #getPathVectors() <em>Path Vectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVector> pathVectors;

	/**
	 * The default value of the '{@link #getValueMap() <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMap()
	 * @generated
	 * @ordered
	 */
	protected static final ValueMap VALUE_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueMap() <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMap()
	 * @generated
	 * @ordered
	 */
	protected ValueMap valueMap = VALUE_MAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathVector> getPathVectors() {
		if (pathVectors == null) {
			pathVectors = new EObjectResolvingEList<PathVector>(PathVector.class, this, B3BuildPackage.BUILD_RESULT__PATH_VECTORS);
		}
		return pathVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValueMap getValueMap() {
		if(valueMap == null)
			setValueMap(new ValueMap());
		return valueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMap(ValueMap newValueMap) {
		ValueMap oldValueMap = valueMap;
		valueMap = newValueMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_RESULT__VALUE_MAP, oldValueMap, valueMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: Merges by simply concatenating the vectors from the added build result, and adding values.
	 * TODO: Optimize by removing duplicates etc.
	 * TODO: The PathVectors instances should be immutable - they are references to the original declarations - it is allowed to
	 * <!-- end-user-doc -->
	 * @throws B3EngineException 
	 * @generated NOT
	 */
	public void merge(BuildResult buildResult) throws B3EngineException {
		ValueMap myMap = getValueMap();
		EList<PathVector> p = getPathVectors();
		for(PathVector v : buildResult.getPathVectors())
			p.add(v);
		myMap.merge(buildResult.getValueMap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3BuildPackage.BUILD_RESULT__PATH_VECTORS:
				return getPathVectors();
			case B3BuildPackage.BUILD_RESULT__VALUE_MAP:
				return getValueMap();
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
			case B3BuildPackage.BUILD_RESULT__PATH_VECTORS:
				getPathVectors().clear();
				getPathVectors().addAll((Collection<? extends PathVector>)newValue);
				return;
			case B3BuildPackage.BUILD_RESULT__VALUE_MAP:
				setValueMap((ValueMap)newValue);
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
			case B3BuildPackage.BUILD_RESULT__PATH_VECTORS:
				getPathVectors().clear();
				return;
			case B3BuildPackage.BUILD_RESULT__VALUE_MAP:
				setValueMap(VALUE_MAP_EDEFAULT);
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
			case B3BuildPackage.BUILD_RESULT__PATH_VECTORS:
				return pathVectors != null && !pathVectors.isEmpty();
			case B3BuildPackage.BUILD_RESULT__VALUE_MAP:
				return VALUE_MAP_EDEFAULT == null ? valueMap != null : !VALUE_MAP_EDEFAULT.equals(valueMap);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueMap: ");
		result.append(valueMap);
		result.append(')');
		return result.toString();
	}

} //BuildResultImpl
