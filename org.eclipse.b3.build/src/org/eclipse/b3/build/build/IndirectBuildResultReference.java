/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Build Result Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.IndirectBuildResultReference#getVersionRange <em>Version Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getIndirectBuildResultReference()
 * @model
 * @generated
 */
public interface IndirectBuildResultReference extends UnitBuildResultReference {
	/**
	 * Returns the value of the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Range</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version Range</em>' attribute.
	 * @see #setVersionRange(VersionRange)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getIndirectBuildResultReference_VersionRange()
	 * @model dataType="org.eclipse.b3.build.build.VersionRange"
	 * @generated
	 */
	VersionRange getVersionRange();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.IndirectBuildResultReference#getVersionRange
	 * <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version Range</em>' attribute.
	 * @see #getVersionRange()
	 * @generated
	 */
	void setVersionRange(VersionRange value);

} // IndirectBuildResultReference
