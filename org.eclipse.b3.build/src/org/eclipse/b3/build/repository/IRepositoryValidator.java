/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.repository;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RepositoryUnitProvider;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public interface IRepositoryValidator {
	public interface IOption<T> extends Iterable<IProposal> {

		public int getMaxOccurs();

		public int getMinOccurs();

		public Type getType();

		public Iterator<IProposal> iterator();

		/**
		 * Validate the evaluated repo option (value is the evaluated result)
		 * 
		 * @param candidate
		 * @param option
		 * @param value
		 * @param acceptor
		 */
		public void validate(T candidate, RepoOption option, Object value, ValidationMessageAcceptor acceptor);

		/**
		 * Validate the RepoOption expression (i.e. before evaluation)
		 * 
		 * @param candidate
		 * @param option
		 * @param acceptor
		 */
		public void validateExpression(T candidate, RepoOption option, ValidationMessageAcceptor acceptor);
	}

	public interface IProposal {
		public String getLabel();

		public String getProposal();
	}

	public Map<String, IOption<Repository>> getRepositoryOptions();

	public Map<String, IOption<RepositoryUnitProvider>> getResolverOptions();

	public boolean supportsBranches();
}
