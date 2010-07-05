/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildCallOnDeclaredRequirement;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputCondition;
import org.eclipse.b3.build.BuilderInputContextDecorator;
import org.eclipse.b3.build.BuilderInputDecorator;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.EffectiveRequirementFacade;
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
public class EffectiveRequirementsIteratorProvider {
	private final PolymorphicDispatcher<Iterator<EffectiveRequirementFacade>> iteratorDispatcher = new PolymorphicDispatcher<Iterator<EffectiveRequirementFacade>>(
		"iterator", 2, 2, Collections.singletonList(this), new ErrorHandler<Iterator<EffectiveRequirementFacade>>() {
			public Iterator<EffectiveRequirementFacade> handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private static Iterator<EffectiveRequirementFacade> NULL_ITERATOR = new SingletonIterator<EffectiveRequirementFacade>(
		null);

	public Iterator<EffectiveRequirementFacade> doGetIterator(Object o, BExecutionContext ctx) {
		return iteratorDispatcher.invoke(o, ctx);
	}

	protected Iterator<EffectiveRequirementFacade> handleError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

	/**
	 * Leaf node holding a declaration to a new requirement.
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 */
	public Iterator<EffectiveRequirementFacade> iterator(BuildCallOnDeclaredRequirement o, BExecutionContext ctx) {
		EffectiveRequirementFacade erf = B3BuildFactory.eINSTANCE.createEffectiveRequirementFacade();
		erf.setContext(ctx);
		erf.setRequirement(o.getRequiredCapabilityDeclaration());
		return new SingletonIterator<EffectiveRequirementFacade>(erf);
	}

	public Iterator<EffectiveRequirementFacade> iterator(BuilderInputCondition o, BExecutionContext ctx)
			throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		Object r = evaluator.doEvaluate(o.getCondExpr(), ctx);
		if(r != Boolean.TRUE)
			return NULL_ITERATOR;
		return iterator((BuilderInputDecorator) o, ctx);
	}

	public Iterator<EffectiveRequirementFacade> iterator(BuilderInputContextDecorator o, BExecutionContext ctx)
			throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		BExecutionContext ctxToUse = evaluator.doGetInnerContext(o.getWithExpr(), ctx);
		return iterator((BuilderInputDecorator) o, ctxToUse);
	}

	/**
	 * For abstract decoration, adds the effective iterators from what it decorates.
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Iterator<EffectiveRequirementFacade> iterator(BuilderInputDecorator o, BExecutionContext ctx)
			throws Throwable {
		SerialIterator<EffectiveRequirementFacade> result = new SerialIterator<EffectiveRequirementFacade>();

		for(BuilderInput i : o.getBuilderInput())
			result.addIterator(doGetIterator(i, ctx));
		return result;
	}

	/**
	 * Returns the original's effective requirements if the wrapper is not InputAdviced ({@link BuilderWrapper#isInputAdvised()}.
	 * Returns and iterator over effective requirements. Applies the builder's default properties in
	 * a context before filter evaluation.
	 */
	public Iterator<EffectiveRequirementFacade> iterator(BuilderWrapper o, BExecutionContext ctx) throws Throwable {
		if(!o.isInputAdvised())
			return doGetIterator(o.getOriginal(), ctx);
		return iterator((IBuilder) o, ctx);
	}

	public Iterator<EffectiveRequirementFacade> iterator(IBuilder o, BExecutionContext ctx) throws Throwable {
		SerialIterator<EffectiveRequirementFacade> result = new SerialIterator<EffectiveRequirementFacade>();
		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = o.getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createInnerContext();
			defProp.evaluateDefaults(ctxToUse, true);
		}
		if(o.getInput() != null)
			result.addIterator(doGetIterator(o.getInput(), ctxToUse));
		return result;
	}

	public Iterator<EffectiveRequirementFacade> iterator(Object o, BExecutionContext ctx) {
		return NULL_ITERATOR;
	}

}
