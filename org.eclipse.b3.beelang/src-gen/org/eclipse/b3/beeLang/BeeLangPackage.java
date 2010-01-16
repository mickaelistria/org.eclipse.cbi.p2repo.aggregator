/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

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
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl <em>Function Concern Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFunctionConcernContext()
   * @generated
   */
  int FUNCTION_CONCERN_CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT__FUNCTIONS = B3backendPackage.BCONCERN_CONTEXT__FUNCTIONS;

  /**
   * The feature id for the '<em><b>Container Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT__CONTAINER_TYPE = B3backendPackage.BCONCERN_CONTEXT__CONTAINER_TYPE;

  /**
   * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT__PARAMETERS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT__VAR_ARGS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Concern Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CONCERN_CONTEXT_FEATURE_COUNT = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ParameterPredicateImpl <em>Parameter Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ParameterPredicateImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterPredicate()
   * @generated
   */
  int PARAMETER_PREDICATE = 2;

  /**
   * The feature id for the '<em><b>Type Predicate Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PREDICATE__TYPE_PREDICATE_OP = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PREDICATE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PREDICATE__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_PREDICATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.b3.beeLang.impl.ParameterVarargsPredicateImpl <em>Parameter Varargs Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.b3.beeLang.impl.ParameterVarargsPredicateImpl
   * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterVarargsPredicate()
   * @generated
   */
  int PARAMETER_VARARGS_PREDICATE = 3;

  /**
   * The feature id for the '<em><b>Type Predicate Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARARGS_PREDICATE__TYPE_PREDICATE_OP = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARARGS_PREDICATE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARARGS_PREDICATE__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter Varargs Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARARGS_PREDICATE_FEATURE_COUNT = 3;


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
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.FunctionConcernContext <em>Function Concern Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Concern Context</em>'.
   * @see org.eclipse.b3.beeLang.FunctionConcernContext
   * @generated
   */
  EClass getFunctionConcernContext();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.FunctionConcernContext#getNamePredicate <em>Name Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Predicate</em>'.
   * @see org.eclipse.b3.beeLang.FunctionConcernContext#getNamePredicate()
   * @see #getFunctionConcernContext()
   * @generated
   */
  EReference getFunctionConcernContext_NamePredicate();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.b3.beeLang.FunctionConcernContext#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.b3.beeLang.FunctionConcernContext#getParameters()
   * @see #getFunctionConcernContext()
   * @generated
   */
  EReference getFunctionConcernContext_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.FunctionConcernContext#isVarArgs <em>Var Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Args</em>'.
   * @see org.eclipse.b3.beeLang.FunctionConcernContext#isVarArgs()
   * @see #getFunctionConcernContext()
   * @generated
   */
  EAttribute getFunctionConcernContext_VarArgs();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ParameterPredicate <em>Parameter Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Predicate</em>'.
   * @see org.eclipse.b3.beeLang.ParameterPredicate
   * @generated
   */
  EClass getParameterPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ParameterPredicate#getTypePredicateOp <em>Type Predicate Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Predicate Op</em>'.
   * @see org.eclipse.b3.beeLang.ParameterPredicate#getTypePredicateOp()
   * @see #getParameterPredicate()
   * @generated
   */
  EAttribute getParameterPredicate_TypePredicateOp();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ParameterPredicate#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.ParameterPredicate#getType()
   * @see #getParameterPredicate()
   * @generated
   */
  EReference getParameterPredicate_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ParameterPredicate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.ParameterPredicate#getName()
   * @see #getParameterPredicate()
   * @generated
   */
  EAttribute getParameterPredicate_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate <em>Parameter Varargs Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Varargs Predicate</em>'.
   * @see org.eclipse.b3.beeLang.ParameterVarargsPredicate
   * @generated
   */
  EClass getParameterVarargsPredicate();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getTypePredicateOp <em>Type Predicate Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Predicate Op</em>'.
   * @see org.eclipse.b3.beeLang.ParameterVarargsPredicate#getTypePredicateOp()
   * @see #getParameterVarargsPredicate()
   * @generated
   */
  EAttribute getParameterVarargsPredicate_TypePredicateOp();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.b3.beeLang.ParameterVarargsPredicate#getType()
   * @see #getParameterVarargsPredicate()
   * @generated
   */
  EReference getParameterVarargsPredicate_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.b3.beeLang.ParameterVarargsPredicate#getName()
   * @see #getParameterVarargsPredicate()
   * @generated
   */
  EAttribute getParameterVarargsPredicate_Name();

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
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl <em>Function Concern Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getFunctionConcernContext()
     * @generated
     */
    EClass FUNCTION_CONCERN_CONTEXT = eINSTANCE.getFunctionConcernContext();

    /**
     * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE = eINSTANCE.getFunctionConcernContext_NamePredicate();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CONCERN_CONTEXT__PARAMETERS = eINSTANCE.getFunctionConcernContext_Parameters();

    /**
     * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CONCERN_CONTEXT__VAR_ARGS = eINSTANCE.getFunctionConcernContext_VarArgs();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ParameterPredicateImpl <em>Parameter Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ParameterPredicateImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterPredicate()
     * @generated
     */
    EClass PARAMETER_PREDICATE = eINSTANCE.getParameterPredicate();

    /**
     * The meta object literal for the '<em><b>Type Predicate Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_PREDICATE__TYPE_PREDICATE_OP = eINSTANCE.getParameterPredicate_TypePredicateOp();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_PREDICATE__TYPE = eINSTANCE.getParameterPredicate_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_PREDICATE__NAME = eINSTANCE.getParameterPredicate_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.b3.beeLang.impl.ParameterVarargsPredicateImpl <em>Parameter Varargs Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.b3.beeLang.impl.ParameterVarargsPredicateImpl
     * @see org.eclipse.b3.beeLang.impl.BeeLangPackageImpl#getParameterVarargsPredicate()
     * @generated
     */
    EClass PARAMETER_VARARGS_PREDICATE = eINSTANCE.getParameterVarargsPredicate();

    /**
     * The meta object literal for the '<em><b>Type Predicate Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_VARARGS_PREDICATE__TYPE_PREDICATE_OP = eINSTANCE.getParameterVarargsPredicate_TypePredicateOp();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VARARGS_PREDICATE__TYPE = eINSTANCE.getParameterVarargsPredicate_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_VARARGS_PREDICATE__NAME = eINSTANCE.getParameterVarargsPredicate_Name();

  }

} //BeeLangPackage
