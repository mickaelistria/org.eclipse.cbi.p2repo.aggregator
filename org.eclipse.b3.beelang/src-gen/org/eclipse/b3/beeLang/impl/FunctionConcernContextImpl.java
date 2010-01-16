/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.impl;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl;

import org.eclipse.b3.beeLang.BeeLangPackage;
import org.eclipse.b3.beeLang.FunctionConcernContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.impl.FunctionConcernContextImpl#isVarArgs <em>Var Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionConcernContextImpl extends BConcernContextImpl implements FunctionConcernContext
{
  /**
   * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePredicate()
   * @generated
   * @ordered
   */
  protected BNamePredicate namePredicate;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EObject> parameters;

  /**
   * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected static final boolean VAR_ARGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarArgs()
   * @generated
   * @ordered
   */
  protected boolean varArgs = VAR_ARGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionConcernContextImpl()
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
    return BeeLangPackage.Literals.FUNCTION_CONCERN_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BNamePredicate getNamePredicate()
  {
    return namePredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamePredicate(BNamePredicate newNamePredicate, NotificationChain msgs)
  {
    BNamePredicate oldNamePredicate = namePredicate;
    namePredicate = newNamePredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, oldNamePredicate, newNamePredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamePredicate(BNamePredicate newNamePredicate)
  {
    if (newNamePredicate != namePredicate)
    {
      NotificationChain msgs = null;
      if (namePredicate != null)
        msgs = ((InternalEObject)namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
      if (newNamePredicate != null)
        msgs = ((InternalEObject)newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
      msgs = basicSetNamePredicate(newNamePredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, newNamePredicate, newNamePredicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EObject>(EObject.class, this, BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVarArgs()
  {
    return varArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarArgs(boolean newVarArgs)
  {
    boolean oldVarArgs = varArgs;
    varArgs = newVarArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangPackage.FUNCTION_CONCERN_CONTEXT__VAR_ARGS, oldVarArgs, varArgs));
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
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
        return basicSetNamePredicate(null, msgs);
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
        return getNamePredicate();
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS:
        return getParameters();
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__VAR_ARGS:
        return isVarArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
        setNamePredicate((BNamePredicate)newValue);
        return;
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EObject>)newValue);
        return;
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__VAR_ARGS:
        setVarArgs((Boolean)newValue);
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
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
        setNamePredicate((BNamePredicate)null);
        return;
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS:
        getParameters().clear();
        return;
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__VAR_ARGS:
        setVarArgs(VAR_ARGS_EDEFAULT);
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
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
        return namePredicate != null;
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case BeeLangPackage.FUNCTION_CONCERN_CONTEXT__VAR_ARGS:
        return varArgs != VAR_ARGS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (varArgs: ");
    result.append(varArgs);
    result.append(')');
    return result.toString();
  }

} //FunctionConcernContextImpl
