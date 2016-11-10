/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.p2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.IRequirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installable Unit Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.InstallableUnitFragment#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.p2.P2Package#getInstallableUnitFragment()
 * @model superTypes="org.eclipse.b3.p2.InstallableUnit org.eclipse.b3.p2.IInstallableUnitFragment"
 * @generated
 */
public interface InstallableUnitFragment extends InstallableUnit, IInstallableUnitFragment {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.metadata.IRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Host</em>' containment reference list.
	 * @see org.eclipse.b3.p2.P2Package#getInstallableUnitFragment_Host()
	 * @model type="org.eclipse.b3.p2.IRequirement" containment="true" resolveProxies="true"
	 * @generated
	 */
	@Override
	EList<IRequirement> getHost();

} // InstallableUnitFragment
