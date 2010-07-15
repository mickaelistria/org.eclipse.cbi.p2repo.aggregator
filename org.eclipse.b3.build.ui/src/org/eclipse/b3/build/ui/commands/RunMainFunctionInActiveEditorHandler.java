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
import org.eclipse.b3.build.operations.RunFunctionInResourceOperation;
import org.eclipse.b3.build.ui.Activator;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

/**
 * Runs the BeeModel associated with the current editor (if it is an XtextEditor and
 * has b3 content - i.e. a BeeModel).
 */
public class RunMainFunctionInActiveEditorHandler extends AbstractHandlerWithDialog {

	@Override
	public IStatus executeWithDialogSupport(ExecutionEvent event) throws ExecutionException {

		EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();

		Object editor = ctx.getVariable("activeEditor");
		if(editor == null || !(editor instanceof ExtLinkedXtextEditor)) {
			return new Status(
				IStatus.ERROR, Activator.PLUGIN_ID,
				"Handler invoked on wrong type of editor: RunMainFunctionInActiveEditorHandler");
		}
		ExtLinkedXtextEditor b3Editor = (ExtLinkedXtextEditor) editor;
		IXtextDocument xtextDocument = XtextDocumentUtil.get(b3Editor);
		if(xtextDocument == null) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No b3 document found in current editor.");
		}
		IStatus result = xtextDocument.readOnly(new IUnitOfWork<IStatus, XtextResource>() {
			// @Override
			public IStatus exec(XtextResource state) throws Exception {
				return new B3BuildEngine().run(new RunFunctionInResourceOperation(state));
			}
		});
		return result;
		// B3MessageDialog.openQuestion(
		// HandlerUtil.getActiveShell(event), "Operation failed...", "message", result.getException(), 0);
		// This dialog is quite useless, but it does not require the IDE.
		// ErrorDialog.openError(HandlerUtil.getActiveShell(event), "Operation failed...", null, result, IStatus.OK |
		// IStatus.CANCEL | IStatus.ERROR | IStatus.WARNING | IStatus.INFO);

		// RunMainFunctionInActiveEditorHandler.this.printResult(result, true);

		// return null; // dictated by Handler API
	}
}
