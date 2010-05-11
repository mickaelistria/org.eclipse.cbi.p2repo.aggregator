/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRepositoryValidator implements IRepositoryValidator {
	protected static class Option implements IOption {
		private Type type;

		private int minOccurs;

		private int maxOccurs;

		public Option(Type t, int min, int max) {
			type = t;
			minOccurs = min;
			maxOccurs = max;
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

	}

	private Map<String, IOption> repositoryOptions;

	private Map<String, IOption> resolverOptions;

	public AbstractRepositoryValidator() {
		repositoryOptions = new HashMap<String, IOption>();
		resolverOptions = new HashMap<String, IOption>();
	}

	protected void addRepositoryOption(String name, Type type) {
		repositoryOptions.put(name, new Option(type, 0, 1));
	}

	protected void addResolverOption(String name, Type type) {
		resolverOptions.put(name, new Option(type, 0, 1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IRepositoryValidator#getRepositoryOptions()
	 */
	public Map<String, IOption> getRepositoryOptions() {
		return Collections.unmodifiableMap(repositoryOptions);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IRepositoryValidator#getResolverOptions()
	 */
	public Map<String, IOption> getResolverOptions() {
		return Collections.unmodifiableMap(resolverOptions);
	}

	/**
	 * This default implementation returns true.
	 * 
	 * @see org.eclipse.b3.build.core.IRepositoryValidator#supportsBranches()
	 */
	public boolean supportsBranches() {
		return true;
	}
}
