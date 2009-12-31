/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getBuilders <em>Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit()
 * @model
 * @generated
 */
public interface BuildUnit extends VersionedCapability {

	/**
	 * Returns the value of the '<em><b>Unit Provided Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Provided Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Provided Capabilities</em>' containment reference.
	 * @see #setUnitProvidedCapabilities(VersionedCapability)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_UnitProvidedCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	VersionedCapability getUnitProvidedCapabilities();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildUnit#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Provided Capabilities</em>' containment reference.
	 * @see #getUnitProvidedCapabilities()
	 * @generated
	 */
	void setUnitProvidedCapabilities(VersionedCapability value);

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Builder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builders</em>' reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Builders()
	 * @model
	 * @generated
	 */
	EList<Builder> getBuilders();
} // BuildUnit
