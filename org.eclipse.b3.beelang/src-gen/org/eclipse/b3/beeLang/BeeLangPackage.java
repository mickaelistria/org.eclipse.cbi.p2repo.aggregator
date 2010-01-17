/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

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

  }

} //BeeLangPackage
