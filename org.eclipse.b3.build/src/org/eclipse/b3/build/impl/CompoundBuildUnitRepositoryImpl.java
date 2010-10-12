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
package org.eclipse.b3.build.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.CompoundBuildUnitRepository;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Build Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.CompoundBuildUnitRepositoryImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class CompoundBuildUnitRepositoryImpl extends BuildUnitRepositoryImpl implements
		CompoundBuildUnitRepository {
	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<IBuildUnitRepository> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompoundBuildUnitRepositoryImpl() {
		super();
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
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES:
				return getRepositories();
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
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
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
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends IBuildUnitRepository>) newValue);
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
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES:
				getRepositories().clear();
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
	public EList<IBuildUnitRepository> getRepositories() {
		if(repositories == null) {
			repositories = new EObjectResolvingEList<IBuildUnitRepository>(
				IBuildUnitRepository.class, this, B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * This default implementation does nothing.
	 * 
	 * @see org.eclipse.b3.build.impl.BuildUnitRepositoryImpl#initialize(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      org.eclipse.b3.build.Repository, java.util.Map)
	 */
	@Override
	public void initialize(BExecutionContext ctx, Repository repository, Map<String, Object> options) throws Throwable {
		// does nothing -
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.COMPOUND_BUILD_UNIT_REPOSITORY;
	}
} // CompoundBuildUnitRepositoryImpl
