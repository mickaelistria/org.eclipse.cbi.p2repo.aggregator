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
	int CAPABILITY = 11;

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
	 * The feature id for the '<em><b>Unit Provided Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__BUILDERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Build Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_FEATURE_COUNT = VERSIONED_CAPABILITY_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.UnitBuildResultReferenceImpl <em>Unit Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.UnitBuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitBuildResultReference()
	 * @generated
	 */
	int UNIT_BUILD_RESULT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BUILD_RESULT_REFERENCE__PARAMETERS = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BUILD_RESULT_REFERENCE__BUILDER_NAME = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BUILD_RESULT_REFERENCE__NAME = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BUILD_RESULT_REFERENCE__NAME_SPACE = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unit Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_BUILD_RESULT_REFERENCE_FEATURE_COUNT = BUILD_RESULT_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.DirectBuildResultReferenceImpl <em>Direct Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.DirectBuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getDirectBuildResultReference()
	 * @generated
	 */
	int DIRECT_BUILD_RESULT_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_BUILD_RESULT_REFERENCE__PARAMETERS = UNIT_BUILD_RESULT_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_BUILD_RESULT_REFERENCE__BUILDER_NAME = UNIT_BUILD_RESULT_REFERENCE__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_BUILD_RESULT_REFERENCE__NAME = UNIT_BUILD_RESULT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_BUILD_RESULT_REFERENCE__NAME_SPACE = UNIT_BUILD_RESULT_REFERENCE__NAME_SPACE;

	/**
	 * The number of structural features of the '<em>Direct Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_BUILD_RESULT_REFERENCE_FEATURE_COUNT = UNIT_BUILD_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.IndirectBuildResultReferenceImpl <em>Indirect Build Result Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.IndirectBuildResultReferenceImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIndirectBuildResultReference()
	 * @generated
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE__PARAMETERS = UNIT_BUILD_RESULT_REFERENCE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE__BUILDER_NAME = UNIT_BUILD_RESULT_REFERENCE__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE__NAME = UNIT_BUILD_RESULT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE__NAME_SPACE = UNIT_BUILD_RESULT_REFERENCE__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE__VERSION_RANGE = UNIT_BUILD_RESULT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indirect Build Result Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BUILD_RESULT_REFERENCE_FEATURE_COUNT = UNIT_BUILD_RESULT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.build.build.impl.RequiredCapabilityImpl
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 12;

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
	int PATH_VECTOR = 13;

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
	int COMPOUND_PATH_VECTOR = 14;

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
	int PATH_VECTOR_ELEMENT = 15;

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
	 * The meta object id for the '<em>Version Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.internal.provisional.p2.core.VersionRange
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersionRange()
	 * @generated
	 */
	int VERSION_RANGE = 16;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.equinox.internal.provisional.p2.core.Version
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 17;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getURI()
	 * @generated
	 */
	int URI = 18;


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
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.BuildUnit#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Provided Capabilities</em>'.
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
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.DirectBuildResultReference <em>Direct Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Build Result Reference</em>'.
	 * @see org.eclipse.b3.build.build.DirectBuildResultReference
	 * @generated
	 */
	EClass getDirectBuildResultReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.UnitBuildResultReference <em>Unit Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Build Result Reference</em>'.
	 * @see org.eclipse.b3.build.build.UnitBuildResultReference
	 * @generated
	 */
	EClass getUnitBuildResultReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.build.UnitBuildResultReference#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.eclipse.b3.build.build.UnitBuildResultReference#getParameters()
	 * @see #getUnitBuildResultReference()
	 * @generated
	 */
	EReference getUnitBuildResultReference_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.UnitBuildResultReference#getBuilderName <em>Builder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder Name</em>'.
	 * @see org.eclipse.b3.build.build.UnitBuildResultReference#getBuilderName()
	 * @see #getUnitBuildResultReference()
	 * @generated
	 */
	EAttribute getUnitBuildResultReference_BuilderName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.UnitBuildResultReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.build.UnitBuildResultReference#getName()
	 * @see #getUnitBuildResultReference()
	 * @generated
	 */
	EAttribute getUnitBuildResultReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.UnitBuildResultReference#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.build.UnitBuildResultReference#getNameSpace()
	 * @see #getUnitBuildResultReference()
	 * @generated
	 */
	EAttribute getUnitBuildResultReference_NameSpace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.build.IndirectBuildResultReference <em>Indirect Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indirect Build Result Reference</em>'.
	 * @see org.eclipse.b3.build.build.IndirectBuildResultReference
	 * @generated
	 */
	EClass getIndirectBuildResultReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.build.IndirectBuildResultReference#getVersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Range</em>'.
	 * @see org.eclipse.b3.build.build.IndirectBuildResultReference#getVersionRange()
	 * @see #getIndirectBuildResultReference()
	 * @generated
	 */
	EAttribute getIndirectBuildResultReference_VersionRange();

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
		 * The meta object literal for the '<em><b>Unit Provided Capabilities</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.DirectBuildResultReferenceImpl <em>Direct Build Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.DirectBuildResultReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getDirectBuildResultReference()
		 * @generated
		 */
		EClass DIRECT_BUILD_RESULT_REFERENCE = eINSTANCE.getDirectBuildResultReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.UnitBuildResultReferenceImpl <em>Unit Build Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.UnitBuildResultReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getUnitBuildResultReference()
		 * @generated
		 */
		EClass UNIT_BUILD_RESULT_REFERENCE = eINSTANCE.getUnitBuildResultReference();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_BUILD_RESULT_REFERENCE__PARAMETERS = eINSTANCE.getUnitBuildResultReference_Parameters();

		/**
		 * The meta object literal for the '<em><b>Builder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_BUILD_RESULT_REFERENCE__BUILDER_NAME = eINSTANCE.getUnitBuildResultReference_BuilderName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_BUILD_RESULT_REFERENCE__NAME = eINSTANCE.getUnitBuildResultReference_Name();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_BUILD_RESULT_REFERENCE__NAME_SPACE = eINSTANCE.getUnitBuildResultReference_NameSpace();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.build.impl.IndirectBuildResultReferenceImpl <em>Indirect Build Result Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.build.build.impl.IndirectBuildResultReferenceImpl
		 * @see org.eclipse.b3.build.build.impl.B3BuildPackageImpl#getIndirectBuildResultReference()
		 * @generated
		 */
		EClass INDIRECT_BUILD_RESULT_REFERENCE = eINSTANCE.getIndirectBuildResultReference();

		/**
		 * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIRECT_BUILD_RESULT_REFERENCE__VERSION_RANGE = eINSTANCE.getIndirectBuildResultReference_VersionRange();

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
