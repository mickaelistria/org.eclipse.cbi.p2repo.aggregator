/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.util;

import org.eclipse.b3.beeLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.beeLang.BeeLangPackage
 * @generated
 */
public class BeeLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BeeLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BeeLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeeLangSwitch<Adapter> modelSwitch =
    new BeeLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseBeeModel(BeeModel object)
      {
        return createBeeModelAdapter();
      }
      @Override
      public Adapter caseBuildUnit(BuildUnit object)
      {
        return createBuildUnitAdapter();
      }
      @Override
      public Adapter caseProvidedCapability(ProvidedCapability object)
      {
        return createProvidedCapabilityAdapter();
      }
      @Override
      public Adapter caseRequiredCapability(RequiredCapability object)
      {
        return createRequiredCapabilityAdapter();
      }
      @Override
      public Adapter caseFilteredCapability(FilteredCapability object)
      {
        return createFilteredCapabilityAdapter();
      }
      @Override
      public Adapter caseCapability(Capability object)
      {
        return createCapabilityAdapter();
      }
      @Override
      public Adapter caseSetPropertyOperation(SetPropertyOperation object)
      {
        return createSetPropertyOperationAdapter();
      }
      @Override
      public Adapter caseUnsetPropertyOperation(UnsetPropertyOperation object)
      {
        return createUnsetPropertyOperationAdapter();
      }
      @Override
      public Adapter caseSynchronization(Synchronization object)
      {
        return createSynchronizationAdapter();
      }
      @Override
      public Adapter casePathGroup(PathGroup object)
      {
        return createPathGroupAdapter();
      }
      @Override
      public Adapter casePathVectorElement(PathVectorElement object)
      {
        return createPathVectorElementAdapter();
      }
      @Override
      public Adapter caseFilteredPathVector(FilteredPathVector object)
      {
        return createFilteredPathVectorAdapter();
      }
      @Override
      public Adapter casePathVector(PathVector object)
      {
        return createPathVectorAdapter();
      }
      @Override
      public Adapter caseCompoundPathVector(CompoundPathVector object)
      {
        return createCompoundPathVectorAdapter();
      }
      @Override
      public Adapter casePrerequisite(Prerequisite object)
      {
        return createPrerequisiteAdapter();
      }
      @Override
      public Adapter caseWithClause(WithClause object)
      {
        return createWithClauseAdapter();
      }
      @Override
      public Adapter casePrerequisiteEntry(PrerequisiteEntry object)
      {
        return createPrerequisiteEntryAdapter();
      }
      @Override
      public Adapter caseDirectPartReferemce(DirectPartReferemce object)
      {
        return createDirectPartReferemceAdapter();
      }
      @Override
      public Adapter caseCapabilityReferencedPart(CapabilityReferencedPart object)
      {
        return createCapabilityReferencedPartAdapter();
      }
      @Override
      public Adapter caseCompoundReferences(CompoundReferences object)
      {
        return createCompoundReferencesAdapter();
      }
      @Override
      public Adapter caseBuilder(Builder object)
      {
        return createBuilderAdapter();
      }
      @Override
      public Adapter caseParameterDeclarationList(ParameterDeclarationList object)
      {
        return createParameterDeclarationListAdapter();
      }
      @Override
      public Adapter caseParameterDeclaration(ParameterDeclaration object)
      {
        return createParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseBuilderOutput(BuilderOutput object)
      {
        return createBuilderOutputAdapter();
      }
      @Override
      public Adapter caseBuilderInput(BuilderInput object)
      {
        return createBuilderInputAdapter();
      }
      @Override
      public Adapter caseRepositoryConfiguration(RepositoryConfiguration object)
      {
        return createRepositoryConfigurationAdapter();
      }
      @Override
      public Adapter caseRepositoryDeclaration(RepositoryDeclaration object)
      {
        return createRepositoryDeclarationAdapter();
      }
      @Override
      public Adapter caseResolutionStrategy(ResolutionStrategy object)
      {
        return createResolutionStrategyAdapter();
      }
      @Override
      public Adapter caseContainerConfiguration(ContainerConfiguration object)
      {
        return createContainerConfigurationAdapter();
      }
      @Override
      public Adapter caseConcern(Concern object)
      {
        return createConcernAdapter();
      }
      @Override
      public Adapter caseConcernBlock(ConcernBlock object)
      {
        return createConcernBlockAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter casePreCondition(PreCondition object)
      {
        return createPreConditionAdapter();
      }
      @Override
      public Adapter casePostCondition(PostCondition object)
      {
        return createPostConditionAdapter();
      }
      @Override
      public Adapter caseAssertionExpression(AssertionExpression object)
      {
        return createAssertionExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionList(ExpressionList object)
      {
        return createExpressionListAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseContextSelector(ContextSelector object)
      {
        return createContextSelectorAdapter();
      }
      @Override
      public Adapter caseExpressionSelector(ExpressionSelector object)
      {
        return createExpressionSelectorAdapter();
      }
      @Override
      public Adapter caseUnitSelector(UnitSelector object)
      {
        return createUnitSelectorAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseVersionRange(VersionRange object)
      {
        return createVersionRangeAdapter();
      }
      @Override
      public Adapter caseCompounddReferences(CompounddReferences object)
      {
        return createCompounddReferencesAdapter();
      }
      @Override
      public Adapter caseVarargParameterDeclaration(VarargParameterDeclaration object)
      {
        return createVarargParameterDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.BeeModel <em>Bee Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.BeeModel
   * @generated
   */
  public Adapter createBeeModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.BuildUnit <em>Build Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.BuildUnit
   * @generated
   */
  public Adapter createBuildUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ProvidedCapability <em>Provided Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ProvidedCapability
   * @generated
   */
  public Adapter createProvidedCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.RequiredCapability <em>Required Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.RequiredCapability
   * @generated
   */
  public Adapter createRequiredCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.FilteredCapability <em>Filtered Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.FilteredCapability
   * @generated
   */
  public Adapter createFilteredCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Capability
   * @generated
   */
  public Adapter createCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.SetPropertyOperation <em>Set Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation
   * @generated
   */
  public Adapter createSetPropertyOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.UnsetPropertyOperation <em>Unset Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.UnsetPropertyOperation
   * @generated
   */
  public Adapter createUnsetPropertyOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Synchronization
   * @generated
   */
  public Adapter createSynchronizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PathGroup <em>Path Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PathGroup
   * @generated
   */
  public Adapter createPathGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PathVectorElement <em>Path Vector Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PathVectorElement
   * @generated
   */
  public Adapter createPathVectorElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.FilteredPathVector <em>Filtered Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.FilteredPathVector
   * @generated
   */
  public Adapter createFilteredPathVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PathVector <em>Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PathVector
   * @generated
   */
  public Adapter createPathVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.CompoundPathVector <em>Compound Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.CompoundPathVector
   * @generated
   */
  public Adapter createCompoundPathVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Prerequisite <em>Prerequisite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Prerequisite
   * @generated
   */
  public Adapter createPrerequisiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.WithClause <em>With Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.WithClause
   * @generated
   */
  public Adapter createWithClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PrerequisiteEntry <em>Prerequisite Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PrerequisiteEntry
   * @generated
   */
  public Adapter createPrerequisiteEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.DirectPartReferemce <em>Direct Part Referemce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.DirectPartReferemce
   * @generated
   */
  public Adapter createDirectPartReferemceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart <em>Capability Referenced Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart
   * @generated
   */
  public Adapter createCapabilityReferencedPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.CompoundReferences <em>Compound References</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.CompoundReferences
   * @generated
   */
  public Adapter createCompoundReferencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Builder <em>Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Builder
   * @generated
   */
  public Adapter createBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ParameterDeclarationList <em>Parameter Declaration List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ParameterDeclarationList
   * @generated
   */
  public Adapter createParameterDeclarationListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ParameterDeclaration
   * @generated
   */
  public Adapter createParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.BuilderOutput <em>Builder Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.BuilderOutput
   * @generated
   */
  public Adapter createBuilderOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.BuilderInput <em>Builder Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.BuilderInput
   * @generated
   */
  public Adapter createBuilderInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.RepositoryConfiguration <em>Repository Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.RepositoryConfiguration
   * @generated
   */
  public Adapter createRepositoryConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.RepositoryDeclaration <em>Repository Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration
   * @generated
   */
  public Adapter createRepositoryDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ResolutionStrategy <em>Resolution Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ResolutionStrategy
   * @generated
   */
  public Adapter createResolutionStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ContainerConfiguration <em>Container Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration
   * @generated
   */
  public Adapter createContainerConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Concern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Concern
   * @generated
   */
  public Adapter createConcernAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ConcernBlock <em>Concern Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ConcernBlock
   * @generated
   */
  public Adapter createConcernBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PreCondition <em>Pre Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PreCondition
   * @generated
   */
  public Adapter createPreConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.PostCondition <em>Post Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.PostCondition
   * @generated
   */
  public Adapter createPostConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.AssertionExpression <em>Assertion Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.AssertionExpression
   * @generated
   */
  public Adapter createAssertionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ExpressionList
   * @generated
   */
  public Adapter createExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ContextSelector <em>Context Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ContextSelector
   * @generated
   */
  public Adapter createContextSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.ExpressionSelector <em>Expression Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.ExpressionSelector
   * @generated
   */
  public Adapter createExpressionSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.UnitSelector <em>Unit Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.UnitSelector
   * @generated
   */
  public Adapter createUnitSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.VersionRange <em>Version Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.VersionRange
   * @generated
   */
  public Adapter createVersionRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.CompounddReferences <em>Compoundd References</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.CompounddReferences
   * @generated
   */
  public Adapter createCompounddReferencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.b3.beeLang.VarargParameterDeclaration <em>Vararg Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.b3.beeLang.VarargParameterDeclaration
   * @generated
   */
  public Adapter createVarargParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BeeLangAdapterFactory
