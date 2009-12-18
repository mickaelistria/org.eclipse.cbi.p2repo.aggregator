package org.eclipse.b3.backend.functions.tests;

import org.eclipse.b3.backend.core.IntegerSequence;
import junit.framework.TestCase;

public class TestIntegerSequence extends TestCase {

	public void test_IntegerSequence() {
		IntegerSequence seq = new IntegerSequence(1, 9);
		int value = 0;
		int last = 0;
		for(Integer x : seq) {
			value += x.intValue();
			assertTrue("should be in ascending order", x.intValue() > last);
			last = x.intValue();
		}
		assertEquals("Should have iterated over 1 to 9", 45, value);
	}
	public void test_IntegerSequenceDescending() {
		IntegerSequence seq = new IntegerSequence(9, 1);
		int value = 0;
		int last = 10;
		for(Integer x : seq) {
			value += x.intValue();
			assertTrue("should be in descending order", x.intValue() < last);
			last = x.intValue();
		}
		assertEquals("Should have iterated over 9 to 1", 45, value);
	}
	public void test_IntegerSequenceBy2() {
		IntegerSequence seq = new IntegerSequence(9, 1, 2, true, true);
		assertEquals("Should have iterated over odd values 9 to 1", 25, computeSum(seq));
		
		assertEquals("testing step method", 25, computeSum(new IntegerSequence(9,1).step(2)));
		
	}
	public void test_IntegerSequenceExcludeFrom() {
		IntegerSequence seq = new IntegerSequence(1, 9, 1, false, true);
		assertEquals("Should have iterated 2 to 9", 44, computeSum(seq));
		assertEquals("testing includeFrom method", 44, computeSum(new IntegerSequence(1,9).includeFrom(false)));

	}
	public void test_IntegerSequenceExcludeTo() {
		IntegerSequence seq = new IntegerSequence(1, 9, 1, true, false);
		assertEquals("Should have iterated ove 1 to 8", 36, computeSum(seq));
		assertEquals("testing includeFrom method", 36, computeSum(new IntegerSequence(1,9).includeTo(false)));

	}
	public void test_IntegerSequenceExcludeToAndFrom() {
		IntegerSequence seq = new IntegerSequence(1, 9, 1, false, false);
		assertEquals("Should have iterated over 2 to 8", 35, computeSum(seq));
		assertEquals("testing includeFrom method", 35, computeSum(new IntegerSequence(1,9).includeTo(false).includeFrom(false)));

	}
	private int computeSum(IntegerSequence seq) {
		int value = 0;
		for(Integer x : seq)
			value += x.intValue();
		return value;
	}
}
