/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.evaluator;

import java.util.Collections;
import java.util.ListIterator;

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.build.BuildCallOnSelectedRequirements;
import org.eclipse.b3.build.BuildCallSingle;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputDecorator;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

import com.google.inject.Singleton;

/**
 * Iterates over builder input and removes matching builder calls.
 * 
 */
@Singleton
public class BuilderInputRemover {
	private final PolymorphicDispatcher<Boolean> matchingDispatcher = new PolymorphicDispatcher<Boolean>(
		"removeMatching", 2, 2, Collections.singletonList(this), new ErrorHandler<Boolean>() {
			public Boolean handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	public Boolean doRemoveMatching(Object o, InputPredicate inputPredicate) {
		return matchingDispatcher.invoke(o, inputPredicate);
	}

	public Boolean removeMatching(BuildCallOnSelectedRequirements o, InputPredicate p) {
		// TODO: Match Predicates!
		throw new UnsupportedOperationException("RemoveMatching on BuildCallOnSelectedRequirements - TODO: implement");
	}

	public Boolean removeMatching(BuildCallSingle o, InputPredicate p) {
		BNamePredicate bp = p.getBuilderPredicate();
		CapabilityPredicate cp = p.getCapabilityPredicate();
		if(bp == null && cp == null)
			return Boolean.FALSE;
		if(bp == null || bp.matches(o.getBuilderName()))
			if(cp == null || cp.matches(o.getRequiredCapability()))
				return Boolean.TRUE;
		return Boolean.FALSE;
	}

	public Boolean removeMatching(BuilderInputDecorator o, InputPredicate p) {
		// removes matching children and returns true if it should be removed itself (i.e. when empty).
		ListIterator<BuilderInput> biLitor = o.getBuilderInput().listIterator();
		while(biLitor.hasNext()) {
			if(doRemoveMatching(biLitor.next(), p))
				biLitor.remove();
		}
		return o.getBuilderInput().size() == 0;
	}

	public Boolean removeMatching(Object o, InputPredicate p) {
		return false;
	}

	protected Boolean handleError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

}
