/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.cbi.p2repo.aggregator;

import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getVersionMatch <em>Version Match</em>}</li>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getAvailableFrom <em>Available From</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getAvailableVersion()
 * @model superTypes="org.eclipse.cbi.p2repo.p2.Comparable&lt;org.eclipse.cbi.p2repo.aggregator.AvailableVersion&gt;"
 * @generated
 */
public interface AvailableVersion extends Comparable<AvailableVersion> {
	/**
	 * Returns the value of the '<em><b>Available From</b></em>' attribute.
	 * The default value is <code>"repository"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cbi.p2repo.aggregator.AvailableFrom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available From</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available From</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.AvailableFrom
	 * @see #setAvailableFrom(AvailableFrom)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getAvailableVersion_AvailableFrom()
	 * @model default="repository" required="true"
	 * @generated
	 */
	AvailableFrom getAvailableFrom();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(IMatchExpression)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getAvailableVersion_Filter()
	 * @model dataType="org.eclipse.cbi.p2repo.p2.IMatchExpression&lt;org.eclipse.cbi.p2repo.p2.IInstallableUnit&gt;"
	 * @generated
	 */
	IMatchExpression<IInstallableUnit> getFilter();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getAvailableVersion_Version()
	 * @model dataType="org.eclipse.cbi.p2repo.p2.Version"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Returns the value of the '<em><b>Version Match</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cbi.p2repo.aggregator.VersionMatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Match</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Match</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.VersionMatch
	 * @see #setVersionMatch(VersionMatch)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getAvailableVersion_VersionMatch()
	 * @model required="true"
	 * @generated
	 */
	VersionMatch getVersionMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getAvailableFrom <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available From</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.AvailableFrom
	 * @see #getAvailableFrom()
	 * @generated
	 */
	void setAvailableFrom(AvailableFrom value);

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(IMatchExpression<IInstallableUnit> value);

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.AvailableVersion#getVersionMatch <em>Version Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Match</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.VersionMatch
	 * @see #getVersionMatch()
	 * @generated
	 */
	void setVersionMatch(VersionMatch value);

} // AvailableVersion
