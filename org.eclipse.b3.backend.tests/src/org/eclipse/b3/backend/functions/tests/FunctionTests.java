package org.eclipse.b3.backend.functions.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

public class FunctionTests extends TestSuite {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new FunctionTests("B3Backend Function Tests");
		suite.addTestSuite(TestSystemLibrary.class);
		suite.addTestSuite(TestIntegerSequence.class);
		suite.addTestSuite(TestDoubleSequence.class);
		return suite;
	}

	public FunctionTests(String name) {
		super(name);
	}

}
