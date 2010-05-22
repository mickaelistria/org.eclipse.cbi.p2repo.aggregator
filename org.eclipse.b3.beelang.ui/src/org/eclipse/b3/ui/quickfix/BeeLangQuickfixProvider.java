package org.eclipse.b3.ui.quickfix;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.validation.B3BackendIssues;
import org.eclipse.b3.validation.B3BuildIssues;
import org.eclipse.b3.validation.BeeLangJavaValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
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
				BLiteralExpression expr = B3backendFactory.eINSTANCE.createBLiteralExpression();
				expr.setValue(ISSUE_REPOSITORY__NO_CONNECTION_FIX);
				repo.setAddress(expr);
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

	@Fix(B3BackendIssues.ISSUE__BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER)
	public void moveDefaultCaseLast(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue, "Move case", "Offending case is moved to the last position", "", new ISemanticModification() {

				public void apply(EObject element, IModificationContext context) throws Exception {
					BCase bcase = (BCase) element;
					BSwitchExpression switchExpr = (BSwitchExpression) bcase.eContainer();
					switchExpr.getCaseList().move(switchExpr.getCaseList().size() - 1, bcase);
				}
			});

	}

	@Fix(B3BuildIssues.ISSUE__BRANCH__HAS_TRANSFORMABLE_TIMESTAMP)
	public void transformDate(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue, "Convert to timestamp", "Converts the valid Date/Time to a fully specified time", null,
			new IModification() {
				public void apply(IModificationContext context) throws Exception {
					IXtextDocument xtextDocument = context.getXtextDocument();
					String dateString;
					dateString = xtextDocument.get(issue.getOffset(), issue.getLength());
					if(dateString.length() <= 2)
						return; // something is wrong, it should be at least ""
					dateString = dateString.substring(1, dateString.length() - 1);
					// try to convert and throw exception if it fails.
					Date date = DateFormat.getDateTimeInstance().parse(dateString);

					// reformat as timestamp using UTC
					SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssZ");
					fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
					dateString = '"' + fmt.format(date) + '"';

					xtextDocument.replace(issue.getOffset(), issue.getLength(), dateString);
				}
			});
	}
}
