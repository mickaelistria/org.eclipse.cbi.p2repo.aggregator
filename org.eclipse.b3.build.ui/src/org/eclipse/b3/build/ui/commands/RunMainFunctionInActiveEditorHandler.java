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

import org.eclipse.b3.beelang.ui.xtext.linked.ExtLinkedXtextEditor;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.operations.RunMainFunctionInResourceOperation;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Runs the BeeModel associated with the current editor (if it is an XtextEditor and
 * has b3 content - i.e. a BeeModel).
 */
public class RunMainFunctionInActiveEditorHandler extends AbstractHandlerWithB3Console {

	@Override
	public Object executeWithConsole(ExecutionEvent event) throws ExecutionException {
		b3out.println("b3: Running function main()...");

		EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();

		Object editor = ctx.getVariable("activeEditor");
		if(editor == null || !(editor instanceof ExtLinkedXtextEditor)) {
			b3err.println("Handler invoked on wrong type of editor: RunMainFunctionInActiveEditorHandler");
			return null;
		}
		ExtLinkedXtextEditor b3Editor = (ExtLinkedXtextEditor) editor;
		IXtextDocument xtextDocument = XtextDocumentUtil.get(b3Editor);
		if(xtextDocument == null) {
			b3err.println("No b3 document found in current editor.");
			return null;
		}
		IStatus result = xtextDocument.readOnly(new IUnitOfWork<IStatus, XtextResource>() {
			// @Override
			public IStatus exec(XtextResource state) throws Exception {
				return new B3BuildEngine().run(new RunMainFunctionInResourceOperation(state));
			}
		});
		RunMainFunctionInActiveEditorHandler.this.printResult(result, true);

		return null; // dictated by Handler API
	}
}
