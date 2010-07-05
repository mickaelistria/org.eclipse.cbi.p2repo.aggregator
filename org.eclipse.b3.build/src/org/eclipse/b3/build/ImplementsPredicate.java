/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.ImplementsPredicate#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getImplementsPredicate()
 * @model
 * @generated
 */
public interface ImplementsPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.eclipse.b3.build.B3BuildPackage#getImplementsPredicate_Type()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.ImplementsPredicate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ImplementsPredicate
