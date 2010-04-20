/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.p2;

import java.net.URI;

import org.eclipse.equinox.p2.repository.IRepositoryReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.RepositoryReference#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.b3.p2.RepositoryReference#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.p2.RepositoryReference#getOptions <em>Options</em>}</li>
 * <li>{@link org.eclipse.b3.p2.RepositoryReference#getNickname <em>Nickname</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.p2.P2Package#getRepositoryReference()
 * @model superTypes="org.eclipse.b3.p2.IRepositoryReference"
 * @generated
 */
public interface RepositoryReference extends IRepositoryReference {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(URI)
	 * @see org.eclipse.b3.p2.P2Package#getRepositoryReference_Location()
	 * @model dataType="org.eclipse.b3.p2.URI"
	 * @generated
	 */
	URI getLocation();

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see org.eclipse.b3.p2.P2Package#getRepositoryReference_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(int)
	 * @see org.eclipse.b3.p2.P2Package#getRepositoryReference_Options()
	 * @model
	 * @generated
	 */
	int getOptions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see org.eclipse.b3.p2.P2Package#getRepositoryReference_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.p2.RepositoryReference#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.p2.RepositoryReference#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.p2.RepositoryReference#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(int value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.p2.RepositoryReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

} // RepositoryReference
