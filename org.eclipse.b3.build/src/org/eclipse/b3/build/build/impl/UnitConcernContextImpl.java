/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.build.ProvidesPredicate;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.RequiresPredicate;
import org.eclipse.b3.build.build.UnitConcernContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getBuilderContexts <em>Builder Contexts</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getRequiresRemovals <em>Requires Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl#getProvidesRemovals <em>Provides Removals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitConcernContextImpl extends BuildConcernContextImpl implements UnitConcernContext {
	/**
	 * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> requiredCapabilities;

	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> providedCapabilities;

	/**
	 * The cached value of the '{@link #getBuilderContexts() <em>Builder Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BuilderConcernContext> builderContexts;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression query;

	/**
	 * The cached value of the '{@link #getRequiresRemovals() <em>Requires Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiresPredicate> requiresRemovals;

	/**
	 * The cached value of the '{@link #getProvidesRemovals() <em>Provides Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPredicate> providesRemovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.UNIT_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredCapability> getRequiredCapabilities() {
		if (requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentEList<RequiredCapability>(RequiredCapability.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getProvidedCapabilities() {
		if (providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(Capability.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuilderConcernContext> getBuilderContexts() {
		if (builderContexts == null) {
			builderContexts = new EObjectContainmentEList<BuilderConcernContext>(BuilderConcernContext.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS);
		}
		return builderContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(BExpression newQuery, NotificationChain msgs) {
		BExpression oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(BExpression newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiresPredicate> getRequiresRemovals() {
		if (requiresRemovals == null) {
			requiresRemovals = new EObjectContainmentEList<RequiresPredicate>(RequiresPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS);
		}
		return requiresRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidesPredicate> getProvidesRemovals() {
		if (providesRemovals == null) {
			providesRemovals = new EObjectContainmentEList<ProvidesPredicate>(ProvidesPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		}
		return providesRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>)getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>)getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return ((InternalEList<?>)getBuilderContexts()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return basicSetQuery(null, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return ((InternalEList<?>)getRequiresRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return ((InternalEList<?>)getProvidesRemovals()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return getBuilderContexts();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return getQuery();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return getRequiresRemovals();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return getProvidesRemovals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends RequiredCapability>)newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				getBuilderContexts().clear();
				getBuilderContexts().addAll((Collection<? extends BuilderConcernContext>)newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression)newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				getRequiresRemovals().clear();
				getRequiresRemovals().addAll((Collection<? extends RequiresPredicate>)newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
				getProvidesRemovals().addAll((Collection<? extends ProvidesPredicate>)newValue);
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
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				getBuilderContexts().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression)null);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				getRequiresRemovals().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
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
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return builderContexts != null && !builderContexts.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return query != null;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return requiresRemovals != null && !requiresRemovals.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return providesRemovals != null && !providesRemovals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IRequiredCapabilityContainer.class) {
			switch (derivedFeatureID) {
				case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES: return B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES;
				default: return -1;
			}
		}
		if (baseClass == IProvidedCapabilityContainer.class) {
			switch (derivedFeatureID) {
				case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES: return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IRequiredCapabilityContainer.class) {
			switch (baseFeatureID) {
				case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES: return B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES;
				default: return -1;
			}
		}
		if (baseClass == IProvidedCapabilityContainer.class) {
			switch (baseFeatureID) {
				case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES: return B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UnitConcernContextImpl
