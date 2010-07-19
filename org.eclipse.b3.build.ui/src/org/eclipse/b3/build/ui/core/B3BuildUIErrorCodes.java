/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.core;

import org.eclipse.b3.build.core.B3BuildStatusCodes;

/**
 * Error Code definitions for the org.eclipse.b3.build plugin
 * 
 */
public interface B3BuildUIErrorCodes extends B3BuildStatusCodes {
	public interface BuildUIStart {
		/** To avoid confusion between backend, build, ui components in the b3 family, they share a unique set. */
		static final int START = BuildStart.START + 1000;
	}

	static final int BAD_UI_CONFIGURATION = BuildUIStart.START + 1;
	// static final int COULD_NOT_XXX = BuildUIStart.START + 1;
}
