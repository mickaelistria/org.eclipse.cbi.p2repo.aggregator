/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.b3.backend.core.exceptions.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.JavaToB3Helper;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.FunctionCandidateAdapterFactory;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.scoping.IFuncScopeProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;

/**
 * Contains useful utilities when working with b3 language files.
 * 
 */
@Singleton
public class FunctionUtils {
	// private static FunctionUtils instance;

	@Inject
	private static Injector injector;

	public static Type[] getParameterTypes(IFunction o) {
		B3FunctionType t = getSignature(o);
		return t.getParameterTypesArray();
	}

	// TODO: Temporary "getSignature" while moving functionality
	// Later, user inference to determine return type, and also use
	// inference to calculate parameter types (for lambdas where this is possible).
	//
	public static B3FunctionType getSignature(IFunction o) {
		if(injector == null)
			throw new IllegalStateException("FunctionUtils must be have instance initialized statically!!");

		return injector.getInstance(FunctionUtils.class).getInferredSignature(o);

	}

	@Inject
	private ITypeProvider typer;

	@Inject
	private IFuncScopeProvider funcScopeProvider;

	/**
	 * Returns the types of the parameters. Can reserve the 0 position in the array for use by the caller
	 * after the call completes. Exception is thrown if parameter types is not declared or can not be inferred.
	 * All parameters are examined, and each exception is recorded in the thrown multi-exception.
	 * 
	 * @param expr
	 * @param reserveFirst
	 * @return
	 * @throws InferenceExceptions
	 */
	public Type[] asTypeArray(BParameterizedExpression expr, boolean reserveFirst) throws InferenceExceptions {
		EList<BParameter> pList = expr.getParameterList().getParameters();
		int i = reserveFirst
				? 1
				: 0;
		Type[] types = new Type[pList.size() + i];
		ArrayList<InferenceException> exceptions = new ArrayList<InferenceException>();
		for(BParameter p : pList) {
			types[i] = typer.doGetInferredType(p);
			if(types[i] == null)
				try {
					throw new InferenceException(
						"The type of the parameter is not known or inferable.", p, B3backendPackage.BPARAMETER__EXPR);
				}
				catch(InferenceException e) {
					exceptions.add(e);
				}
			i++;
		}
		if(exceptions.size() > 0)
			throw new InferenceExceptions(exceptions);
		return types;

	}

	/**
	 * Returns a list of IFunction having name as seen from the objectInScope. If java methods should be
	 * included, the referenceType must be set to a non null Type (i.e. the first parameter, or the lhs
	 * in a feature call).
	 * 
	 * @param objectInScope
	 * @param name
	 * @param referenceType
	 * @return
	 */
	public List<IFunction> findEffectiveFunctions(EObject objectInScope, String name, Type referenceType) {
		// is there a function or feature that provides the signature?
		// find matching function candidates...
		IScope funcScope = funcScopeProvider.doGetFuncScope(objectInScope);
		List<IFunction> effective = new ArrayList<IFunction>();
		for(IEObjectDescription e : funcScope.getAllContents()) {
			if(!(name.equals(e.getName()) && e.getEObjectOrProxy() instanceof IFunction))
				continue;
			IFunction f = (IFunction) e.getEObjectOrProxy();
			OVERLOADED: {
				for(IFunction f1 : effective) {
					if(TypeUtils.hasEqualSignature(f1, f))
						break OVERLOADED;
				}
				effective.add(f);
			}
		}
		if(referenceType != null) {
			// find matching java methods, skip already overloaded
			for(IFunction f : JavaToB3Helper.getNamedFunctions(TypeUtils.getRaw(referenceType), name)) {
				OVERLOADED: {
					for(IFunction f1 : effective) {
						if(TypeUtils.hasEqualSignature(f1, f))
							break OVERLOADED;
					}
					effective.add(f);
				}
			}
		}
		return effective;
	}

	public B3FunctionType getInferredSignature(IFunction o) {
		return (B3FunctionType) typer.doGetInferredType(o);
	}

	public Type getReturnType(IFunction f, Type[] types) {
		// get the function signature.
		B3FunctionType t = (B3FunctionType) typer.doGetInferredType(f);
		BTypeCalculator tc = t.getTypeCalculator();
		if(tc == null)
			return t.getReturnType();
		return tc.getSignature(types).getReturnType();
	}

