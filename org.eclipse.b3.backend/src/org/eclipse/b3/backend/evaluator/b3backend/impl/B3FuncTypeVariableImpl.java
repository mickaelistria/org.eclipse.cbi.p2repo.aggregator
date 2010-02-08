/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B3 Func Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl#getGenericDeclaration <em>Generic Declaration</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class B3FuncTypeVariableImpl extends EObjectImpl implements B3FuncTypeVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected static final Type[] BOUNDS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Type[] bounds = BOUNDS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGenericDeclaration() <em>Generic Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericDeclaration()
	 * @generated
	 * @ordered
	 */
	protected IFunction genericDeclaration;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3FuncTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.B3_FUNC_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Type[] newBounds) {
		Type[] oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNC_TYPE_VARIABLE__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction getGenericDeclaration() {
		return genericDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericDeclaration(IFunction newGenericDeclaration, NotificationChain msgs) {
		IFunction oldGenericDeclaration = genericDeclaration;
		genericDeclaration = newGenericDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION, oldGenericDeclaration, newGenericDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericDeclaration(IFunction newGenericDeclaration) {
		if (newGenericDeclaration != genericDeclaration) {
			NotificationChain msgs = null;
			if (genericDeclaration != null)
				msgs = ((InternalEObject)genericDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION, null, msgs);
			if (newGenericDeclaration != null)
				msgs = ((InternalEObject)newGenericDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION, null, msgs);
			msgs = basicSetGenericDeclaration(newGenericDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION, newGenericDeclaration, newGenericDeclaration));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.B3_FUNC_TYPE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION:
				return basicSetGenericDeclaration(null, msgs);
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
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__BOUNDS:
				return getBounds();
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION:
				return getGenericDeclaration();
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__NAME:
				return getName();
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
		switch (featureID) {
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__BOUNDS:
				setBounds((Type[])newValue);
				return;
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION:
				setGenericDeclaration((IFunction)newValue);
				return;
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__NAME:
				setName((String)newValue);
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
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__BOUNDS:
				setBounds(BOUNDS_EDEFAULT);
				return;
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION:
				setGenericDeclaration((IFunction)null);
				return;
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
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
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__BOUNDS:
				return BOUNDS_EDEFAULT == null ? bounds != null : !BOUNDS_EDEFAULT.equals(bounds);
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION:
				return genericDeclaration != null;
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (bounds: ");
		result.append(bounds);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //B3FuncTypeVariableImpl
