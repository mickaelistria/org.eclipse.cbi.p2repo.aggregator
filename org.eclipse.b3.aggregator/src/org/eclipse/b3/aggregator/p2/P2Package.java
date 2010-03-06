/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.aggregator.p2.P2Factory
 * @model kind="package"
 * @generated
 */
public interface P2Package extends EPackage {
	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IArtifactKey <em>IArtifact Key</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IArtifactKey
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIArtifactKey()
		 * @generated
		 */
		EClass IARTIFACT_KEY = eINSTANCE.getIArtifactKey();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IARTIFACT_KEY__CLASSIFIER = eINSTANCE.getIArtifactKey_Classifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IARTIFACT_KEY__ID = eINSTANCE.getIArtifactKey_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IARTIFACT_KEY__VERSION = eINSTANCE.getIArtifactKey_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.ICopyright <em>ICopyright</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.ICopyright
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getICopyright()
		 * @generated
		 */
		EClass ICOPYRIGHT = eINSTANCE.getICopyright();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ICOPYRIGHT__LOCATION = eINSTANCE.getICopyright_Location();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ICOPYRIGHT__BODY = eINSTANCE.getICopyright_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IInstallableUnit
		 * <em>IInstallable Unit</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnit()
		 * @generated
		 */
		EClass IINSTALLABLE_UNIT = eINSTANCE.getIInstallableUnit();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__ARTIFACTS = eINSTANCE.getIInstallableUnit_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IINSTALLABLE_UNIT__FILTER = eINSTANCE.getIInstallableUnit_Filter();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__FRAGMENTS = eINSTANCE.getIInstallableUnit_Fragments();

		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__LICENSES = eINSTANCE.getIInstallableUnit_Licenses();

		/**
		 * The meta object literal for the '<em><b>Meta Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__META_REQUIREMENTS = eINSTANCE.getIInstallableUnit_MetaRequirements();

		/**
		 * The meta object literal for the '<em><b>Touchpoint Type</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__TOUCHPOINT_TYPE = eINSTANCE.getIInstallableUnit_TouchpointType();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IINSTALLABLE_UNIT__RESOLVED = eINSTANCE.getIInstallableUnit_Resolved();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IINSTALLABLE_UNIT__SINGLETON = eINSTANCE.getIInstallableUnit_Singleton();

		/**
		 * The meta object literal for the '<em><b>Update Descriptor</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__UPDATE_DESCRIPTOR = eINSTANCE.getIInstallableUnit_UpdateDescriptor();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__PROVIDED_CAPABILITIES = eINSTANCE.getIInstallableUnit_ProvidedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__REQUIREMENTS = eINSTANCE.getIInstallableUnit_Requirements();

		/**
		 * The meta object literal for the '<em><b>Touchpoint Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__TOUCHPOINT_DATA = eINSTANCE.getIInstallableUnit_TouchpointData();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IINSTALLABLE_UNIT__COPYRIGHT = eINSTANCE.getIInstallableUnit_Copyright();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
		 * <em>IInstallable Unit Fragment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitFragment()
		 * @generated
		 */
		EClass IINSTALLABLE_UNIT_FRAGMENT = eINSTANCE.getIInstallableUnitFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.ILicense <em>ILicense</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.ILicense
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getILicense()
		 * @generated
		 */
		EClass ILICENSE = eINSTANCE.getILicense();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ILICENSE__LOCATION = eINSTANCE.getILicense_Location();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ILICENSE__BODY = eINSTANCE.getILicense_Body();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ILICENSE__UUID = eINSTANCE.getILicense_UUID();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IProvidedCapability
		 * <em>IProvided Capability</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IProvidedCapability
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvidedCapability()
		 * @generated
		 */
		EClass IPROVIDED_CAPABILITY = eINSTANCE.getIProvidedCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IPROVIDED_CAPABILITY__NAME = eINSTANCE.getIProvidedCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IPROVIDED_CAPABILITY__NAMESPACE = eINSTANCE.getIProvidedCapability_Namespace();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IPROVIDED_CAPABILITY__VERSION = eINSTANCE.getIProvidedCapability_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IRequirement <em>IRequirement</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IRequirement
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequirement()
		 * @generated
		 */
		EClass IREQUIREMENT = eINSTANCE.getIRequirement();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIREMENT__FILTER = eINSTANCE.getIRequirement_Filter();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIREMENT__MAX = eINSTANCE.getIRequirement_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIREMENT__MIN = eINSTANCE.getIRequirement_Min();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIREMENT__MATCHES = eINSTANCE.getIRequirement_Matches();

		/**
		 * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIREMENT__GREEDY = eINSTANCE.getIRequirement_Greedy();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
		 * <em>IRequired Capability</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequiredCapability()
		 * @generated
		 */
		EClass IREQUIRED_CAPABILITY = eINSTANCE.getIRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIRED_CAPABILITY__NAME = eINSTANCE.getIRequiredCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIRED_CAPABILITY__NAMESPACE = eINSTANCE.getIRequiredCapability_Namespace();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREQUIRED_CAPABILITY__RANGE = eINSTANCE.getIRequiredCapability_Range();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointData
		 * <em>ITouchpoint Data</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.ITouchpointData
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointData()
		 * @generated
		 */
		EClass ITOUCHPOINT_DATA = eINSTANCE.getITouchpointData();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointInstruction
		 * <em>ITouchpoint Instruction</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.ITouchpointInstruction
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointInstruction()
		 * @generated
		 */
		EClass ITOUCHPOINT_INSTRUCTION = eINSTANCE.getITouchpointInstruction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITOUCHPOINT_INSTRUCTION__BODY = eINSTANCE.getITouchpointInstruction_Body();

		/**
		 * The meta object literal for the '<em><b>Import Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITOUCHPOINT_INSTRUCTION__IMPORT_ATTRIBUTE = eINSTANCE.getITouchpointInstruction_ImportAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointType
		 * <em>ITouchpoint Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.ITouchpointType
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointType()
		 * @generated
		 */
		EClass ITOUCHPOINT_TYPE = eINSTANCE.getITouchpointType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITOUCHPOINT_TYPE__ID = eINSTANCE.getITouchpointType_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITOUCHPOINT_TYPE__VERSION = eINSTANCE.getITouchpointType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IVersionedId <em>IVersioned Id</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IVersionedId
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIVersionedId()
		 * @generated
		 */
		EClass IVERSIONED_ID = eINSTANCE.getIVersionedId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IVERSIONED_ID__ID = eINSTANCE.getIVersionedId_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IVERSIONED_ID__VERSION = eINSTANCE.getIVersionedId_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.metadata.IUpdateDescriptor
		 * <em>IUpdate Descriptor</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IUpdateDescriptor
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIUpdateDescriptor()
		 * @generated
		 */
		EClass IUPDATE_DESCRIPTOR = eINSTANCE.getIUpdateDescriptor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IUPDATE_DESCRIPTOR__ID = eINSTANCE.getIUpdateDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IUPDATE_DESCRIPTOR__RANGE = eINSTANCE.getIUpdateDescriptor_Range();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IUPDATE_DESCRIPTOR__DESCRIPTION = eINSTANCE.getIUpdateDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IUPDATE_DESCRIPTOR__SEVERITY = eINSTANCE.getIUpdateDescriptor_Severity();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.ArtifactKeyImpl
		 * <em>Artifact Key</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.ArtifactKeyImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getArtifactKey()
		 * @generated
		 */
		EClass ARTIFACT_KEY = eINSTANCE.getArtifactKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.CopyrightImpl <em>Copyright</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.CopyrightImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCopyright()
		 * @generated
		 */
		EClass COPYRIGHT = eINSTANCE.getCopyright();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.MetadataRepositoryImpl
		 * <em>Metadata Repository</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.MetadataRepositoryImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getMetadataRepository()
		 * @generated
		 */
		EClass METADATA_REPOSITORY = eINSTANCE.getMetadataRepository();

