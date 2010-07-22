/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core.iterators;

import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

public class RegexpIterator implements Iterator<IFunction> {
	Iterator<IFunction> itor;

	Pattern pattern;

	IFunction theNext;

	public RegexpIterator(Iterator<IFunction> itor, Pattern pattern) {
		this.itor = itor;
		this.pattern = pattern;
	}

	public boolean hasNext() {
		if(theNext != null)
			return true;
		if(!itor.hasNext())
			return false;
		while(itor.hasNext()) {
			IFunction candidate = itor.next();
			if(pattern.matcher(candidate.getName()).matches()) {
				theNext = candidate;
				return true;
			}
		}
		return false;
	}

	public IFunction next() {
		IFunction tmp = theNext;
		theNext = null;
		return tmp;
	}

	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported on this iterator");
	}

}
