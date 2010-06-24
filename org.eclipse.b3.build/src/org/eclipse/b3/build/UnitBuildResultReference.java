/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Build Result Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.UnitBuildResultReference#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.eclipse.b3.build.UnitBuildResultReference#getBuilderName <em>Builder Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.UnitBuildResultReference#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.UnitBuildResultReference#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getUnitBuildResultReference()
 * @model
 * @generated
 */
public interface UnitBuildResultReference extends BuildResultReference {
	/**
	 * Returns the value of the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Builder Name</em>' attribute.
	 * @see #setBuilderName(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitBuildResultReference_BuilderName()
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
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitBuildResultReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitBuildResultReference_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(BParameterList)
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitBuildResultReference_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	BParameterList getParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitBuildResultReference#getBuilderName
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
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitBuildResultReference#getName <em>Name</em>}'
	 * attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitBuildResultReference#getNameSpace
	 * <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitBuildResultReference#getParameters
	 * <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(BParameterList value);

} // UnitBuildResultReference
