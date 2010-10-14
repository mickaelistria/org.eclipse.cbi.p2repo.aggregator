/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.Visibility;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getTypeCalculator <em>Type Calculator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#isClassFunction <em>Class Function</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl#getVarargArrayType <em>Vararg Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFunctionImpl extends BExpressionImpl implements BFunction {

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

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
	 * The default value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionMode EXECUTION_MODE_EDEFAULT = ExecutionMode.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getExecutionMode() <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionMode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionMode executionMode = EXECUTION_MODE_EDEFAULT;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected BGuard guard;

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
	 * The default value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypeParameters()
	 * @generated NOT
	 * @ordered
	 */
	protected static final TypeVariable<?>[] TYPE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypeParameters()
	 * @generated NOT
	 * @ordered
	 */
	protected TypeVariable<?>[] typeParameters = TYPE_PARAMETERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameterDeclaration> parameters;

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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getTypeCalculator() <em>Type Calculator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCalculator()
	 * @generated
	 * @ordered
	 */
	protected BTypeCalculator typeCalculator;

	/**
	 * The default value of the '{@link #isClassFunction() <em>Class Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassFunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASS_FUNCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClassFunction() <em>Class Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassFunction()
	 * @generated
	 * @ordered
	 */
	protected boolean classFunction = CLASS_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarargArrayType() <em>Vararg Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargArrayType()
	 * @generated
	 * @ordered
	 */
	protected static final Type VARARG_ARRAY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarargArrayType() <em>Vararg Array Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargArrayType()
	 * @generated
	 * @ordered
	 */
	protected Type varargArrayType = VARARG_ARRAY_TYPE_EDEFAULT;

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
	public NotificationChain basicSetContainer(BFunctionContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, B3backendPackage.BFUNCTION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(BGuard newGuard, NotificationChain msgs) {
		BGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCalculator(BTypeCalculator newTypeCalculator, NotificationChain msgs) {
		BTypeCalculator oldTypeCalculator = typeCalculator;
		typeCalculator = newTypeCalculator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__TYPE_CALCULATOR, oldTypeCalculator, newTypeCalculator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GenericDeclaration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IFunction.class) {
			switch (derivedFeatureID) {
				case B3backendPackage.BFUNCTION__VISIBILITY: return B3backendPackage.IFUNCTION__VISIBILITY;
				case B3backendPackage.BFUNCTION__FINAL: return B3backendPackage.IFUNCTION__FINAL;
				case B3backendPackage.BFUNCTION__EXECUTION_MODE: return B3backendPackage.IFUNCTION__EXECUTION_MODE;
				case B3backendPackage.BFUNCTION__NAME: return B3backendPackage.IFUNCTION__NAME;
				case B3backendPackage.BFUNCTION__GUARD: return B3backendPackage.IFUNCTION__GUARD;
				case B3backendPackage.BFUNCTION__EXCEPTION_TYPES: return B3backendPackage.IFUNCTION__EXCEPTION_TYPES;
				case B3backendPackage.BFUNCTION__TYPE_PARAMETERS: return B3backendPackage.IFUNCTION__TYPE_PARAMETERS;
				case B3backendPackage.BFUNCTION__PARAMETERS: return B3backendPackage.IFUNCTION__PARAMETERS;
				case B3backendPackage.BFUNCTION__VAR_ARGS: return B3backendPackage.IFUNCTION__VAR_ARGS;
				case B3backendPackage.BFUNCTION__DOCUMENTATION: return B3backendPackage.IFUNCTION__DOCUMENTATION;
				case B3backendPackage.BFUNCTION__RETURN_TYPE: return B3backendPackage.IFUNCTION__RETURN_TYPE;
				case B3backendPackage.BFUNCTION__TYPE_CALCULATOR: return B3backendPackage.IFUNCTION__TYPE_CALCULATOR;
				case B3backendPackage.BFUNCTION__CONTAINER: return B3backendPackage.IFUNCTION__CONTAINER;
				case B3backendPackage.BFUNCTION__CLASS_FUNCTION: return B3backendPackage.IFUNCTION__CLASS_FUNCTION;
				case B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE: return B3backendPackage.IFUNCTION__VARARG_ARRAY_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case B3backendPackage.BFUNCTION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS, BFunctionContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenericDeclaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IFunction.class) {
			switch (baseFeatureID) {
				case B3backendPackage.IFUNCTION__VISIBILITY: return B3backendPackage.BFUNCTION__VISIBILITY;
				case B3backendPackage.IFUNCTION__FINAL: return B3backendPackage.BFUNCTION__FINAL;
				case B3backendPackage.IFUNCTION__EXECUTION_MODE: return B3backendPackage.BFUNCTION__EXECUTION_MODE;
				case B3backendPackage.IFUNCTION__NAME: return B3backendPackage.BFUNCTION__NAME;
				case B3backendPackage.IFUNCTION__GUARD: return B3backendPackage.BFUNCTION__GUARD;
				case B3backendPackage.IFUNCTION__EXCEPTION_TYPES: return B3backendPackage.BFUNCTION__EXCEPTION_TYPES;
				case B3backendPackage.IFUNCTION__TYPE_PARAMETERS: return B3backendPackage.BFUNCTION__TYPE_PARAMETERS;
				case B3backendPackage.IFUNCTION__PARAMETERS: return B3backendPackage.BFUNCTION__PARAMETERS;
				case B3backendPackage.IFUNCTION__VAR_ARGS: return B3backendPackage.BFUNCTION__VAR_ARGS;
				case B3backendPackage.IFUNCTION__DOCUMENTATION: return B3backendPackage.BFUNCTION__DOCUMENTATION;
				case B3backendPackage.IFUNCTION__RETURN_TYPE: return B3backendPackage.BFUNCTION__RETURN_TYPE;
				case B3backendPackage.IFUNCTION__TYPE_CALCULATOR: return B3backendPackage.BFUNCTION__TYPE_CALCULATOR;
				case B3backendPackage.IFUNCTION__CONTAINER: return B3backendPackage.BFUNCTION__CONTAINER;
				case B3backendPackage.IFUNCTION__CLASS_FUNCTION: return B3backendPackage.BFUNCTION__CLASS_FUNCTION;
				case B3backendPackage.IFUNCTION__VARARG_ARRAY_TYPE: return B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__VISIBILITY:
				return getVisibility();
			case B3backendPackage.BFUNCTION__FINAL:
				return isFinal();
			case B3backendPackage.BFUNCTION__EXECUTION_MODE:
				return getExecutionMode();
			case B3backendPackage.BFUNCTION__NAME:
				return getName();
			case B3backendPackage.BFUNCTION__GUARD:
				return getGuard();
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				return getExceptionTypes();
			case B3backendPackage.BFUNCTION__TYPE_PARAMETERS:
				return getTypeParameters();
			case B3backendPackage.BFUNCTION__PARAMETERS:
				return getParameters();
			case B3backendPackage.BFUNCTION__VAR_ARGS:
				return isVarArgs();
			case B3backendPackage.BFUNCTION__DOCUMENTATION:
				return getDocumentation();
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				return getReturnType();
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				return getTypeCalculator();
			case B3backendPackage.BFUNCTION__CONTAINER:
				return getContainer();
			case B3backendPackage.BFUNCTION__CLASS_FUNCTION:
				return isClassFunction();
			case B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE:
				return getVarargArrayType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((BFunctionContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__GUARD:
				return basicSetGuard(null, msgs);
			case B3backendPackage.BFUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				return basicSetTypeCalculator(null, msgs);
			case B3backendPackage.BFUNCTION__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case B3backendPackage.BFUNCTION__FINAL:
				return final_ != FINAL_EDEFAULT;
			case B3backendPackage.BFUNCTION__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
			case B3backendPackage.BFUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BFUNCTION__GUARD:
				return guard != null;
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				return EXCEPTION_TYPES_EDEFAULT == null ? exceptionTypes != null : !EXCEPTION_TYPES_EDEFAULT.equals(exceptionTypes);
			case B3backendPackage.BFUNCTION__TYPE_PARAMETERS:
				return TYPE_PARAMETERS_EDEFAULT == null ? typeParameters != null : !TYPE_PARAMETERS_EDEFAULT.equals(typeParameters);
			case B3backendPackage.BFUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case B3backendPackage.BFUNCTION__VAR_ARGS:
				return varArgs != VAR_ARGS_EDEFAULT;
			case B3backendPackage.BFUNCTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				return returnType != null;
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				return typeCalculator != null;
			case B3backendPackage.BFUNCTION__CONTAINER:
				return getContainer() != null;
			case B3backendPackage.BFUNCTION__CLASS_FUNCTION:
				return classFunction != CLASS_FUNCTION_EDEFAULT;
			case B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE:
				return VARARG_ARRAY_TYPE_EDEFAULT == null ? varargArrayType != null : !VARARG_ARRAY_TYPE_EDEFAULT.equals(varargArrayType);
		}
		return super.eIsSet(featureID);
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
			case B3backendPackage.BFUNCTION__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case B3backendPackage.BFUNCTION__FINAL:
				setFinal((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__EXECUTION_MODE:
				setExecutionMode((ExecutionMode)newValue);
				return;
			case B3backendPackage.BFUNCTION__NAME:
				setName((String)newValue);
				return;
			case B3backendPackage.BFUNCTION__GUARD:
				setGuard((BGuard)newValue);
				return;
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				setExceptionTypes((Type[])newValue);
				return;
			case B3backendPackage.BFUNCTION__TYPE_PARAMETERS:
				setTypeParameters((TypeVariable[])newValue);
				return;
			case B3backendPackage.BFUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends BParameterDeclaration>)newValue);
				return;
			case B3backendPackage.BFUNCTION__VAR_ARGS:
				setVarArgs((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				setTypeCalculator((BTypeCalculator)newValue);
				return;
			case B3backendPackage.BFUNCTION__CONTAINER:
				setContainer((BFunctionContainer)newValue);
				return;
			case B3backendPackage.BFUNCTION__CLASS_FUNCTION:
				setClassFunction((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE:
				setVarargArrayType((Type)newValue);
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
			case B3backendPackage.BFUNCTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__GUARD:
				setGuard((BGuard)null);
				return;
			case B3backendPackage.BFUNCTION__EXCEPTION_TYPES:
				setExceptionTypes(EXCEPTION_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__TYPE_PARAMETERS:
				setTypeParameters(TYPE_PARAMETERS_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case B3backendPackage.BFUNCTION__VAR_ARGS:
				setVarArgs(VAR_ARGS_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case B3backendPackage.BFUNCTION__TYPE_CALCULATOR:
				setTypeCalculator((BTypeCalculator)null);
				return;
			case B3backendPackage.BFUNCTION__CONTAINER:
				setContainer((BFunctionContainer)null);
				return;
			case B3backendPackage.BFUNCTION__CLASS_FUNCTION:
				setClassFunction(CLASS_FUNCTION_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE:
				setVarargArrayType(VARARG_ARRAY_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionContainer getContainer() {
		if (eContainerFeatureID() != B3backendPackage.BFUNCTION__CONTAINER) return null;
		return (BFunctionContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
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
	public ExecutionMode getExecutionMode() {
		return executionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuard getGuard() {
		return guard;
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
	public EList<BParameterDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<BParameterDeclaration>(BParameterDeclaration.class, this, B3backendPackage.BFUNCTION__PARAMETERS);
		}
		return parameters;
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
	public BTypeCalculator getTypeCalculator() {
		return typeCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public TypeVariable<?>[] getTypeParameters() {
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getVarargArrayType() {
		return varargArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClassFunction() {
		return classFunction;
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
	public boolean isVarArgs() {
		return varArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassFunction(boolean newClassFunction) {
		boolean oldClassFunction = classFunction;
		classFunction = newClassFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__CLASS_FUNCTION, oldClassFunction, classFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(BFunctionContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != B3backendPackage.BFUNCTION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS, BFunctionContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__DOCUMENTATION, oldDocumentation, documentation));
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
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		ExecutionMode oldExecutionMode = executionMode;
		executionMode = newExecutionMode == null ? EXECUTION_MODE_EDEFAULT : newExecutionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__EXECUTION_MODE, oldExecutionMode, executionMode));
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
	public void setGuard(BGuard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__GUARD, newGuard, newGuard));
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
	 * @generated NOT
	 */
	public void setReturnType(Type newReturnType) {
		setReturnTypeGen(TypeUtils.coerceToEObjectType(newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method may be called with non EObject implementations of Type.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnTypeGen(Type newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCalculator(BTypeCalculator newTypeCalculator) {
		if (newTypeCalculator != typeCalculator) {
			NotificationChain msgs = null;
			if (typeCalculator != null)
				msgs = ((InternalEObject)typeCalculator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__TYPE_CALCULATOR, null, msgs);
			if (newTypeCalculator != null)
				msgs = ((InternalEObject)newTypeCalculator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION__TYPE_CALCULATOR, null, msgs);
			msgs = basicSetTypeCalculator(newTypeCalculator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__TYPE_CALCULATOR, newTypeCalculator, newTypeCalculator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public void setTypeParameters(TypeVariable[] newTypeParameters) {
		TypeVariable[] oldTypeParameters = typeParameters;
		typeParameters = newTypeParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__TYPE_PARAMETERS, oldTypeParameters, typeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargArrayType(Type newVarargArrayType) {
		Type oldVarargArrayType = varargArrayType;
		varargArrayType = newVarargArrayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__VARARG_ARRAY_TYPE, oldVarargArrayType, varargArrayType));
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
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION__VISIBILITY, oldVisibility, visibility));
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", final: ");
		result.append(final_);
		result.append(", executionMode: ");
		result.append(executionMode);
		result.append(", name: ");
		result.append(name);
		result.append(", exceptionTypes: ");
		result.append(exceptionTypes);
		result.append(", typeParameters: ");
		result.append(typeParameters);
		result.append(", varArgs: ");
		result.append(varArgs);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", classFunction: ");
		result.append(classFunction);
		result.append(", varargArrayType: ");
		result.append(varargArrayType);
		result.append(')');
		return result.toString();
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

} // BFunctionImpl
