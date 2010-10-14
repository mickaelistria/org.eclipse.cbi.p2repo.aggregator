/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.IB3LvalProvider;
import org.eclipse.b3.backend.core.IB3Weaver;
import org.eclipse.b3.backend.core.adapters.LoadedPropertySetAdapter;
import org.eclipse.b3.backend.core.adapters.LoadedPropertySetAdapterFactory;
import org.eclipse.b3.backend.core.datatypes.Any;
import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.exceptions.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.exceptions.B3BackendException;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3IllegalInjectionArgumentsException;
import org.eclipse.b3.backend.core.exceptions.B3IncompatibleTypeException;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.core.exceptions.B3NoContextException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.core.exceptions.B3UserException;
import org.eclipse.b3.backend.core.iterators.RegexpIterator;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BAdvice;
import org.eclipse.b3.backend.evaluator.b3backend.BAndExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BDefProperty;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BOrExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTemplate;
import org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.IVarName;
import org.eclipse.b3.backend.evaluator.typesystem.ConstructorCandidate;
import org.eclipse.b3.backend.evaluator.typesystem.ConstructorCandidateSource;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.b3.backend.inference.ITypeProvider;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

public class B3BackendEvaluator extends DeclarativeB3Evaluator {
	protected static final String[] EMPTY_NAMELIST = new String[0];

	// TODO: Move this to some util class
	public static Type[] getAllParameterTypes(Type objectType, Type[] parameterTypes) {
		Type[] allParameterTypes = new Type[parameterTypes.length + 1];

		allParameterTypes[0] = objectType;
		System.arraycopy(parameterTypes, 0, allParameterTypes, 1, parameterTypes.length);

		return allParameterTypes;
	}

	/**
	 * Loads properties by transforming them into property operations (for later evaluation).
	 * TODO: This is a very simple implementation using toURL().openStream() to read from a URL.
	 * TODO: Move this to some util class
	 * 
	 * @throws IOException
	 */
	public static void loadProperties(BPropertySet o) throws IOException {
		if(o.getPropertiesFile() == null)
			return;
		LoadedPropertySetAdapter adapter = LoadedPropertySetAdapterFactory.eINSTANCE.adapt(o);
		List<BPropertyOperation> ops = adapter.getAssociatedOps();
		if(ops != null)
			return; // already loaded

		ops = new ArrayList<BPropertyOperation>();
		adapter.setAssociatedOps(ops);

		InputStream inputStream = null;
		Properties p = new Properties();
		try {
			inputStream = o.getPropertiesFile().toURL().openStream();
			p.load(inputStream);
			// EList<BPropertyOperation> ops = getOperations();
			for(Entry<Object, Object> e : p.entrySet()) {
				String key = "${" + String.class.cast(e.getKey()) + "}";
				String value = String.class.cast(e.getValue());
				BPropertyDefinitionOperation propDef = B3backendFactory.eINSTANCE.createBPropertyDefinitionOperation();
				BDefProperty valueDef = B3backendFactory.eINSTANCE.createBDefProperty();
				BLiteralExpression valueLiteral = B3backendFactory.eINSTANCE.createBLiteralExpression();
				valueLiteral.setValue(value);
				valueDef.setName(key);
				valueDef.setValueExpr(valueLiteral);
				propDef.setDefinition(valueDef);
				ops.add(propDef);
			}
		}
		finally {
			// propertiesFileLoaded = true; // don't try again if there are errors (TODO: too simplistic handling of
			// errors)
			if(inputStream != null)
				try {
					inputStream.close();
				}
				catch(IOException e) {
					// ignored
				}
		}
	}

	/**
	 * TODO: Move to a util class
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean matches(Object a, Object b) {
		Type[] ai = a.getClass().getGenericInterfaces();
		Type[] bi = b.getClass().getGenericInterfaces();
		Type aType = null;
		for(int i = 0; i < ai.length; i++) {
			Type t = ai[i];
			if(t instanceof ParameterizedType && ((ParameterizedType) t).getRawType() == Comparable.class) {
				aType = ((ParameterizedType) t).getActualTypeArguments()[0];
				break;
			}
		}
		Type bType = null;
		for(int i = 0; i < bi.length; i++) {
			Type t = bi[i];
			if(t instanceof ParameterizedType && ((ParameterizedType) t).getRawType() == Comparable.class) {
				bType = ((ParameterizedType) t).getActualTypeArguments()[0];
				break;
			}
		}
		Class bClass = bType != null && bType instanceof Class
				? ((Class) bType)
				: null;
		Class aClass = aType != null && aType instanceof Class
				? ((Class) aType)
				: null;
		if(aClass == null && bClass == null)
			return false;

		if(aClass != null && aClass.isAssignableFrom(b.getClass()))
			if(((Comparable) a).compareTo(b) == 0)
				return true;
		if(bClass != null && bClass.isAssignableFrom(a.getClass()))
			if(((Comparable) a).compareTo(b) == 0)
				return true;
		return false;
	}

	@SuppressWarnings("unchecked")
	private static Iterator<IFunction> safeIFunctionIterator(Object obj) {
		if(!(obj instanceof Iterator<?>))
			throw new B3InternalError("BNamePredicate did not return an Iterator");
		return (Iterator<IFunction>) obj;
	}

	@Inject
	protected FunctionUtils functionUtils;

	@Inject
	protected IB3LvalProvider lValProvider;

	@Inject
	ITypeProvider typer;

	/**
	 * Calls the B3 Defined function
	 */
	public Object call(B3Function o, Object[] parameters, Type[] types, BExecutionContext ctx) throws Throwable {
		return call(o, parameters, types, ctx, true);
	}

