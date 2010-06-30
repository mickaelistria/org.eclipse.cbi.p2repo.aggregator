/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.utils;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.util.Strings;

/**
 * Contains useful utilities when working with b3 language files.
 * 
 */
public class BeeLangUtils {
	// /**
	// * Returns the types of the parameters. Can reserve the 0 position in the array for use by the caller
	// * after the call completes. Exception is thrown if parameter types is not declared or inferable.
	// * All parameters are examined, and each exception is recorded in the thrown multi exception.
	// *
	// * @param expr
	// * @param reserveFirst
	// * @return
	// * @throws InferenceExceptions
	// */
	// public static Type[] asTypeArray(BParameterizedExpression expr, boolean reserveFirst) throws InferenceExceptions {
	// EList<BParameter> pList = expr.getParameterList().getParameters();
	// int i = reserveFirst
	// ? 1
	// : 0;
	// Type[] types = new Type[pList.size() + i];
	// B3BuildTypeProvider typer = new B3BuildTypeProvider();
	// ArrayList<InferenceException> exceptions = new ArrayList<InferenceException>();
	// for(BParameter p : pList) {
	// types[i] = typer.doGetInferredType(p);
	// if(types[i] == null)
	// try {
	// throw new InferenceException(
	// "The type of the parameter is not known or inferable.", p, B3backendPackage.BPARAMETER__EXPR);
	// }
	// catch(InferenceException e) {
	// exceptions.add(e);
	// }
	// i++;
	// }
	// if(exceptions.size() > 0)
	// throw new InferenceExceptions(exceptions);
	// return types;
	//
	// }

	/**
	 * Returns a human readable name/type for the closest named element e.g. function, builder or the global
	 * BeeModel.
	 * 
	 * @param expr
	 * @return A string that helps identify where an expression is located.
	 */
	public static String closestNamedElement(BExpression expr) {
		EObject e = expr;
		do {
			if(isExpressionContainer(e))
				return humanDescriptionOf(e);
			e = e.eContainer();
		} while(e != null);
		return "";

	}

	// /**
	// * Returns a list of IFunction having name as seen from the objectInScope. If java methods should be
	// * included, the referenceType must be set to a non null Type (i.e. the first parameter, or the lhs
	// * in a feature call).
	// *
	// * @param objectInScope
	// * @param name
	// * @param referenceType
	// * @return
	// */
	// public static List<IFunction> findEffectiveFunctions(EObject objectInScope, String name, Type referenceType) {
	// // is there a function or feature that provides the signature?
	// // find matching function candidates...
	// DeclarativeFuncScopeProvider funcScopeProvider = new DeclarativeFuncScopeProvider();
	// IScope funcScope = funcScopeProvider.doGetFuncScope(objectInScope);
	// List<IFunction> effective = new ArrayList<IFunction>();
	// for(IEObjectDescription e : funcScope.getAllContents()) {
	// if(!(name.equals(e.getName()) && e.getEObjectOrProxy() instanceof IFunction))
	// continue;
	// IFunction f = (IFunction) e.getEObjectOrProxy();
	// OVERLOADED: {
	// for(IFunction f1 : effective) {
	// if(TypeUtils.hasEqualSignature(f1, f))
	// break OVERLOADED;
	// }
	// effective.add(f);
	// }
	// }
	// if(referenceType != null) {
	// // find matching java methods, skip already overloaded
	// for(IFunction f : JavaToB3Helper.getNamedFunctions(TypeUtils.getRaw(referenceType), name)) {
	// OVERLOADED: {
	// for(IFunction f1 : effective) {
	// if(TypeUtils.hasEqualSignature(f1, f))
	// break OVERLOADED;
	// }
	// effective.add(f);
	// }
	// }
	// }
	// return effective;
	// }

	/**
	 * Returns the line number associated with the given EObject, or 0 if no line number information
	 * is found.
	 * 
	 * @param e
	 * @return line number of e, or 0 if not found.
	 */
	public static int getLineNumber(EObject e) {
		int lineNumber = 0;
		if(e != null) {
			NodeAdapter adapter = NodeUtil.getNodeAdapter(e);
			if(adapter != null) {
				CompositeNode node = adapter.getParserNode();
				if(node != null) {
					lineNumber = node.getTotalLine();
				}
			}
		}
		return lineNumber;

	}

	public static String humanDescriptionOf(EObject e) {
		if(e instanceof IBuilder)
			return "builder " + ((IBuilder) e).getName();
		if(e instanceof IFunction)
			return "function " + ((IFunction) e).getName();
		// TODO: Add more
		if(e instanceof BeeModel)
			return "b3 model";
		return "";
	}

	public static String humanFriendlyResourceURI(URI uri) {
		if(uri.isFile())
			return uri.toFileString();
		if(uri.isPlatform())
			return uri.toPlatformString(true);
		return uri.toString();
	}

	public static boolean isExpressionContainer(EObject o) {
		if(o instanceof IFunction && !Strings.isEmpty(((IFunction) o).getName()))
			return true;
		if(o instanceof BeeModel)
			return true;
		// TODO: add more (concerns)
		return false;
	}

	// /**
	// * Select the best matching function given the types of the parameters.
	// * The candidate list should not contain functions with identitical parameter types.
	// * Although the name of all functions should be equal, the name is required (since the list may be
	// * empty).
	// */
	// public static IFunction selectFunction(String name, List<IFunction> candidates, Type[] tparameters)
	// throws B3NoSuchFunctionException, B3NoSuchFunctionSignatureException, B3AmbiguousFunctionSignatureException {
	// if(Strings.isEmpty(name))
	// throw new IllegalArgumentException("Name can not be null or empty");
	// if(candidates == null || candidates.size() < 1)
	// throw new B3NoSuchFunctionException(name);
	// LinkedList<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> candidateFunctions =
	// TypeUtils.Candidate.findMostSpecificApplicableCandidates(
	// tparameters, new TypeUtils.GuardedFunctionCandidateSource(candidates));
	//
	// switch(candidateFunctions.size()) {
	// case 0: // no candidate function found
	// throw new B3NoSuchFunctionSignatureException(name, tparameters, candidates);
	// case 1: // one candidate function found == HAPPY
	// break;
	// default: // more than one candidate function found (the function call is ambiguous)
	// throw new B3AmbiguousFunctionSignatureException(name, tparameters);
	// }
	// return candidateFunctions.getFirst().getTarget();
	// }

}
