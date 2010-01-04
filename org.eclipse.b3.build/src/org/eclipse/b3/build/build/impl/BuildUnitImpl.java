/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;
import java.util.Collection;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;

import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.ContainerConfiguration;
import org.eclipse.b3.build.build.RepositoryConfiguration;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.Synchronization;
import org.eclipse.b3.build.build.VersionedCapability;
import org.eclipse.b3.build.internal.BuildUnitUtils;
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
 * An implementation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getDefaultProperties <em>Default Properties</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getBuildUnitInterface <em>Build Unit Interface</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildUnitImpl extends VersionedCapabilityImpl implements BuildUnit {
	/**
	 * The cached value of the '{@link #getUnitProvidedCapabilities() <em>Unit Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedCapability> unitProvidedCapabilities;
	/**
	 * The cached value of the '{@link #getBuilders() <em>Builders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilders()
	 * @generated
	 * @ordered
	 */
	protected EList<Builder> builders;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionMode EXECUTION_MODE_EDEFAULT = ExecutionMode.SEQUENTIAL;
	/**
	 * The cached value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionMode executionMode = EXECUTION_MODE_EDEFAULT;
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
	 * The cached value of the '{@link #getMetaRequiredCapabilities() <em>Meta Required Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaRequiredCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCapability> metaRequiredCapabilities;
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> implements_;
	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;
	/**
	 * The cached value of the '{@link #getDefaultProperties() <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProperties()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet defaultProperties;
	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;
	/**
	 * The cached value of the '{@link #getSynchronizations() <em>Synchronizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronization> synchronizations;
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<BFunction> functions;
	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryConfiguration> repositories;
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerConfiguration> containers;

	/**
	 * The default value of the '{@link #getBuildUnitInterface() <em>Build Unit Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected static final Type BUILD_UNIT_INTERFACE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBuildUnitInterface() <em>Build Unit Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected Type buildUnitInterface = BUILD_UNIT_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected BuildUnit proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BuildUnitImpl() {
		super();
		// TODO: is there a better way to set this?
		// the default name space for build units
		setNameSpace("org.eclipse.b3.buildunit");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedCapability> getUnitProvidedCapabilities() {
		if (unitProvidedCapabilities == null) {
			unitProvidedCapabilities = new EObjectContainmentEList<VersionedCapability>(VersionedCapability.class, this, B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES);
		}
		return unitProvidedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Builder> getBuilders() {
		if (builders == null) {
			builders = new EObjectContainmentEList<Builder>(Builder.class, this, B3BuildPackage.BUILD_UNIT__BUILDERS);
		}
		return builders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		ExecutionMode oldExecutionMode = executionMode;
		executionMode = newExecutionMode == null ? EXECUTION_MODE_EDEFAULT : newExecutionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__EXECUTION_MODE, oldExecutionMode, executionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredCapability> getRequiredCapabilities() {
		if (requiredCapabilities == null) {
			requiredCapabilities = new EObjectContainmentEList<RequiredCapability>(RequiredCapability.class, this, B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES);
		}
		return requiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredCapability> getMetaRequiredCapabilities() {
		if (metaRequiredCapabilities == null) {
			metaRequiredCapabilities = new EObjectContainmentEList<RequiredCapability>(RequiredCapability.class, this, B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES);
		}
		return metaRequiredCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentEList<Type>(Type.class, this, B3BuildPackage.BUILD_UNIT__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(BConcern.class, this, B3BuildPackage.BUILD_UNIT__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultProperties(BPropertySet newDefaultProperties, NotificationChain msgs) {
		BPropertySet oldDefaultProperties = defaultProperties;
		defaultProperties = newDefaultProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, oldDefaultProperties, newDefaultProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultProperties(BPropertySet newDefaultProperties) {
		if (newDefaultProperties != defaultProperties) {
			NotificationChain msgs = null;
			if (defaultProperties != null)
				msgs = ((InternalEObject)defaultProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, null, msgs);
			if (newDefaultProperties != null)
				msgs = ((InternalEObject)newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES, newDefaultProperties, newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if (propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(BPropertySet.class, this, B3BuildPackage.BUILD_UNIT__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronization> getSynchronizations() {
		if (synchronizations == null) {
			synchronizations = new EObjectContainmentEList<Synchronization>(Synchronization.class, this, B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS);
		}
		return synchronizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<BFunction>(BFunction.class, this, B3BuildPackage.BUILD_UNIT__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryConfiguration> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<RepositoryConfiguration>(RepositoryConfiguration.class, this, B3BuildPackage.BUILD_UNIT__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerConfiguration> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<ContainerConfiguration>(ContainerConfiguration.class, this, B3BuildPackage.BUILD_UNIT__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an interface unique to this build unit. The interface is lazily created.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getBuildUnitInterface() {
		if(buildUnitInterface == null)
			buildUnitInterface = BuildUnitUtils.createBuildUnitInterface(this);
		return buildUnitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a BuildUnit proxy implementing the BuildUnit interface, as well as the special instance
	 * interface obtained from {@link #getBuildUnitInterface()}. This proxy should be used instead of
	 * the BuildUnit instance when calling functions to enable poymorphic function selection based on the
	 * interfaces this build unit implements.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BuildUnit getProxy() {
		if(proxy == null)
			proxy = BuildUnitUtils.createBuildUnitProxy(this);
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return ((InternalEList<?>)getUnitProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>)getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return ((InternalEList<?>)getMetaRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return ((InternalEList<?>)getSynchronizations()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return getUnitProvidedCapabilities();
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return getBuilders();
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				return getExecutionMode();
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return getMetaRequiredCapabilities();
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return getImplements();
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return getConcerns();
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return getDefaultProperties();
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return getPropertySets();
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return getSynchronizations();
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return getFunctions();
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return getRepositories();
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return getContainers();
			case B3BuildPackage.BUILD_UNIT__BUILD_UNIT_INTERFACE:
				return getBuildUnitInterface();
			case B3BuildPackage.BUILD_UNIT__PROXY:
				return getProxy();
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				getUnitProvidedCapabilities().clear();
				getUnitProvidedCapabilities().addAll((Collection<? extends VersionedCapability>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends Builder>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				setExecutionMode((ExecutionMode)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends RequiredCapability>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				getMetaRequiredCapabilities().clear();
				getMetaRequiredCapabilities().addAll((Collection<? extends RequiredCapability>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Type>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				getSynchronizations().clear();
				getSynchronizations().addAll((Collection<? extends Synchronization>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends BFunction>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends RepositoryConfiguration>)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends ContainerConfiguration>)newValue);
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				getUnitProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				getBuilders().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
				return;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
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
				setDefaultProperties((BPropertySet)null);
				return;
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				getSynchronizations().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				getRepositories().clear();
				return;
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				getContainers().clear();
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return unitProvidedCapabilities != null && !unitProvidedCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return builders != null && !builders.isEmpty();
			case B3BuildPackage.BUILD_UNIT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.BUILD_UNIT__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
			case B3BuildPackage.BUILD_UNIT__REQUIRED_CAPABILITIES:
				return requiredCapabilities != null && !requiredCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__META_REQUIRED_CAPABILITIES:
				return metaRequiredCapabilities != null && !metaRequiredCapabilities.isEmpty();
			case B3BuildPackage.BUILD_UNIT__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case B3BuildPackage.BUILD_UNIT__CONCERNS:
				return concerns != null && !concerns.isEmpty();
			case B3BuildPackage.BUILD_UNIT__DEFAULT_PROPERTIES:
				return defaultProperties != null;
			case B3BuildPackage.BUILD_UNIT__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3BuildPackage.BUILD_UNIT__SYNCHRONIZATIONS:
				return synchronizations != null && !synchronizations.isEmpty();
			case B3BuildPackage.BUILD_UNIT__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3BuildPackage.BUILD_UNIT__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case B3BuildPackage.BUILD_UNIT__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case B3BuildPackage.BUILD_UNIT__BUILD_UNIT_INTERFACE:
				return BUILD_UNIT_INTERFACE_EDEFAULT == null ? buildUnitInterface != null : !BUILD_UNIT_INTERFACE_EDEFAULT.equals(buildUnitInterface);
			case B3BuildPackage.BUILD_UNIT__PROXY:
				return proxy != null;
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", executionMode: ");
		result.append(executionMode);
		result.append(", buildUnitInterface: ");
		result.append(buildUnitInterface);
		result.append(')');
		return result.toString();
	}

} //BuildUnitImpl