	/**
	 * Calls a B3 Defined function.
	 * If the parameter prepareContext is true, a new context is prepared with parameter name to value mapping.
	 * If prepareContext is false, the given context is used as is in the evaulation.
	 * Function body is evaluated and returned.
	 */
	public Object call(B3Function o, Object[] parameters, Type[] types, BExecutionContext ctx, boolean prepareContext)
			throws Throwable {
		if(ctx != null && ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();

		if(o.getFuncExpr() == null)
			return null;
		// prepare context if requested
		return doEvaluate(o.getFuncExpr(), prepareContext
				? doCallPrepare(o, parameters, types, ctx)
				: ctx);
	}

	/**
	 * Catcher impl for BFunction (if more specific impl is missing) - throws UnsupportedOperationException
	 */
	public Object call(BFunction o, Object[] params, Type[] types, BExecutionContext ctx) throws Throwable {
		throw new UnsupportedOperationException("call(BFunction ...) - impl must be missing for specific type:" +
				o.getClass());

	}

	/**
	 * Calls a FunctionWrapper and performs setup of parameters in given context.
	 * 
	 * @throws OperationCanceledException
	 *             if the operation was canceled.
	 */
	public Object call(BFunctionWrapper o, Object[] parameters, Type[] types, BExecutionContext ctx) throws Throwable {
		return call(o, parameters, types, ctx, true);
	}

	/**
	 * Calls a Function wrapper, optionall performing setup of parameters in given context.
	 * 
	 * @param o
	 * @param parameters
	 * @param types
	 * @param ctx
	 * @param prepareContext
	 * @return
	 * @throws Throwable
	 */
	public Object call(BFunctionWrapper o, Object[] parameters, Type[] types, BExecutionContext ctx,
			boolean prepareContext) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();

		if(o.getAroundExpr() == null) {
			// A wrapper without body should have been rejected by validation
			throw new B3InternalError("A Wrapped function without a body detected.");
			// return o.getOriginal().internalCall(ctx, parameters, types);
		}
		return doEvaluate(o.getAroundExpr(), prepareContext
				? doCallPrepare(o, parameters, types, ctx)
				: ctx);
	}

