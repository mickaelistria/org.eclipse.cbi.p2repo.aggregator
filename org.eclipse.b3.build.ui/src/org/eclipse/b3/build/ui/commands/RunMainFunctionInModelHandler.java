/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 * Cloudsmith Inc. API and initial contribution.
 */
package org.eclipse.b3.build.ui.commands;

import java.util.List;

import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.operations.RunMainFunctionInModelOperation;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Runs the BeeModel associated with the current node in the ApplicationContext's
 * default variable (a List<ContentOutlineNode>), where the first selected element must be
 * a BeeModel.
 * 
 * 
 */
public class RunMainFunctionInModelHandler extends AbstractHandlerWithB3Console {

	@Override
	@SuppressWarnings("unchecked")
	public Object executeWithConsole(ExecutionEvent event) throws ExecutionException {
		b3out.println("b3: Running function main()...");

		EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();
		List<ContentOutlineNode> nodes = (List<ContentOutlineNode>) ctx.getDefaultVariable();
		ContentOutlineNode node = nodes.get(0);
		IStatus result = node.getEObjectHandle().readOnly(new IUnitOfWork<IStatus, EObject>() {
			// @Override
			public IStatus exec(EObject state) throws Exception {
				return new B3BuildEngine().run(new RunMainFunctionInModelOperation((BeeModel) state));
			}
		});
		RunMainFunctionInModelHandler.this.printResult(result, true);

		return null; // dictated by Handler API
	}
}
