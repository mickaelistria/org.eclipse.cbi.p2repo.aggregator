/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Generic Type Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3GenericTypeVariable#getBoundsList <em>Bounds List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3GenericTypeVariable()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.TypeVariable<org.eclipse.b3.backend.evaluator.b3backend.B3GenericDeclaration>"
 * @generated
 */
public interface B3GenericTypeVariable extends EObject, TypeVariable<B3GenericDeclaration> {
	/**
	 * Returns the value of the '<em><b>Bounds List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds List</em>' containment reference.
	 * @see #setBoundsList(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3GenericTypeVariable_BoundsList()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.Type" containment="true"
	 * @generated
	 */
	Type getBoundsList();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3GenericTypeVariable#getBoundsList <em>Bounds List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds List</em>' containment reference.
	 * @see #getBoundsList()
	 * @generated
	 */
	void setBoundsList(Type value);

} // B3GenericTypeVariable
