/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.core.TypePattern.Matcher;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.BuilderWrapper;
import org.eclipse.b3.build.build.IBuilder;
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
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isMatchParameters <em>Match Parameters</em>}</li>
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameterPredicate> parameters;

	/**
	 * The default value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_PARAMETERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean matchParameters = MATCH_PARAMETERS_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS, oldVarArgs, varArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameterPredicate> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<BParameterPredicate>(BParameterPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatchParameters() {
		return matchParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchParameters(boolean newMatchParameters) {
		boolean oldMatchParameters = matchParameters;
		matchParameters = newMatchParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS, oldMatchParameters, matchParameters));
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
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				return isVarArgs();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return getParameters();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				return isMatchParameters();
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
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				setVarArgs((Boolean)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends BParameterPredicate>)newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				setMatchParameters((Boolean)newValue);
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
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				setVarArgs(VAR_ARGS_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				setMatchParameters(MATCH_PARAMETERS_EDEFAULT);
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
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				return varArgs != VAR_ARGS_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				return matchParameters != MATCH_PARAMETERS_EDEFAULT;
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
		result.append(", matchParameters: ");
		result.append(matchParameters);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns true if the candidate object matches the query and parameter type pattern.
	 */
	@Override
	public boolean matches(Object candidate, BExecutionContext ctx) {
		if(! (candidate instanceof IBuilder))
			return false;
		IBuilder b = (IBuilder)candidate;
		try {
			if(matchParameters) {
				TypePattern pattern = TypePattern.compile(getParameters());
				Matcher matcher = pattern.match(b.getParameters());
				if(!matcher.isMatch())
					return false;

			}
			return matchesQuery(b, ctx);

		} catch (Throwable e) {
			throw new B3InternalError("Error while evaluating if BuilderConcernContext matches a Builder", e);
		}			
	}
	
	/**
	 * Evaluates the query and returns true, if the candidate matches the query. This method does not include
	 * parameter type matching.
	 * 
	 * @param candidate
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	private boolean matchesQuery(IBuilder candidate, BExecutionContext ctx) throws Throwable {
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineVariableValue("@test", candidate, Builder.class);
		return getQuery().evaluate(ictx) == Boolean.TRUE ;
	}
	/**
	 * Performs parameter type matching and if parameters match, a wrapper is created and added to the context.
	 * 
	 * TODO: OPTIMIZE: This could probably be optimized and shared with BFunctionConcernContextImpl - it is almost the same
	 * 
	 * @param pattern
	 * @param f
	 * @param ctx
	 * @return
	 * @throws B3EngineException
	 */
	private boolean weaveIfParametersMatch(TypePattern pattern, IFunction f, BExecutionContext ctx) throws B3EngineException {
		Matcher matcher = pattern.match(f.getParameters());
		if(matchParameters && !matcher.isMatch())
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
		BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
		wrapper.setOriginal(f);
		wrapper.setAroundExpr(this.funcExpr);
		wrapper.setParameterMap(nameMap);
		// if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
		if(isVarArgs() && ((pName = plist.get(plist.size()-1).getName()) != null))
			wrapper.setVarargsName(pName);
		ctx.defineFunction(wrapper);
		return true;
	}
	/**
	 * Applies the advice to all already defined builders matching the query and type pattern specified
	 * in this context. Each matching builder is wrapped with a BuildWrapper and added to the context passed
	 * as a parameter.
	 * @returns this
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// Find all builders that match the predicate
		// Add wrappers for all found builders
		Iterator<IFunction> fItor = ctx.getFunctionIterator();
		TypePattern pattern = TypePattern.compile(getParameters());

		while(fItor.hasNext()) {
			IFunction f = fItor.next();
			if(f instanceof Builder && matchesQuery((Builder)f, ctx))
				weaveIfParametersMatch(pattern, (Builder)f, ctx);
		}
		return this;
	}
	
	/**
	 * Performs the same operation as {@link #evaluate(BExecutionContext)} but for a single object (candidate).
	 */
	@Override
	public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx) throws Throwable {
		if(!(candidate instanceof Builder))
			return false;
		if(! matchesQuery((Builder)candidate, ctx))
			return false;
		TypePattern pattern = TypePattern.compile(getParameters());
		return weaveIfParametersMatch(pattern, (Builder)candidate, ctx);
	}
} //BuilderConcernContextImpl
