/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.RequiredCapability;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl#getBuilderName <em>Builder Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderReferenceImpl extends BuildResultReferenceImpl implements BuilderReference {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected BParameterList parameters;

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
	 * The cached value of the '{@link #getRequiredCapability() <em>Required Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapability()
	 * @generated
	 * @ordered
	 */
	protected RequiredCapability requiredCapability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameterList getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(BParameterList newParameters, NotificationChain msgs) {
		BParameterList oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(BParameterList newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_REFERENCE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_REFERENCE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__PARAMETERS, newParameters, newParameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__BUILDER_NAME, oldBuilderName, builderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability getRequiredCapability() {
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredCapability(RequiredCapability newRequiredCapability, NotificationChain msgs) {
		RequiredCapability oldRequiredCapability = requiredCapability;
		requiredCapability = newRequiredCapability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY, oldRequiredCapability, newRequiredCapability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCapability(RequiredCapability newRequiredCapability) {
		if (newRequiredCapability != requiredCapability) {
			NotificationChain msgs = null;
			if (requiredCapability != null)
				msgs = ((InternalEObject)requiredCapability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY, null, msgs);
			if (newRequiredCapability != null)
				msgs = ((InternalEObject)newRequiredCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY, null, msgs);
			msgs = basicSetRequiredCapability(newRequiredCapability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY, newRequiredCapability, newRequiredCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_REFERENCE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY:
				return basicSetRequiredCapability(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_REFERENCE__PARAMETERS:
				return getParameters();
			case B3BuildPackage.BUILDER_REFERENCE__BUILDER_NAME:
				return getBuilderName();
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY:
				return getRequiredCapability();
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
			case B3BuildPackage.BUILDER_REFERENCE__PARAMETERS:
				setParameters((BParameterList)newValue);
				return;
			case B3BuildPackage.BUILDER_REFERENCE__BUILDER_NAME:
				setBuilderName((String)newValue);
				return;
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY:
				setRequiredCapability((RequiredCapability)newValue);
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
			case B3BuildPackage.BUILDER_REFERENCE__PARAMETERS:
				setParameters((BParameterList)null);
				return;
			case B3BuildPackage.BUILDER_REFERENCE__BUILDER_NAME:
				setBuilderName(BUILDER_NAME_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY:
				setRequiredCapability((RequiredCapability)null);
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
			case B3BuildPackage.BUILDER_REFERENCE__PARAMETERS:
				return parameters != null;
			case B3BuildPackage.BUILDER_REFERENCE__BUILDER_NAME:
				return BUILDER_NAME_EDEFAULT == null ? builderName != null : !BUILDER_NAME_EDEFAULT.equals(builderName);
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY:
				return requiredCapability != null;
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
		result.append(" (builderName: ");
		result.append(builderName);
		result.append(')');
		return result.toString();
	}

} //BuilderReferenceImpl
