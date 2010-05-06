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

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.RepositoryHandler;
import org.eclipse.b3.build.build.RepositoryUnitProvider;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryUnitProviderImpl#getRepositoryPathExpression <em>Repository Path Expression</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryUnitProviderImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryUnitProviderImpl extends UnitProviderImpl implements RepositoryUnitProvider {
	/**
	 * The cached value of the '{@link #getRepositoryPathExpression() <em>Repository Path Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositoryPathExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpression repositoryPathExpression;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected RepositoryHandler repository;

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
	public RepositoryHandler basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRepositoryPathExpression(BExpression newRepositoryPathExpression,
			NotificationChain msgs) {
		BExpression oldRepositoryPathExpression = repositoryPathExpression;
		repositoryPathExpression = newRepositoryPathExpression;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION,
				oldRepositoryPathExpression, newRepositoryPathExpression);
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION:
				return getRepositoryPathExpression();
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				if(resolve)
					return getRepository();
				return basicGetRepository();
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION:
				return basicSetRepositoryPathExpression(null, msgs);
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION:
				return repositoryPathExpression != null;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				return repository != null;
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION:
				setRepositoryPathExpression((BExpression) newValue);
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				setRepository((RepositoryHandler) newValue);
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION:
				setRepositoryPathExpression((BExpression) null);
				return;
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY:
				setRepository((RepositoryHandler) null);
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
	public RepositoryHandler getRepository() {
		if(repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject) repository;
			repository = (RepositoryHandler) eResolveProxy(oldRepository);
			if(repository != oldRepository) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY, oldRepository,
						repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getRepositoryPathExpression() {
		return repositoryPathExpression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.UnitProviderImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		String repoPath = requiredCapability.getName();
		if(getRepositoryPathExpression() != null) {
			BExecutionContext ictx = ctx.createInnerContext();
			ictx.defineFinalValue("request", requiredCapability, RequiredCapability.class);
			Object pathObject = repositoryPathExpression.evaluate(ictx);
			if(!(pathObject instanceof String))
				throw new B3IncompatibleTypeException(String.class, pathObject.getClass());
			repoPath = (String) pathObject;
		}
		return repository.resolve(ctx, requiredCapability, repoPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRepository(RepositoryHandler newRepository) {
		RepositoryHandler oldRepository = repository;
		repository = newRepository;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRepositoryPathExpression(BExpression newRepositoryPathExpression) {
		if(newRepositoryPathExpression != repositoryPathExpression) {
			NotificationChain msgs = null;
			if(repositoryPathExpression != null)
				msgs = ((InternalEObject) repositoryPathExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION, null, msgs);
			if(newRepositoryPathExpression != null)
				msgs = ((InternalEObject) newRepositoryPathExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION, null, msgs);
			msgs = basicSetRepositoryPathExpression(newRepositoryPathExpression, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_UNIT_PROVIDER__REPOSITORY_PATH_EXPRESSION,
				newRepositoryPathExpression, newRepositoryPathExpression));
	}
} // RepositoryReferenceImpl
