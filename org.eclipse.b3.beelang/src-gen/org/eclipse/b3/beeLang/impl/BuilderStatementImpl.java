/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import org.eclipse.b3.beeLang.BeeLangPackage;
import org.eclipse.b3.beeLang.Builder;
import org.eclipse.b3.beeLang.BuilderStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.beeLang.impl.BuilderStatementImpl#getBuilder <em>Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderStatementImpl extends StatementImpl implements BuilderStatement
{
  /**
   * The cached value of the '{@link #getBuilder() <em>Builder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilder()
   * @generated
   * @ordered
   */
  protected Builder builder;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuilderStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BeeLangPackage.Literals.BUILDER_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Builder getBuilder()
  {
    return builder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuilder(Builder newBuilder, NotificationChain msgs)
  {
    Builder oldBuilder = builder;
    builder = newBuilder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangPackage.BUILDER_STATEMENT__BUILDER, oldBuilder, newBuilder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuilder(Builder newBuilder)
  {
    if (newBuilder != builder)
    {
      NotificationChain msgs = null;
      if (builder != null)
        msgs = ((InternalEObject)builder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangPackage.BUILDER_STATEMENT__BUILDER, null, msgs);
      if (newBuilder != null)
        msgs = ((InternalEObject)newBuilder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangPackage.BUILDER_STATEMENT__BUILDER, null, msgs);
      msgs = basicSetBuilder(newBuilder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangPackage.BUILDER_STATEMENT__BUILDER, newBuilder, newBuilder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BeeLangPackage.BUILDER_STATEMENT__BUILDER:
        return basicSetBuilder(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BeeLangPackage.BUILDER_STATEMENT__BUILDER:
        return getBuilder();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangPackage.BUILDER_STATEMENT__BUILDER:
        setBuilder((Builder)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BeeLangPackage.BUILDER_STATEMENT__BUILDER:
        setBuilder((Builder)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BeeLangPackage.BUILDER_STATEMENT__BUILDER:
        return builder != null;
    }
    return super.eIsSet(featureID);
  }

} //BuilderStatementImpl
