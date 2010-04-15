/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.p2.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.b3.p2.InstallableUnitFragment;
import org.eclipse.b3.p2.P2Package;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.equinox.p2.metadata.IRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installable Unit Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class InstallableUnitFragmentImpl extends InstallableUnitImpl implements InstallableUnitFragment {

	private Collection<IRequirement> hostList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstallableUnitFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Collection<IRequirement> getHost() {
		if(hostList == null)
			hostList = new ArrayList<IRequirement>();

		return hostList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2Package.Literals.INSTALLABLE_UNIT_FRAGMENT;
	}

} // InstallableUnitFragmentImpl
