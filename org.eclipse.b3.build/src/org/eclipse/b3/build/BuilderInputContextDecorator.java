/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Input Context Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderInputContextDecorator#getWithExpr <em>With Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderInputContextDecorator()
 * @model
 * @generated
 */
public interface BuilderInputContextDecorator extends BuilderInputDecorator {
	/**
	 * Returns the value of the '<em><b>With Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Expr</em>' containment reference.
	 * @see #setWithExpr(BWithExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderInputContextDecorator_WithExpr()
	 * @model containment="true"
	 * @generated
	 */
	BWithExpression getWithExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderInputContextDecorator#getWithExpr <em>With Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Expr</em>' containment reference.
	 * @see #getWithExpr()
	 * @generated
	 */
	void setWithExpr(BWithExpression value);

} // BuilderInputContextDecorator
