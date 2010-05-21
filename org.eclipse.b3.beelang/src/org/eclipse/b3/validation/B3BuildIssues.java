/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import static org.eclipse.b3.build.build.util.B3BuildValidator.BRANCH__HAS_VALID_STATE;
import static org.eclipse.b3.build.build.util.B3BuildValidator.DIAGNOSTIC_SOURCE;

import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

/**
 * Translates EMF diagnostic codes to strings in a type safe way.
 * Gets specialized messages for the B3Build Model Validation.
 * 
 */
public class B3BuildIssues {
	// repeat this formula for every issue that should have a safe quick fix id
	public static final String ISSUE_BUILD_BRANCH__HAS_VALID_STATE = convertSourceToIssueId(
		DIAGNOSTIC_SOURCE, BRANCH__HAS_VALID_STATE);

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
	public static Pair<String, String> getIdAndMessage(String source, int code, String defaultMessage) {
		switch(code) {
			// Add message translation as needed
			case BRANCH__HAS_VALID_STATE:
				return createResult(source, code, "No branch point detail allowed when type is 'latest'");
		}
		return createResult(source, code, defaultMessage);
	}
}
