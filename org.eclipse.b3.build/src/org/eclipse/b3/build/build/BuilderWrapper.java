/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isUnitTypeAdvised <em>Unit Type Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isProvidesAdvised <em>Provides Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isDefaultPropertiesAdvised <em>Default Properties Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isSourceAdvised <em>Source Advised</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper()
 * @model
 * @generated
 */
public interface BuilderWrapper extends BFunctionWrapper, IBuilder {

	/**
	 * Returns the value of the '<em><b>Default Properties Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties Advised</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Properties Advised</em>' attribute.
	 * @see #setDefaultPropertiesAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_DefaultPropertiesAdvised()
	 * @model
	 * @generated
	 */
	boolean isDefaultPropertiesAdvised();

	/**
	 * Returns the value of the '<em><b>Input Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Advised</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Advised</em>' attribute.
	 * @see #setInputAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_InputAdvised()
	 * @model
	 * @generated
	 */
	boolean isInputAdvised();

	/**
	 * Returns the value of the '<em><b>Output Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Advised</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Advised</em>' attribute.
	 * @see #setOutputAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_OutputAdvised()
	 * @model
	 * @generated
	 */
	boolean isOutputAdvised();

	/**
	 * Returns the value of the '<em><b>Provides Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Advised</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides Advised</em>' attribute.
	 * @see #setProvidesAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_ProvidesAdvised()
	 * @model
	 * @generated
	 */
	boolean isProvidesAdvised();

	/**
	 * Returns the value of the '<em><b>Source Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Advised</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Advised</em>' attribute.
	 * @see #setSourceAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_SourceAdvised()
	 * @model
	 * @generated
	 */
	boolean isSourceAdvised();

	/**
	 * Returns the value of the '<em><b>Unit Type Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type Advised</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit Type Advised</em>' attribute.
	 * @see #setUnitTypeAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_UnitTypeAdvised()
	 * @model
	 * @generated
	 */
	boolean isUnitTypeAdvised();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isDefaultPropertiesAdvised
	 * <em>Default Properties Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Properties Advised</em>' attribute.
	 * @see #isDefaultPropertiesAdvised()
	 * @generated
	 */
	void setDefaultPropertiesAdvised(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Input Advised</em>' attribute.
	 * @see #isInputAdvised()
	 * @generated
	 */
	void setInputAdvised(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output Advised</em>' attribute.
	 * @see #isOutputAdvised()
	 * @generated
	 */
	void setOutputAdvised(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isProvidesAdvised
	 * <em>Provides Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Provides Advised</em>' attribute.
	 * @see #isProvidesAdvised()
	 * @generated
	 */
	void setProvidesAdvised(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isSourceAdvised <em>Source Advised</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Advised</em>' attribute.
	 * @see #isSourceAdvised()
	 * @generated
	 */
	void setSourceAdvised(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isUnitTypeAdvised
	 * <em>Unit Type Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit Type Advised</em>' attribute.
	 * @see #isUnitTypeAdvised()
	 * @generated
	 */
	void setUnitTypeAdvised(boolean value);
} // BuilderWrapper