		/**
		 * The meta object literal for the '<em><b>Installable Units</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METADATA_REPOSITORY__INSTALLABLE_UNITS = eINSTANCE.getMetadataRepository_InstallableUnits();

		/**
		 * The meta object literal for the '<em><b>Repository References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METADATA_REPOSITORY__REPOSITORY_REFERENCES = eINSTANCE.getMetadataRepository_RepositoryReferences();

		/**
		 * The meta object literal for the '<em><b>Property Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METADATA_REPOSITORY__PROPERTY_MAP = eINSTANCE.getMetadataRepository_PropertyMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl
		 * <em>Installable Unit</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstallableUnit()
		 * @generated
		 */
		EClass INSTALLABLE_UNIT = eINSTANCE.getInstallableUnit();

		/**
		 * The meta object literal for the '<em><b>Property Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTALLABLE_UNIT__PROPERTY_MAP = eINSTANCE.getInstallableUnit_PropertyMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitFragmentImpl
		 * <em>Installable Unit Fragment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.InstallableUnitFragmentImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstallableUnitFragment()
		 * @generated
		 */
		EClass INSTALLABLE_UNIT_FRAGMENT = eINSTANCE.getInstallableUnitFragment();

		/**
		 * The meta object literal for the '<em><b>Host List</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTALLABLE_UNIT_FRAGMENT__HOST_LIST = eINSTANCE.getInstallableUnitFragment_HostList();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.LicenseImpl <em>License</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.LicenseImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.ProvidedCapabilityImpl
		 * <em>Provided Capability</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.ProvidedCapabilityImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getProvidedCapability()
		 * @generated
		 */
		EClass PROVIDED_CAPABILITY = eINSTANCE.getProvidedCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl
		 * <em>Required Capability</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRequiredCapability()
		 * @generated
		 */
		EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.RequirementImpl
		 * <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.RequirementImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointDataImpl
		 * <em>Touchpoint Data</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointDataImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointData()
		 * @generated
		 */
		EClass TOUCHPOINT_DATA = eINSTANCE.getTouchpointData();

