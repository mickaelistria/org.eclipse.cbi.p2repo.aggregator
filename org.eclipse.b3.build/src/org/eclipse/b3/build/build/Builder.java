/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getPostcondExpr <em>Postcond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getPrecondExpr <em>Precond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getOutput <em>Output</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.Builder#getDefaultProperties <em>Default Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder()
 * @model
 * @generated
 */
public interface Builder extends B3Function {

	/**
	 * Returns the value of the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcond Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #setPostcondExpr(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_PostcondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPostcondExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Builder#getPostcondExpr <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #getPostcondExpr()
	 * @generated
	 */
	void setPostcondExpr(BExpression value);

	/**
	 * Returns the value of the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precond Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precond Expr</em>' containment reference.
	 * @see #setPrecondExpr(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_PrecondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPrecondExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Builder#getPrecondExpr <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precond Expr</em>' containment reference.
	 * @see #getPrecondExpr()
	 * @generated
	 */
	void setPrecondExpr(BExpression value);

	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_ProvidedCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getProvidedCapabilities();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(BuilderInput)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_Input()
	 * @model containment="true"
	 * @generated
	 */
	BuilderInput getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Builder#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BuilderInput value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(PathGroup)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_Output()
	 * @model containment="true"
	 * @generated
	 */
	PathGroup getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Builder#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(PathGroup value);

	/**
	 * Returns the value of the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Properties</em>' containment reference.
	 * @see #setDefaultProperties(BPropertySet)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilder_DefaultProperties()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getDefaultProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Builder#getDefaultProperties <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Properties</em>' containment reference.
	 * @see #getDefaultProperties()
	 * @generated
	 */
	void setDefaultProperties(BPropertySet value);
} // Builder
