/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.impl;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AvailableVersion;
import org.eclipse.b3.aggregator.VersionMatch;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.equinox.p2.metadata.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Available Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.aggregator.impl.AvailableVersionImpl#getVersionMatch <em>Version Match</em>}</li>
 *   <li>{@link org.eclipse.b3.aggregator.impl.AvailableVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.b3.aggregator.impl.AvailableVersionImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AvailableVersionImpl extends MinimalEObjectImpl.Container implements AvailableVersion {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int eFlags = 0;

	/**
	 * The default value of the '{@link #getVersionMatch() <em>Version Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMatch()
	 * @generated
	 * @ordered
	 */
	protected static final VersionMatch VERSION_MATCH_EDEFAULT = VersionMatch.BELOW;

	/**
	 * The offset of the flags representing the value of the '{@link #getVersionMatch() <em>Version Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_MATCH_EFLAG_OFFSET = 0;

	/**
	 * The flags representing the default value of the '{@link #getVersionMatch() <em>Version Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_MATCH_EFLAG_DEFAULT = VERSION_MATCH_EDEFAULT.ordinal() << VERSION_MATCH_EFLAG_OFFSET;

	/**
	 * The array of enumeration values for '{@link VersionMatch Version Match}'
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	private static final VersionMatch[] VERSION_MATCH_EFLAG_VALUES = VersionMatch.values();

	/**
	 * The flags representing the value of the '{@link #getVersionMatch() <em>Version Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionMatch()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_MATCH_EFLAG = 0x3 << VERSION_MATCH_EFLAG_OFFSET;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregatorPackage.AVAILABLE_VERSION__VERSION_MATCH:
				return getVersionMatch();
			case AggregatorPackage.AVAILABLE_VERSION__VERSION:
				return getVersion();
			case AggregatorPackage.AVAILABLE_VERSION__FILTER:
				return getFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AggregatorPackage.AVAILABLE_VERSION__VERSION_MATCH:
				return (eFlags & VERSION_MATCH_EFLAG) != VERSION_MATCH_EFLAG_DEFAULT;
			case AggregatorPackage.AVAILABLE_VERSION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case AggregatorPackage.AVAILABLE_VERSION__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AggregatorPackage.AVAILABLE_VERSION__VERSION_MATCH:
				setVersionMatch((VersionMatch)newValue);
				return;
			case AggregatorPackage.AVAILABLE_VERSION__VERSION:
				setVersion((Version)newValue);
				return;
			case AggregatorPackage.AVAILABLE_VERSION__FILTER:
				setFilter((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AggregatorPackage.AVAILABLE_VERSION__VERSION_MATCH:
				setVersionMatch(VERSION_MATCH_EDEFAULT);
				return;
			case AggregatorPackage.AVAILABLE_VERSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AggregatorPackage.AVAILABLE_VERSION__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionMatch getVersionMatch() {
		return VERSION_MATCH_EFLAG_VALUES[(eFlags & VERSION_MATCH_EFLAG) >>> VERSION_MATCH_EFLAG_OFFSET];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatorPackage.AVAILABLE_VERSION__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatorPackage.AVAILABLE_VERSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionMatch(VersionMatch newVersionMatch) {
		VersionMatch oldVersionMatch = VERSION_MATCH_EFLAG_VALUES[(eFlags & VERSION_MATCH_EFLAG) >>> VERSION_MATCH_EFLAG_OFFSET];
		if (newVersionMatch == null) newVersionMatch = VERSION_MATCH_EDEFAULT;
		eFlags = eFlags & ~VERSION_MATCH_EFLAG | newVersionMatch.ordinal() << VERSION_MATCH_EFLAG_OFFSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatorPackage.AVAILABLE_VERSION__VERSION_MATCH, oldVersionMatch, newVersionMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (versionMatch: ");
		result.append(VERSION_MATCH_EFLAG_VALUES[(eFlags & VERSION_MATCH_EFLAG) >>> VERSION_MATCH_EFLAG_OFFSET]);
		result.append(", version: ");
		result.append(version);
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregatorPackage.Literals.AVAILABLE_VERSION;
	}

} // AvailableVersionImpl
