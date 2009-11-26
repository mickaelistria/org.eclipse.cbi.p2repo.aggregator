/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;


import org.eclipse.b3.backend.evaluator.b3backend.BFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[]) <em>Internal Call</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BFunctionTest extends BExpressionTest {

	/**
	 * Constructs a new BFunction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BFunction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BFunction getFixture() {
		return (BFunction)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[]) <em>Internal Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
	 * @generated NOT
	 */
	public void testInternalCall__BExecutionContext_Object_Type() {
		// This is very difficult to test without also testing a lot more infrastructure.
		// See BCallExpression testing, and tests of calls using the Context.
	}
	@Override
	public void testEvaluate__BExecutionContext() {
		// This is very difficult to test without also testing a lot more infrastructure.
		// See BCallExpression testing, and tests of calls using the Context.
	}
	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
	@Override
	public void testGetDeclaredType__BExecutionContext() {
		// This is very difficult to test without also testing a lot more infrastructure.
		// See BCallExpression testing, and tests of calls using the Context.
	}
} //BFunctionTest
