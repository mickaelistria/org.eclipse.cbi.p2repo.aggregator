/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRequired Capability Container</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredPredicates <em>Required Predicates</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getIRequiredCapabilityContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRequiredCapabilityContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capabilities</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getIRequiredCapabilityContainer_RequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Required Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.CapabilityPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Predicates</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Predicates</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getIRequiredCapabilityContainer_RequiredPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityPredicate> getRequiredPredicates();

} // IRequiredCapabilityContainer
