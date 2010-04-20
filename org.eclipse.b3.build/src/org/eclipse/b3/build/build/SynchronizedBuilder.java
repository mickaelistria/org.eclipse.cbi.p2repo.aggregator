/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronized Builder</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.SynchronizedBuilder#getNameSpace <em>Name Space</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.SynchronizedBuilder#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.SynchronizedBuilder#getBuilderName <em>Builder Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getSynchronizedBuilder()
 * @model
 * @generated
 */
public interface SynchronizedBuilder extends EObject {
	/**
	 * Returns the value of the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Builder Name</em>' attribute.
	 * @see #setBuilderName(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getSynchronizedBuilder_BuilderName()
	 * @model
	 * @generated
	 */
	String getBuilderName();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getSynchronizedBuilder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getSynchronizedBuilder_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getBuilderName
	 * <em>Builder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Builder Name</em>' attribute.
	 * @see #getBuilderName()
	 * @generated
	 */
	void setBuilderName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getNameSpace <em>Name Space</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // SynchronizedBuilder
