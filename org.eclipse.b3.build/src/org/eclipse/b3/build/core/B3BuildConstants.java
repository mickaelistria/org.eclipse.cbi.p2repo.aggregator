/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.build.core.runtime.SharedScope;

import com.google.inject.Key;
import com.google.inject.name.Names;

public interface B3BuildConstants extends B3BackendConstants {

	public static final String REPOSITORIES_EXT_ID = "org.eclipse.b3.build.RepositoryValidator";

	public static final String REPOSITORIES_EXTATTR_REPOTYPE = "name";

	public static final String REPOSITORIES_EXTATTR_REPOVALIDATOR = "validator";

	public static final String B3REPO_CREATE_CTX_ALIAS = "repository";

	/**
	 * Variable name for requests in repository switch and option evaluation.
	 */
	public static final String B3_VAR_REQUEST = "request";

	public static final String B3_VAR_INPUT = "input";

	public static final String B3_VAR_OUTPUT = "output";

	public static final String B3_VAR_SOURCE = "source";

	/**
	 * Variable name for the repository configuration to use when resolving requirements.
	 */
	public static final String B3ENGINE_VAR_UNITPROVIDERS = "@providers";

	/**
	 * Capability name space for build unit.
	 */
	public static final String B3_NS_BUILDUNIT = "org.eclipse.b3.ns.capability.buildunit";

	/**
	 * Guice Key to get custom resolution scope. (To enter/exit the scope).
	 */
	public static final Key<SharedScope> KEY_RESOLUTION_SCOPE = Key.get(SharedScope.class, Names.named("resolution"));

	public static final String B3ENGINE_MODEL_URI = "b3engine:/default";

	public static final String B3_VAR_ENGINE = "b3";

	public static final String B3_VAR_UNIT = "unit";

}
