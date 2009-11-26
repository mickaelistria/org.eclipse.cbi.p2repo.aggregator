package org.eclipse.b3.backend.evaluator.typesystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

public class TypesystemTests extends TestSuite {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new TypesystemTests("b3backend Typesystem Tests");
		suite.addTestSuite(TestTypeDistance.class);
		return suite;
	}

	public TypesystemTests(String name) {
		super(name);
	}

}
