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

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFunction Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getAroundExpr <em>Around Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getOriginal <em>Original</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getParameterMap <em>Parameter Map</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getVarargsName <em>Varargs Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionWrapper()
 * @model
 * @generated
 */
public interface BFunctionWrapper extends BExpression, IFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Around Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Around Expr</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Around Expr</em>' reference.
	 * @see #setAroundExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionWrapper_AroundExpr()
	 * @model required="true"
	 * @generated
	 */
	BExpression getAroundExpr();

	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(IFunction)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionWrapper_Original()
	 * @model
	 * @generated
	 */
	IFunction getOriginal();

	/**
	 * Returns the value of the '<em><b>Parameter Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Map</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter Map</em>' attribute.
	 * @see #setParameterMap(Map)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionWrapper_ParameterMap()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getParameterMap();

	/**
	 * Returns the value of the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varargs Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Varargs Name</em>' attribute.
	 * @see #setVarargsName(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionWrapper_VarargsName()
	 * @model
	 * @generated
	 */
	String getVarargsName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getAroundExpr <em>Around Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Around Expr</em>' reference.
	 * @see #getAroundExpr()
	 * @generated
	 */
	void setAroundExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(IFunction value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getParameterMap <em>Parameter Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parameter Map</em>' attribute.
	 * @see #getParameterMap()
	 * @generated
	 */
	void setParameterMap(Map<String, String> value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getVarargsName <em>Varargs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Varargs Name</em>' attribute.
	 * @see #getVarargsName()
	 * @generated
	 */
	void setVarargsName(String value);

} // BFunctionWrapper
