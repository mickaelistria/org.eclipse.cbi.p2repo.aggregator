/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.EcoreFeatureLValue;
import org.eclipse.b3.backend.evaluator.PojoFeatureLValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BInstance Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInstanceContextImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BInstanceContextImpl extends BInnerContextImpl implements BInstanceContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final Object INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Object instance = INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BInstanceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BINSTANCE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Object newInstance) {
		Object oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BINSTANCE_CONTEXT__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BINSTANCE_CONTEXT__INSTANCE:
				return getInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BINSTANCE_CONTEXT__INSTANCE:
				setInstance(newValue);
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
			case B3backendPackage.BINSTANCE_CONTEXT__INSTANCE:
				setInstance(INSTANCE_EDEFAULT);
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
			case B3backendPackage.BINSTANCE_CONTEXT__INSTANCE:
				return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instance: ");
		result.append(instance);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public LValue getLValue(String featureName) throws B3EngineException {
		
		LValue resultingLValue = null;
		// for Ecore
		Object lhs = getInstance();
		if(lhs instanceof EObject)
		{
			EObject eLhs = (EObject)lhs;
			EStructuralFeature feature = eLhs.eClass().getEStructuralFeature(featureName);
			resultingLValue = feature == null ? null :new EcoreFeatureLValue((EObject)lhs, feature);
		}
		else {
			resultingLValue = new PojoFeatureLValue(lhs, featureName);
			if(!resultingLValue.isGetable())
				resultingLValue = null;
		}
		if(resultingLValue == null) {
			BExecutionContext parentContext = null;
			if((parentContext = getParentContext()) == null)
				throw new B3NoSuchVariableException(featureName);
			return parentContext.getLValue(featureName);
		}
		return resultingLValue;
	}
	@Override
	public Object getValue(String name) throws B3EngineException {
		LValue lval = getLValue(name);
		return lval.get();
	}
} //BInstanceContextImpl
