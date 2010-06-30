/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.Constructor;
import java.util.Iterator;

public class ConstructorCandidateSource extends TypeUtils.CandidateSource<ConstructorCandidate> {

	private class MethodCandidateIterator implements Iterator<ConstructorCandidate> {

		private int currentIndex;

		public boolean hasNext() {
			return currentIndex < constructors.length;
		}

		public ConstructorCandidate next() {
			return new ConstructorCandidate(constructors[currentIndex++]);
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	private Constructor<?>[] constructors;

	public ConstructorCandidateSource(Class<?> aClass) {
		constructors = aClass.getConstructors();
	}

	public Iterator<ConstructorCandidate> iterator() {
		return new MethodCandidateIterator();
	}

}
