/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.Synchronization#getBuilderQueries <em>Builder Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends EObject {
	/**
	 * Returns the value of the '<em><b>Builder Queries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.BuilderQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Queries</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Queries</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getSynchronization_BuilderQueries()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuilderQuery> getBuilderQueries();

} // Synchronization
