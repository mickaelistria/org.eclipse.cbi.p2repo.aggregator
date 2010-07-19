/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.ContainerConfiguration;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.EffectiveUnitFacade;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.IBuildUnitContainer;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.Synchronization;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;
import org.eclipse.b3.build.core.adapters.SyntheticRequirementsAdapter;
import org.eclipse.b3.build.core.adapters.SyntheticRequirementsAdapterFactory;
import org.eclipse.b3.build.core.iterators.EffectiveCapabilitiesIteratorProvider;
import org.eclipse.b3.build.core.iterators.EffectiveRequirementsIteratorProvider;
import org.eclipse.b3.build.internal.BuildUnitUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

import com.google.inject.Injector;
import com.google.inject.internal.Lists;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getFunctions <em>Functions</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getRequiredPredicates <em>Required Predicates</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getBuilders <em>Builders</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getExecutionMode <em>Execution Mode</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getImplements <em>Implements</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getConcerns <em>Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getDefaultProperties <em>Default Properties</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getSynchronizations <em>Synchronizations</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getRepositories <em>Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getContainers <em>Containers</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getPropertySets <em>Property Sets</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getSourceLocation <em>Source Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getOutputLocation <em>Output Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getProviders <em>Providers</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuildUnitImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuildUnitImpl extends VersionedCapabilityImpl implements BuildUnit {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunction> functions;

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
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> providedCapabilities;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionMode EXECUTION_MODE_EDEFAULT = ExecutionMode.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionMode executionMode = EXECUTION_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaRequiredCapabilities() <em>Meta Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMetaRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> metaRequiredCapabilities;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> implements_;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;

	/**
	 * The cached value of the '{@link #getDefaultProperties() <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultProperties()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet defaultProperties;

	/**
	 * The cached value of the '{@link #getSynchronizations() <em>Synchronizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSynchronizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronization> synchronizations;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerConfiguration> containers;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * The default value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI SOURCE_LOCATION_EDEFAULT = (URI) B3backendFactory.eINSTANCE.createFromString(
		B3backendPackage.eINSTANCE.getURI(), "resource:/");

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
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<FirstFoundUnitProvider> providers;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected IBuildUnitContainer parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected BuildUnitImpl() {
		super();
		// TODO: is there a better way to set this?
		// i.e. the default name space for build units
		setNameSpace(B3BuildConstants.B3_NS_BUILDUNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IBuildUnitContainer basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefaultProperties(BPropertySet newDefaultProperties, NotificationChain msgs) {
		BPropertySet oldDefaultProperties = defaultProperties;
		defaultProperties = newDefaultProperties;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, oldDefaultProperties,
				newDefaultProperties);
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
		if(baseClass == BFunctionContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
					return B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS;
				default:
					return -1;
			}
		}
		if(baseClass == IRequiredCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
					return B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES;
				case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
					return B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES;
				default:
					return -1;
			}
		}
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
					return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
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
		if(baseClass == BFunctionContainer.class) {
			switch(baseFeatureID) {
				case B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS:
					return B3BuildPackage.BUILD_UNIT__FUNCTIONS;
				default:
					return -1;
			}
		}
		if(baseClass == IRequiredCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES:
					return B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES;
				case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES:
					return B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES;
				default:
					return -1;
			}
		}
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES;
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
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return getFunctions();
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
				return getRequiredPredicates();
			case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return getBuilders();
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				return getExecutionMode();
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return getMetaRequiredCapabilities();
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return getImplements();
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return getConcerns();
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return getDefaultProperties();
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return getSynchronizations();
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return getRepositories();
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return getContainers();
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return getPropertySets();
			case B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION:
				return getSourceLocation();
			case B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION:
				return getOutputLocation();
			case B3BuildPackage.BUILD_UNIT__PROVIDERS:
				return getProviders();
			case B3BuildPackage.BUILD_UNIT__PARENT:
				if(resolve)
					return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>) getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
				return ((InternalEList<?>) getRequiredPredicates()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return ((InternalEList<?>) getMetaRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return ((InternalEList<?>) getImplements()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return ((InternalEList<?>) getConcerns()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return ((InternalEList<?>) getSynchronizations()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return ((InternalEList<?>) getRepositories()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return ((InternalEList<?>) getContainers()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return ((InternalEList<?>) getPropertySets()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__PROVIDERS:
				return ((InternalEList<?>) getProviders()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
				return requiredPredicates != null && !requiredPredicates.isEmpty();
			case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return !getBuilders().isEmpty();
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return metaRequiredCapabilities != null && !metaRequiredCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return concerns != null && !concerns.isEmpty();
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return defaultProperties != null;
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return synchronizations != null && !synchronizations.isEmpty();
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION:
				return SOURCE_LOCATION_EDEFAULT == null
						? sourceLocation != null
						: !SOURCE_LOCATION_EDEFAULT.equals(sourceLocation);
			case B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION:
				return OUTPUT_LOCATION_EDEFAULT == null
						? outputLocation != null
						: !OUTPUT_LOCATION_EDEFAULT.equals(outputLocation);
			case B3BuildPackage.BUILD_UNIT__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case B3BuildPackage.BUILD_UNIT__PARENT:
				return parent != null;
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
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IFunction>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends RequiredCapability>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
				getRequiredPredicates().clear();
				getRequiredPredicates().addAll((Collection<? extends CapabilityPredicate>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				setExecutionMode((ExecutionMode) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				getMetaRequiredCapabilities().clear();
				getMetaRequiredCapabilities().addAll((Collection<? extends RequiredCapability>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Type>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				getSynchronizations().clear();
				getSynchronizations().addAll((Collection<? extends Synchronization>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ContainerConfiguration>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION:
				setSourceLocation((URI) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION:
				setOutputLocation((URI) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends FirstFoundUnitProvider>) newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__PARENT:
				setParent((IBuildUnitContainer) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES:
				getRequiredPredicates().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				getMetaRequiredCapabilities().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				getImplements().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				getConcerns().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) null);
				return;
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				getSynchronizations().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				getRepositories().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				getContainers().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION:
				setSourceLocation(SOURCE_LOCATION_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION:
				setOutputLocation(OUTPUT_LOCATION_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__PROVIDERS:
				getProviders().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__PARENT:
				setParent((IBuildUnitContainer) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: Optimize by caching - but needs to invalidate cache if builder has been added.
	 * Can also be optimized when all functions are builders - as the list is identical (although
	 * has different generic type parameter)...
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<IBuilder> getBuilders() {
		EList<IBuilder> x = new EObjectEList<IBuilder>(IBuilder.class, this, B3BuildPackage.BUILD_UNIT__BUILDERS);
		for(IFunction f : getFunctions()) {
			if(f instanceof IBuilder)
				x.add((IBuilder) f);
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if(concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(BConcern.class, this, B3BuildPackage.BUILD_UNIT__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ContainerConfiguration> getContainers() {
		if(containers == null) {
			containers = new EObjectContainmentEList<ContainerConfiguration>(
				ContainerConfiguration.class, this, B3BuildPackage.BUILD_UNIT__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPropertySet getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a Facade containing the effective and advised view of the BuildUnit (provided, required,
	 * and meta required capabilities). Filters are evaluated and advice is applied.
	 * See {@link EffectiveUnitFacade} for more information.
	 * <!-- end-user-doc -->
	 * 
	 * @throws IllegalArgumentException
	 *             if this unit has not been defined in the context passed as an argument.
	 * @generated NOT
	 */
	public EffectiveUnitFacade getEffectiveFacade(BExecutionContext ctx) throws Throwable {
		Injector injector = ctx.getInjector();
		IB3Evaluator evaluator = injector.getInstance(IB3Evaluator.class);

		// EFFECTIVE BUILD UNIT
		final BuildUnit u = ctx.getSomeThing(
			BuildUnit.class, BuildUnitProxyAdapterFactory.eINSTANCE.adapt(this).getIface());
		if(u == null)
			throw new IllegalArgumentException(
				"The unit must have been defined in a context prior to calling getEffectiveFacade(...)");

		EffectiveUnitFacade facade = B3BuildFactory.eINSTANCE.createEffectiveUnitFacade();
		facade.setUnit(u);

		// DEFAULT PROPERTIES
		// set the unit's default properties in a context visible downstream.
		BExecutionContext outer = ctx.createOuterContext();
		if(u.getDefaultProperties() != null)
			evaluator.doEvaluateDefaults(u.getDefaultProperties(), outer, true);

		// RESOLUTIONS
		// if unit defines resolution strategy, define repository configuration in the outer context
		//
		FirstFoundUnitProvider up = u.getUnitProvider();
		if(up != null) {
			EList<UnitProvider> reposDecls = up.getProviders();
			if(reposDecls.size() > 0) {
				// wrap in a first found
				// TODO: Consider default repositories (workspace, target platform, etc)
				// TODO: Control default repositories used via preferences
				// CompoundFirstFoundRepository firstFound = B3BuildFactory.eINSTANCE.createCompoundFirstFoundRepository();
				// EList<IBuildUnitRepository> repos = firstFound.getRepositories();
				// for(UnitProvider config : reposDecls) {
				// repos.add((IBuildUnitRepository) config.evaluate(outer));
				// }
				outer.defineValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS, up, FirstFoundUnitProvider.class);
			}
		}

		// remember the context use as parent for builder contexts
		facade.setContext(outer);

		// Add unit's effective REQUIRED, META REQUIRED AND PROVIDED to facade
		final EList<EffectiveCapabilityFacade> provided = facade.getProvidedCapabilities();
		final EList<EffectiveRequirementFacade> required = facade.getRequiredCapabilities();
		final EList<EffectiveRequirementFacade> mRequired = facade.getMetaRequiredCapabilities();
		final EList<EffectiveRequirementFacade> uRequired = facade.getUnitRequiredCapabilities();

		// REQUIRED
		for(RequiredCapability req : getRequiredCapabilities()) {
			final BExpression c = req.getCondExpr();
			if(c != null) {
				Object include = evaluator.doEvaluate(c, ctx);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}
			final EffectiveRequirementFacade rf = B3BuildFactory.eINSTANCE.createEffectiveRequirementFacade();
			rf.setRequirement(req);
			rf.setContext(outer);
			required.add(rf); // containment (all requirements)
			uRequired.add(rf); // non containment (only those in unit)
		}
		// REQUIRED PREDICATES
		// all matching units in any parent being a unit container (except 'self' naturally).
		// The result is kept in an adapter, if it exists it is reused
		//
		final SyntheticRequirementsAdapter reqAdapter = SyntheticRequirementsAdapterFactory.eINSTANCE.adapt(this);
		// processed already?
		List<RequiredCapability> syntheticRequirements = reqAdapter.getAssociatedInfo(ctx.getInvocationContext());
		if(syntheticRequirements == null) {
			// cache the synthetic requirements
			syntheticRequirements = Lists.newArrayList();
			reqAdapter.setAssociatedInfo(ctx.getInvocationContext(), syntheticRequirements);
			final CapabilityPredicate selfPredicate = B3BuildFactory.eINSTANCE.createCapabilityPredicate();
			selfPredicate.setNamePredicate(B3backendFactory.eINSTANCE.createBNamePredicate());
			selfPredicate.getNamePredicate().setName(getName());
			selfPredicate.setNameSpacePredicate(B3backendFactory.eINSTANCE.createBNamePredicate());
			selfPredicate.getNameSpacePredicate().setName(getNameSpace());
			if(getVersion() != null)
				selfPredicate.setVersionRange(new VersionRange(getVersion(), true, getVersion(), true));

			for(CapabilityPredicate q : getRequiredPredicates()) {
				for(IBuildUnitContainer parent = getParent(); parent != null; parent = parent instanceof BuildUnit
						? ((BuildUnit) parent).getParent()
						: null) {
					for(BuildUnit u2 : (parent).getBuildUnits()) {
						if(selfPredicate.matches(u2) || !q.matches(u2))
							continue;
						final RequiredCapability req = B3BuildFactory.eINSTANCE.createRequiredCapability();
						req.setMin(1);
						req.setMax(1);
						req.setGreedy(false);
						req.setName(u2.getName());
						req.setNameSpace(B3BuildConstants.B3_NS_BUILDUNIT);
						if(u2.getVersion() != null) {
							// if version is specified, use an exact range
							VersionRange range = new VersionRange(u2.getVersion(), true, u2.getVersion(), true);
							req.setVersionRange(range);
						}
						syntheticRequirements.add(req);
					}

				}
			}
		}
		for(RequiredCapability synthetic : syntheticRequirements) {
			final EffectiveRequirementFacade rf = B3BuildFactory.eINSTANCE.createEffectiveRequirementFacade();
			rf.setRequirement(synthetic);
			rf.setContext(outer);

			required.add(rf); // containment (all requirements)
			uRequired.add(rf); // non containment (only those in unit)

		}
		// META REQUIRED
		for(RequiredCapability req : getMetaRequiredCapabilities()) {
			BExpression c = req.getCondExpr();
			if(c != null) {
				Object include = evaluator.doEvaluate(c, ctx);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}

			EffectiveRequirementFacade rf = B3BuildFactory.eINSTANCE.createEffectiveRequirementFacade();
			rf.setRequirement(req);
			rf.setContext(outer);
			mRequired.add(rf);
		}
		// PROVIDED
		// PROVIDED BY UNIT
		for(Capability cap : getProvidedCapabilities()) {
			BExpression c = cap.getCondExpr();
			if(c != null) {
				Object include = evaluator.doEvaluate(c, outer);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}
			EffectiveCapabilityFacade cf = B3BuildFactory.eINSTANCE.createEffectiveCapabilityFacade();
			cf.setContext(outer);
			cf.setProvidedCapability(cap);
			provided.add(cf);
		}

		// PROVIDED BY BUILDERS
		// Find all builders applicable to this (possibly advised) Build Unit, and add their effective requirements
		// Note: The search for builders is based on the proxy (i.e. itself and all its interfaces).
		//
		BuildUnit proxy = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getProxy();
		Iterator<IFunction> builders = ctx.getFunctionIterator(proxy.getClass(), Builder.class);
		EffectiveCapabilitiesIteratorProvider capItorProvider = injector.getInstance(EffectiveCapabilitiesIteratorProvider.class);
		EffectiveRequirementsIteratorProvider reqItorProvider = injector.getInstance(EffectiveRequirementsIteratorProvider.class);

		while(builders.hasNext()) {
			Builder b = (Builder) builders.next();
			Iterator<EffectiveRequirementFacade> rItor = reqItorProvider.doGetIterator(b, outer);
			while(rItor.hasNext())
				required.add(rItor.next());
			Iterator<EffectiveCapabilityFacade> pItor = capItorProvider.doGetIterator(b, outer);
			while(pItor.hasNext()) {
				provided.add(pItor.next());
			}
		}
		// THE UNIT AS CAPABILITY
		EffectiveCapabilityFacade unitCapability = B3BuildFactory.eINSTANCE.createEffectiveCapabilityFacade();
		unitCapability.setContext(outer);
		unitCapability.setProvidedCapability(this);
		provided.add(unitCapability);

		// DONE
		return facade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IFunction> getFunctions() {
		if(functions == null) {
			functions = new EObjectContainmentWithInverseEList<IFunction>(
				IFunction.class, this, B3BuildPackage.BUILD_UNIT__FUNCTIONS, B3backendPackage.IFUNCTION__CONTAINER);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Type> getImplements() {
		if(implements_ == null) {
			implements_ = new EObjectContainmentEList<Type>(Type.class, this, B3BuildPackage.BUILD_UNIT__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RequiredCapability> getMetaRequiredCapabilities() {
		if(metaRequiredCapabilities == null) {
			metaRequiredCapabilities = new EObjectContainmentEList<RequiredCapability>(
				RequiredCapability.class, this, B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES);
		}
		return metaRequiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the default output location if not explicetly set.
	 * The default is <code>output:/componentName_version/</code> where _version may
	 * be omitted if not defined. If the unit us unnamed, a unique name "UNNAMED-UNIT@hash" is used.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public URI getOutputLocation() {
		if(outputLocation == null) {
			StringBuffer buf = new StringBuffer();
			buf.append("/");
			String n = getName();
			if(n == null || n.length() < 1)
				n = "UNNAMED_UNIT" + String.valueOf(hashCode());
			// Best to be strict with "funny characters"
			buf.append(BuildUnitUtils.getClassnameSafeString(n));
			Version v = getVersion();
			if(v != null) {
				buf.append("__");
				buf.append(BuildUnitUtils.getClassnameSafeVersionString(v));
			}
			buf.append("/");
			try {
				return new URI("b3output", buf.toString(), null);
			}
			catch(URISyntaxException e) {
				throw new IllegalArgumentException("Automatically generated output URI Error", e);
			}
			// Do NOT save this in the BuildUnit - it confuses the editor if the model changes
			// while running the text - if required to cache this - do this with an adapter.
			// setOutputLocation(URI.create(buf.toString()));
		}
		return outputLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IBuildUnitContainer getParent() {
		if(parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (IBuildUnitContainer) eResolveProxy(oldParent);
			if(parent != oldParent) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.BUILD_UNIT__PARENT, oldParent, parent));
			}
		}
		// return first parent being a IBuildUnitContainer
		if(parent == null) {
			for(EObject p = eContainer(); p != null; p = p.eContainer())
				if(p instanceof IBuildUnitContainer)
					return (IBuildUnitContainer) p;
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if(propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(
				BPropertySet.class, this, B3BuildPackage.BUILD_UNIT__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(
				Capability.class, this, B3BuildPackage.BUILD_UNIT__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<FirstFoundUnitProvider> getProviders() {
		if(providers == null) {
			providers = new EObjectContainmentEList<FirstFoundUnitProvider>(
				FirstFoundUnitProvider.class, this, B3BuildPackage.BUILD_UNIT__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if(repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(
				Repository.class, this, B3BuildPackage.BUILD_UNIT__REPOSITORIES);
		}
		return repositories;
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
				RequiredCapability.class, this, B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES);
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
				CapabilityPredicate.class, this, B3BuildPackage.BUILD_UNIT__REQUIRED_PREDICATES);
		}
		return requiredPredicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the source location of the build unit. If not explicitly set, the URI
	 * resource:/component-name/ is returned. If the component name is not set, a
	 * UNNAMED-UNIT@hascode is used as the name (which likely will lead to other issues
	 * further on, but should at least provide some insight into the source of the problem).
	 * (the name and/or the source location should really have been set explicitly).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public URI getSourceLocation() {
		if(sourceLocation == null) {
			StringBuffer buf = new StringBuffer();
			buf.append("resource:/");
			String n = getName();
			if(n == null || n.length() < 1)
				n = "UNNAMED-UNIT@" + String.valueOf(hashCode());
			buf.append(n);
			Version v = getVersion();
			if(v != null) {
				buf.append("_");
				v.toString(buf);
			}
			buf.append("/");
			setSourceLocation(URI.create(buf.toString()));
		}
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Synchronization> getSynchronizations() {
		if(synchronizations == null) {
			synchronizations = new EObjectContainmentEList<Synchronization>(
				Synchronization.class, this, B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS);
		}
		return synchronizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public FirstFoundUnitProvider getUnitProvider() {
		return getProviders().size() > 0
				? getProviders().get(0)
				: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultProperties(BPropertySet newDefaultProperties) {
		if(newDefaultProperties != defaultProperties) {
			NotificationChain msgs = null;
			if(defaultProperties != null)
				msgs = ((InternalEObject) defaultProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, null, msgs);
			if(newDefaultProperties != null)
				msgs = ((InternalEObject) newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, newDefaultProperties,
				newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		ExecutionMode oldExecutionMode = executionMode;
		executionMode = newExecutionMode == null
				? EXECUTION_MODE_EDEFAULT
				: newExecutionMode;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__EXECUTION_MODE, oldExecutionMode, executionMode));
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
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__OUTPUT_LOCATION, oldOutputLocation, outputLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(IBuildUnitContainer newParent) {
		IBuildUnitContainer oldParent = parent;
		parent = newParent;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__PARENT, oldParent, parent));
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
				this, Notification.SET, B3BuildPackage.BUILD_UNIT__SOURCE_LOCATION, oldSourceLocation, sourceLocation));
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
		result.append(" (name: ");
		result.append(getName());
		result.append(')');
		return result.toString();
	}

} // BuildUnitImpl
