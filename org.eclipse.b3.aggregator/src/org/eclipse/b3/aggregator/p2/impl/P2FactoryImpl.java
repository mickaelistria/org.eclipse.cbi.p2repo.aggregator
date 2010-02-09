/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2.impl;

import java.util.Map;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnitFragment;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.ITouchpointData;
import org.eclipse.equinox.p2.metadata.ITouchpointInstruction;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.osgi.framework.Filter;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class P2FactoryImpl extends EFactoryImpl implements P2Factory {
	private static final String MDR_PROXY_URI_FORMATTER = "%s:%s#//@metadataRepository";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static P2Package getPackage() {
		return P2Package.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static P2Factory init() {
		try {
			P2Factory theP2Factory = (P2Factory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/b3/2010/p2/1.0.0");
			if(theP2Factory != null) {
				return theP2Factory;
			}
		}
		catch(Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new P2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public P2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFilterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIArtifactKeyArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIInstallableUnitArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIInstallableUnitFragmentArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertILicenseArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIMatchExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIProvidedCapabilityArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIQueryResultToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIRequirementArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertITouchpointDataArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch(eDataType.getClassifierID()) {
		case P2Package.VERSION:
			return convertVersionToString(eDataType, instanceValue);
		case P2Package.VERSION_RANGE:
			return convertVersionRangeToString(eDataType, instanceValue);
		case P2Package.IINSTALLABLE_UNIT_ARRAY:
			return convertIInstallableUnitArrayToString(eDataType, instanceValue);
		case P2Package.IREQUIREMENT_ARRAY:
			return convertIRequirementArrayToString(eDataType, instanceValue);
		case P2Package.IPROVIDED_CAPABILITY_ARRAY:
			return convertIProvidedCapabilityArrayToString(eDataType, instanceValue);
		case P2Package.IINSTALLABLE_UNIT_FRAGMENT_ARRAY:
			return convertIInstallableUnitFragmentArrayToString(eDataType, instanceValue);
		case P2Package.IARTIFACT_KEY_ARRAY:
			return convertIArtifactKeyArrayToString(eDataType, instanceValue);
		case P2Package.ITOUCHPOINT_DATA_ARRAY:
			return convertITouchpointDataArrayToString(eDataType, instanceValue);
		case P2Package.STRING_ARRAY:
			return convertStringArrayToString(eDataType, instanceValue);
		case P2Package.UNTYPED_MAP:
			return convertUntypedMapToString(eDataType, instanceValue);
		case P2Package.MAP:
			return convertMapToString(eDataType, instanceValue);
		case P2Package.ILICENSE_ARRAY:
			return convertILicenseArrayToString(eDataType, instanceValue);
		case P2Package.IQUERY_RESULT:
			return convertIQueryResultToString(eDataType, instanceValue);
		case P2Package.FILTER:
			return convertFilterToString(eDataType, instanceValue);
		case P2Package.IMATCH_EXPRESSION:
			return convertIMatchExpressionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertUntypedMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertVersionRangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
		case P2Package.ARTIFACT_KEY:
			return (EObject) createArtifactKey();
		case P2Package.COPYRIGHT:
			return (EObject) createCopyright();
		case P2Package.METADATA_REPOSITORY:
			return (EObject) createMetadataRepository();
		case P2Package.INSTALLABLE_UNIT:
			return (EObject) createInstallableUnit();
		case P2Package.INSTALLABLE_UNIT_FRAGMENT:
			return (EObject) createInstallableUnitFragment();
		case P2Package.LICENSE:
			return (EObject) createLicense();
		case P2Package.PROVIDED_CAPABILITY:
			return (EObject) createProvidedCapability();
		case P2Package.REQUIRED_CAPABILITY:
			return (EObject) createRequiredCapability();
		case P2Package.REQUIREMENT:
			return (EObject) createRequirement();
		case P2Package.TOUCHPOINT_DATA:
			return (EObject) createTouchpointData();
		case P2Package.TOUCHPOINT_INSTRUCTION:
			return (EObject) createTouchpointInstruction();
		case P2Package.TOUCHPOINT_TYPE:
			return (EObject) createTouchpointType();
		case P2Package.UPDATE_DESCRIPTOR:
			return (EObject) createUpdateDescriptor();
		case P2Package.PROPERTY:
			return (EObject) createProperty();
		case P2Package.INSTRUCTION_MAP:
			return (EObject) createInstructionMap();
		case P2Package.REPOSITORY_REFERENCE:
			return (EObject) createRepositoryReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArtifactKey createArtifactKey() {
		ArtifactKeyImpl artifactKey = new ArtifactKeyImpl();
		return artifactKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Copyright createCopyright() {
		CopyrightImpl copyright = new CopyrightImpl();
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Filter createFilterFromString(EDataType eDataType, String initialValue) {
		return (Filter) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch(eDataType.getClassifierID()) {
		case P2Package.VERSION:
			return createVersionFromString(eDataType, initialValue);
		case P2Package.VERSION_RANGE:
			return createVersionRangeFromString(eDataType, initialValue);
		case P2Package.IINSTALLABLE_UNIT_ARRAY:
			return createIInstallableUnitArrayFromString(eDataType, initialValue);
		case P2Package.IREQUIREMENT_ARRAY:
			return createIRequirementArrayFromString(eDataType, initialValue);
		case P2Package.IPROVIDED_CAPABILITY_ARRAY:
			return createIProvidedCapabilityArrayFromString(eDataType, initialValue);
		case P2Package.IINSTALLABLE_UNIT_FRAGMENT_ARRAY:
			return createIInstallableUnitFragmentArrayFromString(eDataType, initialValue);
		case P2Package.IARTIFACT_KEY_ARRAY:
			return createIArtifactKeyArrayFromString(eDataType, initialValue);
		case P2Package.ITOUCHPOINT_DATA_ARRAY:
			return createITouchpointDataArrayFromString(eDataType, initialValue);
		case P2Package.STRING_ARRAY:
			return createStringArrayFromString(eDataType, initialValue);
		case P2Package.UNTYPED_MAP:
			return createUntypedMapFromString(eDataType, initialValue);
		case P2Package.MAP:
			return createMapFromString(eDataType, initialValue);
		case P2Package.ILICENSE_ARRAY:
			return createILicenseArrayFromString(eDataType, initialValue);
		case P2Package.IQUERY_RESULT:
			return createIQueryResultFromString(eDataType, initialValue);
		case P2Package.FILTER:
			return createFilterFromString(eDataType, initialValue);
		case P2Package.IMATCH_EXPRESSION:
			return createIMatchExpressionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IArtifactKey[] createIArtifactKeyArrayFromString(EDataType eDataType, String initialValue) {
		return (IArtifactKey[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IInstallableUnit[] createIInstallableUnitArrayFromString(EDataType eDataType, String initialValue) {
		return (IInstallableUnit[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IInstallableUnitFragment[] createIInstallableUnitFragmentArrayFromString(EDataType eDataType,
			String initialValue) {
		return (IInstallableUnitFragment[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ILicense[] createILicenseArrayFromString(EDataType eDataType, String initialValue) {
		return (ILicense[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IMatchExpression<?> createIMatchExpressionFromString(EDataType eDataType, String initialValue) {
		return (IMatchExpression<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstallableUnit createInstallableUnit() {
		InstallableUnitImpl installableUnit = new InstallableUnitImpl();
		return installableUnit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InstallableUnitFragment createInstallableUnitFragment() {
		InstallableUnitFragmentImpl installableUnitFragment = new InstallableUnitFragmentImpl();
		return installableUnitFragment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<String, ITouchpointInstruction> createInstructionMap() {
		InstructionMapImpl instructionMap = new InstructionMapImpl();
		return instructionMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IProvidedCapability[] createIProvidedCapabilityArrayFromString(EDataType eDataType, String initialValue) {
		return (IProvidedCapability[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IQueryResult<?> createIQueryResultFromString(EDataType eDataType, String initialValue) {
		return (IQueryResult<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IRequirement[] createIRequirementArrayFromString(EDataType eDataType, String initialValue) {
		return (IRequirement[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ITouchpointData[] createITouchpointDataArrayFromString(EDataType eDataType, String initialValue) {
		return (ITouchpointData[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MetadataRepository createMetadataRepository() {
		MetadataRepositoryImpl metadataRepository = new MetadataRepositoryImpl();
		return metadataRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public MetadataRepository createMetadataRepositoryProxy(String repoNature, String repoLocation) {
		MetadataRepositoryImpl mdr = (MetadataRepositoryImpl) createMetadataRepository();
		URI proxyURI = URI.createURI(String.format(MDR_PROXY_URI_FORMATTER, repoNature, repoLocation));
		mdr.eSetProxyURI(proxyURI);

		return mdr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<String, String> createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProvidedCapability createProvidedCapability() {
		ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
		return providedCapability;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RepositoryReference createRepositoryReference() {
		RepositoryReferenceImpl repositoryReference = new RepositoryReferenceImpl();
		return repositoryReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TouchpointData createTouchpointData() {
		TouchpointDataImpl touchpointData = new TouchpointDataImpl();
		return touchpointData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TouchpointInstruction createTouchpointInstruction() {
		TouchpointInstructionImpl touchpointInstruction = new TouchpointInstructionImpl();
		return touchpointInstruction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TouchpointType createTouchpointType() {
		TouchpointTypeImpl touchpointType = new TouchpointTypeImpl();
		return touchpointType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map createUntypedMapFromString(EDataType eDataType, String initialValue) {
		return (Map) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UpdateDescriptor createUpdateDescriptor() {
		UpdateDescriptorImpl updateDescriptor = new UpdateDescriptorImpl();
		return updateDescriptor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionRange createVersionRangeFromString(EDataType eDataType, String initialValue) {
		return (VersionRange) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public P2Package getP2Package() {
		return (P2Package) getEPackage();
	}

} // P2FactoryImpl
