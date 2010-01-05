/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.core.B3EngineException;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildContext()
 * @model
 * @generated
 */
public interface BuildContext extends BExecutionContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	void defineBuildUnit(BuildUnit unit) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a dynamic proxy for the build unit that implements BuildUnit, a special interface generated for the build unit instance, and all interfaces declared as being implemented by the build unit. If the build unit is not already defined, getting its proxy will define it.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	BuildUnit getBuildUnitProxy(BuildUnit unit) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an interface unique for the build unit. If the build unit is not already defined, this will also define the build unit.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	Class<? extends BuildUnit> getBuildUnitInterface(BuildUnit unit) throws B3EngineException;

} // BuildContext
