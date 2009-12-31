/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.beeLang.BeeLangFactory
 * @model kind="package"
 * @generated
 */
public interface BeeLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "beeLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/b3/BeeLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "beeLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BeeLangPackage eINSTANCE = org.eclipse.b3.beeLang.impl.BeeLangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.BeeModelImpl <em>Bee Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.BeeModelImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBeeModel()
   * @generated
   */
  int BEE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL__FUNCTIONS = 1;

  /**
   * The feature id for the '<em><b>Concern</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL__CONCERN = 2;

  /**
   * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL__PROPERTY_SETS = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL__BODY = 4;

  /**
   * The number of structural features of the '<em>Bee Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEE_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.BuildUnitImpl <em>Build Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.BuildUnitImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuildUnit()
   * @generated
   */
  int BUILD_UNIT = 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__EXECUTION_MODE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__NAME = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__VERSION = 3;

  /**
   * The feature id for the '<em><b>Implements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__IMPLEMENTS = 4;

  /**
   * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__DEFAULT_PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__PROVIDED_CAPABILITIES = 6;

  /**
   * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__REQUIRED_CAPABILITIES = 7;

  /**
   * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__META_REQUIRED_CAPABILITIES = 8;

  /**
   * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__CONCERNS = 9;

  /**
   * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__SYNCHRONIZATIONS = 10;

  /**
   * The feature id for the '<em><b>Builders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__BUILDERS = 11;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__FUNCTIONS = 12;

  /**
   * The feature id for the '<em><b>Repository Configurations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__REPOSITORY_CONFIGURATIONS = 13;

  /**
   * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__PROPERTY_SETS = 14;

  /**
   * The feature id for the '<em><b>Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT__CONTAINERS = 15;

  /**
   * The number of structural features of the '<em>Build Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_UNIT_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl <em>Set Property Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getSetPropertyOperation()
   * @generated
   */
  int SET_PROPERTY_OPERATION = 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_OPERATION__FINAL = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_OPERATION__KEY = 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_OPERATION__OP = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_OPERATION__VALUE = 3;

  /**
   * The number of structural features of the '<em>Set Property Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.UnsetPropertyOperationImpl <em>Unset Property Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.UnsetPropertyOperationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getUnsetPropertyOperation()
   * @generated
   */
  int UNSET_PROPERTY_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_PROPERTY_OPERATION__KEY = 0;

  /**
   * The number of structural features of the '<em>Unset Property Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_PROPERTY_OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.SynchronizationImpl <em>Synchronization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.SynchronizationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getSynchronization()
   * @generated
   */
  int SYNCHRONIZATION = 4;

  /**
   * The feature id for the '<em><b>Partrefs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZATION__PARTREFS = 0;

  /**
   * The number of structural features of the '<em>Synchronization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl <em>Parameter Declaration List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterDeclarationList()
   * @generated
   */
  int PARAMETER_DECLARATION_LIST = 5;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Parameter Declaration List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ParameterDeclarationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 6;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.BuilderOutputImpl <em>Builder Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.BuilderOutputImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilderOutput()
   * @generated
   */
  int BUILDER_OUTPUT = 7;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_OUTPUT__BODY = 0;

  /**
   * The number of structural features of the '<em>Builder Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_OUTPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRepositoryConfiguration()
   * @generated
   */
  int REPOSITORY_CONFIGURATION = 8;

  /**
   * The number of structural features of the '<em>Repository Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_CONFIGURATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.RepositoryDeclarationImpl <em>Repository Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.RepositoryDeclarationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRepositoryDeclaration()
   * @generated
   */
  int REPOSITORY_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_DECLARATION__DOCUMENTATION = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_DECLARATION__LOCATION = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_DECLARATION__TYPE = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_DECLARATION__CONTEXT = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Repository Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_DECLARATION_FEATURE_COUNT = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ResolutionStrategyImpl <em>Resolution Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ResolutionStrategyImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getResolutionStrategy()
   * @generated
   */
  int RESOLUTION_STRATEGY = 10;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLUTION_STRATEGY__STRATEGY = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Repository Config</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLUTION_STRATEGY__REPOSITORY_CONFIG = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resolution Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLUTION_STRATEGY_FEATURE_COUNT = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ContainerConfigurationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContainerConfiguration()
   * @generated
   */
  int CONTAINER_CONFIGURATION = 11;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CONFIGURATION__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CONFIGURATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CONFIGURATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Context Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CONFIGURATION__CONTEXT_BLOCK = 3;

  /**
   * The number of structural features of the '<em>Container Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_CONFIGURATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl <em>Vararg Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVarargParameterDeclaration()
   * @generated
   */
  int VARARG_PARAMETER_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARARG_PARAMETER_DECLARATION__TYPE = PARAMETER_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARARG_PARAMETER_DECLARATION__NAME = PARAMETER_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vararg Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARARG_PARAMETER_DECLARATION_FEATURE_COUNT = PARAMETER_DECLARATION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.BeeModel <em>Bee Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bee Model</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel
   * @generated
   */
  EClass getBeeModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BeeModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel#getImports()
   * @see #getBeeModel()
   * @generated
   */
  EReference getBeeModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BeeModel#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel#getFunctions()
   * @see #getBeeModel()
   * @generated
   */
  EReference getBeeModel_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BeeModel#getConcern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concern</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel#getConcern()
   * @see #getBeeModel()
   * @generated
   */
  EReference getBeeModel_Concern();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BeeModel#getPropertySets <em>Property Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Sets</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel#getPropertySets()
   * @see #getBeeModel()
   * @generated
   */
  EReference getBeeModel_PropertySets();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BeeModel#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.b3.beeLang.BeeModel#getBody()
   * @see #getBeeModel()
   * @generated
   */
  EReference getBeeModel_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.BuildUnit <em>Build Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Unit</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit
   * @generated
   */
  EClass getBuildUnit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.BuildUnit#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getDocumentation()
   * @see #getBuildUnit()
   * @generated
   */
  EAttribute getBuildUnit_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.BuildUnit#getExecutionMode <em>Execution Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution Mode</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getExecutionMode()
   * @see #getBuildUnit()
   * @generated
   */
  EAttribute getBuildUnit_ExecutionMode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.BuildUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getName()
   * @see #getBuildUnit()
   * @generated
   */
  EAttribute getBuildUnit_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.BuildUnit#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getVersion()
   * @see #getBuildUnit()
   * @generated
   */
  EAttribute getBuildUnit_Version();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.b3.beeLang.BuildUnit#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Implements</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getImplements()
   * @see #getBuildUnit()
   * @generated
   */
  EAttribute getBuildUnit_Implements();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BuildUnit#getDefaultProperties <em>Default Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Properties</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getDefaultProperties()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_DefaultProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getProvidedCapabilities <em>Provided Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getProvidedCapabilities()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_ProvidedCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getRequiredCapabilities <em>Required Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getRequiredCapabilities()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_RequiredCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getMetaRequiredCapabilities()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_MetaRequiredCapabilities();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getConcerns <em>Concerns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concerns</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getConcerns()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Concerns();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getSynchronizations <em>Synchronizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getSynchronizations()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Synchronizations();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getBuilders <em>Builders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Builders</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getBuilders()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Builders();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getFunctions()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getRepositoryConfigurations <em>Repository Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repository Configurations</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getRepositoryConfigurations()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_RepositoryConfigurations();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getPropertySets <em>Property Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Sets</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getPropertySets()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_PropertySets();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuildUnit#getContainers <em>Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containers</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getContainers()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Containers();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.SetPropertyOperation <em>Set Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Property Operation</em>'.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation
   * @generated
   */
  EClass getSetPropertyOperation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.SetPropertyOperation#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation#isFinal()
   * @see #getSetPropertyOperation()
   * @generated
   */
  EAttribute getSetPropertyOperation_Final();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.SetPropertyOperation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation#getKey()
   * @see #getSetPropertyOperation()
   * @generated
   */
  EAttribute getSetPropertyOperation_Key();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.SetPropertyOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation#getOp()
   * @see #getSetPropertyOperation()
   * @generated
   */
  EAttribute getSetPropertyOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.SetPropertyOperation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.b3.beeLang.SetPropertyOperation#getValue()
   * @see #getSetPropertyOperation()
   * @generated
   */
  EReference getSetPropertyOperation_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.UnsetPropertyOperation <em>Unset Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unset Property Operation</em>'.
   * @see org.eclipse.b3.beeLang.UnsetPropertyOperation
   * @generated
   */
  EClass getUnsetPropertyOperation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.UnsetPropertyOperation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.b3.beeLang.UnsetPropertyOperation#getKey()
   * @see #getUnsetPropertyOperation()
   * @generated
   */
  EAttribute getUnsetPropertyOperation_Key();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Synchronization <em>Synchronization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronization</em>'.
   * @see org.eclipse.b3.beeLang.Synchronization
   * @generated
   */
  EClass getSynchronization();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.b3.beeLang.Synchronization#getPartrefs <em>Partrefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Partrefs</em>'.
   * @see org.eclipse.b3.beeLang.Synchronization#getPartrefs()
   * @see #getSynchronization()
   * @generated
   */
  EAttribute getSynchronization_Partrefs();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ParameterDeclarationList <em>Parameter Declaration List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration List</em>'.
   * @see org.eclipse.b3.beeLang.ParameterDeclarationList
   * @generated
   */
  EClass getParameterDeclarationList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.ParameterDeclarationList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.b3.beeLang.ParameterDeclarationList#getParams()
   * @see #getParameterDeclarationList()
   * @generated
   */
  EReference getParameterDeclarationList_Params();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see org.eclipse.b3.beeLang.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.BuilderOutput <em>Builder Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builder Output</em>'.
   * @see org.eclipse.b3.beeLang.BuilderOutput
   * @generated
   */
  EClass getBuilderOutput();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BuilderOutput#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.b3.beeLang.BuilderOutput#getBody()
   * @see #getBuilderOutput()
   * @generated
   */
  EReference getBuilderOutput_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.RepositoryConfiguration <em>Repository Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Configuration</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryConfiguration
   * @generated
   */
  EClass getRepositoryConfiguration();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.RepositoryDeclaration <em>Repository Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Declaration</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration
   * @generated
   */
  EClass getRepositoryDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.RepositoryDeclaration#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration#getDocumentation()
   * @see #getRepositoryDeclaration()
   * @generated
   */
  EAttribute getRepositoryDeclaration_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.RepositoryDeclaration#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration#getLocation()
   * @see #getRepositoryDeclaration()
   * @generated
   */
  EAttribute getRepositoryDeclaration_Location();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.RepositoryDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration#getType()
   * @see #getRepositoryDeclaration()
   * @generated
   */
  EReference getRepositoryDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.RepositoryDeclaration#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see org.eclipse.b3.beeLang.RepositoryDeclaration#getContext()
   * @see #getRepositoryDeclaration()
   * @generated
   */
  EReference getRepositoryDeclaration_Context();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ResolutionStrategy <em>Resolution Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resolution Strategy</em>'.
   * @see org.eclipse.b3.beeLang.ResolutionStrategy
   * @generated
   */
  EClass getResolutionStrategy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ResolutionStrategy#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see org.eclipse.b3.beeLang.ResolutionStrategy#getStrategy()
   * @see #getResolutionStrategy()
   * @generated
   */
  EAttribute getResolutionStrategy_Strategy();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.ResolutionStrategy#getRepositoryConfig <em>Repository Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repository Config</em>'.
   * @see org.eclipse.b3.beeLang.ResolutionStrategy#getRepositoryConfig()
   * @see #getResolutionStrategy()
   * @generated
   */
  EReference getResolutionStrategy_RepositoryConfig();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ContainerConfiguration <em>Container Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Configuration</em>'.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration
   * @generated
   */
  EClass getContainerConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ContainerConfiguration#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration#getDocumentation()
   * @see #getContainerConfiguration()
   * @generated
   */
  EAttribute getContainerConfiguration_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ContainerConfiguration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration#getName()
   * @see #getContainerConfiguration()
   * @generated
   */
  EAttribute getContainerConfiguration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ContainerConfiguration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration#getType()
   * @see #getContainerConfiguration()
   * @generated
   */
  EReference getContainerConfiguration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ContainerConfiguration#getContextBlock <em>Context Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context Block</em>'.
   * @see org.eclipse.b3.beeLang.ContainerConfiguration#getContextBlock()
   * @see #getContainerConfiguration()
   * @generated
   */
  EReference getContainerConfiguration_ContextBlock();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.VarargParameterDeclaration <em>Vararg Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vararg Parameter Declaration</em>'.
   * @see org.eclipse.b3.beeLang.VarargParameterDeclaration
   * @generated
   */
  EClass getVarargParameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.VarargParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.VarargParameterDeclaration#getType()
   * @see #getVarargParameterDeclaration()
   * @generated
   */
  EReference getVarargParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.VarargParameterDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.VarargParameterDeclaration#getName()
   * @see #getVarargParameterDeclaration()
   * @generated
   */
  EAttribute getVarargParameterDeclaration_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BeeLangFactory getBeeLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.BeeModelImpl <em>Bee Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.BeeModelImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBeeModel()
     * @generated
     */
    EClass BEE_MODEL = eINSTANCE.getBeeModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEE_MODEL__IMPORTS = eINSTANCE.getBeeModel_Imports();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEE_MODEL__FUNCTIONS = eINSTANCE.getBeeModel_Functions();

    /**
     * The meta object literal for the '<em><b>Concern</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEE_MODEL__CONCERN = eINSTANCE.getBeeModel_Concern();

    /**
     * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEE_MODEL__PROPERTY_SETS = eINSTANCE.getBeeModel_PropertySets();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEE_MODEL__BODY = eINSTANCE.getBeeModel_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.BuildUnitImpl <em>Build Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.BuildUnitImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuildUnit()
     * @generated
     */
    EClass BUILD_UNIT = eINSTANCE.getBuildUnit();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_UNIT__DOCUMENTATION = eINSTANCE.getBuildUnit_Documentation();

    /**
     * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_UNIT__EXECUTION_MODE = eINSTANCE.getBuildUnit_ExecutionMode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_UNIT__NAME = eINSTANCE.getBuildUnit_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_UNIT__VERSION = eINSTANCE.getBuildUnit_Version();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_UNIT__IMPLEMENTS = eINSTANCE.getBuildUnit_Implements();

    /**
     * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__DEFAULT_PROPERTIES = eINSTANCE.getBuildUnit_DefaultProperties();

    /**
     * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__PROVIDED_CAPABILITIES = eINSTANCE.getBuildUnit_ProvidedCapabilities();

    /**
     * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__REQUIRED_CAPABILITIES = eINSTANCE.getBuildUnit_RequiredCapabilities();

    /**
     * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__META_REQUIRED_CAPABILITIES = eINSTANCE.getBuildUnit_MetaRequiredCapabilities();

    /**
     * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__CONCERNS = eINSTANCE.getBuildUnit_Concerns();

    /**
     * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__SYNCHRONIZATIONS = eINSTANCE.getBuildUnit_Synchronizations();

    /**
     * The meta object literal for the '<em><b>Builders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__BUILDERS = eINSTANCE.getBuildUnit_Builders();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__FUNCTIONS = eINSTANCE.getBuildUnit_Functions();

    /**
     * The meta object literal for the '<em><b>Repository Configurations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__REPOSITORY_CONFIGURATIONS = eINSTANCE.getBuildUnit_RepositoryConfigurations();

    /**
     * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__PROPERTY_SETS = eINSTANCE.getBuildUnit_PropertySets();

    /**
     * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__CONTAINERS = eINSTANCE.getBuildUnit_Containers();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl <em>Set Property Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getSetPropertyOperation()
     * @generated
     */
    EClass SET_PROPERTY_OPERATION = eINSTANCE.getSetPropertyOperation();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_PROPERTY_OPERATION__FINAL = eINSTANCE.getSetPropertyOperation_Final();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_PROPERTY_OPERATION__KEY = eINSTANCE.getSetPropertyOperation_Key();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_PROPERTY_OPERATION__OP = eINSTANCE.getSetPropertyOperation_Op();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_PROPERTY_OPERATION__VALUE = eINSTANCE.getSetPropertyOperation_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.UnsetPropertyOperationImpl <em>Unset Property Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.UnsetPropertyOperationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getUnsetPropertyOperation()
     * @generated
     */
    EClass UNSET_PROPERTY_OPERATION = eINSTANCE.getUnsetPropertyOperation();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSET_PROPERTY_OPERATION__KEY = eINSTANCE.getUnsetPropertyOperation_Key();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.SynchronizationImpl <em>Synchronization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.SynchronizationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getSynchronization()
     * @generated
     */
    EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

    /**
     * The meta object literal for the '<em><b>Partrefs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYNCHRONIZATION__PARTREFS = eINSTANCE.getSynchronization_Partrefs();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl <em>Parameter Declaration List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterDeclarationList()
     * @generated
     */
    EClass PARAMETER_DECLARATION_LIST = eINSTANCE.getParameterDeclarationList();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION_LIST__PARAMS = eINSTANCE.getParameterDeclarationList_Params();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ParameterDeclarationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.BuilderOutputImpl <em>Builder Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.BuilderOutputImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilderOutput()
     * @generated
     */
    EClass BUILDER_OUTPUT = eINSTANCE.getBuilderOutput();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER_OUTPUT__BODY = eINSTANCE.getBuilderOutput_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRepositoryConfiguration()
     * @generated
     */
    EClass REPOSITORY_CONFIGURATION = eINSTANCE.getRepositoryConfiguration();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.RepositoryDeclarationImpl <em>Repository Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.RepositoryDeclarationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRepositoryDeclaration()
     * @generated
     */
    EClass REPOSITORY_DECLARATION = eINSTANCE.getRepositoryDeclaration();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_DECLARATION__DOCUMENTATION = eINSTANCE.getRepositoryDeclaration_Documentation();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_DECLARATION__LOCATION = eINSTANCE.getRepositoryDeclaration_Location();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY_DECLARATION__TYPE = eINSTANCE.getRepositoryDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY_DECLARATION__CONTEXT = eINSTANCE.getRepositoryDeclaration_Context();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ResolutionStrategyImpl <em>Resolution Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ResolutionStrategyImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getResolutionStrategy()
     * @generated
     */
    EClass RESOLUTION_STRATEGY = eINSTANCE.getResolutionStrategy();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOLUTION_STRATEGY__STRATEGY = eINSTANCE.getResolutionStrategy_Strategy();

    /**
     * The meta object literal for the '<em><b>Repository Config</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOLUTION_STRATEGY__REPOSITORY_CONFIG = eINSTANCE.getResolutionStrategy_RepositoryConfig();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ContainerConfigurationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContainerConfiguration()
     * @generated
     */
    EClass CONTAINER_CONFIGURATION = eINSTANCE.getContainerConfiguration();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CONFIGURATION__DOCUMENTATION = eINSTANCE.getContainerConfiguration_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_CONFIGURATION__NAME = eINSTANCE.getContainerConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_CONFIGURATION__TYPE = eINSTANCE.getContainerConfiguration_Type();

    /**
     * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_CONFIGURATION__CONTEXT_BLOCK = eINSTANCE.getContainerConfiguration_ContextBlock();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl <em>Vararg Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVarargParameterDeclaration()
     * @generated
     */
    EClass VARARG_PARAMETER_DECLARATION = eINSTANCE.getVarargParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARARG_PARAMETER_DECLARATION__TYPE = eINSTANCE.getVarargParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARARG_PARAMETER_DECLARATION__NAME = eINSTANCE.getVarargParameterDeclaration_Name();

  }

} //BeeLangPackage
