/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnitWrapper#getOriginal <em>Original</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnitWrapper()
 * @model
 * @generated
 */
public interface BuildUnitWrapper extends BuildUnit {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(BuildUnit)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnitWrapper_Original()
	 * @model
	 * @generated
	 */
	BuildUnit getOriginal();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildUnitWrapper#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(BuildUnit value);

} // BuildUnitWrapper
