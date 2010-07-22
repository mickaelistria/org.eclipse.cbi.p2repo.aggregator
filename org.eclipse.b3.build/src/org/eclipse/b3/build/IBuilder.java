/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBuilder</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.IBuilder#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getDefaultProperties <em>Default Properties</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getUnitType <em>Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getExplicitUnitType <em>Explicit Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.IBuilder#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBuilder extends IProvidedCapabilityContainer, IFunction {
	/**
	 * Returns the value of the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Properties</em>' containment reference.
	 * @see #setDefaultProperties(BPropertySet)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_DefaultProperties()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getDefaultProperties();

	/**
	 * Returns the value of the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Unit Type</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Explicit Unit Type</em>' containment reference.
	 * @see #setExplicitUnitType(BParameterDeclaration)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_ExplicitUnitType()
	 * @model containment="true"
	 * @generated
	 */
	BParameterDeclaration getExplicitUnitType();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(BuilderInput)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_Input()
	 * @model containment="true"
	 * @generated
	 */
	BuilderInput getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(PathGroup)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_Output()
	 * @model containment="true"
	 * @generated
	 */
	PathGroup getOutput();

	/**
	 * Returns the value of the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #setPostcondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_PostcondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPostcondExpr();

	/**
	 * Returns the value of the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postinputcond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Postinputcond Expr</em>' containment reference.
	 * @see #setPostinputcondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_PostinputcondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPostinputcondExpr();

	/**
	 * Returns the value of the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Precond Expr</em>' containment reference.
	 * @see #setPrecondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_PrecondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPrecondExpr();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(PathGroup)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_Source()
	 * @model containment="true"
	 * @generated
	 */
	PathGroup getSource();

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see #setUnitType(Class)
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuilder_UnitType()
	 * @model
	 * @generated
	 */
	Class<? extends BuildUnit> getUnitType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getDefaultProperties <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Properties</em>' containment reference.
	 * @see #getDefaultProperties()
	 * @generated
	 */
	void setDefaultProperties(BPropertySet value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getExplicitUnitType <em>Explicit Unit Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Explicit Unit Type</em>' containment reference.
	 * @see #getExplicitUnitType()
	 * @generated
	 */
	void setExplicitUnitType(BParameterDeclaration value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BuilderInput value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(PathGroup value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getPostcondExpr <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #getPostcondExpr()
	 * @generated
	 */
	void setPostcondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getPostinputcondExpr <em>Postinputcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Postinputcond Expr</em>' containment reference.
	 * @see #getPostinputcondExpr()
	 * @generated
	 */
	void setPostinputcondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getPrecondExpr <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Precond Expr</em>' containment reference.
	 * @see #getPrecondExpr()
	 * @generated
	 */
	void setPrecondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PathGroup value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.IBuilder#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit Type</em>' attribute.
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(Class<? extends BuildUnit> value);

} // IBuilder
