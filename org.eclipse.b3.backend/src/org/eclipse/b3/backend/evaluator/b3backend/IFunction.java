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

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames <em>Parameter Names</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeCalculator <em>Type Calculator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isClassFunction <em>Class Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction()
 * @model interface="true" abstract="true" superTypes="org.eclipse.b3.backend.evaluator.b3backend.IGenericDeclaration org.eclipse.b3.backend.evaluator.b3backend.BExpression"
 * @generated
 */
public interface IFunction extends GenericDeclaration, BExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.backend.evaluator.b3backend.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Execution Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #setExecutionMode(ExecutionMode)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ExecutionMode()
	 * @model
	 * @generated
	 */
	ExecutionMode getExecutionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExecutionMode <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #getExecutionMode()
	 * @generated
	 */
	void setExecutionMode(ExecutionMode value);

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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(BGuard)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Guard()
	 * @model containment="true"
	 * @generated
	 */
	BGuard getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(BGuard value);

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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ParameterTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray" transient="true" derived="true"
	 * @generated
	 */
	Type[] getParameterTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes <em>Parameter Types</em>}' attribute.
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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ExceptionTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getExceptionTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExceptionTypes <em>Exception Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Types</em>' attribute.
	 * @see #getExceptionTypes()
	 * @generated
	 */
	void setExceptionTypes(Type[] value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' attribute.
	 * @see #setTypeParameters(TypeVariable[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_TypeParameters()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeVariableArray"
	 * @generated NOT
	 */
	TypeVariable<?>[] getTypeParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeParameters <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' attribute.
	 * @see #getTypeParameters()
	 * @generated NOT
	 */
	void setTypeParameters(TypeVariable<?>[] value);

	/**
	 * Returns the value of the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Names</em>' attribute.
	 * @see #setParameterNames(String[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ParameterNames()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.StringArray" transient="true" derived="true"
	 * @generated
	 */
	String[] getParameterNames();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames <em>Parameter Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Names</em>' attribute.
	 * @see #getParameterNames()
	 * @generated
	 */
	void setParameterNames(String[] value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameters are the declared parameters. Some parameters may be implicit. Use {@link #getEffetiveParameters} to get all of the parameter declarations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BParameterDeclaration> getParameters();

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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_VarArgs()
	 * @model
	 * @generated
	 */
	boolean isVarArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isVarArgs <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Args</em>' attribute.
	 * @see #isVarArgs()
	 * @generated
	 */
	void setVarArgs(boolean value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ReturnType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closure</em>' reference.
	 * @see #setClosure(BExecutionContext)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Closure()
	 * @model
	 * @generated
	 */
	BExecutionContext getClosure();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getClosure <em>Closure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closure</em>' reference.
	 * @see #getClosure()
	 * @generated
	 */
	void setClosure(BExecutionContext value);

	/**
	 * Returns the value of the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Calculator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Calculator</em>' containment reference.
	 * @see #setTypeCalculator(BTypeCalculator)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_TypeCalculator()
	 * @model containment="true"
	 * @generated
	 */
	BTypeCalculator getTypeCalculator();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeCalculator <em>Type Calculator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Calculator</em>' containment reference.
	 * @see #getTypeCalculator()
	 * @generated
	 */
	void setTypeCalculator(BTypeCalculator value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(BFunctionContainer)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_Container()
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer#getFunctions
	 * @model opposite="functions" transient="false"
	 * @generated
	 */
	BFunctionContainer getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(BFunctionContainer value);

	/**
	 * Returns the value of the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Function</em>' attribute.
	 * @see #setClassFunction(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getIFunction_ClassFunction()
	 * @model
	 * @generated
	 */
	boolean isClassFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isClassFunction <em>Class Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Function</em>' attribute.
	 * @see #isClassFunction()
	 * @generated
	 */
	void setClassFunction(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls the function and returns its value. The context passed to this method is used as the context in which the function may store its parameter bindings.
	 * 
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Object call(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prepares the call (if needed) by processing the parameters and types and updating the context.
	 * Does not perform the actual call.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	BExecutionContext prepareCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Type getSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type getReturnTypeForParameterTypes(Type[] types, BExecutionContext ctx);

} // IFunction
