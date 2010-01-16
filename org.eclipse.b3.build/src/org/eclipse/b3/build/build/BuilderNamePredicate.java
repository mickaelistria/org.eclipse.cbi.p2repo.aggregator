/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.NamePredicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuilderNamePredicate#getNamePredicate <em>Name Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderNamePredicate()
 * @model
 * @generated
 */
public interface BuilderNamePredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Predicate</em>' containment reference.
	 * @see #setNamePredicate(NamePredicate)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderNamePredicate_NamePredicate()
	 * @model containment="true"
	 * @generated
	 */
	NamePredicate getNamePredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderNamePredicate#getNamePredicate <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Predicate</em>' containment reference.
	 * @see #getNamePredicate()
	 * @generated
	 */
	void setNamePredicate(NamePredicate value);

} // BuilderNamePredicate
