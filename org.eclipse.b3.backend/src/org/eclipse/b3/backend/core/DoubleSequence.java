package org.eclipse.b3.backend.core;

import java.util.Iterator;

import org.eclipse.osgi.util.NLS;

public class DoubleSequence implements Iterable<Double> {

	private double from;
	private double to;
	private boolean fromInclusive;
	private boolean toInclusive;
	private double step;
	boolean ascending;
	
	/**
	 * Creates a default sequence from, to value in steps of one. From may be smaller than to which creates
	 * a descending sequence, step should be a positive value for both ascending and descending sequences.
	 * The default sequence will have minInclusive true, maxInclusive true - thus the sequence from 0 to 10, will
	 * produce the values 0,1,2,3,4,5,6,7,8,9,10. This since, sequences are most likely to be used with human
	 * input rather than iterating over lists.
	 * If the distance between from and to < 2.0 the step is 0.1, else the step is 1.0.
	 * @param from
	 * @param to
	 */
	public DoubleSequence(Double from, Double to) {
		this(from, to, Math.abs(to-from) < 2.0 ? 0.1 : 1.0 , true, true);
	}
	public DoubleSequence(Double min, Double max, Double step, boolean fromInclusive, boolean toInclusive) {
		this.from = min.doubleValue();
		this.to = max.doubleValue();
		this.step = Math.abs(step.doubleValue());
		this.toInclusive = toInclusive;
		this.fromInclusive = fromInclusive;
		if(from > to)
			ascending = true;
	}
	public Iterator<Double> iterator() {
		return new SequenceIterator();
	}
	public DoubleSequence stepBy(Double step) {
		step = Math.abs(step.doubleValue());
		return this;
	}

	private class SequenceIterator implements Iterator<Double> {
		double currentValue;
		SequenceIterator() {
			currentValue = from;
			if(!fromInclusive)
				currentValue += (ascending ? -step : step);
		}
		public boolean hasNext() {
			if(ascending) {
				if(toInclusive)
					return currentValue >= to;
				else
					return currentValue > to;
			}
			if(toInclusive)
				return currentValue >= to;
			return currentValue > to;
		}

		public Double next() {
			double result = currentValue;
			currentValue += (ascending ? -step : step);
			return new Double(result);
		}

		public void remove() {
			throw new UnsupportedOperationException(NLS.bind("Can not remove from a b3 sequence", new Object[]{}));
		}
		
	}
}
