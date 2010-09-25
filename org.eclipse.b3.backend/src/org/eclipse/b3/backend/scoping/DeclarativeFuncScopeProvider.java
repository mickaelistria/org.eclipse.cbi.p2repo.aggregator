/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.scoping;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
public abstract class DeclarativeFuncScopeProvider implements IFuncScopeProvider {

	private final PolymorphicDispatcher<Object> scopeDispatcher = new PolymorphicDispatcher<Object>(
		"funcScope", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	public IScope doGetFuncScope(EObject container) {
		if(container == null)
			return null;
		return (IScope) scopeDispatcher.invoke(container);
	}

	public IScope doGetFuncScope(Resource r) {
		if(r == null)
			return null;
		return (IScope) scopeDispatcher.invoke(r);
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

	/**
	 * Safe create SimpleScope (if outer is null).
	 * 
	 * @param outer
	 * @param descriptions
	 * @return
	 */
	protected IScope createScope(IScope outer, Iterable<IEObjectDescription> descriptions) {
		return new SimpleScope(outer == null
				? IScope.NULLSCOPE
				: outer, descriptions);
	}

	protected Object handleError(Object[] params, Throwable e) {
		// TODO: don't know how this is supposed to work...
		//
		return Exceptions.throwUncheckedException(e);
	}
}
