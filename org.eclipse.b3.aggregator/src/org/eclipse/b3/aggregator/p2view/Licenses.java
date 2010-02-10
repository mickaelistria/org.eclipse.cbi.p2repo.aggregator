/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.emf.common.util.EList;

import org.eclipse.equinox.p2.metadata.ILicense;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Licenses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.aggregator.p2view.Licenses#getLicenses <em>Licenses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getLicenses()
 * @model
 * @generated
 */
public interface Licenses {
	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.metadata.ILicense}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licenses</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' reference list.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getLicenses_Licenses()
	 * @model type="org.eclipse.b3.aggregator.p2.ILicense"
	 * @generated
	 */
	EList<ILicense> getLicenses();

} // Licenses
