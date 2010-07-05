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
package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;
import java.util.Collection;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FinalVariableRedefinitionException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.core.PathIterator;
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
 *   <li>{@link org.eclipse.b3.build.impl.BuildSetImpl#getPathVectors <em>Path Vectors</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.BuildSetImpl#getValueMap <em>Value Map</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.BuildSetImpl#getPathIterator <em>Path Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildSetImpl extends EObjectImpl implements BuildSet {
	protected class ValueMapLVal implements LValue {
		private String name;

		ValueMapLVal(String name) {
			this.name = name;
		}

		public Object get() throws B3EngineException {
			return getValueMap().get(name);
		}

		public Type getDeclaredType() throws B3EngineException {
			return getValueMap().getType(name);
		}

		public boolean isGetable() throws B3EngineException {
			return true;
		}

		public boolean isSettable() {
			return getValueMap().isImmutable(name);
		}

		public Object set(Object value) throws B3EngineException {
			return getValueMap().set(name, value);
		}

		public void setDeclaredType(Type t) throws B3EngineException {
			getValueMap().setType(name, t);
		}
	}

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
	 * The default value of the '{@link #getPathIterator() <em>Path Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPathIterator()
	 * @generated NOT
	 * @ordered
	 */
	protected static final PathIterator PATH_ITERATOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean containsValue(String name) {
		return containsValue(name, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean containsValue(String name, boolean allVisible) {
		return getValueMap().containsKey(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineFinalValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineFinalValue(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineFinalVariableValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineFinalVariable(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineValue(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineVariableValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineVariable(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILD_SET__PATH_VECTORS:
				return getPathVectors();
			case B3BuildPackage.BUILD_SET__VALUE_MAP:
				return getValueMap();
			case B3BuildPackage.BUILD_SET__PATH_ITERATOR:
				return getPathIterator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_SET__PATH_VECTORS:
				return pathVectors != null && !pathVectors.isEmpty();
			case B3BuildPackage.BUILD_SET__VALUE_MAP:
				return VALUE_MAP_EDEFAULT == null
						? valueMap != null
						: !VALUE_MAP_EDEFAULT.equals(valueMap);
			case B3BuildPackage.BUILD_SET__PATH_ITERATOR:
				return PATH_ITERATOR_EDEFAULT == null
						? getPathIterator() != null
						: !PATH_ITERATOR_EDEFAULT.equals(getPathIterator());
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
		switch(featureID) {
			case B3BuildPackage.BUILD_SET__PATH_VECTORS:
				getPathVectors().clear();
				getPathVectors().addAll((Collection<? extends PathVector>) newValue);
				return;
			case B3BuildPackage.BUILD_SET__VALUE_MAP:
				setValueMap((ValueMap) newValue);
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
		return B3BuildPackage.Literals.BUILD_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_SET__PATH_VECTORS:
				getPathVectors().clear();
				return;
			case B3BuildPackage.BUILD_SET__VALUE_MAP:
				setValueMap(VALUE_MAP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @throws B3EngineException
	 * @generated NOT
	 */
	public Type getDeclaredValueType(String name) throws B3EngineException {
		return getLValue(name).getDeclaredType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LValue getLValue(String name) throws B3EngineException {
		if(!getValueMap().containsKey(name))
			throw new B3NoSuchVariableException(name);
		return new ValueMapLVal(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PathIterator getPathIterator() {
		return new PathIterator(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathVector> getPathVectors() {
		if(pathVectors == null) {
			pathVectors = new EObjectResolvingEList<PathVector>(
				PathVector.class, this, B3BuildPackage.BUILD_SET__PATH_VECTORS);
		}
		return pathVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Looks up the value in the value map obtained by calling {@link #getValueMap()} (which derived classes
	 * may override).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getValue(String name) throws B3EngineException {
		return getValueMap().get(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated NOT
	 */
	public boolean isFinal(String name) {
		return getValueMap().isFinal(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isImmutable(String name) {
		return getValueMap().isImmutable(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: Merges by simply concatenating the vectors from the added build result, and adding values.
	 * TODO: Optimize by removing duplicates etc.
	 * TODO: The PathVectors instances should be immutable - they are references to the original declarations
	 * <!-- end-user-doc -->
	 * 
	 * @throws B3EngineException
	 * @generated NOT
	 */
	public BuildSet merge(BuildSet buildResult) throws B3EngineException {
		ValueMap myMap = getValueMap();
		EList<PathVector> p = getPathVectors();
		for(PathVector v : buildResult.getPathVectors())
			p.add(v);
		myMap.merge(buildResult.getValueMap());
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMap(ValueMap newValueMap) {
		ValueMap oldValueMap = valueMap;
		valueMap = newValueMap;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_SET__VALUE_MAP, oldValueMap, valueMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (annotations: ");
		valueMap.toString(result);
		result.append(')');

		result.append(" (pathVectors: ");
		result.append(getPathVectors());
		result.append(")");
		return result.toString();
	}
} // BuildResultImpl
