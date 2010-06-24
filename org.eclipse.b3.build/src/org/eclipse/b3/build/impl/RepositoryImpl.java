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

import java.lang.reflect.Type;
import java.util.Collection;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.Branch;
import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getBranches <em>Branches</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getHandlerType <em>Handler Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getOptions <em>Options</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getBuildUnitRepository <em>Build Unit Repository</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.RepositoryImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryImpl extends BExpressionImpl implements Repository {
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
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected String handlerType = HANDLER_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected BExpression address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RepositoryImpl() {
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
	public NotificationChain basicSetAddress(BExpression newAddress, NotificationChain msgs) {
		BExpression oldAddress = address;
		address = newAddress;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY__ADDRESS, oldAddress, newAddress);
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
			case B3BuildPackage.REPOSITORY__NAME:
				return getName();
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return getBranches();
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				return getHandlerType();
			case B3BuildPackage.REPOSITORY__OPTIONS:
				return getOptions();
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
				if(resolve)
					return getBuildUnitRepository();
				return basicGetBuildUnitRepository();
			case B3BuildPackage.REPOSITORY__ADDRESS:
				return getAddress();
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
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.REPOSITORY__OPTIONS:
				return ((InternalEList<?>) getOptions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.REPOSITORY__ADDRESS:
				return basicSetAddress(null, msgs);
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
			case B3BuildPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return branches != null && !branches.isEmpty();
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				return HANDLER_TYPE_EDEFAULT == null
						? handlerType != null
						: !HANDLER_TYPE_EDEFAULT.equals(handlerType);
			case B3BuildPackage.REPOSITORY__OPTIONS:
				return options != null && !options.isEmpty();
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
				return buildUnitRepository != null;
			case B3BuildPackage.REPOSITORY__ADDRESS:
				return address != null;
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
			case B3BuildPackage.REPOSITORY__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>) newValue);
				return;
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				setHandlerType((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends RepoOption>) newValue);
				return;
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
				setBuildUnitRepository((IBuildUnitRepository) newValue);
				return;
			case B3BuildPackage.REPOSITORY__ADDRESS:
				setAddress((BExpression) newValue);
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
		return B3BuildPackage.Literals.REPOSITORY;
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
			case B3BuildPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				return;
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				setHandlerType(HANDLER_TYPE_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__OPTIONS:
				getOptions().clear();
				return;
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
				setBuildUnitRepository((IBuildUnitRepository) null);
				return;
			case B3BuildPackage.REPOSITORY__ADDRESS:
				setAddress((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		EList<RepoOption> opts = getOptions();

		// create a map for evaluated options, and populate it
		Map<String, Object> evaluatedOptions = new HashMap<String, Object>(opts.size());
		for(RepoOption o : opts)
			evaluatedOptions.put(o.getName(), o.getExpr().evaluate(ctx));

		// get the injector and create a build unit repository implementation for the
		// handler-type.
		Injector injector = ctx.getInjector(); // .getInstance(Names.named(getHandlerType()));
		IBuildUnitRepository result = injector.getInstance(Key.get(
			IBuildUnitRepository.class, Names.named(getHandlerType())));
		result.initialize(ctx, this, evaluatedOptions);
		setBuildUnitRepository(result);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Branch> getBranches() {
		if(branches == null) {
			branches = new EObjectContainmentEList<Branch>(Branch.class, this, B3BuildPackage.REPOSITORY__BRANCHES);
		}
		return branches;
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
						this, Notification.RESOLVE, B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY,
						oldBuildUnitRepository, buildUnitRepository));
			}
		}
		return buildUnitRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return IBuildUnitRepository.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHandlerType() {
		return handlerType;
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
	public EList<RepoOption> getOptions() {
		if(options == null) {
			options = new EObjectContainmentEList<RepoOption>(
				RepoOption.class, this, B3BuildPackage.REPOSITORY__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddress(BExpression newAddress) {
		if(newAddress != address) {
			NotificationChain msgs = null;
			if(address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY__ADDRESS, null, msgs);
			if(newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY__ADDRESS, newAddress, newAddress));
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
				this, Notification.SET, B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY, oldBuildUnitRepository,
				buildUnitRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHandlerType(String newHandlerType) {
		String oldHandlerType = handlerType;
		handlerType = newHandlerType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY__HANDLER_TYPE, oldHandlerType, handlerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REPOSITORY__NAME, oldName, name));
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
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", handlerType: ");
		result.append(handlerType);
		result.append(')');
		return result.toString();
	}
} // RepositoryHandlerImpl
