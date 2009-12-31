/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.b3.beeLang.BeeLangFactory;
import org.eclipse.b3.beeLang.BeeLangPackage;
import org.eclipse.b3.beeLang.BeeModel;
import org.eclipse.b3.beeLang.BuildUnit;
import org.eclipse.b3.beeLang.BuilderOutput;
import org.eclipse.b3.beeLang.ContainerConfiguration;
import org.eclipse.b3.beeLang.ParameterDeclaration;
import org.eclipse.b3.beeLang.ParameterDeclarationList;
import org.eclipse.b3.beeLang.RepositoryConfiguration;
import org.eclipse.b3.beeLang.RepositoryDeclaration;
import org.eclipse.b3.beeLang.ResolutionStrategy;
import org.eclipse.b3.beeLang.SetPropertyOperation;
import org.eclipse.b3.beeLang.Synchronization;
import org.eclipse.b3.beeLang.UnsetPropertyOperation;
import org.eclipse.b3.beeLang.VarargParameterDeclaration;

import org.eclipse.b3.build.build.B3BuildPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeeLangPackageImpl extends EPackageImpl implements BeeLangPackage
{
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
  private EClass buildUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setPropertyOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsetPropertyOperationEClass = null;

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
  private EClass parameterDeclarationListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builderOutputEClass = null;

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
  private EClass containerConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varargParameterDeclarationEClass = null;

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
   * @see org.eclipse.b3.beeLang.BeeLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BeeLangPackageImpl()
  {
    super(eNS_URI, BeeLangFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BeeLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BeeLangPackage init()
  {
    if (isInited) return (BeeLangPackage)EPackage.Registry.INSTANCE.getEPackage(BeeLangPackage.eNS_URI);

    // Obtain or create and register package
    BeeLangPackageImpl theBeeLangPackage = (BeeLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BeeLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BeeLangPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    B3BuildPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBeeLangPackage.createPackageContents();

    // Initialize created meta-data
    theBeeLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBeeLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BeeLangPackage.eNS_URI, theBeeLangPackage);
    return theBeeLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeeModel()
  {
    return beeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeeModel_Imports()
  {
    return (EReference)beeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeeModel_Functions()
  {
    return (EReference)beeModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeeModel_Concern()
  {
    return (EReference)beeModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeeModel_PropertySets()
  {
    return (EReference)beeModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeeModel_Body()
  {
    return (EReference)beeModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildUnit()
  {
    return buildUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildUnit_Documentation()
  {
    return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildUnit_ExecutionMode()
  {
    return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildUnit_Name()
  {
    return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildUnit_Version()
  {
    return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildUnit_Implements()
  {
    return (EAttribute)buildUnitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_DefaultProperties()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_ProvidedCapabilities()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_RequiredCapabilities()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_MetaRequiredCapabilities()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_Concerns()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_Synchronizations()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_Builders()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_Functions()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_RepositoryConfigurations()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_PropertySets()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuildUnit_Containers()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetPropertyOperation()
  {
    return setPropertyOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetPropertyOperation_Final()
  {
    return (EAttribute)setPropertyOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetPropertyOperation_Key()
  {
    return (EAttribute)setPropertyOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSetPropertyOperation_Op()
  {
    return (EAttribute)setPropertyOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetPropertyOperation_Value()
  {
    return (EReference)setPropertyOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnsetPropertyOperation()
  {
    return unsetPropertyOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnsetPropertyOperation_Key()
  {
    return (EAttribute)unsetPropertyOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSynchronization()
  {
    return synchronizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSynchronization_Partrefs()
  {
    return (EAttribute)synchronizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDeclarationList()
  {
    return parameterDeclarationListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterDeclarationList_Params()
  {
    return (EReference)parameterDeclarationListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDeclaration()
  {
    return parameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuilderOutput()
  {
    return builderOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilderOutput_Body()
  {
    return (EReference)builderOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryConfiguration()
  {
    return repositoryConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryDeclaration()
  {
    return repositoryDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryDeclaration_Documentation()
  {
    return (EAttribute)repositoryDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryDeclaration_Location()
  {
    return (EAttribute)repositoryDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryDeclaration_Type()
  {
    return (EReference)repositoryDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryDeclaration_Context()
  {
    return (EReference)repositoryDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolutionStrategy()
  {
    return resolutionStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResolutionStrategy_Strategy()
  {
    return (EAttribute)resolutionStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResolutionStrategy_RepositoryConfig()
  {
    return (EReference)resolutionStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerConfiguration()
  {
    return containerConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerConfiguration_Documentation()
  {
    return (EAttribute)containerConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerConfiguration_Name()
  {
    return (EAttribute)containerConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerConfiguration_Type()
  {
    return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerConfiguration_ContextBlock()
  {
    return (EReference)containerConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarargParameterDeclaration()
  {
    return varargParameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarargParameterDeclaration_Type()
  {
    return (EReference)varargParameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarargParameterDeclaration_Name()
  {
    return (EAttribute)varargParameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangFactory getBeeLangFactory()
  {
    return (BeeLangFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    beeModelEClass = createEClass(BEE_MODEL);
    createEReference(beeModelEClass, BEE_MODEL__IMPORTS);
    createEReference(beeModelEClass, BEE_MODEL__FUNCTIONS);
    createEReference(beeModelEClass, BEE_MODEL__CONCERN);
    createEReference(beeModelEClass, BEE_MODEL__PROPERTY_SETS);
    createEReference(beeModelEClass, BEE_MODEL__BODY);

    buildUnitEClass = createEClass(BUILD_UNIT);
    createEAttribute(buildUnitEClass, BUILD_UNIT__DOCUMENTATION);
    createEAttribute(buildUnitEClass, BUILD_UNIT__EXECUTION_MODE);
    createEAttribute(buildUnitEClass, BUILD_UNIT__NAME);
    createEAttribute(buildUnitEClass, BUILD_UNIT__VERSION);
    createEAttribute(buildUnitEClass, BUILD_UNIT__IMPLEMENTS);
    createEReference(buildUnitEClass, BUILD_UNIT__DEFAULT_PROPERTIES);
    createEReference(buildUnitEClass, BUILD_UNIT__PROVIDED_CAPABILITIES);
    createEReference(buildUnitEClass, BUILD_UNIT__REQUIRED_CAPABILITIES);
    createEReference(buildUnitEClass, BUILD_UNIT__META_REQUIRED_CAPABILITIES);
    createEReference(buildUnitEClass, BUILD_UNIT__CONCERNS);
    createEReference(buildUnitEClass, BUILD_UNIT__SYNCHRONIZATIONS);
    createEReference(buildUnitEClass, BUILD_UNIT__BUILDERS);
    createEReference(buildUnitEClass, BUILD_UNIT__FUNCTIONS);
    createEReference(buildUnitEClass, BUILD_UNIT__REPOSITORY_CONFIGURATIONS);
    createEReference(buildUnitEClass, BUILD_UNIT__PROPERTY_SETS);
    createEReference(buildUnitEClass, BUILD_UNIT__CONTAINERS);

    setPropertyOperationEClass = createEClass(SET_PROPERTY_OPERATION);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__FINAL);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__KEY);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__OP);
    createEReference(setPropertyOperationEClass, SET_PROPERTY_OPERATION__VALUE);

    unsetPropertyOperationEClass = createEClass(UNSET_PROPERTY_OPERATION);
    createEAttribute(unsetPropertyOperationEClass, UNSET_PROPERTY_OPERATION__KEY);

    synchronizationEClass = createEClass(SYNCHRONIZATION);
    createEAttribute(synchronizationEClass, SYNCHRONIZATION__PARTREFS);

    parameterDeclarationListEClass = createEClass(PARAMETER_DECLARATION_LIST);
    createEReference(parameterDeclarationListEClass, PARAMETER_DECLARATION_LIST__PARAMS);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);

    builderOutputEClass = createEClass(BUILDER_OUTPUT);
    createEReference(builderOutputEClass, BUILDER_OUTPUT__BODY);

    repositoryConfigurationEClass = createEClass(REPOSITORY_CONFIGURATION);

    repositoryDeclarationEClass = createEClass(REPOSITORY_DECLARATION);
    createEAttribute(repositoryDeclarationEClass, REPOSITORY_DECLARATION__DOCUMENTATION);
    createEAttribute(repositoryDeclarationEClass, REPOSITORY_DECLARATION__LOCATION);
    createEReference(repositoryDeclarationEClass, REPOSITORY_DECLARATION__TYPE);
    createEReference(repositoryDeclarationEClass, REPOSITORY_DECLARATION__CONTEXT);

    resolutionStrategyEClass = createEClass(RESOLUTION_STRATEGY);
    createEAttribute(resolutionStrategyEClass, RESOLUTION_STRATEGY__STRATEGY);
    createEReference(resolutionStrategyEClass, RESOLUTION_STRATEGY__REPOSITORY_CONFIG);

    containerConfigurationEClass = createEClass(CONTAINER_CONFIGURATION);
    createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__DOCUMENTATION);
    createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__NAME);
    createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__TYPE);
    createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__CONTEXT_BLOCK);

    varargParameterDeclarationEClass = createEClass(VARARG_PARAMETER_DECLARATION);
    createEReference(varargParameterDeclarationEClass, VARARG_PARAMETER_DECLARATION__TYPE);
    createEAttribute(varargParameterDeclarationEClass, VARARG_PARAMETER_DECLARATION__NAME);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    B3backendPackage theB3backendPackage = (B3backendPackage)EPackage.Registry.INSTANCE.getEPackage(B3backendPackage.eNS_URI);
    B3BuildPackage theB3BuildPackage = (B3BuildPackage)EPackage.Registry.INSTANCE.getEPackage(B3BuildPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    repositoryDeclarationEClass.getESuperTypes().add(this.getRepositoryConfiguration());
    resolutionStrategyEClass.getESuperTypes().add(this.getRepositoryConfiguration());
    varargParameterDeclarationEClass.getESuperTypes().add(this.getParameterDeclaration());

    // Initialize classes and features; add operations and parameters
    initEClass(beeModelEClass, BeeModel.class, "BeeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBeeModel_Imports(), theB3backendPackage.getIType(), null, "imports", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Functions(), theB3backendPackage.getB3Function(), null, "functions", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Concern(), theB3backendPackage.getBConcern(), null, "concern", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Body(), this.getBuildUnit(), null, "body", null, 0, 1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildUnit_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_ExecutionMode(), theB3backendPackage.getExecutionMode(), "executionMode", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_Version(), theB3BuildPackage.getVersion(), "version", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_Implements(), ecorePackage.getEString(), "implements", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_ProvidedCapabilities(), theB3BuildPackage.getVersionedCapability(), null, "providedCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_RequiredCapabilities(), theB3BuildPackage.getRequiredCapability(), null, "requiredCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_MetaRequiredCapabilities(), theB3BuildPackage.getRequiredCapability(), null, "metaRequiredCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Concerns(), theB3backendPackage.getBConcern(), null, "concerns", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Builders(), theB3BuildPackage.getBuilder(), null, "builders", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Functions(), theB3backendPackage.getB3Function(), null, "functions", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_RepositoryConfigurations(), this.getRepositoryConfiguration(), null, "repositoryConfigurations", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Containers(), this.getContainerConfiguration(), null, "containers", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setPropertyOperationEClass, SetPropertyOperation.class, "SetPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetPropertyOperation_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetPropertyOperation_Key(), ecorePackage.getEString(), "key", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetPropertyOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetPropertyOperation_Value(), theB3backendPackage.getBExpression(), null, "value", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unsetPropertyOperationEClass, UnsetPropertyOperation.class, "UnsetPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnsetPropertyOperation_Key(), ecorePackage.getEString(), "key", null, 0, 1, UnsetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSynchronization_Partrefs(), ecorePackage.getEString(), "partrefs", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationListEClass, ParameterDeclarationList.class, "ParameterDeclarationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterDeclarationList_Params(), ecorePackage.getEObject(), null, "params", null, 0, -1, ParameterDeclarationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builderOutputEClass, BuilderOutput.class, "BuilderOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuilderOutput_Body(), theB3BuildPackage.getPathGroup(), null, "body", null, 0, 1, BuilderOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryConfigurationEClass, RepositoryConfiguration.class, "RepositoryConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(repositoryDeclarationEClass, RepositoryDeclaration.class, "RepositoryDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryDeclaration_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryDeclaration_Location(), ecorePackage.getEString(), "location", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepositoryDeclaration_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepositoryDeclaration_Context(), theB3backendPackage.getBExpression(), null, "context", null, 0, 1, RepositoryDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolutionStrategyEClass, ResolutionStrategy.class, "ResolutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResolutionStrategy_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1, ResolutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResolutionStrategy_RepositoryConfig(), this.getRepositoryConfiguration(), null, "repositoryConfig", null, 0, -1, ResolutionStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerConfigurationEClass, ContainerConfiguration.class, "ContainerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainerConfiguration_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerConfiguration_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerConfiguration_ContextBlock(), theB3backendPackage.getBExpression(), null, "contextBlock", null, 0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varargParameterDeclarationEClass, VarargParameterDeclaration.class, "VarargParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarargParameterDeclaration_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, VarargParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarargParameterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarargParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BeeLangPackageImpl
