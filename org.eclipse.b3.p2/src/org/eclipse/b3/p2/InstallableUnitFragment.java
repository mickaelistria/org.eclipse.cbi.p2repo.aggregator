/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.p2;

import java.util.Collection;

import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.IRequirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Unit Fragment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.p2.P2Package#getInstallableUnitFragment()
 * @model superTypes="org.eclipse.b3.p2.InstallableUnit org.eclipse.b3.p2.IInstallableUnitFragment"
 * @generated
 */
public interface InstallableUnitFragment extends InstallableUnit, IInstallableUnitFragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" dataType="org.eclipse.b3.p2.Collection<org.eclipse.b3.p2.IRequirement>"
	 * @generated
	 */
	Collection<IRequirement> getHost();

} // InstallableUnitFragment
