/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
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
 *   <li>{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getIRequiredCapabilityContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRequiredCapabilityContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getIRequiredCapabilityContainer_RequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getRequiredCapabilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<RequiredCapability> getEffectiveRequirements(BExecutionContext ctx) throws Throwable;

} // IRequiredCapabilityContainer
