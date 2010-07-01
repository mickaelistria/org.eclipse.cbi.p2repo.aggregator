/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Context</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getBuildContext()
 * @model
 * @generated
 */
public interface BuildContext extends BExecutionContext {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	void defineBuildUnit(BuildUnit unit, boolean isWeaving) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	BuildUnit getEffectiveBuildUnit(BuildUnit unit);

} // BuildContext
