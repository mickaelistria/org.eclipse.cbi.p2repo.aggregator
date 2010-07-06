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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDef Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBDefValue()
 * @model
 * @generated
 */
public interface BDefValue extends BExpression, ITypedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Value Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expr</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expr</em>' containment reference.
	 * @see #setValueExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBDefValue_ValueExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getValueExpr();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBDefValue_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Returns the value of the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immutable</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immutable</em>' attribute.
	 * @see #setImmutable(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBDefValue_Immutable()
	 * @model
	 * @generated
	 */
	boolean isImmutable();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isImmutable <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immutable</em>' attribute.
	 * @see #isImmutable()
	 * @generated
	 */
	void setImmutable(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getValueExpr <em>Value Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expr</em>' containment reference.
	 * @see #getValueExpr()
	 * @generated
	 */
	void setValueExpr(BExpression value);

} // BDefValue
