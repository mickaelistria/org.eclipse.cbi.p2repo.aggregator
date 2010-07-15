/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.tests.testmaterial;

/**
 * A class used to generate exceptions
 * 
 */
public class MissBehaving {
	public void error() throws Error {
		throw new Error("An error");
	}

	public void errorWithCause() throws Error {
		try {
			error();
		}
		catch(Error e) {
			throw new Error("An error with a cause", e);
		}
	}

	public void NPE() throws Throwable {
		nullThrower(null);
	}

	private void nullThrower(Object IShouldBeNull) {
		IShouldBeNull.toString();
	}

	public void runtimeException() throws RuntimeException {
		throw new RuntimeException("A runtime exception");
	}
}
