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
 *   <li>{@link org.eclipse.b3.build.build.BuilderWrapper#getPromoted <em>Promoted</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper()
 * @model
 * @generated
 */
public interface BuilderWrapper extends BFunctionWrapper, IBuilder {

	/**
	 * Returns the value of the '<em><b>Promoted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promoted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promoted</em>' attribute.
	 * @see #setPromoted(Class)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_Promoted()
	 * @model
	 * @generated
	 */
	Class<? extends BuildUnit> getPromoted();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#getPromoted <em>Promoted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promoted</em>' attribute.
	 * @see #getPromoted()
	 * @generated
	 */
	void setPromoted(Class<? extends BuildUnit> value);

	/**
	 * Returns the value of the '<em><b>Input Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Advised</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Advised</em>' attribute.
	 * @see #setInputAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_InputAdvised()
	 * @model
	 * @generated
	 */
	boolean isInputAdvised();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Advised</em>' attribute.
	 * @see #isInputAdvised()
	 * @generated
	 */
	void setInputAdvised(boolean value);

	/**
	 * Returns the value of the '<em><b>Output Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Advised</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Advised</em>' attribute.
	 * @see #setOutputAdvised(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderWrapper_OutputAdvised()
	 * @model
	 * @generated
	 */
	boolean isOutputAdvised();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Advised</em>' attribute.
	 * @see #isOutputAdvised()
	 * @generated
	 */
	void setOutputAdvised(boolean value);
} // BuilderWrapper
