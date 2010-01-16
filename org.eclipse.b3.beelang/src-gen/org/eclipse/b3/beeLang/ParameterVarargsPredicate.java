/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

import java.lang.reflect.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Varargs Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getTypePredicateOp <em>Type Predicate Op</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.beeLang.BeeLangPackage#getParameterVarargsPredicate()
 * @model
 * @generated
 */
public interface ParameterVarargsPredicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Predicate Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Predicate Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Predicate Op</em>' attribute.
   * @see #setTypePredicateOp(String)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getParameterVarargsPredicate_TypePredicateOp()
   * @model
   * @generated
   */
  String getTypePredicateOp();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getTypePredicateOp <em>Type Predicate Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Predicate Op</em>' attribute.
   * @see #getTypePredicateOp()
   * @generated
   */
  void setTypePredicateOp(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getParameterVarargsPredicate_Type()
   * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getParameterVarargsPredicate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.ParameterVarargsPredicate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ParameterVarargsPredicate
