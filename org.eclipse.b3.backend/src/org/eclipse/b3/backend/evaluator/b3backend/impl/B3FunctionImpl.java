/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.typesystem.B3ParameterizedType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B3 Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class B3FunctionImpl extends BFunctionImpl implements B3Function {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.B3_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getFuncExpr() {
		if (funcExpr != null && funcExpr.eIsProxy()) {
			InternalEObject oldFuncExpr = (InternalEObject)funcExpr;
			funcExpr = (BExpression)eResolveProxy(oldFuncExpr);
			if (funcExpr != oldFuncExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.B3_FUNCTION__FUNC_EXPR, oldFuncExpr, funcExpr));
			}
		}
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression basicGetFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncExpr(BExpression newFuncExpr) {
		BExpression oldFuncExpr = funcExpr;
		funcExpr = newFuncExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNCTION__FUNC_EXPR, oldFuncExpr, funcExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.B3_FUNCTION__FUNC_EXPR:
				if (resolve) return getFuncExpr();
				return basicGetFuncExpr();
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
			case B3backendPackage.B3_FUNCTION__FUNC_EXPR:
				setFuncExpr((BExpression)newValue);
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
			case B3backendPackage.B3_FUNCTION__FUNC_EXPR:
				setFuncExpr((BExpression)null);
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
			case B3backendPackage.B3_FUNCTION__FUNC_EXPR:
				return funcExpr != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * Calls the B3 Defined function using the context passed as the context for the function.
	 * Function starts by binding the parameters to declared parameter names.
	 * Function body is then evaluated and returned.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object internalCall(BExecutionContext octx, Object[] parameters, Type[] types) throws Throwable {
		if(parameterTypes != null && parameterTypes.length > 0) { // if function takes no parameters, there is no binding to be done
			int limit = parameterTypes.length -1; // bind all but the last defined parameter
			if(parameters.length < limit)
				throw new IllegalArgumentException("B3 Function called with too few arguments");
			for(int i = 0; i < limit; i++) {
				// check type compatibility
				if(!((Class)parameterTypes[i]).isAssignableFrom(parameters[i].getClass()))
					throw new B3IncompatibleTypeException(parameterNames.get(i), 
							parameterTypes[i].getClass(), parameters[i].getClass());
				// ok, define it		
				octx.defineVariableValue(parameterNames.get(i), parameters[i], parameterTypes[i]);
			}
			if(!isVarArgs()) { // if not varargs, bind the last defined parameter
				if(parameters.length < parameterTypes.length)
					throw new IllegalArgumentException("B3 Function called with too few arguments. Expected: "+parameterTypes.length +" but got: "+parameters.length);
				// check type compatibility
				if(!((Class)parameterTypes[limit]).isAssignableFrom(parameters[limit].getClass()))
					throw new B3IncompatibleTypeException(parameterNames.get(limit), 
							parameterTypes[limit].getClass(), parameters[limit].getClass());
				// ok
				octx.defineVariableValue(parameterNames.get(limit), parameters[limit], parameterTypes[limit]);
			} else {
				// varargs call, create a list and stuff any remaining parameters there
				List<Object> varargs = new ArrayList<Object>();
				Class varargsType = parameterTypes[limit].getClass();
				for(int i = limit; i < parameters.length; i++) {
					if(!varargsType.isAssignableFrom(parameters[i].getClass()))
						throw new B3IncompatibleTypeException(parameterNames.get(limit), 
								varargsType, parameters[i].getClass());
					varargs.add(parameters[i]);
					}
				
				// bind the varargs to a List of the declared type (possibly an empty list).
				octx.defineVariableValue(parameterNames.get(limit), varargs, 
						new B3ParameterizedType(List.class, new Type[] { parameterTypes[limit] }));
			}
		}
		// all set up - fire away
		return funcExpr.evaluate(octx);
	}
} //B3FunctionImpl
