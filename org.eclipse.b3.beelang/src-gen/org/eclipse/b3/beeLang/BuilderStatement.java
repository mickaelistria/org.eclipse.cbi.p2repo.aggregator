/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.beeLang.BuilderStatement#getBuilder <em>Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.beeLang.BeeLangPackage#getBuilderStatement()
 * @model
 * @generated
 */
public interface BuilderStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Builder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builder</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builder</em>' containment reference.
   * @see #setBuilder(Builder)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getBuilderStatement_Builder()
   * @model containment="true"
   * @generated
   */
  Builder getBuilder();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.BuilderStatement#getBuilder <em>Builder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builder</em>' containment reference.
   * @see #getBuilder()
   * @generated
   */
  void setBuilder(Builder value);

} // BuilderStatement
