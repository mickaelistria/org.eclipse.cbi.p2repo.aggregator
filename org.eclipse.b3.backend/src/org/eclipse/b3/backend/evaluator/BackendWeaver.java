/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.datatypes.TypePattern;
import org.eclipse.b3.backend.core.datatypes.TypePattern.Matcher;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.emf.common.util.EList;

/**
 * Weaver for backend elements.
 * 
 */
public class BackendWeaver extends DeclarativeB3Weaver {

	public Boolean weave(BFunctionConcernContext theFunctionConcern, IFunction candidate, BExecutionContext ctx)
			throws B3EngineException {
		return weave(theFunctionConcern, candidate, ctx, TypePattern.compile(theFunctionConcern.getParameters()));
	}

	public Boolean weave(BFunctionConcernContext theFunctionConcern, IFunction candidate, BExecutionContext ctx,
			TypePattern functionTypePattern) throws B3EngineException {
		if(!theFunctionConcern.getNamePredicate().matches((candidate).getName()))
			return false;
		return weaveIfParametersMatch(theFunctionConcern, candidate, ctx, functionTypePattern);
	}

	public Boolean weave(BFunctionConcernContext theFunctionConcern, Iterator<IFunction> functions,
			BExecutionContext ctx) {
		TypePattern functionTypePattern = TypePattern.compile(theFunctionConcern.getParameters());
		boolean woven = false;
		while(functions.hasNext())
			woven = doWeave(theFunctionConcern, functions.next(), ctx, functionTypePattern) || woven;
		return woven;
	}

	private boolean weaveIfParametersMatch(BFunctionConcernContext theFunctionConcern, IFunction f,
			BExecutionContext ctx, TypePattern functionTypePattern) throws B3EngineException {
		// TODO: FUNCTION EFFECTIVE PARAMETERS
		Matcher matcher = functionTypePattern.match(FunctionUtils.getParameterTypes(f));
		if(theFunctionConcern.isMatchParameters() && !matcher.isMatch())
			return false;

		// create a map of parameter name in advise and parameter name in matched function
		Map<String, String> nameMap = new HashMap<String, String>();
		EList<BParameterPredicate> plist = theFunctionConcern.getParameters(); // i.e. predicates
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
		wrapper.setAroundExpr(theFunctionConcern.getFuncExpr());
		wrapper.setParameterMap(nameMap);
		// if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
		if(theFunctionConcern.isVarArgs() && ((pName = plist.get(plist.size() - 1).getName()) != null))
			wrapper.setVarargsName(pName);
		ctx.defineFunction(wrapper);
		return true;
	}

}
