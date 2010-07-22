package org.eclipse.b3.backend.core.iterators;

import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Iterates over contexts, starting with the context passed as start.
 * For each context, its effective concerns are iterated for ConcernContext.
 * If a concern context reports it matches the candidate, the concern context is returned.
 * This continues until there are no more matching concern contexts in any parent.
 * 
 */
public class MatchingConcernIterator implements Iterator<BConcernContext> {

	private Object candidate;

	private EffectiveConcernIterator eitor;

	private Iterator<BConcernContext> citor;

	private BConcernContext theNext;

	private BExecutionContext evalContext;

	public MatchingConcernIterator(BExecutionContext start, Object candidate) {
		evalContext = start;
		eitor = new EffectiveConcernIterator(start);
		this.candidate = candidate;
		theNext = null;
		citor = null;
		while(eitor.hasNext() && theNext == null) {
			BConcern c = eitor.next();
			citor = c.getConcernContextIterator();
			while(citor.hasNext() && theNext == null) {
				BConcernContext x = citor.next();
				if(x.matches(candidate, evalContext))
					theNext = x;
			}
		}
	}

	public boolean hasNext() {
		return theNext != null;
	}

	public BConcernContext next() {
		BConcernContext result = theNext;
		theNext = null;
		// find next match in current citor
		while(citor.hasNext() && theNext == null) {
			BConcernContext x = citor.next();
			if(x.matches(candidate, evalContext))
				theNext = x;
		}
		// still no match, find a new citor with a match
		if(theNext == null) {
			while(eitor.hasNext() && theNext == null) {
				BConcern c = eitor.next();
				citor = c.getConcernContextIterator();
				while(citor.hasNext() && theNext == null) {
					BConcernContext x = citor.next();
					if(x.matches(candidate, evalContext))
						theNext = x;
				}
			}
		}
		return result;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
