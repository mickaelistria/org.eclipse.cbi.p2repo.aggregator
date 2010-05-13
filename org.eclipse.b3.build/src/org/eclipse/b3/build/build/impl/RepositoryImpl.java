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
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Branch;
import org.eclipse.b3.build.build.RepoOption;
import org.eclipse.b3.build.build.Repository;
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
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getLocal <em>Local</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getRemote <em>Remote</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getBranches <em>Branches</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getUser <em>User</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getPassword <em>Password</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getHandlerType <em>Handler Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getOptions <em>Options</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryImpl#getBuildUnitRepository <em>Build Unit Repository</em>}</li>
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
	 * The default value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected URI local = LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected static final URI REMOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected URI remote = REMOTE_EDEFAULT;

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
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.REPOSITORY__NAME:
				return getName();
			case B3BuildPackage.REPOSITORY__LOCAL:
				return getLocal();
			case B3BuildPackage.REPOSITORY__REMOTE:
				return getRemote();
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return getBranches();
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.REPOSITORY__USER:
				return getUser();
			case B3BuildPackage.REPOSITORY__PASSWORD:
				return getPassword();
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				return getHandlerType();
			case B3BuildPackage.REPOSITORY__OPTIONS:
				return getOptions();
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
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
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.REPOSITORY__OPTIONS:
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
			case B3BuildPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.REPOSITORY__LOCAL:
				return LOCAL_EDEFAULT == null
						? local != null
						: !LOCAL_EDEFAULT.equals(local);
			case B3BuildPackage.REPOSITORY__REMOTE:
				return REMOTE_EDEFAULT == null
						? remote != null
						: !REMOTE_EDEFAULT.equals(remote);
			case B3BuildPackage.REPOSITORY__BRANCHES:
				return branches != null && !branches.isEmpty();
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.REPOSITORY__USER:
				return USER_EDEFAULT == null
						? user != null
						: !USER_EDEFAULT.equals(user);
			case B3BuildPackage.REPOSITORY__PASSWORD:
				return PASSWORD_EDEFAULT == null
						? password != null
						: !PASSWORD_EDEFAULT.equals(password);
			case B3BuildPackage.REPOSITORY__HANDLER_TYPE:
				return HANDLER_TYPE_EDEFAULT == null
						? handlerType != null
						: !HANDLER_TYPE_EDEFAULT.equals(handlerType);
			case B3BuildPackage.REPOSITORY__OPTIONS:
				return options != null && !options.isEmpty();
			case B3BuildPackage.REPOSITORY__BUILD_UNIT_REPOSITORY:
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
			case B3BuildPackage.REPOSITORY__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__LOCAL:
				setLocal((URI) newValue);
				return;
			case B3BuildPackage.REPOSITORY__REMOTE:
				setRemote((URI) newValue);
				return;
			case B3BuildPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>) newValue);
				return;
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__USER:
				setUser((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY__PASSWORD:
				setPassword((String) newValue);
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
			case B3BuildPackage.REPOSITORY__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__REMOTE:
				setRemote(REMOTE_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__BRANCHES:
				getBranches().clear();
				return;
			case B3BuildPackage.REPOSITORY__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__USER:
				setUser(USER_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
	public URI getLocal() {
		return local;
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
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUser() {
		return user;
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
	public void setLocal(URI newLocal) {
		URI oldLocal = local;
		local = newLocal;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REPOSITORY__LOCAL, oldLocal, local));
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
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRemote(URI newRemote) {
		URI oldRemote = remote;
		remote = newRemote;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REPOSITORY__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REPOSITORY__USER, oldUser, user));
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
		result.append(", local: ");
		result.append(local);
		result.append(", remote: ");
		result.append(remote);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", handlerType: ");
		result.append(handlerType);
		result.append(')');
		return result.toString();
	}
} // RepositoryHandlerImpl
