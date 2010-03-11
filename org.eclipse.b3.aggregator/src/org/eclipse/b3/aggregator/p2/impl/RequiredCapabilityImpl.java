/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2.impl;

import org.eclipse.b3.aggregator.p2.P2Package;
import org.eclipse.b3.aggregator.p2.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Required Capability</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl#getNamespace <em>Namespace</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RequiredCapabilityImpl extends RequirementImpl implements RequiredCapability {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final VersionRange RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected VersionRange range = RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequiredCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == IRequiredCapability.class) {
			switch(derivedFeatureID) {
			case P2Package.REQUIRED_CAPABILITY__NAME:
				return P2Package.IREQUIRED_CAPABILITY__NAME;
			case P2Package.REQUIRED_CAPABILITY__NAMESPACE:
				return P2Package.IREQUIRED_CAPABILITY__NAMESPACE;
			case P2Package.REQUIRED_CAPABILITY__RANGE:
				return P2Package.IREQUIRED_CAPABILITY__RANGE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if(baseClass == IRequiredCapability.class) {
			switch(baseFeatureID) {
			case P2Package.IREQUIRED_CAPABILITY__NAME:
				return P2Package.REQUIRED_CAPABILITY__NAME;
			case P2Package.IREQUIRED_CAPABILITY__NAMESPACE:
				return P2Package.REQUIRED_CAPABILITY__NAMESPACE;
			case P2Package.IREQUIRED_CAPABILITY__RANGE:
				return P2Package.REQUIRED_CAPABILITY__RANGE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case P2Package.REQUIRED_CAPABILITY__NAME:
			return getName();
		case P2Package.REQUIRED_CAPABILITY__NAMESPACE:
			return getNamespace();
		case P2Package.REQUIRED_CAPABILITY__RANGE:
			return getRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case P2Package.REQUIRED_CAPABILITY__NAME:
			return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
		case P2Package.REQUIRED_CAPABILITY__NAMESPACE:
			return NAMESPACE_EDEFAULT == null
					? namespace != null
					: !NAMESPACE_EDEFAULT.equals(namespace);
		case P2Package.REQUIRED_CAPABILITY__RANGE:
			return RANGE_EDEFAULT == null
					? range != null
					: !RANGE_EDEFAULT.equals(range);
		}
		return super.eIsSet(featureID);
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof IRequiredCapability))
			return false;
		final IRequiredCapability other = (IRequiredCapability) obj;
		if(filter == null) {
			if(other.getFilter() != null)
				return false;
		}
		else if(!filter.equals(other.getFilter()))
			return false;
		if(getMin() != other.getMin())
			return false;
		if(getMax() != other.getMax())
			return false;
		if(!name.equals(other.getName()))
			return false;
		if(!namespace.equals(other.getNamespace()))
			return false;
		if(!range.equals(other.getRange()))
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case P2Package.REQUIRED_CAPABILITY__NAME:
			setName((String) newValue);
			return;
		case P2Package.REQUIRED_CAPABILITY__NAMESPACE:
			setNamespace((String) newValue);
			return;
		case P2Package.REQUIRED_CAPABILITY__RANGE:
			setRange((VersionRange) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case P2Package.REQUIRED_CAPABILITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case P2Package.REQUIRED_CAPABILITY__NAMESPACE:
			setNamespace(NAMESPACE_EDEFAULT);
			return;
		case P2Package.REQUIRED_CAPABILITY__RANGE:
			setRange(RANGE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionRange getRange() {
		return range;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filter == null)
				? 0
				: filter.hashCode());
		result = prime * result + Integer.valueOf(getMin()).hashCode();
		result = prime * result + Integer.valueOf(getMax()).hashCode();
		result = prime * result + name.hashCode();
		result = prime * result + namespace.hashCode();
		result = prime * result + range.hashCode();
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public boolean satisfiedBy(IProvidedCapability cap) {
		String name = getName();
		if(name == null || !name.equals(cap.getName()))
			return false;
		String nameSpace = getNamespace();
		if(nameSpace == null || !nameSpace.equals(cap.getNamespace()))
			return false;
		return getRange().isIncluded(cap.getVersion());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.REQUIRED_CAPABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.REQUIRED_CAPABILITY__NAMESPACE,
					oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRange(VersionRange newRange) {
		VersionRange oldRange = range;
		range = newRange;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2Package.REQUIRED_CAPABILITY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer();
		if("osgi.bundle".equals(getNamespace())) //$NON-NLS-1$
			result.append("bundle"); //$NON-NLS-1$
		else if("java.package".equals(getNamespace())) //$NON-NLS-1$
			result.append("package"); //$NON-NLS-1$
		else if(!IInstallableUnit.NAMESPACE_IU_ID.equals(getNamespace()))
			result.append(getNamespace());
		if(result.length() > 0)
			result.append(' ');
		result.append(getName());
		result.append(' ');
		// for an exact version match, print a simpler expression
		if(range.getMinimum().equals(range.getMaximum())) {
			result.append('[');
			range.getMinimum().toString(result);
			result.append(']');
		}
		else
			range.toString(result);
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2Package.Literals.REQUIRED_CAPABILITY;
	}

} // RequiredCapabilityImpl
