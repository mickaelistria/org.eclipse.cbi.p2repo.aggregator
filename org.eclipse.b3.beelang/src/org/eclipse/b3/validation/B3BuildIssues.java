/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import static org.eclipse.b3.build.build.util.B3BuildValidator.BRANCH__HAS_EXPRESSION_TIMESTAMP;
import static org.eclipse.b3.build.build.util.B3BuildValidator.BRANCH__HAS_INVALID_TIMESTAMP;
import static org.eclipse.b3.build.build.util.B3BuildValidator.BRANCH__HAS_TRANSFORMABLE_TIMESTAMP;
import static org.eclipse.b3.build.build.util.B3BuildValidator.BRANCH__HAS_VALID_STATE;
import static org.eclipse.b3.build.build.util.B3BuildValidator.DIAGNOSTIC_SOURCE;

import org.eclipse.b3.validation.BeeLangDiagnosticsConverter.IModelDiagnosticsConverterHelper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

/**
 * Translates EMF diagnostic codes to strings in a type safe way.
 * Gets specialized messages for the B3Build Model Validation.
 * 
 */
public class B3BuildIssues implements IModelDiagnosticsConverterHelper {
	public static B3BuildIssues instance = new B3BuildIssues();

	public static final String PREFIX = DIAGNOSTIC_SOURCE + "__";

	// repeat this formula for every issue that should have a safe quick fix id
	public static final String ISSUE__BUILD_BRANCH__HAS_VALID_STATE = PREFIX + BRANCH__HAS_VALID_STATE;

	public static final String ISSUE__BRANCH__HAS_EXPRESSION_TIMESTAMP = PREFIX + BRANCH__HAS_EXPRESSION_TIMESTAMP;

	public static final String ISSUE__BRANCH__HAS_TRANSFORMABLE_TIMESTAMP = PREFIX +
			BRANCH__HAS_TRANSFORMABLE_TIMESTAMP;

	public static final String ISSUE__BRANCH__BRANCH__HAS_INVALID_TIMESTAMP = PREFIX + BRANCH__HAS_INVALID_TIMESTAMP;

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
			case BRANCH__HAS_VALID_STATE: // TODO: change the code for latest with details
				return createResult(source, code, "No branch point detail allowed when type is 'latest'");
			case BRANCH__HAS_EXPRESSION_TIMESTAMP:
				return createResult(source, code, "Can not be validated until runtime");
			case BRANCH__HAS_INVALID_TIMESTAMP:
				return createResult(source, code, "Has invalid timestamp format or data type");
			case BRANCH__HAS_TRANSFORMABLE_TIMESTAMP:
				return createResult(source, code, "Date/Time is not in valid timestamp format");
		}
		return createResult(source, code, defaultMessage);
	}
}
