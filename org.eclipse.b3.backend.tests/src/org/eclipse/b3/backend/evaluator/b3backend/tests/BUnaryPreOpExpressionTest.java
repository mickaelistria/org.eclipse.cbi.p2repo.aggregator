/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BUnary Pre Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BUnaryPreOpExpressionTest extends BUnaryOpExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BUnaryPreOpExpressionTest.class);
	}

	/**
	 * Constructs a new BUnary Pre Op Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUnaryPreOpExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BUnary Pre Op Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BUnaryPreOpExpression getFixture() {
		return (BUnaryPreOpExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBUnaryPreOpExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BUnaryPreOpExpressionTest
