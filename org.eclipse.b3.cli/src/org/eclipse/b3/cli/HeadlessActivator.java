/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.cli;

import org.eclipse.core.runtime.Plugin;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class HeadlessActivator extends Plugin {

	private static HeadlessActivator instance;

	public static HeadlessActivator getInstance() {
		return instance;
	}

	private boolean headless;

	public HeadlessActivator() {
		instance = this;
	}

	public boolean isHeadless() {
		return headless;
	}

	void setHeadless() {
		headless = true;
	}
}
