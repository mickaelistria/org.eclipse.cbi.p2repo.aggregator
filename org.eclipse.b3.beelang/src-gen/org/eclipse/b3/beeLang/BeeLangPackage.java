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
   * The feature id for the '<em><b>Version</b></em>' containment reference.
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
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ProvidedCapabilityImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getProvidedCapability()
   * @generated
   */
  int PROVIDED_CAPABILITY = 2;

  /**
   * The feature id for the '<em><b>Capability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__CAPABILITY = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY__VERSION = 1;

  /**
   * The number of structural features of the '<em>Provided Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.RequiredCapabilityImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRequiredCapability()
   * @generated
   */
  int REQUIRED_CAPABILITY = 3;

  /**
   * The feature id for the '<em><b>Capability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__CAPABILITY = 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY__RANGE = 1;

  /**
   * The number of structural features of the '<em>Required Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.FilteredCapabilityImpl <em>Filtered Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.FilteredCapabilityImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilteredCapability()
   * @generated
   */
  int FILTERED_CAPABILITY = 4;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_CAPABILITY__FILTER = 0;

  /**
   * The feature id for the '<em><b>Capability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_CAPABILITY__CAPABILITY = 1;

  /**
   * The number of structural features of the '<em>Filtered Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.CapabilityImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 5;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = 1;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl <em>Set Property Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.SetPropertyOperationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getSetPropertyOperation()
   * @generated
   */
  int SET_PROPERTY_OPERATION = 6;

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
  int UNSET_PROPERTY_OPERATION = 7;

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
  int SYNCHRONIZATION = 8;

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
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PathGroupImpl <em>Path Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PathGroupImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathGroup()
   * @generated
   */
  int PATH_GROUP = 9;

  /**
   * The feature id for the '<em><b>Paths</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_GROUP__PATHS = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_GROUP__ANNOTATIONS = 1;

  /**
   * The number of structural features of the '<em>Path Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PathVectorElementImpl <em>Path Vector Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PathVectorElementImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathVectorElement()
   * @generated
   */
  int PATH_VECTOR_ELEMENT = 10;

  /**
   * The number of structural features of the '<em>Path Vector Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_VECTOR_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.FilteredPathVectorImpl <em>Filtered Path Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.FilteredPathVectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilteredPathVector()
   * @generated
   */
  int FILTERED_PATH_VECTOR = 11;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_PATH_VECTOR__FILTER = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_PATH_VECTOR__BODY = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Filtered Path Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTERED_PATH_VECTOR_FEATURE_COUNT = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PathVectorImpl <em>Path Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PathVectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathVector()
   * @generated
   */
  int PATH_VECTOR = 12;

  /**
   * The feature id for the '<em><b>Base Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_VECTOR__BASE_PATH = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Paths</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_VECTOR__PATHS = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Path Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_VECTOR_FEATURE_COUNT = PATH_VECTOR_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.CompoundPathVectorImpl <em>Compound Path Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.CompoundPathVectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompoundPathVector()
   * @generated
   */
  int COMPOUND_PATH_VECTOR = 13;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_PATH_VECTOR__BODY = 0;

  /**
   * The number of structural features of the '<em>Compound Path Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_PATH_VECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PrerequisiteImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPrerequisite()
   * @generated
   */
  int PREREQUISITE = 14;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE__FILTER = 0;

  /**
   * The feature id for the '<em><b>With Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE__WITH_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Part Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE__PART_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE__ALIAS = 3;

  /**
   * The number of structural features of the '<em>Prerequisite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.WithClauseImpl <em>With Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.WithClauseImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getWithClause()
   * @generated
   */
  int WITH_CLAUSE = 15;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__REFERENCES = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Concern</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE__CONCERN = 2;

  /**
   * The number of structural features of the '<em>With Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PrerequisiteEntryImpl <em>Prerequisite Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PrerequisiteEntryImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPrerequisiteEntry()
   * @generated
   */
  int PREREQUISITE_ENTRY = 16;

  /**
   * The number of structural features of the '<em>Prerequisite Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREREQUISITE_ENTRY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.DirectPartReferemceImpl <em>Direct Part Referemce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.DirectPartReferemceImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getDirectPartReferemce()
   * @generated
   */
  int DIRECT_PART_REFEREMCE = 17;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_PART_REFEREMCE__UNIT = PREREQUISITE_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Builder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_PART_REFEREMCE__BUILDER = PREREQUISITE_ENTRY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_PART_REFEREMCE__PARAMETERS = PREREQUISITE_ENTRY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Direct Part Referemce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_PART_REFEREMCE_FEATURE_COUNT = PREREQUISITE_ENTRY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.CapabilityReferencedPartImpl <em>Capability Referenced Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.CapabilityReferencedPartImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCapabilityReferencedPart()
   * @generated
   */
  int CAPABILITY_REFERENCED_PART = 18;

  /**
   * The feature id for the '<em><b>Capability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_REFERENCED_PART__CAPABILITY = PREREQUISITE_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_REFERENCED_PART__RANGE = PREREQUISITE_ENTRY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Part Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_REFERENCED_PART__PART_NAME = PREREQUISITE_ENTRY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_REFERENCED_PART__PARAMETERS = PREREQUISITE_ENTRY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Capability Referenced Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_REFERENCED_PART_FEATURE_COUNT = PREREQUISITE_ENTRY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.CompoundReferencesImpl <em>Compound References</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.CompoundReferencesImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompoundReferences()
   * @generated
   */
  int COMPOUND_REFERENCES = 19;

  /**
   * The number of structural features of the '<em>Compound References</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_REFERENCES_FEATURE_COUNT = PREREQUISITE_ENTRY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.BuilderImpl <em>Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.BuilderImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilder()
   * @generated
   */
  int BUILDER = 20;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__VISIBILITY = 1;

  /**
   * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__EXECUTION_MODE = 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__FINAL = 3;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__CACHED = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__NAME = 5;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__PARAMS = 6;

  /**
   * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__PROVIDED_CAPABILITIES = 7;

  /**
   * The feature id for the '<em><b>Pre Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__PRE_CONDITION = 8;

  /**
   * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__POST_CONDITION = 9;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__PROPERTIES = 10;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__INPUT = 11;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__OUTPUT = 12;

  /**
   * The feature id for the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER__EXPRESSION_LIST = 13;

  /**
   * The number of structural features of the '<em>Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl <em>Parameter Declaration List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ParameterDeclarationListImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterDeclarationList()
   * @generated
   */
  int PARAMETER_DECLARATION_LIST = 21;

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
  int PARAMETER_DECLARATION = 22;

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
  int BUILDER_OUTPUT = 23;

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
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.BuilderInputImpl <em>Builder Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.BuilderInputImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilderInput()
   * @generated
   */
  int BUILDER_INPUT = 24;

  /**
   * The feature id for the '<em><b>Pre Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_INPUT__PRE_CONDITION = 0;

  /**
   * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_INPUT__POST_CONDITION = 1;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_INPUT__PREREQUISITES = 2;

  /**
   * The number of structural features of the '<em>Builder Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILDER_INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.RepositoryConfigurationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRepositoryConfiguration()
   * @generated
   */
  int REPOSITORY_CONFIGURATION = 25;

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
  int REPOSITORY_DECLARATION = 26;

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
  int RESOLUTION_STRATEGY = 27;

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
  int CONTAINER_CONFIGURATION = 28;

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
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ConcernImpl <em>Concern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ConcernImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getConcern()
   * @generated
   */
  int CONCERN = 29;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__DOCUMENTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__NAME = 1;

  /**
   * The feature id for the '<em><b>Concern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN__CONCERN = 2;

  /**
   * The number of structural features of the '<em>Concern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ConcernBlockImpl <em>Concern Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ConcernBlockImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getConcernBlock()
   * @generated
   */
  int CONCERN_BLOCK = 30;

  /**
   * The feature id for the '<em><b>Super Concerns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_BLOCK__SUPER_CONCERNS = 0;

  /**
   * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_BLOCK__CONTEXTS = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_BLOCK__FUNCTIONS = 2;

  /**
   * The number of structural features of the '<em>Concern Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCERN_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.FilterImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 31;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PreConditionImpl <em>Pre Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PreConditionImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPreCondition()
   * @generated
   */
  int PRE_CONDITION = 32;

  /**
   * The feature id for the '<em><b>Asserts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_CONDITION__ASSERTS = 0;

  /**
   * The number of structural features of the '<em>Pre Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.PostConditionImpl <em>Post Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.PostConditionImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPostCondition()
   * @generated
   */
  int POST_CONDITION = 33;

  /**
   * The feature id for the '<em><b>Asserts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CONDITION__ASSERTS = 0;

  /**
   * The number of structural features of the '<em>Post Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.AssertionExpressionImpl <em>Assertion Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.AssertionExpressionImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getAssertionExpression()
   * @generated
   */
  int ASSERTION_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_EXPRESSION__EXPR = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_EXPRESSION__MESSAGE = 1;

  /**
   * The number of structural features of the '<em>Assertion Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ExpressionListImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 35;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ContextImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 36;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__SELECTOR = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ContextSelectorImpl <em>Context Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ContextSelectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContextSelector()
   * @generated
   */
  int CONTEXT_SELECTOR = 37;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SELECTOR__TYPE = 0;

  /**
   * The number of structural features of the '<em>Context Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_SELECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ExpressionSelectorImpl <em>Expression Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ExpressionSelectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getExpressionSelector()
   * @generated
   */
  int EXPRESSION_SELECTOR = 38;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SELECTOR__TYPE = CONTEXT_SELECTOR__TYPE;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SELECTOR__EXPR = CONTEXT_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SELECTOR_FEATURE_COUNT = CONTEXT_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.UnitSelectorImpl <em>Unit Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.UnitSelectorImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getUnitSelector()
   * @generated
   */
  int UNIT_SELECTOR = 39;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR__TYPE = CONTEXT_SELECTOR__TYPE;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR__INTERFACE = CONTEXT_SELECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR__NAME = CONTEXT_SELECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR__NAME_PATTERN = CONTEXT_SELECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Version Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR__VERSION_RANGE = CONTEXT_SELECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Unit Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_SELECTOR_FEATURE_COUNT = CONTEXT_SELECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.VersionImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 40;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__VERSION = 0;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.VersionRangeImpl <em>Version Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.VersionRangeImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVersionRange()
   * @generated
   */
  int VERSION_RANGE = 41;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE__RANGE = 0;

  /**
   * The number of structural features of the '<em>Version Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_RANGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.CompounddReferencesImpl <em>Compoundd References</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.CompounddReferencesImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompounddReferences()
   * @generated
   */
  int COMPOUNDD_REFERENCES = 42;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUNDD_REFERENCES__PREREQUISITES = COMPOUND_REFERENCES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compoundd References</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUNDD_REFERENCES_FEATURE_COUNT = COMPOUND_REFERENCES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl <em>Vararg Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.VarargParameterDeclarationImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVarargParameterDeclaration()
   * @generated
   */
  int VARARG_PARAMETER_DECLARATION = 43;

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
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BuildUnit#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see org.eclipse.b3.beeLang.BuildUnit#getVersion()
   * @see #getBuildUnit()
   * @generated
   */
  EReference getBuildUnit_Version();

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
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ProvidedCapability <em>Provided Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Capability</em>'.
   * @see org.eclipse.b3.beeLang.ProvidedCapability
   * @generated
   */
  EClass getProvidedCapability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ProvidedCapability#getCapability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capability</em>'.
   * @see org.eclipse.b3.beeLang.ProvidedCapability#getCapability()
   * @see #getProvidedCapability()
   * @generated
   */
  EReference getProvidedCapability_Capability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ProvidedCapability#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see org.eclipse.b3.beeLang.ProvidedCapability#getVersion()
   * @see #getProvidedCapability()
   * @generated
   */
  EReference getProvidedCapability_Version();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.RequiredCapability <em>Required Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Capability</em>'.
   * @see org.eclipse.b3.beeLang.RequiredCapability
   * @generated
   */
  EClass getRequiredCapability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.RequiredCapability#getCapability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capability</em>'.
   * @see org.eclipse.b3.beeLang.RequiredCapability#getCapability()
   * @see #getRequiredCapability()
   * @generated
   */
  EReference getRequiredCapability_Capability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.RequiredCapability#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.eclipse.b3.beeLang.RequiredCapability#getRange()
   * @see #getRequiredCapability()
   * @generated
   */
  EReference getRequiredCapability_Range();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.FilteredCapability <em>Filtered Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filtered Capability</em>'.
   * @see org.eclipse.b3.beeLang.FilteredCapability
   * @generated
   */
  EClass getFilteredCapability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.FilteredCapability#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.eclipse.b3.beeLang.FilteredCapability#getFilter()
   * @see #getFilteredCapability()
   * @generated
   */
  EReference getFilteredCapability_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.FilteredCapability#getCapability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capability</em>'.
   * @see org.eclipse.b3.beeLang.FilteredCapability#getCapability()
   * @see #getFilteredCapability()
   * @generated
   */
  EReference getFilteredCapability_Capability();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see org.eclipse.b3.beeLang.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Capability#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see org.eclipse.b3.beeLang.Capability#getInterface()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Interface();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

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
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PathGroup <em>Path Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Group</em>'.
   * @see org.eclipse.b3.beeLang.PathGroup
   * @generated
   */
  EClass getPathGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.PathGroup#getPaths <em>Paths</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paths</em>'.
   * @see org.eclipse.b3.beeLang.PathGroup#getPaths()
   * @see #getPathGroup()
   * @generated
   */
  EReference getPathGroup_Paths();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.PathGroup#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations</em>'.
   * @see org.eclipse.b3.beeLang.PathGroup#getAnnotations()
   * @see #getPathGroup()
   * @generated
   */
  EReference getPathGroup_Annotations();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PathVectorElement <em>Path Vector Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Vector Element</em>'.
   * @see org.eclipse.b3.beeLang.PathVectorElement
   * @generated
   */
  EClass getPathVectorElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.FilteredPathVector <em>Filtered Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filtered Path Vector</em>'.
   * @see org.eclipse.b3.beeLang.FilteredPathVector
   * @generated
   */
  EClass getFilteredPathVector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.FilteredPathVector#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.eclipse.b3.beeLang.FilteredPathVector#getFilter()
   * @see #getFilteredPathVector()
   * @generated
   */
  EReference getFilteredPathVector_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.FilteredPathVector#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.b3.beeLang.FilteredPathVector#getBody()
   * @see #getFilteredPathVector()
   * @generated
   */
  EReference getFilteredPathVector_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PathVector <em>Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Vector</em>'.
   * @see org.eclipse.b3.beeLang.PathVector
   * @generated
   */
  EClass getPathVector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.PathVector#getBasePath <em>Base Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Path</em>'.
   * @see org.eclipse.b3.beeLang.PathVector#getBasePath()
   * @see #getPathVector()
   * @generated
   */
  EAttribute getPathVector_BasePath();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.b3.beeLang.PathVector#getPaths <em>Paths</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Paths</em>'.
   * @see org.eclipse.b3.beeLang.PathVector#getPaths()
   * @see #getPathVector()
   * @generated
   */
  EAttribute getPathVector_Paths();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.CompoundPathVector <em>Compound Path Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Path Vector</em>'.
   * @see org.eclipse.b3.beeLang.CompoundPathVector
   * @generated
   */
  EClass getCompoundPathVector();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.CompoundPathVector#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.eclipse.b3.beeLang.CompoundPathVector#getBody()
   * @see #getCompoundPathVector()
   * @generated
   */
  EReference getCompoundPathVector_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Prerequisite <em>Prerequisite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prerequisite</em>'.
   * @see org.eclipse.b3.beeLang.Prerequisite
   * @generated
   */
  EClass getPrerequisite();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Prerequisite#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.eclipse.b3.beeLang.Prerequisite#getFilter()
   * @see #getPrerequisite()
   * @generated
   */
  EReference getPrerequisite_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Prerequisite#getWithClause <em>With Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With Clause</em>'.
   * @see org.eclipse.b3.beeLang.Prerequisite#getWithClause()
   * @see #getPrerequisite()
   * @generated
   */
  EReference getPrerequisite_WithClause();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Prerequisite#getPartReference <em>Part Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Part Reference</em>'.
   * @see org.eclipse.b3.beeLang.Prerequisite#getPartReference()
   * @see #getPrerequisite()
   * @generated
   */
  EReference getPrerequisite_PartReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Prerequisite#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.eclipse.b3.beeLang.Prerequisite#getAlias()
   * @see #getPrerequisite()
   * @generated
   */
  EAttribute getPrerequisite_Alias();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.WithClause <em>With Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Clause</em>'.
   * @see org.eclipse.b3.beeLang.WithClause
   * @generated
   */
  EClass getWithClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.WithClause#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see org.eclipse.b3.beeLang.WithClause#getReferences()
   * @see #getWithClause()
   * @generated
   */
  EReference getWithClause_References();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.WithClause#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.b3.beeLang.WithClause#getProperties()
   * @see #getWithClause()
   * @generated
   */
  EReference getWithClause_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.WithClause#getConcern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concern</em>'.
   * @see org.eclipse.b3.beeLang.WithClause#getConcern()
   * @see #getWithClause()
   * @generated
   */
  EReference getWithClause_Concern();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PrerequisiteEntry <em>Prerequisite Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prerequisite Entry</em>'.
   * @see org.eclipse.b3.beeLang.PrerequisiteEntry
   * @generated
   */
  EClass getPrerequisiteEntry();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.DirectPartReferemce <em>Direct Part Referemce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Part Referemce</em>'.
   * @see org.eclipse.b3.beeLang.DirectPartReferemce
   * @generated
   */
  EClass getDirectPartReferemce();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.DirectPartReferemce#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.b3.beeLang.DirectPartReferemce#getUnit()
   * @see #getDirectPartReferemce()
   * @generated
   */
  EAttribute getDirectPartReferemce_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.DirectPartReferemce#getBuilder <em>Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builder</em>'.
   * @see org.eclipse.b3.beeLang.DirectPartReferemce#getBuilder()
   * @see #getDirectPartReferemce()
   * @generated
   */
  EAttribute getDirectPartReferemce_Builder();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.DirectPartReferemce#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.eclipse.b3.beeLang.DirectPartReferemce#getParameters()
   * @see #getDirectPartReferemce()
   * @generated
   */
  EReference getDirectPartReferemce_Parameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart <em>Capability Referenced Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Referenced Part</em>'.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart
   * @generated
   */
  EClass getCapabilityReferencedPart();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart#getCapability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Capability</em>'.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart#getCapability()
   * @see #getCapabilityReferencedPart()
   * @generated
   */
  EReference getCapabilityReferencedPart_Capability();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart#getRange()
   * @see #getCapabilityReferencedPart()
   * @generated
   */
  EReference getCapabilityReferencedPart_Range();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart#getPartName <em>Part Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Name</em>'.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart#getPartName()
   * @see #getCapabilityReferencedPart()
   * @generated
   */
  EAttribute getCapabilityReferencedPart_PartName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.CapabilityReferencedPart#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.eclipse.b3.beeLang.CapabilityReferencedPart#getParameters()
   * @see #getCapabilityReferencedPart()
   * @generated
   */
  EReference getCapabilityReferencedPart_Parameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.CompoundReferences <em>Compound References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound References</em>'.
   * @see org.eclipse.b3.beeLang.CompoundReferences
   * @generated
   */
  EClass getCompoundReferences();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Builder <em>Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builder</em>'.
   * @see org.eclipse.b3.beeLang.Builder
   * @generated
   */
  EClass getBuilder();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getDocumentation()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getVisibility()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_Visibility();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#getExecutionMode <em>Execution Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution Mode</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getExecutionMode()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_ExecutionMode();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.eclipse.b3.beeLang.Builder#isFinal()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_Final();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#isCached <em>Cached</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cached</em>'.
   * @see org.eclipse.b3.beeLang.Builder#isCached()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_Cached();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Builder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getName()
   * @see #getBuilder()
   * @generated
   */
  EAttribute getBuilder_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getParams()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.Builder#getProvidedCapabilities <em>Provided Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getProvidedCapabilities()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_ProvidedCapabilities();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getPreCondition <em>Pre Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Condition</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getPreCondition()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_PreCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getPostCondition <em>Post Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Condition</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getPostCondition()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_PostCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getProperties()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getInput()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_Input();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getOutput()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_Output();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Builder#getExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression List</em>'.
   * @see org.eclipse.b3.beeLang.Builder#getExpressionList()
   * @see #getBuilder()
   * @generated
   */
  EReference getBuilder_ExpressionList();

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
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.BuilderInput <em>Builder Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builder Input</em>'.
   * @see org.eclipse.b3.beeLang.BuilderInput
   * @generated
   */
  EClass getBuilderInput();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BuilderInput#getPreCondition <em>Pre Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Condition</em>'.
   * @see org.eclipse.b3.beeLang.BuilderInput#getPreCondition()
   * @see #getBuilderInput()
   * @generated
   */
  EReference getBuilderInput_PreCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.BuilderInput#getPostCondition <em>Post Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Condition</em>'.
   * @see org.eclipse.b3.beeLang.BuilderInput#getPostCondition()
   * @see #getBuilderInput()
   * @generated
   */
  EReference getBuilderInput_PostCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.BuilderInput#getPrerequisites <em>Prerequisites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
   * @see org.eclipse.b3.beeLang.BuilderInput#getPrerequisites()
   * @see #getBuilderInput()
   * @generated
   */
  EReference getBuilderInput_Prerequisites();

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
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Concern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concern</em>'.
   * @see org.eclipse.b3.beeLang.Concern
   * @generated
   */
  EClass getConcern();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Concern#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.eclipse.b3.beeLang.Concern#getDocumentation()
   * @see #getConcern()
   * @generated
   */
  EAttribute getConcern_Documentation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Concern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.Concern#getName()
   * @see #getConcern()
   * @generated
   */
  EAttribute getConcern_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Concern#getConcern <em>Concern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concern</em>'.
   * @see org.eclipse.b3.beeLang.Concern#getConcern()
   * @see #getConcern()
   * @generated
   */
  EReference getConcern_Concern();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ConcernBlock <em>Concern Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concern Block</em>'.
   * @see org.eclipse.b3.beeLang.ConcernBlock
   * @generated
   */
  EClass getConcernBlock();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.b3.beeLang.ConcernBlock#getSuperConcerns <em>Super Concerns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Super Concerns</em>'.
   * @see org.eclipse.b3.beeLang.ConcernBlock#getSuperConcerns()
   * @see #getConcernBlock()
   * @generated
   */
  EAttribute getConcernBlock_SuperConcerns();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.ConcernBlock#getContexts <em>Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexts</em>'.
   * @see org.eclipse.b3.beeLang.ConcernBlock#getContexts()
   * @see #getConcernBlock()
   * @generated
   */
  EReference getConcernBlock_Contexts();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.ConcernBlock#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eclipse.b3.beeLang.ConcernBlock#getFunctions()
   * @see #getConcernBlock()
   * @generated
   */
  EReference getConcernBlock_Functions();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see org.eclipse.b3.beeLang.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Filter#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.eclipse.b3.beeLang.Filter#getPredicate()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_Predicate();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PreCondition <em>Pre Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Condition</em>'.
   * @see org.eclipse.b3.beeLang.PreCondition
   * @generated
   */
  EClass getPreCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.PreCondition#getAsserts <em>Asserts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asserts</em>'.
   * @see org.eclipse.b3.beeLang.PreCondition#getAsserts()
   * @see #getPreCondition()
   * @generated
   */
  EReference getPreCondition_Asserts();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.PostCondition <em>Post Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Condition</em>'.
   * @see org.eclipse.b3.beeLang.PostCondition
   * @generated
   */
  EClass getPostCondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.PostCondition#getAsserts <em>Asserts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asserts</em>'.
   * @see org.eclipse.b3.beeLang.PostCondition#getAsserts()
   * @see #getPostCondition()
   * @generated
   */
  EReference getPostCondition_Asserts();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.AssertionExpression <em>Assertion Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Expression</em>'.
   * @see org.eclipse.b3.beeLang.AssertionExpression
   * @generated
   */
  EClass getAssertionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.AssertionExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.b3.beeLang.AssertionExpression#getExpr()
   * @see #getAssertionExpression()
   * @generated
   */
  EReference getAssertionExpression_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.AssertionExpression#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.eclipse.b3.beeLang.AssertionExpression#getMessage()
   * @see #getAssertionExpression()
   * @generated
   */
  EAttribute getAssertionExpression_Message();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see org.eclipse.b3.beeLang.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.ExpressionList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.eclipse.b3.beeLang.ExpressionList#getExpressions()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expressions();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see org.eclipse.b3.beeLang.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Context#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.eclipse.b3.beeLang.Context#getSelector()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Selector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.Context#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.eclipse.b3.beeLang.Context#getBlock()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Block();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ContextSelector <em>Context Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Selector</em>'.
   * @see org.eclipse.b3.beeLang.ContextSelector
   * @generated
   */
  EClass getContextSelector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ContextSelector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.ContextSelector#getType()
   * @see #getContextSelector()
   * @generated
   */
  EReference getContextSelector_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ExpressionSelector <em>Expression Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Selector</em>'.
   * @see org.eclipse.b3.beeLang.ExpressionSelector
   * @generated
   */
  EClass getExpressionSelector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ExpressionSelector#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.b3.beeLang.ExpressionSelector#getExpr()
   * @see #getExpressionSelector()
   * @generated
   */
  EReference getExpressionSelector_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.UnitSelector <em>Unit Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Selector</em>'.
   * @see org.eclipse.b3.beeLang.UnitSelector
   * @generated
   */
  EClass getUnitSelector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.UnitSelector#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see org.eclipse.b3.beeLang.UnitSelector#getInterface()
   * @see #getUnitSelector()
   * @generated
   */
  EAttribute getUnitSelector_Interface();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.UnitSelector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.UnitSelector#getName()
   * @see #getUnitSelector()
   * @generated
   */
  EAttribute getUnitSelector_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.UnitSelector#getNamePattern <em>Name Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Pattern</em>'.
   * @see org.eclipse.b3.beeLang.UnitSelector#getNamePattern()
   * @see #getUnitSelector()
   * @generated
   */
  EAttribute getUnitSelector_NamePattern();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.UnitSelector#getVersionRange <em>Version Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version Range</em>'.
   * @see org.eclipse.b3.beeLang.UnitSelector#getVersionRange()
   * @see #getUnitSelector()
   * @generated
   */
  EReference getUnitSelector_VersionRange();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see org.eclipse.b3.beeLang.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.Version#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.b3.beeLang.Version#getVersion()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Version();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.VersionRange <em>Version Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Range</em>'.
   * @see org.eclipse.b3.beeLang.VersionRange
   * @generated
   */
  EClass getVersionRange();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.VersionRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.eclipse.b3.beeLang.VersionRange#getRange()
   * @see #getVersionRange()
   * @generated
   */
  EAttribute getVersionRange_Range();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.CompounddReferences <em>Compoundd References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compoundd References</em>'.
   * @see org.eclipse.b3.beeLang.CompounddReferences
   * @generated
   */
  EClass getCompounddReferences();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.CompounddReferences#getPrerequisites <em>Prerequisites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
   * @see org.eclipse.b3.beeLang.CompounddReferences#getPrerequisites()
   * @see #getCompounddReferences()
   * @generated
   */
  EReference getCompounddReferences_Prerequisites();

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
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_UNIT__VERSION = eINSTANCE.getBuildUnit_Version();

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
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ProvidedCapabilityImpl <em>Provided Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ProvidedCapabilityImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getProvidedCapability()
     * @generated
     */
    EClass PROVIDED_CAPABILITY = eINSTANCE.getProvidedCapability();

    /**
     * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_CAPABILITY__CAPABILITY = eINSTANCE.getProvidedCapability_Capability();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_CAPABILITY__VERSION = eINSTANCE.getProvidedCapability_Version();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.RequiredCapabilityImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getRequiredCapability()
     * @generated
     */
    EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

    /**
     * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_CAPABILITY__CAPABILITY = eINSTANCE.getRequiredCapability_Capability();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_CAPABILITY__RANGE = eINSTANCE.getRequiredCapability_Range();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.FilteredCapabilityImpl <em>Filtered Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.FilteredCapabilityImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilteredCapability()
     * @generated
     */
    EClass FILTERED_CAPABILITY = eINSTANCE.getFilteredCapability();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTERED_CAPABILITY__FILTER = eINSTANCE.getFilteredCapability_Filter();

    /**
     * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTERED_CAPABILITY__CAPABILITY = eINSTANCE.getFilteredCapability_Capability();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.CapabilityImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__INTERFACE = eINSTANCE.getCapability_Interface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

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
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PathGroupImpl <em>Path Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PathGroupImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathGroup()
     * @generated
     */
    EClass PATH_GROUP = eINSTANCE.getPathGroup();

    /**
     * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_GROUP__PATHS = eINSTANCE.getPathGroup_Paths();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_GROUP__ANNOTATIONS = eINSTANCE.getPathGroup_Annotations();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PathVectorElementImpl <em>Path Vector Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PathVectorElementImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathVectorElement()
     * @generated
     */
    EClass PATH_VECTOR_ELEMENT = eINSTANCE.getPathVectorElement();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.FilteredPathVectorImpl <em>Filtered Path Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.FilteredPathVectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilteredPathVector()
     * @generated
     */
    EClass FILTERED_PATH_VECTOR = eINSTANCE.getFilteredPathVector();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTERED_PATH_VECTOR__FILTER = eINSTANCE.getFilteredPathVector_Filter();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTERED_PATH_VECTOR__BODY = eINSTANCE.getFilteredPathVector_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PathVectorImpl <em>Path Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PathVectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPathVector()
     * @generated
     */
    EClass PATH_VECTOR = eINSTANCE.getPathVector();

    /**
     * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_VECTOR__BASE_PATH = eINSTANCE.getPathVector_BasePath();

    /**
     * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_VECTOR__PATHS = eINSTANCE.getPathVector_Paths();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.CompoundPathVectorImpl <em>Compound Path Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.CompoundPathVectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompoundPathVector()
     * @generated
     */
    EClass COMPOUND_PATH_VECTOR = eINSTANCE.getCompoundPathVector();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_PATH_VECTOR__BODY = eINSTANCE.getCompoundPathVector_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PrerequisiteImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPrerequisite()
     * @generated
     */
    EClass PREREQUISITE = eINSTANCE.getPrerequisite();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREREQUISITE__FILTER = eINSTANCE.getPrerequisite_Filter();

    /**
     * The meta object literal for the '<em><b>With Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREREQUISITE__WITH_CLAUSE = eINSTANCE.getPrerequisite_WithClause();

    /**
     * The meta object literal for the '<em><b>Part Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREREQUISITE__PART_REFERENCE = eINSTANCE.getPrerequisite_PartReference();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREREQUISITE__ALIAS = eINSTANCE.getPrerequisite_Alias();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.WithClauseImpl <em>With Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.WithClauseImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getWithClause()
     * @generated
     */
    EClass WITH_CLAUSE = eINSTANCE.getWithClause();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CLAUSE__REFERENCES = eINSTANCE.getWithClause_References();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CLAUSE__PROPERTIES = eINSTANCE.getWithClause_Properties();

    /**
     * The meta object literal for the '<em><b>Concern</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_CLAUSE__CONCERN = eINSTANCE.getWithClause_Concern();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PrerequisiteEntryImpl <em>Prerequisite Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PrerequisiteEntryImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPrerequisiteEntry()
     * @generated
     */
    EClass PREREQUISITE_ENTRY = eINSTANCE.getPrerequisiteEntry();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.DirectPartReferemceImpl <em>Direct Part Referemce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.DirectPartReferemceImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getDirectPartReferemce()
     * @generated
     */
    EClass DIRECT_PART_REFEREMCE = eINSTANCE.getDirectPartReferemce();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_PART_REFEREMCE__UNIT = eINSTANCE.getDirectPartReferemce_Unit();

    /**
     * The meta object literal for the '<em><b>Builder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_PART_REFEREMCE__BUILDER = eINSTANCE.getDirectPartReferemce_Builder();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_PART_REFEREMCE__PARAMETERS = eINSTANCE.getDirectPartReferemce_Parameters();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.CapabilityReferencedPartImpl <em>Capability Referenced Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.CapabilityReferencedPartImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCapabilityReferencedPart()
     * @generated
     */
    EClass CAPABILITY_REFERENCED_PART = eINSTANCE.getCapabilityReferencedPart();

    /**
     * The meta object literal for the '<em><b>Capability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_REFERENCED_PART__CAPABILITY = eINSTANCE.getCapabilityReferencedPart_Capability();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_REFERENCED_PART__RANGE = eINSTANCE.getCapabilityReferencedPart_Range();

    /**
     * The meta object literal for the '<em><b>Part Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY_REFERENCED_PART__PART_NAME = eINSTANCE.getCapabilityReferencedPart_PartName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_REFERENCED_PART__PARAMETERS = eINSTANCE.getCapabilityReferencedPart_Parameters();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.CompoundReferencesImpl <em>Compound References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.CompoundReferencesImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompoundReferences()
     * @generated
     */
    EClass COMPOUND_REFERENCES = eINSTANCE.getCompoundReferences();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.BuilderImpl <em>Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.BuilderImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilder()
     * @generated
     */
    EClass BUILDER = eINSTANCE.getBuilder();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__DOCUMENTATION = eINSTANCE.getBuilder_Documentation();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__VISIBILITY = eINSTANCE.getBuilder_Visibility();

    /**
     * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__EXECUTION_MODE = eINSTANCE.getBuilder_ExecutionMode();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__FINAL = eINSTANCE.getBuilder_Final();

    /**
     * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__CACHED = eINSTANCE.getBuilder_Cached();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILDER__NAME = eINSTANCE.getBuilder_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__PARAMS = eINSTANCE.getBuilder_Params();

    /**
     * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__PROVIDED_CAPABILITIES = eINSTANCE.getBuilder_ProvidedCapabilities();

    /**
     * The meta object literal for the '<em><b>Pre Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__PRE_CONDITION = eINSTANCE.getBuilder_PreCondition();

    /**
     * The meta object literal for the '<em><b>Post Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__POST_CONDITION = eINSTANCE.getBuilder_PostCondition();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__PROPERTIES = eINSTANCE.getBuilder_Properties();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__INPUT = eINSTANCE.getBuilder_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__OUTPUT = eINSTANCE.getBuilder_Output();

    /**
     * The meta object literal for the '<em><b>Expression List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER__EXPRESSION_LIST = eINSTANCE.getBuilder_ExpressionList();

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
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.BuilderInputImpl <em>Builder Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.BuilderInputImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getBuilderInput()
     * @generated
     */
    EClass BUILDER_INPUT = eINSTANCE.getBuilderInput();

    /**
     * The meta object literal for the '<em><b>Pre Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER_INPUT__PRE_CONDITION = eINSTANCE.getBuilderInput_PreCondition();

    /**
     * The meta object literal for the '<em><b>Post Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER_INPUT__POST_CONDITION = eINSTANCE.getBuilderInput_PostCondition();

    /**
     * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILDER_INPUT__PREREQUISITES = eINSTANCE.getBuilderInput_Prerequisites();

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
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ConcernImpl <em>Concern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ConcernImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getConcern()
     * @generated
     */
    EClass CONCERN = eINSTANCE.getConcern();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCERN__DOCUMENTATION = eINSTANCE.getConcern_Documentation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCERN__NAME = eINSTANCE.getConcern_Name();

    /**
     * The meta object literal for the '<em><b>Concern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN__CONCERN = eINSTANCE.getConcern_Concern();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ConcernBlockImpl <em>Concern Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ConcernBlockImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getConcernBlock()
     * @generated
     */
    EClass CONCERN_BLOCK = eINSTANCE.getConcernBlock();

    /**
     * The meta object literal for the '<em><b>Super Concerns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCERN_BLOCK__SUPER_CONCERNS = eINSTANCE.getConcernBlock_SuperConcerns();

    /**
     * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN_BLOCK__CONTEXTS = eINSTANCE.getConcernBlock_Contexts();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCERN_BLOCK__FUNCTIONS = eINSTANCE.getConcernBlock_Functions();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.FilterImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__PREDICATE = eINSTANCE.getFilter_Predicate();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PreConditionImpl <em>Pre Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PreConditionImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPreCondition()
     * @generated
     */
    EClass PRE_CONDITION = eINSTANCE.getPreCondition();

    /**
     * The meta object literal for the '<em><b>Asserts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_CONDITION__ASSERTS = eINSTANCE.getPreCondition_Asserts();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.PostConditionImpl <em>Post Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.PostConditionImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getPostCondition()
     * @generated
     */
    EClass POST_CONDITION = eINSTANCE.getPostCondition();

    /**
     * The meta object literal for the '<em><b>Asserts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_CONDITION__ASSERTS = eINSTANCE.getPostCondition_Asserts();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.AssertionExpressionImpl <em>Assertion Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.AssertionExpressionImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getAssertionExpression()
     * @generated
     */
    EClass ASSERTION_EXPRESSION = eINSTANCE.getAssertionExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_EXPRESSION__EXPR = eINSTANCE.getAssertionExpression_Expr();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSERTION_EXPRESSION__MESSAGE = eINSTANCE.getAssertionExpression_Message();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ExpressionListImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ContextImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__SELECTOR = eINSTANCE.getContext_Selector();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__BLOCK = eINSTANCE.getContext_Block();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ContextSelectorImpl <em>Context Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ContextSelectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getContextSelector()
     * @generated
     */
    EClass CONTEXT_SELECTOR = eINSTANCE.getContextSelector();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_SELECTOR__TYPE = eINSTANCE.getContextSelector_Type();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ExpressionSelectorImpl <em>Expression Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ExpressionSelectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getExpressionSelector()
     * @generated
     */
    EClass EXPRESSION_SELECTOR = eINSTANCE.getExpressionSelector();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SELECTOR__EXPR = eINSTANCE.getExpressionSelector_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.UnitSelectorImpl <em>Unit Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.UnitSelectorImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getUnitSelector()
     * @generated
     */
    EClass UNIT_SELECTOR = eINSTANCE.getUnitSelector();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_SELECTOR__INTERFACE = eINSTANCE.getUnitSelector_Interface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_SELECTOR__NAME = eINSTANCE.getUnitSelector_Name();

    /**
     * The meta object literal for the '<em><b>Name Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_SELECTOR__NAME_PATTERN = eINSTANCE.getUnitSelector_NamePattern();

    /**
     * The meta object literal for the '<em><b>Version Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIT_SELECTOR__VERSION_RANGE = eINSTANCE.getUnitSelector_VersionRange();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.VersionImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__VERSION = eINSTANCE.getVersion_Version();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.VersionRangeImpl <em>Version Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.VersionRangeImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getVersionRange()
     * @generated
     */
    EClass VERSION_RANGE = eINSTANCE.getVersionRange();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION_RANGE__RANGE = eINSTANCE.getVersionRange_Range();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.CompounddReferencesImpl <em>Compoundd References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.CompounddReferencesImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getCompounddReferences()
     * @generated
     */
    EClass COMPOUNDD_REFERENCES = eINSTANCE.getCompounddReferences();

    /**
     * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUNDD_REFERENCES__PREREQUISITES = eINSTANCE.getCompounddReferences_Prerequisites();

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
