/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isSequential <em>Sequential</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getTypeVariables <em>Type Variables</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getParameterNames <em>Parameter Names</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isVarArgs <em>Var Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BFunctionImpl extends BExpressionImpl implements BFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "<copyright>Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r</copyright>";

	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQUENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequential()
	 * @generated
	 * @ordered
	 */
	protected boolean sequential = SEQUENTIAL_EDEFAULT;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected BGuard guard;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final Type RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected static final Type[] PARAMETER_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected Type[] parameterTypes = PARAMETER_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionTypes() <em>Exception Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected static final Type[] EXCEPTION_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionTypes() <em>Exception Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected Type[] exceptionTypes = EXCEPTION_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeVariables() <em>Type Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVariables()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final TypeVariable[] TYPE_VARIABLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVariables() <em>Type Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVariables()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected TypeVariable[] typeVariables = TYPE_VARIABLES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterNames() <em>Parameter Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterNames;

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
	protected BFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSequential() {
		return sequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequential(boolean newSequential) {
		boolean oldSequential = sequential;
		sequential = newSequential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__SEQUENTIAL, oldSequential, sequential));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuard getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (BGuard)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BFUNCTION__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuard basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(BGuard newGuard) {
		BGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getParameterTypes() {
		return parameterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTypes(Type[] newParameterTypes) {
		Type[] oldParameterTypes = parameterTypes;
		parameterTypes = newParameterTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__PARAMETER_TYPES, oldParameterTypes, parameterTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getExceptionTypes() {
		return exceptionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionTypes(Type[] newExceptionTypes) {
		Type[] oldExceptionTypes = exceptionTypes;
		exceptionTypes = newExceptionTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__EXCEPTION_TYPES, oldExceptionTypes, exceptionTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public TypeVariable[] getTypeVariables() {
		return typeVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void setTypeVariables(TypeVariable[] newTypeVariables) {
		TypeVariable[] oldTypeVariables = typeVariables;
		typeVariables = newTypeVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__TYPE_VARIABLES, oldTypeVariables, typeVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterNames() {
		if (parameterNames == null) {
			parameterNames = new EDataTypeUniqueEList<String>(String.class, this, B3backendPackage.BFUNCTION__PARAMETER_NAMES);
		}
		return parameterNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarArgs() {
		return varArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarArgs(boolean newVarArgs) {
		boolean oldVarArgs = varArgs;
		varArgs = newVarArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__VAR_ARGS, oldVarArgs, varArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__PRIVATE:
				return isPrivate();
			case B3backendPackage.BFUNCTION__FINAL:
				return isFinal();
			case B3backendPackage.BFUNCTION__SEQUENTIAL:
				return isSequential();
			case B3backendPackage.BFUNCTION__NAME:
				return getName();
			case B3backendPackage.BFUNCTION__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				return getReturnType();
			case B3backendPackage.BFUNCTION__PARAMETER_TYPES:
				return getParameterTypes();
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				return getExceptionTypes();
			case B3backendPackage.BFUNCTION__TYPE_VARIABLES:
				return getTypeVariables();
			case B3backendPackage.BFUNCTION__PARAMETER_NAMES:
				return getParameterNames();
			case B3backendPackage.BFUNCTION__VAR_ARGS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__FINAL:
				setFinal((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__SEQUENTIAL:
				setSequential((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__NAME:
				setName((String)newValue);
				return;
			case B3backendPackage.BFUNCTION__GUARD:
				setGuard((BGuard)newValue);
				return;
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case B3backendPackage.BFUNCTION__PARAMETER_TYPES:
				setParameterTypes((Type[])newValue);
				return;
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				setExceptionTypes((Type[])newValue);
				return;
			case B3backendPackage.BFUNCTION__TYPE_VARIABLES:
				setTypeVariables((TypeVariable[])newValue);
				return;
			case B3backendPackage.BFUNCTION__PARAMETER_NAMES:
				getParameterNames().clear();
				getParameterNames().addAll((Collection<? extends String>)newValue);
				return;
			case B3backendPackage.BFUNCTION__VAR_ARGS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__SEQUENTIAL:
				setSequential(SEQUENTIAL_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__GUARD:
				setGuard((BGuard)null);
				return;
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__PARAMETER_TYPES:
				setParameterTypes(PARAMETER_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				setExceptionTypes(EXCEPTION_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__TYPE_VARIABLES:
				setTypeVariables(TYPE_VARIABLES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__PARAMETER_NAMES:
				getParameterNames().clear();
				return;
			case B3backendPackage.BFUNCTION__VAR_ARGS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__PRIVATE:
				return private_ != PRIVATE_EDEFAULT;
			case B3backendPackage.BFUNCTION__FINAL:
				return final_ != FINAL_EDEFAULT;
			case B3backendPackage.BFUNCTION__SEQUENTIAL:
				return sequential != SEQUENTIAL_EDEFAULT;
			case B3backendPackage.BFUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BFUNCTION__GUARD:
				return guard != null;
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case B3backendPackage.BFUNCTION__PARAMETER_TYPES:
				return PARAMETER_TYPES_EDEFAULT == null ? parameterTypes != null : !PARAMETER_TYPES_EDEFAULT.equals(parameterTypes);
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				return EXCEPTION_TYPES_EDEFAULT == null ? exceptionTypes != null : !EXCEPTION_TYPES_EDEFAULT.equals(exceptionTypes);
			case B3backendPackage.BFUNCTION__TYPE_VARIABLES:
				return TYPE_VARIABLES_EDEFAULT == null ? typeVariables != null : !TYPE_VARIABLES_EDEFAULT.equals(typeVariables);
			case B3backendPackage.BFUNCTION__PARAMETER_NAMES:
				return parameterNames != null && !parameterNames.isEmpty();
			case B3backendPackage.BFUNCTION__VAR_ARGS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (private: ");
		result.append(private_);
		result.append(", final: ");
		result.append(final_);
		result.append(", sequential: ");
		result.append(sequential);
		result.append(", name: ");
		result.append(name);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", parameterTypes: ");
		result.append(parameterTypes);
		result.append(", exceptionTypes: ");
		result.append(exceptionTypes);
		result.append(", typeVariables: ");
		result.append(typeVariables);
		result.append(", parameterNames: ");
		result.append(parameterNames);
		result.append(", varArgs: ");
		result.append(varArgs);
		result.append(')');
		return result.toString();
	}
} //BFunctionImpl
