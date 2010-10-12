/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.impl;

import java.net.URI;
import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.RequiresPredicate;
import org.eclipse.b3.build.UnitConcernContext;
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
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getRequiredPredicates <em>Required Predicates</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getBuilderContexts <em>Builder Contexts</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getQuery <em>Query</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getRequiresRemovals <em>Requires Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getProvidesRemovals <em>Provides Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getSourceLocation <em>Source Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getOutputLocation <em>Output Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.UnitConcernContextImpl#getRequiredPredicatesRemovals <em>Required Predicates Removals</em>}</li>
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
	 * 
	 * @see #getRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> requiredCapabilities;

	/**
	 * The cached value of the '{@link #getRequiredPredicates() <em>Required Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityPredicate> requiredPredicates;

	/**
	 * The cached value of the '{@link #getBuilderContexts() <em>Builder Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuilderContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BuilderConcernContext> builderContexts;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression query;

	/**
	 * The cached value of the '{@link #getRequiresRemovals() <em>Requires Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiresRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiresPredicate> requiresRemovals;

	/**
	 * The cached value of the '{@link #getProvidesRemovals() <em>Provides Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPredicate> providesRemovals;

	/**
	 * The default value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI SOURCE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected URI sourceLocation = SOURCE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI OUTPUT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLocation() <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputLocation()
	 * @generated
	 * @ordered
	 */
	protected URI outputLocation = OUTPUT_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredPredicatesRemovals() <em>Required Predicates Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequiredPredicatesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityPredicate> requiredPredicatesRemovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UnitConcernContextImpl() {
		super();
	}

	// /**
	// * Surgically performs the modification of a unit (it should be passed a clone).
	// *
	// * @param u
	// * the cloned build unit to modify
	// * @param ctx
	// * the execution context
	// * @return true if the given unit was modified
	// * @throws Throwable
	// */
	// private boolean adviseUnit(BuildUnit u, BuildContext ctx) throws Throwable {
	// boolean modified = false;
	//
	// // removal of provided capabilities
	// ListIterator<Capability> pcItor = getProvidedCapabilities().listIterator();
	// while(pcItor.hasNext()) {
	// Capability pc = pcItor.next();
	// for(ProvidesPredicate prem : getProvidesRemovals())
	// if(pc instanceof VersionedCapability
	// ? prem.matches((VersionedCapability.class.cast(pc)))
	// : prem.matches(pc)) {
	// pcItor.remove();
	// modified = true;
	// }
	// }
	// // addition of provided capabilities
	// for(Capability pc : getProvidedCapabilities()) {
	// pcItor.add(Capability.class.cast(EcoreUtil.copy(pc)));
	// modified = true;
	// }
	// // removal of required capabilities
	// ListIterator<RequiredCapability> rcItor = getRequiredCapabilities().listIterator();
	// while(rcItor.hasNext()) {
	// RequiredCapability rc = rcItor.next();
	// for(RequiresPredicate rrem : getRequiresRemovals()) {
	// if(rrem.matches(rc)) {
	// rcItor.remove();
	// modified = true;
	// }
	// }
	// }
	// // addition of required capabilities
	// for(RequiredCapability rc : getRequiredCapabilities()) {
	// rcItor.add(RequiredCapability.class.cast(EcoreUtil.copy(rc)));
	// modified = true;
	// }
	//
	// // SOURCE AND OUTPUT LOCATIONA
	// if(getSourceLocation() != null) {
	// u.setSourceLocation(getSourceLocation());
	// modified = true;
	// }
	//
	// if(getOutputLocation() != null) {
	// u.setOutputLocation(getOutputLocation());
	// modified = true;
	// }
	//
	// // ADVICE BUILDERS
	// // (note: does not require marking the unit itself as modified as the modified units
	// // are associated with the build unit via its interface.
	// adviseUnitBuilders(u, ctx);
	//
	// // DEFINE ADDITIONAL BUILDERS
	// // these builders are contained in a UnitConcernContext (no surprise) - they do not have a first parameter
	// // set (they can't since it is not known which units they will be defined for in advance). Wrappers must
	// // be used, and each wrapper installed for the matched unit.
	// //
	// EList<IFunction> fList = getFunctions();
	// Class<? extends BuildUnit> iFace = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getIface();
	// for(IFunction f : fList) {
	// BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
	// wrapper.setOriginal(f);
	// wrapper.setUnitType(iFace);
	// ctx.defineFunction(wrapper);
	// modified = true;
	// }
	//
	// // WEAVE DEFAULT PROPERTIES
	// // if there are removals or additions, copy the property set from the original and then remove
	// // specific property settings - nasty if other properties rely on previously set properties - but
	// // user has to worry about that, then add copied definitions from additions.
	// //
	// if(getDefaultPropertiesRemovals().size() > 0 || getDefaultPropertiesAdditions() != null) {
	// BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
	// u.setDefaultProperties(ps);
	// modified = processProperties(
	// ps, getDefaultPropertiesRemovals(), u.getDefaultProperties(), getDefaultPropertiesAdditions()) ||
	// modified;
	// }
	// // TODO: Support advised source and output locations
	//
	// return modified;
	// }

	// /**
	// * The builders applicable to the unit are matched using {@link BuilderConcernContext#evaluateIfMatching(Object, BExecutionContext, BuildUnit)}
	// * which weaves these
	// * builders as copies specific to the matching build units.
	// *
	// * @param u
	// * @param ctx
	// * @return true if any builders were advised
	// * @throws Throwable
	// */
	// private boolean adviseUnitBuilders(BuildUnit u, BExecutionContext ctx) throws Throwable {
	// boolean modified = false;
	// BuildUnit proxy = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getProxy();
	// Iterator<IFunction> fItor = ctx.getFunctionIterator(proxy.getClass(), IBuilder.class);
	// while(fItor.hasNext()) {
	// IFunction candidate = fItor.next();
	// for(BuilderConcernContext bx : getBuilderContexts()) {
	// if(bx.evaluateIfMatching(candidate, ctx, u))
	// modified = true;
	// }
	// }
	// return modified;
	// }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetQuery(BExpression newQuery, NotificationChain msgs) {
		BExpression oldQuery = query;
		query = newQuery;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, oldQuery, newQuery);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == IRequiredCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
					return B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES;
				case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
					return B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES;
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
		if(baseClass == IRequiredCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES:
					return B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES;
				case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES:
					return B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
				return getRequiredPredicates();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return getBuilderContexts();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return getQuery();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return getRequiresRemovals();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return getProvidesRemovals();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__SOURCE_LOCATION:
				return getSourceLocation();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION:
				return getOutputLocation();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS:
				return getRequiredPredicatesRemovals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>) getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
				return ((InternalEList<?>) getRequiredPredicates()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return ((InternalEList<?>) getBuilderContexts()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return basicSetQuery(null, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return ((InternalEList<?>) getRequiresRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return ((InternalEList<?>) getProvidesRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS:
				return ((InternalEList<?>) getRequiredPredicatesRemovals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
				return requiredPredicates != null && !requiredPredicates.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				return builderContexts != null && !builderContexts.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				return query != null;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				return requiresRemovals != null && !requiresRemovals.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return providesRemovals != null && !providesRemovals.isEmpty();
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__SOURCE_LOCATION:
				return SOURCE_LOCATION_EDEFAULT == null
						? sourceLocation != null
						: !SOURCE_LOCATION_EDEFAULT.equals(sourceLocation);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION:
				return OUTPUT_LOCATION_EDEFAULT == null
						? outputLocation != null
						: !OUTPUT_LOCATION_EDEFAULT.equals(outputLocation);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS:
				return requiredPredicatesRemovals != null && !requiredPredicatesRemovals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends RequiredCapability>) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
				getRequiredPredicates().clear();
				getRequiredPredicates().addAll((Collection<? extends CapabilityPredicate>) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				getBuilderContexts().clear();
				getBuilderContexts().addAll((Collection<? extends BuilderConcernContext>) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				getRequiresRemovals().clear();
				getRequiresRemovals().addAll((Collection<? extends RequiresPredicate>) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
				getProvidesRemovals().addAll((Collection<? extends ProvidesPredicate>) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__SOURCE_LOCATION:
				setSourceLocation((URI) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION:
				setOutputLocation((URI) newValue);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS:
				getRequiredPredicatesRemovals().clear();
				getRequiredPredicatesRemovals().addAll((Collection<? extends CapabilityPredicate>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	// /**
	// * Iterates over all BuildUnits visible in the current context, evaluates the predicates, and if matching,
	// * the unit is woven.
	// */
	// @Override
	// @Deprecated
	// public Object evaluate(BExecutionContext ctx) throws Throwable {
	// BExecutionContext ictx = ctx.createInnerContext();
	// ictx.defineVariableValue("@test", null, BuildUnit.class);
	// LValue lval = ictx.getLValue("@test");
	// for(BuildUnit u : new EffectiveUnitIterator(ctx)) {
	// lval.set(u);
	// // weaveIfMatching(u, ictx);
	// }
	// return this;
	// }

	// /**
	// * Weaves the build united passed as candidate if it matches the predicates.
	// */
	// @Override
	// @Deprecated
	// public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx) throws Throwable {
	// if(!(candidate instanceof BuildUnit))
	// return false;
	// BExecutionContext ictx = ctx.createInnerContext();
	// ictx.defineVariableValue("@test", null, BuildUnit.class);
	// return weaveIfMatching((BuildUnit) candidate, ictx);
	// }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES:
				getRequiredPredicates().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS:
				getBuilderContexts().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression) null);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS:
				getRequiresRemovals().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__SOURCE_LOCATION:
				setSourceLocation(SOURCE_LOCATION_EDEFAULT);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION:
				setOutputLocation(OUTPUT_LOCATION_EDEFAULT);
				return;
			case B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS:
				getRequiredPredicatesRemovals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BuilderConcernContext> getBuilderContexts() {
		if(builderContexts == null) {
			builderContexts = new EObjectContainmentEList<BuilderConcernContext>(
				BuilderConcernContext.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS);
		}
		return builderContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws {@link UnsupportedOperationException} - call this method on advised units instead.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<RequiredCapability> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		// should throw unsupported - not meaningful to call.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getOutputLocation() {
		return outputLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ProvidesPredicate> getProvidesRemovals() {
		if(providesRemovals == null) {
			providesRemovals = new EObjectContainmentEList<ProvidesPredicate>(
				ProvidesPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		}
		return providesRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequiredCapability> getRequiredCapabilities() {
		if(requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentEList<RequiredCapability>(
				RequiredCapability.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CapabilityPredicate> getRequiredPredicates() {
		if(requiredPredicates == null) {
			requiredPredicates = new EObjectContainmentEList<CapabilityPredicate>(
				CapabilityPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES);
		}
		return requiredPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CapabilityPredicate> getRequiredPredicatesRemovals() {
		if(requiredPredicatesRemovals == null) {
			requiredPredicatesRemovals = new EObjectContainmentEList<CapabilityPredicate>(
				CapabilityPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS);
		}
		return requiredPredicatesRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequiresPredicate> getRequiresRemovals() {
		if(requiresRemovals == null) {
			requiresRemovals = new EObjectContainmentEList<RequiresPredicate>(
				RequiresPredicate.class, this, B3BuildPackage.UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS);
		}
		return requiresRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getSourceLocation() {
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutputLocation(URI newOutputLocation) {
		URI oldOutputLocation = outputLocation;
		outputLocation = newOutputLocation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION, oldOutputLocation,
				outputLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setQuery(BExpression newQuery) {
		if(newQuery != query) {
			NotificationChain msgs = null;
			if(query != null)
				msgs = ((InternalEObject) query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, null, msgs);
			if(newQuery != null)
				msgs = ((InternalEObject) newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceLocation(URI newSourceLocation) {
		URI oldSourceLocation = sourceLocation;
		sourceLocation = newSourceLocation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.UNIT_CONCERN_CONTEXT__SOURCE_LOCATION, oldSourceLocation,
				sourceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sourceLocation: ");
		result.append(sourceLocation);
		result.append(", outputLocation: ");
		result.append(outputLocation);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.UNIT_CONCERN_CONTEXT;
	}
} // UnitConcernContextImpl
