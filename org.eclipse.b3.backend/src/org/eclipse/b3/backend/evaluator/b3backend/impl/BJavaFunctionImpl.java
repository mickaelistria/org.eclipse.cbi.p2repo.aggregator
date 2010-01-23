/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BJava Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl#getCallType <em>Call Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BJavaFunctionImpl extends BFunctionImpl implements BJavaFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallType() <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallType()
	 * @generated
	 * @ordered
	 */
	protected static final BJavaCallType CALL_TYPE_EDEFAULT = BJavaCallType.FUNCTION;

	/**
	 * The cached value of the '{@link #getCallType() <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallType()
	 * @generated
	 * @ordered
	 */
	protected BJavaCallType callType = CALL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BJavaFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BJAVA_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BJAVA_FUNCTION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BJavaCallType getCallType() {
		return callType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallType(BJavaCallType newCallType) {
		BJavaCallType oldCallType = callType;
		callType = newCallType == null ? CALL_TYPE_EDEFAULT : newCallType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BJAVA_FUNCTION__CALL_TYPE, oldCallType, callType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSystemCall() {
		return getCallType().getValue() == BJavaCallType.SYSTEM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFunctionCall() {
		return getCallType().getValue() == BJavaCallType.FUNCTION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isMethodCall() {
		return getCallType().getValue() == BJavaCallType.METHOD_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BJAVA_FUNCTION__METHOD:
				return getMethod();
			case B3backendPackage.BJAVA_FUNCTION__CALL_TYPE:
				return getCallType();
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
			case B3backendPackage.BJAVA_FUNCTION__METHOD:
				setMethod((Method)newValue);
				return;
			case B3backendPackage.BJAVA_FUNCTION__CALL_TYPE:
				setCallType((BJavaCallType)newValue);
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
			case B3backendPackage.BJAVA_FUNCTION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case B3backendPackage.BJAVA_FUNCTION__CALL_TYPE:
				setCallType(CALL_TYPE_EDEFAULT);
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
			case B3backendPackage.BJAVA_FUNCTION__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case B3backendPackage.BJAVA_FUNCTION__CALL_TYPE:
				return callType != CALL_TYPE_EDEFAULT;
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
		result.append(" (method: ");
		result.append(method);
		result.append(", callType: ");
		result.append(callType);
		result.append(')');
		return result.toString();
	}
	/**
	 * Overrides inherited calling by skipping the {@link #prepareCall(BExecutionContext, Object[], Type[])} step.
	 * (The prepare call is normally not needed for calling java functions as it can operate directly on
	 * the object and type arrays).
	 */
	@Override
	public Object call(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable {
		return internalCall(ctx, parameters, types);
	}
	@Override
	public Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable {
		try {
		if(isSystemCall())
			return method.invoke(null, ctx, parameters, types);
		Object instance = null;
		int start = 0; 
		int vStart = -1; // no varargs copy needed
		int pSize = getParameterTypes().length;
		if(isMethodCall()) {
			instance = parameters[0];
			start = 1;
			pSize--;
			}
		
		int limit = parameters.length;
		if(isVarArgs()) {
			vStart = getParameterTypes().length-1;
			if(vStart < limit)
				limit = vStart;
			}
		if(start >= 1 || vStart >= 0) {
			Object[] newParameters = new Object[pSize];
			for(int i = start; i < limit; i++)
				newParameters[i-start] = parameters[i];
			if(vStart >= 0) {
				Object[] variable = new Object[parameters.length-limit];
				for(int j = 0, i = vStart; i < parameters.length;i++,j++)
					variable[j] = parameters[i];
				newParameters[limit-start] = variable;
			}
			parameters = newParameters;
		}

		return method.invoke(instance, parameters);
		} catch (InvocationTargetException e) {
			throw e.getCause();
		}
	}
	@Override
	public Type getSignature() {
		B3FunctionType t = (B3FunctionType)super.getSignature();
		t.setFunctionType(B3Function.class);
		return t;
	}

} //BJavaFunctionImpl
