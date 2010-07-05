/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderQuery#getBuilderQueries <em>Builder Queries</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuilderQuery#getUnitQuery <em>Unit Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderQuery()
 * @model
 * @generated
 */
public interface BuilderQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Builder Queries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Queries</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Queries</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderQuery_BuilderQueries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BExpression> getBuilderQueries();

	/**
	 * Returns the value of the '<em><b>Unit Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Query</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Query</em>' containment reference.
	 * @see #setUnitQuery(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderQuery_UnitQuery()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getUnitQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderQuery#getUnitQuery <em>Unit Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Query</em>' containment reference.
	 * @see #getUnitQuery()
	 * @generated
	 */
	void setUnitQuery(BExpression value);

} // BuilderQuery
