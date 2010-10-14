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
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.evaluator.B3FuncStore;
import org.eclipse.b3.backend.evaluator.ValueMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import com.google.inject.Injector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BExecution Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValueMap <em>Value Map</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFuncStore <em>Func Store</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getEffectiveConcerns <em>Effective Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getInjector <em>Injector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext()
 * @model abstract="true"
 * @generated
 */
public interface BExecutionContext extends ITypedValueContainer {
	/**
	 * This is not generated because it seems impossible to define this signature in the ecore model...
	 * 
	 * @generated NOT
	 */
	public <T> void defineSomeThing(Class<T> kind, Object key, T value, boolean isWeaving) throws Throwable;

	/**
	 * This is not generated because it seems impossible to define this signature in the ecore model...
	 * Returns an immutable view of the thing map of a particular kind.
	 * 
	 * @generated NOT
	 */
	public Map<Object, Object> getMapOfThings(Class<?> kind);

	/**
	 * This is not generated because it seems impossible to define this signature in the ecore model...
	 * 
	 * @generated NOT
	 */
	public <T> T getSomeThing(Class<T> kind, Object key);

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
	 * <!-- begin-model-doc -->
	 * Creates a new inner context parented by a delegating context refering to a newly created outer context.
	 * The freshly created outer context is obtained by simply calling getOuterContext on the returned inner context.
	 * 
	 * This method is useful when a context is needed that keeps the input context's content visible (in the returned inner context), while at the same time providing a new outer context where values visible downstream can be placed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	BInnerContext createWrappedInnerContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.backend.evaluator.b3backend.BConcernContext>"
	 * @generated
	 */
	// Iterator<BConcernContext> getConcernIterator(Object candidate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	IFunction defineFunction(IFunction function) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluate the function referenced by name in this context.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	IFunction findFunction(String functionName, Type[] types) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	<T> T getContext(Class<T> clazz) throws B3EngineException;

	/**
	 * Returns the value of the '<em><b>Effective Concerns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Concerns</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Concerns</em>' reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_EffectiveConcerns()
	 * @model
	 * @generated
	 */
	EList<BConcern> getEffectiveConcerns();

	/**
	 * Returns the value of the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Store</em>' attribute isn't clear, there really should be more of a description here...
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.backend.evaluator.b3backend.IFunction>"
	 * @generated
	 */
	Iterator<IFunction> getFunctionIterator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.backend.evaluator.b3backend.IFunction>"
	 * @generated
	 */
	Iterator<IFunction> getFunctionIterator(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.backend.evaluator.b3backend.IFunction>" typeDataType="org.eclipse.b3.backend.evaluator.b3backend.Type"
	 * @generated
	 */
	Iterator<IFunction> getFunctionIterator(Type type, Class<?> functionType);

	/**
	 * Returns the value of the '<em><b>Injector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injector</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injector</em>' attribute.
	 * @see #setInjector(Injector)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_Injector()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Injector" transient="true"
	 * @generated
	 */
	Injector getInjector();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	BInvocationContext getInvocationContext() throws B3EngineException;

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' reference.
	 * @see #setParentContext(BExecutionContext)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ParentContext()
	 * @model
	 * @generated
	 */
	BExecutionContext getParentContext();

	/**
	 * Returns the value of the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Monitor</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Monitor</em>' attribute.
	 * @see #setProgressMonitor(IProgressMonitor)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ProgressMonitor()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.IProgressMonitor" transient="true"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Returns the value of the '<em><b>Value Map</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Map</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Map</em>' attribute.
	 * @see #setValueMap(ValueMap)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExecutionContext_ValueMap()
	 * @model default="" dataType="org.eclipse.b3.backend.evaluator.b3backend.ValueMap" required="true"
	 * @generated
	 */
	ValueMap getValueMap();

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
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" methodDataType="org.eclipse.b3.backend.evaluator.b3backend.Method"
	 * @generated
	 */
	BJavaFunction loadFunction(Method method) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	void loadFunctions(Class<? extends Object> clazz) throws B3EngineException;

	void printStack();

	void printStackTrace();

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
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getInjector <em>Injector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injector</em>' attribute.
	 * @see #getInjector()
	 * @generated
	 */
	void setInjector(Injector value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(BExecutionContext value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValueMap <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Map</em>' attribute.
	 * @see #getValueMap()
	 * @generated
	 */
	void setValueMap(ValueMap value);
} // BExecutionContext
