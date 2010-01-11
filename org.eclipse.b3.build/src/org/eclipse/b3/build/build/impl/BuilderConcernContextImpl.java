/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.InputPredicate;
import org.eclipse.b3.build.build.OutputPredicate;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.build.Prerequisite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getInputAdditions <em>Input Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getInputRemovals <em>Input Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputAdditions <em>Output Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputRemovals <em>Output Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderConcernContextImpl extends BuildConcernContextImpl implements BuilderConcernContext {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression query;

	/**
	 * The cached value of the '{@link #getInputAdditions() <em>Input Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> inputAdditions;

	/**
	 * The cached value of the '{@link #getInputRemovals() <em>Input Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPredicate> inputRemovals;

	/**
	 * The cached value of the '{@link #getOutputAdditions() <em>Output Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVector> outputAdditions;

	/**
	 * The cached value of the '{@link #getOutputRemovals() <em>Output Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPredicate> outputRemovals;

	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(BExpression newQuery, NotificationChain msgs) {
		BExpression oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(BExpression newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getInputAdditions() {
		if (inputAdditions == null) {
			inputAdditions = new EObjectContainmentEList<Prerequisite>(Prerequisite.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS);
		}
		return inputAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPredicate> getInputRemovals() {
		if (inputRemovals == null) {
			inputRemovals = new EObjectContainmentEList<InputPredicate>(InputPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS);
		}
		return inputRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathVector> getOutputAdditions() {
		if (outputAdditions == null) {
			outputAdditions = new EObjectContainmentEList<PathVector>(PathVector.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS);
		}
		return outputAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPredicate> getOutputRemovals() {
		if (outputRemovals == null) {
			outputRemovals = new EObjectContainmentEList<OutputPredicate>(OutputPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS);
		}
		return outputRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncExpr(BExpression newFuncExpr, NotificationChain msgs) {
		BExpression oldFuncExpr = funcExpr;
		funcExpr = newFuncExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, oldFuncExpr, newFuncExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncExpr(BExpression newFuncExpr) {
		if (newFuncExpr != funcExpr) {
			NotificationChain msgs = null;
			if (funcExpr != null)
				msgs = ((InternalEObject)funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			if (newFuncExpr != null)
				msgs = ((InternalEObject)newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			msgs = basicSetFuncExpr(newFuncExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, newFuncExpr, newFuncExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return basicSetQuery(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return ((InternalEList<?>)getInputAdditions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return ((InternalEList<?>)getInputRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return ((InternalEList<?>)getOutputAdditions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return ((InternalEList<?>)getOutputRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return basicSetFuncExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return getQuery();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return getInputAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return getInputRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return getOutputAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return getOutputRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return getFuncExpr();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				getInputAdditions().clear();
				getInputAdditions().addAll((Collection<? extends Prerequisite>)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				getInputRemovals().clear();
				getInputRemovals().addAll((Collection<? extends InputPredicate>)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				getOutputAdditions().clear();
				getOutputAdditions().addAll((Collection<? extends PathVector>)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				getOutputRemovals().clear();
				getOutputRemovals().addAll((Collection<? extends OutputPredicate>)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression)null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				getInputAdditions().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				getInputRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				getOutputAdditions().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				getOutputRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return query != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return inputAdditions != null && !inputAdditions.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return inputRemovals != null && !inputRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return outputAdditions != null && !outputAdditions.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return outputRemovals != null && !outputRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return funcExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //BuilderConcernContextImpl
