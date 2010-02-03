/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.NamePredicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.InputPredicate#getCapabilityPredicate <em>Capability Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.InputPredicate#getBuilderPredicate <em>Builder Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getInputPredicate()
 * @model
 * @generated
 */
public interface InputPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #setCapabilityPredicate(CapabilityPredicate)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getInputPredicate_CapabilityPredicate()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityPredicate getCapabilityPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.InputPredicate#getCapabilityPredicate <em>Capability Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	void setCapabilityPredicate(CapabilityPredicate value);

	/**
	 * Returns the value of the '<em><b>Builder Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Predicate</em>' containment reference.
	 * @see #setBuilderPredicate(BNamePredicate)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getInputPredicate_BuilderPredicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BNamePredicate getBuilderPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.InputPredicate#getBuilderPredicate <em>Builder Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Predicate</em>' containment reference.
	 * @see #getBuilderPredicate()
	 * @generated
	 */
	void setBuilderPredicate(BNamePredicate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes matching prerequisites and returns true if something was removed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean removeMatching(BuilderInput input);

} // InputPredicate
