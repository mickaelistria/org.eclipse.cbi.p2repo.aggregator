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
