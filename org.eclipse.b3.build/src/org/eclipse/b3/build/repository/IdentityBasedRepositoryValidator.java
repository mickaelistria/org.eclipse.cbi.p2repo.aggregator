/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.repository;

/**
 * Validator for a repository that uses identity as key, and has no branches.
 * Does not provide any additional options.
 */
public class IdentityBasedRepositoryValidator extends BasicRepositoryValidator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.AbstractRepositoryValidator#supportsBranches()
	 */
	@Override
	public boolean supportsBranches() {
		return false;
	}
}
