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
	 * The feature id for the '<em><b>Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONTAINER_TYPE = VERSIONED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__META_REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__IMPLEMENTS = VERSIONED_CAPABILITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONCERNS = VERSIONED_CAPABILITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__DEFAULT_PROPERTIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROPERTY_SETS = VERSIONED_CAPABILITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__SYNCHRONIZATIONS = VERSIONED_CAPABILITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REPOSITORIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONTAINERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 14;

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
	int BUILDER = 1;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__LINE_NUMBER = B3backendPackage.B3_FUNCTION__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>File Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__FILE_REFERENCE = B3backendPackage.B3_FUNCTION__FILE_REFERENCE;

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
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__FUNC_EXPR = B3backendPackage.B3_FUNCTION__FUNC_EXPR;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__POSTCOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PRECOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER__PROVIDED_CAPABILITIES = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_FEATURE_COUNT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 6;


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
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT__PRECOND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT__POSTCOND_EXPR = 1;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PathGroupImpl <em>Path Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PathGroupImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathGroup()
	 * @generated
	 */
	int PATH_GROUP = 4;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PrerequisiteImpl <em>Prerequisite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PrerequisiteImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPrerequisite()
	 * @generated
	 */
	int PREREQUISITE = 5;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildResultReferenceImpl <em>Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildResultReference()
	 * @generated
	 */
	int BUILD_RESULT_REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_REFERENCE_FEATURE_COUNT = 0;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuilderReferenceImpl <em>Builder Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuilderReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderReference()
	 * @generated
	 */
	int BUILDER_REFERENCE = 8;

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
	 * The number of structural features of the '<em>Builder Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_REFERENCE_FEATURE_COUNT = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PathVectorImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVector()
	 * @generated
	 */
	int PATH_VECTOR = 11;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__COND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__BASE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__PATHS = 2;

	/**
	 * The number of structural features of the '<em>Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.CompoundPathVectorImpl <em>Compound Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.CompoundPathVectorImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCompoundPathVector()
	 * @generated
	 */
	int COMPOUND_PATH_VECTOR = 12;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PATH_VECTOR__COND_EXPR = PATH_VECTOR__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PATH_VECTOR__BASE_PATH = PATH_VECTOR__BASE_PATH;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PATH_VECTOR__PATHS = PATH_VECTOR__PATHS;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PATH_VECTOR__PATH_VECTORS = PATH_VECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PATH_VECTOR_FEATURE_COUNT = PATH_VECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.PathVectorElementImpl <em>Path Vector Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.PathVectorElementImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVectorElement()
	 * @generated
	 */
	int PATH_VECTOR_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_ELEMENT__COND_EXPR = PATH_VECTOR__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_ELEMENT__BASE_PATH = PATH_VECTOR__BASE_PATH;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_ELEMENT__PATHS = PATH_VECTOR__PATHS;

	/**
	 * The number of structural features of the '<em>Path Vector Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_ELEMENT_FEATURE_COUNT = PATH_VECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.SynchronizationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 14;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__BUILDERS = 0;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl <em>Synchronized Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getSynchronizedBuilder()
	 * @generated
	 */
	int SYNCHRONIZED_BUILDER = 15;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BUILDER__NAME_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BUILDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BUILDER__BUILDER_NAME = 2;

	/**
	 * The number of structural features of the '<em>Synchronized Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_BUILDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl <em>Repository Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryConfiguration()
	 * @generated
	 */
	int REPOSITORY_CONFIGURATION = 16;

	/**
	 * The number of structural features of the '<em>Repository Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl <em>Repository Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRepositoryDeclaration()
	 * @generated
	 */
	int REPOSITORY_DECLARATION = 17;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyImpl <em>Resolution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategy()
	 * @generated
	 */
	int RESOLUTION_STRATEGY = 18;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl <em>Resolution Strategy First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyFirstImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyFirst()
	 * @generated
	 */
	int RESOLUTION_STRATEGY_FIRST = 19;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl <em>Resolution Strategy Best</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ResolutionStrategyBestImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getResolutionStrategyBest()
	 * @generated
	 */
	int RESOLUTION_STRATEGY_BEST = 20;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.ContainerConfigurationImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getContainerConfiguration()
	 * @generated
	 */
	int CONTAINER_CONFIGURATION = 21;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.BuildContextImpl <em>Build Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.BuildContextImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuildContext()
	 * @generated
	 */
	int BUILD_CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__PARENT_CONTEXT = B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT__CHILD_CONTEXTS = B3backendPackage.BEXECUTION_CONTEXT__CHILD_CONTEXTS;

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
	 * The number of structural features of the '<em>Build Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_CONTEXT_FEATURE_COUNT = B3backendPackage.BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Version Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.internal.provisional.p2.core.VersionRange
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionRange()
	 * @generated
	 */
	int VERSION_RANGE = 23;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.internal.provisional.p2.core.Version
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 24;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getURI()
	 * @generated
	 */
	int URI = 25;


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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getUnitProvidedCapabilities()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_UnitProvidedCapabilities();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.BuildUnit#getRequiredCapabilities <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.BuildUnit#getRequiredCapabilities()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_RequiredCapabilities();

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
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder</em>'.
	 * @see org.eclipse.b3.build.build.Builder
	 * @generated
	 */
	EClass getBuilder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Builder#getPostcondExpr <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getPostcondExpr()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_PostcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Builder#getPrecondExpr <em>Precond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getPrecondExpr()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.Builder#getProvidedCapabilities <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getProvidedCapabilities()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_ProvidedCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Builder#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getInput()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Builder#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getOutput()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.Builder#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.build.Builder#getDefaultProperties()
	 * @see #getBuilder()
	 * @generated
	 */
	EReference getBuilder_DefaultProperties();

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
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.PathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Vector</em>'.
	 * @see org.eclipse.b3.build.build.PathVector
	 * @generated
	 */
	EClass getPathVector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.PathVector#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.build.PathVector#getCondExpr()
	 * @see #getPathVector()
	 * @generated
	 */
	EReference getPathVector_CondExpr();

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
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.CompoundPathVector <em>Compound Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Path Vector</em>'.
	 * @see org.eclipse.b3.build.build.CompoundPathVector
	 * @generated
	 */
	EClass getCompoundPathVector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.CompoundPathVector#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.build.CompoundPathVector#getPathVectors()
	 * @see #getCompoundPathVector()
	 * @generated
	 */
	EReference getCompoundPathVector_PathVectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.PathVectorElement <em>Path Vector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Vector Element</em>'.
	 * @see org.eclipse.b3.build.build.PathVectorElement
	 * @generated
	 */
	EClass getPathVectorElement();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.build.Synchronization#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builders</em>'.
	 * @see org.eclipse.b3.build.build.Synchronization#getBuilders()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_Builders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.SynchronizedBuilder <em>Synchronized Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized Builder</em>'.
	 * @see org.eclipse.b3.build.build.SynchronizedBuilder
	 * @generated
	 */
	EClass getSynchronizedBuilder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.build.SynchronizedBuilder#getNameSpace()
	 * @see #getSynchronizedBuilder()
	 * @generated
	 */
	EAttribute getSynchronizedBuilder_NameSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.build.SynchronizedBuilder#getName()
	 * @see #getSynchronizedBuilder()
	 * @generated
	 */
	EAttribute getSynchronizedBuilder_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.SynchronizedBuilder#getBuilderName <em>Builder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder Name</em>'.
	 * @see org.eclipse.b3.build.build.SynchronizedBuilder#getBuilderName()
	 * @see #getSynchronizedBuilder()
	 * @generated
	 */
	EAttribute getSynchronizedBuilder_BuilderName();

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
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.BuilderInput <em>Builder Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder Input</em>'.
	 * @see org.eclipse.b3.build.build.BuilderInput
	 * @generated
	 */
	EClass getBuilderInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderInput#getPrecondExpr <em>Precond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderInput#getPrecondExpr()
	 * @see #getBuilderInput()
	 * @generated
	 */
	EReference getBuilderInput_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuilderInput#getPostcondExpr <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.build.BuilderInput#getPostcondExpr()
	 * @see #getBuilderInput()
	 * @generated
	 */
	EReference getBuilderInput_PostcondExpr();

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
	 * Returns the meta object for data type '{@link org.eclipse.equinox.internal.provisional.p2.core.VersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Range</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.core.VersionRange
	 * @model instanceClass="org.eclipse.equinox.internal.provisional.p2.core.VersionRange"
	 * @generated
	 */
	EDataType getVersionRange();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.internal.provisional.p2.core.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.eclipse.equinox.internal.provisional.p2.core.Version
	 * @model instanceClass="org.eclipse.equinox.internal.provisional.p2.core.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

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
		 * The meta object literal for the '<em><b>Unit Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES = eINSTANCE.getBuildUnit_UnitProvidedCapabilities();

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
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__PROPERTY_SETS = eINSTANCE.getBuildUnit_PropertySets();

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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderImpl <em>Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilder()
		 * @generated
		 */
		EClass BUILDER = eINSTANCE.getBuilder();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER__POSTCOND_EXPR = eINSTANCE.getBuilder_PostcondExpr();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER__PRECOND_EXPR = eINSTANCE.getBuilder_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER__PROVIDED_CAPABILITIES = eINSTANCE.getBuilder_ProvidedCapabilities();

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
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER__DEFAULT_PROPERTIES = eINSTANCE.getBuilder_DefaultProperties();

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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.PathVectorImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVector()
		 * @generated
		 */
		EClass PATH_VECTOR = eINSTANCE.getPathVector();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_VECTOR__COND_EXPR = eINSTANCE.getPathVector_CondExpr();

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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.CompoundPathVectorImpl <em>Compound Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.CompoundPathVectorImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getCompoundPathVector()
		 * @generated
		 */
		EClass COMPOUND_PATH_VECTOR = eINSTANCE.getCompoundPathVector();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_PATH_VECTOR__PATH_VECTORS = eINSTANCE.getCompoundPathVector_PathVectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.PathVectorElementImpl <em>Path Vector Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.PathVectorElementImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getPathVectorElement()
		 * @generated
		 */
		EClass PATH_VECTOR_ELEMENT = eINSTANCE.getPathVectorElement();

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
		 * The meta object literal for the '<em><b>Builders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__BUILDERS = eINSTANCE.getSynchronization_Builders();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl <em>Synchronized Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.SynchronizedBuilderImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getSynchronizedBuilder()
		 * @generated
		 */
		EClass SYNCHRONIZED_BUILDER = eINSTANCE.getSynchronizedBuilder();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZED_BUILDER__NAME_SPACE = eINSTANCE.getSynchronizedBuilder_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZED_BUILDER__NAME = eINSTANCE.getSynchronizedBuilder_Name();

		/**
		 * The meta object literal for the '<em><b>Builder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZED_BUILDER__BUILDER_NAME = eINSTANCE.getSynchronizedBuilder_BuilderName();

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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.BuilderInputImpl <em>Builder Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.BuilderInputImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getBuilderInput()
		 * @generated
		 */
		EClass BUILDER_INPUT = eINSTANCE.getBuilderInput();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_INPUT__PRECOND_EXPR = eINSTANCE.getBuilderInput_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDER_INPUT__POSTCOND_EXPR = eINSTANCE.getBuilderInput_PostcondExpr();

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
		 * The meta object literal for the '<em>Version Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.equinox.internal.provisional.p2.core.VersionRange
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionRange()
		 * @generated
		 */
		EDataType VERSION_RANGE = eINSTANCE.getVersionRange();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.equinox.internal.provisional.p2.core.Version
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //B3BuildPackage
