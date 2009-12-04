/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import org.eclipse.b3.beeLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeeLangFactoryImpl extends EFactoryImpl implements BeeLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BeeLangFactory init()
  {
    try
    {
      BeeLangFactory theBeeLangFactory = (BeeLangFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/b3/BeeLang"); 
      if (theBeeLangFactory != null)
      {
        return theBeeLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BeeLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BeeLangPackage.BEE_MODEL: return createBeeModel();
      case BeeLangPackage.BUILD_UNIT: return createBuildUnit();
      case BeeLangPackage.PROVIDED_CAPABILITY: return createProvidedCapability();
      case BeeLangPackage.REQUIRED_CAPABILITY: return createRequiredCapability();
      case BeeLangPackage.FILTERED_CAPABILITY: return createFilteredCapability();
      case BeeLangPackage.CAPABILITY: return createCapability();
      case BeeLangPackage.NAMED_PROPERTY_SET: return createNamedPropertySet();
      case BeeLangPackage.PROPERTY_SET: return createPropertySet();
      case BeeLangPackage.PROPERTY_OPERATION: return createPropertyOperation();
      case BeeLangPackage.FILTERED_PROPERTY_OPERATION: return createFilteredPropertyOperation();
      case BeeLangPackage.SET_PROPERTY_OPERATION: return createSetPropertyOperation();
      case BeeLangPackage.UNSET_PROPERTY_OPERATION: return createUnsetPropertyOperation();
      case BeeLangPackage.SYNCHRONIZATION: return createSynchronization();
      case BeeLangPackage.PATH_GROUP: return createPathGroup();
      case BeeLangPackage.PATH_VECTOR_ELEMENT: return createPathVectorElement();
      case BeeLangPackage.FILTERED_PATH_VECTOR: return createFilteredPathVector();
      case BeeLangPackage.PATH_VECTOR: return createPathVector();
      case BeeLangPackage.COMPOUND_PATH_VECTOR: return createCompoundPathVector();
      case BeeLangPackage.PREREQUISITE: return createPrerequisite();
      case BeeLangPackage.WITH_CLAUSE: return createWithClause();
      case BeeLangPackage.PREREQUISITE_ENTRY: return createPrerequisiteEntry();
      case BeeLangPackage.DIRECT_PART_REFEREMCE: return createDirectPartReferemce();
      case BeeLangPackage.CAPABILITY_REFERENCED_PART: return createCapabilityReferencedPart();
      case BeeLangPackage.COMPOUND_REFERENCES: return createCompoundReferences();
      case BeeLangPackage.BUILDER: return createBuilder();
      case BeeLangPackage.PARAMETER_DECLARATION_LIST: return createParameterDeclarationList();
      case BeeLangPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case BeeLangPackage.BUILDER_OUTPUT: return createBuilderOutput();
      case BeeLangPackage.BUILDER_INPUT: return createBuilderInput();
      case BeeLangPackage.REPOSITORY_CONFIGURATION: return createRepositoryConfiguration();
      case BeeLangPackage.REPOSITORY_DECLARATION: return createRepositoryDeclaration();
      case BeeLangPackage.RESOLUTION_STRATEGY: return createResolutionStrategy();
      case BeeLangPackage.CONTAINER_CONFIGURATION: return createContainerConfiguration();
      case BeeLangPackage.CONCERN: return createConcern();
      case BeeLangPackage.CONCERN_BLOCK: return createConcernBlock();
      case BeeLangPackage.QUERY: return createQuery();
      case BeeLangPackage.QUERY_PATH: return createQueryPath();
      case BeeLangPackage.SELECTOR: return createSelector();
      case BeeLangPackage.FILTER: return createFilter();
      case BeeLangPackage.PRE_CONDITION: return createPreCondition();
      case BeeLangPackage.POST_CONDITION: return createPostCondition();
      case BeeLangPackage.ASSERTION_EXPRESSION: return createAssertionExpression();
      case BeeLangPackage.EXPRESSION_LIST: return createExpressionList();
      case BeeLangPackage.CONTEXT: return createContext();
      case BeeLangPackage.CONTEXT_SELECTOR: return createContextSelector();
      case BeeLangPackage.EXPRESSION_SELECTOR: return createExpressionSelector();
      case BeeLangPackage.UNIT_SELECTOR: return createUnitSelector();
      case BeeLangPackage.VERSION: return createVersion();
      case BeeLangPackage.VERSION_RANGE: return createVersionRange();
      case BeeLangPackage.COMPOUNDD_REFERENCES: return createCompounddReferences();
      case BeeLangPackage.VARARG_PARAMETER_DECLARATION: return createVarargParameterDeclaration();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BeeLangPackage.SELECTOR_OPERATOR:
        return createSelectorOperatorFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BeeLangPackage.SELECTOR_OPERATOR:
        return convertSelectorOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeModel createBeeModel()
  {
    BeeModelImpl beeModel = new BeeModelImpl();
    return beeModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildUnit createBuildUnit()
  {
    BuildUnitImpl buildUnit = new BuildUnitImpl();
    return buildUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedCapability createProvidedCapability()
  {
    ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
    return providedCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredCapability createRequiredCapability()
  {
    RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
    return requiredCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredCapability createFilteredCapability()
  {
    FilteredCapabilityImpl filteredCapability = new FilteredCapabilityImpl();
    return filteredCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability createCapability()
  {
    CapabilityImpl capability = new CapabilityImpl();
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedPropertySet createNamedPropertySet()
  {
    NamedPropertySetImpl namedPropertySet = new NamedPropertySetImpl();
    return namedPropertySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySet createPropertySet()
  {
    PropertySetImpl propertySet = new PropertySetImpl();
    return propertySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyOperation createPropertyOperation()
  {
    PropertyOperationImpl propertyOperation = new PropertyOperationImpl();
    return propertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredPropertyOperation createFilteredPropertyOperation()
  {
    FilteredPropertyOperationImpl filteredPropertyOperation = new FilteredPropertyOperationImpl();
    return filteredPropertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetPropertyOperation createSetPropertyOperation()
  {
    SetPropertyOperationImpl setPropertyOperation = new SetPropertyOperationImpl();
    return setPropertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsetPropertyOperation createUnsetPropertyOperation()
  {
    UnsetPropertyOperationImpl unsetPropertyOperation = new UnsetPropertyOperationImpl();
    return unsetPropertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Synchronization createSynchronization()
  {
    SynchronizationImpl synchronization = new SynchronizationImpl();
    return synchronization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathGroup createPathGroup()
  {
    PathGroupImpl pathGroup = new PathGroupImpl();
    return pathGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathVectorElement createPathVectorElement()
  {
    PathVectorElementImpl pathVectorElement = new PathVectorElementImpl();
    return pathVectorElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilteredPathVector createFilteredPathVector()
  {
    FilteredPathVectorImpl filteredPathVector = new FilteredPathVectorImpl();
    return filteredPathVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathVector createPathVector()
  {
    PathVectorImpl pathVector = new PathVectorImpl();
    return pathVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundPathVector createCompoundPathVector()
  {
    CompoundPathVectorImpl compoundPathVector = new CompoundPathVectorImpl();
    return compoundPathVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prerequisite createPrerequisite()
  {
    PrerequisiteImpl prerequisite = new PrerequisiteImpl();
    return prerequisite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithClause createWithClause()
  {
    WithClauseImpl withClause = new WithClauseImpl();
    return withClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrerequisiteEntry createPrerequisiteEntry()
  {
    PrerequisiteEntryImpl prerequisiteEntry = new PrerequisiteEntryImpl();
    return prerequisiteEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectPartReferemce createDirectPartReferemce()
  {
    DirectPartReferemceImpl directPartReferemce = new DirectPartReferemceImpl();
    return directPartReferemce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityReferencedPart createCapabilityReferencedPart()
  {
    CapabilityReferencedPartImpl capabilityReferencedPart = new CapabilityReferencedPartImpl();
    return capabilityReferencedPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundReferences createCompoundReferences()
  {
    CompoundReferencesImpl compoundReferences = new CompoundReferencesImpl();
    return compoundReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Builder createBuilder()
  {
    BuilderImpl builder = new BuilderImpl();
    return builder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclarationList createParameterDeclarationList()
  {
    ParameterDeclarationListImpl parameterDeclarationList = new ParameterDeclarationListImpl();
    return parameterDeclarationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuilderOutput createBuilderOutput()
  {
    BuilderOutputImpl builderOutput = new BuilderOutputImpl();
    return builderOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuilderInput createBuilderInput()
  {
    BuilderInputImpl builderInput = new BuilderInputImpl();
    return builderInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryConfiguration createRepositoryConfiguration()
  {
    RepositoryConfigurationImpl repositoryConfiguration = new RepositoryConfigurationImpl();
    return repositoryConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryDeclaration createRepositoryDeclaration()
  {
    RepositoryDeclarationImpl repositoryDeclaration = new RepositoryDeclarationImpl();
    return repositoryDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolutionStrategy createResolutionStrategy()
  {
    ResolutionStrategyImpl resolutionStrategy = new ResolutionStrategyImpl();
    return resolutionStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerConfiguration createContainerConfiguration()
  {
    ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
    return containerConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concern createConcern()
  {
    ConcernImpl concern = new ConcernImpl();
    return concern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcernBlock createConcernBlock()
  {
    ConcernBlockImpl concernBlock = new ConcernBlockImpl();
    return concernBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryPath createQueryPath()
  {
    QueryPathImpl queryPath = new QueryPathImpl();
    return queryPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreCondition createPreCondition()
  {
    PreConditionImpl preCondition = new PreConditionImpl();
    return preCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostCondition createPostCondition()
  {
    PostConditionImpl postCondition = new PostConditionImpl();
    return postCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionExpression createAssertionExpression()
  {
    AssertionExpressionImpl assertionExpression = new AssertionExpressionImpl();
    return assertionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextSelector createContextSelector()
  {
    ContextSelectorImpl contextSelector = new ContextSelectorImpl();
    return contextSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionSelector createExpressionSelector()
  {
    ExpressionSelectorImpl expressionSelector = new ExpressionSelectorImpl();
    return expressionSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitSelector createUnitSelector()
  {
    UnitSelectorImpl unitSelector = new UnitSelectorImpl();
    return unitSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionRange createVersionRange()
  {
    VersionRangeImpl versionRange = new VersionRangeImpl();
    return versionRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompounddReferences createCompounddReferences()
  {
    CompounddReferencesImpl compounddReferences = new CompounddReferencesImpl();
    return compounddReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarargParameterDeclaration createVarargParameterDeclaration()
  {
    VarargParameterDeclarationImpl varargParameterDeclaration = new VarargParameterDeclarationImpl();
    return varargParameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectorOperator createSelectorOperatorFromString(EDataType eDataType, String initialValue)
  {
    SelectorOperator result = SelectorOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSelectorOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangPackage getBeeLangPackage()
  {
    return (BeeLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BeeLangPackage getPackage()
  {
    return BeeLangPackage.eINSTANCE;
  }

} //BeeLangFactoryImpl
