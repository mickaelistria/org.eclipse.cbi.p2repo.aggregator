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
 * A representation of the model object '<em><b>IProvided Capability Container</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.IProvidedCapabilityContainer#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getIProvidedCapabilityContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProvidedCapabilityContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capabilities</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provided Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getIProvidedCapabilityContainer_ProvidedCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getProvidedCapabilities();

} // IProvidedCapabilityContainer
