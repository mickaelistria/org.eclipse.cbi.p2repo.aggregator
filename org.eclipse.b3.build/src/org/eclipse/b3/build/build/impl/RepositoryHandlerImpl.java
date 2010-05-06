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

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Branch;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.RepositoryHandler;

import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getHandlerType <em>Handler Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getLocal <em>Local</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getRemote <em>Remote</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getBranches <em>Branches</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getUser <em>User</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryHandlerImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryHandlerImpl extends EObjectImpl implements RepositoryHandler {
	/**
	 * The cached value of the '{@link #getHandlerType() <em>Handler Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected Type handlerType;

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
	protected static final String DOCUMENTATION_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RepositoryHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetHandlerType(Type newHandlerType, NotificationChain msgs) {
		Type oldHandlerType = handlerType;
		handlerType = newHandlerType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE, oldHandlerType, newHandlerType);
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
			case B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE:
				return getHandlerType();
			case B3BuildPackage.REPOSITORY_HANDLER__NAME:
				return getName();
			case B3BuildPackage.REPOSITORY_HANDLER__LOCAL:
				return getLocal();
			case B3BuildPackage.REPOSITORY_HANDLER__REMOTE:
				return getRemote();
			case B3BuildPackage.REPOSITORY_HANDLER__BRANCHES:
				return getBranches();
			case B3BuildPackage.REPOSITORY_HANDLER__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.REPOSITORY_HANDLER__USER:
				return getUser();
			case B3BuildPackage.REPOSITORY_HANDLER__PASSWORD:
				return getPassword();
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
			case B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE:
				return basicSetHandlerType(null, msgs);
			case B3BuildPackage.REPOSITORY_HANDLER__BRANCHES:
				return ((InternalEList<?>) getBranches()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE:
				return handlerType != null;
			case B3BuildPackage.REPOSITORY_HANDLER__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.REPOSITORY_HANDLER__LOCAL:
				return LOCAL_EDEFAULT == null
						? local != null
						: !LOCAL_EDEFAULT.equals(local);
			case B3BuildPackage.REPOSITORY_HANDLER__REMOTE:
				return REMOTE_EDEFAULT == null
						? remote != null
						: !REMOTE_EDEFAULT.equals(remote);
			case B3BuildPackage.REPOSITORY_HANDLER__BRANCHES:
				return branches != null && !branches.isEmpty();
			case B3BuildPackage.REPOSITORY_HANDLER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.REPOSITORY_HANDLER__USER:
				return USER_EDEFAULT == null
						? user != null
						: !USER_EDEFAULT.equals(user);
			case B3BuildPackage.REPOSITORY_HANDLER__PASSWORD:
				return PASSWORD_EDEFAULT == null
						? password != null
						: !PASSWORD_EDEFAULT.equals(password);
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
			case B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE:
				setHandlerType((Type) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__LOCAL:
				setLocal((URI) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__REMOTE:
				setRemote((URI) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__USER:
				setUser((String) newValue);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__PASSWORD:
				setPassword((String) newValue);
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
		return B3BuildPackage.Literals.REPOSITORY_HANDLER;
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
			case B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE:
				setHandlerType((Type) null);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__REMOTE:
				setRemote(REMOTE_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__BRANCHES:
				getBranches().clear();
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__USER:
				setUser(USER_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_HANDLER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
	public EList<Branch> getBranches() {
		if(branches == null) {
			branches = new EObjectContainmentEList<Branch>(
				Branch.class, this, B3BuildPackage.REPOSITORY_HANDLER__BRANCHES);
		}
		return branches;
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
	public Type getHandlerType() {
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
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, String unitPath)
			throws Throwable {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__DOCUMENTATION, oldDocumentation,
				documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHandlerType(Type newHandlerType) {
		if(newHandlerType != handlerType) {
			NotificationChain msgs = null;
			if(handlerType != null)
				msgs = ((InternalEObject) handlerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE, null, msgs);
			if(newHandlerType != null)
				msgs = ((InternalEObject) newHandlerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE, null, msgs);
			msgs = basicSetHandlerType(newHandlerType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__HANDLER_TYPE, newHandlerType, newHandlerType));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__LOCAL, oldLocal, local));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__NAME, oldName, name));
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
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__REMOTE, oldRemote, remote));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_HANDLER__USER, oldUser, user));
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
		result.append(')');
		return result.toString();
	}

} // RepositoryHandlerImpl
