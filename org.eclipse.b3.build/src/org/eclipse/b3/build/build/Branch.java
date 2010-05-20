/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.Branch#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getUpdateStrategy <em>Update Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getBranchPointType <em>Branch Point Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getInclude <em>Include</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getExclude <em>Exclude</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Branch#getBranchPoint <em>Branch Point</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Branch Point</em>' containment reference.
	 * @see #setBranchPoint(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_BranchPoint()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getBranchPoint();

	/**
	 * Returns the value of the '<em><b>Branch Point Type</b></em>' attribute.
	 * The default value is <code>"Latest"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.build.BranchPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Point Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Branch Point Type</em>' attribute.
	 * @see org.eclipse.b3.build.build.BranchPointType
	 * @see #setBranchPointType(BranchPointType)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_BranchPointType()
	 * @model default="Latest" required="true"
	 * @generated
	 */
	BranchPointType getBranchPointType();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_Documentation()
	 * @model default=""
	 * @generated
	 */
	String getDocumentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the update strategy (explicit, or derived from combination BranchPointDefault, and BranchPointType).
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	UpdateStrategy getEffectiveUpdateStrategy();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<BNamePredicate> getExclude();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<BNamePredicate> getInclude();

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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Update Strategy</b></em>' attribute.
	 * The default value is <code>"BranchPointDefault"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.build.UpdateStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Strategy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Update Strategy</em>' attribute.
	 * @see org.eclipse.b3.build.build.UpdateStrategy
	 * @see #setUpdateStrategy(UpdateStrategy)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBranch_UpdateStrategy()
	 * @model default="BranchPointDefault" required="true"
	 * @generated
	 */
	UpdateStrategy getUpdateStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Branch#getBranchPoint <em>Branch Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Branch Point</em>' containment reference.
	 * @see #getBranchPoint()
	 * @generated
	 */
	void setBranchPoint(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Branch#getBranchPointType <em>Branch Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Branch Point Type</em>' attribute.
	 * @see org.eclipse.b3.build.build.BranchPointType
	 * @see #getBranchPointType()
	 * @generated
	 */
	void setBranchPointType(BranchPointType value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Branch#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Branch#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Branch#getUpdateStrategy <em>Update Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Update Strategy</em>' attribute.
	 * @see org.eclipse.b3.build.build.UpdateStrategy
	 * @see #getUpdateStrategy()
	 * @generated
	 */
	void setUpdateStrategy(UpdateStrategy value);

} // Branch
