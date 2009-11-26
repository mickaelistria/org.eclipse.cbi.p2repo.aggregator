/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.AssertionFailedError;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BExpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get LValue</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BExpressionTest extends BSourceLinkTest {

	/**
	 * Constructs a new BExpression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BExpression getFixture() {
		return (BExpression)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			// PUT STUFF HERE IN OVERRIDDEN METHODS
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
		fail("THIS IS AN ABSTRACT TEST - SHOULD BE OVERRIDDEN");
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get LValue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated
	 */
	public void testGetLValue__BExecutionContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
	
	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated
	 */
	public void testGetDeclaredType__BExecutionContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	protected void assertLValShouldFail() {
		try {
			getFixture().getLValue(getEngine().getContext());
		} catch (Throwable e) {
			return;
		}
		fail("Get LVal should have thrown an exception");
	}
} //BExpressionTest
