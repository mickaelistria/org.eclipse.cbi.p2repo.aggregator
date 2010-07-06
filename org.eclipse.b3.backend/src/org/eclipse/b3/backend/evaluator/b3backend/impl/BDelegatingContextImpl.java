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
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FuncStore;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDelegating Context</b></em>'.
 * By overriding {@link #getValueMap() } with a delegation to the outer context's value map, and delegating
 * function calls (and getting function types) to the outer context, this class can be inserted into a
 * a chain of execution contexts as an immutable inner context that makes things in the outer context appear
 * as if they were available in the regular inner chain.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BDelegatingContextImpl extends BInnerContextImpl implements BDelegatingContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDelegatingContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Performs the call via the outer context
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object callFunction(String functionName, Object[] parameters, Type[] types) throws Throwable {
		return getOuterContext().callFunction(functionName, parameters, types);
	}

	/**
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 */
	@Override
	protected void createFuncStore() {
		throw new UnsupportedOperationException("Can not perform createFuncStore() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object defineFinalValue(String name, Object value, Type t) throws B3EngineException {
		throw new UnsupportedOperationException("Can not perform defineFinalValue() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object defineFinalVariableValue(String name, Object value, Type t) throws B3EngineException {
		throw new UnsupportedOperationException("Can not perform defineFinalVariableValue() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * Delegates function definition to the outer context. This is used when system context functions are woven as they
	 * are lazily added.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public IFunction defineFunction(IFunction function) throws B3EngineException {
		return getOuterContext().defineFunction(function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object defineValue(String name, Object value, Type t) throws B3EngineException {
		throw new UnsupportedOperationException("Can not perform defineValue() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object defineVariableValue(String name, Object value, Type t) throws B3EngineException {
		throw new UnsupportedOperationException("Can not perform defineVariableValue() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BDELEGATING_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the declared function type from the outer context.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Type getDeclaredFunctionType(String functionName, Type[] types) throws Throwable {
		return getOuterContext().getDeclaredFunctionType(functionName, types);
	}

	@Override
	public EList<BConcern> getEffectiveConcerns() {
		return getOuterContext().getEffectiveConcerns();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns outer's corresponding value.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public B3FuncStore getFuncStore() {
		return getOuterContext().getFuncStore();
	}

	// ---------------- Delegating part
	/**
	 * <!-- begin-user-doc -->
	 * Returns outer's value map.
	 * This means that outer context's immediate values hides the parent values, but search for values does not
	 * take place up-the-parent-chain of the outer context.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ValueMap getValueMap() {
		return getOuterContext().getValueMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException - the delegating context is immutable. Make changes on the
	 * outer context directly instead.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void loadFunctions(Class<? extends Object> clazz) throws B3EngineException {
		throw new UnsupportedOperationException("Can not perform loadFunctions() on a delegating context.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * Throws UnsupportedOperationException as a delegating context is immutable.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setFuncStore(B3FuncStore newFuncStore) {
		throw new UnsupportedOperationException("Can not perform setFuncStore() on a delegating context.");
	}
} // BDelegatingContextImpl
