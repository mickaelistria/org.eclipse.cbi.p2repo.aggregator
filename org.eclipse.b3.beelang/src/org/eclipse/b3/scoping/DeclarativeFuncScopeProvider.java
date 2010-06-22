/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.engine.B3BuildEngineResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * Provides function scopes for a containment of expressions.
 * 
 * TODO: improve performance by not creating iterable objects of descriptions from arrays,
 * can just iterate over
 * 
 */
public class DeclarativeFuncScopeProvider {

	private final PolymorphicDispatcher<Object> scopeDispatcher = new PolymorphicDispatcher<Object>(
		"funcScope", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	/**
	 * Safe create SimpleScope (if outer is null).
	 * 
	 * @param outer
	 * @param descriptions
	 * @return
	 */
	private IScope createScope(IScope outer, Iterable<IEObjectDescription> descriptions) {
		return new SimpleScope(outer == null
				? SimpleScope.NULLSCOPE
				: outer, descriptions);
	}

	public IScope doGetFuncScope(B3BuildEngineResource r) {
		if(r == null)
			return null;
		return (IScope) scopeDispatcher.invoke(r);
	}

	public IScope doGetFuncScope(EObject container) {
		if(container == null)
			return null;
		return (IScope) scopeDispatcher.invoke(container);
	}

	IScope funcScope(B3BuildEngineResource r) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		// filter out functions that can not be called directly (i.e. '+' '-' etc).
		//
		Pattern pID = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]*");
		for(Map.Entry<String, IFunction> entry : r.getFunctions().entrySet()) {
			if(pID.matcher(entry.getKey()).matches())
				result.add(new EObjectDescription(entry.getKey(), entry.getValue(), null));
		}
		if(result.size() < 1)
			return null; // did not find any functions with ID names, and there are no more outer scopes
		return createScope(null, result);
	}

	IScope funcScope(BeeModel container) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();

		for(IFunction func : container.getFunctions())
			result.add(new EObjectDescription(func.getName(), func, null));

		if(result.size() < 1)
			return doGetFuncScope(container.eContainer());

		URI uri = URI.createURI(B3BuildConstants.B3ENGINE_MODEL_URI);
		B3BuildEngineResource r = (B3BuildEngineResource) container.eResource().getResourceSet().getResource(uri, false);

		return createScope(doGetFuncScope(r), result);
	}

	IScope funcScope(BFunctionContainer container) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();

		for(IFunction func : container.getFunctions())
			result.add(new EObjectDescription(func.getName(), func, null));

		if(result.size() < 1)
			return doGetFuncScope(container.eContainer());
		return createScope(doGetFuncScope(container.eContainer()), result);
	}

	IScope funcScope(BWithExpression container) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		IScope outermost = null;
		for(BConcern c : container.getConcerns()) {
			// iterator in supermost order
			//
			Iterator<BConcernContext> itor = c.getConcernContextIterator();
			while(itor.hasNext()) {
				BConcernContext cc = itor.next();
				for(IFunction func : cc.getFunctions())
					result.add(new EObjectDescription(func.getName(), func, null));
				if(result.size() < 1)
					continue;
				if(outermost == null)
					outermost = createScope(doGetFuncScope(container.eContainer()), result);
				else
					outermost = createScope(outermost, result);
				// clear for next
				result = new ArrayList<IEObjectDescription>();
			}

			for(IFunction func : c.getFunctions())
				result.add(new EObjectDescription(func.getName(), func, null));
			if(result.size() > 0) {
				if(outermost == null)
					outermost = createScope(doGetFuncScope(container.eContainer()), result);
				else
					outermost = createScope(outermost, result);
			}
		}
		return outermost != null
				? outermost
				: doGetFuncScope(container.eContainer());
	}

	/**
	 * Default - a container that does not introduce functions simply continues the search in its parent.
	 * 
	 * @param container
	 * @param contained
	 * @return
	 */
	public IScope funcScope(EObject container) {
		if(container == null)
			return null;
		return doGetFuncScope(container.eContainer());
	}

	public IScope funcScope(Object o) {
		return null;
	}

	protected Object handleError(Object[] params, Throwable e) {
		// TODO: don't know how this is supposed to work...
		//
		return Exceptions.throwUncheckedException(e);
	}

	// IScope varScope(BVariableExpression varExpr) {
	// IScope scope = doGetVarScope(varExpr.eContainer(), varExpr);
	// if(scope == null)
	// return SimpleScope.NULLSCOPE;
	// return scope;
	// }

	// /**
	// * Picks the "resource" variable from the engine resource
	// * (TODO: Maybe pick functions in similar way).
	// * @param container
	// * @param contained
	// * @return
	// */
	// IScope varScope(UnitProvider container, EObject contained) {
	// URI uri = URI.createURI(B3BuildConstants.B3ENGINE_MODEL_URI);
	// Resource r = container.eResource().getResourceSet().getResource(uri, false);
	// BDefValue req = ((B3BuildEngineResource) r).getVarRequest();
	// ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
	// result.add(new EObjectDescription(req.getName(), req, null));
	// return createScope(doGetVarScope(container.eContainer(), container), result);
	// }
}
