/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.net.URI;
import org.eclipse.b3.build.build.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.equinox.internal.provisional.p2.core.Version;
import org.eclipse.equinox.internal.provisional.p2.core.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BuildFactoryImpl extends EFactoryImpl implements B3BuildFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static B3BuildFactory init() {
		try {
			B3BuildFactory theB3BuildFactory = (B3BuildFactory)EPackage.Registry.INSTANCE.getEFactory("http://b3build/1.0"); 
			if (theB3BuildFactory != null) {
				return theB3BuildFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new B3BuildFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case B3BuildPackage.BUILD_UNIT: return createBuildUnit();
			case B3BuildPackage.BUILDER: return createBuilder();
			case B3BuildPackage.VERSIONED_CAPABILITY: return createVersionedCapability();
			case B3BuildPackage.BUILDER_INPUT: return createBuilderInput();
			case B3BuildPackage.PATH_GROUP: return createPathGroup();
			case B3BuildPackage.PREREQUISITE: return createPrerequisite();
			case B3BuildPackage.BUILD_RESULT_REFERENCE: return createBuildResultReference();
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE: return createCompoundBuildResultReference();
			case B3BuildPackage.BUILDER_REFERENCE: return createBuilderReference();
			case B3BuildPackage.CAPABILITY: return createCapability();
			case B3BuildPackage.REQUIRED_CAPABILITY: return createRequiredCapability();
			case B3BuildPackage.PATH_VECTOR: return createPathVector();
			case B3BuildPackage.COMPOUND_PATH_VECTOR: return createCompoundPathVector();
			case B3BuildPackage.PATH_VECTOR_ELEMENT: return createPathVectorElement();
			case B3BuildPackage.SYNCHRONIZATION: return createSynchronization();
			case B3BuildPackage.SYNCHRONIZED_BUILDER: return createSynchronizedBuilder();
			case B3BuildPackage.REPOSITORY_CONFIGURATION: return createRepositoryConfiguration();
			case B3BuildPackage.REPOSITORY_DECLARATION: return createRepositoryDeclaration();
			case B3BuildPackage.RESOLUTION_STRATEGY_FIRST: return createResolutionStrategyFirst();
			case B3BuildPackage.RESOLUTION_STRATEGY_BEST: return createResolutionStrategyBest();
			case B3BuildPackage.CONTAINER_CONFIGURATION: return createContainerConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case B3BuildPackage.VERSION_RANGE:
				return createVersionRangeFromString(eDataType, initialValue);
			case B3BuildPackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			case B3BuildPackage.URI:
				return createURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case B3BuildPackage.VERSION_RANGE:
				return convertVersionRangeToString(eDataType, instanceValue);
			case B3BuildPackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			case B3BuildPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit createBuildUnit() {
		BuildUnitImpl buildUnit = new BuildUnitImpl();
		return buildUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Builder createBuilder() {
		BuilderImpl builder = new BuilderImpl();
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedCapability createVersionedCapability() {
		VersionedCapabilityImpl versionedCapability = new VersionedCapabilityImpl();
		return versionedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVector createPathVector() {
		PathVectorImpl pathVector = new PathVectorImpl();
		return pathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundPathVector createCompoundPathVector() {
		CompoundPathVectorImpl compoundPathVector = new CompoundPathVectorImpl();
		return compoundPathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVectorElement createPathVectorElement() {
		PathVectorElementImpl pathVectorElement = new PathVectorElementImpl();
		return pathVectorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedBuilder createSynchronizedBuilder() {
		SynchronizedBuilderImpl synchronizedBuilder = new SynchronizedBuilderImpl();
		return synchronizedBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryConfiguration createRepositoryConfiguration() {
		RepositoryConfigurationImpl repositoryConfiguration = new RepositoryConfigurationImpl();
		return repositoryConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDeclaration createRepositoryDeclaration() {
		RepositoryDeclarationImpl repositoryDeclaration = new RepositoryDeclarationImpl();
		return repositoryDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionStrategyFirst createResolutionStrategyFirst() {
		ResolutionStrategyFirstImpl resolutionStrategyFirst = new ResolutionStrategyFirstImpl();
		return resolutionStrategyFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionStrategyBest createResolutionStrategyBest() {
		ResolutionStrategyBestImpl resolutionStrategyBest = new ResolutionStrategyBestImpl();
		return resolutionStrategyBest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration createContainerConfiguration() {
		ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
		return containerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInput createBuilderInput() {
		BuilderInputImpl builderInput = new BuilderInputImpl();
		return builderInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathGroup createPathGroup() {
		PathGroupImpl pathGroup = new PathGroupImpl();
		return pathGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prerequisite createPrerequisite() {
		PrerequisiteImpl prerequisite = new PrerequisiteImpl();
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildResultReference createBuildResultReference() {
		BuildResultReferenceImpl buildResultReference = new BuildResultReferenceImpl();
		return buildResultReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundBuildResultReference createCompoundBuildResultReference() {
		CompoundBuildResultReferenceImpl compoundBuildResultReference = new CompoundBuildResultReferenceImpl();
		return compoundBuildResultReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderReference createBuilderReference() {
		BuilderReferenceImpl builderReference = new BuilderReferenceImpl();
		return builderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionRange createVersionRangeFromString(EDataType eDataType, String initialValue) {
		return (VersionRange)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionRangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildPackage getB3BuildPackage() {
		return (B3BuildPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static B3BuildPackage getPackage() {
		return B3BuildPackage.eINSTANCE;
	}

} //B3BuildFactoryImpl
