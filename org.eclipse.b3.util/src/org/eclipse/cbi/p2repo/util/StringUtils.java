/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.cbi.p2repo.util;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class StringUtils {
	public static String trimmedOrNull(String str) {
		if(str == null)
			return null;

		str = str.trim();
		if(str.length() == 0)
			return null;

		return str;
	}

	public static String trimRight(String str) {
		if(str == null)
			return null;

		int pos = str.length();
		while(pos > 0 && Character.isWhitespace(str.charAt(pos - 1)))
			pos--;

		return str.substring(0, pos);
	}
}
