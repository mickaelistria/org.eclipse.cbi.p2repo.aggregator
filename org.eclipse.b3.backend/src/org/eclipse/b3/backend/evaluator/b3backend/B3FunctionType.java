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
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Function Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getFunctionType <em>Function Type</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getReturnType <em>Return Type</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getParameterTypes <em>Parameter Types</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#isVarArgs <em>Var Args</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getTypeCalculator <em>Type Calculator</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType"
 * @generated
 */
public interface B3FunctionType extends EObject, Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Function Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Type</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Function Type</em>' reference.
	 * @see #setFunctionType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType_FunctionType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Type getFunctionType();

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' reference list.
	 * The list contents are of type {@link java.lang.reflect.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter Types</em>' reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType_ParameterTypes()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	EList<Type> getParameterTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getParameterTypesArray();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType_ReturnType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type"
	 *        typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type getReturnTypeForParameterTypes(Type[] types, BExecutionContext ctx);

	/**
	 * Returns the value of the '<em><b>Type Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Calculator</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Calculator</em>' reference.
	 * @see #setTypeCalculator(BTypeCalculator)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType_TypeCalculator()
	 * @model
	 * @generated
	 */
	BTypeCalculator getTypeCalculator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	boolean isAssignableFrom(Type type);

	/**
	 * Returns the value of the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Args</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Var Args</em>' attribute.
	 * @see #setVarArgs(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FunctionType_VarArgs()
	 * @model
	 * @generated
	 */
	boolean isVarArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getFunctionType
	 * <em>Function Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Function Type</em>' reference.
	 * @see #getFunctionType()
	 * @generated
	 */
	void setFunctionType(Type value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getReturnType
	 * <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getTypeCalculator
	 * <em>Type Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type Calculator</em>' reference.
	 * @see #getTypeCalculator()
	 * @generated
	 */
	void setTypeCalculator(BTypeCalculator value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#isVarArgs
	 * <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Var Args</em>' attribute.
	 * @see #isVarArgs()
	 * @generated
	 */
	void setVarArgs(boolean value);

} // B3FunctionType
