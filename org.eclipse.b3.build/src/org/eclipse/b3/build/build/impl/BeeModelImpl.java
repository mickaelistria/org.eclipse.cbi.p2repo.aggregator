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

package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildUnit;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bee Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getBuildUnits <em>Build Units</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getPropertySets <em>Property Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeeModelImpl extends EObjectImpl implements BeeModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> imports;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunction> functions;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;

	/**
	 * The cached value of the '{@link #getBuildUnits() <em>Build Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildUnit> buildUnits;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BEE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Type>(Type.class, this, B3BuildPackage.BEE_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<IFunction>(IFunction.class, this, B3BuildPackage.BEE_MODEL__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(BConcern.class, this, B3BuildPackage.BEE_MODEL__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildUnit> getBuildUnits() {
		if (buildUnits == null) {
			buildUnits = new EObjectContainmentEList<BuildUnit>(BuildUnit.class, this, B3BuildPackage.BEE_MODEL__BUILD_UNITS);
		}
		return buildUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if (propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(BPropertySet.class, this, B3BuildPackage.BEE_MODEL__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return ((InternalEList<?>)getBuildUnits()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return getImports();
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return getFunctions();
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return getConcerns();
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return getBuildUnits();
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return getPropertySets();
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Type>)newValue);
				return;
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IFunction>)newValue);
				return;
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>)newValue);
				return;
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				getBuildUnits().clear();
				getBuildUnits().addAll((Collection<? extends BuildUnit>)newValue);
				return;
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>)newValue);
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				getImports().clear();
				return;
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				getConcerns().clear();
				return;
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				getBuildUnits().clear();
				return;
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				getPropertySets().clear();
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return concerns != null && !concerns.isEmpty();
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return buildUnits != null && !buildUnits.isEmpty();
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BeeModelImpl
