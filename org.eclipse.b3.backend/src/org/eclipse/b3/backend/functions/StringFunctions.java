package org.eclipse.b3.backend.functions;

import org.eclipse.b3.backend.core.B3Backend;

/**
 * This is a set of standard functions for the b3 backend that deals
 * with string operations (functions that are not called as methods
 * on String).
 */
public class StringFunctions {

	@B3Backend(funcNames = { "+" })
	public static String add(Number aNumber, String aString) {
		return add(aNumber.toString(), aString);
	}

	@B3Backend(funcNames = { "+" })
	public static String add(String aString, Number aNumber) {
		return add(aString, aNumber.toString());
	}

	@B3Backend(funcNames = { "+" })
	public static String add(String aString, String concatenatedString) {
		return aString + concatenatedString;
	}

	@B3Backend(funcNames = { "[]" })
	public static String at(String aString, Number charIndex) {
		int index = charIndex.intValue();
		return aString.substring(index, index + 1);
	}
}
