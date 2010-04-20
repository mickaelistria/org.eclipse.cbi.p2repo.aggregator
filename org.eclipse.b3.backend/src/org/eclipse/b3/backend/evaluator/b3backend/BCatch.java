/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCatch</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr <em>Catch Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getVarname <em>Varname</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch()
 * @model
 * @generated
 */
public interface BCatch extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Object evaluate(BExecutionContext ctx) throws CoreException, Throwable;

	/**
	 * Returns the value of the '<em><b>Catch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Catch Expr</em>' containment reference.
	 * @see #setCatchExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch_CatchExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getCatchExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type"
	 *        exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Type getDeclaredType(BExecutionContext ctx) throws Throwable;

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exception Type</em>' containment reference.
	 * @see #setExceptionType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch_ExceptionType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true" required="true"
	 * @generated
	 */
	Type getExceptionType();

	/**
	 * Returns the value of the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varname</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Varname</em>' attribute.
	 * @see #setVarname(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCatch_Varname()
	 * @model
	 * @generated
	 */
	String getVarname();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr <em>Catch Expr</em>} ' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Catch Expr</em>' containment reference.
	 * @see #getCatchExpr()
	 * @generated
	 */
	void setCatchExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getExceptionType
	 * <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(Type value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getVarname <em>Varname</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Varname</em>' attribute.
	 * @see #getVarname()
	 * @generated
	 */
	void setVarname(String value);

} // BCatch
