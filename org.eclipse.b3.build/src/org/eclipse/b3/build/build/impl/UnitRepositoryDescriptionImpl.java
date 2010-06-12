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

import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.UnitRepositoryDescription;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Repository Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.UnitRepositoryDescriptionImpl#getRepository <em>Repository</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.UnitRepositoryDescriptionImpl#getEvaluatedOptions <em>Evaluated Options</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UnitRepositoryDescriptionImpl extends BuildUnitRepositoryImpl implements UnitRepositoryDescription {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getEvaluatedOptions() <em>Evaluated Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEvaluatedOptions()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> evaluatedOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UnitRepositoryDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Repository basicGetRepository() {
		return repository;
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
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY:
				if(resolve)
					return getRepository();
				return basicGetRepository();
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS:
				return getEvaluatedOptions();
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
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY:
				return repository != null;
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS:
				return evaluatedOptions != null;
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
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY:
				setRepository((Repository) newValue);
				return;
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS:
				setEvaluatedOptions((Map<String, Object>) newValue);
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
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.UNIT_REPOSITORY_DESCRIPTION;
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
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY:
				setRepository((Repository) null);
				return;
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS:
				setEvaluatedOptions((Map<String, Object>) null);
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
	public Map<String, Object> getEvaluatedOptions() {
		return evaluatedOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Repository getRepository() {
		if(repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject) repository;
			repository = (Repository) eResolveProxy(oldRepository);
			if(repository != oldRepository) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY,
						oldRepository, repository));
			}
		}
		return repository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.BuildUnitRepositoryImpl#initialize(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.build.Repository, java.util.Map)
	 */
	@Override
	public void initialize(BExecutionContext ctx, Repository repository, Map<String, Object> options) throws Throwable {
		setRepository(repository); // remember the repository
		setEvaluatedOptions(options); // remember the options
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.BuildUnitRepositoryImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.build.RequiredCapability, java.util.Map)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, Map<String, Object> options)
			throws Throwable {

		// This impl is simply a data carrier, it can not actually resolve antything
		return null;
		// throw new B3UndefinedRepositoryHandlerException(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEvaluatedOptions(Map<String, Object> newEvaluatedOptions) {
		Map<String, Object> oldEvaluatedOptions = evaluatedOptions;
		evaluatedOptions = newEvaluatedOptions;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS,
				oldEvaluatedOptions, evaluatedOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		Repository oldRepository = repository;
		repository = newRepository;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION__REPOSITORY, oldRepository,
				repository));
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
		result.append(" (evaluatedOptions: ");
		result.append(evaluatedOptions);
		result.append(')');
		return result.toString();
	}

} // UnitRepositoryDescriptionImpl
