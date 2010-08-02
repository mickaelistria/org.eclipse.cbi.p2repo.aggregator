/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.ContainerConfiguration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl#getAgentType <em>Agent Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ContainerConfigurationImpl extends EObjectImpl implements ContainerConfiguration {
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
	 * The cached value of the '{@link #getAgentType() <em>Agent Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAgentType()
	 * @generated
	 * @ordered
	 */
	protected Type agentType;

	/**
	 * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContextBlock()
	 * @generated
	 * @ordered
	 */
	protected BExpression contextBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ContainerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAgentType(Type newAgentType, NotificationChain msgs) {
		Type oldAgentType = agentType;
		agentType = newAgentType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE, oldAgentType, newAgentType);
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
	public NotificationChain basicSetContextBlock(BExpression newContextBlock, NotificationChain msgs) {
		BExpression oldContextBlock = contextBlock;
		contextBlock = newContextBlock;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK, oldContextBlock,
				newContextBlock);
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
			case B3BuildPackage.CONTAINER_CONFIGURATION__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.CONTAINER_CONFIGURATION__NAME:
				return getName();
			case B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE:
				return getAgentType();
			case B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK:
				return getContextBlock();
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
			case B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE:
				return basicSetAgentType(null, msgs);
			case B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK:
				return basicSetContextBlock(null, msgs);
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
			case B3BuildPackage.CONTAINER_CONFIGURATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.CONTAINER_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE:
				return agentType != null;
			case B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK:
				return contextBlock != null;
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
			case B3BuildPackage.CONTAINER_CONFIGURATION__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE:
				setAgentType((Type) newValue);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK:
				setContextBlock((BExpression) newValue);
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
		return B3BuildPackage.Literals.CONTAINER_CONFIGURATION;
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
			case B3BuildPackage.CONTAINER_CONFIGURATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE:
				setAgentType((Type) null);
				return;
			case B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK:
				setContextBlock((BExpression) null);
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
	public Type getAgentType() {
		return agentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getContextBlock() {
		return contextBlock;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAgentType(Type newAgentType) {
		if(newAgentType != agentType) {
			NotificationChain msgs = null;
			if(agentType != null)
				msgs = ((InternalEObject) agentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE, null, msgs);
			if(newAgentType != null)
				msgs = ((InternalEObject) newAgentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE, null, msgs);
			msgs = basicSetAgentType(newAgentType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__AGENT_TYPE, newAgentType, newAgentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContextBlock(BExpression newContextBlock) {
		if(newContextBlock != contextBlock) {
			NotificationChain msgs = null;
			if(contextBlock != null)
				msgs = ((InternalEObject) contextBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK, null, msgs);
			if(newContextBlock != null)
				msgs = ((InternalEObject) newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK, null, msgs);
			msgs = basicSetContextBlock(newContextBlock, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__CONTEXT_BLOCK, newContextBlock,
				newContextBlock));
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
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__DOCUMENTATION, oldDocumentation,
				documentation));
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
				this, Notification.SET, B3BuildPackage.CONTAINER_CONFIGURATION__NAME, oldName, name));
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ContainerConfigurationImpl