	/**
	 * Calls a BJavaFunction - never prepares the context as the java call uses the parameters and types
	 * directly.
	 * 
	 * @param o
	 * @param parameters
	 * @param types
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Object call(BJavaFunction o, Object[] parameters, Type[] types, BExecutionContext ctx) throws Throwable {
		return call(o, parameters, types, ctx, false);
	}

	/**
	 * Calls a BJavaFunction - never prepares the context as the java call uses the parameters and types
	 * directly.
	 * 
	 * @param o
	 * @param parameters
	 * @param types
	 * @param ctx
	 * @param prepareContext
	 *            - ignored, parameters are never setup in the context for a java call
	 * @return
	 * @throws Throwable
	 */
	public Object call(BJavaFunction o, Object[] parameters, Type[] types, BExecutionContext ctx, boolean prepareContext)
			throws Throwable {
		// No need to prepare the context, as the java call is performed directly on the parameters and types.
		if(ctx != null && ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();

		return o.internalCall(ctx, parameters, types);
	}

	/**
	 * Finds and calls a function in a new outer context.
	 * 
	 * @param functionName
	 * @param params
	 * @param types
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Object callFunction(String functionName, Object[] params, Type[] types, BExecutionContext ctx)
			throws Throwable {
		IFunction f = ctx.findFunction(functionName, types);

		// need to manipulate a static call that is performed on an instance of a class
		// (contrast: a call on a static java method).
		if(f.isClassFunction() && types.length > 0 && !(types[0] instanceof B3MetaClass)) {
			B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
			metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
			Object[] newParameters = new Object[params.length + 1];
			System.arraycopy(params, 0, newParameters, 1, params.length);
			newParameters[0] = types[0];
			Type[] newTypes = new Type[types.length + 1];
			System.arraycopy(types, 0, newTypes, 1, types.length);
			newTypes[0] = metaClass;
			return doCall(f, newParameters, newTypes, ctx.createOuterContext());
		}
		// regular call (or explicit static call).
		return doCall(f, params, types, ctx.createOuterContext());
	}

	public Object evaluate(BAndExpression o, BExecutionContext ctx) throws Throwable {
		if(Boolean.FALSE.equals(doEvaluate(o.getLeftExpr(), ctx)))
			return Boolean.FALSE;
		return doEvaluate(o.getRightExpr(), ctx);
	}

	public Object evaluate(BAssignmentExpression o, BExecutionContext ctx) throws Throwable {
		Object r = doEvaluate(o.getRightExpr(), ctx);
		LValue lval = doLValue(o.getLeftExpr(), ctx);

		Type inferred = null;
		// If not declared, infer type
		if(lval.getDeclaredType() == null)
			lval.setDeclaredType(inferred = typer.doGetInferredType(o.getRightExpr()));

		// straight assignment
		String functionName = o.getFunctionName();
		if(functionName == null || "".equals(functionName) || "=:".contains(functionName))
			return lval.set(r);

		Object[] params = new Object[] { lval.get(), r };
		if(inferred == null)
			inferred = typer.doGetInferredType(o.getRightExpr());
		Type[] types = new Type[] { lval.getDeclaredType(), inferred };
		// remove the trailing '=' from +=, *= <<= etc. before calling
		String fn = functionName.endsWith("=")
				? functionName.substring(0, functionName.length() - 1)
				: functionName;
		return lval.set(callFunction(fn, params, types, ctx));
	}

	public Object evaluate(BAtExpression o, BExecutionContext ctx) throws Throwable {
		LValue lval = lValue(o, ctx);
		return lval.get();
	}

	public Object evaluate(BBinaryOpExpression o, BExecutionContext ctx) throws Throwable {
		String functionName = o.getFunctionName();
		try {
			return callFunction(
				functionName, new Object[] { doEvaluate(o.getLeftExpr(), ctx), doEvaluate(o.getRightExpr(), ctx) },
				new Type[] { typer.doGetInferredType(o.getLeftExpr()), typer.doGetInferredType(o.getRightExpr()) }, ctx);
		}
		catch(ArithmeticException e) {
			throw B3BackendException.fromMessage(o, e, "Arithmetic error - {0}", e.getMessage());
		}
	}

	public Object evaluate(BCachedExpression o, BExecutionContext ctx) throws Throwable {
		BInvocationContext bctx = null;
		try {
			bctx = ctx.getInvocationContext();
		}
		catch(B3EngineException e) {
			throw BackendHelper.createException(o, e, "Internal error - no invocation context found");
		}
		synchronized(bctx.getExpressionCache()) {
			if(bctx.getExpressionCache().isCached(o))
				return bctx.getExpressionCache().get(o);
			Object value = doEvaluate(o.getExpr(), ctx);
			bctx.getExpressionCache().put(o, value);
			return value;
		}
	}

	public Object evaluate(BCallFeature o, BExecutionContext ctx) throws Throwable {
		return o.isCall()
				? evaluateAsCall(o, ctx)
				: evaluateAsLVal(o, ctx);
	}

	/**
	 * Checks for progress monitor cancellation, and if not canceled calls the function
	 * resulting from evaluating the funcExpr.
	 * i.e. handle a call on the form (a)(x,y);
	 * 
	 * @throws OperationCanceledException
	 *             if operation was canceled.
	 */
	public Object evaluate(BCallFunction o, BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			Object target = doEvaluate(o.getFuncExpr(), ctx);
			EList<BParameter> pList = o.getParameterList().getParameters();
			int nbrParams = pList.size();
			Object[] parameters = new Object[nbrParams];
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			for(BParameter p : pList) {
				BExpression e = p.getExpr();
				parameters[counter] = doEvaluate(e, ctx);
				// first parameter always have its actual type (unless it is null)
				tparameters[counter] = counter == 0 && parameters[counter] != null
						? safeActualTypeOf(parameters[counter], typer.doGetInferredType(e))
						: typer.doGetInferredType(e);
				counter++;
			}
			if(target instanceof Class<?>) {
				if(parameters.length != 1)
					throw B3BackendException.fromMessage(
						o, "Attempt to cast to {0} using more than one object to cast", new Object[] { target });
				try {
					return ((Class<?>) target).cast(parameters[0]);
				}
				catch(ClassCastException e) {
					throw B3BackendException.fromMessage(o, e, "Can not perform cast", new Object[] {});
				}
			}
			if(!(target instanceof BFunction))
				throw B3BackendException.fromMessage(
					o, "Attempt to call non Function - was type : {0}", new Object[] { target.getClass() });

			// if the function comes with a closure, call it in an inner context, else a fresh outer context.
			// TODO: Don't know if this treatment is needed elsewhere as well...
			BExecutionContext useCtx = (target instanceof IClosure)
					? ((IClosure) target).getClosure()
					: null;
			useCtx = useCtx == null
					? ctx.createOuterContext()
					: useCtx.createInnerContext();
			return doCall(target, parameters, tparameters, useCtx);

		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(o, lastError, "Call failed - see details.");
	}

	/**
	 * Checks for progress monitor cancellation, and if not canceled calls the function.
	 * 
	 * @throws OperationCanceledException
	 *             if operation was canceled.
	 */
	public Object evaluate(BCallNamedFunction o, BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			EList<BParameter> pList = o.getParameterList().getParameters();
			int nbrParams = pList.size();
			Object[] parameters = new Object[nbrParams];
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			for(BParameter p : pList) {
				BExpression e = p.getExpr();
				parameters[counter] = doEvaluate(e, ctx);
				// first parameter always have its actual type
				tparameters[counter] = counter == 0 && parameters[counter] != null
						? safeActualTypeOf(parameters[counter], typer.doGetInferredType(e))
						: typer.doGetInferredType(e);
				if(tparameters[counter] == null) {
					typer.doGetInferredType(e);
					throw new B3InternalError("Type inference failed for expression:" + e.toString());
				}
				counter++;
			}
			String fName = o.getFuncRef() == null
					? o.getName()
					: o.getFuncRef().getName();
			return callFunction(fName, parameters, tparameters, ctx);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(o, lastError, "Call failed - see details.");
	}

	public Object evaluate(BCase o, BExecutionContext ctx) throws Throwable {
		return doEvaluate(o.getThenExpr(), ctx);
	}

	public Object evaluate(BCatch o, BExecutionContext ctx) throws Throwable {
		return doEvaluate(o.getCatchExpr(), ctx);
	}

	/**
	 * Evaluates all, and returns the result of the last expression in the expression block.
	 */
	public Object evaluate(BChainedExpression o, BExecutionContext ctx) throws Throwable {
		Object result = null;
		for(BExpression expr : o.getExpressions())
			result = doEvaluate(expr, ctx);
		return result;
	}

	public Object evaluate(BConcern o, BExecutionContext ctx) throws Throwable {
		for(BConcern c : o.getSuperConcerns())
			doEvaluate(c, ctx);
		for(BPropertySet ps : o.getPropertySets())
			doEvaluate(ps, ctx);
		for(IFunction f : o.getFunctions())
			ctx.defineFunction(f);
		for(BConcernContext cc : o.getContexts())
			doEvaluate(cc, ctx);
		// record this concern into the context - for bequests
		ctx.getEffectiveConcerns().add(o);
		return o;
	}

	public Object evaluate(BConditionalPropertyOperation o, BExecutionContext ctx) throws Throwable {
		Object result = Boolean.TRUE;
		if(o.getCondExpr() != null)
			result = doEvaluate(o.getCondExpr(), ctx);
		if(result != null && result instanceof Boolean && ((Boolean) result).booleanValue())
			doEvaluate(o.getBody(), ctx);
		return o;
	}

	public Object evaluate(BCreateExpression o, BExecutionContext ctx) throws Throwable {
		Type objectType = (Type) doEvaluate(o.getTypeExpr(), ctx);
		Type[] parameterTypes;
		Object[] parameters;

		{
			final EList<BParameter> paramaterList = o.getParameterList().getParameters();
			final Iterator<BParameter> parameterIterator = paramaterList.iterator();
			final int parameterCount = paramaterList.size();

			parameterTypes = new Type[parameterCount];
			parameters = new Object[parameterCount];

			for(int i = 0; i < parameterCount; ++i) {
				BExpression expression = parameterIterator.next().getExpr();

				parameterTypes[i] = typer.doGetInferredType(expression);
				parameters[i] = doEvaluate(expression, ctx);
			}
		}
		Class<?> clazz = TypeUtils.getRaw(objectType);
		Object result = null;
		// if trying to create an instance from an interface see if there is a guice binding for it.
		//
		if(clazz.isInterface()) {
			result = ctx.getInjector().getInstance(clazz);
			if(result == null)
				throw new B3InternalError(
					"NEW on Interface without error from injector - should not have reached this point for interface: " +
							clazz.getName());
			if(o.getParameterList().getParameters().size() > 1)
				throw new B3IllegalInjectionArgumentsException();
			// return result;
		}
		else {
			ConstructorCandidate constructorCandidate;
			{
				LinkedList<ConstructorCandidate> candidateConstructors = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
					parameterTypes, new ConstructorCandidateSource(clazz));

				switch(candidateConstructors.size()) {
					case 0: // no candidate constructor found
						throw new B3NoSuchFunctionSignatureException("new", getAllParameterTypes(
							objectType, parameterTypes));
					case 1: // one candidate constructor found
						constructorCandidate = candidateConstructors.getFirst();
						break;
					default: // more than one candidate constructor found (the constructor call is ambiguous)
						throw new B3AmbiguousFunctionSignatureException("new", getAllParameterTypes(
							objectType, parameterTypes));
				}
			}

			Object[] callParameters = constructorCandidate.prepareJavaCallParameters(parameterTypes, parameters);
			result = constructorCandidate.getConstructor().newInstance(callParameters);
		}
		// if creator has a contextBlock and alias, these needs to be processed
		BExpression cBlock = o.getContextBlock();
		if(cBlock != null) {
			BExecutionContext iiCtx = ctx.createInnerContext();
			iiCtx.defineValue(B3BackendConstants.B3BACKEND_THIS, result, objectType);
			if(o.getName() != null && o.getName().length() > 0)
				iiCtx.defineValue(o.getName(), result, objectType);
			doEvaluate(cBlock, iiCtx);
		}
		return result;
	}

