/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import java.util.Iterator;
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
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.build.build.EffectiveRequirementFacade>" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable;

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
	 * Returns an iterator over the effective references to builders in this, and other units.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade>" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Iterator<EffectiveBuilderReferenceFacade> getEffectiveBuilderReferences(BExecutionContext ctx) throws Throwable;
} // BuildResultReference
