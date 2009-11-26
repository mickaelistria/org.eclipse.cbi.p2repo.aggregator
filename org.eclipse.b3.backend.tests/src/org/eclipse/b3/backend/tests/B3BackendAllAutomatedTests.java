/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.tests;

import org.eclipse.b3.backend.evaluator.b3backend.tests.B3BackendAllTests;
import org.eclipse.b3.backend.evaluator.typesystem.tests.TypesystemTests;
import org.eclipse.b3.backend.functions.tests.FunctionTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>B3Backend</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BackendAllAutomatedTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new B3BackendAllAutomatedTests("B3Backend Automated Tests");
		suite.addTest(TypesystemTests.suite());
		suite.addTest(FunctionTests.suite());
		suite.addTest(B3BackendAllTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BackendAllAutomatedTests(String name) {
		super(name);
	}

} //B3BackendAllTests
