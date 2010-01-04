/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.core.B3DynamicClassLoader;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FuncStore;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BExecution Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValueMap <em>Value Map</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFuncStore <em>Func Store</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext()
 * @model abstract="true"
 * @generated
 */
public interface BExecutionContext extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(BExecutionContext)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ParentContext()
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getChildContexts
	 * @model opposite="childContexts" transient="false"
	 * @generated
	 */
	BExecutionContext getParentContext();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(BExecutionContext value);

	/**
	 * Returns the value of the '<em><b>Child Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Contexts</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ChildContexts()
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	EList<BExecutionContext> getChildContexts();

	/**
	 * Returns the value of the '<em><b>Value Map</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Map</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ValueMap()
	 * @model default="" dataType="org.eclipse.b3.backend.evaluator.b3backend.ValueMap" required="true" changeable="false"
	 * @generated
	 */
	ValueMap getValueMap();

	/**
	 * Returns the value of the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Store</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Store</em>' attribute.
	 * @see #setFuncStore(B3FuncStore)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_FuncStore()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.FuncStore"
	 * @generated
	 */
	B3FuncStore getFuncStore();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFuncStore <em>Func Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Store</em>' attribute.
	 * @see #getFuncStore()
	 * @generated
	 */
	void setFuncStore(B3FuncStore value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	void loadFunctions(Class<? extends Object> clazz) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	Object getValue(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isFinal(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isImmutable(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	BInvocationContext getInvocationContext() throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BExecutionContext createInnerContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BExecutionContext createOuterContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	Type getDeclaredValueType(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluate the function referenced by name in this context.
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type getDeclaredFunctionType(String functionName, Type[] types) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPropertyScope();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.b3.backend.evaluator.b3backend.B3DynamicClassLoader" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	B3DynamicClassLoader getClassLoader() throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.LValue" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	LValue getLValue(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an immutable value
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an immutable value
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineFinalValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a variable value (mutable).
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineVariableValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a variable value (mutable).
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineFinalVariableValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	BFunction defineFunction(BFunction function) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluate the function referenced by name in this context.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" parametersDataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Object callFunction(String functionName, Object[] parameters, Type[] types) throws Throwable;
} // BExecutionContext
