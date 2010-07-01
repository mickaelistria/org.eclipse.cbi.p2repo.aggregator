/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * An abstract declarative weaver implementation using polymorphic dispatching.
 * 
 */
public class DeclarativeB3Weaver implements IB3Weaver {
	private final PolymorphicDispatcher<Boolean> weaveDispatcher = new PolymorphicDispatcher<Boolean>(
		"weave", 3, 4, Collections.singletonList(this), new ErrorHandler<Boolean>() {
			public Boolean handle(Object[] params, Throwable e) {
				return handleWeavingError(params, e);
			}
		});

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.evaluator.IB3Weaver#doWeave(org.eclipse.b3.backend.evaluator.b3backend.BConcernContext, java.util.Iterator,
	 * org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 */
	@Override
	public boolean doWeave(BConcernContext concern, Iterator<?> candidateIterator, BExecutionContext ctx) {
		return weaveDispatcher.invoke(concern, candidateIterator, ctx);
	}

	/**
	 * Default impl throws UnsupportedOperationException.
	 */
	@Override
	public boolean doWeave(BConcernContext concern, Object candidate, BExecutionContext ctx) {
		return weaveDispatcher.invoke(concern, candidate, ctx);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.evaluator.IB3Weaver#doWeave(org.eclipse.b3.backend.evaluator.b3backend.BConcernContext, java.lang.Object,
	 * org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object)
	 */
	@Override
	public boolean doWeave(BConcernContext concern, Object candidate, BExecutionContext ctx, Object arg) {
		return weaveDispatcher.invoke(concern, candidate, ctx, arg);
	}

	protected Boolean handleWeavingError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return Boolean.FALSE;
		}
		return Exceptions.throwUncheckedException(e);
	}

	public Boolean weave(BConcernContext concern, Object candidate, BExecutionContext ctx) {
		throw new UnsupportedOperationException("Weaving not configured for concern: " + concern.getClass().getName());
	}

}
