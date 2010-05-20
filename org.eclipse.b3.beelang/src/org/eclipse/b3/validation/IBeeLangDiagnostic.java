/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

/**
 * Diagnostic codes for fixable errors
 * 
 */
public interface IBeeLangDiagnostic {
	public static final String ISSUE_REPOSITORY__NO_CONNECTION = "No Connection URI";

	public static final String ISSUE_REPO_OPTION__INVALID_OPTION = "Invalid Option";

	public static final String ISSUE_BUILD_UNIT__MULTIPLE_RESOLUTIONS = "Multiple resolutions";

	public static final String ISSUE_BEEMODEL__MULTIPLE_RESOLUTIONS = "Multiple resolutions";

	public static final String ISSUE_TIMESTAMP__NON_UTC = "Not UTC";

}
