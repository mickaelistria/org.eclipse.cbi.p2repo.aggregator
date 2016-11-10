/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 */
package org.eclipse.b3.p2;

import org.eclipse.equinox.p2.metadata.IInstallableUnitPatch;
import org.eclipse.equinox.p2.metadata.IRequirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Unit Patch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.b3.p2.P2Package#getInstallableUnitPatch()
 * @model superTypes="org.eclipse.b3.p2.InstallableUnit org.eclipse.b3.p2.IInstallableUnitPatch"
 * @generated
 */
public interface InstallableUnitPatch extends InstallableUnit, IInstallableUnitPatch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" dataType="org.eclipse.b3.p2.IRequirementArrayArray"
	 * @generated
	 */
	@Override
	IRequirement[][] getApplicabilityScope();

} // InstallableUnitPatch