	/**
	 * Switches from evaluate to evaluateDefaults
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Object evaluate(BDefaultPropertySet o, BExecutionContext ctx) throws Throwable {
		return doEvaluateDefaults(o, ctx, true);
	}

	public Object evaluate(BDefProperty o, BExecutionContext ctx) throws Throwable {
		BExecutionContext ctxToUse = ctx;
		while((!ctxToUse.isPropertyScope()) && ctxToUse.getParentContext() != null)
			ctxToUse = ctxToUse.getParentContext();
		if(ctxToUse == null || !ctxToUse.isPropertyScope())
			throw new B3NoContextException(NLS.bind(
				"No property context found for setting property {0} found.", o.getName()));
		// use same semantics as for variables, immutable, variable, value, etc.
		// return super.evaluate(ctxToUse);
		return evaluate((BDefValue) o, ctx);
	}

	public Object evaluate(BDefValue o, BExecutionContext ctx) throws Throwable {
		Object result = (o.getValueExpr() == null
				? null
				: doEvaluate(o.getValueExpr(), ctx));

		Type type = o.getType();
		// simple inference
		if(type == null)
			type = typer.doGetInferredType(o.getValueExpr());
		// this is really a syntax error, but can survive by using Object.class
		if(type == null)
			type = Object.class;
		if(o.isImmutable()) {
			if(o.isFinal())
				ctx.defineFinalValue(o.getName(), result, type);
			else
				ctx.defineValue(o.getName(), result, type);
		}
		else {
			if(o.isFinal())
				ctx.defineFinalVariableValue(o.getName(), result, type);
			else
				ctx.defineVariableValue(o.getName(), result, type);
		}
		return result;
	}

	public Object evaluate(BExpressionWrapper o, BExecutionContext ctx) throws Throwable {
		return o.getOriginal() == null
				? null
				: doEvaluate(o.getOriginal(), ctx);
	}

	/**
	 * Returns a feature from an object. If the instance is an EObject, the feature is obtained using
	 * Ecore technology. If the instance is a POJO, the feature is obtained using reflection and mapping
	 * of feature name to a getter (using Java Beans naming convention).
	 */
	public Object evaluate(BFeatureExpression o, BExecutionContext ctx) throws Throwable {
		String featureName = o.getFeatureName();
		BExpression objExpr = o.getObjExpr();
		Object lhs = objExpr == null
				? ctx.getValue(B3BackendConstants.B3BACKEND_THIS)
				: doEvaluate(objExpr, ctx);
		// for Ecore
		if(lhs instanceof EObject) {
			EObject eLhs = (EObject) lhs;
			EStructuralFeature feature = eLhs.eClass().getEStructuralFeature(featureName);
			if(feature == null)
				throw BackendHelper.createException(
					objExpr, "feature ''{0}'' is not a feature of the lhs expression", new Object[] { featureName });
			return eLhs.eGet(feature);
		}
		// use pojo reflection
		Pojo.FeatureLValue resultingLValue = new Pojo.FeatureLValue(lhs, featureName);
		Object result = null;
		try {
			if(resultingLValue.isGetable())
				result = resultingLValue.get();
		}
		catch(Throwable e) {
			throw BackendHelper.createException(
				objExpr, e, "failed to get feature ''{0}'' from lhs expression", new Object[] { featureName });
		}
		return result;
	}

	/**
	 * Functions are literal and evaluate to self. When a function is evaluated, it also binds
	 * to the context where it is defined.
	 */
	public Object evaluate(BFunction o, BExecutionContext ctx) throws Throwable {
		return B3ClosureProxy.newInstance(o, ctx);
		// // TODO: should probably use an adapter instead of changing the model
		// o.setClosure(ctx);
		// return o; // a function is literal.
	}

	public Object evaluate(BFunctionConcernContext o, BExecutionContext ctx) throws Throwable {
		// Find all functions that match the predicate
		// Add wrappers for all found functions
		ctx.getInjector().getInstance(IB3Weaver.class).doWeave(
			o, safeIFunctionIterator(doEvaluate(o.getNamePredicate(), ctx)), ctx);
		return o;

	}

	public Object evaluate(BFunctionNamePredicate o, BExecutionContext ctx) throws Throwable {
		// TODO: May be possible to do this better now that SimplePattern and regexp share a superclass
		//
		// NOTE: does not use BNamePredicate#matches, since different iterators are needed based on
		// the type of pattern used in BNamePredicate.
		//
		BNamePredicate namePredicate = o.getNamePredicate();
		String name = namePredicate.getName();
		if(name != null)
			return ctx.getFunctionIterator(name);

		// this is a name pattern of some sort
		// currently supporting ANY, or Regexp - pattern matching not done as
		// full expressions.
		BExpression expr = namePredicate.getNamePattern();
		if(expr instanceof BLiteralAny)
			return ctx.getFunctionIterator();

		if(expr instanceof BRegularExpression)
			return new RegexpIterator(ctx.getFunctionIterator(), ((BRegularExpression) expr).getPattern());

		throw new B3InternalError("Attempt to evaluate a BFunctionNamePredicate without a valid pattern type");
	}

	public Object evaluate(BFunctionWrapper o, BExecutionContext ctx) throws Throwable {
		return o;
	}

