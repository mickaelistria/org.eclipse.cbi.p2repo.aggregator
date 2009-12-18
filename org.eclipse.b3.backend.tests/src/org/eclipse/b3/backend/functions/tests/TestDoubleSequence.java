package org.eclipse.b3.backend.functions.tests;

import org.eclipse.b3.backend.core.DoubleSequence;
import junit.framework.TestCase;

public class TestDoubleSequence extends TestCase {

	public void test_DoubleSequence() {
		DoubleSequence seq = new DoubleSequence(1.0, 9.0);
		double value = 0.0;
		double last = 0.0;
		for(Double x : seq) {
			value += x.doubleValue();
			assertTrue("should be in ascending order", x.doubleValue() > last);
			last = x.doubleValue();
		}
		assertEquals("Should have iterated over 1 to 9", 45.0, value);
	}
	public void test_DoubleSequenceDescending() {
		DoubleSequence seq = new DoubleSequence(9.0, 1.0);
		double value = 0;
		double last = 10;
		for(Double x : seq) {
			value += x.doubleValue();
			assertTrue("should be in descending order", x.doubleValue() < last);
			last = x.doubleValue();
		}
		assertEquals("Should have iterated over 9 to 1", 45.0, value);
	}
	public void test_DoubleSequenceBy2() {
		DoubleSequence seq = new DoubleSequence(9.0, 1.0, 2.0, true, true);
		assertEquals("Should have iterated over odd values 9 to 1", 25.0, computeSum(seq));
		
		assertEquals("testing step method", 25.0, computeSum(new DoubleSequence(9.0,1.0).step(2.0)));
		
	}
	public void test_DoubleSequenceExcludeFrom() {
		DoubleSequence seq = new DoubleSequence(1.0, 9.0, 1.0, false, true);
		assertEquals("Should have iterated 2 to 9", 44.0, computeSum(seq));
		assertEquals("testing includeFrom method", 44.0, computeSum(new DoubleSequence(1.0,9.0).includeFrom(false)));

	}
	public void test_DoubleSequenceExcludeTo() {
		DoubleSequence seq = new DoubleSequence(1.0, 9.0, 1.0, true, false);
		assertEquals("Should have iterated ove 1 to 8", 36.0, computeSum(seq));
		assertEquals("testing includeFrom method", 36.0, computeSum(new DoubleSequence(1.0,9.0).includeTo(false)));

	}
	public void test_DoubleSequenceExcludeToAndFrom() {
		DoubleSequence seq = new DoubleSequence(1.0, 9.0, 1.0, false, false);
		assertEquals("Should have iterated over 2 to 8", 35.0, computeSum(seq));
		assertEquals("testing includeFrom method", 35.0, computeSum(new DoubleSequence(1.0,9.0).includeTo(false).includeFrom(false)));

	}
	private double computeSum(DoubleSequence seq) {
		double value = 0;
		for(Double x : seq)
			value += x.doubleValue();
		return value;
	}
}
