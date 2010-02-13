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

import java.lang.reflect.Type;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.b3.backend.core.ValueMapFacade;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWrapping Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl#getFunctionWrapper <em>Function Wrapper</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl#getWrappedContext <em>Wrapped Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl#getVarargsName <em>Varargs Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BWrappingContextImpl extends BDelegatingContextImpl implements BWrappingContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFunctionWrapper() <em>Function Wrapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionWrapper()
	 * @generated
	 * @ordered
	 */
	protected BFunctionWrapper functionWrapper;

	/**
	 * The cached value of the '{@link #getWrappedContext() <em>Wrapped Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedContext()
	 * @generated
	 * @ordered
	 */
	protected BExecutionContext wrappedContext;

	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final Object[] PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Object[] parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected static final Type[] PARAMETER_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected Type[] parameterTypes = PARAMETER_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarargsName() <em>Varargs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargsName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARARGS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarargsName() <em>Varargs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargsName()
	 * @generated
	 * @ordered
	 */
	protected String varargsName = VARARGS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BWrappingContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BWRAPPING_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionWrapper getFunctionWrapper() {
		if (functionWrapper != null && functionWrapper.eIsProxy()) {
			InternalEObject oldFunctionWrapper = (InternalEObject)functionWrapper;
			functionWrapper = (BFunctionWrapper)eResolveProxy(oldFunctionWrapper);
			if (functionWrapper != oldFunctionWrapper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER, oldFunctionWrapper, functionWrapper));
			}
		}
		return functionWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionWrapper basicGetFunctionWrapper() {
		return functionWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionWrapper(BFunctionWrapper newFunctionWrapper) {
		BFunctionWrapper oldFunctionWrapper = functionWrapper;
		functionWrapper = newFunctionWrapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER, oldFunctionWrapper, functionWrapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext getWrappedContext() {
		if (wrappedContext != null && wrappedContext.eIsProxy()) {
			InternalEObject oldWrappedContext = (InternalEObject)wrappedContext;
			wrappedContext = (BExecutionContext)eResolveProxy(oldWrappedContext);
			if (wrappedContext != oldWrappedContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT, oldWrappedContext, wrappedContext));
			}
		}
		return wrappedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext basicGetWrappedContext() {
		return wrappedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedContext(BExecutionContext newWrappedContext) {
		BExecutionContext oldWrappedContext = wrappedContext;
		wrappedContext = newWrappedContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT, oldWrappedContext, wrappedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void mapContext(BExecutionContext ctx, Map<String, String> map, BFunctionWrapper functionWrapper) {
		valueMap = new ValueMapFacade(map,ctx.getValueMap());
		setFunctionWrapper(functionWrapper);
		setWrappedContext(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object[] getParameters() {
		ValueMapFacade facade = getValueMapFacade();
		if(facade.isDirty())
			return facade.getParameterArray();
		return parameters;
	}
	private ValueMapFacade getValueMapFacade() {
		return ValueMapFacade.class.cast(valueMap);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Object[] newParameters) {
		Object[] oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BWRAPPING_CONTEXT__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getParameterTypes() {
		return parameterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTypes(Type[] newParameterTypes) {
		Type[] oldParameterTypes = parameterTypes;
		parameterTypes = newParameterTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BWRAPPING_CONTEXT__PARAMETER_TYPES, oldParameterTypes, parameterTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarargsName() {
		return varargsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * If the varargs parameter is used in a wrapping function, it must have informed the wrapping context about this.
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setVarargsName(String newVarargsName) {
		String oldVarargsName = varargsName;
		varargsName = newVarargsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BWRAPPING_CONTEXT__VARARGS_NAME, oldVarargsName, varargsName));
		if(varargsName == null)
			return;
		try {
			getValueMapFacade().monitorVarargs(varargsName);
		} catch (B3NoSuchVariableException e) {
			throw new B3InternalError("Wrapping context got a varargs variable name that was not found: "+ varargsName);
		}catch (B3EngineException e) {
			throw new B3InternalError("Problem monitoring the varargs parameter: "+ varargsName, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER:
				if (resolve) return getFunctionWrapper();
				return basicGetFunctionWrapper();
			case B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT:
				if (resolve) return getWrappedContext();
				return basicGetWrappedContext();
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETERS:
				return getParameters();
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETER_TYPES:
				return getParameterTypes();
			case B3backendPackage.BWRAPPING_CONTEXT__VARARGS_NAME:
				return getVarargsName();
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
			case B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER:
				setFunctionWrapper((BFunctionWrapper)newValue);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT:
				setWrappedContext((BExecutionContext)newValue);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETERS:
				setParameters((Object[])newValue);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETER_TYPES:
				setParameterTypes((Type[])newValue);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__VARARGS_NAME:
				setVarargsName((String)newValue);
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
			case B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER:
				setFunctionWrapper((BFunctionWrapper)null);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT:
				setWrappedContext((BExecutionContext)null);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETER_TYPES:
				setParameterTypes(PARAMETER_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BWRAPPING_CONTEXT__VARARGS_NAME:
				setVarargsName(VARARGS_NAME_EDEFAULT);
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
			case B3backendPackage.BWRAPPING_CONTEXT__FUNCTION_WRAPPER:
				return functionWrapper != null;
			case B3backendPackage.BWRAPPING_CONTEXT__WRAPPED_CONTEXT:
				return wrappedContext != null;
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case B3backendPackage.BWRAPPING_CONTEXT__PARAMETER_TYPES:
				return PARAMETER_TYPES_EDEFAULT == null ? parameterTypes != null : !PARAMETER_TYPES_EDEFAULT.equals(parameterTypes);
			case B3backendPackage.BWRAPPING_CONTEXT__VARARGS_NAME:
				return VARARGS_NAME_EDEFAULT == null ? varargsName != null : !VARARGS_NAME_EDEFAULT.equals(varargsName);
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(", parameterTypes: ");
		result.append(parameterTypes);
		result.append(", varargsName: ");
		result.append(varargsName);
		result.append(')');
		return result.toString();
	}

	/**
	 * This implementation returns the facaded/mapped value map resulting from the call to
	 *  {@link #mapContext(BExecutionContext, Map)}. Note that if no such call has been made.
	 *  @returns null if {@link #mapContext(BExecutionContext, Map)} has not been called as part of the setup of this context
	 */
	@Override
	public ValueMap getValueMap() {
		return valueMap;
	}
} //BWrappingContextImpl
