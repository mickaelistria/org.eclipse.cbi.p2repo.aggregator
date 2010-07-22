/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import com.google.inject.ImplementedBy;

/**
 * Evaluates b3 expressions.
 */
@ImplementedBy(B3BackendEvaluator.class)
public interface IB3Evaluator {

	public Object callFunction(String functionName, Object[] params, Type[] types, BExecutionContext ctx)
			throws Throwable;

	/**
	 * Perform a call to a callable element. Creates a new context where parameter names are bound to parameter values.
	 * 
	 * @param element
	 * @param parameters
	 * @param parameterTypes
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Object doCall(Object element, Object[] parameters, Type[] parameterTypes, BExecutionContext ctx)
			throws Throwable;

	/**
	 * Performs a call to a callable element. Optionally creates a new context where parameter names are bound to
	 * parameter values.
	 * 
	 * @param element
	 * @param parameters
	 * @param parameterTypes
	 * @param ctx
	 * @param prepareContext
	 * @return
	 * @throws Throwable
	 */
	public Object doCall(Object element, Object[] parameters, Type[] parameterTypes, BExecutionContext ctx,
			boolean prepareContext) throws Throwable;

	public Object doDefine(Object element, BExecutionContext ctx) throws Throwable;

	public Object doDefine(Object element, BExecutionContext ctx, boolean isWeaving) throws Throwable;

	/**
	 * Evaluates an object in the given context.
	 * 
	 * @param element
	 * @param ctx
	 * @return the result of the evaluation.
	 * @throws Throwable
	 */
	public Object doEvaluate(Object element, BExecutionContext ctx) throws Throwable;

	/**
	 * Evaluates property set related objects "the default way" in the given context.
	 * 
	 * @param element
	 * @param ctx
	 * @return the result of the evaluation.
	 */
	public Object doEvaluateDefaults(Object element, BExecutionContext ctx, boolean allVisible) throws Throwable;

	/**
	 * Constructs an inside context and evaluates the element in this context. The context is returned.
	 * (Used for special elements that provide advice to some inner elements).
	 * 
	 * @param element
	 *            - the element that defines the context
	 * @param ctx
	 *            - the context of the defining element
	 * @return a context representing the evaluated internal context of the element
	 */
	public BExecutionContext doGetInnerContext(Object element, BExecutionContext ctx) throws Throwable;

	// TODO: for completeness, add "isLvalExpression", and "isDefaultExpression" to flag if
	// lValue and doEvaluateDefaults are possible.

	/**
	 * Evaluates the given element in the given context and returns an LValue (assignable "left" value).
	 * Should only be applied to elements that supports being a "lValue".
	 * 
	 * @param element
	 * @param ctx
	 * @return the result of the evaluation.
	 */
	public LValue doLValue(Object element, BExecutionContext ctx) throws Throwable;

	public String[] doParameterNames(Object element);

}
