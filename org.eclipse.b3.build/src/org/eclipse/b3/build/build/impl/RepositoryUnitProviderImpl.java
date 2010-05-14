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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.RepoOption;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.RepositoryUnitProvider;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.IBuildUnitRepository;
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
 * An implementation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryUnitProviderImpl#getRepository <em>Repository</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryUnitProviderImpl#getOptions <em>Options</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryUnitProviderImpl#getBuildUnitRepository <em>Build Unit Repository</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryUnitProviderImpl extends UnitProviderImpl implements RepositoryUnitProvider {
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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<RepoOption> options;

	/**
	 * The cached value of the '{@link #getBuildUnitRepository() <em>Build Unit Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuildUnitRepository()
	 * @generated
	 * @ordered
	 */
	protected IBuildUnitRepository buildUnitRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RepositoryUnitProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IBuildUnitRepository basicGetBuildUnitRepository() {
		return buildUnitRepository;
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				if(resolve)
					return getRepository();
				return basicGetRepository();
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS:
				return getOptions();
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY:
				if(resolve)
					return getBuildUnitRepository();
				return basicGetBuildUnitRepository();
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS:
				return ((InternalEList<?>) getOptions()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				return repository != null;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS:
				return options != null && !options.isEmpty();
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY:
				return buildUnitRepository != null;
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				setRepository((Repository) newValue);
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends RepoOption>) newValue);
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY:
				setBuildUnitRepository((IBuildUnitRepository) newValue);
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
		return B3BuildPackage.Literals.REPOSITORY_UNIT_PROVIDER;
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				setRepository((Repository) null);
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS:
				getOptions().clear();
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY:
				setBuildUnitRepository((IBuildUnitRepository) null);
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
	public IBuildUnitRepository getBuildUnitRepository() {
		if(buildUnitRepository != null && ((EObject) buildUnitRepository).eIsProxy()) {
			InternalEObject oldBuildUnitRepository = (InternalEObject) buildUnitRepository;
			buildUnitRepository = (IBuildUnitRepository) eResolveProxy(oldBuildUnitRepository);
			if(buildUnitRepository != oldBuildUnitRepository) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY,
						oldBuildUnitRepository, buildUnitRepository));
			}
		}
		return buildUnitRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RepoOption> getOptions() {
		if(options == null) {
			options = new EObjectContainmentEList<RepoOption>(
				RepoOption.class, this, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__OPTIONS);
		}
		return options;
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
						this, Notification.RESOLVE, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY, oldRepository,
						repository));
			}
		}
		return repository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.UnitProviderImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		// Evaluate options in a map and pass to BuildUnitRepository
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineFinalValue(B3BuildConstants.B3_VAR_REQUEST, requiredCapability, RequiredCapability.class);
		EList<RepoOption> opts = getOptions();

		// create a map for evaluated options, and populate it
		Map<String, Object> evaluatedOptions = new HashMap<String, Object>(opts.size());
		for(RepoOption o : opts)
			evaluatedOptions.put(o.getName(), o.getExpr().evaluate(ctx));

		// TODO: Better error handling:
		// If repository is null, buildUnitRepository *must* have been set manually.
		// If repository is non-null, and it does not have a BuildUnitRepository - this means that evaluation
		// was not performed on the repository, or that the guice binding was wrong and nothing was found
		// the latter is most likely reported by guice).
		//
		return (repository == null
				? buildUnitRepository
				: repository.getBuildUnitRepository()).resolve(ctx, requiredCapability, evaluatedOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBuildUnitRepository(IBuildUnitRepository newBuildUnitRepository) {
		IBuildUnitRepository oldBuildUnitRepository = buildUnitRepository;
		buildUnitRepository = newBuildUnitRepository;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY,
				oldBuildUnitRepository, buildUnitRepository));
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
				this, Notification.SET, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY, oldRepository, repository));
	}
} // RepositoryReferenceImpl
