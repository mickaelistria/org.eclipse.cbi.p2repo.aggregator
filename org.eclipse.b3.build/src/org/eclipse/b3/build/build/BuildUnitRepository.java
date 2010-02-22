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

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnitRepository()
 * @model abstract="true"
 * @generated
 */
public interface BuildUnitRepository extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolves an EffectiveRequireent (i.e. a combination of requirement and context) and returns a BuilUnit that matches the requirement, or null if no such unit can be found.
	 * This method is the same as calling resolve(effective.getContext(), effective.getRequirement().
	 * 
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	BuildUnit resolve(EffectiveRequirementFacade effectiveRequirement) throws Throwable;

} // BuildUnitRepository
