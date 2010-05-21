package org.eclipse.b3.backend.evaluator.typesystem.tests;

import java.lang.reflect.Type;
import java.math.BigInteger;

import org.eclipse.b3.backend.evaluator.typesystem.TypeDistance;

import junit.framework.TestCase;

public class TestTypeDistance extends TestCase {

	public void test_Integer_Double() {
		TypeDistance t = new TypeDistance();
		assertEquals(Number.class, t.getMostSpecificCommonType(new Type[] { Integer.class, Double.class }));
	}

	public void test_Integer_String() {
		TypeDistance t = new TypeDistance();
		assertEquals(Object.class, t.getMostSpecificCommonType(new Type[] { Integer.class, String.class }));
	}

	public void test_ManyNumbers() {
		TypeDistance t = new TypeDistance();
		assertEquals(
			Number.class,
			t.getMostSpecificCommonType(new Type[] {
					Integer.class, Double.class, Short.class, Long.class, Double.class, BigInteger.class }));
	}

	public void test_NumberDouble() {
		TypeDistance t = new TypeDistance();
		assertEquals(Number.class, t.getMostSpecificCommonType(new Type[] { Double.class, Number.class, }));
	}

	public void test_SameType() {
		TypeDistance t = new TypeDistance();
		assertEquals(String.class, t.getMostSpecificCommonType(new Type[] { String.class, String.class }));
	}
}