	/**
	 * Select a function (instance of static). Type parameters should have layout as for an instance
	 * call.
	 * 
	 * @param name
	 * @param candidates
	 * @param types
	 * @return
	 * @throws B3NoSuchFunctionException
	 * @throws B3NoSuchFunctionSignatureException
	 * @throws B3AmbiguousFunctionSignatureException
	 */
	public IFunction selectFunction(String name, List<IFunction> candidates, Type[] types)
			throws B3NoSuchFunctionException, B3NoSuchFunctionSignatureException, B3AmbiguousFunctionSignatureException {
		Exception originalException;
		try {
			return selectInstanceFunction(name, candidates, types);
		}
		// NOTE: B3NoSuchFunctionException is passed on - if name does not exist, it is not static either
		catch(B3NoSuchFunctionSignatureException e) {
			originalException = e;
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			originalException = e;
		}
		// Try static, but throw original exception for those that were caught earlier
		try {
			return selectStaticFunction(name, candidates, types);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			if(originalException != null && originalException instanceof B3NoSuchFunctionSignatureException)
				throw (B3NoSuchFunctionSignatureException) originalException;
			throw e;
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			if(originalException != null && originalException instanceof B3AmbiguousFunctionSignatureException)
				throw (B3AmbiguousFunctionSignatureException) originalException;
			throw e;
		}
	}

	/**
	 * Select the best matching function given the types of the parameters.
	 * The candidate list should not contain functions with identical parameter types.
	 * Although the name of all functions should be equal, the name is required (since the list may be
	 * empty).
	 */
	public IFunction selectInstanceFunction(String name, List<IFunction> candidates, Type[] tparameters)
			throws B3NoSuchFunctionException, B3NoSuchFunctionSignatureException, B3AmbiguousFunctionSignatureException {
		if(Strings.isEmpty(name))
			throw new IllegalArgumentException("Name can not be null or empty");
		if(candidates == null || candidates.size() < 1)
			throw new B3NoSuchFunctionException(name);
		LinkedList<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> candidateFunctions = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
			tparameters, new TypeUtils.GuardedFunctionCandidateSource(candidates));

		switch(candidateFunctions.size()) {
			case 0: // no candidate function found
				throw new B3NoSuchFunctionSignatureException(name, tparameters, candidates);
			case 1: // one candidate function found == HAPPY
				break;
			default: // more than one candidate function found (the function call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException(name, tparameters);
		}
		return candidateFunctions.getFirst().getTarget();
	}

	/**
	 * Selects a static function (using the same parameter input as selectFunction). The input should
	 * not contain a meta class at index 0 in types).
	 * 
	 * @param name
	 * @param candidates
	 * @param types
	 * @return
	 * @throws B3NoSuchFunctionException
	 * @throws B3NoSuchFunctionSignatureException
	 * @throws B3AmbiguousFunctionSignatureException
	 */
	public IFunction selectStaticFunction(String name, List<IFunction> candidates, Type[] types)
			throws B3NoSuchFunctionException, B3NoSuchFunctionSignatureException, B3AmbiguousFunctionSignatureException {
		if(types.length < 1)
			throw new IllegalArgumentException("Types array can not have 0 size.");
		B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
		metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
		Type[] newTypes = new Type[types.length + 1];
		System.arraycopy(types, 0, newTypes, 1, types.length);
		newTypes[0] = metaClass;

		return selectInstanceFunction(name, candidates, newTypes);
	}

	// /**
	// * Returns the names of the parameters. Can reserve the 0 position in the array for use by the caller
	// * after the call completes. Exception is thrown if parameter types is not declared or can not be inferred.
	// * All parameters are examined, and each exception is recorded in the thrown multi-exception.
	// *
	// * @param expr
	// * @param reserveFirst
	// * @return
	// * @throws InferenceExceptions
	// */
	// private String[] asNameArray(BParameterizedExpression expr, boolean reserveFirst) throws InferenceExceptions {
	// EList<BParameter> pList = expr.getParameterList().getParameters();
	// int i = reserveFirst
	// ? 1
	// : 0;
	// String[] names = new String[pList.size() + i];
	// ArrayList<InferenceException> exceptions = new ArrayList<InferenceException>();
	// for(BParameter p : pList) {
	// names[i] = null; // p.getName();
	// if(names[i] == null)
	// try {
	// throw new InferenceException(
	// "The name of the parameter is not known or inferable.", p, B3backendPackage.BPARAMETER__EXPR);
	// }
	// catch(InferenceException e) {
	// exceptions.add(e);
	// }
	// i++;
	// }
	// if(exceptions.size() > 0)
	// throw new InferenceExceptions(exceptions);
	// return names;
	//
	// }
}
