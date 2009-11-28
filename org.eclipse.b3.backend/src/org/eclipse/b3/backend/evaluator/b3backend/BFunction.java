/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isSequential <em>Sequential</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getTypeVariables <em>Type Variables</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getParameterNames <em>Parameter Names</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction()
 * @model abstract="true"
 * @generated
 */
public interface BFunction extends BExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential</em>' attribute.
	 * @see #setSequential(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Sequential()
	 * @model
	 * @generated
	 */
	boolean isSequential();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isSequential <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential</em>' attribute.
	 * @see #isSequential()
	 * @generated
	 */
	void setSequential(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(BGuard)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Guard()
	 * @model
	 * @generated
	 */
	BGuard getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(BGuard value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_ReturnType()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' attribute.
	 * @see #setParameterTypes(Type[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_ParameterTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray" transient="true" derived="true"
	 * @generated
	 */
	Type[] getParameterTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getParameterTypes <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Types</em>' attribute.
	 * @see #getParameterTypes()
	 * @generated
	 */
	void setParameterTypes(Type[] value);

	/**
	 * Returns the value of the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Types</em>' attribute.
	 * @see #setExceptionTypes(Type[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_ExceptionTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getExceptionTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getExceptionTypes <em>Exception Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Types</em>' attribute.
	 * @see #getExceptionTypes()
	 * @generated
	 */
	void setExceptionTypes(Type[] value);

	/**
	 * Returns the value of the '<em><b>Type Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Variables</em>' attribute.
	 * @see #setTypeVariables(TypeVariable[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_TypeVariables()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeVariableArray"
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	TypeVariable[] getTypeVariables();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getTypeVariables <em>Type Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Variables</em>' attribute.
	 * @see #getTypeVariables()
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	void setTypeVariables(TypeVariable[] value);

	/**
	 * Returns the value of the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Names</em>' attribute.
	 * @see #setParameterNames(String[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_ParameterNames()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.StringArray" transient="true" derived="true"
	 * @generated
	 */
	String[] getParameterNames();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#getParameterNames <em>Parameter Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Names</em>' attribute.
	 * @see #getParameterNames()
	 * @generated
	 */
	void setParameterNames(String[] value);

	/**
	 * Returns the value of the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Args</em>' attribute.
	 * @see #setVarArgs(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_VarArgs()
	 * @model
	 * @generated
	 */
	boolean isVarArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#isVarArgs <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Args</em>' attribute.
	 * @see #isVarArgs()
	 * @generated
	 */
	void setVarArgs(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BParameterDeclaration> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable;

} // BFunction
