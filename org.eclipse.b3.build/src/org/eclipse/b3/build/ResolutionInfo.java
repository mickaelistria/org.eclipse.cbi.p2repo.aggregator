/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.ResolutionInfo#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getResolutionInfo()
 * @model
 * @generated
 */
public interface ResolutionInfo extends EObject {

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(IStatus)
	 * @see org.eclipse.b3.build.B3BuildPackage#getResolutionInfo_Status()
	 * @model dataType="org.eclipse.b3.build.IStatus"
	 * @generated
	 */
	IStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.ResolutionInfo#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IStatus value);
} // ResolutionInfo
