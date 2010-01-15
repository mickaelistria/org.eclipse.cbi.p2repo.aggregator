/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuilderInput#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderInput()
 * @model
 * @generated
 */
public interface BuilderInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderInput_Prerequisites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisites();

} // BuilderInput
