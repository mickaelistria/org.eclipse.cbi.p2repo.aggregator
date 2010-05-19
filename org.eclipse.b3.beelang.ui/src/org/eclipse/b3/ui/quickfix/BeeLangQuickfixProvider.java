package org.eclipse.b3.ui.quickfix;

import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.validation.BeeLangJavaValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class BeeLangQuickfixProvider extends DefaultQuickfixProvider {
	private final static String ISSUE_REPOSITORY__NO_CONNECTION_FIX = "http://abc.org";

	/**
	 * Inserts a "remote = <URI>" into a Repository (using semantic insertion).
	 * 
	 * @param issue
	 * @param acceptor
	 */
	@Fix(BeeLangJavaValidator.ISSUE_REPOSITORY__NO_CONNECTION)
	public void insertRemoteURI(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Insert connection address", "connection : \"" + ISSUE_REPOSITORY__NO_CONNECTION_FIX +
				"\"", "", new ISemanticModification() {

			public void apply(EObject element, IModificationContext context) throws Exception {
				Repository repo = (Repository) element;
				repo.setAddress(ISSUE_REPOSITORY__NO_CONNECTION_FIX);
			}
		});
	}
	// @Fix(MyJavaValidator.INVALID_TYPE_NAME)
	// public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
	// acceptor.accept(issue, "Capitalize name", "Capitalize name of type", "upcase.png", new IModification() {
	// public void apply(IModificationContext context) throws BadLocationException {
	// IXtextDocument xtextDocument = context.getXtextDocument();
	// String firstLetter = xtextDocument.get(issue.getOffset(), 1);
	// xtextDocument.replace(issue.getOffset(), 1, Strings.toFirstUpper(firstLetter));
	// }
	// });
	// }

}
