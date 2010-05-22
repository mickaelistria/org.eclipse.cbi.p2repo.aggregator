/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import org.eclipse.b3.backend.evaluator.b3backend.util.B3backendValidator;
import org.eclipse.b3.build.build.util.B3BuildValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Triple;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator.DiagnosticImpl;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.IDiagnosticConverter;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.Issue.IssueImpl;
import org.eclipse.xtext.validation.Issue.Severity;

/**
 * Translates model validation diagnostic messages into meaningful messages relating to the b3 DSL.
 * 
 */
public class BeeLangDiagnosticsConverter extends DiagnosticConverterImpl {
	public static interface IModelDiagnosticsConverterHelper {
		public Pair<String, String> getIdAndMessage(String source, int code, String defaultMessage);
	}

	public void convertB3BackendValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
			IDiagnosticConverter.Acceptor acceptor) {
		convertModelValidatorDiagnostic(B3BackendIssues.instance, diagnostic, acceptor);
	}

	public void convertB3BuildValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
			IDiagnosticConverter.Acceptor acceptor) {
		convertModelValidatorDiagnostic(B3BuildIssues.instance, diagnostic, acceptor);
	}

	private void convertModelValidatorDiagnostic(IModelDiagnosticsConverterHelper helper,
			org.eclipse.emf.common.util.Diagnostic diagnostic, IDiagnosticConverter.Acceptor acceptor) {
		IssueImpl issue = convertToIssue(diagnostic, acceptor);

		Pair<String, String> info = helper.getIdAndMessage(
			diagnostic.getSource(), diagnostic.getCode(), diagnostic.getMessage());
		issue.setCode(info.getFirst());
		issue.setMessage(info.getSecond());
		// Issue uses String[] for data, EMF has Object[], and typically passes the instance
		// and feature - these are already converted to members in the issue
		acceptor.accept(issue);
	}

	/**
	 * Converts everything except message and code/data.
	 * 
	 * @param diagnostic
	 * @param acceptor
	 * @return a configured IssueImpl
	 */
	protected IssueImpl convertToIssue(org.eclipse.emf.common.util.Diagnostic diagnostic,
			IDiagnosticConverter.Acceptor acceptor) {
		IssueImpl issue = new Issue.IssueImpl();
		issue.setSeverity(Severity.ERROR);
		switch(diagnostic.getSeverity()) {
			case org.eclipse.emf.common.util.Diagnostic.WARNING:
				issue.setSeverity(Severity.WARNING);
				break;
			case org.eclipse.emf.common.util.Diagnostic.INFO:
				issue.setSeverity(Severity.INFO);
				break;
		}
		Triple<Integer, Integer, Integer> locationData = getLocationData(diagnostic);
		if(locationData != null) {
			issue.setLineNumber(locationData.getFirst());
			issue.setOffset(locationData.getSecond());
			issue.setLength(locationData.getThird() - issue.getOffset());
		}
		final EObject causer = getCauser(diagnostic);
		if(causer != null)
			issue.setUriToProblem(EcoreUtil.getURI(causer));
		if(diagnostic instanceof DiagnosticImpl) {
			DiagnosticImpl diagnosticImpl = (DiagnosticImpl) diagnostic;
			issue.setType(diagnosticImpl.getCheckType());
			issue.setCode(diagnosticImpl.getIssueCode());
			issue.setData(diagnosticImpl.getIssueData());
		}
		else {
			// default to FAST
			issue.setType(CheckType.FAST);
		}
		return issue;
	}

	@Override
	public void convertValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
			IDiagnosticConverter.Acceptor acceptor) {

		if(diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.OK)
			return;

		// TODO: add the same for b3backend validation source
		if(diagnostic.getSource().equals(B3BuildValidator.DIAGNOSTIC_SOURCE))
			convertB3BuildValidatorDiagnostic(diagnostic, acceptor);
		else if(diagnostic.getSource().equals(B3backendValidator.DIAGNOSTIC_SOURCE))
			convertB3BackendValidatorDiagnostic(diagnostic, acceptor);
		else
			super.convertValidatorDiagnostic(diagnostic, acceptor);
	}

}