	public Object evaluate(BIfExpression o, BExecutionContext ctx) throws Throwable {
		Object cond = doEvaluate(o.getConditionExpr(), ctx);
		if(!(cond instanceof Boolean))
			throw BackendHelper.createException(
				o.getConditionExpr(), "If-condition is not a Boolean, was : {0}",
				new Object[] { cond.getClass().toString() });
		if(((Boolean) cond).booleanValue())
			return doEvaluate(o.getThenExpr(), ctx);
		if(o.getElseExpr() != null)
			return doEvaluate(o.getElseExpr(), ctx);
		return null;
	}

	public Object evaluate(BLiteralAny o, BExecutionContext ctx) throws CoreException {
		return Any.ANY;
	}

	public Object evaluate(BLiteralExpression o, BExecutionContext ctx) throws Throwable {
		return o.getValue();
	}

	public Object evaluate(BLiteralListExpression o, BExecutionContext ctx) throws Throwable {
		Type t = o.getEntryType() == null
				? Object.class
				: o.getEntryType();
		List<Object> list = new ArrayList<Object>(o.getEntries().size());
		int counter = 0;
		for(BExpression expr : o.getEntries()) {
			Object result = doEvaluate(expr, ctx);
			if(!TypeUtils.isAssignableFrom(t, typer.doGetInferredType(expr))) // result.getClass()))
				throw BackendHelper.createException(
					expr, "List creation error for index {0}. "
							+ "A List<{1}>, does not accept an instance of type {2}.", new Object[] {
							counter, t, result.getClass() });
			list.add(result);
			counter++;
		}
		return list;
	}

	public Object evaluate(BLiteralMapExpression o, BExecutionContext ctx) throws Throwable {
		Type keyType = o.getKeyType();
		Type valueType = o.getValueType();
		Type kt = keyType == null
				? String.class
				: keyType;
		Type vt = valueType == null
				? Object.class
				: valueType;
		Map<Object, Object> map = new LinkedHashMap<Object, Object>(o.getEntries().size());
		int counter = 0;
		for(BMapEntry mapentry : o.getEntries()) {
			Object key = doEvaluate(mapentry.getKey(), ctx);
			Object value = doEvaluate(mapentry.getValue(), ctx);
			if(!TypeUtils.isAssignableFrom(kt, typer.doGetInferredType(mapentry.getKey())))
				throw BackendHelper.createException(mapentry.getKey(), "Map creation error for entry {0}. "
						+ "A Map<{0},{0}>, does not accept a key of type {0}.", new Object[] {
						new Integer(counter), kt, vt, typer.doGetInferredType(mapentry.getKey()) });
			if(!TypeUtils.isAssignableFrom(vt, typer.doGetInferredType(mapentry.getValue())))
				throw BackendHelper.createException(mapentry.getKey(), "Map creation error for entry {0}. "
						+ "A Map<{0},{0}>, does not accept a value of type {0}.", new Object[] {
						new Integer(counter), kt, vt, typer.doGetInferredType(mapentry.getValue()) });
			map.put(key, value);
			counter++;
		}
		return map;
	}

	public Object evaluate(BLiteralType o, BExecutionContext ctx) {
		return o.getType();
	}

	public Object evaluate(BOrExpression o, BExecutionContext ctx) throws Throwable {
		if(Boolean.TRUE.equals(doEvaluate(o.getLeftExpr(), ctx)))
			return Boolean.TRUE;
		return doEvaluate(o.getRightExpr(), ctx);
	}

	public Object evaluate(BProceedExpression o, BExecutionContext ctx) throws Throwable {
		// find the mapping context to proceed in
		BWrappingContext wrappingCtx = ctx.getContext(BWrappingContext.class);
		if(wrappingCtx == null)
			throw B3BackendException.fromMessage(
				o, "A proceed expression could not find a corresponding context to proceed in.");
		IFunction original = wrappingCtx.getFunctionWrapper().getOriginal();
		return doCall(
			original, wrappingCtx.getParameters(), wrappingCtx.getParameterTypes(), wrappingCtx.getWrappedContext(),
			false);
		// return original.internalCall(
		// wrappingCtx.getWrappedContext(), wrappingCtx.getParameters(), wrappingCtx.getParameterTypes());
	}

	public Object evaluate(BPropertyDefinitionOperation o, BExecutionContext ctx) throws Throwable {
		return doEvaluate(o.getDefinition(), ctx);
	}

	/**
	 * Populates the context with values from the property set.
	 * Returns this.
	 */
	public Object evaluate(BPropertySet o, BExecutionContext ctx) throws Throwable {
		loadProperties(o);
		// start by populating context with extended sets
		BPropertySet ps = o.getExtends();
		if(ps != null)
			doEvaluate(ps, ctx);
		if(o.getPropertiesFile() != null) {
			LoadedPropertySetAdapter adapter = LoadedPropertySetAdapterFactory.eINSTANCE.adapt(o);
			List<BPropertyOperation> ops = adapter.getAssociatedOps();
			if(ops != null) {
				for(BPropertyOperation po : ops)
					doEvaluate(po, ctx);
			}
		}
		for(BPropertyOperation po : o.getOperations()) {
			doEvaluate(po, ctx);
		}
		return o;
	}

	public Object evaluate(BPropertySetOperation o, BExecutionContext ctx) throws Throwable {
		return doEvaluate(o.getPropertySet(), ctx);
	}

	public Object evaluate(BRegularExpression o, BExecutionContext ctx) throws Throwable {
		return o.getPattern();
	}

	public Object evaluate(BSwitchExpression o, BExecutionContext ctx) throws Throwable {
		BExpression switchExpression = o.getSwitchExpression();
		Object switchValue = switchExpression == null
				? Boolean.TRUE
				: doEvaluate(switchExpression, ctx);
		for(BCase c : o.getCaseList()) {
			BExpression cond = c.getConditionExpr();
			// "default"
			if(cond == null)
				return doEvaluate(c.getThenExpr(), ctx);

			Object result = doEvaluate(cond, ctx);
			if(matches(result, switchValue))
				return doEvaluate(c.getThenExpr(), ctx);
			// it is not at all certain that comparison is cumulative
			else if(switchValue.equals(result) || result.equals(switchValue))
				return doEvaluate(c.getThenExpr(), ctx);
		}
		// no case matched - return null
		return null;
	}

	public Object evaluate(BTemplate o, BExecutionContext ctx) throws Throwable {
		return B3ClosureProxy.newInstance(o, ctx);
	}

