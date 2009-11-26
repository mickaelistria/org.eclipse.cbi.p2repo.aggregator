/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BJava Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#isSystemCall <em>System Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction()
 * @model
 * @generated
 */
public interface BJavaFunction extends BFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
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
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>System Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the call should be made on the form f(BExecutionContext ctx, Object[] params, Types[] types) or as a regular call, where no access to the context and types is provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Call</em>' attribute.
	 * @see #setSystemCall(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBJavaFunction_SystemCall()
	 * @model
	 * @generated
	 */
	boolean isSystemCall();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#isSystemCall <em>System Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Call</em>' attribute.
	 * @see #isSystemCall()
	 * @generated
	 */
	void setSystemCall(boolean value);

} // BJavaFunction
