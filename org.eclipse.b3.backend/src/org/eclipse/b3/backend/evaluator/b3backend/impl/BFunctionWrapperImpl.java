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

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import java.util.Collection;

import org.eclipse.b3.backend.core.LValue;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFunction Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getParameterNames <em>Parameter Names</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getClosure <em>Closure</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getTypeCalculator <em>Type Calculator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getWrapper <em>Wrapper</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class BFunctionWrapperImpl extends BExpressionImpl implements BFunctionWrapper {


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
	 * The default value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final TypeVariable[] TYPE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected TypeVariable[] typeParameters = TYPE_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterNames() <em>Parameter Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterNames()
	 * @generated
	 * @ordered
	 */
	protected static final String[] PARAMETER_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterNames() <em>Parameter Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterNames()
	 * @generated
	 * @ordered
	 */
	protected String[] parameterNames = PARAMETER_NAMES_EDEFAULT;

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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getWrapper() <em>Wrapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapper()
	 * @generated
	 * @ordered
	 */
	protected IFunction wrapper;

	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected IFunction original;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFunctionWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BFUNCTION_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Visibility getVisibility() {
		return getWrapper().getVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setVisibility(Visibility newVisibility) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinal() {
		return getWrapper().isFinal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFinal(boolean newFinal) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExecutionMode getExecutionMode() {
		return getWrapper().getExecutionMode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
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
	 * @generated NOT
	 */
	public void setName(String newName) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BGuard getGuard() {
		return getWrapper().getGuard();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGuard(BGuard newGuard, NotificationChain msgs) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setGuard(BGuard newGuard) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type[] getParameterTypes() {
		return getWrapper().getParameterTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setParameterTypes(Type[] newParameterTypes) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type[] getExceptionTypes() {
		return getWrapper().getExceptionTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExceptionTypes(Type[] newExceptionTypes) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public TypeVariable[] getTypeParameters() {
		return getWrapper().getTypeParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public void setTypeParameters(TypeVariable[] newTypeParameters) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String[] getParameterNames() {
		return getWrapper().getParameterNames();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setParameterNames(String[] newParameterNames) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BParameterDeclaration> getParameters() {
		return getWrapper().getParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isVarArgs() {
		return getWrapper().isVarArgs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setVarArgs(boolean newVarArgs) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDocumentation() {
		return getWrapper().getDocumentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDocumentation(String newDocumentation) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getReturnType() {
		return getWrapper().getReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setReturnType(Type newReturnType) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BExecutionContext getClosure() {
		return getWrapper().getClosure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BExecutionContext basicGetClosure() {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setClosure(BExecutionContext newClosure) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BTypeCalculator getTypeCalculator() {
		 return getWrapper().getTypeCalculator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTypeCalculator(BTypeCalculator newTypeCalculator, NotificationChain msgs) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTypeCalculator(BTypeCalculator newTypeCalculator) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BFunctionContainer getContainer() {
		return getWrapper().getContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetContainer(BFunctionContainer newContainer, NotificationChain msgs) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setContainer(BFunctionContainer newContainer) {
		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * Wrapper has its own point in source
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public void setFileReference(BFileReference newFileReference) {
//		throw new UnsupportedOperationException("BFunctionWrapper is immutable");
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction getWrapper() {
		if (wrapper != null && wrapper.eIsProxy()) {
			InternalEObject oldWrapper = (InternalEObject)wrapper;
			wrapper = (IFunction)eResolveProxy(oldWrapper);
			if (wrapper != oldWrapper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, oldWrapper, wrapper));
			}
		}
		return wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction basicGetWrapper() {
		return wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapper(IFunction newWrapper) {
		IFunction oldWrapper = wrapper;
		wrapper = newWrapper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, oldWrapper, wrapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction getOriginal() {
		if (original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject)original;
			original = (IFunction)eResolveProxy(oldOriginal);
			if (original != oldOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL, oldOriginal, original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal(IFunction newOriginal) {
		IFunction oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Can't get an LValue from a Function nor Wrapper - always throws UnsupportedOperationException.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LValue getLValue(BExecutionContext ctx) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return getWrapper().getDeclaredType(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object internalCall(BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable {
		return getWrapper().internalCall(ctx, parameters, types);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getSignature() {
		return getWrapper().getSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getReturnTypeForParameterTypes(Type[] types, BExecutionContext ctx) {
		return getWrapper().getReturnTypeForParameterTypes(types, ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BParameterDeclaration> getEffectiveParameters() {
		return getWrapper().getEffectiveParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
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
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				return basicSetGuard(null, msgs);
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				return basicSetTypeCalculator(null, msgs);
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY:
				return getVisibility();
			case B3backendPackage.BFUNCTION_WRAPPER__FINAL:
				return isFinal();
			case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE:
				return getExecutionMode();
			case B3backendPackage.BFUNCTION_WRAPPER__NAME:
				return getName();
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				return getGuard();
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES:
				return getParameterTypes();
			case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES:
				return getExceptionTypes();
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS:
				return getTypeParameters();
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES:
				return getParameterNames();
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				return getParameters();
			case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS:
				return isVarArgs();
			case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION:
				return getDocumentation();
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				return getReturnType();
			case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE:
				if (resolve) return getClosure();
				return basicGetClosure();
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				return getTypeCalculator();
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
				return getContainer();
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				if (resolve) return getWrapper();
				return basicGetWrapper();
			case B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL:
				if (resolve) return getOriginal();
				return basicGetOriginal();
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
			case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__FINAL:
				setFinal((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE:
				setExecutionMode((ExecutionMode)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__NAME:
				setName((String)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				setGuard((BGuard)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES:
				setParameterTypes((Type[])newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES:
				setExceptionTypes((Type[])newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS:
				setTypeParameters((TypeVariable[])newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES:
				setParameterNames((String[])newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends BParameterDeclaration>)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS:
				setVarArgs((Boolean)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE:
				setClosure((BExecutionContext)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				setTypeCalculator((BTypeCalculator)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
				setContainer((BFunctionContainer)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				setWrapper((IFunction)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL:
				setOriginal((IFunction)newValue);
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
			case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE:
				setExecutionMode(EXECUTION_MODE_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				setGuard((BGuard)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES:
				setParameterTypes(PARAMETER_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES:
				setExceptionTypes(EXCEPTION_TYPES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS:
				setTypeParameters(TYPE_PARAMETERS_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES:
				setParameterNames(PARAMETER_NAMES_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				getParameters().clear();
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS:
				setVarArgs(VAR_ARGS_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE:
				setClosure((BExecutionContext)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				setTypeCalculator((BTypeCalculator)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
				setContainer((BFunctionContainer)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				setWrapper((IFunction)null);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL:
				setOriginal((IFunction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		
		switch (featureID) {
			case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__FINAL:
				return final_ != FINAL_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				return getGuard() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES:
				return PARAMETER_TYPES_EDEFAULT == null ? parameterTypes != null : !PARAMETER_TYPES_EDEFAULT.equals(parameterTypes);
			case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES:
				return EXCEPTION_TYPES_EDEFAULT == null ? exceptionTypes != null : !EXCEPTION_TYPES_EDEFAULT.equals(exceptionTypes);
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS:
				return TYPE_PARAMETERS_EDEFAULT == null ? typeParameters != null : !TYPE_PARAMETERS_EDEFAULT.equals(typeParameters);
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES:
				return PARAMETER_NAMES_EDEFAULT == null ? parameterNames != null : !PARAMETER_NAMES_EDEFAULT.equals(parameterNames);
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				return getParameters() != null && !getParameters().isEmpty();
			case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS:
				return isVarArgs() != VAR_ARGS_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				return getReturnType() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE:
				return getClosure() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				return getTypeCalculator() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
				return getContainer() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				return wrapper != null;
			case B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
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
				case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY: return B3backendPackage.IFUNCTION__VISIBILITY;
				case B3backendPackage.BFUNCTION_WRAPPER__FINAL: return B3backendPackage.IFUNCTION__FINAL;
				case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE: return B3backendPackage.IFUNCTION__EXECUTION_MODE;
				case B3backendPackage.BFUNCTION_WRAPPER__NAME: return B3backendPackage.IFUNCTION__NAME;
				case B3backendPackage.BFUNCTION_WRAPPER__GUARD: return B3backendPackage.IFUNCTION__GUARD;
				case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES: return B3backendPackage.IFUNCTION__PARAMETER_TYPES;
				case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES: return B3backendPackage.IFUNCTION__EXCEPTION_TYPES;
				case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS: return B3backendPackage.IFUNCTION__TYPE_PARAMETERS;
				case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES: return B3backendPackage.IFUNCTION__PARAMETER_NAMES;
				case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS: return B3backendPackage.IFUNCTION__PARAMETERS;
				case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS: return B3backendPackage.IFUNCTION__VAR_ARGS;
				case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION: return B3backendPackage.IFUNCTION__DOCUMENTATION;
				case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE: return B3backendPackage.IFUNCTION__RETURN_TYPE;
				case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE: return B3backendPackage.IFUNCTION__CLOSURE;
				case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR: return B3backendPackage.IFUNCTION__TYPE_CALCULATOR;
				case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER: return B3backendPackage.IFUNCTION__CONTAINER;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GenericDeclaration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IFunction.class) {
			switch (baseFeatureID) {
				case B3backendPackage.IFUNCTION__VISIBILITY: return B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY;
				case B3backendPackage.IFUNCTION__FINAL: return B3backendPackage.BFUNCTION_WRAPPER__FINAL;
				case B3backendPackage.IFUNCTION__EXECUTION_MODE: return B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE;
				case B3backendPackage.IFUNCTION__NAME: return B3backendPackage.BFUNCTION_WRAPPER__NAME;
				case B3backendPackage.IFUNCTION__GUARD: return B3backendPackage.BFUNCTION_WRAPPER__GUARD;
				case B3backendPackage.IFUNCTION__PARAMETER_TYPES: return B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES;
				case B3backendPackage.IFUNCTION__EXCEPTION_TYPES: return B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES;
				case B3backendPackage.IFUNCTION__TYPE_PARAMETERS: return B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS;
				case B3backendPackage.IFUNCTION__PARAMETER_NAMES: return B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES;
				case B3backendPackage.IFUNCTION__PARAMETERS: return B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS;
				case B3backendPackage.IFUNCTION__VAR_ARGS: return B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS;
				case B3backendPackage.IFUNCTION__DOCUMENTATION: return B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION;
				case B3backendPackage.IFUNCTION__RETURN_TYPE: return B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE;
				case B3backendPackage.IFUNCTION__CLOSURE: return B3backendPackage.BFUNCTION_WRAPPER__CLOSURE;
				case B3backendPackage.IFUNCTION__TYPE_CALCULATOR: return B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR;
				case B3backendPackage.IFUNCTION__CONTAINER: return B3backendPackage.BFUNCTION_WRAPPER__CONTAINER;
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
		result.append(", parameterTypes: ");
		result.append(parameterTypes);
		result.append(", exceptionTypes: ");
		result.append(exceptionTypes);
		result.append(", typeParameters: ");
		result.append(typeParameters);
		result.append(", parameterNames: ");
		result.append(parameterNames);
		result.append(", varArgs: ");
		result.append(isVarArgs());
		result.append(", documentation: ");
		result.append(getDocumentation());
		result.append(')');
		return result.toString();
	}

} //BFunctionWrapperImpl