	public Object evaluate(BThrowExpression o, BExecutionContext ctx) throws Throwable {
		Object e = doEvaluate(o.getExpr(), ctx);
		if(!(e instanceof Throwable))
			throw new B3UserException(o, e);
		throw (Throwable) e;
	}

	public Object evaluate(BTryExpression o, BExecutionContext ctx) throws Throwable {
		try {
			return doEvaluate(o.getTryExpr(), ctx);
		}
		catch(Throwable t) {
			// select catch block, or if exception uncaught, re-throw
			for(BCatch catchBlock : o.getCatchBlocks()) {
				if(TypeUtils.isAssignableFrom(catchBlock.getType(), t.getClass())) {
					BExecutionContext inner = ctx.createInnerContext();
					try {
						inner.defineValue(catchBlock.getName(), t, catchBlock.getType());
					}
					catch(B3EngineException e) {
						throw BackendHelper.createException(o, e, "Could not create closure to evaluate catch.");
					}
					return doEvaluate(catchBlock, inner);
				}
			}
			// no match
			throw t;
		}
		finally {
			if(o.getFinallyExpr() != null)
				doEvaluate(o.getFinallyExpr(), ctx);
		}
	}

	public Object evaluate(BUnaryOpExpression o, BExecutionContext ctx) throws Throwable {
		BExpression expr = o.getExpr();
		String functionName = o.getFunctionName();
		return callFunction(
			functionName, new Object[] { doEvaluate(expr, ctx) }, new Type[] { typer.doGetInferredType(expr) }, ctx);
	}

	public Object evaluate(BUnaryPostOpExpression o, BExecutionContext ctx) throws Throwable {
		BExpression expr = o.getExpr();
		String functionName = o.getFunctionName();
		LValue lval = doLValue(expr, ctx);
		if(lval == null)
			throw BackendHelper.createException(expr, "Expression is not an assignable value");
		Object preopValue = lval.get();
		lval.set(callFunction(
			functionName, new Object[] { preopValue }, new Type[] { typer.doGetInferredType(expr) }, ctx));
		return preopValue;
	}

	public Object evaluate(BUnaryPreOpExpression o, BExecutionContext ctx) throws Throwable {
		BExpression expr = o.getExpr();
		String functionName = o.getFunctionName();
		LValue lval = doLValue(expr, ctx);
		if(lval == null)
			throw BackendHelper.createException(expr, "Expression is not an assignable value");
		return lval.set(callFunction(
			functionName, new Object[] { lval.get() }, new Type[] { lval.getDeclaredType() }, ctx));
	}

	public Object evaluate(BVariableExpression o, BExecutionContext ctx) throws Throwable {

		// Some named values may have both a "name" and be known under a (different) "variable name",
		// if so, always use the variable name.
		final INamedValue nv = o.getNamedValue();
		final String name = (nv instanceof IVarName
				? ((IVarName) nv).getVarName()
				: nv.getName());
		if(B3Debug.evaluator)
			B3Debug.trace("[evaluator] evaluate(BVariableExpression) name:", name);
		return ctx.getValue(name);
	}

	/**
	 * Evaluates a block of code with an instance as context.
	 */
	public Object evaluate(BWithContextExpression o, BExecutionContext ctx) throws Throwable {
		Object instance = doEvaluate(o.getExpr(), ctx);

		// contextBlock and alias needs to be processed
		BExpression cBlock = o.getContextBlock();
		if(cBlock != null) {
			BExecutionContext iiCtx = ctx.createInnerContext();
			if(!Strings.isEmpty(o.getName()))
				iiCtx.defineValue(o.getName(), instance, instance.getClass());
			doEvaluate(cBlock, iiCtx);
		}
		return instance;
	}

	/**
	 * Evaluates all advice and the funcExpr. If there is no funcExpression, null is returned, and no advice is
	 * evaluated (the resulting context is of no value). If evaluation should take place regardless of funcExpr being
	 * null use {@link #getEvaluationContext(BExecutionContext)} to get the context with advice, and the evaluate
	 * the funcExpr (like this method does).
	 */
	public Object evaluate(BWithExpression o, BExecutionContext ctx) throws Throwable {
		if(o.getFuncExpr() == null)
			return null;
		return doEvaluate(o.getFuncExpr(), doGetInnerContext(o, ctx));
	}

	public Object evaluateDefaults(BConditionalPropertyOperation o, BExecutionContext ctx, boolean allVisible)
			throws Throwable {
		Object result = Boolean.TRUE;
		if(o.getCondExpr() != null)
			result = doEvaluate(o.getCondExpr(), ctx);
		if(result != null && result instanceof Boolean && ((Boolean) result).booleanValue())
			doEvaluateDefaults(o.getBody(), ctx, allVisible);
		return o;
	}

	public Object evaluateDefaults(BDefProperty o, BExecutionContext ctx, boolean allVisible) throws Throwable {
		if(ctx.containsValue(o.getName(), allVisible))
			return o;
		return evaluate(o, ctx);
	}

	public Object evaluateDefaults(BPropertyDefinitionOperation o, BExecutionContext ctx, boolean allVisible)
			throws Throwable {
		return doEvaluateDefaults(o.getDefinition(), ctx, allVisible);
	}

	public Object evaluateDefaults(BPropertySet o, BExecutionContext ctx, boolean allVisible) throws Throwable {
		loadProperties(o);
		// start by populating context with extended sets
		BPropertySet ps = o.getExtends();
		if(ps != null)
			doEvaluateDefaults(ps, ctx, allVisible);
		if(o.getPropertiesFile() != null) {
			LoadedPropertySetAdapter adapter = LoadedPropertySetAdapterFactory.eINSTANCE.adapt(o);
			List<BPropertyOperation> ops = adapter.getAssociatedOps();
			if(ops != null) {
				for(BPropertyOperation po : ops)
					doEvaluateDefaults(po, ctx, allVisible);
			}
		}

		for(BPropertyOperation po : o.getOperations()) {
			doEvaluateDefaults(po, ctx, allVisible);
		}
		return o;
	}

	public Object evaluateDefaults(BPropertySetOperation o, BExecutionContext ctx, boolean allVisible) throws Throwable {
		return doEvaluateDefaults(o.getPropertySet(), ctx, allVisible);
	}

