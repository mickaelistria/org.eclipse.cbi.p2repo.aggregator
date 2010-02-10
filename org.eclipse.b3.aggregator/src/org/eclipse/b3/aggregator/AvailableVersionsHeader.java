/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Versions Header</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.AvailableVersionsHeader#getAvailableVersions <em>Available Versions</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.AvailableVersionsHeader#getInstallableUnitRequest <em>Installable Unit Request
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAvailableVersionsHeader()
 * @model
 * @generated
 */
public interface AvailableVersionsHeader {
	/**
	 * Returns the value of the '<em><b>Available Versions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.AvailableVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Versions</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Versions</em>' reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAvailableVersionsHeader_AvailableVersions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<AvailableVersion> getAvailableVersions();

	/**
	 * Returns the value of the '<em><b>Installable Unit Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '
	 * {@link org.eclipse.b3.aggregator.InstallableUnitRequest#getAvailableVersionsHeader
	 * <em>Available Versions Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installable Unit Request</em>' container reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Installable Unit Request</em>' container reference.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAvailableVersionsHeader_InstallableUnitRequest()
	 * @see org.eclipse.b3.aggregator.InstallableUnitRequest#getAvailableVersionsHeader
	 * @model opposite="availableVersionsHeader" resolveProxies="false" required="true" changeable="false"
	 * @generated
	 */
	InstallableUnitRequest getInstallableUnitRequest();

} // AvailableVersionsHeader
