/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Capability;

import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityImpl#getCondExpr <em>Cond Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends EObjectImpl implements Capability {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY__NAME_SPACE, oldNameSpace,
					nameSpace));
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
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					B3BuildPackage.CAPABILITY__COND_EXPR, oldCondExpr, newCondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondExpr(BExpression newCondExpr) {
		if(newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if(condExpr != null)
				msgs = ((InternalEObject) condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- B3BuildPackage.CAPABILITY__COND_EXPR, null, msgs);
			if(newCondExpr != null)
				msgs = ((InternalEObject) newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- B3BuildPackage.CAPABILITY__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY__COND_EXPR, newCondExpr,
					newCondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean satisfies(RequiredCapability requirement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case B3BuildPackage.CAPABILITY__COND_EXPR:
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
		switch(featureID) {
		case B3BuildPackage.CAPABILITY__NAME:
			return getName();
		case B3BuildPackage.CAPABILITY__NAME_SPACE:
			return getNameSpace();
		case B3BuildPackage.CAPABILITY__COND_EXPR:
			return getCondExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case B3BuildPackage.CAPABILITY__NAME:
			setName((String) newValue);
			return;
		case B3BuildPackage.CAPABILITY__NAME_SPACE:
			setNameSpace((String) newValue);
			return;
		case B3BuildPackage.CAPABILITY__COND_EXPR:
			setCondExpr((BExpression) newValue);
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
		switch(featureID) {
		case B3BuildPackage.CAPABILITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case B3BuildPackage.CAPABILITY__NAME_SPACE:
			setNameSpace(NAME_SPACE_EDEFAULT);
			return;
		case B3BuildPackage.CAPABILITY__COND_EXPR:
			setCondExpr((BExpression) null);
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
		switch(featureID) {
		case B3BuildPackage.CAPABILITY__NAME:
			return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
		case B3BuildPackage.CAPABILITY__NAME_SPACE:
			return NAME_SPACE_EDEFAULT == null
					? nameSpace != null
					: !NAME_SPACE_EDEFAULT.equals(nameSpace);
		case B3BuildPackage.CAPABILITY__COND_EXPR:
			return condExpr != null;
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
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", nameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
