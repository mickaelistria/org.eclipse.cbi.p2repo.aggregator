/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.repository;

import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * Adds "local", "user" and "password" as Repository Options
 * 
 */
public class BasicRepositoryValidator extends AbstractRepositoryValidator {

	public BasicRepositoryValidator() {
		addRepositoryOption(IRepositoryConstants.LOCAL, new RepositoryOption(String.class, 0, 1) {
			@Override
			public void validate(Repository candidate, RepoOption option, Object value,
					ValidationMessageAcceptor acceptor) {

				super.validate(candidate, option, value, acceptor);
			}

			@Override
			protected void configure() {
				addProposal(new Proposal("\"workspace:/.hidden/location/\"", "Hidden location in workspace (example)"));
				addProposal(new Proposal("\"file:/tmp/somelocation/\"", "Filesystem location in tmp (example)"));
			}
		});
		addRepositoryOption(IRepositoryConstants.USER, String.class);
		addRepositoryOption(IRepositoryConstants.PASSWORD, String.class);
	}
}
