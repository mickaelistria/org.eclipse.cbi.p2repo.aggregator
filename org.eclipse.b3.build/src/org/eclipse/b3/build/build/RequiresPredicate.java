/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.RequiresPredicate#getCapabilityPredicate <em>Capability Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RequiresPredicate#isMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiresPredicate()
 * @model
 * @generated
 */
public interface RequiresPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #setCapabilityPredicate(CapabilityPredicate)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiresPredicate_CapabilityPredicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CapabilityPredicate getCapabilityPredicate();

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' attribute.
	 * @see #setMeta(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiresPredicate_Meta()
	 * @model
	 * @generated
	 */
	boolean isMeta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean matches(RequiredCapability candidate);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiresPredicate#getCapabilityPredicate <em>Capability Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	void setCapabilityPredicate(CapabilityPredicate value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiresPredicate#isMeta <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' attribute.
	 * @see #isMeta()
	 * @generated
	 */
	void setMeta(boolean value);

} // RequiresPredicate
