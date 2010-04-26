package org.eclipse.b3.backend.core;

import java.util.Iterator;

import org.eclipse.osgi.util.NLS;

public class IntegerSequence extends AbstractSequence<IntegerSequence, Integer> {

	private class SequenceIterator implements Iterator<Integer> {
		int currentValue;

		SequenceIterator() {
			currentValue = from;
			if(!fromInclusive)
				currentValue += (ascending
						? step
						: -step);
		}

		public boolean hasNext() {
			if(ascending) {
				if(toInclusive)
					return currentValue <= to;
				return currentValue < to;
			}
			if(toInclusive)
				return currentValue >= to;
			return currentValue > to;
		}

		public Integer next() {
			int result = currentValue;
			currentValue += (ascending
					? step
					: -step);
			return new Integer(result);
		}

		public void remove() {
			throw new UnsupportedOperationException(NLS.bind("Can not remove from a b3 sequence", new Object[] {}));
		}

	}

	private int from;

	private int to;

	private int step;

	/**
	 * Creates a default sequence from, to value in steps of one. From may be smaller than to which creates
	 * a descending sequence, step should be a positive value for both ascending and descending sequences.
	 * The default sequence will have minInclusive true, maxInclusive true - thus the sequence from 0 to 10, will
	 * produce the values 0,1,2,3,4,5,6,7,8,9,10. This since, sequences are most likely to be used with human
	 * input rather than iterating over lists.
	 * 
	 * @param from
	 * @param to
	 */
	public IntegerSequence(Integer from, Integer to) {
		this(from, to, 1, true, true);
	}

	public IntegerSequence(Integer min, Integer max, Integer step, boolean fromInclusive, boolean toInclusive) {
		this.from = min.intValue();
		this.to = max.intValue();
		this.step = Math.abs(step.intValue());
		this.toInclusive = toInclusive;
		this.fromInclusive = fromInclusive;
		ascending = (to > from);
	}

	@Override
	public IntegerSequence includeFrom(Boolean flag) {
		this.fromInclusive = flag.booleanValue();
		return this;
	}

	@Override
	public IntegerSequence includeTo(Boolean flag) {
		this.toInclusive = flag.booleanValue();
		return this;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new SequenceIterator();
	}

	@Override
	public IntegerSequence step(Integer step) {
		this.step = Math.abs(step.intValue());
		return this;
	}
}
