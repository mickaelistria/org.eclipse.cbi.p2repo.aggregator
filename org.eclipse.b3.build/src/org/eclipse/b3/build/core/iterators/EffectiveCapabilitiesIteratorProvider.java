/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

import com.google.inject.Singleton;

/**
 * Iterates over effective requirements (i.e. requirements that contribute to a Unit's requirements).
 * This means that requirements that are referenced from builder input to unit are not included.
 * Effective also means that filters and context advice is evaluated to get the requirements.
 * 
 */
@Singleton
public class EffectiveCapabilitiesIteratorProvider {
	private final PolymorphicDispatcher<Iterator<EffectiveCapabilityFacade>> iteratorDispatcher = new PolymorphicDispatcher<Iterator<EffectiveCapabilityFacade>>(
		"iterator", 2, 2, Collections.singletonList(this), new ErrorHandler<Iterator<EffectiveCapabilityFacade>>() {
			public Iterator<EffectiveCapabilityFacade> handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private static Iterator<EffectiveCapabilityFacade> NULL_ITERATOR = new SingletonIterator<EffectiveCapabilityFacade>(
		null);

	public Iterator<EffectiveCapabilityFacade> doGetIterator(Object o, BExecutionContext ctx) {
		return iteratorDispatcher.invoke(o, ctx);
	}

	protected Iterator<EffectiveCapabilityFacade> handleError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

	/**
	 * Returns the original's effective (provided) capabilities if {@link BuilderWrapper#isProvidesAdvised()} returns false,
	 * otherwise the effective provided capabilities from this wrapper.
	 */
	public Iterator<EffectiveCapabilityFacade> iterator(BuilderWrapper o, BExecutionContext ctx) throws Throwable {
		if(!o.isProvidesAdvised())
			return doGetIterator(o.getOriginal(), ctx);

		return iterator((IBuilder) o, ctx);
	}

	public Iterator<EffectiveCapabilityFacade> iterator(IBuilder o, BExecutionContext ctx) throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		ArrayList<EffectiveCapabilityFacade> list = new ArrayList<EffectiveCapabilityFacade>();
		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = o.getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createOuterContext();
			evaluator.doEvaluateDefaults(defProp, ctxToUse, true);
		}
		for(Capability cap : o.getProvidedCapabilities()) {
			BExpression c = cap.getCondExpr();
			if(c != null) {
				Object include = evaluator.doEvaluate(c, ctxToUse);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}
			EffectiveCapabilityFacade facade = B3BuildFactory.eINSTANCE.createEffectiveCapabilityFacade();
			facade.setContext(ctxToUse);
			facade.setProvidedCapability(cap);
			list.add(facade);
		}
		return list.iterator();
	}

	// TODO: Add support for more types

	public Iterator<EffectiveCapabilityFacade> iterator(Object o, BExecutionContext ctx) {
		return NULL_ITERATOR;
	}

}
