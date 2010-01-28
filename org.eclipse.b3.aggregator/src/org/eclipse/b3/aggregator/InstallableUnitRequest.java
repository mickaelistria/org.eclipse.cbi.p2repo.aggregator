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

import org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.internal.provisional.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Installable Unit Reference</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.InstallableUnitRequest#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.InstallableUnitRequest#getVersionRange <em>Version Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getInstallableUnitRequest()
 * @model abstract="true"
 * @generated
 */
public interface InstallableUnitRequest extends StatusProvider, InfosProvider, DescriptionProvider {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getInstallableUnitRequest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Version Range</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Range</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version Range</em>' attribute.
	 * @see #setVersionRange(VersionRange)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getInstallableUnitRequest_VersionRange()
	 * @model default="0.0.0" dataType="org.eclipse.b3.aggregator.p2.VersionRange"
	 * @generated
	 */
	VersionRange getVersionRange();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated NOT
	 */
	boolean isBranchDisabledOrMappedRepositoryBroken();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	boolean isBranchEnabled();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMappedRepositoryBroken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model type="org.eclipse.b3.aggregator.p2.IInstallableUnit"
	 * @generated
	 */
	IInstallableUnit resolveAsSingleton();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.InstallableUnitRequest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.InstallableUnitRequest#getVersionRange
	 * <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version Range</em>' attribute.
	 * @see #getVersionRange()
	 * @generated
	 */
	void setVersionRange(VersionRange value);

} // InstallableUnitReference
