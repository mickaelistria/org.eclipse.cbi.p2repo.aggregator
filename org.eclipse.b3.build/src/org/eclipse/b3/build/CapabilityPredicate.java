/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Predicate</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.CapabilityPredicate#getVersionRange <em>Version Range</em>}</li>
 * <li>{@link org.eclipse.b3.build.CapabilityPredicate#getNamePredicate <em>Name Predicate</em>}</li>
 * <li>{@link org.eclipse.b3.build.CapabilityPredicate#getNameSpacePredicate <em>Name Space Predicate</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getCapabilityPredicate()
 * @model
 * @generated
 */
public interface CapabilityPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Predicate</em>' containment reference.
	 * @see #setNamePredicate(BNamePredicate)
	 * @see org.eclipse.b3.build.B3BuildPackage#getCapabilityPredicate_NamePredicate()
	 * @model containment="true"
	 * @generated
	 */
	BNamePredicate getNamePredicate();

	/**
	 * Returns the value of the '<em><b>Name Space Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Space Predicate</em>' containment reference.
	 * @see #setNameSpacePredicate(BNamePredicate)
	 * @see org.eclipse.b3.build.B3BuildPackage#getCapabilityPredicate_NameSpacePredicate()
	 * @model containment="true"
	 * @generated
	 */
	BNamePredicate getNameSpacePredicate();

	/**
	 * Returns the value of the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Range</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version Range</em>' attribute.
	 * @see #setVersionRange(VersionRange)
	 * @see org.eclipse.b3.build.B3BuildPackage#getCapabilityPredicate_VersionRange()
	 * @model dataType="org.eclipse.b3.build.VersionRange"
	 * @generated
	 */
	VersionRange getVersionRange();

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
	boolean matches(RequiredCapability candidate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean matches(VersionedCapability candidate);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.CapabilityPredicate#getNamePredicate <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name Predicate</em>' containment reference.
	 * @see #getNamePredicate()
	 * @generated
	 */
	void setNamePredicate(BNamePredicate value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.CapabilityPredicate#getNameSpacePredicate <em>Name Space Predicate</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name Space Predicate</em>' containment reference.
	 * @see #getNameSpacePredicate()
	 * @generated
	 */
	void setNameSpacePredicate(BNamePredicate value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.CapabilityPredicate#getVersionRange <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version Range</em>' attribute.
	 * @see #getVersionRange()
	 * @generated
	 */
	void setVersionRange(VersionRange value);

} // CapabilityPredicate
