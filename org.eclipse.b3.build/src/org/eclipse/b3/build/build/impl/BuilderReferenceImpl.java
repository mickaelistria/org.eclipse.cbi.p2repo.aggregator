/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;

import org.eclipse.b3.build.build.AliasedRequiredCapability;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.build.RequiredCapability;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;

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
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl#getRequiredCapabilityReference <em>Required Capability Reference</em>}</li>
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
	 * The cached value of the '{@link #getRequiredCapabilityReference() <em>Required Capability Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilityReference()
	 * @generated
	 * @ordered
	 */
	protected AliasedRequiredCapability requiredCapabilityReference;

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
	public AliasedRequiredCapability getRequiredCapabilityReference() {
		if (requiredCapabilityReference != null && requiredCapabilityReference.eIsProxy()) {
			InternalEObject oldRequiredCapabilityReference = (InternalEObject)requiredCapabilityReference;
			requiredCapabilityReference = (AliasedRequiredCapability)eResolveProxy(oldRequiredCapabilityReference);
			if (requiredCapabilityReference != oldRequiredCapabilityReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE, oldRequiredCapabilityReference, requiredCapabilityReference));
			}
		}
		return requiredCapabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasedRequiredCapability basicGetRequiredCapabilityReference() {
		return requiredCapabilityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCapabilityReference(AliasedRequiredCapability newRequiredCapabilityReference) {
		AliasedRequiredCapability oldRequiredCapabilityReference = requiredCapabilityReference;
		requiredCapabilityReference = newRequiredCapabilityReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE, oldRequiredCapabilityReference, requiredCapabilityReference));
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
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE:
				if (resolve) return getRequiredCapabilityReference();
				return basicGetRequiredCapabilityReference();
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
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE:
				setRequiredCapabilityReference((AliasedRequiredCapability)newValue);
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
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE:
				setRequiredCapabilityReference((AliasedRequiredCapability)null);
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
			case B3BuildPackage.BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE:
				return requiredCapabilityReference != null;
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
	
	/**
	 * Adds a contained required capability to the set of effective capabilities. If however the requirement
	 * is a reference via an alias, the requirement is used as stated at the unit level and is then not included
	 * here. This means that aliased requirements are NOT subject to advice interpretation.
	 * 
	 * <h4>NOTE</h4>
	 * <ul><li>References to the "self" unit are not included as requirements.</li>
	 * <li>Parameters passed to builders have no effect on resolution, they can not be used in conditional expression
	 * to filter the set of requirements (so they are ignored in this selection).</li>
	 * </ul>
	 * 
	 * TODO: optimize for the empty list case
	 */
	@Override
	public Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		EffectiveRequirementFacade facade = B3BuildFactory.eINSTANCE.createEffectiveRequirementFacade();
		Iterator<EffectiveRequirementFacade> result = new SingletonIterator<EffectiveRequirementFacade>(facade);
		facade.setContext(ctx);
		facade.setRequirement(getRequiredCapability());
		return result;
	}
	@Override
	public EList<RequiredCapability> getRequirements() throws Throwable {
		List<RequiredCapability> result = new ArrayList<RequiredCapability>();
		RequiredCapability r = getRequiredCapability();
		if(r != null)
			result.add(r);
		
		// TODO: ISSUE - IS IT OK TO REUSE THE UNFILTERED FEATURE WHEN THERE IS NO DERIVED FEATURE ?
		return new EcoreEList.UnmodifiableEList<RequiredCapability>(this, B3BuildPackage.Literals.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES, result.size(), result.toArray());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BuilderReference> getBuilderReferences() throws Throwable {
		List<BuilderReference> result = new ArrayList<BuilderReference>();
		result.add(this);
		// TODO: ISSUE - IS IT OK TO REUSE THE UNFILTERED FEATURE WHEN THERE IS NO DERIVED FEATURE ?
		return new EcoreEList.UnmodifiableEList<BuilderReference>(this, B3BuildPackage.Literals.PREREQUISITE__BUILD_RESULT, result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * The same as {@link #getBuilderReferences()} (as there are no filters at this level).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BuilderReference> getEffectiveBuilderReferences(BuildContext ctx) throws Throwable {
		return getBuilderReferences();
	}
} //BuilderReferenceImpl