	/**
	 * Set up the context for evaluation inside the BWithExpression
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Object getInnerContext(BWithExpression o, BExecutionContext ctx) throws Throwable {
		BInnerContext ictx = ctx.createWrappedInnerContext();
		BExecutionContext octx = ictx.getOuterContext();
		// populate all referenced advice
		for(BAdvice a : o.getReferencedAdvice())
			doEvaluate(a, octx);
		for(BConcern c : o.getConcerns())
			doEvaluate(c, octx);
		// populate properties
		for(BPropertySet ps : o.getPropertySets())
			doEvaluate(ps, octx);
		return ictx;

	}

	public LValue lValue(BAtExpression o, BExecutionContext ctx) throws Throwable {
		Object obj = doEvaluate(o.getObjExpr(), ctx);
		Object i = doEvaluate(o.getIndexExpr(), ctx);
		if(!lValProvider.doIsIndexLVal(obj))
			throw BackendHelper.createException(
				o.getObjExpr(), "expression is not of indexable type (like List or Map) - [] not applicable");

		return lValProvider.doCreateLVal(obj, i, typer.doGetInferredType(o));

		// if(obj instanceof List) {
		// int index = BackendHelper.intValue(i, o.getIndexExpr());
		// return new ListLValue((List<?>) obj, index, typer.doGetInferredType(o));
		// }
		// if(obj instanceof Map) {
		// return new MapLValue((Map<?, ?>) obj, i, typer.doGetInferredType(o));
		// }
		// throw BackendHelper.createException(o.getObjExpr(), "expression is neither a list or map - [] not applicable");
	}

	public LValue lValue(BCallFeature o, BExecutionContext ctx) throws Throwable {
		if(o.isCall())
			return lValue((Object) o, ctx);

		String featureName = o.getName();
		BExpression objExpr = o.getFuncExpr();

		Object lhs = objExpr == null
				? ctx.getValue(B3BackendConstants.B3BACKEND_THIS)
				: doEvaluate(objExpr, ctx);
		// for Ecore
		if(lhs instanceof EObject) {
			EObject eLhs = (EObject) lhs;
			EStructuralFeature feature = eLhs.eClass().getEStructuralFeature(featureName);
			if(feature == null)
				throw BackendHelper.createException(
					objExpr, "feature ''{0}'' is not a feature of the lhs expression", new Object[] { featureName });
			return new EcoreFeatureLValue((EObject) lhs, feature);
		}
		return new Pojo.FeatureLValue(lhs, featureName);
	}

	public LValue lValue(BDefValue o, BExecutionContext ctx) throws Throwable {
		// must define it if getLValue is called before evaluate
		if(!ctx.getValueMap().containsKey(o.getName()))
			doEvaluate(o, ctx);
		return ctx.getLValue(o.getName());
	}

	public LValue lValue(BExpressionWrapper o, BExecutionContext ctx) throws Throwable {
		return o.getOriginal() == null
				? lValue(((BExpression) o), ctx)
				: doLValue(o.getOriginal(), ctx);
	}

	public LValue lValue(BFeatureExpression o, BExecutionContext ctx) throws Throwable {
		String featureName = o.getFeatureName();
		BExpression objExpr = o.getObjExpr();

		Object lhs = objExpr == null
				? ctx.getValue(B3BackendConstants.B3BACKEND_THIS)
				: doEvaluate(objExpr, ctx);
		// for Ecore
		if(lhs instanceof EObject) {
			EObject eLhs = (EObject) lhs;
			EStructuralFeature feature = eLhs.eClass().getEStructuralFeature(featureName);
			if(feature == null)
				throw BackendHelper.createException(
					objExpr, "feature ''{0}'' is not a feature of the lhs expression", new Object[] { featureName });
			return new EcoreFeatureLValue((EObject) lhs, feature);
		}
		return new Pojo.FeatureLValue(lhs, featureName);
	}

	public LValue lValue(BVariableExpression o, BExecutionContext ctx) throws B3EngineException {
		return ctx.getLValue(o.getNamedValue().getName());
	}

	public String[] parameterNames(IFunction o) {
		EList<BParameterDeclaration> pList = o.getParameters();
		if(pList == null || pList.size() < 1)
			return EMPTY_NAMELIST;
		String[] names = new String[pList.size()];
		int i = 0;
		for(BParameterDeclaration p : pList)
			names[i++] = p.getName();
		return names;
	}

	protected BExecutionContext callPrepare(BFunctionWrapper o, Object[] parameters, Type[] types, BExecutionContext ctx)
			throws Throwable {
		if(B3Debug.evaluator)
			B3Debug.trace("[evaluator] - callPrepare(functionWrapper: ", o.getName(), ")");

		// prepare the context as it should be for the original function (it may return a different context)
		BExecutionContext octx = doCallPrepare(o.getOriginal(), parameters, types, ctx);

		// create a mapped context that handles the advising expression's view of what the parameters are called
		BWrappingContext mc = B3backendFactory.eINSTANCE.createBWrappingContext();
		mc.mapContext(octx, o.getParameterMap(), o);
		// keep parameters and types for 'proceed' call
		mc.setParameters(parameters);
		mc.setParameterTypes(types);
		mc.setVarargsName(o.getVarargsName());

		// get the outer context to use for normal calls out of this context
		BContext outer = ctx.getContext(BContext.class);
		// use the outer context as the parent since the advising expression should not see the original's
		// parameter values.
		mc.setParentContext(outer);
		// use the outer context found earlier for outer
		mc.setOuterContext(outer);
		// need an inner context for the advising expression's local variables since the mapped context is immutable
		return mc.createInnerContext();
	}

	/**
	 * Prepares (and returns) a context suitable for evaluating the body of a function
	 */
	protected BExecutionContext callPrepare(IFunction f, Object[] params, Type[] types, BExecutionContext octx)
			throws Throwable {
		B3FunctionType functionSignature = functionUtils.getInferredSignature(f);

		Type[] functionParameterTypes = functionSignature.getParameterTypesArray();

		if(B3Debug.evaluator) {
			B3Debug.trace("[evaluator] START callPrepare(function: ", f.getName(), ")");
			if(functionParameterTypes.length < 1)
				B3Debug.trace("[evaluator]       callPrepare(function: ", f.getName(), "), NO PARAMETERS");
		}
		// Type[] functionParameterTypes = f.getParameterTypes();
		if(functionParameterTypes.length > 0) { // if function takes no parameters, there is no binding to be done
			int limit = functionParameterTypes.length - 1; // bind all but the last defined parameter
			if(params.length < limit)
				throw new IllegalArgumentException("B3 Function '" + f.getName() + "' " +
						"called with too few arguments. Expected: " + functionParameterTypes.length + " but got: " +
						params.length);

			// parameter names may be processed differently for some IFunction subtypes (i.e.
			// implicit variables).

			String[] functionParameterNames = doParameterNames(f);
			for(int i = 0; i < limit; i++) {
				// check type compatibility
				Object o = params[i];
				Type t = o instanceof BFunction
						? FunctionUtils.getSignature((BFunction) o)
						: o.getClass();

				if(!(TypeUtils.isAssignableFrom(functionParameterTypes[i], t)))
					throw new B3IncompatibleTypeException(
						functionParameterNames[i], functionParameterTypes[i], params[i].getClass());

				if(B3Debug.evaluator)
					B3Debug.trace(
						"[evaluator]       callPrepare(function: ", f.getName(), "), binding ",
						functionParameterTypes[i], " ", functionParameterNames[i], " = ", params[i]);

				// ok, define it
				octx.defineVariableValue(functionParameterNames[i], params[i], functionParameterTypes[i]);
			}
			if(!f.isVarArgs()) { // if not varargs, bind the last defined parameter
				if(params.length < functionParameterTypes.length)
					throw new IllegalArgumentException("B3 Function '" + f.getName() + "' " +
							"called with too few arguments. Expected: " + functionParameterTypes.length + " but got: " +
							params.length);
				// check type compatibility
				Object o = params[limit];
				if(o != null) {
					Type t = o instanceof BFunction
							? FunctionUtils.getSignature((BFunction) o)
							: o.getClass();
					if(!TypeUtils.isAssignableFrom(functionParameterTypes[limit], t))
						throw new B3IncompatibleTypeException(
							functionParameterNames[limit], functionParameterTypes[limit], params[limit].getClass());
				}
				if(B3Debug.evaluator)
					B3Debug.trace(
						"[evaluator]       callPrepare(function: ", f.getName(), "), binding ",
						functionParameterTypes[limit], " ", functionParameterNames[limit], " = ", params[limit]);

				// ok
				octx.defineVariableValue(functionParameterNames[limit], params[limit], functionParameterTypes[limit]);
			}
			else {
				// varargs call, create a list and stuff any remaining parameters there
				List<Object> varargs = new ArrayList<Object>();
				Type varargsType = functionParameterTypes[limit];
				for(int i = limit; i < params.length; i++) {
					Object o = params[i];
					Type t = o instanceof BFunction
							? FunctionUtils.getSignature((BFunction) o)
							: o.getClass();

					if(!TypeUtils.isAssignableFrom(varargsType, t))
						throw new B3IncompatibleTypeException(
							functionParameterNames[limit], varargsType, params[i].getClass());
					varargs.add(params[i]);
				}
				B3ParameterizedType pt = B3backendFactory.eINSTANCE.createB3ParameterizedType();
				pt.setRawType(List.class);
				pt.getActualArgumentsList().add(functionParameterTypes[limit]);

				if(B3Debug.evaluator)
					B3Debug.trace(
						"[evaluator]       callPrepare(function: ", f.getName(), "), binding ", pt, "... ",
						functionParameterNames[limit], " = ", varargs);

				// bind the varargs to a List of the declared type (possibly an empty list).
				octx.defineVariableValue(functionParameterNames[limit], varargs, pt);
			}
		}
		// mark the processing of parameters as done - (a bit ugly for now, as it requires getting the valueMap
		// from the context - should be API on the context.
		octx.getValueMap().markParametersDone(f.isVarArgs());

		if(B3Debug.evaluator)
			B3Debug.trace("[evaluator] END callPrepare(function: ", f.getName(), ")");

		// returns the prepared context
		return octx;
	}

