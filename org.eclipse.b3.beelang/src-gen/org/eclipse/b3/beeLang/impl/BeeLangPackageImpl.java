/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import beelangtypes.BeelangtypesPackage;

import beelangtypes.impl.BeelangtypesPackageImpl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.b3.beeLang.AssertionExpression;
import org.eclipse.b3.beeLang.BeeLangFactory;
import org.eclipse.b3.beeLang.BeeLangPackage;
import org.eclipse.b3.beeLang.BeeModel;
import org.eclipse.b3.beeLang.BuildUnit;
import org.eclipse.b3.beeLang.Builder;
import org.eclipse.b3.beeLang.BuilderInput;
import org.eclipse.b3.beeLang.BuilderOutput;
import org.eclipse.b3.beeLang.Capability;
import org.eclipse.b3.beeLang.CapabilityReferencedPart;
import org.eclipse.b3.beeLang.CompoundPathVector;
import org.eclipse.b3.beeLang.CompoundReferences;
import org.eclipse.b3.beeLang.CompounddReferences;
import org.eclipse.b3.beeLang.Concern;
import org.eclipse.b3.beeLang.ConcernBlock;
import org.eclipse.b3.beeLang.ContainerConfiguration;
import org.eclipse.b3.beeLang.Context;
import org.eclipse.b3.beeLang.ContextSelector;
import org.eclipse.b3.beeLang.DirectPartReferemce;
import org.eclipse.b3.beeLang.ExpressionList;
import org.eclipse.b3.beeLang.ExpressionSelector;
import org.eclipse.b3.beeLang.Filter;
import org.eclipse.b3.beeLang.FilteredCapability;
import org.eclipse.b3.beeLang.FilteredPathVector;
import org.eclipse.b3.beeLang.ParameterDeclaration;
import org.eclipse.b3.beeLang.ParameterDeclarationList;
import org.eclipse.b3.beeLang.PathGroup;
import org.eclipse.b3.beeLang.PathVector;
import org.eclipse.b3.beeLang.PathVectorElement;
import org.eclipse.b3.beeLang.PostCondition;
import org.eclipse.b3.beeLang.PreCondition;
import org.eclipse.b3.beeLang.Prerequisite;
import org.eclipse.b3.beeLang.PrerequisiteEntry;
import org.eclipse.b3.beeLang.ProvidedCapability;
import org.eclipse.b3.beeLang.RepositoryConfiguration;
import org.eclipse.b3.beeLang.RepositoryDeclaration;
import org.eclipse.b3.beeLang.RequiredCapability;
import org.eclipse.b3.beeLang.ResolutionStrategy;
import org.eclipse.b3.beeLang.SetPropertyOperation;
import org.eclipse.b3.beeLang.Synchronization;
import org.eclipse.b3.beeLang.UnitSelector;
import org.eclipse.b3.beeLang.UnsetPropertyOperation;
import org.eclipse.b3.beeLang.VarargParameterDeclaration;
import org.eclipse.b3.beeLang.Version;
import org.eclipse.b3.beeLang.VersionRange;
import org.eclipse.b3.beeLang.WithClause;

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
  private EClass providedCapabilityEClass = null;

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
  private EClass filteredCapabilityEClass = null;

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
  private EClass pathGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathVectorElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filteredPathVectorEClass = null;

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
  private EClass compoundPathVectorEClass = null;

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
  private EClass withClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prerequisiteEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directPartReferemceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityReferencedPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundReferencesEClass = null;

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
  private EClass builderInputEClass = null;

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
  private EClass concernEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concernBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compounddReferencesEClass = null;

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
    B3backendPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    BeelangtypesPackageImpl theBeelangtypesPackage = (BeelangtypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeelangtypesPackage.eNS_URI) instanceof BeelangtypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeelangtypesPackage.eNS_URI) : BeelangtypesPackage.eINSTANCE);

    // Create package meta-data objects
    theBeeLangPackage.createPackageContents();
    theBeelangtypesPackage.createPackageContents();

    // Initialize created meta-data
    theBeeLangPackage.initializePackageContents();
    theBeelangtypesPackage.initializePackageContents();

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
  public EReference getBuildUnit_Version()
  {
    return (EReference)buildUnitEClass.getEStructuralFeatures().get(3);
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
  public EClass getProvidedCapability()
  {
    return providedCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedCapability_Capability()
  {
    return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidedCapability_Version()
  {
    return (EReference)providedCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredCapability()
  {
    return requiredCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredCapability_Capability()
  {
    return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiredCapability_Range()
  {
    return (EReference)requiredCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilteredCapability()
  {
    return filteredCapabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredCapability_Filter()
  {
    return (EReference)filteredCapabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredCapability_Capability()
  {
    return (EReference)filteredCapabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapability()
  {
    return capabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Interface()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Name()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
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
  public EClass getPathGroup()
  {
    return pathGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathGroup_Paths()
  {
    return (EReference)pathGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathGroup_Annotations()
  {
    return (EReference)pathGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathVectorElement()
  {
    return pathVectorElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilteredPathVector()
  {
    return filteredPathVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredPathVector_Filter()
  {
    return (EReference)filteredPathVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilteredPathVector_Body()
  {
    return (EReference)filteredPathVectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathVector()
  {
    return pathVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathVector_BasePath()
  {
    return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathVector_Paths()
  {
    return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundPathVector()
  {
    return compoundPathVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundPathVector_Body()
  {
    return (EReference)compoundPathVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrerequisite()
  {
    return prerequisiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrerequisite_Filter()
  {
    return (EReference)prerequisiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrerequisite_WithClause()
  {
    return (EReference)prerequisiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrerequisite_PartReference()
  {
    return (EReference)prerequisiteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrerequisite_Alias()
  {
    return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithClause()
  {
    return withClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithClause_References()
  {
    return (EReference)withClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithClause_Properties()
  {
    return (EReference)withClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWithClause_Concern()
  {
    return (EReference)withClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrerequisiteEntry()
  {
    return prerequisiteEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectPartReferemce()
  {
    return directPartReferemceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirectPartReferemce_Unit()
  {
    return (EAttribute)directPartReferemceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirectPartReferemce_Builder()
  {
    return (EAttribute)directPartReferemceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectPartReferemce_Parameters()
  {
    return (EReference)directPartReferemceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapabilityReferencedPart()
  {
    return capabilityReferencedPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityReferencedPart_Capability()
  {
    return (EReference)capabilityReferencedPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityReferencedPart_Range()
  {
    return (EReference)capabilityReferencedPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapabilityReferencedPart_PartName()
  {
    return (EAttribute)capabilityReferencedPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityReferencedPart_Parameters()
  {
    return (EReference)capabilityReferencedPartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundReferences()
  {
    return compoundReferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuilder()
  {
    return builderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_Documentation()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_Visibility()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_ExecutionMode()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_Final()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_Cached()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuilder_Name()
  {
    return (EAttribute)builderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_Params()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_ProvidedCapabilities()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_PreCondition()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_PostCondition()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_Properties()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_Input()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_Output()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilder_ExpressionList()
  {
    return (EReference)builderEClass.getEStructuralFeatures().get(13);
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
  public EClass getBuilderInput()
  {
    return builderInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilderInput_PreCondition()
  {
    return (EReference)builderInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilderInput_PostCondition()
  {
    return (EReference)builderInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuilderInput_Prerequisites()
  {
    return (EReference)builderInputEClass.getEStructuralFeatures().get(2);
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
  public EClass getConcern()
  {
    return concernEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcern_Documentation()
  {
    return (EAttribute)concernEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcern_Name()
  {
    return (EAttribute)concernEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcern_Concern()
  {
    return (EReference)concernEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcernBlock()
  {
    return concernBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcernBlock_SuperConcerns()
  {
    return (EAttribute)concernBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcernBlock_Contexts()
  {
    return (EReference)concernBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcernBlock_Functions()
  {
    return (EReference)concernBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilter()
  {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilter_Predicate()
  {
    return (EReference)filterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreCondition()
  {
    return preConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreCondition_Asserts()
  {
    return (EReference)preConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostCondition()
  {
    return postConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostCondition_Asserts()
  {
    return (EReference)postConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertionExpression()
  {
    return assertionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionExpression_Expr()
  {
    return (EReference)assertionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssertionExpression_Message()
  {
    return (EAttribute)assertionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionList()
  {
    return expressionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionList_Expressions()
  {
    return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_Selector()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_Block()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextSelector()
  {
    return contextSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextSelector_Type()
  {
    return (EReference)contextSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionSelector()
  {
    return expressionSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionSelector_Expr()
  {
    return (EReference)expressionSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnitSelector()
  {
    return unitSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitSelector_Interface()
  {
    return (EAttribute)unitSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitSelector_Name()
  {
    return (EAttribute)unitSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitSelector_NamePattern()
  {
    return (EAttribute)unitSelectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnitSelector_VersionRange()
  {
    return (EReference)unitSelectorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Version()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionRange()
  {
    return versionRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersionRange_Range()
  {
    return (EAttribute)versionRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompounddReferences()
  {
    return compounddReferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompounddReferences_Prerequisites()
  {
    return (EReference)compounddReferencesEClass.getEStructuralFeatures().get(0);
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
    createEReference(buildUnitEClass, BUILD_UNIT__VERSION);
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

    providedCapabilityEClass = createEClass(PROVIDED_CAPABILITY);
    createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__CAPABILITY);
    createEReference(providedCapabilityEClass, PROVIDED_CAPABILITY__VERSION);

    requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
    createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__CAPABILITY);
    createEReference(requiredCapabilityEClass, REQUIRED_CAPABILITY__RANGE);

    filteredCapabilityEClass = createEClass(FILTERED_CAPABILITY);
    createEReference(filteredCapabilityEClass, FILTERED_CAPABILITY__FILTER);
    createEReference(filteredCapabilityEClass, FILTERED_CAPABILITY__CAPABILITY);

    capabilityEClass = createEClass(CAPABILITY);
    createEAttribute(capabilityEClass, CAPABILITY__INTERFACE);
    createEAttribute(capabilityEClass, CAPABILITY__NAME);

    setPropertyOperationEClass = createEClass(SET_PROPERTY_OPERATION);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__FINAL);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__KEY);
    createEAttribute(setPropertyOperationEClass, SET_PROPERTY_OPERATION__OP);
    createEReference(setPropertyOperationEClass, SET_PROPERTY_OPERATION__VALUE);

    unsetPropertyOperationEClass = createEClass(UNSET_PROPERTY_OPERATION);
    createEAttribute(unsetPropertyOperationEClass, UNSET_PROPERTY_OPERATION__KEY);

    synchronizationEClass = createEClass(SYNCHRONIZATION);
    createEAttribute(synchronizationEClass, SYNCHRONIZATION__PARTREFS);

    pathGroupEClass = createEClass(PATH_GROUP);
    createEReference(pathGroupEClass, PATH_GROUP__PATHS);
    createEReference(pathGroupEClass, PATH_GROUP__ANNOTATIONS);

    pathVectorElementEClass = createEClass(PATH_VECTOR_ELEMENT);

    filteredPathVectorEClass = createEClass(FILTERED_PATH_VECTOR);
    createEReference(filteredPathVectorEClass, FILTERED_PATH_VECTOR__FILTER);
    createEReference(filteredPathVectorEClass, FILTERED_PATH_VECTOR__BODY);

    pathVectorEClass = createEClass(PATH_VECTOR);
    createEAttribute(pathVectorEClass, PATH_VECTOR__BASE_PATH);
    createEAttribute(pathVectorEClass, PATH_VECTOR__PATHS);

    compoundPathVectorEClass = createEClass(COMPOUND_PATH_VECTOR);
    createEReference(compoundPathVectorEClass, COMPOUND_PATH_VECTOR__BODY);

    prerequisiteEClass = createEClass(PREREQUISITE);
    createEReference(prerequisiteEClass, PREREQUISITE__FILTER);
    createEReference(prerequisiteEClass, PREREQUISITE__WITH_CLAUSE);
    createEReference(prerequisiteEClass, PREREQUISITE__PART_REFERENCE);
    createEAttribute(prerequisiteEClass, PREREQUISITE__ALIAS);

    withClauseEClass = createEClass(WITH_CLAUSE);
    createEReference(withClauseEClass, WITH_CLAUSE__REFERENCES);
    createEReference(withClauseEClass, WITH_CLAUSE__PROPERTIES);
    createEReference(withClauseEClass, WITH_CLAUSE__CONCERN);

    prerequisiteEntryEClass = createEClass(PREREQUISITE_ENTRY);

    directPartReferemceEClass = createEClass(DIRECT_PART_REFEREMCE);
    createEAttribute(directPartReferemceEClass, DIRECT_PART_REFEREMCE__UNIT);
    createEAttribute(directPartReferemceEClass, DIRECT_PART_REFEREMCE__BUILDER);
    createEReference(directPartReferemceEClass, DIRECT_PART_REFEREMCE__PARAMETERS);

    capabilityReferencedPartEClass = createEClass(CAPABILITY_REFERENCED_PART);
    createEReference(capabilityReferencedPartEClass, CAPABILITY_REFERENCED_PART__CAPABILITY);
    createEReference(capabilityReferencedPartEClass, CAPABILITY_REFERENCED_PART__RANGE);
    createEAttribute(capabilityReferencedPartEClass, CAPABILITY_REFERENCED_PART__PART_NAME);
    createEReference(capabilityReferencedPartEClass, CAPABILITY_REFERENCED_PART__PARAMETERS);

    compoundReferencesEClass = createEClass(COMPOUND_REFERENCES);

    builderEClass = createEClass(BUILDER);
    createEAttribute(builderEClass, BUILDER__DOCUMENTATION);
    createEAttribute(builderEClass, BUILDER__VISIBILITY);
    createEAttribute(builderEClass, BUILDER__EXECUTION_MODE);
    createEAttribute(builderEClass, BUILDER__FINAL);
    createEAttribute(builderEClass, BUILDER__CACHED);
    createEAttribute(builderEClass, BUILDER__NAME);
    createEReference(builderEClass, BUILDER__PARAMS);
    createEReference(builderEClass, BUILDER__PROVIDED_CAPABILITIES);
    createEReference(builderEClass, BUILDER__PRE_CONDITION);
    createEReference(builderEClass, BUILDER__POST_CONDITION);
    createEReference(builderEClass, BUILDER__PROPERTIES);
    createEReference(builderEClass, BUILDER__INPUT);
    createEReference(builderEClass, BUILDER__OUTPUT);
    createEReference(builderEClass, BUILDER__EXPRESSION_LIST);

    parameterDeclarationListEClass = createEClass(PARAMETER_DECLARATION_LIST);
    createEReference(parameterDeclarationListEClass, PARAMETER_DECLARATION_LIST__PARAMS);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);

    builderOutputEClass = createEClass(BUILDER_OUTPUT);
    createEReference(builderOutputEClass, BUILDER_OUTPUT__BODY);

    builderInputEClass = createEClass(BUILDER_INPUT);
    createEReference(builderInputEClass, BUILDER_INPUT__PRE_CONDITION);
    createEReference(builderInputEClass, BUILDER_INPUT__POST_CONDITION);
    createEReference(builderInputEClass, BUILDER_INPUT__PREREQUISITES);

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

    concernEClass = createEClass(CONCERN);
    createEAttribute(concernEClass, CONCERN__DOCUMENTATION);
    createEAttribute(concernEClass, CONCERN__NAME);
    createEReference(concernEClass, CONCERN__CONCERN);

    concernBlockEClass = createEClass(CONCERN_BLOCK);
    createEAttribute(concernBlockEClass, CONCERN_BLOCK__SUPER_CONCERNS);
    createEReference(concernBlockEClass, CONCERN_BLOCK__CONTEXTS);
    createEReference(concernBlockEClass, CONCERN_BLOCK__FUNCTIONS);

    filterEClass = createEClass(FILTER);
    createEReference(filterEClass, FILTER__PREDICATE);

    preConditionEClass = createEClass(PRE_CONDITION);
    createEReference(preConditionEClass, PRE_CONDITION__ASSERTS);

    postConditionEClass = createEClass(POST_CONDITION);
    createEReference(postConditionEClass, POST_CONDITION__ASSERTS);

    assertionExpressionEClass = createEClass(ASSERTION_EXPRESSION);
    createEReference(assertionExpressionEClass, ASSERTION_EXPRESSION__EXPR);
    createEAttribute(assertionExpressionEClass, ASSERTION_EXPRESSION__MESSAGE);

    expressionListEClass = createEClass(EXPRESSION_LIST);
    createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);

    contextEClass = createEClass(CONTEXT);
    createEReference(contextEClass, CONTEXT__SELECTOR);
    createEReference(contextEClass, CONTEXT__BLOCK);

    contextSelectorEClass = createEClass(CONTEXT_SELECTOR);
    createEReference(contextSelectorEClass, CONTEXT_SELECTOR__TYPE);

    expressionSelectorEClass = createEClass(EXPRESSION_SELECTOR);
    createEReference(expressionSelectorEClass, EXPRESSION_SELECTOR__EXPR);

    unitSelectorEClass = createEClass(UNIT_SELECTOR);
    createEAttribute(unitSelectorEClass, UNIT_SELECTOR__INTERFACE);
    createEAttribute(unitSelectorEClass, UNIT_SELECTOR__NAME);
    createEAttribute(unitSelectorEClass, UNIT_SELECTOR__NAME_PATTERN);
    createEReference(unitSelectorEClass, UNIT_SELECTOR__VERSION_RANGE);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__VERSION);

    versionRangeEClass = createEClass(VERSION_RANGE);
    createEAttribute(versionRangeEClass, VERSION_RANGE__RANGE);

    compounddReferencesEClass = createEClass(COMPOUNDD_REFERENCES);
    createEReference(compounddReferencesEClass, COMPOUNDD_REFERENCES__PREREQUISITES);

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
    BeelangtypesPackage theBeelangtypesPackage = (BeelangtypesPackage)EPackage.Registry.INSTANCE.getEPackage(BeelangtypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    filteredPathVectorEClass.getESuperTypes().add(this.getPathVectorElement());
    pathVectorEClass.getESuperTypes().add(this.getPathVectorElement());
    directPartReferemceEClass.getESuperTypes().add(this.getPrerequisiteEntry());
    capabilityReferencedPartEClass.getESuperTypes().add(this.getPrerequisiteEntry());
    compoundReferencesEClass.getESuperTypes().add(this.getPrerequisiteEntry());
    repositoryDeclarationEClass.getESuperTypes().add(this.getRepositoryConfiguration());
    resolutionStrategyEClass.getESuperTypes().add(this.getRepositoryConfiguration());
    expressionSelectorEClass.getESuperTypes().add(this.getContextSelector());
    unitSelectorEClass.getESuperTypes().add(this.getContextSelector());
    compounddReferencesEClass.getESuperTypes().add(this.getCompoundReferences());
    varargParameterDeclarationEClass.getESuperTypes().add(this.getParameterDeclaration());

    // Initialize classes and features; add operations and parameters
    initEClass(beeModelEClass, BeeModel.class, "BeeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBeeModel_Imports(), theB3backendPackage.getIType(), null, "imports", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Functions(), theB3backendPackage.getB3Function(), null, "functions", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Concern(), this.getConcern(), null, "concern", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_PropertySets(), theB3backendPackage.getBNamedPropertySet(), null, "propertySets", null, 0, -1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeeModel_Body(), this.getBuildUnit(), null, "body", null, 0, 1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildUnit_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_ExecutionMode(), theB3backendPackage.getExecutionMode(), "executionMode", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Version(), this.getVersion(), null, "version", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildUnit_Implements(), ecorePackage.getEString(), "implements", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_ProvidedCapabilities(), this.getProvidedCapability(), null, "providedCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_RequiredCapabilities(), this.getRequiredCapability(), null, "requiredCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_MetaRequiredCapabilities(), this.getRequiredCapability(), null, "metaRequiredCapabilities", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Builders(), this.getBuilder(), null, "builders", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Functions(), theB3backendPackage.getB3Function(), null, "functions", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_RepositoryConfigurations(), this.getRepositoryConfiguration(), null, "repositoryConfigurations", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_PropertySets(), theB3backendPackage.getBNamedPropertySet(), null, "propertySets", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuildUnit_Containers(), this.getContainerConfiguration(), null, "containers", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providedCapabilityEClass, ProvidedCapability.class, "ProvidedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProvidedCapability_Capability(), this.getFilteredCapability(), null, "capability", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidedCapability_Version(), this.getVersion(), null, "version", null, 0, 1, ProvidedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequiredCapability_Capability(), this.getFilteredCapability(), null, "capability", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequiredCapability_Range(), this.getVersionRange(), null, "range", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filteredCapabilityEClass, FilteredCapability.class, "FilteredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilteredCapability_Filter(), this.getFilter(), null, "filter", null, 0, 1, FilteredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilteredCapability_Capability(), this.getCapability(), null, "capability", null, 0, 1, FilteredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapability_Interface(), ecorePackage.getEString(), "interface", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setPropertyOperationEClass, SetPropertyOperation.class, "SetPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetPropertyOperation_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetPropertyOperation_Key(), ecorePackage.getEString(), "key", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetPropertyOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSetPropertyOperation_Value(), theB3backendPackage.getBExpression(), null, "value", null, 0, 1, SetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unsetPropertyOperationEClass, UnsetPropertyOperation.class, "UnsetPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnsetPropertyOperation_Key(), ecorePackage.getEString(), "key", null, 0, 1, UnsetPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSynchronization_Partrefs(), ecorePackage.getEString(), "partrefs", null, 0, -1, Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathGroupEClass, PathGroup.class, "PathGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathGroup_Paths(), this.getPathVectorElement(), null, "paths", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathGroup_Annotations(), theB3backendPackage.getBPropertySet(), null, "annotations", null, 0, 1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathVectorElementEClass, PathVectorElement.class, "PathVectorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(filteredPathVectorEClass, FilteredPathVector.class, "FilteredPathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilteredPathVector_Filter(), this.getFilter(), null, "filter", null, 0, 1, FilteredPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilteredPathVector_Body(), ecorePackage.getEObject(), null, "body", null, 0, 1, FilteredPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathVectorEClass, PathVector.class, "PathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathVector_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPathVector_Paths(), ecorePackage.getEString(), "paths", null, 0, -1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundPathVectorEClass, CompoundPathVector.class, "CompoundPathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundPathVector_Body(), this.getPathVectorElement(), null, "body", null, 0, -1, CompoundPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrerequisite_Filter(), this.getFilter(), null, "filter", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrerequisite_WithClause(), this.getWithClause(), null, "withClause", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrerequisite_PartReference(), this.getPrerequisiteEntry(), null, "partReference", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrerequisite_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(withClauseEClass, WithClause.class, "WithClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWithClause_References(), theB3backendPackage.getBExpression(), null, "references", null, 0, -1, WithClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithClause_Properties(), theB3backendPackage.getBPropertySet(), null, "properties", null, 0, -1, WithClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWithClause_Concern(), this.getConcernBlock(), null, "concern", null, 0, -1, WithClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prerequisiteEntryEClass, PrerequisiteEntry.class, "PrerequisiteEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directPartReferemceEClass, DirectPartReferemce.class, "DirectPartReferemce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirectPartReferemce_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DirectPartReferemce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirectPartReferemce_Builder(), ecorePackage.getEString(), "builder", null, 0, 1, DirectPartReferemce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectPartReferemce_Parameters(), theB3backendPackage.getBParameterList(), null, "parameters", null, 0, 1, DirectPartReferemce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityReferencedPartEClass, CapabilityReferencedPart.class, "CapabilityReferencedPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCapabilityReferencedPart_Capability(), this.getCapability(), null, "capability", null, 0, 1, CapabilityReferencedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityReferencedPart_Range(), this.getVersionRange(), null, "range", null, 0, 1, CapabilityReferencedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapabilityReferencedPart_PartName(), ecorePackage.getEString(), "partName", null, 0, 1, CapabilityReferencedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityReferencedPart_Parameters(), theB3backendPackage.getBParameterList(), null, "parameters", null, 0, 1, CapabilityReferencedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundReferencesEClass, CompoundReferences.class, "CompoundReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builderEClass, Builder.class, "Builder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuilder_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuilder_Visibility(), theB3backendPackage.getVisibility(), "visibility", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuilder_ExecutionMode(), theB3backendPackage.getExecutionMode(), "executionMode", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuilder_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuilder_Cached(), ecorePackage.getEBoolean(), "cached", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuilder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_Params(), this.getParameterDeclarationList(), null, "params", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_ProvidedCapabilities(), this.getProvidedCapability(), null, "providedCapabilities", null, 0, -1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_PreCondition(), this.getPreCondition(), null, "preCondition", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_PostCondition(), this.getPostCondition(), null, "postCondition", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_Properties(), theB3backendPackage.getBPropertySet(), null, "properties", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_Input(), this.getBuilderInput(), null, "input", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_Output(), this.getBuilderOutput(), null, "output", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilder_ExpressionList(), this.getExpressionList(), null, "expressionList", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationListEClass, ParameterDeclarationList.class, "ParameterDeclarationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterDeclarationList_Params(), ecorePackage.getEObject(), null, "params", null, 0, -1, ParameterDeclarationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builderOutputEClass, BuilderOutput.class, "BuilderOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuilderOutput_Body(), this.getPathGroup(), null, "body", null, 0, 1, BuilderOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builderInputEClass, BuilderInput.class, "BuilderInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuilderInput_PreCondition(), this.getPreCondition(), null, "preCondition", null, 0, 1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilderInput_PostCondition(), this.getPostCondition(), null, "postCondition", null, 0, 1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuilderInput_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcern_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcern_Concern(), this.getConcernBlock(), null, "concern", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concernBlockEClass, ConcernBlock.class, "ConcernBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcernBlock_SuperConcerns(), ecorePackage.getEString(), "superConcerns", null, 0, -1, ConcernBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcernBlock_Contexts(), this.getContext(), null, "contexts", null, 0, -1, ConcernBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcernBlock_Functions(), theB3backendPackage.getB3Function(), null, "functions", null, 0, -1, ConcernBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilter_Predicate(), theB3backendPackage.getBExpression(), null, "predicate", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preConditionEClass, PreCondition.class, "PreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreCondition_Asserts(), this.getAssertionExpression(), null, "asserts", null, 0, -1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postConditionEClass, PostCondition.class, "PostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostCondition_Asserts(), this.getAssertionExpression(), null, "asserts", null, 0, -1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertionExpressionEClass, AssertionExpression.class, "AssertionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertionExpression_Expr(), theB3backendPackage.getBExpression(), null, "expr", null, 0, 1, AssertionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssertionExpression_Message(), ecorePackage.getEString(), "message", null, 0, 1, AssertionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionList_Expressions(), theB3backendPackage.getBExpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContext_Selector(), this.getContextSelector(), null, "selector", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContext_Block(), theB3backendPackage.getBExpression(), null, "block", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextSelectorEClass, ContextSelector.class, "ContextSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextSelector_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, ContextSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionSelectorEClass, ExpressionSelector.class, "ExpressionSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionSelector_Expr(), theB3backendPackage.getBExpression(), null, "expr", null, 0, 1, ExpressionSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unitSelectorEClass, UnitSelector.class, "UnitSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnitSelector_Interface(), ecorePackage.getEString(), "interface", null, 0, 1, UnitSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnitSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnitSelector_NamePattern(), theB3backendPackage.getRegexpPattern(), "namePattern", null, 0, 1, UnitSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnitSelector_VersionRange(), this.getVersionRange(), null, "versionRange", null, 0, 1, UnitSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Version(), theBeelangtypesPackage.getVersion(), "version", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionRangeEClass, VersionRange.class, "VersionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersionRange_Range(), theBeelangtypesPackage.getVersionRange(), "range", null, 0, 1, VersionRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compounddReferencesEClass, CompounddReferences.class, "CompounddReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompounddReferences_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, CompounddReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varargParameterDeclarationEClass, VarargParameterDeclaration.class, "VarargParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarargParameterDeclaration_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1, VarargParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarargParameterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarargParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BeeLangPackageImpl
