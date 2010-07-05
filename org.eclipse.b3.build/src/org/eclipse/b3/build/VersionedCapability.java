/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.equinox.p2.metadata.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.VersionedCapability#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getVersionedCapability()
 * @model
 * @generated
 */
public interface VersionedCapability extends Capability {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see org.eclipse.b3.build.B3BuildPackage#getVersionedCapability_Version()
	 * @model dataType="org.eclipse.b3.build.Version"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.VersionedCapability#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

} // VersionedCapability
