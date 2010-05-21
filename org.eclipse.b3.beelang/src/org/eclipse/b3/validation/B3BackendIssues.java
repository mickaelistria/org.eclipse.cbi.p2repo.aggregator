/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import static org.eclipse.b3.backend.evaluator.b3backend.util.B3backendValidator.BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE;
import static org.eclipse.b3.backend.evaluator.b3backend.util.B3backendValidator.BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER;
import static org.eclipse.b3.backend.evaluator.b3backend.util.B3backendValidator.DIAGNOSTIC_SOURCE;

import org.eclipse.b3.validation.BeeLangDiagnosticsConverter.IModelDiagnosticsConverterHelper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

/**
 * Translates EMF diagnostic codes to strings in a type safe way.
 * Gets specialized messages for the B3Backend Model Validation.
 * 
 */
public class B3BackendIssues implements IModelDiagnosticsConverterHelper {

	public static B3BackendIssues instance = new B3BackendIssues();

	public static final String PREFIX = DIAGNOSTIC_SOURCE + "__";

	// repeat this formula for every issue that should have a safe quick fix id
	public static final String ISSUE__BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE = PREFIX +
			BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE;

	public static final String ISSUE__BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER = PREFIX +
			BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER;

	public static String convertSourceToIssueId(String source, int code) {
		return source + "__" + Integer.toString(code);
	}

	private static Pair<String, String> createResult(String source, int code, String message) {
		return Tuples.create(convertSourceToIssueId(source, code), message);
	}

	/**
	 * Returns Pair with first=IssueID and second=Message
	 * 
	 * @param source
	 * @param code
	 * @param defaultMessage
	 * @return
	 */
	public Pair<String, String> getIdAndMessage(String source, int code, String defaultMessage) {
		switch(code) {
			// Add message translation as needed
			case BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE:
				return createResult(source, code, "Unreachable case");
			case BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER:
				return createResult(source, code, "A 'default:' or 'case _:' must be placed last.");
		}
		return createResult(source, code, defaultMessage);
	}
}
