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
package org.eclipse.b3.build;

import java.util.Map;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link org.eclipse.b3.build.Branch#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getBranchPointType <em>Branch Point Type</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getInclude <em>Include</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getBranchPoint <em>Branch Point</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getMergeStrategy <em>Merge Strategy</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getCheckout <em>Checkout</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getAcceptDirty <em>Accept Dirty</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getUpdate <em>Update</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Branch#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Accept Dirty</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.TriState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Dirty</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Dirty</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #setAcceptDirty(TriState)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_AcceptDirty()
	 * @model default="Default"
	 * @generated
	 */
	TriState getAcceptDirty();

	/**
	 * Returns the value of the '<em><b>Branch Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Point</em>' containment reference.
	 * @see #setBranchPoint(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_BranchPoint()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getBranchPoint();

	/**
	 * Returns the value of the '<em><b>Branch Point Type</b></em>' attribute.
	 * The default value is <code>"Latest"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.BranchPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Point Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Point Type</em>' attribute.
	 * @see org.eclipse.b3.build.BranchPointType
	 * @see #setBranchPointType(BranchPointType)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_BranchPointType()
	 * @model default="Latest" required="true"
	 * @generated
	 */
	BranchPointType getBranchPointType();

	/**
	 * Returns the value of the '<em><b>Checkout</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.TriState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkout</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkout</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #setCheckout(TriState)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Checkout()
	 * @model default="Default"
	 * @generated
	 */
	TriState getCheckout();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Documentation()
	 * @model default=""
	 * @generated
	 */
	String getDocumentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getEffectiveAcceptDirty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getEffectiveCheckout();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the update strategy (explicit, or derived from combination BranchPointDefault, and BranchPointType).
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	MergeConflictStrategy getEffectiveMergeStrategy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getEffectiveReplace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getEffectiveUpdate();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Exclude()
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
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<BNamePredicate> getInclude();

	/**
	 * Returns the value of the '<em><b>Merge Strategy</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.MergeConflictStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Strategy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Strategy</em>' attribute.
	 * @see org.eclipse.b3.build.MergeConflictStrategy
	 * @see #setMergeStrategy(MergeConflictStrategy)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_MergeStrategy()
	 * @model default="Default" required="true"
	 * @generated
	 */
	MergeConflictStrategy getMergeStrategy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.TriState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #setReplace(TriState)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Replace()
	 * @model default="Default"
	 * @generated
	 */
	TriState getReplace();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.b3.build.TriState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #setUpdate(TriState)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBranch_Update()
	 * @model default="Default"
	 * @generated
	 */
	TriState getUpdate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasValidState(DiagnosticChain chain, Map<Object, Object> map);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getAcceptDirty <em>Accept Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Dirty</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #getAcceptDirty()
	 * @generated
	 */
	void setAcceptDirty(TriState value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getBranchPoint <em>Branch Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Point</em>' containment reference.
	 * @see #getBranchPoint()
	 * @generated
	 */
	void setBranchPoint(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getBranchPointType <em>Branch Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Point Type</em>' attribute.
	 * @see org.eclipse.b3.build.BranchPointType
	 * @see #getBranchPointType()
	 * @generated
	 */
	void setBranchPointType(BranchPointType value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getCheckout <em>Checkout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkout</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #getCheckout()
	 * @generated
	 */
	void setCheckout(TriState value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getMergeStrategy <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Strategy</em>' attribute.
	 * @see org.eclipse.b3.build.MergeConflictStrategy
	 * @see #getMergeStrategy()
	 * @generated
	 */
	void setMergeStrategy(MergeConflictStrategy value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getReplace <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #getReplace()
	 * @generated
	 */
	void setReplace(TriState value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Branch#getUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see org.eclipse.b3.build.TriState
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(TriState value);

} // Branch
