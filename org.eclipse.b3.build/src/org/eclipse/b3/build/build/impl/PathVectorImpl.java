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
import org.eclipse.b3.build.build.PathVector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathVectorImpl#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathVectorImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathVectorImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathVectorImpl extends EObjectImpl implements PathVector {
	/**
	 * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression condExpr;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.PATH_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getCondExpr() {
		return condExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondExpr(BExpression newCondExpr, NotificationChain msgs) {
		BExpression oldCondExpr = condExpr;
		condExpr = newCondExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_VECTOR__COND_EXPR, oldCondExpr, newCondExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondExpr(BExpression newCondExpr) {
		if (newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if (condExpr != null)
				msgs = ((InternalEObject)condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_VECTOR__COND_EXPR, null, msgs);
			if (newCondExpr != null)
				msgs = ((InternalEObject)newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_VECTOR__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_VECTOR__COND_EXPR, newCondExpr, newCondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_VECTOR__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, B3BuildPackage.PATH_VECTOR__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.PATH_VECTOR__COND_EXPR:
				return basicSetCondExpr(null, msgs);
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
			case B3BuildPackage.PATH_VECTOR__COND_EXPR:
				return getCondExpr();
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				return getBasePath();
			case B3BuildPackage.PATH_VECTOR__PATHS:
				return getPaths();
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
			case B3BuildPackage.PATH_VECTOR__COND_EXPR:
				setCondExpr((BExpression)newValue);
				return;
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case B3BuildPackage.PATH_VECTOR__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends String>)newValue);
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
			case B3BuildPackage.PATH_VECTOR__COND_EXPR:
				setCondExpr((BExpression)null);
				return;
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case B3BuildPackage.PATH_VECTOR__PATHS:
				getPaths().clear();
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
			case B3BuildPackage.PATH_VECTOR__COND_EXPR:
				return condExpr != null;
			case B3BuildPackage.PATH_VECTOR__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case B3BuildPackage.PATH_VECTOR__PATHS:
				return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (basePath: ");
		result.append(basePath);
		result.append(", paths: ");
		result.append(paths);
		result.append(')');
		return result.toString();
	}

} //PathVectorImpl
