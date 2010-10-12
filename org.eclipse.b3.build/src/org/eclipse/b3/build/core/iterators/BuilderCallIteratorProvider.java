/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core.iterators;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.IB3Evaluator;
import org.eclipse.b3.backend.core.iterators.SerialIterator;
import org.eclipse.b3.backend.core.iterators.SingletonIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildCallOnSelectedRequirements;
import org.eclipse.b3.build.BuildCallSingle;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.BuilderCallFacade;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputCondition;
import org.eclipse.b3.build.BuilderInputContextDecorator;
import org.eclipse.b3.build.BuilderInputDecorator;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.EffectiveBuilderCallFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

import com.google.inject.Singleton;
import com.google.inject.internal.Lists;

/**
 * Iterates over effective builder calls - this means all combinations of required capability and builder with
 * contexts and filters applied. The returned facades contain all information needed to provide a call in the correct
 * context.
 */
@Singleton
public class BuilderCallIteratorProvider {
	private final PolymorphicDispatcher<Iterator<EffectiveBuilderCallFacade>> effectiveIteratorDispatcher = new PolymorphicDispatcher<Iterator<EffectiveBuilderCallFacade>>(
		"effectiveIterator", 2, 2, Collections.singletonList(this),
		new ErrorHandler<Iterator<EffectiveBuilderCallFacade>>() {
			public Iterator<EffectiveBuilderCallFacade> handle(Object[] params, Throwable e) {
				return handleEffectiveError(params, e);
			}
		});

	private final PolymorphicDispatcher<Iterator<BuilderCallFacade>> iteratorDispatcher = new PolymorphicDispatcher<Iterator<BuilderCallFacade>>(
		"iterator", 1, 1, Collections.singletonList(this), new ErrorHandler<Iterator<BuilderCallFacade>>() {
			public Iterator<BuilderCallFacade> handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private static Iterator<EffectiveBuilderCallFacade> EFFECTIVE_NULL_ITERATOR = new SingletonIterator<EffectiveBuilderCallFacade>(
		null);

	private static Iterator<BuilderCallFacade> NULL_ITERATOR = new SingletonIterator<BuilderCallFacade>(null);

	public Iterator<EffectiveBuilderCallFacade> doGetEffectiveIterator(Object o, BExecutionContext ctx) {
		return effectiveIteratorDispatcher.invoke(o, ctx);
	}

	public Iterator<BuilderCallFacade> doGetIterator(Object o) {
		return iteratorDispatcher.invoke(o);
	}

	/**
	 * Returns an effectiveIterator over calls to selected requirements in the build unit.
	 * The unit's effective facade is used (i.e. the requirements are filtered as declared before seen by
	 * the selection predicate). The same call (name and parameter values) are used in all calls.
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(BuildCallOnSelectedRequirements o,
			BExecutionContext ctx) throws Throwable {
		List<EffectiveBuilderCallFacade> result = Lists.newArrayList();
		BuildUnit unit = (BuildUnit) ctx.getValue(B3BuildConstants.B3_VAR_UNIT);

		// Get the Effective Unit Requirements
		for(EffectiveRequirementFacade uerf : unit.getEffectiveFacade(ctx).getUnitRequiredCapabilities()) {
			RequiredCapability candidate = uerf.getRequirement();
			CapabilityPredicate predicate = o.getRequiredPredicate();
			if(predicate.matches(candidate)) {
				EffectiveBuilderCallFacade ebc = B3BuildFactory.eINSTANCE.createEffectiveBuilderCallFacade();
				ebc.setContext(ctx);
				ebc.setRequiredCapability(candidate);
				ebc.setBuilderReference(o);
				result.add(ebc);
			}
		}
		return result.iterator();
	}

	/**
	 * Leaf node holding a reference or declaration to a requirement and builder (name and parameters).
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 */
	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(BuildCallSingle o, BExecutionContext ctx) {
		EffectiveBuilderCallFacade erf = B3BuildFactory.eINSTANCE.createEffectiveBuilderCallFacade();
		erf.setContext(ctx);
		erf.setRequiredCapability(o.getRequiredCapability());
		erf.setBuilderReference(o);
		return new SingletonIterator<EffectiveBuilderCallFacade>(erf);
	}

	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(BuilderInputCondition o, BExecutionContext ctx)
			throws Throwable {
		return (ctx.getInjector().getInstance(IB3Evaluator.class).doEvaluate(o.getCondExpr(), ctx) != Boolean.TRUE)
				? EFFECTIVE_NULL_ITERATOR
				: effectiveIterator((BuilderInputDecorator) o, ctx);
	}

	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(BuilderInputContextDecorator o, BExecutionContext ctx)
			throws Throwable {
		return effectiveIterator(
			(BuilderInputDecorator) o,
			ctx.getInjector().getInstance(IB3Evaluator.class).doGetInnerContext(o.getWithExpr(), ctx));
	}

	/**
	 * For abstract decoration, adds the effective iterators from what it decorates.
	 * 
	 * @param o
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(BuilderInputDecorator o, BExecutionContext ctx)
			throws Throwable {
		SerialIterator<EffectiveBuilderCallFacade> result = new SerialIterator<EffectiveBuilderCallFacade>();

		for(BuilderInput i : o.getBuilderInput())
			result.addIterator(doGetEffectiveIterator(i, ctx));
		return result;
	}

	public Iterator<BuilderCallFacade> effectiveIterator(IBuilder o) throws Throwable {
		if(o.getInput() == null)
			return NULL_ITERATOR;
		return doGetIterator(o.getInput());
	}

	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(IBuilder o, BExecutionContext ctx) throws Throwable {
		if(o.getInput() == null)
			return EFFECTIVE_NULL_ITERATOR;

		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = o.getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createInnerContext();
			ctx.getInjector().getInstance(IB3Evaluator.class).doEvaluateDefaults(defProp, ctxToUse, true);
			// defProp.evaluateDefaults(ctxToUse, true);
		}
		return doGetEffectiveIterator(o.getInput(), ctxToUse);
	}

	public Iterator<EffectiveBuilderCallFacade> effectiveIterator(Object o, BExecutionContext ctx) {
		return EFFECTIVE_NULL_ITERATOR;
	}

	public Iterator<BuilderCallFacade> iterator(BuildCallOnSelectedRequirements o) throws Throwable {
		// CAN NOT BE DONE STATICALLY AS THE EFFECTIVE UNIT IS UNKNOWN...
		// TODO: UNIT TYPE ALONE IS NOT ENOUGH TO KNOW ABOUT REQUIREMENTS
		return NULL_ITERATOR;
	}

	public Iterator<BuilderCallFacade> iterator(BuildCallSingle o) {
		BuilderCallFacade erf = B3BuildFactory.eINSTANCE.createBuilderCallFacade();
		erf.setRequiredCapability(o.getRequiredCapability());
		erf.setBuilderReference(o);
		return new SingletonIterator<BuilderCallFacade>(erf);
	}

	public Iterator<BuilderCallFacade> iterator(BuilderInputDecorator o, BExecutionContext ctx) throws Throwable {
		SerialIterator<BuilderCallFacade> result = new SerialIterator<BuilderCallFacade>();

		for(BuilderInput i : o.getBuilderInput())
			result.addIterator(doGetIterator(i));
		return result;
	}

	protected Iterator<EffectiveBuilderCallFacade> handleEffectiveError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

	protected Iterator<BuilderCallFacade> handleError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

}
