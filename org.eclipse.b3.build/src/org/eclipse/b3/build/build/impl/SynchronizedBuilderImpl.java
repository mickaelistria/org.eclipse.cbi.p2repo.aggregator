/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.SynchronizedBuilder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronized Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl#getBuilderName <em>Builder Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizedBuilderImpl extends EObjectImpl implements SynchronizedBuilder {
	/**
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuilderName() <em>Builder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilderName() <em>Builder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderName()
	 * @generated
	 * @ordered
	 */
	protected String builderName = BUILDER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizedBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.SYNCHRONIZED_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.SYNCHRONIZED_BUILDER__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.SYNCHRONIZED_BUILDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuilderName() {
		return builderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilderName(String newBuilderName) {
		String oldBuilderName = builderName;
		builderName = newBuilderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.SYNCHRONIZED_BUILDER__BUILDER_NAME, oldBuilderName, builderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME_SPACE:
				return getNameSpace();
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME:
				return getName();
			case B3BuildPackage.SYNCHRONIZED_BUILDER__BUILDER_NAME:
				return getBuilderName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME:
				setName((String)newValue);
				return;
			case B3BuildPackage.SYNCHRONIZED_BUILDER__BUILDER_NAME:
				setBuilderName((String)newValue);
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
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
				return;
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.SYNCHRONIZED_BUILDER__BUILDER_NAME:
				setBuilderName(BUILDER_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
			case B3BuildPackage.SYNCHRONIZED_BUILDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.SYNCHRONIZED_BUILDER__BUILDER_NAME:
				return BUILDER_NAME_EDEFAULT == null ? builderName != null : !BUILDER_NAME_EDEFAULT.equals(builderName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (nameSpace: ");
		result.append(nameSpace);
		result.append(", name: ");
		result.append(name);
		result.append(", builderName: ");
		result.append(builderName);
		result.append(')');
		return result.toString();
	}

} //SynchronizedBuilderImpl
