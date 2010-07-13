/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3BackendErrorCodes;

/**
 * Error Code definitions for the org.eclipse.b3.build plugin
 * 
 */
public interface B3BuildErrorCodes extends B3BackendErrorCodes {
	public interface BuildStart {
		/** To avoid confusion between backend, build, ui components in the b3 family, they share a unique set. */
		static final int START = BackendStart.START + 1000;
	}

	/** Error used when loading a b3 resource from a URI */
	static final int COULD_NOT_LOAD_RESOURCE = BuildStart.START + 1;

	/** Error in engine, not specific to a particular b3 expression. */
	static final int ENGINE_ERROR = BuildStart.START + 2;

	/** The b3 Resource was invalid (for the intended use, not necessarily technically invalid). */
	static final int INVALID_B3_RESOURCE = BuildStart.START + 3;

	/**
	 * A load of a b3 model succeeded and resulted in a BeeModel, but the BeeModel was expected to have
	 * functions, but was empty.
	 */
	static final int LOADED_B3MODEL_NO_FUNCTIONS = BuildStart.START + 3;

	// static final int ERROR_CODE_XXX = ERROR_START +2;
}
