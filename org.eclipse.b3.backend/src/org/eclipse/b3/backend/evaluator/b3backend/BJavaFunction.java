/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BJava Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getCallType <em>Call Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getParameterNames <em>Parameter Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction()
 * @model
 * @generated
 */
public interface BJavaFunction extends BFunction {
	/**
	 * Returns the value of the '<em><b>Call Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Type</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType
	 * @see #setCallType(BJavaCallType)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction_CallType()
	 * @model
	 * @generated
	 */
	BJavaCallType getCallType();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Method)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction_Method()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Method" transient="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Returns the value of the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Names</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Names</em>' attribute.
	 * @see #setParameterNames(String[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction_ParameterNames()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.StringArray" transient="true" derived="true"
	 * @generated
	 */
	String[] getParameterNames();

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' attribute.
	 * @see #setParameterTypes(Type[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction_ParameterTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray" transient="true" derived="true"
	 * @generated
	 */
	Type[] getParameterTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" parameterTypesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] parameterTypes) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFunctionCall();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMethodCall();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSystemCall();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getCallType <em>Call Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Type</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType
	 * @see #getCallType()
	 * @generated
	 */
	void setCallType(BJavaCallType value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getParameterNames <em>Parameter Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Names</em>' attribute.
	 * @see #getParameterNames()
	 * @generated
	 */
	void setParameterNames(String[] value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getParameterTypes <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Types</em>' attribute.
	 * @see #getParameterTypes()
	 * @generated
	 */
	void setParameterTypes(Type[] value);

} // BJavaFunction
