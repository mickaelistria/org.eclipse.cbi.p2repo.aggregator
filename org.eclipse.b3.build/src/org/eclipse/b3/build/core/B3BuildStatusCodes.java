/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3BackendStatusCodes;

/**
 * Error Code definitions for the org.eclipse.b3.build plugin
 * 
 */
public interface B3BuildStatusCodes extends B3BackendStatusCodes {
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
	static final int LOADED_B3MODEL_NO_FUNCTIONS = BuildStart.START + 4;

	/**
	 * A status that indicates that a resolution of a request could not be satisfied.
	 * This code is typically used with WARNING severity. Errors that prevent a request from being
	 * satisfied may not have this code.
	 */
	static final int UNSATISFIED_RESOLUTION_REQUEST = BuildStart.START + 5;

	// static final int ERROR_CODE_XXX = ERROR_START +2;
}
