/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.impl.AggregatorPackageImpl;
import org.eclipse.b3.aggregator.p2.ArtifactKey;
import org.eclipse.b3.aggregator.p2.Copyright;
import org.eclipse.b3.aggregator.p2.InstallableUnit;
import org.eclipse.b3.aggregator.p2.InstallableUnitFragment;
import org.eclipse.b3.aggregator.p2.License;
import org.eclipse.b3.aggregator.p2.MetadataRepository;
import org.eclipse.b3.aggregator.p2.P2Factory;
import org.eclipse.b3.aggregator.p2.P2Package;
import org.eclipse.b3.aggregator.p2.ProvidedCapability;
import org.eclipse.b3.aggregator.p2.RepositoryReference;
import org.eclipse.b3.aggregator.p2.RequiredCapability;
import org.eclipse.b3.aggregator.p2.Requirement;
import org.eclipse.b3.aggregator.p2.TouchpointData;
import org.eclipse.b3.aggregator.p2.TouchpointInstruction;
import org.eclipse.b3.aggregator.p2.TouchpointType;
import org.eclipse.b3.aggregator.p2.UpdateDescriptor;
import org.eclipse.b3.aggregator.p2view.P2viewPackage;
import org.eclipse.b3.aggregator.p2view.impl.P2viewPackageImpl;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.ITouchpointData;
import org.eclipse.equinox.p2.metadata.ITouchpointInstruction;
import org.eclipse.equinox.p2.metadata.ITouchpointType;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;
import org.eclipse.equinox.p2.metadata.IVersionedId;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;
import org.eclipse.equinox.p2.query.Collector;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.repository.IRepository;
import org.eclipse.equinox.p2.repository.IRepositoryReference;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.osgi.framework.Filter;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class P2PackageImpl extends EPackageImpl implements P2Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iArtifactKeyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iCopyrightEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iInstallableUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iInstallableUnitFragmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iLicenseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iProvidedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRequirementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRequiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iTouchpointDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iTouchpointInstructionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iTouchpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iVersionedIdEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iUpdateDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass artifactKeyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass copyrightEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass metadataRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass installableUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass installableUnitFragmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass licenseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass providedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass touchpointDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass touchpointInstructionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass touchpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass updateDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass instructionMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iQueryableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iMetadataRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRepositoryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repositoryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iAdaptableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType versionRangeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iInstallableUnitArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iProvidedCapabilityArrayEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iInstallableUnitFragmentArrayEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iArtifactKeyArrayEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iTouchpointDataArrayEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType untypedMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iLicenseArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iQueryResultEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iQueryEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType collectorEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType filterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iMatchExpressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iProvisioningAgentEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link P2Package#eINSTANCE} when that field is accessed. Clients should not
	 * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static P2Package init() {
		if(isInited)
			return (P2Package) EPackage.Registry.INSTANCE.getEPackage(P2Package.eNS_URI);

		// Obtain or create and register package
		P2PackageImpl theP2Package = (P2PackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof P2PackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new P2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AggregatorPackageImpl theAggregatorPackage = (AggregatorPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AggregatorPackage.eNS_URI) instanceof AggregatorPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(AggregatorPackage.eNS_URI)
				: AggregatorPackage.eINSTANCE);
		P2viewPackageImpl theP2viewPackage = (P2viewPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(P2viewPackage.eNS_URI) instanceof P2viewPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(P2viewPackage.eNS_URI)
				: P2viewPackage.eINSTANCE);

		// Create package meta-data objects
		theP2Package.createPackageContents();
		theAggregatorPackage.createPackageContents();
		theP2viewPackage.createPackageContents();

		// Initialize created meta-data
		theP2Package.initializePackageContents();
		theAggregatorPackage.initializePackageContents();
		theP2viewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theP2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(P2Package.eNS_URI, theP2Package);
		return theP2Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.b3.aggregator.p2.P2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private P2PackageImpl() {
		super(eNS_URI, P2Factory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if(isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		iArtifactKeyEClass = createEClass(IARTIFACT_KEY);
		createEAttribute(iArtifactKeyEClass, IARTIFACT_KEY__CLASSIFIER);
		createEAttribute(iArtifactKeyEClass, IARTIFACT_KEY__ID);
		createEAttribute(iArtifactKeyEClass, IARTIFACT_KEY__VERSION);

		iCopyrightEClass = createEClass(ICOPYRIGHT);
		createEAttribute(iCopyrightEClass, ICOPYRIGHT__LOCATION);
		createEAttribute(iCopyrightEClass, ICOPYRIGHT__BODY);

		iInstallableUnitEClass = createEClass(IINSTALLABLE_UNIT);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__ARTIFACTS);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__COPYRIGHT);
		createEAttribute(iInstallableUnitEClass, IINSTALLABLE_UNIT__FILTER);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__FRAGMENTS);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__LICENSES);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__META_REQUIREMENTS);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__PROVIDED_CAPABILITIES);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__REQUIREMENTS);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__TOUCHPOINT_DATA);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__TOUCHPOINT_TYPE);
		createEReference(iInstallableUnitEClass, IINSTALLABLE_UNIT__UPDATE_DESCRIPTOR);
		createEAttribute(iInstallableUnitEClass, IINSTALLABLE_UNIT__RESOLVED);
		createEAttribute(iInstallableUnitEClass, IINSTALLABLE_UNIT__SINGLETON);

		iInstallableUnitFragmentEClass = createEClass(IINSTALLABLE_UNIT_FRAGMENT);

		iLicenseEClass = createEClass(ILICENSE);
		createEAttribute(iLicenseEClass, ILICENSE__LOCATION);
		createEAttribute(iLicenseEClass, ILICENSE__BODY);
		createEAttribute(iLicenseEClass, ILICENSE__UUID);

		iProvidedCapabilityEClass = createEClass(IPROVIDED_CAPABILITY);
		createEAttribute(iProvidedCapabilityEClass, IPROVIDED_CAPABILITY__NAME);
		createEAttribute(iProvidedCapabilityEClass, IPROVIDED_CAPABILITY__NAMESPACE);
		createEAttribute(iProvidedCapabilityEClass, IPROVIDED_CAPABILITY__VERSION);

		iRequirementEClass = createEClass(IREQUIREMENT);
		createEAttribute(iRequirementEClass, IREQUIREMENT__FILTER);
		createEAttribute(iRequirementEClass, IREQUIREMENT__MAX);
		createEAttribute(iRequirementEClass, IREQUIREMENT__MIN);
		createEAttribute(iRequirementEClass, IREQUIREMENT__MATCHES);
		createEAttribute(iRequirementEClass, IREQUIREMENT__GREEDY);
		createEAttribute(iRequirementEClass, IREQUIREMENT__DESCRIPTION);

		iRequiredCapabilityEClass = createEClass(IREQUIRED_CAPABILITY);
		createEAttribute(iRequiredCapabilityEClass, IREQUIRED_CAPABILITY__NAME);
		createEAttribute(iRequiredCapabilityEClass, IREQUIRED_CAPABILITY__NAMESPACE);
		createEAttribute(iRequiredCapabilityEClass, IREQUIRED_CAPABILITY__RANGE);

		iTouchpointDataEClass = createEClass(ITOUCHPOINT_DATA);

		iTouchpointInstructionEClass = createEClass(ITOUCHPOINT_INSTRUCTION);
		createEAttribute(iTouchpointInstructionEClass, ITOUCHPOINT_INSTRUCTION__BODY);
		createEAttribute(iTouchpointInstructionEClass, ITOUCHPOINT_INSTRUCTION__IMPORT_ATTRIBUTE);

		iTouchpointTypeEClass = createEClass(ITOUCHPOINT_TYPE);
		createEAttribute(iTouchpointTypeEClass, ITOUCHPOINT_TYPE__ID);
		createEAttribute(iTouchpointTypeEClass, ITOUCHPOINT_TYPE__VERSION);

		iVersionedIdEClass = createEClass(IVERSIONED_ID);
		createEAttribute(iVersionedIdEClass, IVERSIONED_ID__ID);
		createEAttribute(iVersionedIdEClass, IVERSIONED_ID__VERSION);

		iUpdateDescriptorEClass = createEClass(IUPDATE_DESCRIPTOR);
		createEAttribute(iUpdateDescriptorEClass, IUPDATE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(iUpdateDescriptorEClass, IUPDATE_DESCRIPTOR__SEVERITY);
		createEAttribute(iUpdateDescriptorEClass, IUPDATE_DESCRIPTOR__LOCATION);

		artifactKeyEClass = createEClass(ARTIFACT_KEY);

		copyrightEClass = createEClass(COPYRIGHT);

		metadataRepositoryEClass = createEClass(METADATA_REPOSITORY);
		createEReference(metadataRepositoryEClass, METADATA_REPOSITORY__INSTALLABLE_UNITS);
		createEReference(metadataRepositoryEClass, METADATA_REPOSITORY__REFERENCES);
		createEReference(metadataRepositoryEClass, METADATA_REPOSITORY__PROPERTY_MAP);

		installableUnitEClass = createEClass(INSTALLABLE_UNIT);
		createEReference(installableUnitEClass, INSTALLABLE_UNIT__PROPERTY_MAP);

		installableUnitFragmentEClass = createEClass(INSTALLABLE_UNIT_FRAGMENT);

		licenseEClass = createEClass(LICENSE);

		providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);

		requirementEClass = createEClass(REQUIREMENT);

		touchpointDataEClass = createEClass(TOUCHPOINT_DATA);
		createEReference(touchpointDataEClass, TOUCHPOINT_DATA__INSTRUCTION_MAP);

		touchpointInstructionEClass = createEClass(TOUCHPOINT_INSTRUCTION);

		touchpointTypeEClass = createEClass(TOUCHPOINT_TYPE);

		updateDescriptorEClass = createEClass(UPDATE_DESCRIPTOR);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		instructionMapEClass = createEClass(INSTRUCTION_MAP);
		createEAttribute(instructionMapEClass, INSTRUCTION_MAP__KEY);
		createEReference(instructionMapEClass, INSTRUCTION_MAP__VALUE);

		iQueryableEClass = createEClass(IQUERYABLE);

		iMetadataRepositoryEClass = createEClass(IMETADATA_REPOSITORY);

		iRepositoryEClass = createEClass(IREPOSITORY);
		createEAttribute(iRepositoryEClass, IREPOSITORY__LOCATION);
		createEAttribute(iRepositoryEClass, IREPOSITORY__NAME);
		createEAttribute(iRepositoryEClass, IREPOSITORY__TYPE);
		createEAttribute(iRepositoryEClass, IREPOSITORY__VERSION);
		createEAttribute(iRepositoryEClass, IREPOSITORY__DESCRIPTION);
		createEAttribute(iRepositoryEClass, IREPOSITORY__PROVIDER);
		createEAttribute(iRepositoryEClass, IREPOSITORY__MODIFIABLE);

		iRepositoryReferenceEClass = createEClass(IREPOSITORY_REFERENCE);

		repositoryReferenceEClass = createEClass(REPOSITORY_REFERENCE);
		createEAttribute(repositoryReferenceEClass, REPOSITORY_REFERENCE__LOCATION);
		createEAttribute(repositoryReferenceEClass, REPOSITORY_REFERENCE__TYPE);
		createEAttribute(repositoryReferenceEClass, REPOSITORY_REFERENCE__OPTIONS);
		createEAttribute(repositoryReferenceEClass, REPOSITORY_REFERENCE__NICKNAME);

		iAdaptableEClass = createEClass(IADAPTABLE);

		// Create data types
		versionEDataType = createEDataType(VERSION);
		versionRangeEDataType = createEDataType(VERSION_RANGE);
		iInstallableUnitArrayEDataType = createEDataType(IINSTALLABLE_UNIT_ARRAY);
		collectionEDataType = createEDataType(COLLECTION);
		iProvidedCapabilityArrayEDataType = createEDataType(IPROVIDED_CAPABILITY_ARRAY);
		iInstallableUnitFragmentArrayEDataType = createEDataType(IINSTALLABLE_UNIT_FRAGMENT_ARRAY);
		iArtifactKeyArrayEDataType = createEDataType(IARTIFACT_KEY_ARRAY);
		iTouchpointDataArrayEDataType = createEDataType(ITOUCHPOINT_DATA_ARRAY);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
		untypedMapEDataType = createEDataType(UNTYPED_MAP);
		mapEDataType = createEDataType(MAP);
		iLicenseArrayEDataType = createEDataType(ILICENSE_ARRAY);
		iQueryResultEDataType = createEDataType(IQUERY_RESULT);
		iQueryEDataType = createEDataType(IQUERY);
		collectorEDataType = createEDataType(COLLECTOR);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		filterEDataType = createEDataType(FILTER);
		iMatchExpressionEDataType = createEDataType(IMATCH_EXPRESSION);
		iProvisioningAgentEDataType = createEDataType(IPROVISIONING_AGENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getArtifactKey() {
		return artifactKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCollector() {
		return collectorEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCopyright() {
		return copyrightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFilter() {
		return filterEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIAdaptable() {
		return iAdaptableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIArtifactKey() {
		return iArtifactKeyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIArtifactKey_Classifier() {
		return (EAttribute) iArtifactKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIArtifactKey_Id() {
		return (EAttribute) iArtifactKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIArtifactKey_Version() {
		return (EAttribute) iArtifactKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIArtifactKeyArray() {
		return iArtifactKeyArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getICopyright() {
		return iCopyrightEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getICopyright_Body() {
		return (EAttribute) iCopyrightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getICopyright_Location() {
		return (EAttribute) iCopyrightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIInstallableUnit() {
		return iInstallableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_Artifacts() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_Copyright() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIInstallableUnit_Filter() {
		return (EAttribute) iInstallableUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_Fragments() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_Licenses() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_MetaRequirements() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_ProvidedCapabilities() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_Requirements() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIInstallableUnit_Resolved() {
		return (EAttribute) iInstallableUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIInstallableUnit_Singleton() {
		return (EAttribute) iInstallableUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_TouchpointData() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_TouchpointType() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIInstallableUnit_UpdateDescriptor() {
		return (EReference) iInstallableUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIInstallableUnitArray() {
		return iInstallableUnitArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIInstallableUnitFragment() {
		return iInstallableUnitFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIInstallableUnitFragmentArray() {
		return iInstallableUnitFragmentArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getILicense() {
		return iLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getILicense_Body() {
		return (EAttribute) iLicenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getILicense_Location() {
		return (EAttribute) iLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getILicense_UUID() {
		return (EAttribute) iLicenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getILicenseArray() {
		return iLicenseArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIMatchExpression() {
		return iMatchExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIMetadataRepository() {
		return iMetadataRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstallableUnit() {
		return installableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInstallableUnit_PropertyMap() {
		return (EReference) installableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstallableUnitFragment() {
		return installableUnitFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInstructionMap() {
		return instructionMapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getInstructionMap_Key() {
		return (EAttribute) instructionMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInstructionMap_Value() {
		return (EReference) instructionMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIProvidedCapability() {
		return iProvidedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIProvidedCapability_Name() {
		return (EAttribute) iProvidedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIProvidedCapability_Namespace() {
		return (EAttribute) iProvidedCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIProvidedCapability_Version() {
		return (EAttribute) iProvidedCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIProvidedCapabilityArray() {
		return iProvidedCapabilityArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIProvisioningAgent() {
		return iProvisioningAgentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIQuery() {
		return iQueryEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIQueryable() {
		return iQueryableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIQueryResult() {
		return iQueryResultEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRepository() {
		return iRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Description() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Location() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Modifiable() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Name() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Provider() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Type() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRepository_Version() {
		return (EAttribute) iRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRepositoryReference() {
		return iRepositoryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRequiredCapability() {
		return iRequiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequiredCapability_Name() {
		return (EAttribute) iRequiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequiredCapability_Namespace() {
		return (EAttribute) iRequiredCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequiredCapability_Range() {
		return (EAttribute) iRequiredCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRequirement() {
		return iRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Description() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Filter() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Greedy() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Matches() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Max() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIRequirement_Min() {
		return (EAttribute) iRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getITouchpointData() {
		return iTouchpointDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getITouchpointDataArray() {
		return iTouchpointDataArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getITouchpointInstruction() {
		return iTouchpointInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getITouchpointInstruction_Body() {
		return (EAttribute) iTouchpointInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getITouchpointInstruction_ImportAttribute() {
		return (EAttribute) iTouchpointInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getITouchpointType() {
		return iTouchpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getITouchpointType_Id() {
		return (EAttribute) iTouchpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getITouchpointType_Version() {
		return (EAttribute) iTouchpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIUpdateDescriptor() {
		return iUpdateDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIUpdateDescriptor_Description() {
		return (EAttribute) iUpdateDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIUpdateDescriptor_Location() {
		return (EAttribute) iUpdateDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIUpdateDescriptor_Severity() {
		return (EAttribute) iUpdateDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIVersionedId() {
		return iVersionedIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIVersionedId_Id() {
		return (EAttribute) iVersionedIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIVersionedId_Version() {
		return (EAttribute) iVersionedIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLicense() {
		return licenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMetadataRepository() {
		return metadataRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMetadataRepository_InstallableUnits() {
		return (EReference) metadataRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMetadataRepository_PropertyMap() {
		return (EReference) metadataRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMetadataRepository_References() {
		return (EReference) metadataRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public P2Factory getP2Factory() {
		return (P2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProvidedCapability() {
		return providedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepositoryReference() {
		return repositoryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepositoryReference_Location() {
		return (EAttribute) repositoryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepositoryReference_Nickname() {
		return (EAttribute) repositoryReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepositoryReference_Options() {
		return (EAttribute) repositoryReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepositoryReference_Type() {
		return (EAttribute) repositoryReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTouchpointData() {
		return touchpointDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTouchpointData_InstructionMap() {
		return (EReference) touchpointDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTouchpointInstruction() {
		return touchpointInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTouchpointType() {
		return touchpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getUntypedMap() {
		return untypedMapEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUpdateDescriptor() {
		return updateDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getVersionRange() {
		return versionRangeEDataType;
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if(isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AggregatorPackage theAggregatorPackage = (AggregatorPackage) EPackage.Registry.INSTANCE.getEPackage(AggregatorPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(iQueryableEClass, "T");
		ETypeParameter iRepositoryEClass_T = addETypeParameter(iRepositoryEClass, "T");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(iQueryResultEDataType, "T");
		addETypeParameter(iQueryEDataType, "T");
		addETypeParameter(iMatchExpressionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		iInstallableUnitEClass.getESuperTypes().add(this.getIVersionedId());
		iInstallableUnitFragmentEClass.getESuperTypes().add(this.getIInstallableUnit());
		iRequiredCapabilityEClass.getESuperTypes().add(this.getIRequirement());
		artifactKeyEClass.getESuperTypes().add(this.getIArtifactKey());
		copyrightEClass.getESuperTypes().add(this.getICopyright());
		metadataRepositoryEClass.getESuperTypes().add(this.getIMetadataRepository());
		installableUnitEClass.getESuperTypes().add(this.getIInstallableUnit());
		installableUnitFragmentEClass.getESuperTypes().add(this.getInstallableUnit());
		installableUnitFragmentEClass.getESuperTypes().add(this.getIInstallableUnitFragment());
		licenseEClass.getESuperTypes().add(this.getILicense());
		providedCapabilityEClass.getESuperTypes().add(this.getIProvidedCapability());
		requiredCapabilityEClass.getESuperTypes().add(this.getRequirement());
		requiredCapabilityEClass.getESuperTypes().add(this.getIRequiredCapability());
		requirementEClass.getESuperTypes().add(this.getIRequirement());
		touchpointDataEClass.getESuperTypes().add(this.getITouchpointData());
		touchpointInstructionEClass.getESuperTypes().add(this.getITouchpointInstruction());
		touchpointTypeEClass.getESuperTypes().add(this.getITouchpointType());
		updateDescriptorEClass.getESuperTypes().add(this.getIUpdateDescriptor());
		EGenericType g1 = createEGenericType(this.getIRepository());
		EGenericType g2 = createEGenericType(this.getIInstallableUnit());
		g1.getETypeArguments().add(g2);
		iMetadataRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIAdaptable());
		iRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIQueryable());
		g2 = createEGenericType(iRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		iRepositoryEClass.getEGenericSuperTypes().add(g1);
		repositoryReferenceEClass.getESuperTypes().add(this.getIRepositoryReference());

		// Initialize classes and features; add operations and parameters
		initEClass(iArtifactKeyEClass, IArtifactKey.class, "IArtifactKey", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIArtifactKey_Classifier(), ecorePackage.getEString(), "classifier", null, 1, 1,
				IArtifactKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIArtifactKey_Id(), ecorePackage.getEString(), "id", null, 1, 1, IArtifactKey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIArtifactKey_Version(), this.getVersion(), "version", null, 0, 1, IArtifactKey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(iArtifactKeyEClass, ecorePackage.getEString(), "toExternalForm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iCopyrightEClass, ICopyright.class, "ICopyright", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getICopyright_Location(), theAggregatorPackage.getURI(), "location", null, 0, 1,
				ICopyright.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getICopyright_Body(), ecorePackage.getEString(), "body", null, 0, 1, ICopyright.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iInstallableUnitEClass, IInstallableUnit.class, "IInstallableUnit", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIInstallableUnit_Artifacts(), this.getIArtifactKey(), null, "artifacts", null, 0, -1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_Copyright(), this.getICopyright(), null, "copyright", null, 0, 1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIInstallableUnit_Filter(), this.getFilter(), "filter", "", 0, 1, IInstallableUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_Fragments(), this.getIInstallableUnitFragment(), null, "fragments", null, 0,
				-1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_Licenses(), this.getILicense(), null, "licenses", null, 0, -1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_MetaRequirements(), this.getIRequirement(), null, "metaRequirements", null,
				0, -1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_ProvidedCapabilities(), this.getIProvidedCapability(), null,
				"providedCapabilities", null, 0, -1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_Requirements(), this.getIRequirement(), null, "requirements", null, 0, -1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_TouchpointData(), this.getITouchpointData(), null, "touchpointData", null,
				0, -1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_TouchpointType(), this.getITouchpointType(), null, "touchpointType", null,
				0, 1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIInstallableUnit_UpdateDescriptor(), this.getIUpdateDescriptor(), null, "updateDescriptor",
				null, 0, 1, IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIInstallableUnit_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIInstallableUnit_Singleton(), ecorePackage.getEBoolean(), "singleton", null, 0, 1,
				IInstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(iInstallableUnitEClass, this.getIInstallableUnit(), "unresolved", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(iInstallableUnitEClass, this.getICopyright(), "getCopyright", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "locale", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iInstallableUnitEClass, this.getILicense(), "getLicenses", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "locale", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iInstallableUnitEClass, null, "getProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theXMLTypePackage.getString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theXMLTypePackage.getString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iInstallableUnitEClass, ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iInstallableUnitEClass, ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "locale", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iInstallableUnitEClass, ecorePackage.getEBoolean(), "satisfies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIRequirement(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iInstallableUnitFragmentEClass, IInstallableUnitFragment.class, "IInstallableUnitFragment",
				IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iLicenseEClass, ILicense.class, "ILicense", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getILicense_Location(), theAggregatorPackage.getURI(), "location", null, 0, 1, ILicense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getILicense_Body(), ecorePackage.getEString(), "body", null, 0, 1, ILicense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getILicense_UUID(), ecorePackage.getEString(), "UUID", null, 0, 1, ILicense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iProvidedCapabilityEClass, IProvidedCapability.class, "IProvidedCapability", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIProvidedCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				IProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProvidedCapability_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1,
				IProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProvidedCapability_Version(), this.getVersion(), "version", null, 0, 1,
				IProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iRequirementEClass, IRequirement.class, "IRequirement", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRequirement_Filter(), this.getFilter(), "filter", null, 0, 1, IRequirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequirement_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, IRequirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequirement_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, IRequirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getIMatchExpression());
		g2 = createEGenericType(this.getIInstallableUnit());
		g1.getETypeArguments().add(g2);
		initEAttribute(getIRequirement_Matches(), g1, "matches", null, 0, 1, IRequirement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequirement_Greedy(), ecorePackage.getEBoolean(), "greedy", null, 0, 1, IRequirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				IRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(iRequirementEClass, ecorePackage.getEBoolean(), "isMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIInstallableUnit(), "installableUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iRequiredCapabilityEClass, IRequiredCapability.class, "IRequiredCapability", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRequiredCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				IRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequiredCapability_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1,
				IRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRequiredCapability_Range(), this.getVersionRange(), "range", null, 0, 1,
				IRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTouchpointDataEClass, ITouchpointData.class, "ITouchpointData", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iTouchpointDataEClass, null, "getInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theXMLTypePackage.getString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getITouchpointInstruction());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iTouchpointDataEClass, this.getITouchpointInstruction(), "getInstruction", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iTouchpointInstructionEClass, ITouchpointInstruction.class, "ITouchpointInstruction", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getITouchpointInstruction_Body(), ecorePackage.getEString(), "body", null, 0, 1,
				ITouchpointInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getITouchpointInstruction_ImportAttribute(), ecorePackage.getEString(), "importAttribute", null,
				0, 1, ITouchpointInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTouchpointTypeEClass, ITouchpointType.class, "ITouchpointType", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getITouchpointType_Id(), ecorePackage.getEString(), "id", null, 0, 1, ITouchpointType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getITouchpointType_Version(), this.getVersion(), "version", null, 0, 1, ITouchpointType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iVersionedIdEClass, IVersionedId.class, "IVersionedId", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIVersionedId_Id(), ecorePackage.getEString(), "id", "", 0, 1, IVersionedId.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIVersionedId_Version(), this.getVersion(), "version", null, 0, 1, IVersionedId.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iUpdateDescriptorEClass, IUpdateDescriptor.class, "IUpdateDescriptor", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIUpdateDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				IUpdateDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIUpdateDescriptor_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1,
				IUpdateDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIUpdateDescriptor_Location(), theAggregatorPackage.getURI(), "location", null, 0, 1,
				IUpdateDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(iUpdateDescriptorEClass, ecorePackage.getEBoolean(), "isUpdateOf", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getIInstallableUnit(), "installableUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iUpdateDescriptorEClass, null, "getIUsBeingUpdated", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getIMatchExpression());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getIInstallableUnit());
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		initEClass(artifactKeyEClass, ArtifactKey.class, "ArtifactKey", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(copyrightEClass, Copyright.class, "Copyright", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataRepositoryEClass, MetadataRepository.class, "MetadataRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataRepository_InstallableUnits(), this.getIInstallableUnit(), null, "installableUnits",
				null, 0, -1, MetadataRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getMetadataRepository_InstallableUnits().getEKeys().add(this.getIVersionedId_Id());
		getMetadataRepository_InstallableUnits().getEKeys().add(this.getIVersionedId_Version());
		initEReference(getMetadataRepository_References(), this.getIRepositoryReference(), null, "references", null, 0,
				-1, MetadataRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataRepository_PropertyMap(), this.getProperty(), null, "propertyMap", null, 0, -1,
				MetadataRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installableUnitEClass, InstallableUnit.class, "InstallableUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstallableUnit_PropertyMap(), this.getProperty(), null, "propertyMap", null, 0, -1,
				InstallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installableUnitFragmentEClass, InstallableUnitFragment.class, "InstallableUnitFragment",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(installableUnitFragmentEClass, null, "getHost", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getIRequirement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchpointDataEClass, TouchpointData.class, "TouchpointData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchpointData_InstructionMap(), this.getInstructionMap(), null, "instructionMap", null, 0,
				-1, TouchpointData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchpointInstructionEClass, TouchpointInstruction.class, "TouchpointInstruction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchpointTypeEClass, TouchpointType.class, "TouchpointType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateDescriptorEClass, UpdateDescriptor.class, "UpdateDescriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Map.Entry.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionMapEClass, Map.Entry.class, "InstructionMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionMap_Value(), this.getITouchpointInstruction(), null, "value", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iQueryableEClass, IQueryable.class, "IQueryable", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iQueryableEClass, null, "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIQuery(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "progress", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getIQueryResult());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(iMetadataRepositoryEClass, IMetadataRepository.class, "IMetadataRepository", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iMetadataRepositoryEClass, null, "addInstallableUnits", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getIInstallableUnit());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "installableUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iMetadataRepositoryEClass, null, "addReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getIRepositoryReference());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "references", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iMetadataRepositoryEClass, null, "removeAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iMetadataRepositoryEClass, ecorePackage.getEBoolean(), "removeInstallableUnits", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getIInstallableUnit());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "installableUnits", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iRepositoryEClass, IRepository.class, "IRepository", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRepository_Location(), theAggregatorPackage.getURI(), "location", null, 1, 1,
				IRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, IRepository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Type(), ecorePackage.getEString(), "type", null, 0, 1, IRepository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Version(), ecorePackage.getEString(), "version", null, 0, 1, IRepository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				IRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, IRepository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIRepository_Modifiable(), ecorePackage.getEBoolean(), "modifiable", null, 0, 1,
				IRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(iRepositoryEClass, null, "getProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theXMLTypePackage.getString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theXMLTypePackage.getString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iRepositoryEClass, ecorePackage.getEString(), "setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iRepositoryEClass, this.getIProvisioningAgent(), "getProvisioningAgent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(iRepositoryEClass, ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iRepositoryReferenceEClass, IRepositoryReference.class, "IRepositoryReference", IS_ABSTRACT,
				IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryReferenceEClass, RepositoryReference.class, "RepositoryReference", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryReference_Location(), theAggregatorPackage.getURI(), "location", null, 0, 1,
				RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryReference_Type(), ecorePackage.getEInt(), "type", null, 0, 1,
				RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryReference_Options(), ecorePackage.getEInt(), "options", null, 0, 1,
				RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryReference_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1,
				RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iAdaptableEClass, IAdaptable.class, "IAdaptable", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iAdaptableEClass, theXMLTypePackage.getAnySimpleType(), "getAdapter", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapter", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionRangeEDataType, VersionRange.class, "VersionRange", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iInstallableUnitArrayEDataType, IInstallableUnit[].class, "IInstallableUnitArray",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProvidedCapabilityArrayEDataType, IProvidedCapability[].class, "IProvidedCapabilityArray",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iInstallableUnitFragmentArrayEDataType, IInstallableUnitFragment[].class,
				"IInstallableUnitFragmentArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iArtifactKeyArrayEDataType, IArtifactKey[].class, "IArtifactKeyArray", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iTouchpointDataArrayEDataType, ITouchpointData[].class, "ITouchpointDataArray", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(untypedMapEDataType, Map.class, "UntypedMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iLicenseArrayEDataType, ILicense[].class, "ILicenseArray", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iQueryResultEDataType, IQueryResult.class, "IQueryResult", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iQueryEDataType, IQuery.class, "IQuery", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectorEDataType, Collector.class, "Collector", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(filterEDataType, Filter.class, "Filter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iMatchExpressionEDataType, IMatchExpression.class, "IMatchExpression", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProvisioningAgentEDataType, IProvisioningAgent.class, "IProvisioningAgent", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getRepositoryReference_Location(), source, new String[] {});
	}

} // P2PackageImpl
