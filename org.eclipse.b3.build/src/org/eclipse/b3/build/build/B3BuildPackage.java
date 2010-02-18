/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.b3.build.build.B3BuildFactory
 * @model kind="package"
 * @generated
 */
public interface B3BuildPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "build";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://b3build/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "build";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	B3BuildPackage eINSTANCE = org.eclipse.b3.build.build.impl.B3BuildPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.CapabilityImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__COND_EXPR = 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.VersionedCapabilityImpl <em>Versioned Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.VersionedCapabilityImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionedCapability()
	 * @generated
	 */
	int VERSIONED_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__NAME_SPACE = CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__COND_EXPR = CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__VERSION = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildUnitImpl <em>Build Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildUnitImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildUnit()
	 * @generated
	 */
	int BUILD_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__NAME = VERSIONED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__NAME_SPACE = VERSIONED_CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__COND_EXPR = VERSIONED_CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__VERSION = VERSIONED_CAPABILITY__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__FUNCTIONS = VERSIONED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROVIDED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__BUILDERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__DOCUMENTATION = VERSIONED_CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__EXECUTION_MODE = VERSIONED_CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__META_REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__IMPLEMENTS = VERSIONED_CAPABILITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONCERNS = VERSIONED_CAPABILITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__DEFAULT_PROPERTIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__SYNCHRONIZATIONS = VERSIONED_CAPABILITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REPOSITORIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONTAINERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROPERTY_SETS = VERSIONED_CAPABILITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Base Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__BASE_LOCATION = VERSIONED_CAPABILITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Build Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_FEATURE_COUNT = VERSIONED_CAPABILITY_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderImpl <em>Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilder()
	 * @generated
	 */
	int BUILDER = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderJavaImpl <em>Builder Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderJavaImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderJava()
	 * @generated
	 */
	int BUILDER_JAVA = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderInputImpl <em>Builder Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderInputImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderInput()
	 * @generated
	 */
	int BUILDER_INPUT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PathGroupImpl <em>Path Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PathGroupImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathGroup()
	 * @generated
	 */
	int PATH_GROUP = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PrerequisiteImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildResultReferenceImpl <em>Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResultReference()
	 * @generated
	 */
	int BUILD_RESULT_REFERENCE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.CompoundBuildResultReferenceImpl <em>Compound Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.CompoundBuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCompoundBuildResultReference()
	 * @generated
	 */
	int COMPOUND_BUILD_RESULT_REFERENCE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl <em>Builder Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderReference()
	 * @generated
	 */
	int BUILDER_REFERENCE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RequiredCapabilityImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PathVectorImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVector()
	 * @generated
	 */
	int PATH_VECTOR = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.SynchronizationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryConfiguration()
	 * @generated
	 */
	int REPOSITORY_CONFIGURATION = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl <em>Repository Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryDeclaration()
	 * @generated
	 */
	int REPOSITORY_DECLARATION = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyImpl <em>Resolution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategy()
	 * @generated
	 */
	int RESOLUTION_STRATEGY = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl <em>Resolution Strategy First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyFirst()
	 * @generated
	 */
	int RESOLUTION_STRATEGY_FIRST = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl <em>Resolution Strategy Best</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyBest()
	 * @generated
	 */
	int RESOLUTION_STRATEGY_BEST = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ContainerConfigurationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getContainerConfiguration()
	 * @generated
	 */
	int CONTAINER_CONFIGURATION = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildContextImpl <em>Build Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildContext()
	 * @generated
	 */
	int BUILD_CONTEXT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildConcernContextImpl <em>Build Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildConcernContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildConcernContext()
	 * @generated
	 */
	int BUILD_CONCERN_CONTEXT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RequiresPredicateImpl <em>Requires Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RequiresPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRequiresPredicate()
	 * @generated
	 */
	int REQUIRES_PREDICATE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl <em>Capability Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.CapabilityPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCapabilityPredicate()
	 * @generated
	 */
	int CAPABILITY_PREDICATE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ImplementsPredicateImpl <em>Implements Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ImplementsPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getImplementsPredicate()
	 * @generated
	 */
	int IMPLEMENTS_PREDICATE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ProvidesPredicateImpl <em>Provides Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ProvidesPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getProvidesPredicate()
	 * @generated
	 */
	int PROVIDES_PREDICATE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.NameSpacePredicateImpl <em>Name Space Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.NameSpacePredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getNameSpacePredicate()
	 * @generated
	 */
	int NAME_SPACE_PREDICATE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.UnitNamePredicateImpl <em>Unit Name Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.UnitNamePredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitNamePredicate()
	 * @generated
	 */
	int UNIT_NAME_PREDICATE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderNamePredicateImpl <em>Builder Name Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderNamePredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderNamePredicate()
	 * @generated
	 */
	int BUILDER_NAME_PREDICATE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.InputPredicateImpl <em>Input Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.InputPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getInputPredicate()
	 * @generated
	 */
	int INPUT_PREDICATE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl <em>Unit Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.UnitConcernContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitConcernContext()
	 * @generated
	 */
	int UNIT_CONCERN_CONTEXT = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl <em>Builder Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderConcernContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderConcernContext()
	 * @generated
	 */
	int BUILDER_CONCERN_CONTEXT = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.OutputPredicateImpl <em>Output Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.OutputPredicateImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getOutputPredicate()
	 * @generated
	 */
	int OUTPUT_PREDICATE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.AliasedRequiredCapabilityImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getAliasedRequiredCapability()
	 * @generated
	 */
	int ALIASED_REQUIRED_CAPABILITY = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.IRequiredCapabilityContainer
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIRequiredCapabilityContainer()
	 * @generated
	 */
	int IREQUIRED_CAPABILITY_CONTAINER = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.IProvidedCapabilityContainer
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIProvidedCapabilityContainer()
	 * @generated
	 */
	int IPROVIDED_CAPABILITY_CONTAINER = 35;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES = 0;

	/**
	 * The number of structural features of the '<em>IProvided Capability Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.IBuilder <em>IBuilder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.IBuilder
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIBuilder()
	 * @generated
	 */
	int IBUILDER = 1;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PROVIDED_CAPABILITIES = IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__VISIBILITY = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__FINAL = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXECUTION_MODE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__NAME = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__GUARD = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PARAMETER_TYPES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXCEPTION_TYPES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__TYPE_PARAMETERS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PARAMETER_NAMES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PARAMETERS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__VAR_ARGS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__DOCUMENTATION = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__RETURN_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__CLOSURE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__TYPE_CALCULATOR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__CONTAINER = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__CLASS_FUNCTION = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__POSTCOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PRECOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__INPUT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__OUTPUT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__DEFAULT_PROPERTIES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__POSTINPUTCOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__UNIT_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXPLICIT_UNIT_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>IBuilder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDER_FEATURE_COUNT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT__PREREQUISITES = 0;

	/**
	 * The number of structural features of the '<em>Builder Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP__PATH_VECTORS = 1;

	/**
	 * The number of structural features of the '<em>Path Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__COND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>With Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__WITH_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Build Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE__BUILD_RESULT = 3;

	/**
	 * The number of structural features of the '<em>Prerequisite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITE_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Prerequisites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BUILD_RESULT_REFERENCE_FEATURE_COUNT = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE__PARAMETERS = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE__BUILDER_NAME = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE__REQUIRED_CAPABILITY = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Capability Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Builder Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE_FEATURE_COUNT = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME_SPACE = CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__COND_EXPR = CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__VERSION_RANGE = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl <em>Conditional Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getConditionalPathVector()
	 * @generated
	 */
	int CONDITIONAL_PATH_VECTOR = 11;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR__COND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR__PATH_VECTORS = 1;

	/**
	 * The number of structural features of the '<em>Conditional Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__PATHS = 0;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__BASE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Builder Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__BUILDER_QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Repository Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONFIGURATION_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Resolver Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DECLARATION__RESOLVER_TYPE = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DECLARATION__CONTEXT_BLOCK = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Repository Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DECLARATION_FEATURE_COUNT = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY__REPOSITORIES = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY_FEATURE_COUNT = REPOSITORY_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY_FIRST__REPOSITORIES = RESOLUTION_STRATEGY__REPOSITORIES;

	/**
	 * The number of structural features of the '<em>Resolution Strategy First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY_FIRST_FEATURE_COUNT = RESOLUTION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY_BEST__REPOSITORIES = RESOLUTION_STRATEGY__REPOSITORIES;

	/**
	 * The number of structural features of the '<em>Resolution Strategy Best</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_STRATEGY_BEST_FEATURE_COUNT = RESOLUTION_STRATEGY_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Agent Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__AGENT_TYPE = 2;

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
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__PARENT_CONTEXT = B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__VALUE_MAP = B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__FUNC_STORE = B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__EFFECTIVE_CONCERNS = B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__PROGRESS_MONITOR = B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The number of structural features of the '<em>Build Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT_FEATURE_COUNT = B3backendPackage.BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__FUNCTIONS = B3backendPackage.BCONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DOCUMENTATION = B3backendPackage.BCONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Build Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT_FEATURE_COUNT = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE__META = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requires Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__VERSION_RANGE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__NAME_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_PREDICATE__TYPE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implements Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provides Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_PREDICATE__NAME_SPACE = 0;

	/**
	 * The number of structural features of the '<em>Name Space Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__VERSION_RANGE = CAPABILITY_PREDICATE__VERSION_RANGE;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__NAME_PREDICATE = CAPABILITY_PREDICATE__NAME_PREDICATE;

	/**
	 * The feature id for the '<em><b>Name Space Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__NAME_SPACE_PREDICATE = CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE;

	/**
	 * The number of structural features of the '<em>Unit Name Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE_FEATURE_COUNT = CAPABILITY_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_NAME_PREDICATE__NAME_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Name Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_NAME_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE__BUILDER_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__FUNCTIONS = BUILD_CONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DOCUMENTATION = BUILD_CONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__QUERY = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provides Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unit Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT_FEATURE_COUNT = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__FUNCTIONS = BUILD_CONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DOCUMENTATION = BUILD_CONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__QUERY = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Additions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Additions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__FUNC_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__VAR_ARGS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PARAMETERS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Match Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Remove Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remove Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Remove Post Input Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PRECOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Provides Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Annotations Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__ANNOTATIONS_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Annotations Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__ANNOTATIONS_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Builder Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT_FEATURE_COUNT = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE__PATH_VECTOR = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE__PATH_PATTERN = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__NAME = REQUIRED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__NAME_SPACE = REQUIRED_CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__COND_EXPR = REQUIRED_CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__VERSION_RANGE = REQUIRED_CAPABILITY__VERSION_RANGE;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__ALIAS = REQUIRED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aliased Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY_FEATURE_COUNT = REQUIRED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES = 0;

	/**
	 * The number of structural features of the '<em>IRequired Capability Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderQueryImpl <em>Builder Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderQueryImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderQuery()
	 * @generated
	 */
	int BUILDER_QUERY = 36;

	/**
	 * The feature id for the '<em><b>Builder Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY__BUILDER_QUERIES = 0;

	/**
	 * The feature id for the '<em><b>Unit Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY__UNIT_QUERY = 1;

	/**
	 * The number of structural features of the '<em>Builder Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__VISIBILITY = B3backendPackage.B3_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__FINAL = B3backendPackage.B3_FUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXECUTION_MODE = B3backendPackage.B3_FUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__NAME = B3backendPackage.B3_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__GUARD = B3backendPackage.B3_FUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PARAMETER_TYPES = B3backendPackage.B3_FUNCTION__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXCEPTION_TYPES = B3backendPackage.B3_FUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__TYPE_PARAMETERS = B3backendPackage.B3_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PARAMETER_NAMES = B3backendPackage.B3_FUNCTION__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PARAMETERS = B3backendPackage.B3_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__VAR_ARGS = B3backendPackage.B3_FUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__DOCUMENTATION = B3backendPackage.B3_FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__RETURN_TYPE = B3backendPackage.B3_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__CLOSURE = B3backendPackage.B3_FUNCTION__CLOSURE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__TYPE_CALCULATOR = B3backendPackage.B3_FUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__CONTAINER = B3backendPackage.B3_FUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__CLASS_FUNCTION = B3backendPackage.B3_FUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__FUNC_EXPR = B3backendPackage.B3_FUNCTION__FUNC_EXPR;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PROVIDED_CAPABILITIES = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__POSTCOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PRECOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__INPUT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__OUTPUT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__DEFAULT_PROPERTIES = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__POSTINPUTCOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__UNIT_TYPE = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXPLICIT_UNIT_TYPE = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_FEATURE_COUNT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__VISIBILITY = B3backendPackage.BJAVA_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__FINAL = B3backendPackage.BJAVA_FUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXECUTION_MODE = B3backendPackage.BJAVA_FUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__NAME = B3backendPackage.BJAVA_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__GUARD = B3backendPackage.BJAVA_FUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETER_TYPES = B3backendPackage.BJAVA_FUNCTION__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXCEPTION_TYPES = B3backendPackage.BJAVA_FUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__TYPE_PARAMETERS = B3backendPackage.BJAVA_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETER_NAMES = B3backendPackage.BJAVA_FUNCTION__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETERS = B3backendPackage.BJAVA_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__VAR_ARGS = B3backendPackage.BJAVA_FUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__DOCUMENTATION = B3backendPackage.BJAVA_FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__RETURN_TYPE = B3backendPackage.BJAVA_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CLOSURE = B3backendPackage.BJAVA_FUNCTION__CLOSURE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__TYPE_CALCULATOR = B3backendPackage.BJAVA_FUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CONTAINER = B3backendPackage.BJAVA_FUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CLASS_FUNCTION = B3backendPackage.BJAVA_FUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__METHOD = B3backendPackage.BJAVA_FUNCTION__METHOD;


	/**
	 * The feature id for the '<em><b>Call Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CALL_TYPE = B3backendPackage.BJAVA_FUNCTION__CALL_TYPE;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PROVIDED_CAPABILITIES = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__POSTCOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PRECOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__INPUT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__OUTPUT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__DEFAULT_PROPERTIES = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__POSTINPUTCOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__UNIT_TYPE = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXPLICIT_UNIT_TYPE = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Builder Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA_FEATURE_COUNT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl <em>Builder Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderWrapperImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderWrapper()
	 * @generated
	 */
	int BUILDER_WRAPPER = 39;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VISIBILITY = B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__FINAL = B3backendPackage.BFUNCTION_WRAPPER__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXECUTION_MODE = B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__NAME = B3backendPackage.BFUNCTION_WRAPPER__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__GUARD = B3backendPackage.BFUNCTION_WRAPPER__GUARD;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETER_TYPES = B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXCEPTION_TYPES = B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__TYPE_PARAMETERS = B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETER_NAMES = B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETERS = B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VAR_ARGS = B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DOCUMENTATION = B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__RETURN_TYPE = B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__CLOSURE = B3backendPackage.BFUNCTION_WRAPPER__CLOSURE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__TYPE_CALCULATOR = B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__CONTAINER = B3backendPackage.BFUNCTION_WRAPPER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__CLASS_FUNCTION = B3backendPackage.BFUNCTION_WRAPPER__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Around Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__AROUND_EXPR = B3backendPackage.BFUNCTION_WRAPPER__AROUND_EXPR;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__ORIGINAL = B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL;

	/**
	 * The feature id for the '<em><b>Parameter Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETER_MAP = B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_MAP;

	/**
	 * The feature id for the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VARARGS_NAME = B3backendPackage.BFUNCTION_WRAPPER__VARARGS_NAME;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PROVIDED_CAPABILITIES = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__POSTCOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PRECOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__INPUT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__OUTPUT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DEFAULT_PROPERTIES = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__POSTINPUTCOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__UNIT_TYPE = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__INPUT_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__OUTPUT_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unit Type Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__UNIT_TYPE_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Provides Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PROVIDES_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Default Properties Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Builder Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER_FEATURE_COUNT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BeeModelImpl <em>Bee Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BeeModelImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBeeModel()
	 * @generated
	 */
	int BEE_MODEL = 40;

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
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__CONCERNS = 2;

	/**
	 * The feature id for the '<em><b>Build Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__BUILD_UNITS = 3;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__PROPERTY_SETS = 4;

	/**
	 * The number of structural features of the '<em>Bee Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BeeHiveImpl <em>Bee Hive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BeeHiveImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBeeHive()
	 * @generated
	 */
	int BEE_HIVE = 41;

	/**
	 * The feature id for the '<em><b>Bee Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__BEE_MODELS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__RESOLUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Bee Hive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionInfoImpl <em>Resolution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionInfoImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionInfo()
	 * @generated
	 */
	int RESOLUTION_INFO = 42;

	/**
	 * The number of structural features of the '<em>Resolution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_INFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.EffectiveFacadeImpl <em>Effective Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.EffectiveFacadeImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveFacade()
	 * @generated
	 */
	int EFFECTIVE_FACADE = 43;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_FACADE__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Effective Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_FACADE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.EffectiveUnitFacadeImpl <em>Effective Unit Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.EffectiveUnitFacadeImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveUnitFacade()
	 * @generated
	 */
	int EFFECTIVE_UNIT_FACADE = 44;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__UNIT = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Effective Unit Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.EffectiveRequirementFacadeImpl <em>Effective Requirement Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.EffectiveRequirementFacadeImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveRequirementFacade()
	 * @generated
	 */
	int EFFECTIVE_REQUIREMENT_FACADE = 45;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effective Requirement Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.EffectiveCapabilityFacadeImpl <em>Effective Capability Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.EffectiveCapabilityFacadeImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveCapabilityFacade()
	 * @generated
	 */
	int EFFECTIVE_CAPABILITY_FACADE = 46;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Provided Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effective Capability Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl <em>Effective Builder Reference Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveBuilderReferenceFacade()
	 * @generated
	 */
	int EFFECTIVE_BUILDER_REFERENCE_FACADE = 47;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_REFERENCE_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Builder Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Effective Builder Reference Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_REFERENCE_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildResultImpl <em>Build Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildResultImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResult()
	 * @generated
	 */
	int BUILD_RESULT = 48;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT__PATH_VECTORS = 0;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT__VALUE_MAP = 1;

	/**
	 * The number of structural features of the '<em>Build Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildResultContextImpl <em>Build Result Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildResultContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResultContext()
	 * @generated
	 */
	int BUILD_RESULT_CONTEXT = 49;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__PARENT_CONTEXT = B3backendPackage.BINNER_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__VALUE_MAP = B3backendPackage.BINNER_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__FUNC_STORE = B3backendPackage.BINNER_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__EFFECTIVE_CONCERNS = B3backendPackage.BINNER_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__PROGRESS_MONITOR = B3backendPackage.BINNER_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__OUTER_CONTEXT = B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT;

	/**
	 * The number of structural features of the '<em>Build Result Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT_FEATURE_COUNT = B3backendPackage.BINNER_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Version Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionRange()
	 * @generated
	 */
	int VERSION_RANGE = 50;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 51;

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Unit</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit
	 * @generated
	 */
	EClass getBuildUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.build.BuildUnit#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Builders</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getBuilders()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Builders();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuildUnit#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getDocumentation()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Mode</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getExecutionMode()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_ExecutionMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getMetaRequiredCapabilities()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_MetaRequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getImplements()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getConcerns()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Concerns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getDefaultProperties()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_DefaultProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getSynchronizations <em>Synchronizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getSynchronizations()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Synchronizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getRepositories()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getContainers()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getPropertySets()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_PropertySets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuildUnit#getBaseLocation <em>Base Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Location</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getBaseLocation()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_BaseLocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.IBuilder <em>IBuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBuilder</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder
	 * @generated
	 */
	EClass getIBuilder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getPostcondExpr <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getPostcondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PostcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getPrecondExpr <em>Precond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getPrecondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getInput()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getOutput()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getDefaultProperties()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_DefaultProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getPostinputcondExpr <em>Postinputcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postinputcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getPostinputcondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PostinputcondExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.IBuilder#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getUnitType()
	 * @see #getIBuilder()
	 * @generated
	 */
	EAttribute getIBuilder_UnitType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.IBuilder#getExplicitUnitType <em>Explicit Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Explicit Unit Type</em>'.
	 * @see org.eclipse.b3.build.build.IBuilder#getExplicitUnitType()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_ExplicitUnitType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder</em>'.
	 * @see org.eclipse.b3.build.build.Builder
	 * @generated
	 */
	EClass getBuilder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderJava <em>Builder Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Java</em>'.
	 * @see org.eclipse.b3.build.build.BuilderJava
	 * @generated
	 */
	EClass getBuilderJava();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderWrapper <em>Builder Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Wrapper</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper
	 * @generated
	 */
	EClass getBuilderWrapper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Advised</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper#isInputAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_InputAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Advised</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper#isOutputAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_OutputAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderWrapper#isUnitTypeAdvised <em>Unit Type Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type Advised</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper#isUnitTypeAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_UnitTypeAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderWrapper#isProvidesAdvised <em>Provides Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Advised</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper#isProvidesAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_ProvidesAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderWrapper#isDefaultPropertiesAdvised <em>Default Properties Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Properties Advised</em>'.
	 * @see org.eclipse.b3.build.build.BuilderWrapper#isDefaultPropertiesAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_DefaultPropertiesAdvised();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BeeModel <em>Bee Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bee Model</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel
	 * @generated
	 */
	EClass getBeeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BeeModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel#getImports()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BeeModel#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel#getFunctions()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BeeModel#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel#getConcerns()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Concerns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BeeModel#getBuildUnits <em>Build Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Units</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel#getBuildUnits()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_BuildUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BeeModel#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.build.build.BeeModel#getPropertySets()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_PropertySets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BeeHive <em>Bee Hive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bee Hive</em>'.
	 * @see org.eclipse.b3.build.build.BeeHive
	 * @generated
	 */
	EClass getBeeHive();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.build.BeeHive#getBeeModels <em>Bee Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bee Models</em>'.
	 * @see org.eclipse.b3.build.build.BeeHive#getBeeModels()
	 * @see #getBeeHive()
	 * @generated
	 */
	EReference getBeeHive_BeeModels();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.BeeHive#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.b3.build.build.BeeHive#getParent()
	 * @see #getBeeHive()
	 * @generated
	 */
	EReference getBeeHive_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BeeHive#getResolutions <em>Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolutions</em>'.
	 * @see org.eclipse.b3.build.build.BeeHive#getResolutions()
	 * @see #getBeeHive()
	 * @generated
	 */
	EAttribute getBeeHive_Resolutions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ResolutionInfo <em>Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Info</em>'.
	 * @see org.eclipse.b3.build.build.ResolutionInfo
	 * @generated
	 */
	EClass getResolutionInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.EffectiveFacade <em>Effective Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Facade</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveFacade
	 * @generated
	 */
	EClass getEffectiveFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.EffectiveFacade#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveFacade#getContext()
	 * @see #getEffectiveFacade()
	 * @generated
	 */
	EReference getEffectiveFacade_Context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.EffectiveUnitFacade <em>Effective Unit Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Unit Facade</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade
	 * @generated
	 */
	EClass getEffectiveUnitFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade#getUnit()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade#getProvidedCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_ProvidedCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade#getRequiredCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_RequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade#getMetaRequiredCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_MetaRequiredCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.EffectiveRequirementFacade <em>Effective Requirement Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Requirement Facade</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveRequirementFacade
	 * @generated
	 */
	EClass getEffectiveRequirementFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.EffectiveRequirementFacade#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveRequirementFacade#getRequirement()
	 * @see #getEffectiveRequirementFacade()
	 * @generated
	 */
	EReference getEffectiveRequirementFacade_Requirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.EffectiveCapabilityFacade <em>Effective Capability Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Capability Facade</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveCapabilityFacade
	 * @generated
	 */
	EClass getEffectiveCapabilityFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.EffectiveCapabilityFacade#getProvidedCapability <em>Provided Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Capability</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveCapabilityFacade#getProvidedCapability()
	 * @see #getEffectiveCapabilityFacade()
	 * @generated
	 */
	EReference getEffectiveCapabilityFacade_ProvidedCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade <em>Effective Builder Reference Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Builder Reference Facade</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade
	 * @generated
	 */
	EClass getEffectiveBuilderReferenceFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getBuilderReference <em>Builder Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Builder Reference</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getBuilderReference()
	 * @see #getEffectiveBuilderReferenceFacade()
	 * @generated
	 */
	EReference getEffectiveBuilderReferenceFacade_BuilderReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getAliases()
	 * @see #getEffectiveBuilderReferenceFacade()
	 * @generated
	 */
	EAttribute getEffectiveBuilderReferenceFacade_Aliases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildResult <em>Build Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Result</em>'.
	 * @see org.eclipse.b3.build.build.BuildResult
	 * @generated
	 */
	EClass getBuildResult();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.build.BuildResult#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.build.BuildResult#getPathVectors()
	 * @see #getBuildResult()
	 * @generated
	 */
	EReference getBuildResult_PathVectors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuildResult#getValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Map</em>'.
	 * @see org.eclipse.b3.build.build.BuildResult#getValueMap()
	 * @see #getBuildResult()
	 * @generated
	 */
	EAttribute getBuildResult_ValueMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildResultContext <em>Build Result Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Result Context</em>'.
	 * @see org.eclipse.b3.build.build.BuildResultContext
	 * @generated
	 */
	EClass getBuildResultContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.VersionedCapability <em>Versioned Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Capability</em>'.
	 * @see org.eclipse.b3.build.build.VersionedCapability
	 * @generated
	 */
	EClass getVersionedCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.VersionedCapability#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.b3.build.build.VersionedCapability#getVersion()
	 * @see #getVersionedCapability()
	 * @generated
	 */
	EAttribute getVersionedCapability_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.b3.build.build.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.build.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.Capability#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.build.Capability#getNameSpace()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_NameSpace();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Capability#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.build.Capability#getCondExpr()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_CondExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.RequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.build.build.RequiredCapability
	 * @generated
	 */
	EClass getRequiredCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.RequiredCapability#getVersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Range</em>'.
	 * @see org.eclipse.b3.build.build.RequiredCapability#getVersionRange()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_VersionRange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ConditionalPathVector <em>Conditional Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Path Vector</em>'.
	 * @see org.eclipse.b3.build.build.ConditionalPathVector
	 * @generated
	 */
	EClass getConditionalPathVector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.ConditionalPathVector#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.build.ConditionalPathVector#getCondExpr()
	 * @see #getConditionalPathVector()
	 * @generated
	 */
	EReference getConditionalPathVector_CondExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.ConditionalPathVector#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.build.ConditionalPathVector#getPathVectors()
	 * @see #getConditionalPathVector()
	 * @generated
	 */
	EReference getConditionalPathVector_PathVectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.PathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Vector</em>'.
	 * @see org.eclipse.b3.build.build.PathVector
	 * @generated
	 */
	EClass getPathVector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.PathVector#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see org.eclipse.b3.build.build.PathVector#getBasePath()
	 * @see #getPathVector()
	 * @generated
	 */
	EAttribute getPathVector_BasePath();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.build.PathVector#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see org.eclipse.b3.build.build.PathVector#getPaths()
	 * @see #getPathVector()
	 * @generated
	 */
	EAttribute getPathVector_Paths();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see org.eclipse.b3.build.build.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.Synchronization#getBuilderQueries <em>Builder Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builder Queries</em>'.
	 * @see org.eclipse.b3.build.build.Synchronization#getBuilderQueries()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_BuilderQueries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.RepositoryConfiguration <em>Repository Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Configuration</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryConfiguration
	 * @generated
	 */
	EClass getRepositoryConfiguration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.RepositoryDeclaration <em>Repository Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Declaration</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration
	 * @generated
	 */
	EClass getRepositoryDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.RepositoryDeclaration#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration#getDocumentation()
	 * @see #getRepositoryDeclaration()
	 * @generated
	 */
	EAttribute getRepositoryDeclaration_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.RepositoryDeclaration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration#getLocation()
	 * @see #getRepositoryDeclaration()
	 * @generated
	 */
	EAttribute getRepositoryDeclaration_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.RepositoryDeclaration#getResolverType <em>Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolver Type</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration#getResolverType()
	 * @see #getRepositoryDeclaration()
	 * @generated
	 */
	EReference getRepositoryDeclaration_ResolverType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.RepositoryDeclaration#getContextBlock <em>Context Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Block</em>'.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration#getContextBlock()
	 * @see #getRepositoryDeclaration()
	 * @generated
	 */
	EReference getRepositoryDeclaration_ContextBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Strategy</em>'.
	 * @see org.eclipse.b3.build.build.ResolutionStrategy
	 * @generated
	 */
	EClass getResolutionStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.ResolutionStrategy#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.eclipse.b3.build.build.ResolutionStrategy#getRepositories()
	 * @see #getResolutionStrategy()
	 * @generated
	 */
	EReference getResolutionStrategy_Repositories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ResolutionStrategyFirst <em>Resolution Strategy First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Strategy First</em>'.
	 * @see org.eclipse.b3.build.build.ResolutionStrategyFirst
	 * @generated
	 */
	EClass getResolutionStrategyFirst();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ResolutionStrategyBest <em>Resolution Strategy Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Strategy Best</em>'.
	 * @see org.eclipse.b3.build.build.ResolutionStrategyBest
	 * @generated
	 */
	EClass getResolutionStrategyBest();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ContainerConfiguration <em>Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Configuration</em>'.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration
	 * @generated
	 */
	EClass getContainerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.ContainerConfiguration#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration#getDocumentation()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EAttribute getContainerConfiguration_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.ContainerConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration#getName()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EAttribute getContainerConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.ContainerConfiguration#getAgentType <em>Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent Type</em>'.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration#getAgentType()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_AgentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.ContainerConfiguration#getContextBlock <em>Context Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Block</em>'.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration#getContextBlock()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_ContextBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildContext <em>Build Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Context</em>'.
	 * @see org.eclipse.b3.build.build.BuildContext
	 * @generated
	 */
	EClass getBuildContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildConcernContext <em>Build Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Concern Context</em>'.
	 * @see org.eclipse.b3.build.build.BuildConcernContext
	 * @generated
	 */
	EClass getBuildConcernContext();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesRemovals <em>Default Properties Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Properties Removals</em>'.
	 * @see org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesRemovals()
	 * @see #getBuildConcernContext()
	 * @generated
	 */
	EAttribute getBuildConcernContext_DefaultPropertiesRemovals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesAdditions <em>Default Properties Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Properties Additions</em>'.
	 * @see org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesAdditions()
	 * @see #getBuildConcernContext()
	 * @generated
	 */
	EReference getBuildConcernContext_DefaultPropertiesAdditions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.RequiresPredicate <em>Requires Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Predicate</em>'.
	 * @see org.eclipse.b3.build.build.RequiresPredicate
	 * @generated
	 */
	EClass getRequiresPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.RequiresPredicate#getCapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.build.RequiresPredicate#getCapabilityPredicate()
	 * @see #getRequiresPredicate()
	 * @generated
	 */
	EReference getRequiresPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.RequiresPredicate#isMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see org.eclipse.b3.build.build.RequiresPredicate#isMeta()
	 * @see #getRequiresPredicate()
	 * @generated
	 */
	EAttribute getRequiresPredicate_Meta();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.CapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.build.CapabilityPredicate
	 * @generated
	 */
	EClass getCapabilityPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.CapabilityPredicate#getVersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Range</em>'.
	 * @see org.eclipse.b3.build.build.CapabilityPredicate#getVersionRange()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EAttribute getCapabilityPredicate_VersionRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.CapabilityPredicate#getNamePredicate <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.build.build.CapabilityPredicate#getNamePredicate()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EReference getCapabilityPredicate_NamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.CapabilityPredicate#getNameSpacePredicate <em>Name Space Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Space Predicate</em>'.
	 * @see org.eclipse.b3.build.build.CapabilityPredicate#getNameSpacePredicate()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EReference getCapabilityPredicate_NameSpacePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ImplementsPredicate <em>Implements Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements Predicate</em>'.
	 * @see org.eclipse.b3.build.build.ImplementsPredicate
	 * @generated
	 */
	EClass getImplementsPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.ImplementsPredicate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.build.build.ImplementsPredicate#getType()
	 * @see #getImplementsPredicate()
	 * @generated
	 */
	EReference getImplementsPredicate_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.ProvidesPredicate <em>Provides Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Predicate</em>'.
	 * @see org.eclipse.b3.build.build.ProvidesPredicate
	 * @generated
	 */
	EClass getProvidesPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.ProvidesPredicate#getCapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.build.ProvidesPredicate#getCapabilityPredicate()
	 * @see #getProvidesPredicate()
	 * @generated
	 */
	EReference getProvidesPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.NameSpacePredicate <em>Name Space Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Space Predicate</em>'.
	 * @see org.eclipse.b3.build.build.NameSpacePredicate
	 * @generated
	 */
	EClass getNameSpacePredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.NameSpacePredicate#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.build.NameSpacePredicate#getNameSpace()
	 * @see #getNameSpacePredicate()
	 * @generated
	 */
	EAttribute getNameSpacePredicate_NameSpace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.UnitNamePredicate <em>Unit Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Name Predicate</em>'.
	 * @see org.eclipse.b3.build.build.UnitNamePredicate
	 * @generated
	 */
	EClass getUnitNamePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderNamePredicate <em>Builder Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Name Predicate</em>'.
	 * @see org.eclipse.b3.build.build.BuilderNamePredicate
	 * @generated
	 */
	EClass getBuilderNamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderNamePredicate#getNamePredicate <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.build.build.BuilderNamePredicate#getNamePredicate()
	 * @see #getBuilderNamePredicate()
	 * @generated
	 */
	EReference getBuilderNamePredicate_NamePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.InputPredicate <em>Input Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Predicate</em>'.
	 * @see org.eclipse.b3.build.build.InputPredicate
	 * @generated
	 */
	EClass getInputPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.InputPredicate#getCapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.build.InputPredicate#getCapabilityPredicate()
	 * @see #getInputPredicate()
	 * @generated
	 */
	EReference getInputPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.InputPredicate#getBuilderPredicate <em>Builder Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Builder Predicate</em>'.
	 * @see org.eclipse.b3.build.build.InputPredicate#getBuilderPredicate()
	 * @see #getInputPredicate()
	 * @generated
	 */
	EReference getInputPredicate_BuilderPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.UnitConcernContext <em>Unit Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Concern Context</em>'.
	 * @see org.eclipse.b3.build.build.UnitConcernContext
	 * @generated
	 */
	EClass getUnitConcernContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.UnitConcernContext#getBuilderContexts <em>Builder Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builder Contexts</em>'.
	 * @see org.eclipse.b3.build.build.UnitConcernContext#getBuilderContexts()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_BuilderContexts();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.UnitConcernContext#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.b3.build.build.UnitConcernContext#getQuery()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.UnitConcernContext#getRequiresRemovals <em>Requires Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires Removals</em>'.
	 * @see org.eclipse.b3.build.build.UnitConcernContext#getRequiresRemovals()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_RequiresRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.UnitConcernContext#getProvidesRemovals <em>Provides Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides Removals</em>'.
	 * @see org.eclipse.b3.build.build.UnitConcernContext#getProvidesRemovals()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_ProvidesRemovals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderConcernContext <em>Builder Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Concern Context</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext
	 * @generated
	 */
	EClass getBuilderConcernContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getQuery()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getInputAdditions <em>Input Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Additions</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getInputAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_InputAdditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getInputRemovals <em>Input Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Removals</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getInputRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_InputRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getOutputAdditions <em>Output Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Additions</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getOutputAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_OutputAdditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getOutputRemovals <em>Output Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Removals</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getOutputRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_OutputRemovals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getFuncExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_FuncExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#isVarArgs()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_VarArgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getParameters()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Parameters</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#isMatchParameters()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_MatchParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderConcernContext#isRemovePreCondition <em>Remove Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Pre Condition</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#isRemovePreCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePreCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderConcernContext#isRemovePostCondition <em>Remove Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Post Condition</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#isRemovePostCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePostCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderConcernContext#isRemovePostInputCondition <em>Remove Post Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Post Input Condition</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#isRemovePostInputCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePostInputCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getPrecondExpr <em>Precond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getPrecondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getPostcondExpr <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getPostcondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PostcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getPostinputcondExpr <em>Postinputcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postinputcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getPostinputcondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PostinputcondExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getProvidesRemovals <em>Provides Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides Removals</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getProvidesRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_ProvidesRemovals();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.build.BuilderConcernContext#getAnnotationsRemovals <em>Annotations Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations Removals</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getAnnotationsRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_AnnotationsRemovals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderConcernContext#getAnnotationsAdditions <em>Annotations Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations Additions</em>'.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext#getAnnotationsAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_AnnotationsAdditions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.OutputPredicate <em>Output Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Predicate</em>'.
	 * @see org.eclipse.b3.build.build.OutputPredicate
	 * @generated
	 */
	EClass getOutputPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.OutputPredicate#getPathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Vector</em>'.
	 * @see org.eclipse.b3.build.build.OutputPredicate#getPathVector()
	 * @see #getOutputPredicate()
	 * @generated
	 */
	EReference getOutputPredicate_PathVector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.OutputPredicate#getPathPattern <em>Path Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Pattern</em>'.
	 * @see org.eclipse.b3.build.build.OutputPredicate#getPathPattern()
	 * @see #getOutputPredicate()
	 * @generated
	 */
	EReference getOutputPredicate_PathPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.AliasedRequiredCapability <em>Aliased Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aliased Required Capability</em>'.
	 * @see org.eclipse.b3.build.build.AliasedRequiredCapability
	 * @generated
	 */
	EClass getAliasedRequiredCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.AliasedRequiredCapability#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.b3.build.build.AliasedRequiredCapability#getAlias()
	 * @see #getAliasedRequiredCapability()
	 * @generated
	 */
	EAttribute getAliasedRequiredCapability_Alias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRequired Capability Container</em>'.
	 * @see org.eclipse.b3.build.build.IRequiredCapabilityContainer
	 * @generated
	 */
	EClass getIRequiredCapabilityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.IRequiredCapabilityContainer#getRequiredCapabilities()
	 * @see #getIRequiredCapabilityContainer()
	 * @generated
	 */
	EReference getIRequiredCapabilityContainer_RequiredCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProvided Capability Container</em>'.
	 * @see org.eclipse.b3.build.build.IProvidedCapabilityContainer
	 * @generated
	 */
	EClass getIProvidedCapabilityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.IProvidedCapabilityContainer#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.IProvidedCapabilityContainer#getProvidedCapabilities()
	 * @see #getIProvidedCapabilityContainer()
	 * @generated
	 */
	EReference getIProvidedCapabilityContainer_ProvidedCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderQuery <em>Builder Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Query</em>'.
	 * @see org.eclipse.b3.build.build.BuilderQuery
	 * @generated
	 */
	EClass getBuilderQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderQuery#getBuilderQueries <em>Builder Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builder Queries</em>'.
	 * @see org.eclipse.b3.build.build.BuilderQuery#getBuilderQueries()
	 * @see #getBuilderQuery()
	 * @generated
	 */
	EReference getBuilderQuery_BuilderQueries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderQuery#getUnitQuery <em>Unit Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Query</em>'.
	 * @see org.eclipse.b3.build.build.BuilderQuery#getUnitQuery()
	 * @see #getBuilderQuery()
	 * @generated
	 */
	EReference getBuilderQuery_UnitQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderInput <em>Builder Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Input</em>'.
	 * @see org.eclipse.b3.build.build.BuilderInput
	 * @generated
	 */
	EClass getBuilderInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuilderInput#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see org.eclipse.b3.build.build.BuilderInput#getPrerequisites()
	 * @see #getBuilderInput()
	 * @generated
	 */
	EReference getBuilderInput_Prerequisites();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.PathGroup <em>Path Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Group</em>'.
	 * @see org.eclipse.b3.build.build.PathGroup
	 * @generated
	 */
	EClass getPathGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.PathGroup#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see org.eclipse.b3.build.build.PathGroup#getAnnotations()
	 * @see #getPathGroup()
	 * @generated
	 */
	EReference getPathGroup_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.PathGroup#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.build.PathGroup#getPathVectors()
	 * @see #getPathGroup()
	 * @generated
	 */
	EReference getPathGroup_PathVectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisite</em>'.
	 * @see org.eclipse.b3.build.build.Prerequisite
	 * @generated
	 */
	EClass getPrerequisite();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Prerequisite#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.build.Prerequisite#getCondExpr()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_CondExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.Prerequisite#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.b3.build.build.Prerequisite#getAlias()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EAttribute getPrerequisite_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Prerequisite#getWithExpr <em>With Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With Expr</em>'.
	 * @see org.eclipse.b3.build.build.Prerequisite#getWithExpr()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_WithExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Prerequisite#getBuildResult <em>Build Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build Result</em>'.
	 * @see org.eclipse.b3.build.build.Prerequisite#getBuildResult()
	 * @see #getPrerequisite()
	 * @generated
	 */
	EReference getPrerequisite_BuildResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuildResultReference <em>Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Result Reference</em>'.
	 * @see org.eclipse.b3.build.build.BuildResultReference
	 * @generated
	 */
	EClass getBuildResultReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.CompoundBuildResultReference <em>Compound Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Build Result Reference</em>'.
	 * @see org.eclipse.b3.build.build.CompoundBuildResultReference
	 * @generated
	 */
	EClass getCompoundBuildResultReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.CompoundBuildResultReference#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prerequisites</em>'.
	 * @see org.eclipse.b3.build.build.CompoundBuildResultReference#getPrerequisites()
	 * @see #getCompoundBuildResultReference()
	 * @generated
	 */
	EReference getCompoundBuildResultReference_Prerequisites();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderReference <em>Builder Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Reference</em>'.
	 * @see org.eclipse.b3.build.build.BuilderReference
	 * @generated
	 */
	EClass getBuilderReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderReference#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.eclipse.b3.build.build.BuilderReference#getParameters()
	 * @see #getBuilderReference()
	 * @generated
	 */
	EReference getBuilderReference_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.BuilderReference#getBuilderName <em>Builder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder Name</em>'.
	 * @see org.eclipse.b3.build.build.BuilderReference#getBuilderName()
	 * @see #getBuilderReference()
	 * @generated
	 */
	EAttribute getBuilderReference_BuilderName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderReference#getRequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.build.build.BuilderReference#getRequiredCapability()
	 * @see #getBuilderReference()
	 * @generated
	 */
	EReference getBuilderReference_RequiredCapability();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.build.BuilderReference#getRequiredCapabilityReference <em>Required Capability Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Capability Reference</em>'.
	 * @see org.eclipse.b3.build.build.BuilderReference#getRequiredCapabilityReference()
	 * @see #getBuilderReference()
	 * @generated
	 */
	EReference getBuilderReference_RequiredCapabilityReference();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.VersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Range</em>'.
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.VersionRange"
	 * @generated
	 */
	EDataType getVersionRange();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	B3BuildFactory getB3BuildFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildUnitImpl <em>Build Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildUnitImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildUnit()
		 * @generated
		 */
		EClass BUILD_UNIT = eINSTANCE.getBuildUnit();

		/**
		 * The meta object literal for the '<em><b>Builders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__BUILDERS = eINSTANCE.getBuildUnit_Builders();

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
		 * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__META_REQUIRED_CAPABILITIES = eINSTANCE.getBuildUnit_MetaRequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__IMPLEMENTS = eINSTANCE.getBuildUnit_Implements();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__CONCERNS = eINSTANCE.getBuildUnit_Concerns();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__DEFAULT_PROPERTIES = eINSTANCE.getBuildUnit_DefaultProperties();

		/**
		 * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__SYNCHRONIZATIONS = eINSTANCE.getBuildUnit_Synchronizations();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__REPOSITORIES = eINSTANCE.getBuildUnit_Repositories();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__CONTAINERS = eINSTANCE.getBuildUnit_Containers();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__PROPERTY_SETS = eINSTANCE.getBuildUnit_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Base Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_UNIT__BASE_LOCATION = eINSTANCE.getBuildUnit_BaseLocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.IBuilder <em>IBuilder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.IBuilder
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIBuilder()
		 * @generated
		 */
		EClass IBUILDER = eINSTANCE.getIBuilder();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__POSTCOND_EXPR = eINSTANCE.getIBuilder_PostcondExpr();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__PRECOND_EXPR = eINSTANCE.getIBuilder_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__INPUT = eINSTANCE.getIBuilder_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__OUTPUT = eINSTANCE.getIBuilder_Output();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__DEFAULT_PROPERTIES = eINSTANCE.getIBuilder_DefaultProperties();

		/**
		 * The meta object literal for the '<em><b>Postinputcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__POSTINPUTCOND_EXPR = eINSTANCE.getIBuilder_PostinputcondExpr();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IBUILDER__UNIT_TYPE = eINSTANCE.getIBuilder_UnitType();

		/**
		 * The meta object literal for the '<em><b>Explicit Unit Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IBUILDER__EXPLICIT_UNIT_TYPE = eINSTANCE.getIBuilder_ExplicitUnitType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderImpl <em>Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilder()
		 * @generated
		 */
		EClass BUILDER = eINSTANCE.getBuilder();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderJavaImpl <em>Builder Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderJavaImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderJava()
		 * @generated
		 */
		EClass BUILDER_JAVA = eINSTANCE.getBuilderJava();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl <em>Builder Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderWrapperImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderWrapper()
		 * @generated
		 */
		EClass BUILDER_WRAPPER = eINSTANCE.getBuilderWrapper();

		/**
		 * The meta object literal for the '<em><b>Input Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__INPUT_ADVISED = eINSTANCE.getBuilderWrapper_InputAdvised();

		/**
		 * The meta object literal for the '<em><b>Output Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__OUTPUT_ADVISED = eINSTANCE.getBuilderWrapper_OutputAdvised();

		/**
		 * The meta object literal for the '<em><b>Unit Type Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__UNIT_TYPE_ADVISED = eINSTANCE.getBuilderWrapper_UnitTypeAdvised();

		/**
		 * The meta object literal for the '<em><b>Provides Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__PROVIDES_ADVISED = eINSTANCE.getBuilderWrapper_ProvidesAdvised();

		/**
		 * The meta object literal for the '<em><b>Default Properties Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED = eINSTANCE.getBuilderWrapper_DefaultPropertiesAdvised();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BeeModelImpl <em>Bee Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BeeModelImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBeeModel()
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
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEE_MODEL__CONCERNS = eINSTANCE.getBeeModel_Concerns();

		/**
		 * The meta object literal for the '<em><b>Build Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEE_MODEL__BUILD_UNITS = eINSTANCE.getBeeModel_BuildUnits();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEE_MODEL__PROPERTY_SETS = eINSTANCE.getBeeModel_PropertySets();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BeeHiveImpl <em>Bee Hive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BeeHiveImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBeeHive()
		 * @generated
		 */
		EClass BEE_HIVE = eINSTANCE.getBeeHive();

		/**
		 * The meta object literal for the '<em><b>Bee Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEE_HIVE__BEE_MODELS = eINSTANCE.getBeeHive_BeeModels();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEE_HIVE__PARENT = eINSTANCE.getBeeHive_Parent();

		/**
		 * The meta object literal for the '<em><b>Resolutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEE_HIVE__RESOLUTIONS = eINSTANCE.getBeeHive_Resolutions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ResolutionInfoImpl <em>Resolution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ResolutionInfoImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionInfo()
		 * @generated
		 */
		EClass RESOLUTION_INFO = eINSTANCE.getResolutionInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.EffectiveFacadeImpl <em>Effective Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.EffectiveFacadeImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveFacade()
		 * @generated
		 */
		EClass EFFECTIVE_FACADE = eINSTANCE.getEffectiveFacade();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_FACADE__CONTEXT = eINSTANCE.getEffectiveFacade_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.EffectiveUnitFacadeImpl <em>Effective Unit Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.EffectiveUnitFacadeImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveUnitFacade()
		 * @generated
		 */
		EClass EFFECTIVE_UNIT_FACADE = eINSTANCE.getEffectiveUnitFacade();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__UNIT = eINSTANCE.getEffectiveUnitFacade_Unit();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_ProvidedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_MetaRequiredCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.EffectiveRequirementFacadeImpl <em>Effective Requirement Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.EffectiveRequirementFacadeImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveRequirementFacade()
		 * @generated
		 */
		EClass EFFECTIVE_REQUIREMENT_FACADE = eINSTANCE.getEffectiveRequirementFacade();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT = eINSTANCE.getEffectiveRequirementFacade_Requirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.EffectiveCapabilityFacadeImpl <em>Effective Capability Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.EffectiveCapabilityFacadeImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveCapabilityFacade()
		 * @generated
		 */
		EClass EFFECTIVE_CAPABILITY_FACADE = eINSTANCE.getEffectiveCapabilityFacade();

		/**
		 * The meta object literal for the '<em><b>Provided Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY = eINSTANCE.getEffectiveCapabilityFacade_ProvidedCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl <em>Effective Builder Reference Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.EffectiveBuilderReferenceFacadeImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getEffectiveBuilderReferenceFacade()
		 * @generated
		 */
		EClass EFFECTIVE_BUILDER_REFERENCE_FACADE = eINSTANCE.getEffectiveBuilderReferenceFacade();

		/**
		 * The meta object literal for the '<em><b>Builder Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIVE_BUILDER_REFERENCE_FACADE__BUILDER_REFERENCE = eINSTANCE.getEffectiveBuilderReferenceFacade_BuilderReference();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECTIVE_BUILDER_REFERENCE_FACADE__ALIASES = eINSTANCE.getEffectiveBuilderReferenceFacade_Aliases();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildResultImpl <em>Build Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildResultImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResult()
		 * @generated
		 */
		EClass BUILD_RESULT = eINSTANCE.getBuildResult();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_RESULT__PATH_VECTORS = eINSTANCE.getBuildResult_PathVectors();

		/**
		 * The meta object literal for the '<em><b>Value Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_RESULT__VALUE_MAP = eINSTANCE.getBuildResult_ValueMap();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildResultContextImpl <em>Build Result Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildResultContextImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResultContext()
		 * @generated
		 */
		EClass BUILD_RESULT_CONTEXT = eINSTANCE.getBuildResultContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.VersionedCapabilityImpl <em>Versioned Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.VersionedCapabilityImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionedCapability()
		 * @generated
		 */
		EClass VERSIONED_CAPABILITY = eINSTANCE.getVersionedCapability();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_CAPABILITY__VERSION = eINSTANCE.getVersionedCapability_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.CapabilityImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME_SPACE = eINSTANCE.getCapability_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__COND_EXPR = eINSTANCE.getCapability_CondExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.RequiredCapabilityImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRequiredCapability()
		 * @generated
		 */
		EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__VERSION_RANGE = eINSTANCE.getRequiredCapability_VersionRange();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl <em>Conditional Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ConditionalPathVectorImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getConditionalPathVector()
		 * @generated
		 */
		EClass CONDITIONAL_PATH_VECTOR = eINSTANCE.getConditionalPathVector();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_PATH_VECTOR__COND_EXPR = eINSTANCE.getConditionalPathVector_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_PATH_VECTOR__PATH_VECTORS = eINSTANCE.getConditionalPathVector_PathVectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.PathVectorImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVector()
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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.SynchronizationImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Builder Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__BUILDER_QUERIES = eINSTANCE.getSynchronization_BuilderQueries();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryConfiguration()
		 * @generated
		 */
		EClass REPOSITORY_CONFIGURATION = eINSTANCE.getRepositoryConfiguration();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl <em>Repository Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryDeclaration()
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
		 * The meta object literal for the '<em><b>Resolver Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DECLARATION__RESOLVER_TYPE = eINSTANCE.getRepositoryDeclaration_ResolverType();

		/**
		 * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DECLARATION__CONTEXT_BLOCK = eINSTANCE.getRepositoryDeclaration_ContextBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyImpl <em>Resolution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategy()
		 * @generated
		 */
		EClass RESOLUTION_STRATEGY = eINSTANCE.getResolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_STRATEGY__REPOSITORIES = eINSTANCE.getResolutionStrategy_Repositories();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl <em>Resolution Strategy First</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyFirst()
		 * @generated
		 */
		EClass RESOLUTION_STRATEGY_FIRST = eINSTANCE.getResolutionStrategyFirst();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl <em>Resolution Strategy Best</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyBest()
		 * @generated
		 */
		EClass RESOLUTION_STRATEGY_BEST = eINSTANCE.getResolutionStrategyBest();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ContainerConfigurationImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getContainerConfiguration()
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
		 * The meta object literal for the '<em><b>Agent Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__AGENT_TYPE = eINSTANCE.getContainerConfiguration_AgentType();

		/**
		 * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__CONTEXT_BLOCK = eINSTANCE.getContainerConfiguration_ContextBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildContextImpl <em>Build Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildContextImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildContext()
		 * @generated
		 */
		EClass BUILD_CONTEXT = eINSTANCE.getBuildContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildConcernContextImpl <em>Build Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildConcernContextImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildConcernContext()
		 * @generated
		 */
		EClass BUILD_CONCERN_CONTEXT = eINSTANCE.getBuildConcernContext();

		/**
		 * The meta object literal for the '<em><b>Default Properties Removals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = eINSTANCE.getBuildConcernContext_DefaultPropertiesRemovals();

		/**
		 * The meta object literal for the '<em><b>Default Properties Additions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = eINSTANCE.getBuildConcernContext_DefaultPropertiesAdditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.RequiresPredicateImpl <em>Requires Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.RequiresPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRequiresPredicate()
		 * @generated
		 */
		EClass REQUIRES_PREDICATE = eINSTANCE.getRequiresPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getRequiresPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES_PREDICATE__META = eINSTANCE.getRequiresPredicate_Meta();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl <em>Capability Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.CapabilityPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCapabilityPredicate()
		 * @generated
		 */
		EClass CAPABILITY_PREDICATE = eINSTANCE.getCapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY_PREDICATE__VERSION_RANGE = eINSTANCE.getCapabilityPredicate_VersionRange();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PREDICATE__NAME_PREDICATE = eINSTANCE.getCapabilityPredicate_NamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Space Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE = eINSTANCE.getCapabilityPredicate_NameSpacePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ImplementsPredicateImpl <em>Implements Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ImplementsPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getImplementsPredicate()
		 * @generated
		 */
		EClass IMPLEMENTS_PREDICATE = eINSTANCE.getImplementsPredicate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS_PREDICATE__TYPE = eINSTANCE.getImplementsPredicate_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.ProvidesPredicateImpl <em>Provides Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.ProvidesPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getProvidesPredicate()
		 * @generated
		 */
		EClass PROVIDES_PREDICATE = eINSTANCE.getProvidesPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getProvidesPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.NameSpacePredicateImpl <em>Name Space Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.NameSpacePredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getNameSpacePredicate()
		 * @generated
		 */
		EClass NAME_SPACE_PREDICATE = eINSTANCE.getNameSpacePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_SPACE_PREDICATE__NAME_SPACE = eINSTANCE.getNameSpacePredicate_NameSpace();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.UnitNamePredicateImpl <em>Unit Name Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.UnitNamePredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitNamePredicate()
		 * @generated
		 */
		EClass UNIT_NAME_PREDICATE = eINSTANCE.getUnitNamePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderNamePredicateImpl <em>Builder Name Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderNamePredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderNamePredicate()
		 * @generated
		 */
		EClass BUILDER_NAME_PREDICATE = eINSTANCE.getBuilderNamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_NAME_PREDICATE__NAME_PREDICATE = eINSTANCE.getBuilderNamePredicate_NamePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.InputPredicateImpl <em>Input Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.InputPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getInputPredicate()
		 * @generated
		 */
		EClass INPUT_PREDICATE = eINSTANCE.getInputPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getInputPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Builder Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PREDICATE__BUILDER_PREDICATE = eINSTANCE.getInputPredicate_BuilderPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.UnitConcernContextImpl <em>Unit Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.UnitConcernContextImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitConcernContext()
		 * @generated
		 */
		EClass UNIT_CONCERN_CONTEXT = eINSTANCE.getUnitConcernContext();

		/**
		 * The meta object literal for the '<em><b>Builder Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS = eINSTANCE.getUnitConcernContext_BuilderContexts();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__QUERY = eINSTANCE.getUnitConcernContext_Query();

		/**
		 * The meta object literal for the '<em><b>Requires Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS = eINSTANCE.getUnitConcernContext_RequiresRemovals();

		/**
		 * The meta object literal for the '<em><b>Provides Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS = eINSTANCE.getUnitConcernContext_ProvidesRemovals();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl <em>Builder Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderConcernContextImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderConcernContext()
		 * @generated
		 */
		EClass BUILDER_CONCERN_CONTEXT = eINSTANCE.getBuilderConcernContext();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__QUERY = eINSTANCE.getBuilderConcernContext_Query();

		/**
		 * The meta object literal for the '<em><b>Input Additions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS = eINSTANCE.getBuilderConcernContext_InputAdditions();

		/**
		 * The meta object literal for the '<em><b>Input Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS = eINSTANCE.getBuilderConcernContext_InputRemovals();

		/**
		 * The meta object literal for the '<em><b>Output Additions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS = eINSTANCE.getBuilderConcernContext_OutputAdditions();

		/**
		 * The meta object literal for the '<em><b>Output Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS = eINSTANCE.getBuilderConcernContext_OutputRemovals();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__FUNC_EXPR = eINSTANCE.getBuilderConcernContext_FuncExpr();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__VAR_ARGS = eINSTANCE.getBuilderConcernContext_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PARAMETERS = eINSTANCE.getBuilderConcernContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Match Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS = eINSTANCE.getBuilderConcernContext_MatchParameters();

		/**
		 * The meta object literal for the '<em><b>Remove Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePreCondition();

		/**
		 * The meta object literal for the '<em><b>Remove Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePostCondition();

		/**
		 * The meta object literal for the '<em><b>Remove Post Input Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePostInputCondition();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PRECOND_EXPR = eINSTANCE.getBuilderConcernContext_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR = eINSTANCE.getBuilderConcernContext_PostcondExpr();

		/**
		 * The meta object literal for the '<em><b>Postinputcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR = eINSTANCE.getBuilderConcernContext_PostinputcondExpr();

		/**
		 * The meta object literal for the '<em><b>Provides Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS = eINSTANCE.getBuilderConcernContext_ProvidesRemovals();

		/**
		 * The meta object literal for the '<em><b>Annotations Removals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__ANNOTATIONS_REMOVALS = eINSTANCE.getBuilderConcernContext_AnnotationsRemovals();

		/**
		 * The meta object literal for the '<em><b>Annotations Additions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__ANNOTATIONS_ADDITIONS = eINSTANCE.getBuilderConcernContext_AnnotationsAdditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.OutputPredicateImpl <em>Output Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.OutputPredicateImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getOutputPredicate()
		 * @generated
		 */
		EClass OUTPUT_PREDICATE = eINSTANCE.getOutputPredicate();

		/**
		 * The meta object literal for the '<em><b>Path Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PREDICATE__PATH_VECTOR = eINSTANCE.getOutputPredicate_PathVector();

		/**
		 * The meta object literal for the '<em><b>Path Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PREDICATE__PATH_PATTERN = eINSTANCE.getOutputPredicate_PathPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.AliasedRequiredCapabilityImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getAliasedRequiredCapability()
		 * @generated
		 */
		EClass ALIASED_REQUIRED_CAPABILITY = eINSTANCE.getAliasedRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIASED_REQUIRED_CAPABILITY__ALIAS = eINSTANCE.getAliasedRequiredCapability_Alias();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.IRequiredCapabilityContainer
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIRequiredCapabilityContainer()
		 * @generated
		 */
		EClass IREQUIRED_CAPABILITY_CONTAINER = eINSTANCE.getIRequiredCapabilityContainer();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES = eINSTANCE.getIRequiredCapabilityContainer_RequiredCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.IProvidedCapabilityContainer
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIProvidedCapabilityContainer()
		 * @generated
		 */
		EClass IPROVIDED_CAPABILITY_CONTAINER = eINSTANCE.getIProvidedCapabilityContainer();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES = eINSTANCE.getIProvidedCapabilityContainer_ProvidedCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderQueryImpl <em>Builder Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderQueryImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderQuery()
		 * @generated
		 */
		EClass BUILDER_QUERY = eINSTANCE.getBuilderQuery();

		/**
		 * The meta object literal for the '<em><b>Builder Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_QUERY__BUILDER_QUERIES = eINSTANCE.getBuilderQuery_BuilderQueries();

		/**
		 * The meta object literal for the '<em><b>Unit Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_QUERY__UNIT_QUERY = eINSTANCE.getBuilderQuery_UnitQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderInputImpl <em>Builder Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderInputImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderInput()
		 * @generated
		 */
		EClass BUILDER_INPUT = eINSTANCE.getBuilderInput();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_INPUT__PREREQUISITES = eINSTANCE.getBuilderInput_Prerequisites();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.PathGroupImpl <em>Path Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.PathGroupImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathGroup()
		 * @generated
		 */
		EClass PATH_GROUP = eINSTANCE.getPathGroup();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_GROUP__ANNOTATIONS = eINSTANCE.getPathGroup_Annotations();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_GROUP__PATH_VECTORS = eINSTANCE.getPathGroup_PathVectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.PrerequisiteImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPrerequisite()
		 * @generated
		 */
		EClass PREREQUISITE = eINSTANCE.getPrerequisite();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__COND_EXPR = eINSTANCE.getPrerequisite_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITE__ALIAS = eINSTANCE.getPrerequisite_Alias();

		/**
		 * The meta object literal for the '<em><b>With Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__WITH_EXPR = eINSTANCE.getPrerequisite_WithExpr();

		/**
		 * The meta object literal for the '<em><b>Build Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREREQUISITE__BUILD_RESULT = eINSTANCE.getPrerequisite_BuildResult();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuildResultReferenceImpl <em>Build Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuildResultReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResultReference()
		 * @generated
		 */
		EClass BUILD_RESULT_REFERENCE = eINSTANCE.getBuildResultReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.CompoundBuildResultReferenceImpl <em>Compound Build Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.CompoundBuildResultReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCompoundBuildResultReference()
		 * @generated
		 */
		EClass COMPOUND_BUILD_RESULT_REFERENCE = eINSTANCE.getCompoundBuildResultReference();

		/**
		 * The meta object literal for the '<em><b>Prerequisites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES = eINSTANCE.getCompoundBuildResultReference_Prerequisites();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl <em>Builder Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderReference()
		 * @generated
		 */
		EClass BUILDER_REFERENCE = eINSTANCE.getBuilderReference();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_REFERENCE__PARAMETERS = eINSTANCE.getBuilderReference_Parameters();

		/**
		 * The meta object literal for the '<em><b>Builder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDER_REFERENCE__BUILDER_NAME = eINSTANCE.getBuilderReference_BuilderName();

		/**
		 * The meta object literal for the '<em><b>Required Capability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_REFERENCE__REQUIRED_CAPABILITY = eINSTANCE.getBuilderReference_RequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Required Capability Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_REFERENCE__REQUIRED_CAPABILITY_REFERENCE = eINSTANCE.getBuilderReference_RequiredCapabilityReference();

		/**
		 * The meta object literal for the '<em>Version Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.equinox.p2.metadata.VersionRange
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionRange()
		 * @generated
		 */
		EDataType VERSION_RANGE = eINSTANCE.getVersionRange();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.equinox.p2.metadata.Version
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //B3BuildPackage
