/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.p2;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Unit</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.InstallableUnit#getPropertyMap <em>Property Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.p2.P2Package#getInstallableUnit()
 * @model superTypes="org.eclipse.b3.p2.IInstallableUnit"
 * @generated
 */
public interface InstallableUnit extends IInstallableUnit {
	/**
	 * Returns the value of the '<em><b>Property Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Map</em>' map.
	 * @see org.eclipse.b3.p2.P2Package#getInstallableUnit_PropertyMap()
	 * @model mapType="org.eclipse.b3.p2.Property<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getPropertyMap();

} // InstallableUnit
