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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BWith Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getReferencedAdvice <em>Referenced Advice</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWithExpression()
 * @model
 * @generated
 */
public interface BWithExpression extends BExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Referenced Advice</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BAdvice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Advice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Advice</em>' reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWithExpression_ReferencedAdvice()
	 * @model
	 * @generated
	 */
	EList<BAdvice> getReferencedAdvice();

	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWithExpression_PropertySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPropertySet> getPropertySets();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWithExpression_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Expr</em>' containment reference.
	 * @see #setFuncExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBWithExpression_FuncExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getFuncExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getFuncExpr <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Expr</em>' containment reference.
	 * @see #getFuncExpr()
	 * @generated
	 */
	void setFuncExpr(BExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BInnerContext createContext(BExecutionContext ctx);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	BExecutionContext getEvaluationContext(BExecutionContext ctx) throws Throwable;

} // BWithExpression
