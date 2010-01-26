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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.core.TypePattern.Matcher;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

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
 * An implementation of the model object '<em><b>BFunction Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#getFuncExpr <em>Func Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl#isVarArgs <em>Var Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFunctionConcernContextImpl extends BConcernContextImpl implements BFunctionConcernContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePredicate()
	 * @generated
	 * @ordered
	 */
	protected BFunctionNamePredicate namePredicate;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameterPredicate> parameters;

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
	protected BFunctionConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BFUNCTION_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionNamePredicate getNamePredicate() {
		return namePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BFunctionNamePredicate newNamePredicate, NotificationChain msgs) {
		BFunctionNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, oldNamePredicate, newNamePredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePredicate(BFunctionNamePredicate newNamePredicate) {
		if (newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if (namePredicate != null)
				msgs = ((InternalEObject)namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
			if (newNamePredicate != null)
				msgs = ((InternalEObject)newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE, newNamePredicate, newNamePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameterPredicate> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<BParameterPredicate>(BParameterPredicate.class, this, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS);
		}
		return parameters;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR, oldFuncExpr, newFuncExpr);
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
				msgs = ((InternalEObject)funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			if (newFuncExpr != null)
				msgs = ((InternalEObject)newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			msgs = basicSetFuncExpr(newFuncExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR, newFuncExpr, newFuncExpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__VAR_ARGS, oldVarArgs, varArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return basicSetNamePredicate(null, msgs);
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR:
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return getNamePredicate();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS:
				return getParameters();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR:
				return getFuncExpr();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__VAR_ARGS:
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				setNamePredicate((BFunctionNamePredicate)newValue);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends BParameterPredicate>)newValue);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression)newValue);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__VAR_ARGS:
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				setNamePredicate((BFunctionNamePredicate)null);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression)null);
				return;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__VAR_ARGS:
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
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE:
				return namePredicate != null;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR:
				return funcExpr != null;
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT__VAR_ARGS:
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
		result.append(" (varArgs: ");
		result.append(varArgs);
		result.append(')');
		return result.toString();
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// Find all functions that match the predicate
		// Add wrappers for all found functions
		Iterator<IFunction> itor = safeIFunctionIterator(getNamePredicate().evaluate(ctx));
		TypePattern pattern = TypePattern.compile(getParameters());
		while(itor.hasNext()) {
			weaveIfParametersMatch(pattern, itor.next(), ctx);
		}
		return this;
	}
	@Override
	public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx) throws Throwable {
		if(!(candidate instanceof IFunction))
			return false;
		if(!getNamePredicate().matches(((IFunction)candidate).getName()))
			return false;
		TypePattern pattern = TypePattern.compile(getParameters());
		return weaveIfParametersMatch(pattern, (IFunction)candidate, ctx);
	}
	private boolean weaveIfParametersMatch(TypePattern pattern, IFunction f, BExecutionContext ctx) throws B3EngineException {
		Matcher matcher = pattern.match(f.getEffectiveParameters());
		if(!matcher.isMatch())
			return false;
		
		// create a map of parameter name in advise and parameter name in matched function
		Map<String, String> nameMap = new HashMap<String,String>();
		EList<BParameterPredicate> plist = getParameters(); // i.e. predicates
		int limit = plist.size();
		String pName = null;
		// find predicates that have a name (only named predicates can be mapped)
		for(int i = 0; i < limit; i++)
			if((pName = plist.get(i).getName()) != null) {
				int matchedIdx = matcher.getMatchStart(i);
				if(matchedIdx < 0)
					throw new B3InternalError("Matched parameter reported to have an index of -1");
				nameMap.put(pName, f.getParameters().get(matcher.getMatchStart(matchedIdx)).getName());
			}
		// Create a wrapping function and define it in the context
		BFunctionWrapper wrapper = B3backendFactory.eINSTANCE.createBFunctionWrapper();
		wrapper.setOriginal(f);
		wrapper.setAroundExpr(this.funcExpr);
		wrapper.setParameterMap(nameMap);
		// if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
		if(isVarArgs() && ((pName = plist.get(plist.size()-1).getName()) != null))
			wrapper.setVarargsName(pName);
		ctx.defineFunction(wrapper);
		return true;
	}
	@SuppressWarnings("unchecked")
	private static Iterator<IFunction> safeIFunctionIterator(Object obj) {
		if(! (obj instanceof Iterator<?>))
			throw new B3InternalError("BNamePredicate did not return an Iterator");
		return (Iterator<IFunction>)obj;
	}
} //BFunctionConcernContextImpl
