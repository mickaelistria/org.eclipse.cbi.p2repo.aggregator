/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Result Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildResultReference()
 * @model abstract="true"
 * @generated
 */
public interface BuildResultReference extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<RequiredCapability> getEffectiveRequirements(BExecutionContext ctx) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the unfiltered requirements as a flattened list.
	 * <!-- end-model-doc -->
	 * @model kind="operation" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<RequiredCapability> getRequirements() throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the unfiltered requirements as a flattened list.
	 * <!-- end-model-doc -->
	 * @model kind="operation" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<BuilderReference> getBuilderReferences() throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the unfiltered requirements as a flattened list.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<BuilderReference> getEffectiveBuilderReferences(BExecutionContext ctx) throws Throwable;
} // BuildResultReference
