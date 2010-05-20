/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.validation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Marker exception for syntax errors
 * 
 */
public class FixableTimestampException extends Exception {

	private String dateFormat;

	private static final long serialVersionUID = 1L;

	public FixableTimestampException() {
		DateFormat fmt = DateFormat.getDateTimeInstance();
		dateFormat = (fmt instanceof SimpleDateFormat)
				? ((SimpleDateFormat) fmt).toLocalizedPattern()
				: "";
	}

	public FixableTimestampException(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDateFormat() {
		return dateFormat;
	}

}
