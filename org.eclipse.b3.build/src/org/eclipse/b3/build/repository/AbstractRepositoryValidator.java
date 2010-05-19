/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.repository;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.build.build.RepoOption;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.RepositoryUnitProvider;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

public abstract class AbstractRepositoryValidator implements IRepositoryValidator {
	protected abstract static class AbstractOption<T> implements IOption<T> {
		private Type type;

		private int minOccurs;

		private List<IProposal> proposals;

		private int maxOccurs;

		public AbstractOption(Type t, int min, int max) {
			type = t;
			minOccurs = min;
			maxOccurs = max;
			proposals = new ArrayList<IProposal>();
			configure();
		}

		public void addProposal(IProposal proposal) {
			proposals.add(proposal);
		}

		protected void configure() {

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.core.IRepositoryValidator.IOption#getMaxOccurs()
		 */
		public int getMaxOccurs() {
			return maxOccurs;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.core.IRepositoryValidator.IOption#getMinOccurs()
		 */
		public int getMinOccurs() {
			return minOccurs;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.core.IRepositoryValidator.IOption#getType()
		 */
		public Type getType() {
			return type;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.repository.IRepositoryValidator.IOption#iterator()
		 */
		public Iterator<IProposal> iterator() {
			return proposals.iterator();
		}
	}

	protected static class Proposal implements IProposal {
		private String label;

		private String proposal;

		public Proposal(String proposal, String label) {
			this.proposal = proposal;
			this.label = label;
		}

		@Override
		public String getLabel() {
			return label;
		}

		@Override
		public String getProposal() {
			return proposal;
		}

	}

	protected static class RepositoryOption extends AbstractOption<Repository> {

		/**
		 * @param t
		 * @param min
		 * @param max
		 */
		public RepositoryOption(Type t, int min, int max) {
			super(t, min, max);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.repository.IRepositoryValidator.IOption#validate(java.lang.Object, org.eclipse.b3.build.build.RepoOption,
		 * java.lang.Object, org.eclipse.xtext.validation.ValidationMessageAcceptor)
		 */
		@Override
		public void validate(Repository candidate, RepoOption option, Object value, ValidationMessageAcceptor acceptor) {
			// do nothing

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.repository.IRepositoryValidator.IOption#validate(java.lang.Object, org.eclipse.b3.build.build.RepoOption,
		 * org.eclipse.xtext.validation.ValidationMessageAcceptor)
		 */
		@Override
		public void validateExpression(Repository candidate, RepoOption option, ValidationMessageAcceptor acceptor) {
			// Do nothing

		}

	}

	protected static class ResolverOption extends AbstractOption<RepositoryUnitProvider> {

		/**
		 * @param t
		 * @param min
		 * @param max
		 */
		public ResolverOption(Type t, int min, int max) {
			super(t, min, max);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.repository.IRepositoryValidator.IOption#validate(java.lang.Object, org.eclipse.b3.build.build.RepoOption,
		 * java.lang.Object, org.eclipse.xtext.validation.ValidationMessageAcceptor)
		 */
		@Override
		public void validate(RepositoryUnitProvider candidate, RepoOption option, Object value,
				ValidationMessageAcceptor acceptor) {
			// do nothing

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.build.repository.IRepositoryValidator.IOption#validate(java.lang.Object, org.eclipse.b3.build.build.RepoOption,
		 * org.eclipse.xtext.validation.ValidationMessageAcceptor)
		 */
		@Override
		public void validateExpression(RepositoryUnitProvider candidate, RepoOption option,
				ValidationMessageAcceptor acceptor) {
			// do nothing
		}

	}

	private Map<String, IOption<Repository>> repositoryOptions;

	private Map<String, IOption<RepositoryUnitProvider>> resolverOptions;

	public AbstractRepositoryValidator() {
		repositoryOptions = new HashMap<String, IOption<Repository>>();
		resolverOptions = new HashMap<String, IOption<RepositoryUnitProvider>>();
	}

	protected void addRepositoryOption(String name, IOption<Repository> repoOption) {
		repositoryOptions.put(name, repoOption);
	}

	protected void addRepositoryOption(String name, Type type) {
		repositoryOptions.put(name, new RepositoryOption(type, 0, 1));
	}

	protected void addResolverOption(String name, IOption<RepositoryUnitProvider> resolverOption) {
		resolverOptions.put(name, resolverOption);
	}

	protected void addResolverOption(String name, Type type) {
		resolverOptions.put(name, new ResolverOption(type, 0, 1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IRepositoryValidator#getRepositoryOptions()
	 */
	public Map<String, IOption<Repository>> getRepositoryOptions() {
		return Collections.unmodifiableMap(repositoryOptions);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IRepositoryValidator#getResolverOptions()
	 */
	public Map<String, IOption<RepositoryUnitProvider>> getResolverOptions() {
		return Collections.unmodifiableMap(resolverOptions);
	}

	/**
	 * This default implementation returns true.
	 * 
	 * @see org.eclipse.b3.build.repository.IRepositoryValidator#supportsBranches()
	 */
	public boolean supportsBranches() {
		return true;
	}
}
