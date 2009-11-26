/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BLiteral Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BLiteralExpressionTest extends BExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BLiteralExpressionTest.class);
	}

	/**
	 * Constructs a new BLiteral Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BLiteral Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BLiteralExpression getFixture() {
		return (BLiteralExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBLiteralExpression());
		setEngine(new B3Engine());
		BLiteralExpression expr = getFixture();
		expr.setValue("DUMMY");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		setEngine(null);
	}
	@Override
	public void testEvaluate__BExecutionContext() {
		try {
		Object result = getFixture().evaluate(getEngine().getContext());
		assertEquals(result, "DUMMY");
		} catch (AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			fail(t.getMessage());
		}
	}
	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			BExecutionContext ctx = getEngine().getContext();
			assertEquals(String.class, getFixture().getDeclaredType(ctx));
			} catch (AssertionFailedError e) {
				throw e;
			}
			catch(Throwable t) {
				fail(t.getMessage());
			}
		
	}
} //BLiteralExpressionTest
