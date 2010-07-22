/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Provides weaving of elements as defined by concerns.
 * 
 */
public interface IB3Weaver {

	/**
	 * Weaves all candidates in candidateIterator that should be woven as given by the concern.
	 * 
	 * @param concern
	 * @param candidateIterator
	 * @param ctx
	 * @return
	 */
	public boolean doWeave(BConcernContext concern, Iterator<?> candidateIterator, BExecutionContext ctx);

	/**
	 * Weaves one candidate if it should be woven as given by the concern
	 * 
	 * @param concern
	 * @param candidate
	 * @param ctx
	 * @return
	 */
	public boolean doWeave(BConcernContext concern, Object candidate, BExecutionContext ctx);

	/**
	 * Weaves one candidate if it should be woven as given by the concern, and the argument (specific to
	 * the type of concern).
	 * 
	 * @param concern
	 * @param candidate
	 * @param ctx
	 * @param arg
	 *            - argument specific to the type of concern
	 * @return
	 */
	public boolean doWeave(BConcernContext concern, Object candidate, BExecutionContext ctx, Object arg);

}
