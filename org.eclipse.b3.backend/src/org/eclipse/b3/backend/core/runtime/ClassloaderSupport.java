/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core.runtime;

import org.eclipse.b3.backend.core.internal.B3BackendActivator;

/**
 * Adds support for classloading via the bundle without exporting the Activator.
 * 
 */
public class ClassloaderSupport {
	@SuppressWarnings("rawtypes")
	public static Class load(String name) throws ClassNotFoundException {
		return B3BackendActivator.instance.getBundle().loadClass(name);
	}
}
