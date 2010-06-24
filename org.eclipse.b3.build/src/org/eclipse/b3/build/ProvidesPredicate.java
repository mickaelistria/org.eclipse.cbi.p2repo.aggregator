/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Predicate</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.ProvidesPredicate#getCapabilityPredicate <em>Capability Predicate</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getProvidesPredicate()
 * @model
 * @generated
 */
public interface ProvidesPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #setCapabilityPredicate(CapabilityPredicate)
	 * @see org.eclipse.b3.build.B3BuildPackage#getProvidesPredicate_CapabilityPredicate()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityPredicate getCapabilityPredicate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean matches(Capability candidate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean matches(VersionedCapability candidate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes matching prerequisites and returns true if something was removed.
	 * <!-- end-model-doc -->
	 * 
	 * @model inputMany="false"
	 * @generated
	 */
	boolean removeMatching(EList<Capability> input);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.ProvidesPredicate#getCapabilityPredicate <em>Capability Predicate</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Capability Predicate</em>' containment reference.
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	void setCapabilityPredicate(CapabilityPredicate value);

} // ProvidesPredicate
