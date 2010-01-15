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
import java.lang.reflect.TypeVariable;

import java.util.Collection;

import org.eclipse.b3.backend.core.LValue;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFileReference;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BSourceLink;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getFileReference <em>File Reference</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getWrapper <em>Wrapper</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFunctionWrapperImpl extends EObjectImpl implements BFunctionWrapper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

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
	protected static final TypeVariable[] TYPE_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
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
	 * The cached value of the '{@link #getClosure() <em>Closure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure()
	 * @generated
	 * @ordered
	 */
	protected BExecutionContext closure;

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
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected int lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileReference() <em>File Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileReference()
	 * @generated
	 * @ordered
	 */
	protected BFileReference fileReference;

	/**
	 * The cached value of the '{@link #getWrapper() <em>Wrapper</em>}' containment reference.
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
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__FINAL, oldFinal, final_));
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
	public void setExecutionMode(ExecutionMode newExecutionMode) {
		ExecutionMode oldExecutionMode = executionMode;
		executionMode = newExecutionMode == null ? EXECUTION_MODE_EDEFAULT : newExecutionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE, oldExecutionMode, executionMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__NAME, oldName, name));
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
	public NotificationChain basicSetGuard(BGuard newGuard, NotificationChain msgs) {
		BGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__GUARD, newGuard, newGuard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES, oldParameterTypes, parameterTypes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES, oldExceptionTypes, exceptionTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVariable[] getTypeParameters() {
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParameters(TypeVariable[] newTypeParameters) {
		TypeVariable[] oldTypeParameters = typeParameters;
		typeParameters = newTypeParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS, oldTypeParameters, typeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getParameterNames() {
		return parameterNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterNames(String[] newParameterNames) {
		String[] oldParameterNames = parameterNames;
		parameterNames = newParameterNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES, oldParameterNames, parameterNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameterDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<BParameterDeclaration>(BParameterDeclaration.class, this, B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS, oldVarArgs, varArgs));
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
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION, oldDocumentation, documentation));
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
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext getClosure() {
		if (closure != null && closure.eIsProxy()) {
			InternalEObject oldClosure = (InternalEObject)closure;
			closure = (BExecutionContext)eResolveProxy(oldClosure);
			if (closure != oldClosure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BFUNCTION_WRAPPER__CLOSURE, oldClosure, closure));
			}
		}
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext basicGetClosure() {
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosure(BExecutionContext newClosure) {
		BExecutionContext oldClosure = closure;
		closure = newClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__CLOSURE, oldClosure, closure));
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
	 * @generated
	 */
	public NotificationChain basicSetTypeCalculator(BTypeCalculator newTypeCalculator, NotificationChain msgs) {
		BTypeCalculator oldTypeCalculator = typeCalculator;
		typeCalculator = newTypeCalculator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR, oldTypeCalculator, newTypeCalculator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
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
				msgs = ((InternalEObject)typeCalculator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR, null, msgs);
			if (newTypeCalculator != null)
				msgs = ((InternalEObject)newTypeCalculator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR, null, msgs);
			msgs = basicSetTypeCalculator(newTypeCalculator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR, newTypeCalculator, newTypeCalculator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionContainer getContainer() {
		if (eContainerFeatureID() != B3backendPackage.BFUNCTION_WRAPPER__CONTAINER) return null;
		return (BFunctionContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(BFunctionContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, B3backendPackage.BFUNCTION_WRAPPER__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(BFunctionContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != B3backendPackage.BFUNCTION_WRAPPER__CONTAINER && newContainer != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(int newLineNumber) {
		int oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFileReference getFileReference() {
		if (fileReference != null && fileReference.eIsProxy()) {
			InternalEObject oldFileReference = (InternalEObject)fileReference;
			fileReference = (BFileReference)eResolveProxy(oldFileReference);
			if (fileReference != oldFileReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE, oldFileReference, fileReference));
			}
		}
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFileReference basicGetFileReference() {
		return fileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileReference(BFileReference newFileReference) {
		BFileReference oldFileReference = fileReference;
		fileReference = newFileReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE, oldFileReference, fileReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction getWrapper() {
		return wrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWrapper(IFunction newWrapper, NotificationChain msgs) {
		IFunction oldWrapper = wrapper;
		wrapper = newWrapper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, oldWrapper, newWrapper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapper(IFunction newWrapper) {
		if (newWrapper != wrapper) {
			NotificationChain msgs = null;
			if (wrapper != null)
				msgs = ((InternalEObject)wrapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, null, msgs);
			if (newWrapper != null)
				msgs = ((InternalEObject)newWrapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, null, msgs);
			msgs = basicSetWrapper(newWrapper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_WRAPPER__WRAPPER, newWrapper, newWrapper));
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
	 * @generated
	 */
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LValue getLValue(BExecutionContext ctx) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Type getSignature() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnTypeForParameterTypes(Type[] types, BExecutionContext ctx) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameterDeclaration> getEffectiveParameters() {
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
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				return basicSetWrapper(null, msgs);
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
			case B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER:
				return getLineNumber();
			case B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE:
				if (resolve) return getFileReference();
				return basicGetFileReference();
			case B3backendPackage.BFUNCTION_WRAPPER__WRAPPER:
				return getWrapper();
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
			case B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER:
				setLineNumber((Integer)newValue);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE:
				setFileReference((BFileReference)newValue);
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
			case B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE:
				setFileReference((BFileReference)null);
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
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__FINAL:
				return final_ != FINAL_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE:
				return executionMode != EXECUTION_MODE_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BFUNCTION_WRAPPER__GUARD:
				return guard != null;
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_TYPES:
				return PARAMETER_TYPES_EDEFAULT == null ? parameterTypes != null : !PARAMETER_TYPES_EDEFAULT.equals(parameterTypes);
			case B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES:
				return EXCEPTION_TYPES_EDEFAULT == null ? exceptionTypes != null : !EXCEPTION_TYPES_EDEFAULT.equals(exceptionTypes);
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS:
				return TYPE_PARAMETERS_EDEFAULT == null ? typeParameters != null : !TYPE_PARAMETERS_EDEFAULT.equals(typeParameters);
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_NAMES:
				return PARAMETER_NAMES_EDEFAULT == null ? parameterNames != null : !PARAMETER_NAMES_EDEFAULT.equals(parameterNames);
			case B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS:
				return varArgs != VAR_ARGS_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE:
				return returnType != null;
			case B3backendPackage.BFUNCTION_WRAPPER__CLOSURE:
				return closure != null;
			case B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR:
				return typeCalculator != null;
			case B3backendPackage.BFUNCTION_WRAPPER__CONTAINER:
				return getContainer() != null;
			case B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER:
				return lineNumber != LINE_NUMBER_EDEFAULT;
			case B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE:
				return fileReference != null;
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
		if (baseClass == BSourceLink.class) {
			switch (derivedFeatureID) {
				case B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER: return B3backendPackage.BSOURCE_LINK__LINE_NUMBER;
				case B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE: return B3backendPackage.BSOURCE_LINK__FILE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == BExpression.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == BSourceLink.class) {
			switch (baseFeatureID) {
				case B3backendPackage.BSOURCE_LINK__LINE_NUMBER: return B3backendPackage.BFUNCTION_WRAPPER__LINE_NUMBER;
				case B3backendPackage.BSOURCE_LINK__FILE_REFERENCE: return B3backendPackage.BFUNCTION_WRAPPER__FILE_REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == BExpression.class) {
			switch (baseFeatureID) {
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
		result.append(varArgs);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(')');
		return result.toString();
	}

} //BFunctionWrapperImpl
