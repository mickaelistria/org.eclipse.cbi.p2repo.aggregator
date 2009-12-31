/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import org.eclipse.b3.beeLang.*;

import org.eclipse.emf.ecore.EClass;
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
      case BeeLangPackage.SET_PROPERTY_OPERATION: return createSetPropertyOperation();
      case BeeLangPackage.UNSET_PROPERTY_OPERATION: return createUnsetPropertyOperation();
      case BeeLangPackage.SYNCHRONIZATION: return createSynchronization();
      case BeeLangPackage.PARAMETER_DECLARATION_LIST: return createParameterDeclarationList();
      case BeeLangPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case BeeLangPackage.BUILDER_OUTPUT: return createBuilderOutput();
      case BeeLangPackage.REPOSITORY_CONFIGURATION: return createRepositoryConfiguration();
      case BeeLangPackage.REPOSITORY_DECLARATION: return createRepositoryDeclaration();
      case BeeLangPackage.RESOLUTION_STRATEGY: return createResolutionStrategy();
      case BeeLangPackage.CONTAINER_CONFIGURATION: return createContainerConfiguration();
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
