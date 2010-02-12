/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.b3.build.build.AliasedRequiredCapability;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeHive;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildConcernContext;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildResult;
import org.eclipse.b3.build.build.BuildResultReference;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Builder;

import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.BuilderInput;
import org.eclipse.b3.build.build.BuilderJava;
import org.eclipse.b3.build.build.BuilderNamePredicate;
import org.eclipse.b3.build.build.BuilderQuery;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.BuilderWrapper;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.CapabilityPredicate;
import org.eclipse.b3.build.build.CompoundBuildResultReference;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.CompoundPathVector;
import org.eclipse.b3.build.build.ContainerConfiguration;
import org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.build.EffectiveFacade;
import org.eclipse.b3.build.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.build.EffectiveUnitFacade;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.build.ImplementsPredicate;
import org.eclipse.b3.build.build.InputPredicate;
import org.eclipse.b3.build.build.NameSpacePredicate;
import org.eclipse.b3.build.build.OutputPredicate;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.build.PathVectorElement;
import org.eclipse.b3.build.build.Prerequisite;
import org.eclipse.b3.build.build.ProvidesPredicate;
import org.eclipse.b3.build.build.RepositoryConfiguration;
import org.eclipse.b3.build.build.RepositoryDeclaration;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.RequiresPredicate;
import org.eclipse.b3.build.build.ResolutionInfo;
import org.eclipse.b3.build.build.ResolutionStrategy;
import org.eclipse.b3.build.build.ResolutionStrategyBest;
import org.eclipse.b3.build.build.ResolutionStrategyFirst;
import org.eclipse.b3.build.build.Synchronization;
import org.eclipse.b3.build.build.UnitConcernContext;
import org.eclipse.b3.build.build.UnitNamePredicate;
import org.eclipse.b3.build.build.VersionedCapability;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BuildPackageImpl extends EPackageImpl implements B3BuildPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderJavaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beeHiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveUnitFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveRequirementFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveCapabilityFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveBuilderReferenceFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalPathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionStrategyFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionStrategyBestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSpacePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitNamePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderNamePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasedRequiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRequiredCapabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProvidedCapabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundBuildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.b3.build.build.B3BuildPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private B3BuildPackageImpl() {
		super(eNS_URI, B3BuildFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link B3BuildPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static B3BuildPackage init() {
		if (isInited) return (B3BuildPackage)EPackage.Registry.INSTANCE.getEPackage(B3BuildPackage.eNS_URI);

		// Obtain or create and register package
		B3BuildPackageImpl theB3BuildPackage = (B3BuildPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof B3BuildPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new B3BuildPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		B3backendPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theB3BuildPackage.createPackageContents();

		// Initialize created meta-data
		theB3BuildPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theB3BuildPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(B3BuildPackage.eNS_URI, theB3BuildPackage);
		return theB3BuildPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildUnit() {
		return buildUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Builders() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildUnit_Documentation() {
		return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildUnit_ExecutionMode() {
		return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_MetaRequiredCapabilities() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Implements() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Concerns() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_DefaultProperties() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Synchronizations() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Repositories() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Containers() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_PropertySets() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBuilder() {
		return iBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_PostcondExpr() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_PrecondExpr() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_Input() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_Output() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_DefaultProperties() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIBuilder_PostinputcondExpr() {
		return (EReference)iBuilderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIBuilder_UnitType() {
		return (EAttribute)iBuilderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilder() {
		return builderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderJava() {
		return builderJavaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderWrapper() {
		return builderWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderWrapper_InputAdvised() {
		return (EAttribute)builderWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderWrapper_OutputAdvised() {
		return (EAttribute)builderWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderWrapper_UnitTypeAdvised() {
		return (EAttribute)builderWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderWrapper_ProvidesAdvised() {
		return (EAttribute)builderWrapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderWrapper_DefaultPropertiesAdvised() {
		return (EAttribute)builderWrapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeeModel() {
		return beeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeModel_Imports() {
		return (EReference)beeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeModel_Functions() {
		return (EReference)beeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeModel_Concerns() {
		return (EReference)beeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeModel_Body() {
		return (EReference)beeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeModel_PropertySets() {
		return (EReference)beeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeeHive() {
		return beeHiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeHive_BeeModels() {
		return (EReference)beeHiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBeeHive_Parent() {
		return (EReference)beeHiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBeeHive_Resolutions() {
		return (EAttribute)beeHiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionInfo() {
		return resolutionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveFacade() {
		return effectiveFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveFacade_Context() {
		return (EReference)effectiveFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveUnitFacade() {
		return effectiveUnitFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_Unit() {
		return (EReference)effectiveUnitFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_ProvidedCapabilities() {
		return (EReference)effectiveUnitFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_RequiredCapabilities() {
		return (EReference)effectiveUnitFacadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_MetaRequiredCapabilities() {
		return (EReference)effectiveUnitFacadeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveRequirementFacade() {
		return effectiveRequirementFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveRequirementFacade_Requirement() {
		return (EReference)effectiveRequirementFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveCapabilityFacade() {
		return effectiveCapabilityFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveCapabilityFacade_ProvidedCapability() {
		return (EReference)effectiveCapabilityFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveBuilderReferenceFacade() {
		return effectiveBuilderReferenceFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectiveBuilderReferenceFacade_BuilderReference() {
		return (EReference)effectiveBuilderReferenceFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectiveBuilderReferenceFacade_Aliases() {
		return (EAttribute)effectiveBuilderReferenceFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildResult() {
		return buildResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildResult_PathVectors() {
		return (EReference)buildResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildResult_ValueMap() {
		return (EAttribute)buildResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedCapability() {
		return versionedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedCapability_Version() {
		return (EAttribute)versionedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Name() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_NameSpace() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_CondExpr() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredCapability_VersionRange() {
		return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalPathVector() {
		return conditionalPathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalPathVector_CondExpr() {
		return (EReference)conditionalPathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalPathVector_PathVectors() {
		return (EReference)conditionalPathVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathVector() {
		return pathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathVector_BasePath() {
		return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathVector_Paths() {
		return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronization_BuilderQueries() {
		return (EReference)synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryConfiguration() {
		return repositoryConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryDeclaration() {
		return repositoryDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDeclaration_Documentation() {
		return (EAttribute)repositoryDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDeclaration_Location() {
		return (EAttribute)repositoryDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDeclaration_ResolverType() {
		return (EReference)repositoryDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDeclaration_ContextBlock() {
		return (EReference)repositoryDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionStrategy() {
		return resolutionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionStrategy_Repositories() {
		return (EReference)resolutionStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionStrategyFirst() {
		return resolutionStrategyFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionStrategyBest() {
		return resolutionStrategyBestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerConfiguration() {
		return containerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerConfiguration_Documentation() {
		return (EAttribute)containerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerConfiguration_Name() {
		return (EAttribute)containerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerConfiguration_AgentType() {
		return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerConfiguration_ContextBlock() {
		return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildContext() {
		return buildContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildConcernContext() {
		return buildConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildConcernContext_DefaultPropertiesRemovals() {
		return (EAttribute)buildConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildConcernContext_DefaultPropertiesAdditions() {
		return (EReference)buildConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiresPredicate() {
		return requiresPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiresPredicate_CapabilityPredicate() {
		return (EReference)requiresPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiresPredicate_Meta() {
		return (EAttribute)requiresPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityPredicate() {
		return capabilityPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityPredicate_VersionRange() {
		return (EAttribute)capabilityPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityPredicate_NamePredicate() {
		return (EReference)capabilityPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityPredicate_NameSpacePredicate() {
		return (EReference)capabilityPredicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementsPredicate() {
		return implementsPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementsPredicate_Type() {
		return (EReference)implementsPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidesPredicate() {
		return providesPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesPredicate_CapabilityPredicate() {
		return (EReference)providesPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSpacePredicate() {
		return nameSpacePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameSpacePredicate_NameSpace() {
		return (EAttribute)nameSpacePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitNamePredicate() {
		return unitNamePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderNamePredicate() {
		return builderNamePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderNamePredicate_NamePredicate() {
		return (EReference)builderNamePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPredicate() {
		return inputPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPredicate_CapabilityPredicate() {
		return (EReference)inputPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPredicate_BuilderPredicate() {
		return (EReference)inputPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitConcernContext() {
		return unitConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitConcernContext_BuilderContexts() {
		return (EReference)unitConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitConcernContext_Query() {
		return (EReference)unitConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitConcernContext_RequiresRemovals() {
		return (EReference)unitConcernContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitConcernContext_ProvidesRemovals() {
		return (EReference)unitConcernContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderConcernContext() {
		return builderConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_Query() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_InputAdditions() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_InputRemovals() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_OutputAdditions() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_OutputRemovals() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_FuncExpr() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_VarArgs() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_Parameters() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_MatchParameters() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePreCondition() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePostCondition() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePostInputCondition() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_PrecondExpr() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_PostcondExpr() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_PostinputcondExpr() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_ProvidesRemovals() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_AnnotationsRemovals() {
		return (EAttribute)builderConcernContextEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderConcernContext_AnnotationsAdditions() {
		return (EReference)builderConcernContextEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPredicate() {
		return outputPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPredicate_PathVector() {
		return (EReference)outputPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPredicate_PathPattern() {
		return (EReference)outputPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasedRequiredCapability() {
		return aliasedRequiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasedRequiredCapability_Alias() {
		return (EAttribute)aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRequiredCapabilityContainer() {
		return iRequiredCapabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIRequiredCapabilityContainer_RequiredCapabilities() {
		return (EReference)iRequiredCapabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProvidedCapabilityContainer() {
		return iProvidedCapabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIProvidedCapabilityContainer_ProvidedCapabilities() {
		return (EReference)iProvidedCapabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderQuery() {
		return builderQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderQuery_BuilderQueries() {
		return (EReference)builderQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderQuery_UnitQuery() {
		return (EReference)builderQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderInput() {
		return builderInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderInput_Prerequisites() {
		return (EReference)builderInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathGroup() {
		return pathGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_Annotations() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_PathVectors() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrerequisite() {
		return prerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_CondExpr() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_Alias() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_WithExpr() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_BuildResult() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildResultReference() {
		return buildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundBuildResultReference() {
		return compoundBuildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundBuildResultReference_Prerequisites() {
		return (EReference)compoundBuildResultReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderReference() {
		return builderReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderReference_Parameters() {
		return (EReference)builderReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuilderReference_BuilderName() {
		return (EAttribute)builderReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderReference_RequiredCapability() {
		return (EReference)builderReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderReference_RequiredCapabilityReference() {
		return (EReference)builderReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionRange() {
		return versionRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildFactory getB3BuildFactory() {
		return (B3BuildFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buildUnitEClass = createEClass(BUILD_UNIT);
		createEReference(buildUnitEClass, BUILD_UNIT__BUILDERS);
		createEAttribute(buildUnitEClass, BUILD_UNIT__DOCUMENTATION);
		createEAttribute(buildUnitEClass, BUILD_UNIT__EXECUTION_MODE);
		createEReference(buildUnitEClass, BUILD_UNIT__META_REQUIRED_CAPABILITIES);
		createEReference(buildUnitEClass, BUILD_UNIT__IMPLEMENTS);
		createEReference(buildUnitEClass, BUILD_UNIT__CONCERNS);
		createEReference(buildUnitEClass, BUILD_UNIT__DEFAULT_PROPERTIES);
		createEReference(buildUnitEClass, BUILD_UNIT__SYNCHRONIZATIONS);
		createEReference(buildUnitEClass, BUILD_UNIT__REPOSITORIES);
		createEReference(buildUnitEClass, BUILD_UNIT__CONTAINERS);
		createEReference(buildUnitEClass, BUILD_UNIT__PROPERTY_SETS);

		iBuilderEClass = createEClass(IBUILDER);
		createEReference(iBuilderEClass, IBUILDER__POSTCOND_EXPR);
		createEReference(iBuilderEClass, IBUILDER__PRECOND_EXPR);
		createEReference(iBuilderEClass, IBUILDER__INPUT);
		createEReference(iBuilderEClass, IBUILDER__OUTPUT);
		createEReference(iBuilderEClass, IBUILDER__DEFAULT_PROPERTIES);
		createEReference(iBuilderEClass, IBUILDER__POSTINPUTCOND_EXPR);
		createEAttribute(iBuilderEClass, IBUILDER__UNIT_TYPE);

		versionedCapabilityEClass = createEClass(VERSIONED_CAPABILITY);
		createEAttribute(versionedCapabilityEClass, VERSIONED_CAPABILITY__VERSION);

		builderInputEClass = createEClass(BUILDER_INPUT);
		createEReference(builderInputEClass, BUILDER_INPUT__PREREQUISITES);

		pathGroupEClass = createEClass(PATH_GROUP);
		createEReference(pathGroupEClass, PATH_GROUP__ANNOTATIONS);
		createEReference(pathGroupEClass, PATH_GROUP__PATH_VECTORS);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEReference(prerequisiteEClass, PREREQUISITE__COND_EXPR);
		createEAttribute(prerequisiteEClass, PREREQUISITE__ALIAS);
		createEReference(prerequisiteEClass, PREREQUISITE__WITH_EXPR);
		createEReference(prerequisiteEClass, PREREQUISITE__BUILD_RESULT);

		buildResultReferenceEClass = createEClass(BUILD_RESULT_REFERENCE);

		compoundBuildResultReferenceEClass = createEClass(COMPOUND_BUILD_RESULT_REFERENCE);
		createEReference(compoundBuildResultReferenceEClass, COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES);

		builderReferenceEClass = createEClass(BUILDER_REFERENCE);
		createEReference(builderReferenceEClass, BUILDER_REFERENCE__PARAMETERS);
		createEAttribute(builderReferenceEClass, BUILDER_REFERENCE__BUILDER_NAME);
		createEReference(builderReferenceEClass, BUILDER_REFERENCE__REQUIRED_CAPABILITY);
		createEReference(builderReferenceEClass, BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__NAME);
		createEAttribute(capabilityEClass, CAPABILITY__NAME_SPACE);
		createEReference(capabilityEClass, CAPABILITY__COND_EXPR);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__VERSION_RANGE);

		conditionalPathVectorEClass = createEClass(CONDITIONAL_PATH_VECTOR);
		createEReference(conditionalPathVectorEClass, CONDITIONAL_PATH_VECTOR__COND_EXPR);
		createEReference(conditionalPathVectorEClass, CONDITIONAL_PATH_VECTOR__PATH_VECTORS);

		pathVectorEClass = createEClass(PATH_VECTOR);
		createEAttribute(pathVectorEClass, PATH_VECTOR__PATHS);
		createEAttribute(pathVectorEClass, PATH_VECTOR__BASE_PATH);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__BUILDER_QUERIES);

		repositoryConfigurationEClass = createEClass(REPOSITORY_CONFIGURATION);

		repositoryDeclarationEClass = createEClass(REPOSITORY_DECLARATION);
		createEAttribute(repositoryDeclarationEClass, REPOSITORY_DECLARATION__DOCUMENTATION);
		createEAttribute(repositoryDeclarationEClass, REPOSITORY_DECLARATION__LOCATION);
		createEReference(repositoryDeclarationEClass, REPOSITORY_DECLARATION__RESOLVER_TYPE);
		createEReference(repositoryDeclarationEClass, REPOSITORY_DECLARATION__CONTEXT_BLOCK);

		resolutionStrategyEClass = createEClass(RESOLUTION_STRATEGY);
		createEReference(resolutionStrategyEClass, RESOLUTION_STRATEGY__REPOSITORIES);

		resolutionStrategyFirstEClass = createEClass(RESOLUTION_STRATEGY_FIRST);

		resolutionStrategyBestEClass = createEClass(RESOLUTION_STRATEGY_BEST);

		containerConfigurationEClass = createEClass(CONTAINER_CONFIGURATION);
		createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__DOCUMENTATION);
		createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__NAME);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__AGENT_TYPE);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__CONTEXT_BLOCK);

		buildContextEClass = createEClass(BUILD_CONTEXT);

		buildConcernContextEClass = createEClass(BUILD_CONCERN_CONTEXT);
		createEAttribute(buildConcernContextEClass, BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS);
		createEReference(buildConcernContextEClass, BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS);

		requiresPredicateEClass = createEClass(REQUIRES_PREDICATE);
		createEReference(requiresPredicateEClass, REQUIRES_PREDICATE__CAPABILITY_PREDICATE);
		createEAttribute(requiresPredicateEClass, REQUIRES_PREDICATE__META);

		capabilityPredicateEClass = createEClass(CAPABILITY_PREDICATE);
		createEAttribute(capabilityPredicateEClass, CAPABILITY_PREDICATE__VERSION_RANGE);
		createEReference(capabilityPredicateEClass, CAPABILITY_PREDICATE__NAME_PREDICATE);
		createEReference(capabilityPredicateEClass, CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE);

		implementsPredicateEClass = createEClass(IMPLEMENTS_PREDICATE);
		createEReference(implementsPredicateEClass, IMPLEMENTS_PREDICATE__TYPE);

		providesPredicateEClass = createEClass(PROVIDES_PREDICATE);
		createEReference(providesPredicateEClass, PROVIDES_PREDICATE__CAPABILITY_PREDICATE);

		nameSpacePredicateEClass = createEClass(NAME_SPACE_PREDICATE);
		createEAttribute(nameSpacePredicateEClass, NAME_SPACE_PREDICATE__NAME_SPACE);

		unitNamePredicateEClass = createEClass(UNIT_NAME_PREDICATE);

		builderNamePredicateEClass = createEClass(BUILDER_NAME_PREDICATE);
		createEReference(builderNamePredicateEClass, BUILDER_NAME_PREDICATE__NAME_PREDICATE);

		inputPredicateEClass = createEClass(INPUT_PREDICATE);
		createEReference(inputPredicateEClass, INPUT_PREDICATE__CAPABILITY_PREDICATE);
		createEReference(inputPredicateEClass, INPUT_PREDICATE__BUILDER_PREDICATE);

		unitConcernContextEClass = createEClass(UNIT_CONCERN_CONTEXT);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__QUERY);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS);

		builderConcernContextEClass = createEClass(BUILDER_CONCERN_CONTEXT);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__QUERY);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__FUNC_EXPR);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__VAR_ARGS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PARAMETERS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PRECOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__ANNOTATIONS_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__ANNOTATIONS_ADDITIONS);

		outputPredicateEClass = createEClass(OUTPUT_PREDICATE);
		createEReference(outputPredicateEClass, OUTPUT_PREDICATE__PATH_VECTOR);
		createEReference(outputPredicateEClass, OUTPUT_PREDICATE__PATH_PATTERN);

		aliasedRequiredCapabilityEClass = createEClass(ALIASED_REQUIRED_CAPABILITY);
		createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__ALIAS);

		iRequiredCapabilityContainerEClass = createEClass(IREQUIRED_CAPABILITY_CONTAINER);
		createEReference(iRequiredCapabilityContainerEClass, IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES);

		iProvidedCapabilityContainerEClass = createEClass(IPROVIDED_CAPABILITY_CONTAINER);
		createEReference(iProvidedCapabilityContainerEClass, IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES);

		builderQueryEClass = createEClass(BUILDER_QUERY);
		createEReference(builderQueryEClass, BUILDER_QUERY__BUILDER_QUERIES);
		createEReference(builderQueryEClass, BUILDER_QUERY__UNIT_QUERY);

		builderEClass = createEClass(BUILDER);

		builderJavaEClass = createEClass(BUILDER_JAVA);

		builderWrapperEClass = createEClass(BUILDER_WRAPPER);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__INPUT_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__OUTPUT_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__UNIT_TYPE_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__PROVIDES_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED);

		beeModelEClass = createEClass(BEE_MODEL);
		createEReference(beeModelEClass, BEE_MODEL__IMPORTS);
		createEReference(beeModelEClass, BEE_MODEL__FUNCTIONS);
		createEReference(beeModelEClass, BEE_MODEL__CONCERNS);
		createEReference(beeModelEClass, BEE_MODEL__BODY);
		createEReference(beeModelEClass, BEE_MODEL__PROPERTY_SETS);

		beeHiveEClass = createEClass(BEE_HIVE);
		createEReference(beeHiveEClass, BEE_HIVE__BEE_MODELS);
		createEReference(beeHiveEClass, BEE_HIVE__PARENT);
		createEAttribute(beeHiveEClass, BEE_HIVE__RESOLUTIONS);

		resolutionInfoEClass = createEClass(RESOLUTION_INFO);

		effectiveFacadeEClass = createEClass(EFFECTIVE_FACADE);
		createEReference(effectiveFacadeEClass, EFFECTIVE_FACADE__CONTEXT);

		effectiveUnitFacadeEClass = createEClass(EFFECTIVE_UNIT_FACADE);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__UNIT);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES);

		effectiveRequirementFacadeEClass = createEClass(EFFECTIVE_REQUIREMENT_FACADE);
		createEReference(effectiveRequirementFacadeEClass, EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT);

		effectiveCapabilityFacadeEClass = createEClass(EFFECTIVE_CAPABILITY_FACADE);
		createEReference(effectiveCapabilityFacadeEClass, EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY);

		effectiveBuilderReferenceFacadeEClass = createEClass(EFFECTIVE_BUILDER_REFERENCE_FACADE);
		createEReference(effectiveBuilderReferenceFacadeEClass, EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE);
		createEAttribute(effectiveBuilderReferenceFacadeEClass, EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES);

		buildResultEClass = createEClass(BUILD_RESULT);
		createEReference(buildResultEClass, BUILD_RESULT__PATH_VECTORS);
		createEAttribute(buildResultEClass, BUILD_RESULT__VALUE_MAP);

		// Create data types
		versionRangeEDataType = createEDataType(VERSION_RANGE);
		versionEDataType = createEDataType(VERSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		B3backendPackage theB3backendPackage = (B3backendPackage)EPackage.Registry.INSTANCE.getEPackage(B3backendPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buildUnitEClass.getESuperTypes().add(this.getVersionedCapability());
		buildUnitEClass.getESuperTypes().add(theB3backendPackage.getBFunctionContainer());
		buildUnitEClass.getESuperTypes().add(this.getIRequiredCapabilityContainer());
		buildUnitEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		iBuilderEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		iBuilderEClass.getESuperTypes().add(theB3backendPackage.getIFunction());
		versionedCapabilityEClass.getESuperTypes().add(this.getCapability());
		compoundBuildResultReferenceEClass.getESuperTypes().add(this.getBuildResultReference());
		builderReferenceEClass.getESuperTypes().add(this.getBuildResultReference());
		requiredCapabilityEClass.getESuperTypes().add(this.getCapability());
		repositoryDeclarationEClass.getESuperTypes().add(this.getRepositoryConfiguration());
		resolutionStrategyEClass.getESuperTypes().add(this.getRepositoryConfiguration());
		resolutionStrategyFirstEClass.getESuperTypes().add(this.getResolutionStrategy());
		resolutionStrategyBestEClass.getESuperTypes().add(this.getResolutionStrategy());
		buildContextEClass.getESuperTypes().add(theB3backendPackage.getBExecutionContext());
		buildConcernContextEClass.getESuperTypes().add(theB3backendPackage.getBConcernContext());
		buildConcernContextEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		requiresPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		capabilityPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		implementsPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		providesPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		unitNamePredicateEClass.getESuperTypes().add(this.getCapabilityPredicate());
		builderNamePredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		inputPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		unitConcernContextEClass.getESuperTypes().add(this.getBuildConcernContext());
		unitConcernContextEClass.getESuperTypes().add(this.getIRequiredCapabilityContainer());
		builderConcernContextEClass.getESuperTypes().add(this.getBuildConcernContext());
		outputPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		aliasedRequiredCapabilityEClass.getESuperTypes().add(this.getRequiredCapability());
		builderEClass.getESuperTypes().add(theB3backendPackage.getB3Function());
		builderEClass.getESuperTypes().add(this.getIBuilder());
		builderJavaEClass.getESuperTypes().add(theB3backendPackage.getBJavaFunction());
		builderJavaEClass.getESuperTypes().add(this.getIBuilder());
		builderWrapperEClass.getESuperTypes().add(theB3backendPackage.getBFunctionWrapper());
		builderWrapperEClass.getESuperTypes().add(this.getIBuilder());
		effectiveUnitFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		effectiveRequirementFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		effectiveCapabilityFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		effectiveBuilderReferenceFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());

		// Initialize classes and features; add operations and parameters
		initEClass(buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildUnit_Builders(), this.getIBuilder(), null, "builders", null, 0, -1, BuildUnit.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildUnit_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildUnit_ExecutionMode(), theB3backendPackage.getExecutionMode(), "executionMode", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_MetaRequiredCapabilities(), this.getRequiredCapability(), null, "metaRequiredCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Implements(), theB3backendPackage.getIType(), null, "implements", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Concerns(), theB3backendPackage.getBConcern(), null, "concerns", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Repositories(), this.getRepositoryConfiguration(), null, "repositories", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Containers(), this.getContainerConfiguration(), null, "containers", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(buildUnitEClass, this.getEffectiveUnitFacade(), "getEffectiveFacade", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		initEClass(iBuilderEClass, IBuilder.class, "IBuilder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIBuilder_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIBuilder_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIBuilder_Input(), this.getBuilderInput(), null, "input", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIBuilder_Output(), this.getPathGroup(), null, "output", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIBuilder_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIBuilder_PostinputcondExpr(), theB3backendPackage.getBExpression(), null, "postinputcondExpr", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getBuildUnit());
		g2.setEUpperBound(g3);
		initEAttribute(getIBuilder_UnitType(), g1, "unitType", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(iBuilderEClass, null, "getEffectiveRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveRequirementFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iBuilderEClass, null, "getEffectiveCapabilities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveCapabilityFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iBuilderEClass, null, "getEffectiveBuilderReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveBuilderReferenceFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(versionedCapabilityEClass, VersionedCapability.class, "VersionedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedCapability_Version(), this.getVersion(), "version", null, 0, 1, VersionedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderInputEClass, BuilderInput.class, "BuilderInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderInput_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(builderInputEClass, null, "getEffectiveRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveRequirementFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(builderInputEClass, this.getBuilderReference(), "getBuilderReferences", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(builderInputEClass, null, "getEffectiveBuilderReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveBuilderReferenceFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pathGroupEClass, PathGroup.class, "PathGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathGroup_Annotations(), theB3backendPackage.getBPropertySet(), null, "annotations", null, 0, 1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathGroup_PathVectors(), this.getConditionalPathVector(), null, "pathVectors", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisite_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_WithExpr(), theB3backendPackage.getBWithExpression(), null, "withExpr", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_BuildResult(), this.getBuildResultReference(), null, "buildResult", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(prerequisiteEClass, null, "getEffectiveRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveRequirementFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(prerequisiteEClass, this.getBuilderReference(), "getBuilderReferences", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(prerequisiteEClass, null, "getEffectiveBuilderReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveBuilderReferenceFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(buildResultReferenceEClass, BuildResultReference.class, "BuildResultReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(buildResultReferenceEClass, null, "getEffectiveRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveRequirementFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(buildResultReferenceEClass, this.getRequiredCapability(), "getRequirements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(buildResultReferenceEClass, this.getBuilderReference(), "getBuilderReferences", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(buildResultReferenceEClass, null, "getEffectiveBuilderReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());
		g1 = createEGenericType(theB3backendPackage.getJavaIterator());
		g2 = createEGenericType(this.getEffectiveBuilderReferenceFacade());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(compoundBuildResultReferenceEClass, CompoundBuildResultReference.class, "CompoundBuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundBuildResultReference_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, CompoundBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderReferenceEClass, BuilderReference.class, "BuilderReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderReference_Parameters(), theB3backendPackage.getBParameterList(), null, "parameters", null, 0, 1, BuilderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderReference_BuilderName(), ecorePackage.getEString(), "builderName", null, 0, 1, BuilderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderReference_RequiredCapability(), this.getRequiredCapability(), null, "requiredCapability", null, 0, 1, BuilderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderReference_RequiredCapabilityReference(), this.getAliasedRequiredCapability(), null, "requiredCapabilityReference", null, 0, 1, BuilderReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredCapability_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalPathVectorEClass, ConditionalPathVector.class, "ConditionalPathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalPathVector_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, ConditionalPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalPathVector_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, -1, ConditionalPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathVectorEClass, PathVector.class, "PathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathVector_Paths(), ecorePackage.getEString(), "paths", null, 0, -1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathVector_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronization_BuilderQueries(), this.getBuilderQuery(), null, "builderQueries", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryConfigurationEClass, RepositoryConfiguration.class, "RepositoryConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryDeclarationEClass, RepositoryDeclaration.class, "RepositoryDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryDeclaration_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryDeclaration_Location(), theB3backendPackage.getURI(), "location", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositoryDeclaration_ResolverType(), theB3backendPackage.getIType(), null, "resolverType", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositoryDeclaration_ContextBlock(), theB3backendPackage.getBExpression(), null, "contextBlock", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionStrategyEClass, ResolutionStrategy.class, "ResolutionStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolutionStrategy_Repositories(), this.getRepositoryConfiguration(), null, "repositories", null, 0, -1, ResolutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionStrategyFirstEClass, ResolutionStrategyFirst.class, "ResolutionStrategyFirst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resolutionStrategyBestEClass, ResolutionStrategyBest.class, "ResolutionStrategyBest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerConfigurationEClass, ContainerConfiguration.class, "ContainerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerConfiguration_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerConfiguration_AgentType(), theB3backendPackage.getIType(), null, "agentType", null, 1, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerConfiguration_ContextBlock(), theB3backendPackage.getBExpression(), null, "contextBlock", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildContextEClass, BuildContext.class, "BuildContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(buildContextEClass, null, "defineBuildUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuildUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isWeaving", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getB3EngineException());

		op = addEOperation(buildContextEClass, this.getBuildContext(), "defineBeeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBeeModel(), "beeModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getB3EngineException());

		op = addEOperation(buildContextEClass, this.getBuildUnit(), "getEffectiveBuildUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuildUnit(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buildConcernContextEClass, BuildConcernContext.class, "BuildConcernContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildConcernContext_DefaultPropertiesRemovals(), ecorePackage.getEString(), "defaultPropertiesRemovals", null, 0, -1, BuildConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildConcernContext_DefaultPropertiesAdditions(), theB3backendPackage.getBPropertySet(), null, "defaultPropertiesAdditions", null, 0, 1, BuildConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiresPredicateEClass, RequiresPredicate.class, "RequiresPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiresPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate", null, 1, 1, RequiresPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiresPredicate_Meta(), ecorePackage.getEBoolean(), "meta", null, 0, 1, RequiresPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(requiresPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(capabilityPredicateEClass, CapabilityPredicate.class, "CapabilityPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapabilityPredicate_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1, CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityPredicate_NamePredicate(), theB3backendPackage.getBNamePredicate(), null, "namePredicate", null, 0, 1, CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityPredicate_NameSpacePredicate(), theB3backendPackage.getBNamePredicate(), null, "nameSpacePredicate", null, 0, 1, CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementsPredicateEClass, ImplementsPredicate.class, "ImplementsPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementsPredicate_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, ImplementsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providesPredicateEClass, ProvidesPredicate.class, "ProvidesPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidesPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate", null, 0, 1, ProvidesPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(providesPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(providesPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(providesPredicateEClass, ecorePackage.getEBoolean(), "removeMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getCapability());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameSpacePredicateEClass, NameSpacePredicate.class, "NameSpacePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameSpacePredicate_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, NameSpacePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitNamePredicateEClass, UnitNamePredicate.class, "UnitNamePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builderNamePredicateEClass, BuilderNamePredicate.class, "BuilderNamePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderNamePredicate_NamePredicate(), theB3backendPackage.getBNamePredicate(), null, "namePredicate", null, 0, 1, BuilderNamePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPredicateEClass, InputPredicate.class, "InputPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate", null, 0, 1, InputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPredicate_BuilderPredicate(), theB3backendPackage.getBNamePredicate(), null, "builderPredicate", null, 1, 1, InputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(inputPredicateEClass, ecorePackage.getEBoolean(), "removeMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuilderInput(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitConcernContextEClass, UnitConcernContext.class, "UnitConcernContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitConcernContext_BuilderContexts(), this.getBuilderConcernContext(), null, "builderContexts", null, 0, -1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitConcernContext_Query(), theB3backendPackage.getBExpression(), null, "query", null, 0, 1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitConcernContext_RequiresRemovals(), this.getRequiresPredicate(), null, "requiresRemovals", null, 0, -1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitConcernContext_ProvidesRemovals(), this.getProvidesPredicate(), null, "providesRemovals", null, 0, -1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderConcernContextEClass, BuilderConcernContext.class, "BuilderConcernContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderConcernContext_Query(), theB3backendPackage.getBExpression(), null, "query", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_InputAdditions(), this.getPrerequisite(), null, "inputAdditions", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_InputRemovals(), this.getInputPredicate(), null, "inputRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_OutputAdditions(), this.getConditionalPathVector(), null, "outputAdditions", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_OutputRemovals(), this.getOutputPredicate(), null, "outputRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_FuncExpr(), theB3backendPackage.getBExpression(), null, "funcExpr", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_Parameters(), theB3backendPackage.getBParameterPredicate(), null, "parameters", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_MatchParameters(), ecorePackage.getEBoolean(), "matchParameters", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_RemovePreCondition(), ecorePackage.getEBoolean(), "removePreCondition", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_RemovePostCondition(), ecorePackage.getEBoolean(), "removePostCondition", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_RemovePostInputCondition(), ecorePackage.getEBoolean(), "removePostInputCondition", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_PostinputcondExpr(), theB3backendPackage.getBExpression(), null, "postinputcondExpr", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_ProvidesRemovals(), this.getProvidesPredicate(), null, "providesRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderConcernContext_AnnotationsRemovals(), ecorePackage.getEString(), "annotationsRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderConcernContext_AnnotationsAdditions(), theB3backendPackage.getBPropertySet(), null, "annotationsAdditions", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(builderConcernContextEClass, ecorePackage.getEBoolean(), "evaluateIfMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuildUnit(), "promoteToUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		initEClass(outputPredicateEClass, OutputPredicate.class, "OutputPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPredicate_PathVector(), this.getPathVector(), null, "pathVector", null, 0, 1, OutputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPredicate_PathPattern(), theB3backendPackage.getBExpression(), null, "pathPattern", null, 0, 1, OutputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(outputPredicateEClass, ecorePackage.getEBoolean(), "removeMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPathGroup(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aliasedRequiredCapabilityEClass, AliasedRequiredCapability.class, "AliasedRequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAliasedRequiredCapability_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iRequiredCapabilityContainerEClass, IRequiredCapabilityContainer.class, "IRequiredCapabilityContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIRequiredCapabilityContainer_RequiredCapabilities(), this.getRequiredCapability(), null, "requiredCapabilities", null, 0, -1, IRequiredCapabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iProvidedCapabilityContainerEClass, IProvidedCapabilityContainer.class, "IProvidedCapabilityContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIProvidedCapabilityContainer_ProvidedCapabilities(), this.getCapability(), null, "providedCapabilities", null, 0, -1, IProvidedCapabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderQueryEClass, BuilderQuery.class, "BuilderQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderQuery_BuilderQueries(), theB3backendPackage.getBExpression(), null, "builderQueries", null, 1, -1, BuilderQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderQuery_UnitQuery(), theB3backendPackage.getBExpression(), null, "unitQuery", null, 0, 1, BuilderQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderEClass, Builder.class, "Builder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builderJavaEClass, BuilderJava.class, "BuilderJava", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builderWrapperEClass, BuilderWrapper.class, "BuilderWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuilderWrapper_InputAdvised(), ecorePackage.getEBoolean(), "inputAdvised", null, 0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderWrapper_OutputAdvised(), ecorePackage.getEBoolean(), "outputAdvised", null, 0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderWrapper_UnitTypeAdvised(), ecorePackage.getEBoolean(), "unitTypeAdvised", null, 0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderWrapper_ProvidesAdvised(), ecorePackage.getEBoolean(), "providesAdvised", null, 0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuilderWrapper_DefaultPropertiesAdvised(), ecorePackage.getEBoolean(), "defaultPropertiesAdvised", null, 0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beeModelEClass, BeeModel.class, "BeeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeeModel_Imports(), theB3backendPackage.getIType(), null, "imports", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeeModel_Functions(), theB3backendPackage.getIFunction(), null, "functions", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeeModel_Concerns(), theB3backendPackage.getBConcern(), null, "concerns", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeeModel_Body(), this.getBuildUnit(), null, "body", null, 0, 1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeeModel_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beeHiveEClass, BeeHive.class, "BeeHive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBeeHive_BeeModels(), this.getBeeModel(), null, "beeModels", null, 0, -1, BeeHive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBeeHive_Parent(), this.getBeeHive(), null, "parent", null, 0, 1, BeeHive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getRequiredCapability());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCapability());
		g1.getETypeArguments().add(g2);
		initEAttribute(getBeeHive_Resolutions(), g1, "resolutions", null, 0, 1, BeeHive.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(beeHiveEClass, this.getIProvidedCapabilityContainer(), "getResolvedCapabilityContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "requiredCapability", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resolutionInfoEClass, ResolutionInfo.class, "ResolutionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(effectiveFacadeEClass, EffectiveFacade.class, "EffectiveFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectiveFacade_Context(), theB3backendPackage.getBExecutionContext(), null, "context", null, 0, 1, EffectiveFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectiveUnitFacadeEClass, EffectiveUnitFacade.class, "EffectiveUnitFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectiveUnitFacade_Unit(), this.getBuildUnit(), null, "unit", null, 0, 1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectiveUnitFacade_ProvidedCapabilities(), this.getEffectiveCapabilityFacade(), null, "providedCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectiveUnitFacade_RequiredCapabilities(), this.getEffectiveRequirementFacade(), null, "requiredCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffectiveUnitFacade_MetaRequiredCapabilities(), this.getEffectiveRequirementFacade(), null, "metaRequiredCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectiveRequirementFacadeEClass, EffectiveRequirementFacade.class, "EffectiveRequirementFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectiveRequirementFacade_Requirement(), this.getRequiredCapability(), null, "requirement", null, 0, 1, EffectiveRequirementFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectiveCapabilityFacadeEClass, EffectiveCapabilityFacade.class, "EffectiveCapabilityFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectiveCapabilityFacade_ProvidedCapability(), this.getCapability(), null, "providedCapability", null, 0, 1, EffectiveCapabilityFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectiveBuilderReferenceFacadeEClass, EffectiveBuilderReferenceFacade.class, "EffectiveBuilderReferenceFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectiveBuilderReferenceFacade_BuilderReference(), this.getBuilderReference(), null, "builderReference", null, 0, 1, EffectiveBuilderReferenceFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffectiveBuilderReferenceFacade_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, EffectiveBuilderReferenceFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildResultEClass, BuildResult.class, "BuildResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildResult_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, 1, BuildResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildResult_ValueMap(), theB3backendPackage.getValueMap(), "valueMap", null, 0, 1, BuildResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(versionRangeEDataType, VersionRange.class, "VersionRange", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //B3BuildPackageImpl