		/**
		 * The meta object literal for the '<em><b>Instruction Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TOUCHPOINT_DATA__INSTRUCTION_MAP = eINSTANCE.getTouchpointData_InstructionMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointInstructionImpl
		 * <em>Touchpoint Instruction</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointInstructionImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointInstruction()
		 * @generated
		 */
		EClass TOUCHPOINT_INSTRUCTION = eINSTANCE.getTouchpointInstruction();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointTypeImpl
		 * <em>Touchpoint Type</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointTypeImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointType()
		 * @generated
		 */
		EClass TOUCHPOINT_TYPE = eINSTANCE.getTouchpointType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.UpdateDescriptorImpl
		 * <em>Update Descriptor</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.UpdateDescriptorImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getUpdateDescriptor()
		 * @generated
		 */
		EClass UPDATE_DESCRIPTOR = eINSTANCE.getUpdateDescriptor();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.PropertyImpl <em>Property</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.PropertyImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.InstructionMapImpl
		 * <em>Instruction Map</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.InstructionMapImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstructionMap()
		 * @generated
		 */
		EClass INSTRUCTION_MAP = eINSTANCE.getInstructionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INSTRUCTION_MAP__KEY = eINSTANCE.getInstructionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTRUCTION_MAP__VALUE = eINSTANCE.getInstructionMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.query.IQueryable <em>IQueryable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.query.IQueryable
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQueryable()
		 * @generated
		 */
		EClass IQUERYABLE = eINSTANCE.getIQueryable();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
		 * <em>IMetadata Repository</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIMetadataRepository()
		 * @generated
		 */
		EClass IMETADATA_REPOSITORY = eINSTANCE.getIMetadataRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.IRepository <em>IRepository</em>}'
		 * class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.repository.IRepository
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRepository()
		 * @generated
		 */
		EClass IREPOSITORY = eINSTANCE.getIRepository();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__LOCATION = eINSTANCE.getIRepository_Location();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__NAME = eINSTANCE.getIRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__TYPE = eINSTANCE.getIRepository_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__VERSION = eINSTANCE.getIRepository_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__DESCRIPTION = eINSTANCE.getIRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__PROVIDER = eINSTANCE.getIRepository_Provider();

		/**
		 * The meta object literal for the '<em><b>Modifiable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IREPOSITORY__MODIFIABLE = eINSTANCE.getIRepository_Modifiable();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.aggregator.p2.impl.RepositoryReferenceImpl
		 * <em>Repository Reference</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.RepositoryReferenceImpl
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRepositoryReference()
		 * @generated
		 */
		EClass REPOSITORY_REFERENCE = eINSTANCE.getRepositoryReference();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY_REFERENCE__LOCATION = eINSTANCE.getRepositoryReference_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY_REFERENCE__TYPE = eINSTANCE.getRepositoryReference_Type();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY_REFERENCE__OPTIONS = eINSTANCE.getRepositoryReference_Options();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY_REFERENCE__NICKNAME = eINSTANCE.getRepositoryReference_Nickname();

		/**
		 * The meta object literal for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.IAdaptable
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIAdaptable()
		 * @generated
		 */
		EClass IADAPTABLE = eINSTANCE.getIAdaptable();

		/**
		 * The meta object literal for the '<em>IProvisioning Agent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.core.IProvisioningAgent
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvisioningAgent()
		 * @generated
		 */
		EDataType IPROVISIONING_AGENT = eINSTANCE.getIProvisioningAgent();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.Version
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>Version Range</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.equinox.internal.provisional.p2.core.VersionRange
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getVersionRange()
		 * @generated
		 */
		EDataType VERSION_RANGE = eINSTANCE.getVersionRange();

		/**
		 * The meta object literal for the '<em>IInstallable Unit Array</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitArray()
		 * @generated
		 */
		EDataType IINSTALLABLE_UNIT_ARRAY = eINSTANCE.getIInstallableUnitArray();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.util.Collection
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>IRequirement Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequirementArray()
		 * @generated
		 */
		EDataType IREQUIREMENT_ARRAY = eINSTANCE.getIRequirementArray();

		/**
		 * The meta object literal for the '<em>IProvided Capability Array</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvidedCapabilityArray()
		 * @generated
		 */
		EDataType IPROVIDED_CAPABILITY_ARRAY = eINSTANCE.getIProvidedCapabilityArray();

		/**
		 * The meta object literal for the '<em>IInstallable Unit Fragment Array</em>' data type.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitFragmentArray()
		 * @generated
		 */
		EDataType IINSTALLABLE_UNIT_FRAGMENT_ARRAY = eINSTANCE.getIInstallableUnitFragmentArray();

		/**
		 * The meta object literal for the '<em>IArtifact Key Array</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIArtifactKeyArray()
		 * @generated
		 */
		EDataType IARTIFACT_KEY_ARRAY = eINSTANCE.getIArtifactKeyArray();

		/**
		 * The meta object literal for the '<em>ITouchpoint Data Array</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointDataArray()
		 * @generated
		 */
		EDataType ITOUCHPOINT_DATA_ARRAY = eINSTANCE.getITouchpointDataArray();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

		/**
		 * The meta object literal for the '<em>Untyped Map</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see java.util.Map
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getUntypedMap()
		 * @generated
		 */
		EDataType UNTYPED_MAP = eINSTANCE.getUntypedMap();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.util.Map
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>ILicense Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getILicenseArray()
		 * @generated
		 */
		EDataType ILICENSE_ARRAY = eINSTANCE.getILicenseArray();

		/**
		 * The meta object literal for the '<em>IQuery Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.query.IQueryResult
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQueryResult()
		 * @generated
		 */
		EDataType IQUERY_RESULT = eINSTANCE.getIQueryResult();

		/**
		 * The meta object literal for the '<em>IQuery</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.query.IQuery
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQuery()
		 * @generated
		 */
		EDataType IQUERY = eINSTANCE.getIQuery();

		/**
		 * The meta object literal for the '<em>Collector</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.query.Collector
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCollector()
		 * @generated
		 */
		EDataType COLLECTOR = eINSTANCE.getCollector();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Filter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.osgi.framework.Filter
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getFilter()
		 * @generated
		 */
		EDataType FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em>IMatch Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
		 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIMatchExpression()
		 * @generated
		 */
		EDataType IMATCH_EXPRESSION = eINSTANCE.getIMatchExpression();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "p2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/b3/2010/p2/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "p2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	P2Package eINSTANCE = org.eclipse.b3.aggregator.p2.impl.P2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IArtifactKey <em>IArtifact Key</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IArtifactKey
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIArtifactKey()
	 * @generated
	 */
	int IARTIFACT_KEY = 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_KEY__CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_KEY__ID = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_KEY__VERSION = 2;

	/**
	 * The number of structural features of the '<em>IArtifact Key</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_KEY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.ICopyright <em>ICopyright</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.ICopyright
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getICopyright()
	 * @generated
	 */
	int ICOPYRIGHT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICOPYRIGHT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICOPYRIGHT__BODY = 1;

	/**
	 * The number of structural features of the '<em>ICopyright</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ICOPYRIGHT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IVersionedId <em>IVersioned Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IVersionedId
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIVersionedId()
	 * @generated
	 */
	int IVERSIONED_ID = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IVERSIONED_ID__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IVERSIONED_ID__VERSION = 1;

	/**
	 * The number of structural features of the '<em>IVersioned Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IVERSIONED_ID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IInstallableUnit <em>IInstallable Unit</em>}'
	 * class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnit()
	 * @generated
	 */
	int IINSTALLABLE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__ID = IVERSIONED_ID__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__VERSION = IVERSIONED_ID__VERSION;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__ARTIFACTS = IVERSIONED_ID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__COPYRIGHT = IVERSIONED_ID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__FILTER = IVERSIONED_ID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__FRAGMENTS = IVERSIONED_ID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__LICENSES = IVERSIONED_ID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Meta Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__META_REQUIREMENTS = IVERSIONED_ID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__PROVIDED_CAPABILITIES = IVERSIONED_ID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__REQUIREMENTS = IVERSIONED_ID_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Touchpoint Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__TOUCHPOINT_DATA = IVERSIONED_ID_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Touchpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__TOUCHPOINT_TYPE = IVERSIONED_ID_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Update Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__UPDATE_DESCRIPTOR = IVERSIONED_ID_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__RESOLVED = IVERSIONED_ID_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT__SINGLETON = IVERSIONED_ID_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>IInstallable Unit</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FEATURE_COUNT = IVERSIONED_ID_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
	 * <em>IInstallable Unit Fragment</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitFragment()
	 * @generated
	 */
	int IINSTALLABLE_UNIT_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__ID = IINSTALLABLE_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__VERSION = IINSTALLABLE_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__ARTIFACTS = IINSTALLABLE_UNIT__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__COPYRIGHT = IINSTALLABLE_UNIT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__FILTER = IINSTALLABLE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__FRAGMENTS = IINSTALLABLE_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__LICENSES = IINSTALLABLE_UNIT__LICENSES;

	/**
	 * The feature id for the '<em><b>Meta Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__META_REQUIREMENTS = IINSTALLABLE_UNIT__META_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__PROVIDED_CAPABILITIES = IINSTALLABLE_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__REQUIREMENTS = IINSTALLABLE_UNIT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Touchpoint Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__TOUCHPOINT_DATA = IINSTALLABLE_UNIT__TOUCHPOINT_DATA;

	/**
	 * The feature id for the '<em><b>Touchpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__TOUCHPOINT_TYPE = IINSTALLABLE_UNIT__TOUCHPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Update Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__UPDATE_DESCRIPTOR = IINSTALLABLE_UNIT__UPDATE_DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__RESOLVED = IINSTALLABLE_UNIT__RESOLVED;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT__SINGLETON = IINSTALLABLE_UNIT__SINGLETON;

	/**
	 * The number of structural features of the '<em>IInstallable Unit Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IINSTALLABLE_UNIT_FRAGMENT_FEATURE_COUNT = IINSTALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.ILicense <em>ILicense</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.ILicense
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getILicense()
	 * @generated
	 */
	int ILICENSE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ILICENSE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ILICENSE__BODY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ILICENSE__UUID = 2;

	/**
	 * The number of structural features of the '<em>ILicense</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ILICENSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IProvidedCapability
	 * <em>IProvided Capability</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IProvidedCapability
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvidedCapability()
	 * @generated
	 */
	int IPROVIDED_CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY__VERSION = 2;

	/**
	 * The number of structural features of the '<em>IProvided Capability</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IRequirement <em>IRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IRequirement
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequirement()
	 * @generated
	 */
	int IREQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT__MIN = 2;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT__MATCHES = 3;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT__GREEDY = 4;

	/**
	 * The number of structural features of the '<em>IRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIREMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
	 * <em>IRequired Capability</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequiredCapability()
	 * @generated
	 */
	int IREQUIRED_CAPABILITY = 7;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__FILTER = IREQUIREMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__MAX = IREQUIREMENT__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__MIN = IREQUIREMENT__MIN;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__MATCHES = IREQUIREMENT__MATCHES;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__GREEDY = IREQUIREMENT__GREEDY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__NAME = IREQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__NAMESPACE = IREQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY__RANGE = IREQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IRequired Capability</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_FEATURE_COUNT = IREQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointData <em>ITouchpoint Data</em>}'
	 * class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointData
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointData()
	 * @generated
	 */
	int ITOUCHPOINT_DATA = 8;

	/**
	 * The number of structural features of the '<em>ITouchpoint Data</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointInstruction
	 * <em>ITouchpoint Instruction</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointInstruction
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointInstruction()
	 * @generated
	 */
	int ITOUCHPOINT_INSTRUCTION = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_INSTRUCTION__BODY = 0;

	/**
	 * The feature id for the '<em><b>Import Attribute</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_INSTRUCTION__IMPORT_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>ITouchpoint Instruction</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.ITouchpointType <em>ITouchpoint Type</em>}'
	 * class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointType
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointType()
	 * @generated
	 */
	int ITOUCHPOINT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>ITouchpoint Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITOUCHPOINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.metadata.IUpdateDescriptor <em>IUpdate Descriptor</em>}
	 * ' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IUpdateDescriptor
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIUpdateDescriptor()
	 * @generated
	 */
	int IUPDATE_DESCRIPTOR = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IUPDATE_DESCRIPTOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IUPDATE_DESCRIPTOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IUPDATE_DESCRIPTOR__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IUPDATE_DESCRIPTOR__SEVERITY = 3;

	/**
	 * The number of structural features of the '<em>IUpdate Descriptor</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IUPDATE_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.ArtifactKeyImpl <em>Artifact Key</em>}'
	 * class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.ArtifactKeyImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getArtifactKey()
	 * @generated
	 */
	int ARTIFACT_KEY = 13;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_KEY__CLASSIFIER = IARTIFACT_KEY__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_KEY__ID = IARTIFACT_KEY__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_KEY__VERSION = IARTIFACT_KEY__VERSION;

	/**
	 * The number of structural features of the '<em>Artifact Key</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_KEY_FEATURE_COUNT = IARTIFACT_KEY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.CopyrightImpl <em>Copyright</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.CopyrightImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCopyright()
	 * @generated
	 */
	int COPYRIGHT = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__LOCATION = ICOPYRIGHT__LOCATION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__BODY = ICOPYRIGHT__BODY;

	/**
	 * The number of structural features of the '<em>Copyright</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_FEATURE_COUNT = ICOPYRIGHT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.query.IQueryable <em>IQueryable</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.query.IQueryable
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQueryable()
	 * @generated
	 */
	int IQUERYABLE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
	 * <em>IMetadata Repository</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIMetadataRepository()
	 * @generated
	 */
	int IMETADATA_REPOSITORY = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.MetadataRepositoryImpl
	 * <em>Metadata Repository</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.MetadataRepositoryImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getMetadataRepository()
	 * @generated
	 */
	int METADATA_REPOSITORY = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl
	 * <em>Installable Unit</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.InstallableUnitImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstallableUnit()
	 * @generated
	 */
	int INSTALLABLE_UNIT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.InstallableUnitFragmentImpl
	 * <em>Installable Unit Fragment</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.InstallableUnitFragmentImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstallableUnitFragment()
	 * @generated
	 */
	int INSTALLABLE_UNIT_FRAGMENT = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.LicenseImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.ProvidedCapabilityImpl
	 * <em>Provided Capability</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.ProvidedCapabilityImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getProvidedCapability()
	 * @generated
	 */
	int PROVIDED_CAPABILITY = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl
	 * <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.RequiredCapabilityImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.RequirementImpl <em>Requirement</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.RequirementImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointDataImpl <em>Touchpoint Data</em>}
	 * ' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointDataImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointData()
	 * @generated
	 */
	int TOUCHPOINT_DATA = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointInstructionImpl
	 * <em>Touchpoint Instruction</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointInstructionImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointInstruction()
	 * @generated
	 */
	int TOUCHPOINT_INSTRUCTION = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.TouchpointTypeImpl <em>Touchpoint Type</em>}
	 * ' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.TouchpointTypeImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getTouchpointType()
	 * @generated
	 */
	int TOUCHPOINT_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.UpdateDescriptorImpl
	 * <em>Update Descriptor</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.UpdateDescriptorImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getUpdateDescriptor()
	 * @generated
	 */
	int UPDATE_DESCRIPTOR = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.PropertyImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.InstructionMapImpl <em>Instruction Map</em>}
	 * ' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.InstructionMapImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getInstructionMap()
	 * @generated
	 */
	int INSTRUCTION_MAP = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIAdaptable()
	 * @generated
	 */
	int IADAPTABLE = 32;

	/**
	 * The number of structural features of the '<em>IAdaptable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IADAPTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.equinox.p2.repository.IRepository <em>IRepository</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.repository.IRepository
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRepository()
	 * @generated
	 */
	int IREPOSITORY = 30;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__LOCATION = IADAPTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__NAME = IADAPTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__TYPE = IADAPTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__VERSION = IADAPTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__DESCRIPTION = IADAPTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__PROVIDER = IADAPTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY__MODIFIABLE = IADAPTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>IRepository</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREPOSITORY_FEATURE_COUNT = IADAPTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__LOCATION = IREPOSITORY__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__NAME = IREPOSITORY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__TYPE = IREPOSITORY__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__VERSION = IREPOSITORY__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__DESCRIPTION = IREPOSITORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__PROVIDER = IREPOSITORY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY__MODIFIABLE = IREPOSITORY__MODIFIABLE;

	/**
	 * The number of structural features of the '<em>IMetadata Repository</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMETADATA_REPOSITORY_FEATURE_COUNT = IREPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__LOCATION = IMETADATA_REPOSITORY__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__NAME = IMETADATA_REPOSITORY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__TYPE = IMETADATA_REPOSITORY__TYPE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__VERSION = IMETADATA_REPOSITORY__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__DESCRIPTION = IMETADATA_REPOSITORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__PROVIDER = IMETADATA_REPOSITORY__PROVIDER;

	/**
	 * The feature id for the '<em><b>Modifiable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__MODIFIABLE = IMETADATA_REPOSITORY__MODIFIABLE;

	/**
	 * The feature id for the '<em><b>Installable Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__INSTALLABLE_UNITS = IMETADATA_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository References</b></em>' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__REPOSITORY_REFERENCES = IMETADATA_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Map</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY__PROPERTY_MAP = IMETADATA_REPOSITORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Metadata Repository</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METADATA_REPOSITORY_FEATURE_COUNT = IMETADATA_REPOSITORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__ID = IINSTALLABLE_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__VERSION = IINSTALLABLE_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__ARTIFACTS = IINSTALLABLE_UNIT__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__COPYRIGHT = IINSTALLABLE_UNIT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__FILTER = IINSTALLABLE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__FRAGMENTS = IINSTALLABLE_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__LICENSES = IINSTALLABLE_UNIT__LICENSES;

	/**
	 * The feature id for the '<em><b>Meta Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__META_REQUIREMENTS = IINSTALLABLE_UNIT__META_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__PROVIDED_CAPABILITIES = IINSTALLABLE_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__REQUIREMENTS = IINSTALLABLE_UNIT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Touchpoint Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__TOUCHPOINT_DATA = IINSTALLABLE_UNIT__TOUCHPOINT_DATA;

	/**
	 * The feature id for the '<em><b>Touchpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__TOUCHPOINT_TYPE = IINSTALLABLE_UNIT__TOUCHPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Update Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__UPDATE_DESCRIPTOR = IINSTALLABLE_UNIT__UPDATE_DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__RESOLVED = IINSTALLABLE_UNIT__RESOLVED;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__SINGLETON = IINSTALLABLE_UNIT__SINGLETON;

	/**
	 * The feature id for the '<em><b>Property Map</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT__PROPERTY_MAP = IINSTALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Installable Unit</em>' class.
	 * <!-- begin-user-doc --> <!-- =======
	 * The number of structural features of the '<em>Installable Unit</em>' class. <!-- begin-user-doc --> <!-- >>>>>>>
	 * .r10620 end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FEATURE_COUNT = IINSTALLABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__ID = INSTALLABLE_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__VERSION = INSTALLABLE_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__ARTIFACTS = INSTALLABLE_UNIT__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__COPYRIGHT = INSTALLABLE_UNIT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__FILTER = INSTALLABLE_UNIT__FILTER;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__FRAGMENTS = INSTALLABLE_UNIT__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__LICENSES = INSTALLABLE_UNIT__LICENSES;

	/**
	 * The feature id for the '<em><b>Meta Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__META_REQUIREMENTS = INSTALLABLE_UNIT__META_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__PROVIDED_CAPABILITIES = INSTALLABLE_UNIT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__REQUIREMENTS = INSTALLABLE_UNIT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Touchpoint Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__TOUCHPOINT_DATA = INSTALLABLE_UNIT__TOUCHPOINT_DATA;

	/**
	 * The feature id for the '<em><b>Touchpoint Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__TOUCHPOINT_TYPE = INSTALLABLE_UNIT__TOUCHPOINT_TYPE;

	/**
	 * The feature id for the '<em><b>Update Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__UPDATE_DESCRIPTOR = INSTALLABLE_UNIT__UPDATE_DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__RESOLVED = INSTALLABLE_UNIT__RESOLVED;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__SINGLETON = INSTALLABLE_UNIT__SINGLETON;

	/**
	 * The feature id for the '<em><b>Property Map</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__PROPERTY_MAP = INSTALLABLE_UNIT__PROPERTY_MAP;

	/**
	 * The feature id for the '<em><b>Host List</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT__HOST_LIST = INSTALLABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Installable Unit Fragment</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTALLABLE_UNIT_FRAGMENT_FEATURE_COUNT = INSTALLABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LICENSE__LOCATION = ILICENSE__LOCATION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LICENSE__BODY = ILICENSE__BODY;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LICENSE__UUID = ILICENSE__UUID;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = ILICENSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__NAME = IPROVIDED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__NAMESPACE = IPROVIDED_CAPABILITY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY__VERSION = IPROVIDED_CAPABILITY__VERSION;

	/**
	 * The number of structural features of the '<em>Provided Capability</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDED_CAPABILITY_FEATURE_COUNT = IPROVIDED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FILTER = IREQUIREMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MAX = IREQUIREMENT__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MIN = IREQUIREMENT__MIN;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MATCHES = IREQUIREMENT__MATCHES;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GREEDY = IREQUIREMENT__GREEDY;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = IREQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__FILTER = REQUIREMENT__FILTER;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MAX = REQUIREMENT__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MIN = REQUIREMENT__MIN;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MATCHES = REQUIREMENT__MATCHES;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__GREEDY = REQUIREMENT__GREEDY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAMESPACE = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__RANGE = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instruction Map</b></em>' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_DATA__INSTRUCTION_MAP = ITOUCHPOINT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Touchpoint Data</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_DATA_FEATURE_COUNT = ITOUCHPOINT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_INSTRUCTION__BODY = ITOUCHPOINT_INSTRUCTION__BODY;

	/**
	 * The feature id for the '<em><b>Import Attribute</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_INSTRUCTION__IMPORT_ATTRIBUTE = ITOUCHPOINT_INSTRUCTION__IMPORT_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Touchpoint Instruction</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_INSTRUCTION_FEATURE_COUNT = ITOUCHPOINT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_TYPE__ID = ITOUCHPOINT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_TYPE__VERSION = ITOUCHPOINT_TYPE__VERSION;

	/**
	 * The number of structural features of the '<em>Touchpoint Type</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_TYPE_FEATURE_COUNT = ITOUCHPOINT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTOR__DESCRIPTION = IUPDATE_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTOR__ID = IUPDATE_DESCRIPTOR__ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTOR__RANGE = IUPDATE_DESCRIPTOR__RANGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTOR__SEVERITY = IUPDATE_DESCRIPTOR__SEVERITY;

	/**
	 * The number of structural features of the '<em>Update Descriptor</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTOR_FEATURE_COUNT = IUPDATE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Instruction Map</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>IQueryable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IQUERYABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.aggregator.p2.impl.RepositoryReferenceImpl
	 * <em>Repository Reference</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.RepositoryReferenceImpl
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getRepositoryReference()
	 * @generated
	 */
	int REPOSITORY_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE__NICKNAME = 3;

	/**
	 * The number of structural features of the '<em>Repository Reference</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>IProvisioning Agent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.core.IProvisioningAgent
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvisioningAgent()
	 * @generated
	 */
	int IPROVISIONING_AGENT = 52;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 33;

	/**
	 * The meta object id for the '<em>Version Range</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getVersionRange()
	 * @generated
	 */
	int VERSION_RANGE = 34;

	/**
	 * The meta object id for the '<em>IInstallable Unit Array</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitArray()
	 * @generated
	 */
	int IINSTALLABLE_UNIT_ARRAY = 35;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.util.Collection
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 36;

	/**
	 * The meta object id for the '<em>IRequirement Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIRequirementArray()
	 * @generated
	 */
	int IREQUIREMENT_ARRAY = 37;

	/**
	 * The meta object id for the '<em>IProvided Capability Array</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProvidedCapabilityArray()
	 * @generated
	 */
	int IPROVIDED_CAPABILITY_ARRAY = 38;

	/**
	 * The meta object id for the '<em>IInstallable Unit Fragment Array</em>' data type.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIInstallableUnitFragmentArray()
	 * @generated
	 */
	int IINSTALLABLE_UNIT_FRAGMENT_ARRAY = 39;

	/**
	 * The meta object id for the '<em>IArtifact Key Array</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIArtifactKeyArray()
	 * @generated
	 */
	int IARTIFACT_KEY_ARRAY = 40;

	/**
	 * The meta object id for the '<em>ITouchpoint Data Array</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getITouchpointDataArray()
	 * @generated
	 */
	int ITOUCHPOINT_DATA_ARRAY = 41;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 42;

	/**
	 * The meta object id for the '<em>Untyped Map</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.util.Map
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getUntypedMap()
	 * @generated
	 */
	int UNTYPED_MAP = 43;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.util.Map
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getMap()
	 * @generated
	 */
	int MAP = 44;

	/**
	 * The meta object id for the '<em>ILicense Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getILicenseArray()
	 * @generated
	 */
	int ILICENSE_ARRAY = 45;

	/**
	 * The meta object id for the '<em>IQuery Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.query.IQueryResult
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQueryResult()
	 * @generated
	 */
	int IQUERY_RESULT = 46;

	/**
	 * The meta object id for the '<em>IQuery</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.query.IQuery
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIQuery()
	 * @generated
	 */
	int IQUERY = 47;

	/**
	 * The meta object id for the '<em>Collector</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.query.Collector
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getCollector()
	 * @generated
	 */
	int COLLECTOR = 48;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 49;

	/**
	 * The meta object id for the '<em>Filter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.osgi.framework.Filter
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 50;

	/**
	 * The meta object id for the '<em>IMatch Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
	 * @see org.eclipse.b3.aggregator.p2.impl.P2PackageImpl#getIMatchExpression()
	 * @generated
	 */
	int IMATCH_EXPRESSION = 51;

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.ArtifactKey <em>Artifact Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Artifact Key</em>'.
	 * @see org.eclipse.b3.aggregator.p2.ArtifactKey
	 * @generated
	 */
	EClass getArtifactKey();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.query.Collector <em>Collector</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Collector</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.query.Collector
	 * @model instanceClass="org.eclipse.equinox.internal.provisional.p2.metadata.query.Collector" serializeable="false"
	 * @generated
	 */
	EDataType getCollector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Copyright</em>'.
	 * @see org.eclipse.b3.aggregator.p2.Copyright
	 * @generated
	 */
	EClass getCopyright();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Filter</em>'.
	 * @see org.osgi.framework.Filter
	 * @model instanceClass="org.osgi.framework.Filter"
	 * @generated
	 */
	EDataType getFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IAdaptable</em>'.
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @model instanceClass="org.eclipse.core.runtime.IAdaptable"
	 * @generated
	 */
	EClass getIAdaptable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IArtifactKey <em>IArtifact Key</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IArtifact Key</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IArtifactKey
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IArtifactKey"
	 * @generated
	 */
	EClass getIArtifactKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IArtifactKey#getClassifier
	 * <em>Classifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IArtifactKey#getClassifier()
	 * @see #getIArtifactKey()
	 * @generated
	 */
	EAttribute getIArtifactKey_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IArtifactKey#getId <em>Id</em>}
	 * '.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IArtifactKey#getId()
	 * @see #getIArtifactKey()
	 * @generated
	 */
	EAttribute getIArtifactKey_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IArtifactKey#getVersion <em>Version</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IArtifactKey#getVersion()
	 * @see #getIArtifactKey()
	 * @generated
	 */
	EAttribute getIArtifactKey_Version();

	/**
	 * Returns the meta object for data type '<em>IArtifact Key Array</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>IArtifact Key Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.internal.provisional.p2.metadata.IArtifactKey[]"
	 * @generated
	 */
	EDataType getIArtifactKeyArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.ICopyright <em>ICopyright</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ICopyright</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ICopyright
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ICopyright"
	 * @generated
	 */
	EClass getICopyright();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ICopyright#getBody <em>Body</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ICopyright#getBody()
	 * @see #getICopyright()
	 * @generated
	 */
	EAttribute getICopyright_Body();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ICopyright#getLocation <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ICopyright#getLocation()
	 * @see #getICopyright()
	 * @generated
	 */
	EAttribute getICopyright_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IInstallableUnit
	 * <em>IInstallable Unit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IInstallable Unit</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IInstallableUnit"
	 *        superTypes="org.eclipse.b3.aggregator.p2.IVersionedId"
	 * @generated
	 */
	EClass getIInstallableUnit();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getArtifacts()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_Artifacts();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getCopyright()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_Copyright();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit#getFilter <em>Filter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit#getFilter()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EAttribute getIInstallableUnit_Filter();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getFragments()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_Fragments();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Licenses</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getLicenses()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_Licenses();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getMetaRequirements <em>Meta Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Meta Requirements</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getMetaRequirements()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_MetaRequirements();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getProvidedCapabilities()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_ProvidedCapabilities();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getRequirements()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_Requirements();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit#isResolved <em>Resolved</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit#isResolved()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EAttribute getIInstallableUnit_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IInstallableUnit#isSingleton
	 * <em>Singleton</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#isSingleton()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EAttribute getIInstallableUnit_Singleton();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getTouchpointData <em>Touchpoint Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Touchpoint Data</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getTouchpointData()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_TouchpointData();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getTouchpointType <em>Touchpoint Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Touchpoint Type</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getTouchpointType()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_TouchpointType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.equinox.p2.metadata.IInstallableUnit#getUpdateDescriptor <em>Update Descriptor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Update Descriptor</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit#getUpdateDescriptor()
	 * @see #getIInstallableUnit()
	 * @generated
	 */
	EReference getIInstallableUnit_UpdateDescriptor();

	/**
	 * Returns the meta object for data type '<em>IInstallable Unit Array</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IInstallable Unit Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IInstallableUnit[]"
	 * @generated
	 */
	EDataType getIInstallableUnitArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
	 * <em>IInstallable Unit Fragment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IInstallable Unit Fragment</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnitFragment
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IInstallableUnitFragment"
	 *        superTypes="org.eclipse.b3.aggregator.p2.IInstallableUnit"
	 * @generated
	 */
	EClass getIInstallableUnitFragment();

	/**
	 * Returns the meta object for data type '<em>IInstallable Unit Fragment Array</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IInstallable Unit Fragment Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IInstallableUnitFragment[]"
	 * @generated
	 */
	EDataType getIInstallableUnitFragmentArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.ILicense <em>ILicense</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ILicense</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ILicense
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ILicense"
	 * @generated
	 */
	EClass getILicense();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.ILicense#getBody <em>Body</em>}
	 * '.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ILicense#getBody()
	 * @see #getILicense()
	 * @generated
	 */
	EAttribute getILicense_Body();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ILicense#getLocation <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ILicense#getLocation()
	 * @see #getILicense()
	 * @generated
	 */
	EAttribute getILicense_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.ILicense#getUUID <em>UUID</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ILicense#getUUID()
	 * @see #getILicense()
	 * @generated
	 */
	EAttribute getILicense_UUID();

	/**
	 * Returns the meta object for data type '<em>ILicense Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>ILicense Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ILicense[]"
	 * @generated
	 */
	EDataType getILicenseArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.expression.IMatchExpression
	 * <em>IMatch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IMatch Expression</em>'.
	 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.expression.IMatchExpression" typeParameters="T"
	 * @generated
	 */
	EDataType getIMatchExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
	 * <em>IMetadata Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IMetadata Repository</em>'.
	 * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
	 * @model instanceClass="org.eclipse.equinox.p2.repository.metadata.IMetadataRepository"
	 *        superTypes="org.eclipse.b3.aggregator.p2.IRepository<org.eclipse.b3.aggregator.p2.IInstallableUnit>"
	 * @generated
	 */
	EClass getIMetadataRepository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.InstallableUnit <em>Installable Unit</em>}
	 * '.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Installable Unit</em>'.
	 * @see org.eclipse.b3.aggregator.p2.InstallableUnit
	 * @generated
	 */
	EClass getInstallableUnit();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.b3.aggregator.p2.InstallableUnit#getPropertyMap
	 * <em>Property Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Property Map</em>'.
	 * @see org.eclipse.b3.aggregator.p2.InstallableUnit#getPropertyMap()
	 * @see #getInstallableUnit()
	 * @generated
	 */
	EReference getInstallableUnit_PropertyMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.InstallableUnitFragment
	 * <em>Installable Unit Fragment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Installable Unit Fragment</em>'.
	 * @see org.eclipse.b3.aggregator.p2.InstallableUnitFragment
	 * @generated
	 */
	EClass getInstallableUnitFragment();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.b3.aggregator.p2.InstallableUnitFragment#getHostList <em>Host List</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Host List</em>'.
	 * @see org.eclipse.b3.aggregator.p2.InstallableUnitFragment#getHostList()
	 * @see #getInstallableUnitFragment()
	 * @generated
	 */
	EReference getInstallableUnitFragment_HostList();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Instruction Map</em>}'.
	 * <!-- begin-user-doc -->
	 * ======= Returns the meta object for class '{@link java.util.Map.Entry <em>Instruction Map</em>}'. <!--
	 * begin-user-doc --> >>>>>>> .r10620 <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instruction Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.eclipse.b3.aggregator.p2.ITouchpointInstruction" valueContainment="true"
	 *        valueResolveProxies="true"
	 * @generated
	 */
	EClass getInstructionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getInstructionMap()
	 * @generated
	 */
	EAttribute getInstructionMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getInstructionMap()
	 * @generated
	 */
	EReference getInstructionMap_Value();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor
	 * <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor" serializeable="false"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IProvidedCapability
	 * <em>IProvided Capability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IProvided Capability</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IProvidedCapability
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IProvidedCapability"
	 * @generated
	 */
	EClass getIProvidedCapability();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IProvidedCapability#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IProvidedCapability#getName()
	 * @see #getIProvidedCapability()
	 * @generated
	 */
	EAttribute getIProvidedCapability_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.p2.metadata.IProvidedCapability#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IProvidedCapability#getNamespace()
	 * @see #getIProvidedCapability()
	 * @generated
	 */
	EAttribute getIProvidedCapability_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IProvidedCapability#getVersion
	 * <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IProvidedCapability#getVersion()
	 * @see #getIProvidedCapability()
	 * @generated
	 */
	EAttribute getIProvidedCapability_Version();

	/**
	 * Returns the meta object for data type '<em>IProvided Capability Array</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IProvided Capability Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IProvidedCapability[]"
	 * @generated
	 */
	EDataType getIProvidedCapabilityArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.core.IProvisioningAgent
	 * <em>IProvisioning Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IProvisioning Agent</em>'.
	 * @see org.eclipse.equinox.p2.core.IProvisioningAgent
	 * @model instanceClass="org.eclipse.equinox.p2.core.IProvisioningAgent"
	 * @generated
	 */
	EDataType getIProvisioningAgent();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.query.IQuery <em>IQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IQuery</em>'.
	 * @see org.eclipse.equinox.p2.query.IQuery
	 * @model instanceClass="org.eclipse.equinox.p2.query.IQuery" serializeable="false" typeParameters="T"
	 * @generated
	 */
	EDataType getIQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.query.IQueryable <em>IQueryable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IQueryable</em>'.
	 * @see org.eclipse.equinox.p2.query.IQueryable
	 * @model instanceClass="org.eclipse.equinox.p2.query.IQueryable" typeParameters="T"
	 * @generated
	 */
	EClass getIQueryable();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.query.IQueryResult <em>IQuery Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IQuery Result</em>'.
	 * @see org.eclipse.equinox.p2.query.IQueryResult
	 * @model instanceClass="org.eclipse.equinox.p2.query.IQueryResult" typeParameters="T"
	 * @generated
	 */
	EDataType getIQueryResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.IRepository <em>IRepository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRepository</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository
	 * @model instanceClass="org.eclipse.equinox.p2.repository.IRepository" typeParameters="T"
	 *        superTypes="org.eclipse.b3.aggregator.p2.IAdaptable org.eclipse.b3.aggregator.p2.IQueryable<T>"
	 * @generated
	 */
	EClass getIRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.repository.IRepository#getDescription
	 * <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getDescription()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Description();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.equinox.p2.repository.IRepository#getLocation
	 * <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getLocation()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.repository.IRepository#isModifiable
	 * <em>Modifiable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Modifiable</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#isModifiable()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Modifiable();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.equinox.p2.repository.IRepository#getName
	 * <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getName()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Name();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.equinox.p2.repository.IRepository#getProvider
	 * <em>Provider</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getProvider()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Provider();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.equinox.p2.repository.IRepository#getType
	 * <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getType()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Type();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.equinox.p2.repository.IRepository#getVersion
	 * <em>Version</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.repository.IRepository#getVersion()
	 * @see #getIRepository()
	 * @generated
	 */
	EAttribute getIRepository_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
	 * <em>IRequired Capability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRequired Capability</em>'.
	 * @see org.eclipse.equinox.internal.p2.metadata.IRequiredCapability
	 * @model instanceClass="org.eclipse.equinox.internal.p2.metadata.IRequiredCapability"
	 *        superTypes="org.eclipse.b3.aggregator.p2.IRequirement"
	 * @generated
	 */
	EClass getIRequiredCapability();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IRequiredCapability#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IRequiredCapability#getName()
	 * @see #getIRequiredCapability()
	 * @generated
	 */
	EAttribute getIRequiredCapability_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.p2.metadata.IRequiredCapability#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.equinox.internal.p2.metadata.IRequiredCapability#getNamespace()
	 * @see #getIRequiredCapability()
	 * @generated
	 */
	EAttribute getIRequiredCapability_Namespace();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IRequiredCapability#getRange <em>Range</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IRequiredCapability#getRange()
	 * @see #getIRequiredCapability()
	 * @generated
	 */
	EAttribute getIRequiredCapability_Range();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IRequirement <em>IRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRequirement</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IRequirement"
	 * @generated
	 */
	EClass getIRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IRequirement#getFilter
	 * <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement#getFilter()
	 * @see #getIRequirement()
	 * @generated
	 */
	EAttribute getIRequirement_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IRequirement#isGreedy
	 * <em>Greedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Greedy</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement#isGreedy()
	 * @see #getIRequirement()
	 * @generated
	 */
	EAttribute getIRequirement_Greedy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IRequirement#getMatches
	 * <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Matches</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement#getMatches()
	 * @see #getIRequirement()
	 * @generated
	 */
	EAttribute getIRequirement_Matches();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IRequirement#getMax
	 * <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement#getMax()
	 * @see #getIRequirement()
	 * @generated
	 */
	EAttribute getIRequirement_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IRequirement#getMin
	 * <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IRequirement#getMin()
	 * @see #getIRequirement()
	 * @generated
	 */
	EAttribute getIRequirement_Min();

	/**
	 * Returns the meta object for data type '<em>IRequirement Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IRequirement Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IRequirement[]"
	 * @generated
	 */
	EDataType getIRequirementArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.ITouchpointData
	 * <em>ITouchpoint Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ITouchpoint Data</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointData
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ITouchpointData"
	 * @generated
	 */
	EClass getITouchpointData();

	/**
	 * Returns the meta object for data type '<em>ITouchpoint Data Array</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>ITouchpoint Data Array</em>'.
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ITouchpointData[]"
	 * @generated
	 */
	EDataType getITouchpointDataArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.ITouchpointInstruction
	 * <em>ITouchpoint Instruction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ITouchpoint Instruction</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointInstruction
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ITouchpointInstruction"
	 * @generated
	 */
	EClass getITouchpointInstruction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointInstruction#getBody <em>Body</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointInstruction#getBody()
	 * @see #getITouchpointInstruction()
	 * @generated
	 */
	EAttribute getITouchpointInstruction_Body();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.p2.metadata.ITouchpointInstruction#getImportAttribute <em>Import Attribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Import Attribute</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointInstruction#getImportAttribute()
	 * @see #getITouchpointInstruction()
	 * @generated
	 */
	EAttribute getITouchpointInstruction_ImportAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.ITouchpointType
	 * <em>ITouchpoint Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ITouchpoint Type</em>'.
	 * @see org.eclipse.equinox.p2.metadata.ITouchpointType
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.ITouchpointType"
	 * @generated
	 */
	EClass getITouchpointType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointType#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointType#getId()
	 * @see #getITouchpointType()
	 * @generated
	 */
	EAttribute getITouchpointType_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointType#getVersion <em>Version</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.ITouchpointType#getVersion()
	 * @see #getITouchpointType()
	 * @generated
	 */
	EAttribute getITouchpointType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IUpdateDescriptor
	 * <em>IUpdate Descriptor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IUpdate Descriptor</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IUpdateDescriptor
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IUpdateDescriptor"
	 * @generated
	 */
	EClass getIUpdateDescriptor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.p2.metadata.IUpdateDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IUpdateDescriptor#getDescription()
	 * @see #getIUpdateDescriptor()
	 * @generated
	 */
	EAttribute getIUpdateDescriptor_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IUpdateDescriptor#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IUpdateDescriptor#getId()
	 * @see #getIUpdateDescriptor()
	 * @generated
	 */
	EAttribute getIUpdateDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.equinox.internal.provisional.p2.metadata.IUpdateDescriptor#getRange <em>Range</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.metadata.IUpdateDescriptor#getRange()
	 * @see #getIUpdateDescriptor()
	 * @generated
	 */
	EAttribute getIUpdateDescriptor_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IUpdateDescriptor#getSeverity
	 * <em>Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IUpdateDescriptor#getSeverity()
	 * @see #getIUpdateDescriptor()
	 * @generated
	 */
	EAttribute getIUpdateDescriptor_Severity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.equinox.p2.metadata.IVersionedId <em>IVersioned Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IVersioned Id</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IVersionedId
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IVersionedId"
	 * @generated
	 */
	EClass getIVersionedId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IVersionedId#getId <em>Id</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IVersionedId#getId()
	 * @see #getIVersionedId()
	 * @generated
	 */
	EAttribute getIVersionedId_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.equinox.p2.metadata.IVersionedId#getVersion
	 * <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IVersionedId#getVersion()
	 * @see #getIVersionedId()
	 * @generated
	 */
	EAttribute getIVersionedId_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.License <em>License</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>License</em>'.
	 * @see org.eclipse.b3.aggregator.p2.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.MetadataRepository
	 * <em>Metadata Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Metadata Repository</em>'.
	 * @see org.eclipse.b3.aggregator.p2.MetadataRepository
	 * @generated
	 */
	EClass getMetadataRepository();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.b3.aggregator.p2.MetadataRepository#getInstallableUnits <em>Installable Units</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Installable Units</em>'.
	 * @see org.eclipse.b3.aggregator.p2.MetadataRepository#getInstallableUnits()
	 * @see #getMetadataRepository()
	 * @generated
	 */
	EReference getMetadataRepository_InstallableUnits();

	/**
	 * Returns the meta object for the map ' {@link org.eclipse.b3.aggregator.p2.MetadataRepository#getPropertyMap
	 * <em>Property Map</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Property Map</em>'.
	 * @see org.eclipse.b3.aggregator.p2.MetadataRepository#getPropertyMap()
	 * @see #getMetadataRepository()
	 * @generated
	 */
	EReference getMetadataRepository_PropertyMap();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.b3.aggregator.p2.MetadataRepository#getRepositoryReferences <em>Repository References</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Repository References</em>'.
	 * @see org.eclipse.b3.aggregator.p2.MetadataRepository#getRepositoryReferences()
	 * @see #getMetadataRepository()
	 * @generated
	 */
	EReference getMetadataRepository_RepositoryReferences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	P2Factory getP2Factory();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Property</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Property</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.ProvidedCapability
	 * <em>Provided Capability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Provided Capability</em>'.
	 * @see org.eclipse.b3.aggregator.p2.ProvidedCapability
	 * @generated
	 */
	EClass getProvidedCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.RepositoryReference
	 * <em>Repository Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repository Reference</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RepositoryReference
	 * @generated
	 */
	EClass getRepositoryReference();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.b3.aggregator.p2.RepositoryReference#getLocation
	 * <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RepositoryReference#getLocation()
	 * @see #getRepositoryReference()
	 * @generated
	 */
	EAttribute getRepositoryReference_Location();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.b3.aggregator.p2.RepositoryReference#getNickname
	 * <em>Nickname</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RepositoryReference#getNickname()
	 * @see #getRepositoryReference()
	 * @generated
	 */
	EAttribute getRepositoryReference_Nickname();

	/**
	 * Returns the meta object for the attribute ' {@link org.eclipse.b3.aggregator.p2.RepositoryReference#getOptions
	 * <em>Options</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RepositoryReference#getOptions()
	 * @see #getRepositoryReference()
	 * @generated
	 */
	EAttribute getRepositoryReference_Options();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.aggregator.p2.RepositoryReference#getType
	 * <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RepositoryReference#getType()
	 * @see #getRepositoryReference()
	 * @generated
	 */
	EAttribute getRepositoryReference_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.RequiredCapability
	 * <em>Required Capability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.aggregator.p2.RequiredCapability
	 * @generated
	 */
	EClass getRequiredCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.b3.aggregator.p2.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.TouchpointData <em>Touchpoint Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Touchpoint Data</em>'.
	 * @see org.eclipse.b3.aggregator.p2.TouchpointData
	 * @generated
	 */
	EClass getTouchpointData();

	/**
	 * Returns the meta object for the map ' {@link org.eclipse.b3.aggregator.p2.TouchpointData#getInstructionMap
	 * <em>Instruction Map</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>Instruction Map</em>'.
	 * @see org.eclipse.b3.aggregator.p2.TouchpointData#getInstructionMap()
	 * @see #getTouchpointData()
	 * @generated
	 */
	EReference getTouchpointData_InstructionMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.TouchpointInstruction
	 * <em>Touchpoint Instruction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Touchpoint Instruction</em>'.
	 * @see org.eclipse.b3.aggregator.p2.TouchpointInstruction
	 * @generated
	 */
	EClass getTouchpointInstruction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.TouchpointType <em>Touchpoint Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Touchpoint Type</em>'.
	 * @see org.eclipse.b3.aggregator.p2.TouchpointType
	 * @generated
	 */
	EClass getTouchpointType();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Untyped Map</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Untyped Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getUntypedMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.aggregator.p2.UpdateDescriptor
	 * <em>Update Descriptor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Update Descriptor</em>'.
	 * @see org.eclipse.b3.aggregator.p2.UpdateDescriptor
	 * @generated
	 */
	EClass getUpdateDescriptor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.Version <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.VersionRange
	 * <em>Version Range</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Version Range</em>'.
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.VersionRange"
	 * @generated
	 */
	EDataType getVersionRange();

} // P2Package
