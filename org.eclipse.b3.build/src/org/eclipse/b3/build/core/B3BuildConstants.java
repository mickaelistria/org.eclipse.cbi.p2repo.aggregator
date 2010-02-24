/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

public interface B3BuildConstants {

	public static final String REPOSITORIES_EXT_ID = "org.eclipse.b3.build.RepositoryScheme";

	public static final String REPOSITORIES_EXTATTR_REPOCLASS = "buildUnitRepositoryClass";

	public static final String REPOSITORIES_EXTATTR_SCHEME = "scheme";

	/**
	 * Prefix for repository scheme meta class value name. Suffix with "." and the scheme name.
	 * The engine assigns these from an extension point.
	 */
	public static final String B3ENGINE_VAR_REPOSCHEMECLASS = "@reposcheme";

	public static final String B3REPO_CREATE_CTX_ALIAS = "repository";

	/**
	 * Variable name for the repository configuration to use when resolving requirements.
	 */
	public static final String B3ENGINE_VAR_REPOSITORIES = "@repositories";

	/**
	 * Variable name for the resolution scope (used to associate resolutions with units and
	 * requirements).
	 */
	public static final String B3ENGINE_VAR_RESOLUTION_SCOPE = "@resolution.scope";

	/**
	 * Capability name space for build unit.
	 */
	public static final String B3_NS_BUILDUNIT = "org.eclipse.b3.ns.capability.buildunit";
}
