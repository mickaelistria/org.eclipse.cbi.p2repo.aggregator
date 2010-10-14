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
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BWrapping Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getFunctionWrapper <em>Function Wrapper</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getWrappedContext <em>Wrapped Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getVarargsName <em>Varargs Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext()
 * @model
 * @generated
 */
public interface BWrappingContext extends BDelegatingContext {
	/**
	 * Returns the value of the '<em><b>Function Wrapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Wrapper</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Wrapper</em>' reference.
	 * @see #setFunctionWrapper(BFunctionWrapper)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext_FunctionWrapper()
	 * @model
	 * @generated
	 */
	BFunctionWrapper getFunctionWrapper();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(Object[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext_Parameters()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.ObjectArray"
	 * @generated
	 */
	Object[] getParameters();

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' attribute.
	 * @see #setParameterTypes(Type[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext_ParameterTypes()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getParameterTypes();

	/**
	 * Returns the value of the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs Name</em>' attribute.
	 * @see #setVarargsName(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext_VarargsName()
	 * @model
	 * @generated
	 */
	String getVarargsName();

	/**
	 * Returns the value of the '<em><b>Wrapped Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Context</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Context</em>' reference.
	 * @see #setWrappedContext(BExecutionContext)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWrappingContext_WrappedContext()
	 * @model
	 * @generated
	 */
	BExecutionContext getWrappedContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mapContext(BExecutionContext ctx, Map<String, String> map, BFunctionWrapper functionWrapper);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getFunctionWrapper <em>Function Wrapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Wrapper</em>' reference.
	 * @see #getFunctionWrapper()
	 * @generated
	 */
	void setFunctionWrapper(BFunctionWrapper value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Object[] value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameterTypes <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Types</em>' attribute.
	 * @see #getParameterTypes()
	 * @generated
	 */
	void setParameterTypes(Type[] value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getVarargsName <em>Varargs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varargs Name</em>' attribute.
	 * @see #getVarargsName()
	 * @generated
	 */
	void setVarargsName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getWrappedContext <em>Wrapped Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Context</em>' reference.
	 * @see #getWrappedContext()
	 * @generated
	 */
	void setWrappedContext(BExecutionContext value);

} // BWrappingContext
