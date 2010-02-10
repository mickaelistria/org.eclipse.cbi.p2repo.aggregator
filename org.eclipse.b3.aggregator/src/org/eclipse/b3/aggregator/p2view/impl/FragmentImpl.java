/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view.impl;

import org.eclipse.b3.aggregator.InstallableUnitType;
import org.eclipse.b3.aggregator.p2view.Fragment;
import org.eclipse.b3.aggregator.p2view.P2viewPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fragment</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FragmentImpl extends BundleImpl implements Fragment {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected FragmentImpl(IInstallableUnit iu) {
		super(iu);
	}

	@Override
	public InstallableUnitType getType() {
		return InstallableUnitType.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2viewPackage.Literals.FRAGMENT;
	}

} // FragmentImpl