	/**
	 * Returns the type of x (its class) unless it is null in which case the declared type is used.
	 * If x is an IFunction, its signature is used (since its class is not enough).
	 * If the declared type is a metaclass use it instead of actual (to avoid creating a new meta class from the
	 * actual type).
	 * 
	 * @param x
	 * @param declaredType
	 * @return
	 */
	protected Type safeActualTypeOf(Object x, Type declaredType) {
		if(x == null)
			return declaredType;
		if(x instanceof IFunction)
			return typer.doGetInferredType(x);
		// return functionUtils.getSignature((IFunction) x);
		if(declaredType instanceof B3MetaClass)
			return declaredType;
		return x.getClass();
	}

	private Object evaluateAsCall(BCallFeature o, BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			Object target = doEvaluate(o.getFuncExpr(), ctx);
			EList<BParameter> pList = o.getParameterList().getParameters();
			int nbrParams = pList.size() + 1;
			Object[] parameters = new Object[nbrParams];
			Type[] tparameters = new Type[nbrParams];
			int counter = 0;
			parameters[counter] = target;
			// first parameter always have its actual type
			tparameters[counter++] = safeActualTypeOf(target, typer.doGetInferredType(o.getFuncExpr()));
			for(BParameter p : pList) {
				BExpression e = p.getExpr();
				parameters[counter] = doEvaluate(e, ctx);
				tparameters[counter++] = typer.doGetInferredType(e);
			}
			return callFunction(o.getName(), parameters, tparameters, ctx);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		}
		catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(o, lastError, "Call failed - see details.");
	}

	private Object evaluateAsLVal(BCallFeature o, BExecutionContext ctx) throws Throwable {
		String featureName = o.getName();
		BExpression objExpr = o.getFuncExpr();
		Object lhs = objExpr == null
				? ctx.getValue(B3BackendConstants.B3BACKEND_THIS)
				: doEvaluate(objExpr, ctx);
		// for Ecore
		if(lhs instanceof EObject) {
			EObject eLhs = (EObject) lhs;
			EStructuralFeature feature = eLhs.eClass().getEStructuralFeature(featureName);
			if(feature == null)
				throw BackendHelper.createException(
					objExpr, "feature ''{0}'' is not a feature of the lhs expression", new Object[] { featureName });
			return eLhs.eGet(feature);
		}
		// use pojo reflection
		Pojo.FeatureLValue resultingLValue = new Pojo.FeatureLValue(lhs, featureName);
		Object result = null;
		try {
			if(resultingLValue.isGetable())
				result = resultingLValue.get();
		}
		catch(Throwable e) {
			throw BackendHelper.createException(
				objExpr, e, "failed to get feature ''{0}'' from lhs expression", new Object[] { featureName });
		}
		return result;

	}

}
