/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.cbi.p2repo.util;

import java.net.URL;

import org.eclipse.core.runtime.IPath;

/**
  */
public class Trivial {
	public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];

	public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

	public static final String[] EMPTY_STRING_ARRAY = new String[0];

	public static final IPath[] EMPTY_PATH_ARRAY = new IPath[0];

	public static final URL[] EMPTY_URL_ARRAY = new URL[0];

	public static <T extends Comparable<T>> int compareAllowNull(T a, T b) {
		return a == null
				? (b == null
						? 0
						: -1)
				: (b == null
						? 1
						: a.compareTo(b));
	}

	public static boolean equalsAllowNull(Object a, Object b) {
		return a == null
				? b == null
				: a.equals(b);
	}

	/**
	 * If <code>str</code> is <code>null</code> or if the result of a trim on <code>str</code> is a
	 * string of zero length, then <code>null</code> is returned, otherwise, trimmed string is returned.
	 *
	 * @param str
	 *            The string to trim. Can be <code>null</code>.
	 * @return A trimmed string with a length greater then zero or <code>null</code>.
	 */
	public static String trim(String str) {
		if(str != null) {
			str = str.trim();
			if(str.length() == 0)
				str = null;
		}
		return str;
	}
}
