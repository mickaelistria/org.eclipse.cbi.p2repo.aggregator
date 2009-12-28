/*******************************************************************************
 * Copyright (c) 2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.beelang.junit;

import java.util.List;

/**
 * An exception to wrap all problems encountered during parsing of a B3 file so that all of them can be reported.
 * 
 * @author michal.ruzicka@cloudsmith.com
 * 
 * @see JUnitB3TestRunner
 */
public class MultiProblemException extends Exception {

	private static final long serialVersionUID = 2060410712730459168L;

	protected List<Throwable> problemList;

	public MultiProblemException(String message, List<Throwable> problems) {
		super(message);
		problemList = problems;
	}

	public List<Throwable> getProblems() {
		return problemList;
	}

}
