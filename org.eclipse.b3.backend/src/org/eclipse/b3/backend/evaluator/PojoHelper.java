/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import com.google.inject.internal.Lists;

/**
 * Helper class for Pojos
 * 
 */
public class PojoHelper {
	/**
	 * Returns a list of public features (that are at least get-able).
	 * 
	 * @param clazz
	 * @return
	 */
	public static List<PojoFeature> getFeatures(Class<?> clazz) {
		List<PojoFeature> result = Lists.newArrayList();
		Method[] methods = clazz.getMethods();
		// find all methods following the pattern getXXX(), and boolean/Boolean isXXX() - these are
		// considered to be features, let the PojoFeature figure out the matching getter/setter.
		for(Method m : methods) {
			String name = m.getName();
			if(name.startsWith("get") && name.length() > 3)
				result.add(new PojoFeature(clazz, initialLowerCase(name, 3)));
			else if(name.startsWith("is") && name.length() > 2)
				result.add(new PojoFeature(clazz, initialLowerCase(name, 2)));
		}
		return result;
	}

	/**
	 * Returns a new string with the start character in lower case.
	 * 
	 * @param s
	 * @param start
	 * @return
	 */
	private static String initialLowerCase(String s, int start) {
		return s.substring(start, start + 1).toLowerCase(Locale.ENGLISH) + s.substring(start + 1);
	}
}
