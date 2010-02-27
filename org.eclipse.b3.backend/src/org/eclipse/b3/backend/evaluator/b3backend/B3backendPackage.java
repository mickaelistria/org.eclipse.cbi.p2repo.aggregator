/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory
 * @model kind="package"
 * @generated
 */
public interface B3backendPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "b3backend";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://b3backend/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "b3backend";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	B3backendPackage eINSTANCE = org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl <em>BExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExpression()
	 * @generated
	 */
	int BEXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>BExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLineReferenceImpl <em>BLine Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLineReferenceImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLineReference()
	 * @generated
	 */
	int BLINE_REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>BLine Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl <em>BExecution Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExecutionContext()
	 * @generated
	 */
	int BEXECUTION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT__PARENT_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT__VALUE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT__FUNC_STORE = 2;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS = 3;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT__PROGRESS_MONITOR = 4;

	/**
	 * The number of structural features of the '<em>BExecution Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXECUTION_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl <em>BIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBIfExpression()
	 * @generated
	 */
	int BIF_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIF_EXPRESSION__CONDITION_EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIF_EXPRESSION__THEN_EXPR = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIF_EXPRESSION__ELSE_EXPR = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIF_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl <em>BSwitch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBSwitchExpression()
	 * @generated
	 */
	int BSWITCH_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWITCH_EXPRESSION__SWITCH_EXPRESSION = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWITCH_EXPRESSION__CASE_LIST = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BSwitch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSWITCH_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl <em>BCase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCase()
	 * @generated
	 */
	int BCASE = 5;

	/**
	 * The feature id for the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCASE__CONDITION_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCASE__THEN_EXPR = 1;

	/**
	 * The number of structural features of the '<em>BCase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTryExpressionImpl <em>BTry Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTryExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTryExpression()
	 * @generated
	 */
	int BTRY_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Try Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTRY_EXPRESSION__TRY_EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTRY_EXPRESSION__CATCH_BLOCKS = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Finally Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTRY_EXPRESSION__FINALLY_EXPR = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BTry Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTRY_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl <em>BCatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCatch()
	 * @generated
	 */
	int BCATCH = 7;

	/**
	 * The feature id for the '<em><b>Catch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCATCH__CATCH_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCATCH__VARNAME = 1;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCATCH__EXCEPTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>BCatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCATCH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl <em>BBinary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBBinaryExpression()
	 * @generated
	 */
	int BBINARY_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_EXPRESSION__LEFT_EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_EXPRESSION__RIGHT_EXPR = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BBinary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BOrExpressionImpl <em>BOr Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BOrExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBOrExpression()
	 * @generated
	 */
	int BOR_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOR_EXPRESSION__LEFT_EXPR = BBINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOR_EXPRESSION__RIGHT_EXPR = BBINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>BOr Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOR_EXPRESSION_FEATURE_COUNT = BBINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAndExpressionImpl <em>BAnd Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAndExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAndExpression()
	 * @generated
	 */
	int BAND_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__LEFT_EXPR = BBINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION__RIGHT_EXPR = BBINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>BAnd Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAND_EXPRESSION_FEATURE_COUNT = BBINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl <em>BChained Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBChainedExpression()
	 * @generated
	 */
	int BCHAINED_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCHAINED_EXPRESSION__EXPRESSIONS = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BChained Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCHAINED_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryExpressionImpl <em>BUnary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryExpression()
	 * @generated
	 */
	int BUNARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_EXPRESSION__EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUnary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BThrowExpressionImpl <em>BThrow Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BThrowExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBThrowExpression()
	 * @generated
	 */
	int BTHROW_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTHROW_EXPRESSION__EXPR = BUNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>BThrow Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTHROW_EXPRESSION_FEATURE_COUNT = BUNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryOpExpressionImpl <em>BUnary Op Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryOpExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryOpExpression()
	 * @generated
	 */
	int BUNARY_OP_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_OP_EXPRESSION__EXPR = BUNARY_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_OP_EXPRESSION__FUNCTION_NAME = BUNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BUnary Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_OP_EXPRESSION_FEATURE_COUNT = BUNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPostOpExpressionImpl <em>BUnary Post Op Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPostOpExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryPostOpExpression()
	 * @generated
	 */
	int BUNARY_POST_OP_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_POST_OP_EXPRESSION__EXPR = BUNARY_OP_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_POST_OP_EXPRESSION__FUNCTION_NAME = BUNARY_OP_EXPRESSION__FUNCTION_NAME;

	/**
	 * The number of structural features of the '<em>BUnary Post Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_POST_OP_EXPRESSION_FEATURE_COUNT = BUNARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryOpExpressionImpl <em>BBinary Op Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryOpExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBBinaryOpExpression()
	 * @generated
	 */
	int BBINARY_OP_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_OP_EXPRESSION__LEFT_EXPR = BBINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_OP_EXPRESSION__RIGHT_EXPR = BBINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_OP_EXPRESSION__FUNCTION_NAME = BBINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BBinary Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBINARY_OP_EXPRESSION_FEATURE_COUNT = BBINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCachedExpressionImpl <em>BCached Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCachedExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCachedExpression()
	 * @generated
	 */
	int BCACHED_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCACHED_EXPRESSION__EXPR = BUNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>BCached Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCACHED_EXPRESSION_FEATURE_COUNT = BUNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl <em>BLiteral Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralExpression()
	 * @generated
	 */
	int BLITERAL_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_EXPRESSION__VALUE = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BLiteral Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl <em>BLiteral List Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralListExpression()
	 * @generated
	 */
	int BLITERAL_LIST_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_LIST_EXPRESSION__ENTRIES = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_LIST_EXPRESSION__ENTRY_TYPE = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BLiteral List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_LIST_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl <em>BLiteral Map Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralMapExpression()
	 * @generated
	 */
	int BLITERAL_MAP_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_MAP_EXPRESSION__ENTRIES = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_MAP_EXPRESSION__KEY_TYPE = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_MAP_EXPRESSION__VALUE_TYPE = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BLiteral Map Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_MAP_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BMapEntryImpl <em>BMap Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BMapEntryImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBMapEntry()
	 * @generated
	 */
	int BMAP_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>BMap Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFeatureExpressionImpl <em>BFeature Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFeatureExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFeatureExpression()
	 * @generated
	 */
	int BFEATURE_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Obj Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE_EXPRESSION__OBJ_EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE_EXPRESSION__FEATURE_NAME = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BFeature Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFEATURE_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl <em>BAt Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAtExpression()
	 * @generated
	 */
	int BAT_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Obj Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAT_EXPRESSION__OBJ_EXPR = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAT_EXPRESSION__INDEX_EXPR = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BAt Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAT_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BVariableExpressionImpl <em>BVariable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BVariableExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBVariableExpression()
	 * @generated
	 */
	int BVARIABLE_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BVARIABLE_EXPRESSION__NAME = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BVariable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BVARIABLE_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterizedExpressionImpl <em>BParameterized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterizedExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterizedExpression()
	 * @generated
	 */
	int BPARAMETERIZED_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETERIZED_EXPRESSION__PARAMETER_LIST = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BParameterized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETERIZED_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl <em>BCall Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCallExpression()
	 * @generated
	 */
	int BCALL_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCALL_EXPRESSION__PARAMETER_LIST = BPARAMETERIZED_EXPRESSION__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCALL_EXPRESSION__FUNC_EXPR = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCALL_EXPRESSION__NAME = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BCall Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCALL_EXPRESSION_FEATURE_COUNT = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralAnyImpl <em>BLiteral Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralAnyImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralAny()
	 * @generated
	 */
	int BLITERAL_ANY = 27;

	/**
	 * The number of structural features of the '<em>BLiteral Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_ANY_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl <em>BCreate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCreateExpression()
	 * @generated
	 */
	int BCREATE_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCREATE_EXPRESSION__PARAMETER_LIST = BPARAMETERIZED_EXPRESSION__PARAMETER_LIST;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCREATE_EXPRESSION__ALIAS = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCREATE_EXPRESSION__TYPE_EXPR = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCREATE_EXPRESSION__CONTEXT_BLOCK = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BCreate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCREATE_EXPRESSION_FEATURE_COUNT = BPARAMETERIZED_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl <em>BFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunction()
	 * @generated
	 */
	int BFUNCTION = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardImpl <em>BGuard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuard()
	 * @generated
	 */
	int BGUARD = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl <em>BGuard Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuardExpression()
	 * @generated
	 */
	int BGUARD_EXPRESSION = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSystemContextImpl <em>BSystem Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BSystemContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBSystemContext()
	 * @generated
	 */
	int BSYSTEM_CONTEXT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BContextImpl <em>BContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBContext()
	 * @generated
	 */
	int BCONTEXT = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl <em>BInner Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInnerContext()
	 * @generated
	 */
	int BINNER_CONTEXT = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInvocationContextImpl <em>BInvocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInvocationContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInvocationContext()
	 * @generated
	 */
	int BINVOCATION_CONTEXT = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPreOpExpressionImpl <em>BUnary Pre Op Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPreOpExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryPreOpExpression()
	 * @generated
	 */
	int BUNARY_PRE_OP_EXPRESSION = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAssignmentExpressionImpl <em>BAssignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAssignmentExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAssignmentExpression()
	 * @generated
	 */
	int BASSIGNMENT_EXPRESSION = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl <em>B3 Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3Function()
	 * @generated
	 */
	int B3_FUNCTION = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl <em>BJava Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBJavaFunction()
	 * @generated
	 */
	int BJAVA_FUNCTION = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer <em>BFunction Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionContainer()
	 * @generated
	 */
	int BFUNCTION_CONTAINER = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefValueImpl <em>BDef Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefValueImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefValue()
	 * @generated
	 */
	int BDEF_VALUE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BRegularExpressionImpl <em>BRegular Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BRegularExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBRegularExpression()
	 * @generated
	 */
	int BREGULAR_EXPRESSION = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterListImpl <em>BParameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterListImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterList()
	 * @generated
	 */
	int BPARAMETER_LIST = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterImpl <em>BParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameter()
	 * @generated
	 */
	int BPARAMETER = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterDeclarationImpl <em>BParameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterDeclarationImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterDeclaration()
	 * @generated
	 */
	int BPARAMETER_DECLARATION = 45;

	/**
	 * The meta object id for the '{@link java.lang.reflect.Type <em>IType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Type
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIType()
	 * @generated
	 */
	int ITYPE = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl <em>B3 Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3FunctionType()
	 * @generated
	 */
	int B3_FUNCTION_TYPE = 47;

	/**
	 * The meta object id for the '{@link java.lang.reflect.ParameterizedType <em>IParameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.ParameterizedType
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIParameterizedType()
	 * @generated
	 */
	int IPARAMETERIZED_TYPE = 48;

	/**
	 * The meta object id for the '{@link java.lang.reflect.GenericDeclaration <em>IGeneric Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.GenericDeclaration
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIGenericDeclaration()
	 * @generated
	 */
	int IGENERIC_DECLARATION = 49;

	/**
	 * The number of structural features of the '<em>IGeneric Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGENERIC_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction <em>IFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIFunction()
	 * @generated
	 */
	int IFUNCTION = 29;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__VISIBILITY = IGENERIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__FINAL = IGENERIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__EXECUTION_MODE = IGENERIC_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__NAME = IGENERIC_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__GUARD = IGENERIC_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__PARAMETER_TYPES = IGENERIC_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__EXCEPTION_TYPES = IGENERIC_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__TYPE_PARAMETERS = IGENERIC_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__PARAMETER_NAMES = IGENERIC_DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__PARAMETERS = IGENERIC_DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__VAR_ARGS = IGENERIC_DECLARATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__DOCUMENTATION = IGENERIC_DECLARATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__RETURN_TYPE = IGENERIC_DECLARATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__CLOSURE = IGENERIC_DECLARATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__TYPE_CALCULATOR = IGENERIC_DECLARATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__CONTAINER = IGENERIC_DECLARATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__CLASS_FUNCTION = IGENERIC_DECLARATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION__VARARG_ARRAY_TYPE = IGENERIC_DECLARATION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>IFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFUNCTION_FEATURE_COUNT = IGENERIC_DECLARATION_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>BGuard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BGUARD_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Guard Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BGUARD_EXPRESSION__GUARD_EXPR = BGUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BGuard Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BGUARD_EXPRESSION_FEATURE_COUNT = BGUARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT__PARENT_CONTEXT = BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT__VALUE_MAP = BEXECUTION_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT__FUNC_STORE = BEXECUTION_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT__EFFECTIVE_CONCERNS = BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT__PROGRESS_MONITOR = BEXECUTION_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The number of structural features of the '<em>BSystem Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSYSTEM_CONTEXT_FEATURE_COUNT = BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT__PARENT_CONTEXT = BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT__VALUE_MAP = BEXECUTION_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT__FUNC_STORE = BEXECUTION_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT__EFFECTIVE_CONCERNS = BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT__PROGRESS_MONITOR = BEXECUTION_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The number of structural features of the '<em>BContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTEXT_FEATURE_COUNT = BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__PARENT_CONTEXT = BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__VALUE_MAP = BEXECUTION_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__FUNC_STORE = BEXECUTION_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__EFFECTIVE_CONCERNS = BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__PROGRESS_MONITOR = BEXECUTION_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT__OUTER_CONTEXT = BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BInner Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_CONTEXT_FEATURE_COUNT = BEXECUTION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__PARENT_CONTEXT = BEXECUTION_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__VALUE_MAP = BEXECUTION_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__FUNC_STORE = BEXECUTION_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__EFFECTIVE_CONCERNS = BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__PROGRESS_MONITOR = BEXECUTION_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Expression Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT__EXPRESSION_CACHE = BEXECUTION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BInvocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVOCATION_CONTEXT_FEATURE_COUNT = BEXECUTION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_PRE_OP_EXPRESSION__EXPR = BUNARY_OP_EXPRESSION__EXPR;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_PRE_OP_EXPRESSION__FUNCTION_NAME = BUNARY_OP_EXPRESSION__FUNCTION_NAME;

	/**
	 * The number of structural features of the '<em>BUnary Pre Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNARY_PRE_OP_EXPRESSION_FEATURE_COUNT = BUNARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSIGNMENT_EXPRESSION__LEFT_EXPR = BBINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSIGNMENT_EXPRESSION__RIGHT_EXPR = BBINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSIGNMENT_EXPRESSION__FUNCTION_NAME = BBINARY_OP_EXPRESSION__FUNCTION_NAME;

	/**
	 * The number of structural features of the '<em>BAssignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSIGNMENT_EXPRESSION_FEATURE_COUNT = BBINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__VISIBILITY = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__FINAL = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__EXECUTION_MODE = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__NAME = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__GUARD = BEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__PARAMETER_TYPES = BEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__EXCEPTION_TYPES = BEXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__TYPE_PARAMETERS = BEXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__PARAMETER_NAMES = BEXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__PARAMETERS = BEXPRESSION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__VAR_ARGS = BEXPRESSION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__DOCUMENTATION = BEXPRESSION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__RETURN_TYPE = BEXPRESSION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__CLOSURE = BEXPRESSION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__TYPE_CALCULATOR = BEXPRESSION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__CONTAINER = BEXPRESSION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__CLASS_FUNCTION = BEXPRESSION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION__VARARG_ARRAY_TYPE = BEXPRESSION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>BFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__VISIBILITY = BFUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__FINAL = BFUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__EXECUTION_MODE = BFUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__NAME = BFUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__GUARD = BFUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__PARAMETER_TYPES = BFUNCTION__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__EXCEPTION_TYPES = BFUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__TYPE_PARAMETERS = BFUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__PARAMETER_NAMES = BFUNCTION__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__PARAMETERS = BFUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__VAR_ARGS = BFUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__DOCUMENTATION = BFUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__RETURN_TYPE = BFUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__CLOSURE = BFUNCTION__CLOSURE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__TYPE_CALCULATOR = BFUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__CONTAINER = BFUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__CLASS_FUNCTION = BFUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__VARARG_ARRAY_TYPE = BFUNCTION__VARARG_ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION__FUNC_EXPR = BFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>B3 Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_FEATURE_COUNT = BFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__VISIBILITY = BFUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__FINAL = BFUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__EXECUTION_MODE = BFUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__NAME = BFUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__GUARD = BFUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__PARAMETER_TYPES = BFUNCTION__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__EXCEPTION_TYPES = BFUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__TYPE_PARAMETERS = BFUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__PARAMETER_NAMES = BFUNCTION__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__PARAMETERS = BFUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__VAR_ARGS = BFUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__DOCUMENTATION = BFUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__RETURN_TYPE = BFUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__CLOSURE = BFUNCTION__CLOSURE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__TYPE_CALCULATOR = BFUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__CONTAINER = BFUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__CLASS_FUNCTION = BFUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__VARARG_ARRAY_TYPE = BFUNCTION__VARARG_ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__METHOD = BFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION__CALL_TYPE = BFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BJava Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BJAVA_FUNCTION_FEATURE_COUNT = BFUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONTAINER__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>BFunction Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE__NAME = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE__FINAL = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE__IMMUTABLE = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE__VALUE_EXPR = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE__TYPE = BEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BDef Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_VALUE_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREGULAR_EXPRESSION__PATTERN = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BRegular Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREGULAR_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>BParameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__EXPR = 1;

	/**
	 * The number of structural features of the '<em>BParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_DECLARATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_DECLARATION__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_DECLARATION__IMMUTABLE = 3;

	/**
	 * The number of structural features of the '<em>BParameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_DECLARATION_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE__FUNCTION_TYPE = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE__RETURN_TYPE = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE__PARAMETER_TYPES = ITYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE__VAR_ARGS = ITYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE__TYPE_CALCULATOR = ITYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>B3 Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNCTION_TYPE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IParameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPARAMETERIZED_TYPE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl <em>B3 Parameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3ParameterizedType()
	 * @generated
	 */
	int B3_PARAMETERIZED_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Owner Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_PARAMETERIZED_TYPE__OWNER_TYPE = IPARAMETERIZED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_PARAMETERIZED_TYPE__RAW_TYPE = IPARAMETERIZED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Arguments List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST = IPARAMETERIZED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>B3 Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_PARAMETERIZED_TYPE_FEATURE_COUNT = IPARAMETERIZED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link java.lang.reflect.WildcardType <em>IWildcard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.WildcardType
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIWildcardType()
	 * @generated
	 */
	int IWILDCARD_TYPE = 51;

	/**
	 * The number of structural features of the '<em>IWildcard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWILDCARD_TYPE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl <em>B3 Wildcard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3WildcardType()
	 * @generated
	 */
	int B3_WILDCARD_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Lower Bounds List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST = IWILDCARD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bounds List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST = IWILDCARD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>B3 Wildcard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_WILDCARD_TYPE_FEATURE_COUNT = IWILDCARD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link java.lang.reflect.TypeVariable <em>IType Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.TypeVariable
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getITypeVariable()
	 * @generated
	 */
	int ITYPE_VARIABLE = 53;

	/**
	 * The number of structural features of the '<em>IType Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_VARIABLE_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl <em>B3 Func Type Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3FuncTypeVariable()
	 * @generated
	 */
	int B3_FUNC_TYPE_VARIABLE = 54;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNC_TYPE_VARIABLE__BOUNDS = ITYPE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION = ITYPE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNC_TYPE_VARIABLE__NAME = ITYPE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>B3 Func Type Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_FUNC_TYPE_VARIABLE_FEATURE_COUNT = ITYPE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3JavaImportImpl <em>B3 Java Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3JavaImportImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3JavaImport()
	 * @generated
	 */
	int B3_JAVA_IMPORT = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_JAVA_IMPORT__NAME = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_JAVA_IMPORT__QUALIFIED_NAME = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_JAVA_IMPORT__TYPE = ITYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reexport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_JAVA_IMPORT__REEXPORT = ITYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>B3 Java Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_JAVA_IMPORT_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralTypeImpl <em>BLiteral Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralTypeImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralType()
	 * @generated
	 */
	int BLITERAL_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_TYPE__TYPE = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BLiteral Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLITERAL_TYPE_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardFunctionImpl <em>BGuard Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardFunctionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuardFunction()
	 * @generated
	 */
	int BGUARD_FUNCTION = 57;

	/**
	 * The feature id for the '<em><b>Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BGUARD_FUNCTION__FUNC = BGUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BGuard Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BGUARD_FUNCTION_FEATURE_COUNT = BGUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorImpl <em>BType Calculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTypeCalculator()
	 * @generated
	 */
	int BTYPE_CALCULATOR = 58;

	/**
	 * The number of structural features of the '<em>BType Calculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_CALCULATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorFunctionImpl <em>BType Calculator Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorFunctionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTypeCalculatorFunction()
	 * @generated
	 */
	int BTYPE_CALCULATOR_FUNCTION = 59;

	/**
	 * The feature id for the '<em><b>Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_CALCULATOR_FUNCTION__FUNC = BTYPE_CALCULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BType Calculator Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_CALCULATOR_FUNCTION_FEATURE_COUNT = BTYPE_CALCULATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInstanceContextImpl <em>BInstance Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInstanceContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInstanceContext()
	 * @generated
	 */
	int BINSTANCE_CONTEXT = 60;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__PARENT_CONTEXT = BINNER_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__VALUE_MAP = BINNER_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__FUNC_STORE = BINNER_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__EFFECTIVE_CONCERNS = BINNER_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__PROGRESS_MONITOR = BINNER_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__OUTER_CONTEXT = BINNER_CONTEXT__OUTER_CONTEXT;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT__INSTANCE = BINNER_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BInstance Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINSTANCE_CONTEXT_FEATURE_COUNT = BINNER_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefPropertyImpl <em>BDef Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefPropertyImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefProperty()
	 * @generated
	 */
	int BDEF_PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__NAME = BDEF_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__FINAL = BDEF_VALUE__FINAL;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__IMMUTABLE = BDEF_VALUE__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__VALUE_EXPR = BDEF_VALUE__VALUE_EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__TYPE = BDEF_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY__MUTABLE = BDEF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BDef Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEF_PROPERTY_FEATURE_COUNT = BDEF_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAdviceImpl <em>BAdvice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAdviceImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAdvice()
	 * @generated
	 */
	int BADVICE = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADVICE__NAME = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BAdvice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADVICE_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl <em>BProperty Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertySet()
	 * @generated
	 */
	int BPROPERTY_SET = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET__NAME = BADVICE__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET__EXTENDS = BADVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET__OPERATIONS = BADVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET__PROPERTIES_FILE = BADVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BProperty Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET_FEATURE_COUNT = BADVICE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefaultPropertySetImpl <em>BDefault Property Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefaultPropertySetImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefaultPropertySet()
	 * @generated
	 */
	int BDEFAULT_PROPERTY_SET = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEFAULT_PROPERTY_SET__NAME = BPROPERTY_SET__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEFAULT_PROPERTY_SET__EXTENDS = BPROPERTY_SET__EXTENDS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEFAULT_PROPERTY_SET__OPERATIONS = BPROPERTY_SET__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Properties File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEFAULT_PROPERTY_SET__PROPERTIES_FILE = BPROPERTY_SET__PROPERTIES_FILE;

	/**
	 * The number of structural features of the '<em>BDefault Property Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDEFAULT_PROPERTY_SET_FEATURE_COUNT = BPROPERTY_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyOperationImpl <em>BProperty Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyOperationImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertyOperation()
	 * @generated
	 */
	int BPROPERTY_OPERATION = 64;

	/**
	 * The number of structural features of the '<em>BProperty Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_OPERATION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyDefinitionOperationImpl <em>BProperty Definition Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyDefinitionOperationImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertyDefinitionOperation()
	 * @generated
	 */
	int BPROPERTY_DEFINITION_OPERATION = 65;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_DEFINITION_OPERATION__DEFINITION = BPROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BProperty Definition Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_DEFINITION_OPERATION_FEATURE_COUNT = BPROPERTY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConditionalPropertyOperationImpl <em>BConditional Property Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConditionalPropertyOperationImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConditionalPropertyOperation()
	 * @generated
	 */
	int BCONDITIONAL_PROPERTY_OPERATION = 66;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR = BPROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONDITIONAL_PROPERTY_OPERATION__BODY = BPROPERTY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BConditional Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONDITIONAL_PROPERTY_OPERATION_FEATURE_COUNT = BPROPERTY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetOperationImpl <em>BProperty Set Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetOperationImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertySetOperation()
	 * @generated
	 */
	int BPROPERTY_SET_OPERATION = 67;

	/**
	 * The feature id for the '<em><b>Property Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET_OPERATION__PROPERTY_SET = BPROPERTY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BProperty Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_SET_OPERATION_FEATURE_COUNT = BPROPERTY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl <em>BConcern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConcern()
	 * @generated
	 */
	int BCONCERN = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__NAME = BADVICE__NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__FUNCTIONS = BADVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__DOCUMENTATION = BADVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__SUPER_CONCERNS = BADVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__PROPERTY_SETS = BADVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN__CONTEXTS = BADVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BConcern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN_FEATURE_COUNT = BADVICE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl <em>BWith Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWithExpression()
	 * @generated
	 */
	int BWITH_EXPRESSION = 70;

	/**
	 * The feature id for the '<em><b>Referenced Advice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_EXPRESSION__REFERENCED_ADVICE = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_EXPRESSION__PROPERTY_SETS = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_EXPRESSION__CONCERNS = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_EXPRESSION__FUNC_EXPR = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BWith Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl <em>BConcern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConcernContext()
	 * @generated
	 */
	int BCONCERN_CONTEXT = 71;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN_CONTEXT__FUNCTIONS = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN_CONTEXT__DOCUMENTATION = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BConcern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCERN_CONTEXT_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl <em>BFunction Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionWrapper()
	 * @generated
	 */
	int BFUNCTION_WRAPPER = 73;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__VISIBILITY = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__FINAL = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__EXECUTION_MODE = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__NAME = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__GUARD = BEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__PARAMETER_TYPES = BEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__EXCEPTION_TYPES = BEXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__TYPE_PARAMETERS = BEXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__PARAMETER_NAMES = BEXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__PARAMETERS = BEXPRESSION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__VAR_ARGS = BEXPRESSION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__DOCUMENTATION = BEXPRESSION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__RETURN_TYPE = BEXPRESSION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__CLOSURE = BEXPRESSION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__TYPE_CALCULATOR = BEXPRESSION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__CONTAINER = BEXPRESSION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__CLASS_FUNCTION = BEXPRESSION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__VARARG_ARRAY_TYPE = BEXPRESSION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Around Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__AROUND_EXPR = BEXPRESSION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__ORIGINAL = BEXPRESSION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Parameter Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__PARAMETER_MAP = BEXPRESSION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER__VARARGS_NAME = BEXPRESSION_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>BFunction Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_WRAPPER_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl <em>BName Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBNamePredicate()
	 * @generated
	 */
	int BNAME_PREDICATE = 74;

	/**
	 * The feature id for the '<em><b>Name Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAME_PREDICATE__NAME_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAME_PREDICATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>BName Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNAME_PREDICATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionNamePredicateImpl <em>BFunction Name Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionNamePredicateImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionNamePredicate()
	 * @generated
	 */
	int BFUNCTION_NAME_PREDICATE = 75;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_NAME_PREDICATE__NAME_PREDICATE = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BFunction Name Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_NAME_PREDICATE_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl <em>BFunction Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionConcernContext()
	 * @generated
	 */
	int BFUNCTION_CONCERN_CONTEXT = 76;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__FUNCTIONS = BCONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__DOCUMENTATION = BCONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE = BCONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__PARAMETERS = BCONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR = BCONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__VAR_ARGS = BCONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Match Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT__MATCH_PARAMETERS = BCONCERN_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BFunction Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFUNCTION_CONCERN_CONTEXT_FEATURE_COUNT = BCONCERN_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterPredicateImpl <em>BParameter Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterPredicateImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterPredicate()
	 * @generated
	 */
	int BPARAMETER_PREDICATE = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_PREDICATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Predicate Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_PREDICATE__TYPE_PREDICATE_OP = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_PREDICATE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>BParameter Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_PREDICATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BProceedExpressionImpl <em>BProceed Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BProceedExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBProceedExpression()
	 * @generated
	 */
	int BPROCEED_EXPRESSION = 78;

	/**
	 * The number of structural features of the '<em>BProceed Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROCEED_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDelegatingContextImpl <em>BDelegating Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDelegatingContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDelegatingContext()
	 * @generated
	 */
	int BDELEGATING_CONTEXT = 79;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__PARENT_CONTEXT = BINNER_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__VALUE_MAP = BINNER_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__FUNC_STORE = BINNER_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__EFFECTIVE_CONCERNS = BINNER_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__PROGRESS_MONITOR = BINNER_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT__OUTER_CONTEXT = BINNER_CONTEXT__OUTER_CONTEXT;

	/**
	 * The number of structural features of the '<em>BDelegating Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDELEGATING_CONTEXT_FEATURE_COUNT = BINNER_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl <em>BWrapping Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWrappingContext()
	 * @generated
	 */
	int BWRAPPING_CONTEXT = 80;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__PARENT_CONTEXT = BDELEGATING_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__VALUE_MAP = BDELEGATING_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__FUNC_STORE = BDELEGATING_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__EFFECTIVE_CONCERNS = BDELEGATING_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__PROGRESS_MONITOR = BDELEGATING_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__OUTER_CONTEXT = BDELEGATING_CONTEXT__OUTER_CONTEXT;

	/**
	 * The feature id for the '<em><b>Function Wrapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__FUNCTION_WRAPPER = BDELEGATING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wrapped Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__WRAPPED_CONTEXT = BDELEGATING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__PARAMETERS = BDELEGATING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__PARAMETER_TYPES = BDELEGATING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT__VARARGS_NAME = BDELEGATING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BWrapping Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWRAPPING_CONTEXT_FEATURE_COUNT = BDELEGATING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3MetaClassImpl <em>B3 Meta Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3MetaClassImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3MetaClass()
	 * @generated
	 */
	int B3_META_CLASS = 81;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_META_CLASS__INSTANCE_CLASS = ITYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>B3 Meta Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int B3_META_CLASS_FEATURE_COUNT = ITYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionWrapperImpl <em>BExpression Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionWrapperImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExpressionWrapper()
	 * @generated
	 */
	int BEXPRESSION_WRAPPER = 82;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXPRESSION_WRAPPER__ORIGINAL = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BExpression Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXPRESSION_WRAPPER_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl <em>BWith Context Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWithContextExpression()
	 * @generated
	 */
	int BWITH_CONTEXT_EXPRESSION = 83;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_CONTEXT_EXPRESSION__ALIAS = BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_CONTEXT_EXPRESSION__EXPR = BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK = BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BWith Context Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWITH_CONTEXT_EXPRESSION_FEATURE_COUNT = BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.Visibility
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode <em>Execution Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getExecutionMode()
	 * @generated
	 */
	int EXECUTION_MODE = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType <em>BJava Call Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBJavaCallType()
	 * @generated
	 */
	int BJAVA_CALL_TYPE = 86;

	/**
	 * The meta object id for the '<em>Core Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.CoreException
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getCoreException()
	 * @generated
	 */
	int CORE_EXCEPTION = 87;


	/**
	 * The meta object id for the '<em>Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Type
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 88;

	/**
	 * The meta object id for the '<em>Object Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getObjectArray()
	 * @generated
	 */
	int OBJECT_ARRAY = 89;


	/**
	 * The meta object id for the '<em>Value Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.ValueMap
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getValueMap()
	 * @generated
	 */
	int VALUE_MAP = 90;


	/**
	 * The meta object id for the '<em>B3 Engine Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.B3EngineException
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3EngineException()
	 * @generated
	 */
	int B3_ENGINE_EXCEPTION = 91;


	/**
	 * The meta object id for the '<em>B3 Expression Cache</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.B3ExpressionCache
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3ExpressionCache()
	 * @generated
	 */
	int B3_EXPRESSION_CACHE = 92;


	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 93;

	/**
	 * The meta object id for the '<em>LValue</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.LValue
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getLValue()
	 * @generated
	 */
	int LVALUE = 94;

	/**
	 * The meta object id for the '<em>Type Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getTypeArray()
	 * @generated
	 */
	int TYPE_ARRAY = 95;

	/**
	 * The meta object id for the '<em>Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 96;

	/**
	 * The meta object id for the '<em>Type Variable Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getTypeVariableArray()
	 * @generated
	 */
	int TYPE_VARIABLE_ARRAY = 97;

	/**
	 * The meta object id for the '<em>Func Store</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.B3FuncStore
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getFuncStore()
	 * @generated
	 */
	int FUNC_STORE = 98;

	/**
	 * The meta object id for the '<em>Regexp Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.regex.Pattern
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getRegexpPattern()
	 * @generated
	 */
	int REGEXP_PATTERN = 99;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 100;

	/**
	 * The meta object id for the '<em>B3 Dynamic Class Loader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.core.B3DynamicClassLoader
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3DynamicClassLoader()
	 * @generated
	 */
	int B3_DYNAMIC_CLASS_LOADER = 101;

	/**
	 * The meta object id for the '<em>Java Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getJavaIterator()
	 * @generated
	 */
	int JAVA_ITERATOR = 102;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getURI()
	 * @generated
	 */
	int URI = 103;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 104;

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression <em>BExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BExpression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression
	 * @generated
	 */
	EClass getBExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLineReference <em>BLine Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLine Reference</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLineReference
	 * @generated
	 */
	EClass getBLineReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext <em>BExecution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BExecution Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext
	 * @generated
	 */
	EClass getBExecutionContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getParentContext()
	 * @see #getBExecutionContext()
	 * @generated
	 */
	EReference getBExecutionContext_ParentContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Map</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValueMap()
	 * @see #getBExecutionContext()
	 * @generated
	 */
	EAttribute getBExecutionContext_ValueMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFuncStore <em>Func Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Func Store</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFuncStore()
	 * @see #getBExecutionContext()
	 * @generated
	 */
	EAttribute getBExecutionContext_FuncStore();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getEffectiveConcerns <em>Effective Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective Concerns</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getEffectiveConcerns()
	 * @see #getBExecutionContext()
	 * @generated
	 */
	EReference getBExecutionContext_EffectiveConcerns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Monitor</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getProgressMonitor()
	 * @see #getBExecutionContext()
	 * @generated
	 */
	EAttribute getBExecutionContext_ProgressMonitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression <em>BIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BIf Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BIfExpression
	 * @generated
	 */
	EClass getBIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getConditionExpr <em>Condition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getConditionExpr()
	 * @see #getBIfExpression()
	 * @generated
	 */
	EReference getBIfExpression_ConditionExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getThenExpr <em>Then Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getThenExpr()
	 * @see #getBIfExpression()
	 * @generated
	 */
	EReference getBIfExpression_ThenExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getElseExpr <em>Else Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getElseExpr()
	 * @see #getBIfExpression()
	 * @generated
	 */
	EReference getBIfExpression_ElseExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression <em>BSwitch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSwitch Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression
	 * @generated
	 */
	EClass getBSwitchExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#getSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#getSwitchExpression()
	 * @see #getBSwitchExpression()
	 * @generated
	 */
	EReference getBSwitchExpression_SwitchExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#getCaseList <em>Case List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#getCaseList()
	 * @see #getBSwitchExpression()
	 * @generated
	 */
	EReference getBSwitchExpression_CaseList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase <em>BCase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCase</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase
	 * @generated
	 */
	EClass getBCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getConditionExpr <em>Condition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase#getConditionExpr()
	 * @see #getBCase()
	 * @generated
	 */
	EReference getBCase_ConditionExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getThenExpr <em>Then Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase#getThenExpr()
	 * @see #getBCase()
	 * @generated
	 */
	EReference getBCase_ThenExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression <em>BTry Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTry Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTryExpression
	 * @generated
	 */
	EClass getBTryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getTryExpr <em>Try Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Try Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getTryExpr()
	 * @see #getBTryExpression()
	 * @generated
	 */
	EReference getBTryExpression_TryExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getCatchBlocks <em>Catch Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Blocks</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getCatchBlocks()
	 * @see #getBTryExpression()
	 * @generated
	 */
	EReference getBTryExpression_CatchBlocks();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getFinallyExpr <em>Finally Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getFinallyExpr()
	 * @see #getBTryExpression()
	 * @generated
	 */
	EReference getBTryExpression_FinallyExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch <em>BCatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCatch</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch
	 * @generated
	 */
	EClass getBCatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr <em>Catch Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch#getCatchExpr()
	 * @see #getBCatch()
	 * @generated
	 */
	EReference getBCatch_CatchExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch#getExceptionType()
	 * @see #getBCatch()
	 * @generated
	 */
	EReference getBCatch_ExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getVarname <em>Varname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varname</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch#getVarname()
	 * @see #getBCatch()
	 * @generated
	 */
	EAttribute getBCatch_Varname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression <em>BBinary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBinary Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression
	 * @generated
	 */
	EClass getBBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression#getLeftExpr()
	 * @see #getBBinaryExpression()
	 * @generated
	 */
	EReference getBBinaryExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression#getRightExpr()
	 * @see #getBBinaryExpression()
	 * @generated
	 */
	EReference getBBinaryExpression_RightExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BOrExpression <em>BOr Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOr Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BOrExpression
	 * @generated
	 */
	EClass getBOrExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAndExpression <em>BAnd Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAnd Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAndExpression
	 * @generated
	 */
	EClass getBAndExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression <em>BChained Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BChained Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression
	 * @generated
	 */
	EClass getBChainedExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression#getExpressions()
	 * @see #getBChainedExpression()
	 * @generated
	 */
	EReference getBChainedExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression <em>BUnary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUnary Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression
	 * @generated
	 */
	EClass getBUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression#getExpr()
	 * @see #getBUnaryExpression()
	 * @generated
	 */
	EReference getBUnaryExpression_Expr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression <em>BThrow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BThrow Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression
	 * @generated
	 */
	EClass getBThrowExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression <em>BUnary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUnary Op Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression
	 * @generated
	 */
	EClass getBUnaryOpExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression#getFunctionName()
	 * @see #getBUnaryOpExpression()
	 * @generated
	 */
	EAttribute getBUnaryOpExpression_FunctionName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression <em>BUnary Post Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUnary Post Op Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression
	 * @generated
	 */
	EClass getBUnaryPostOpExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression <em>BBinary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBinary Op Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression
	 * @generated
	 */
	EClass getBBinaryOpExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression#getFunctionName()
	 * @see #getBBinaryOpExpression()
	 * @generated
	 */
	EAttribute getBBinaryOpExpression_FunctionName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression <em>BCached Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCached Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression
	 * @generated
	 */
	EClass getBCachedExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression <em>BLiteral Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLiteral Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression
	 * @generated
	 */
	EClass getBLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression#getValue()
	 * @see #getBLiteralExpression()
	 * @generated
	 */
	EAttribute getBLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression <em>BLiteral List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLiteral List Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression
	 * @generated
	 */
	EClass getBLiteralListExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression#getEntries()
	 * @see #getBLiteralListExpression()
	 * @generated
	 */
	EReference getBLiteralListExpression_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression#getEntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression#getEntryType()
	 * @see #getBLiteralListExpression()
	 * @generated
	 */
	EReference getBLiteralListExpression_EntryType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression <em>BLiteral Map Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLiteral Map Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression
	 * @generated
	 */
	EClass getBLiteralMapExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getEntries()
	 * @see #getBLiteralMapExpression()
	 * @generated
	 */
	EReference getBLiteralMapExpression_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getKeyType()
	 * @see #getBLiteralMapExpression()
	 * @generated
	 */
	EReference getBLiteralMapExpression_KeyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression#getValueType()
	 * @see #getBLiteralMapExpression()
	 * @generated
	 */
	EReference getBLiteralMapExpression_ValueType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BMapEntry <em>BMap Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BMap Entry</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BMapEntry
	 * @generated
	 */
	EClass getBMapEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BMapEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BMapEntry#getKey()
	 * @see #getBMapEntry()
	 * @generated
	 */
	EReference getBMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BMapEntry#getValue()
	 * @see #getBMapEntry()
	 * @generated
	 */
	EReference getBMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression <em>BFeature Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFeature Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression
	 * @generated
	 */
	EClass getBFeatureExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getObjExpr <em>Obj Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getObjExpr()
	 * @see #getBFeatureExpression()
	 * @generated
	 */
	EReference getBFeatureExpression_ObjExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getFeatureName()
	 * @see #getBFeatureExpression()
	 * @generated
	 */
	EAttribute getBFeatureExpression_FeatureName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAtExpression <em>BAt Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAt Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAtExpression
	 * @generated
	 */
	EClass getBAtExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BAtExpression#getObjExpr <em>Obj Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAtExpression#getObjExpr()
	 * @see #getBAtExpression()
	 * @generated
	 */
	EReference getBAtExpression_ObjExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BAtExpression#getIndexExpr <em>Index Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAtExpression#getIndexExpr()
	 * @see #getBAtExpression()
	 * @generated
	 */
	EReference getBAtExpression_IndexExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression <em>BVariable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BVariable Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression
	 * @generated
	 */
	EClass getBVariableExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression#getName()
	 * @see #getBVariableExpression()
	 * @generated
	 */
	EAttribute getBVariableExpression_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallExpression <em>BCall Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCall Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallExpression
	 * @generated
	 */
	EClass getBCallExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallExpression#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallExpression#getFuncExpr()
	 * @see #getBCallExpression()
	 * @generated
	 */
	EReference getBCallExpression_FuncExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCallExpression#getName()
	 * @see #getBCallExpression()
	 * @generated
	 */
	EAttribute getBCallExpression_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression <em>BParameterized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameterized Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression
	 * @generated
	 */
	EClass getBParameterizedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression#getParameterList()
	 * @see #getBParameterizedExpression()
	 * @generated
	 */
	EReference getBParameterizedExpression_ParameterList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny <em>BLiteral Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLiteral Any</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny
	 * @generated
	 */
	EClass getBLiteralAny();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression <em>BCreate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BCreate Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression
	 * @generated
	 */
	EClass getBCreateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getContextBlock <em>Context Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Block</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getContextBlock()
	 * @see #getBCreateExpression()
	 * @generated
	 */
	EReference getBCreateExpression_ContextBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction <em>IFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFunction</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction
	 * @generated
	 */
	EClass getIFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVisibility()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#isFinal()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Mode</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExecutionMode()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_ExecutionMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getName()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getGuard()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_Guard();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Types</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_ParameterTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExceptionTypes <em>Exception Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Types</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getExceptionTypes()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_ExceptionTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeParameters()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_TypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames <em>Parameter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Names</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_ParameterNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameters()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#isVarArgs()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_VarArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getDocumentation()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnType()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getClosure <em>Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Closure</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getClosure()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_Closure();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeCalculator <em>Type Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Calculator</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getTypeCalculator()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_TypeCalculator();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getContainer()
	 * @see #getIFunction()
	 * @generated
	 */
	EReference getIFunction_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#isClassFunction <em>Class Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Function</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#isClassFunction()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_ClassFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVarargArrayType <em>Vararg Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vararg Array Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVarargArrayType()
	 * @see #getIFunction()
	 * @generated
	 */
	EAttribute getIFunction_VarargArrayType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getAlias()
	 * @see #getBCreateExpression()
	 * @generated
	 */
	EAttribute getBCreateExpression_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getTypeExpr <em>Type Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getTypeExpr()
	 * @see #getBCreateExpression()
	 * @generated
	 */
	EReference getBCreateExpression_TypeExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction <em>BFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFunction</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunction
	 * @generated
	 */
	EClass getBFunction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper <em>BFunction Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFunction Wrapper</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper
	 * @generated
	 */
	EClass getBFunctionWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getAroundExpr <em>Around Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Around Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getAroundExpr()
	 * @see #getBFunctionWrapper()
	 * @generated
	 */
	EReference getBFunctionWrapper_AroundExpr();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getOriginal()
	 * @see #getBFunctionWrapper()
	 * @generated
	 */
	EReference getBFunctionWrapper_Original();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getParameterMap <em>Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Map</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getParameterMap()
	 * @see #getBFunctionWrapper()
	 * @generated
	 */
	EAttribute getBFunctionWrapper_ParameterMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getVarargsName <em>Varargs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varargs Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper#getVarargsName()
	 * @see #getBFunctionWrapper()
	 * @generated
	 */
	EAttribute getBFunctionWrapper_VarargsName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate <em>BName Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BName Predicate</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate
	 * @generated
	 */
	EClass getBNamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate#getNamePattern <em>Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Pattern</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate#getNamePattern()
	 * @see #getBNamePredicate()
	 * @generated
	 */
	EReference getBNamePredicate_NamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate#getName()
	 * @see #getBNamePredicate()
	 * @generated
	 */
	EAttribute getBNamePredicate_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate <em>BFunction Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFunction Name Predicate</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate
	 * @generated
	 */
	EClass getBFunctionNamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate#getNamePredicate <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate#getNamePredicate()
	 * @see #getBFunctionNamePredicate()
	 * @generated
	 */
	EReference getBFunctionNamePredicate_NamePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext <em>BFunction Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFunction Concern Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext
	 * @generated
	 */
	EClass getBFunctionConcernContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getNamePredicate <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getNamePredicate()
	 * @see #getBFunctionConcernContext()
	 * @generated
	 */
	EReference getBFunctionConcernContext_NamePredicate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getParameters()
	 * @see #getBFunctionConcernContext()
	 * @generated
	 */
	EReference getBFunctionConcernContext_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getFuncExpr()
	 * @see #getBFunctionConcernContext()
	 * @generated
	 */
	EReference getBFunctionConcernContext_FuncExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#isVarArgs()
	 * @see #getBFunctionConcernContext()
	 * @generated
	 */
	EAttribute getBFunctionConcernContext_VarArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#isMatchParameters <em>Match Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#isMatchParameters()
	 * @see #getBFunctionConcernContext()
	 * @generated
	 */
	EAttribute getBFunctionConcernContext_MatchParameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate <em>BParameter Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter Predicate</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate
	 * @generated
	 */
	EClass getBParameterPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getName()
	 * @see #getBParameterPredicate()
	 * @generated
	 */
	EAttribute getBParameterPredicate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getType()
	 * @see #getBParameterPredicate()
	 * @generated
	 */
	EReference getBParameterPredicate_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getTypePredicateOp <em>Type Predicate Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Predicate Op</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getTypePredicateOp()
	 * @see #getBParameterPredicate()
	 * @generated
	 */
	EAttribute getBParameterPredicate_TypePredicateOp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression <em>BProceed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProceed Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression
	 * @generated
	 */
	EClass getBProceedExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext <em>BDelegating Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDelegating Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext
	 * @generated
	 */
	EClass getBDelegatingContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext <em>BWrapping Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWrapping Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext
	 * @generated
	 */
	EClass getBWrappingContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getFunctionWrapper <em>Function Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Wrapper</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getFunctionWrapper()
	 * @see #getBWrappingContext()
	 * @generated
	 */
	EReference getBWrappingContext_FunctionWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getWrappedContext <em>Wrapped Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wrapped Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getWrappedContext()
	 * @see #getBWrappingContext()
	 * @generated
	 */
	EReference getBWrappingContext_WrappedContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameters()
	 * @see #getBWrappingContext()
	 * @generated
	 */
	EAttribute getBWrappingContext_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Types</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getParameterTypes()
	 * @see #getBWrappingContext()
	 * @generated
	 */
	EAttribute getBWrappingContext_ParameterTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getVarargsName <em>Varargs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varargs Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext#getVarargsName()
	 * @see #getBWrappingContext()
	 * @generated
	 */
	EAttribute getBWrappingContext_VarargsName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass <em>B3 Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Meta Class</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass
	 * @generated
	 */
	EClass getB3MetaClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass#getInstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass#getInstanceClass()
	 * @see #getB3MetaClass()
	 * @generated
	 */
	EAttribute getB3MetaClass_InstanceClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper <em>BExpression Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BExpression Wrapper</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper
	 * @generated
	 */
	EClass getBExpressionWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper#getOriginal()
	 * @see #getBExpressionWrapper()
	 * @generated
	 */
	EReference getBExpressionWrapper_Original();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression <em>BWith Context Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWith Context Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression
	 * @generated
	 */
	EClass getBWithContextExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getAlias()
	 * @see #getBWithContextExpression()
	 * @generated
	 */
	EAttribute getBWithContextExpression_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getExpr()
	 * @see #getBWithContextExpression()
	 * @generated
	 */
	EReference getBWithContextExpression_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getContextBlock <em>Context Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Block</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression#getContextBlock()
	 * @see #getBWithContextExpression()
	 * @generated
	 */
	EReference getBWithContextExpression_ContextBlock();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuard <em>BGuard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BGuard</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuard
	 * @generated
	 */
	EClass getBGuard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression <em>BGuard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BGuard Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression
	 * @generated
	 */
	EClass getBGuardExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression#getGuardExpr <em>Guard Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression#getGuardExpr()
	 * @see #getBGuardExpression()
	 * @generated
	 */
	EReference getBGuardExpression_GuardExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BSystemContext <em>BSystem Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSystem Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSystemContext
	 * @generated
	 */
	EClass getBSystemContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BContext <em>BContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BContext</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BContext
	 * @generated
	 */
	EClass getBContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext <em>BInner Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInner Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInnerContext
	 * @generated
	 */
	EClass getBInnerContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext#getOuterContext <em>Outer Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInnerContext#getOuterContext()
	 * @see #getBInnerContext()
	 * @generated
	 */
	EReference getBInnerContext_OuterContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext <em>BInvocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInvocation Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext
	 * @generated
	 */
	EClass getBInvocationContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#getExpressionCache <em>Expression Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Cache</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#getExpressionCache()
	 * @see #getBInvocationContext()
	 * @generated
	 */
	EAttribute getBInvocationContext_ExpressionCache();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression <em>BUnary Pre Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BUnary Pre Op Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression
	 * @generated
	 */
	EClass getBUnaryPreOpExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression <em>BAssignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAssignment Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression
	 * @generated
	 */
	EClass getBAssignmentExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Function <em>B3 Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Function</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3Function
	 * @generated
	 */
	EClass getB3Function();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Function#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3Function#getFuncExpr()
	 * @see #getB3Function()
	 * @generated
	 */
	EReference getB3Function_FuncExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction <em>BJava Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BJava Function</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction
	 * @generated
	 */
	EClass getBJavaFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getMethod()
	 * @see #getBJavaFunction()
	 * @generated
	 */
	EAttribute getBJavaFunction_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getCallType <em>Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction#getCallType()
	 * @see #getBJavaFunction()
	 * @generated
	 */
	EAttribute getBJavaFunction_CallType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer <em>BFunction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFunction Container</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * @generated
	 */
	EClass getBFunctionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer#getFunctions()
	 * @see #getBFunctionContainer()
	 * @generated
	 */
	EReference getBFunctionContainer_Functions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue <em>BDef Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDef Value</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue
	 * @generated
	 */
	EClass getBDefValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getName()
	 * @see #getBDefValue()
	 * @generated
	 */
	EAttribute getBDefValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isFinal()
	 * @see #getBDefValue()
	 * @generated
	 */
	EAttribute getBDefValue_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue#isImmutable()
	 * @see #getBDefValue()
	 * @generated
	 */
	EAttribute getBDefValue_Immutable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getValueExpr <em>Value Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getValueExpr()
	 * @see #getBDefValue()
	 * @generated
	 */
	EReference getBDefValue_ValueExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefValue#getType()
	 * @see #getBDefValue()
	 * @generated
	 */
	EReference getBDefValue_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression <em>BRegular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BRegular Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression
	 * @generated
	 */
	EClass getBRegularExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression#getPattern()
	 * @see #getBRegularExpression()
	 * @generated
	 */
	EAttribute getBRegularExpression_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterList <em>BParameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterList
	 * @generated
	 */
	EClass getBParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterList#getParameters()
	 * @see #getBParameterList()
	 * @generated
	 */
	EReference getBParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameter <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameter
	 * @generated
	 */
	EClass getBParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameter#getName()
	 * @see #getBParameter()
	 * @generated
	 */
	EAttribute getBParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameter#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameter#getExpr()
	 * @see #getBParameter()
	 * @generated
	 */
	EReference getBParameter_Expr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration <em>BParameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter Declaration</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration
	 * @generated
	 */
	EClass getBParameterDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#getName()
	 * @see #getBParameterDeclaration()
	 * @generated
	 */
	EAttribute getBParameterDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#getType()
	 * @see #getBParameterDeclaration()
	 * @generated
	 */
	EReference getBParameterDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#isFinal()
	 * @see #getBParameterDeclaration()
	 * @generated
	 */
	EAttribute getBParameterDeclaration_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration#isImmutable()
	 * @see #getBParameterDeclaration()
	 * @generated
	 */
	EAttribute getBParameterDeclaration_Immutable();

	/**
	 * Returns the meta object for class '{@link java.lang.reflect.Type <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType</em>'.
	 * @see java.lang.reflect.Type
	 * @model instanceClass="java.lang.reflect.Type"
	 * @generated
	 */
	EClass getIType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType <em>B3 Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Function Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType
	 * @generated
	 */
	EClass getB3FunctionType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getFunctionType()
	 * @see #getB3FunctionType()
	 * @generated
	 */
	EReference getB3FunctionType_FunctionType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getReturnType()
	 * @see #getB3FunctionType()
	 * @generated
	 */
	EReference getB3FunctionType_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Types</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getParameterTypes()
	 * @see #getB3FunctionType()
	 * @generated
	 */
	EReference getB3FunctionType_ParameterTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#isVarArgs()
	 * @see #getB3FunctionType()
	 * @generated
	 */
	EAttribute getB3FunctionType_VarArgs();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getTypeCalculator <em>Type Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Calculator</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType#getTypeCalculator()
	 * @see #getB3FunctionType()
	 * @generated
	 */
	EReference getB3FunctionType_TypeCalculator();

	/**
	 * Returns the meta object for class '{@link java.lang.reflect.ParameterizedType <em>IParameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IParameterized Type</em>'.
	 * @see java.lang.reflect.ParameterizedType
	 * @model instanceClass="java.lang.reflect.ParameterizedType" superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	EClass getIParameterizedType();

	/**
	 * Returns the meta object for class '{@link java.lang.reflect.GenericDeclaration <em>IGeneric Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGeneric Declaration</em>'.
	 * @see java.lang.reflect.GenericDeclaration
	 * @model instanceClass="java.lang.reflect.GenericDeclaration"
	 * @generated
	 */
	EClass getIGenericDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType <em>B3 Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Parameterized Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType
	 * @generated
	 */
	EClass getB3ParameterizedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getOwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getOwnerType()
	 * @see #getB3ParameterizedType()
	 * @generated
	 */
	EReference getB3ParameterizedType_OwnerType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getRawType <em>Raw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raw Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getRawType()
	 * @see #getB3ParameterizedType()
	 * @generated
	 */
	EReference getB3ParameterizedType_RawType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getActualArgumentsList <em>Actual Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actual Arguments List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getActualArgumentsList()
	 * @see #getB3ParameterizedType()
	 * @generated
	 */
	EReference getB3ParameterizedType_ActualArgumentsList();

	/**
	 * Returns the meta object for class '{@link java.lang.reflect.WildcardType <em>IWildcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWildcard Type</em>'.
	 * @see java.lang.reflect.WildcardType
	 * @model instanceClass="java.lang.reflect.WildcardType" superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	EClass getIWildcardType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType <em>B3 Wildcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Wildcard Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType
	 * @generated
	 */
	EClass getB3WildcardType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType#getLowerBoundsList <em>Lower Bounds List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lower Bounds List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType#getLowerBoundsList()
	 * @see #getB3WildcardType()
	 * @generated
	 */
	EReference getB3WildcardType_LowerBoundsList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType#getUpperBoundsList <em>Upper Bounds List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Bounds List</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType#getUpperBoundsList()
	 * @see #getB3WildcardType()
	 * @generated
	 */
	EReference getB3WildcardType_UpperBoundsList();

	/**
	 * Returns the meta object for class '{@link java.lang.reflect.TypeVariable <em>IType Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType Variable</em>'.
	 * @see java.lang.reflect.TypeVariable
	 * @model instanceClass="java.lang.reflect.TypeVariable" typeParameters="D" superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType" DBounds="org.eclipse.b3.backend.evaluator.b3backend.IGenericDeclaration"
	 * @generated
	 */
	EClass getITypeVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable <em>B3 Func Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Func Type Variable</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable
	 * @generated
	 */
	EClass getB3FuncTypeVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getBounds()
	 * @see #getB3FuncTypeVariable()
	 * @generated
	 */
	EAttribute getB3FuncTypeVariable_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getGenericDeclaration <em>Generic Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Declaration</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getGenericDeclaration()
	 * @see #getB3FuncTypeVariable()
	 * @generated
	 */
	EReference getB3FuncTypeVariable_GenericDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getName()
	 * @see #getB3FuncTypeVariable()
	 * @generated
	 */
	EAttribute getB3FuncTypeVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport <em>B3 Java Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>B3 Java Import</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport
	 * @generated
	 */
	EClass getB3JavaImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getName()
	 * @see #getB3JavaImport()
	 * @generated
	 */
	EAttribute getB3JavaImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getQualifiedName()
	 * @see #getB3JavaImport()
	 * @generated
	 */
	EAttribute getB3JavaImport_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getType()
	 * @see #getB3JavaImport()
	 * @generated
	 */
	EAttribute getB3JavaImport_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#isReexport <em>Reexport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reexport</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#isReexport()
	 * @see #getB3JavaImport()
	 * @generated
	 */
	EAttribute getB3JavaImport_Reexport();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralType <em>BLiteral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLiteral Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralType
	 * @generated
	 */
	EClass getBLiteralType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BLiteralType#getType()
	 * @see #getBLiteralType()
	 * @generated
	 */
	EReference getBLiteralType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction <em>BGuard Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BGuard Function</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction
	 * @generated
	 */
	EClass getBGuardFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction#getFunc <em>Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BGuardFunction#getFunc()
	 * @see #getBGuardFunction()
	 * @generated
	 */
	EReference getBGuardFunction_Func();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator <em>BType Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType Calculator</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator
	 * @generated
	 */
	EClass getBTypeCalculator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction <em>BType Calculator Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType Calculator Function</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction
	 * @generated
	 */
	EClass getBTypeCalculatorFunction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction#getFunc <em>Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Func</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculatorFunction#getFunc()
	 * @see #getBTypeCalculatorFunction()
	 * @generated
	 */
	EReference getBTypeCalculatorFunction_Func();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext <em>BInstance Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInstance Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext
	 * @generated
	 */
	EClass getBInstanceContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext#getInstance()
	 * @see #getBInstanceContext()
	 * @generated
	 */
	EAttribute getBInstanceContext_Instance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefProperty <em>BDef Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDef Property</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefProperty
	 * @generated
	 */
	EClass getBDefProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefProperty#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefProperty#isMutable()
	 * @see #getBDefProperty()
	 * @generated
	 */
	EAttribute getBDefProperty_Mutable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet <em>BProperty Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty Set</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet
	 * @generated
	 */
	EClass getBPropertySet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getExtends()
	 * @see #getBPropertySet()
	 * @generated
	 */
	EReference getBPropertySet_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getOperations()
	 * @see #getBPropertySet()
	 * @generated
	 */
	EReference getBPropertySet_Operations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getPropertiesFile <em>Properties File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties File</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getPropertiesFile()
	 * @see #getBPropertySet()
	 * @generated
	 */
	EAttribute getBPropertySet_PropertiesFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet <em>BDefault Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDefault Property Set</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet
	 * @generated
	 */
	EClass getBDefaultPropertySet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation <em>BProperty Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty Operation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation
	 * @generated
	 */
	EClass getBPropertyOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation <em>BProperty Definition Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty Definition Operation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation
	 * @generated
	 */
	EClass getBPropertyDefinitionOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation#getDefinition()
	 * @see #getBPropertyDefinitionOperation()
	 * @generated
	 */
	EReference getBPropertyDefinitionOperation_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation <em>BConditional Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConditional Property Operation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation
	 * @generated
	 */
	EClass getBConditionalPropertyOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation#getCondExpr()
	 * @see #getBConditionalPropertyOperation()
	 * @generated
	 */
	EReference getBConditionalPropertyOperation_CondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation#getBody()
	 * @see #getBConditionalPropertyOperation()
	 * @generated
	 */
	EReference getBConditionalPropertyOperation_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation <em>BProperty Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty Set Operation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation
	 * @generated
	 */
	EClass getBPropertySetOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation#getPropertySet <em>Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Set</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation#getPropertySet()
	 * @see #getBPropertySetOperation()
	 * @generated
	 */
	EReference getBPropertySetOperation_PropertySet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BAdvice <em>BAdvice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAdvice</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAdvice
	 * @generated
	 */
	EClass getBAdvice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BAdvice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BAdvice#getName()
	 * @see #getBAdvice()
	 * @generated
	 */
	EAttribute getBAdvice_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern <em>BConcern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConcern</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern
	 * @generated
	 */
	EClass getBConcern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern#getDocumentation()
	 * @see #getBConcern()
	 * @generated
	 */
	EAttribute getBConcern_Documentation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern#getSuperConcerns <em>Super Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Concerns</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern#getSuperConcerns()
	 * @see #getBConcern()
	 * @generated
	 */
	EReference getBConcern_SuperConcerns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern#getPropertySets()
	 * @see #getBConcern()
	 * @generated
	 */
	EReference getBConcern_PropertySets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcern#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcern#getContexts()
	 * @see #getBConcern()
	 * @generated
	 */
	EReference getBConcern_Contexts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression <em>BWith Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWith Expression</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression
	 * @generated
	 */
	EClass getBWithExpression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getReferencedAdvice <em>Referenced Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Advice</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getReferencedAdvice()
	 * @see #getBWithExpression()
	 * @generated
	 */
	EReference getBWithExpression_ReferencedAdvice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getPropertySets()
	 * @see #getBWithExpression()
	 * @generated
	 */
	EReference getBWithExpression_PropertySets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getConcerns()
	 * @see #getBWithExpression()
	 * @generated
	 */
	EReference getBWithExpression_Concerns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BWithExpression#getFuncExpr()
	 * @see #getBWithExpression()
	 * @generated
	 */
	EReference getBWithExpression_FuncExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcernContext <em>BConcern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConcern Context</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcernContext
	 * @generated
	 */
	EClass getBConcernContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcernContext#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcernContext#getDocumentation()
	 * @see #getBConcernContext()
	 * @generated
	 */
	EAttribute getBConcernContext_Documentation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.backend.evaluator.b3backend.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Mode</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @generated
	 */
	EEnum getExecutionMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType <em>BJava Call Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BJava Call Type</em>'.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType
	 * @generated
	 */
	EEnum getBJavaCallType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Core Exception</em>'.
	 * @see org.eclipse.core.runtime.CoreException
	 * @model instanceClass="org.eclipse.core.runtime.CoreException"
	 * @generated
	 */
	EDataType getCoreException();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type</em>'.
	 * @see java.lang.reflect.Type
	 * @model instanceClass="java.lang.reflect.Type"
	 * @generated
	 */
	EDataType getType();

	/**
	 * Returns the meta object for data type '<em>Object Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Array</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getObjectArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.ValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value Map</em>'.
	 * @see org.eclipse.b3.backend.core.ValueMap
	 * @model instanceClass="org.eclipse.b3.backend.core.ValueMap"
	 * @generated
	 */
	EDataType getValueMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.B3EngineException <em>B3 Engine Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>B3 Engine Exception</em>'.
	 * @see org.eclipse.b3.backend.core.B3EngineException
	 * @model instanceClass="org.eclipse.b3.backend.core.B3EngineException"
	 * @generated
	 */
	EDataType getB3EngineException();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.B3ExpressionCache <em>B3 Expression Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>B3 Expression Cache</em>'.
	 * @see org.eclipse.b3.backend.core.B3ExpressionCache
	 * @model instanceClass="org.eclipse.b3.backend.core.B3ExpressionCache" serializeable="false"
	 * @generated
	 */
	EDataType getB3ExpressionCache();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.LValue <em>LValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>LValue</em>'.
	 * @see org.eclipse.b3.backend.core.LValue
	 * @model instanceClass="org.eclipse.b3.backend.core.LValue"
	 * @generated
	 */
	EDataType getLValue();

	/**
	 * Returns the meta object for data type '<em>Type Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Array</em>'.
	 * @model instanceClass="java.lang.reflect.Type[]"
	 * @generated
	 */
	EDataType getTypeArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method"
	 * @generated
	 */
	EDataType getMethod();

	/**
	 * Returns the meta object for data type '<em>Type Variable Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Variable Array</em>'.
	 * @model instanceClass="java.lang.reflect.TypeVariable[]"
	 * @generated
	 */
	EDataType getTypeVariableArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.B3FuncStore <em>Func Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Func Store</em>'.
	 * @see org.eclipse.b3.backend.core.B3FuncStore
	 * @model instanceClass="org.eclipse.b3.backend.core.B3FuncStore"
	 * @generated
	 */
	EDataType getFuncStore();

	/**
	 * Returns the meta object for data type '{@link java.util.regex.Pattern <em>Regexp Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Regexp Pattern</em>'.
	 * @see java.util.regex.Pattern
	 * @model instanceClass="java.util.regex.Pattern"
	 * @generated
	 */
	EDataType getRegexpPattern();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.backend.core.B3DynamicClassLoader <em>B3 Dynamic Class Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>B3 Dynamic Class Loader</em>'.
	 * @see org.eclipse.b3.backend.core.B3DynamicClassLoader
	 * @model instanceClass="org.eclipse.b3.backend.core.B3DynamicClassLoader"
	 * @generated
	 */
	EDataType getB3DynamicClassLoader();

	/**
	 * Returns the meta object for data type '{@link java.util.Iterator <em>Java Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="E"
	 * @generated
	 */
	EDataType getJavaIterator();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	B3backendFactory getB3backendFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl <em>BExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExpression()
		 * @generated
		 */
		EClass BEXPRESSION = eINSTANCE.getBExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLineReferenceImpl <em>BLine Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLineReferenceImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLineReference()
		 * @generated
		 */
		EClass BLINE_REFERENCE = eINSTANCE.getBLineReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl <em>BExecution Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExecutionContext()
		 * @generated
		 */
		EClass BEXECUTION_CONTEXT = eINSTANCE.getBExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Parent Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXECUTION_CONTEXT__PARENT_CONTEXT = eINSTANCE.getBExecutionContext_ParentContext();

		/**
		 * The meta object literal for the '<em><b>Value Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEXECUTION_CONTEXT__VALUE_MAP = eINSTANCE.getBExecutionContext_ValueMap();

		/**
		 * The meta object literal for the '<em><b>Func Store</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEXECUTION_CONTEXT__FUNC_STORE = eINSTANCE.getBExecutionContext_FuncStore();

		/**
		 * The meta object literal for the '<em><b>Effective Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS = eINSTANCE.getBExecutionContext_EffectiveConcerns();

		/**
		 * The meta object literal for the '<em><b>Progress Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEXECUTION_CONTEXT__PROGRESS_MONITOR = eINSTANCE.getBExecutionContext_ProgressMonitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl <em>BIf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BIfExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBIfExpression()
		 * @generated
		 */
		EClass BIF_EXPRESSION = eINSTANCE.getBIfExpression();

		/**
		 * The meta object literal for the '<em><b>Condition Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIF_EXPRESSION__CONDITION_EXPR = eINSTANCE.getBIfExpression_ConditionExpr();

		/**
		 * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIF_EXPRESSION__THEN_EXPR = eINSTANCE.getBIfExpression_ThenExpr();

		/**
		 * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIF_EXPRESSION__ELSE_EXPR = eINSTANCE.getBIfExpression_ElseExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl <em>BSwitch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BSwitchExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBSwitchExpression()
		 * @generated
		 */
		EClass BSWITCH_EXPRESSION = eINSTANCE.getBSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Switch Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSWITCH_EXPRESSION__SWITCH_EXPRESSION = eINSTANCE.getBSwitchExpression_SwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Case List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSWITCH_EXPRESSION__CASE_LIST = eINSTANCE.getBSwitchExpression_CaseList();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl <em>BCase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCaseImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCase()
		 * @generated
		 */
		EClass BCASE = eINSTANCE.getBCase();

		/**
		 * The meta object literal for the '<em><b>Condition Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCASE__CONDITION_EXPR = eINSTANCE.getBCase_ConditionExpr();

		/**
		 * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCASE__THEN_EXPR = eINSTANCE.getBCase_ThenExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTryExpressionImpl <em>BTry Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTryExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTryExpression()
		 * @generated
		 */
		EClass BTRY_EXPRESSION = eINSTANCE.getBTryExpression();

		/**
		 * The meta object literal for the '<em><b>Try Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTRY_EXPRESSION__TRY_EXPR = eINSTANCE.getBTryExpression_TryExpr();

		/**
		 * The meta object literal for the '<em><b>Catch Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTRY_EXPRESSION__CATCH_BLOCKS = eINSTANCE.getBTryExpression_CatchBlocks();

		/**
		 * The meta object literal for the '<em><b>Finally Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTRY_EXPRESSION__FINALLY_EXPR = eINSTANCE.getBTryExpression_FinallyExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl <em>BCatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCatch()
		 * @generated
		 */
		EClass BCATCH = eINSTANCE.getBCatch();

		/**
		 * The meta object literal for the '<em><b>Catch Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCATCH__CATCH_EXPR = eINSTANCE.getBCatch_CatchExpr();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCATCH__EXCEPTION_TYPE = eINSTANCE.getBCatch_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCATCH__VARNAME = eINSTANCE.getBCatch_Varname();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl <em>BBinary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBBinaryExpression()
		 * @generated
		 */
		EClass BBINARY_EXPRESSION = eINSTANCE.getBBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBINARY_EXPRESSION__LEFT_EXPR = eINSTANCE.getBBinaryExpression_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBINARY_EXPRESSION__RIGHT_EXPR = eINSTANCE.getBBinaryExpression_RightExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BOrExpressionImpl <em>BOr Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BOrExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBOrExpression()
		 * @generated
		 */
		EClass BOR_EXPRESSION = eINSTANCE.getBOrExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAndExpressionImpl <em>BAnd Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAndExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAndExpression()
		 * @generated
		 */
		EClass BAND_EXPRESSION = eINSTANCE.getBAndExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl <em>BChained Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBChainedExpression()
		 * @generated
		 */
		EClass BCHAINED_EXPRESSION = eINSTANCE.getBChainedExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCHAINED_EXPRESSION__EXPRESSIONS = eINSTANCE.getBChainedExpression_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryExpressionImpl <em>BUnary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryExpression()
		 * @generated
		 */
		EClass BUNARY_EXPRESSION = eINSTANCE.getBUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNARY_EXPRESSION__EXPR = eINSTANCE.getBUnaryExpression_Expr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BThrowExpressionImpl <em>BThrow Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BThrowExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBThrowExpression()
		 * @generated
		 */
		EClass BTHROW_EXPRESSION = eINSTANCE.getBThrowExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryOpExpressionImpl <em>BUnary Op Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryOpExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryOpExpression()
		 * @generated
		 */
		EClass BUNARY_OP_EXPRESSION = eINSTANCE.getBUnaryOpExpression();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNARY_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getBUnaryOpExpression_FunctionName();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPostOpExpressionImpl <em>BUnary Post Op Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPostOpExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryPostOpExpression()
		 * @generated
		 */
		EClass BUNARY_POST_OP_EXPRESSION = eINSTANCE.getBUnaryPostOpExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryOpExpressionImpl <em>BBinary Op Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BBinaryOpExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBBinaryOpExpression()
		 * @generated
		 */
		EClass BBINARY_OP_EXPRESSION = eINSTANCE.getBBinaryOpExpression();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBINARY_OP_EXPRESSION__FUNCTION_NAME = eINSTANCE.getBBinaryOpExpression_FunctionName();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCachedExpressionImpl <em>BCached Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCachedExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCachedExpression()
		 * @generated
		 */
		EClass BCACHED_EXPRESSION = eINSTANCE.getBCachedExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl <em>BLiteral Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralExpression()
		 * @generated
		 */
		EClass BLITERAL_EXPRESSION = eINSTANCE.getBLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLITERAL_EXPRESSION__VALUE = eINSTANCE.getBLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl <em>BLiteral List Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralListExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralListExpression()
		 * @generated
		 */
		EClass BLITERAL_LIST_EXPRESSION = eINSTANCE.getBLiteralListExpression();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_LIST_EXPRESSION__ENTRIES = eINSTANCE.getBLiteralListExpression_Entries();

		/**
		 * The meta object literal for the '<em><b>Entry Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_LIST_EXPRESSION__ENTRY_TYPE = eINSTANCE.getBLiteralListExpression_EntryType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl <em>BLiteral Map Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralMapExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralMapExpression()
		 * @generated
		 */
		EClass BLITERAL_MAP_EXPRESSION = eINSTANCE.getBLiteralMapExpression();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_MAP_EXPRESSION__ENTRIES = eINSTANCE.getBLiteralMapExpression_Entries();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_MAP_EXPRESSION__KEY_TYPE = eINSTANCE.getBLiteralMapExpression_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_MAP_EXPRESSION__VALUE_TYPE = eINSTANCE.getBLiteralMapExpression_ValueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BMapEntryImpl <em>BMap Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BMapEntryImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBMapEntry()
		 * @generated
		 */
		EClass BMAP_ENTRY = eINSTANCE.getBMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMAP_ENTRY__KEY = eINSTANCE.getBMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMAP_ENTRY__VALUE = eINSTANCE.getBMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFeatureExpressionImpl <em>BFeature Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFeatureExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFeatureExpression()
		 * @generated
		 */
		EClass BFEATURE_EXPRESSION = eINSTANCE.getBFeatureExpression();

		/**
		 * The meta object literal for the '<em><b>Obj Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFEATURE_EXPRESSION__OBJ_EXPR = eINSTANCE.getBFeatureExpression_ObjExpr();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFEATURE_EXPRESSION__FEATURE_NAME = eINSTANCE.getBFeatureExpression_FeatureName();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl <em>BAt Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAtExpression()
		 * @generated
		 */
		EClass BAT_EXPRESSION = eINSTANCE.getBAtExpression();

		/**
		 * The meta object literal for the '<em><b>Obj Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAT_EXPRESSION__OBJ_EXPR = eINSTANCE.getBAtExpression_ObjExpr();

		/**
		 * The meta object literal for the '<em><b>Index Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAT_EXPRESSION__INDEX_EXPR = eINSTANCE.getBAtExpression_IndexExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BVariableExpressionImpl <em>BVariable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BVariableExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBVariableExpression()
		 * @generated
		 */
		EClass BVARIABLE_EXPRESSION = eINSTANCE.getBVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BVARIABLE_EXPRESSION__NAME = eINSTANCE.getBVariableExpression_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl <em>BCall Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCallExpression()
		 * @generated
		 */
		EClass BCALL_EXPRESSION = eINSTANCE.getBCallExpression();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCALL_EXPRESSION__FUNC_EXPR = eINSTANCE.getBCallExpression_FuncExpr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCALL_EXPRESSION__NAME = eINSTANCE.getBCallExpression_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterizedExpressionImpl <em>BParameterized Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterizedExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterizedExpression()
		 * @generated
		 */
		EClass BPARAMETERIZED_EXPRESSION = eINSTANCE.getBParameterizedExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETERIZED_EXPRESSION__PARAMETER_LIST = eINSTANCE.getBParameterizedExpression_ParameterList();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralAnyImpl <em>BLiteral Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralAnyImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralAny()
		 * @generated
		 */
		EClass BLITERAL_ANY = eINSTANCE.getBLiteralAny();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl <em>BCreate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBCreateExpression()
		 * @generated
		 */
		EClass BCREATE_EXPRESSION = eINSTANCE.getBCreateExpression();

		/**
		 * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCREATE_EXPRESSION__CONTEXT_BLOCK = eINSTANCE.getBCreateExpression_ContextBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction <em>IFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIFunction()
		 * @generated
		 */
		EClass IFUNCTION = eINSTANCE.getIFunction();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__VISIBILITY = eINSTANCE.getIFunction_Visibility();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__FINAL = eINSTANCE.getIFunction_Final();

		/**
		 * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__EXECUTION_MODE = eINSTANCE.getIFunction_ExecutionMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__NAME = eINSTANCE.getIFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__GUARD = eINSTANCE.getIFunction_Guard();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__PARAMETER_TYPES = eINSTANCE.getIFunction_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Exception Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__EXCEPTION_TYPES = eINSTANCE.getIFunction_ExceptionTypes();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__TYPE_PARAMETERS = eINSTANCE.getIFunction_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__PARAMETER_NAMES = eINSTANCE.getIFunction_ParameterNames();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__PARAMETERS = eINSTANCE.getIFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__VAR_ARGS = eINSTANCE.getIFunction_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__DOCUMENTATION = eINSTANCE.getIFunction_Documentation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__RETURN_TYPE = eINSTANCE.getIFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Closure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__CLOSURE = eINSTANCE.getIFunction_Closure();

		/**
		 * The meta object literal for the '<em><b>Type Calculator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__TYPE_CALCULATOR = eINSTANCE.getIFunction_TypeCalculator();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFUNCTION__CONTAINER = eINSTANCE.getIFunction_Container();

		/**
		 * The meta object literal for the '<em><b>Class Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__CLASS_FUNCTION = eINSTANCE.getIFunction_ClassFunction();

		/**
		 * The meta object literal for the '<em><b>Vararg Array Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFUNCTION__VARARG_ARRAY_TYPE = eINSTANCE.getIFunction_VarargArrayType();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCREATE_EXPRESSION__ALIAS = eINSTANCE.getBCreateExpression_Alias();

		/**
		 * The meta object literal for the '<em><b>Type Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCREATE_EXPRESSION__TYPE_EXPR = eINSTANCE.getBCreateExpression_TypeExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl <em>BFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunction()
		 * @generated
		 */
		EClass BFUNCTION = eINSTANCE.getBFunction();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl <em>BFunction Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionWrapper()
		 * @generated
		 */
		EClass BFUNCTION_WRAPPER = eINSTANCE.getBFunctionWrapper();

		/**
		 * The meta object literal for the '<em><b>Around Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_WRAPPER__AROUND_EXPR = eINSTANCE.getBFunctionWrapper_AroundExpr();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_WRAPPER__ORIGINAL = eINSTANCE.getBFunctionWrapper_Original();

		/**
		 * The meta object literal for the '<em><b>Parameter Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFUNCTION_WRAPPER__PARAMETER_MAP = eINSTANCE.getBFunctionWrapper_ParameterMap();

		/**
		 * The meta object literal for the '<em><b>Varargs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFUNCTION_WRAPPER__VARARGS_NAME = eINSTANCE.getBFunctionWrapper_VarargsName();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl <em>BName Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BNamePredicateImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBNamePredicate()
		 * @generated
		 */
		EClass BNAME_PREDICATE = eINSTANCE.getBNamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BNAME_PREDICATE__NAME_PATTERN = eINSTANCE.getBNamePredicate_NamePattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BNAME_PREDICATE__NAME = eINSTANCE.getBNamePredicate_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionNamePredicateImpl <em>BFunction Name Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionNamePredicateImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionNamePredicate()
		 * @generated
		 */
		EClass BFUNCTION_NAME_PREDICATE = eINSTANCE.getBFunctionNamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_NAME_PREDICATE__NAME_PREDICATE = eINSTANCE.getBFunctionNamePredicate_NamePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl <em>BFunction Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionConcernContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionConcernContext()
		 * @generated
		 */
		EClass BFUNCTION_CONCERN_CONTEXT = eINSTANCE.getBFunctionConcernContext();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_CONCERN_CONTEXT__NAME_PREDICATE = eINSTANCE.getBFunctionConcernContext_NamePredicate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_CONCERN_CONTEXT__PARAMETERS = eINSTANCE.getBFunctionConcernContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_CONCERN_CONTEXT__FUNC_EXPR = eINSTANCE.getBFunctionConcernContext_FuncExpr();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFUNCTION_CONCERN_CONTEXT__VAR_ARGS = eINSTANCE.getBFunctionConcernContext_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Match Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BFUNCTION_CONCERN_CONTEXT__MATCH_PARAMETERS = eINSTANCE.getBFunctionConcernContext_MatchParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterPredicateImpl <em>BParameter Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterPredicateImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterPredicate()
		 * @generated
		 */
		EClass BPARAMETER_PREDICATE = eINSTANCE.getBParameterPredicate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER_PREDICATE__NAME = eINSTANCE.getBParameterPredicate_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER_PREDICATE__TYPE = eINSTANCE.getBParameterPredicate_Type();

		/**
		 * The meta object literal for the '<em><b>Type Predicate Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER_PREDICATE__TYPE_PREDICATE_OP = eINSTANCE.getBParameterPredicate_TypePredicateOp();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BProceedExpressionImpl <em>BProceed Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BProceedExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBProceedExpression()
		 * @generated
		 */
		EClass BPROCEED_EXPRESSION = eINSTANCE.getBProceedExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDelegatingContextImpl <em>BDelegating Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDelegatingContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDelegatingContext()
		 * @generated
		 */
		EClass BDELEGATING_CONTEXT = eINSTANCE.getBDelegatingContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl <em>BWrapping Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWrappingContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWrappingContext()
		 * @generated
		 */
		EClass BWRAPPING_CONTEXT = eINSTANCE.getBWrappingContext();

		/**
		 * The meta object literal for the '<em><b>Function Wrapper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWRAPPING_CONTEXT__FUNCTION_WRAPPER = eINSTANCE.getBWrappingContext_FunctionWrapper();

		/**
		 * The meta object literal for the '<em><b>Wrapped Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWRAPPING_CONTEXT__WRAPPED_CONTEXT = eINSTANCE.getBWrappingContext_WrappedContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWRAPPING_CONTEXT__PARAMETERS = eINSTANCE.getBWrappingContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWRAPPING_CONTEXT__PARAMETER_TYPES = eINSTANCE.getBWrappingContext_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Varargs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWRAPPING_CONTEXT__VARARGS_NAME = eINSTANCE.getBWrappingContext_VarargsName();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3MetaClassImpl <em>B3 Meta Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3MetaClassImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3MetaClass()
		 * @generated
		 */
		EClass B3_META_CLASS = eINSTANCE.getB3MetaClass();

		/**
		 * The meta object literal for the '<em><b>Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_META_CLASS__INSTANCE_CLASS = eINSTANCE.getB3MetaClass_InstanceClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionWrapperImpl <em>BExpression Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionWrapperImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBExpressionWrapper()
		 * @generated
		 */
		EClass BEXPRESSION_WRAPPER = eINSTANCE.getBExpressionWrapper();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXPRESSION_WRAPPER__ORIGINAL = eINSTANCE.getBExpressionWrapper_Original();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl <em>BWith Context Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWithContextExpression()
		 * @generated
		 */
		EClass BWITH_CONTEXT_EXPRESSION = eINSTANCE.getBWithContextExpression();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BWITH_CONTEXT_EXPRESSION__ALIAS = eINSTANCE.getBWithContextExpression_Alias();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_CONTEXT_EXPRESSION__EXPR = eINSTANCE.getBWithContextExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK = eINSTANCE.getBWithContextExpression_ContextBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardImpl <em>BGuard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuard()
		 * @generated
		 */
		EClass BGUARD = eINSTANCE.getBGuard();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl <em>BGuard Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuardExpression()
		 * @generated
		 */
		EClass BGUARD_EXPRESSION = eINSTANCE.getBGuardExpression();

		/**
		 * The meta object literal for the '<em><b>Guard Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BGUARD_EXPRESSION__GUARD_EXPR = eINSTANCE.getBGuardExpression_GuardExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BSystemContextImpl <em>BSystem Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BSystemContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBSystemContext()
		 * @generated
		 */
		EClass BSYSTEM_CONTEXT = eINSTANCE.getBSystemContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BContextImpl <em>BContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBContext()
		 * @generated
		 */
		EClass BCONTEXT = eINSTANCE.getBContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl <em>BInner Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInnerContext()
		 * @generated
		 */
		EClass BINNER_CONTEXT = eINSTANCE.getBInnerContext();

		/**
		 * The meta object literal for the '<em><b>Outer Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINNER_CONTEXT__OUTER_CONTEXT = eINSTANCE.getBInnerContext_OuterContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInvocationContextImpl <em>BInvocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInvocationContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInvocationContext()
		 * @generated
		 */
		EClass BINVOCATION_CONTEXT = eINSTANCE.getBInvocationContext();

		/**
		 * The meta object literal for the '<em><b>Expression Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINVOCATION_CONTEXT__EXPRESSION_CACHE = eINSTANCE.getBInvocationContext_ExpressionCache();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPreOpExpressionImpl <em>BUnary Pre Op Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BUnaryPreOpExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBUnaryPreOpExpression()
		 * @generated
		 */
		EClass BUNARY_PRE_OP_EXPRESSION = eINSTANCE.getBUnaryPreOpExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAssignmentExpressionImpl <em>BAssignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAssignmentExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAssignmentExpression()
		 * @generated
		 */
		EClass BASSIGNMENT_EXPRESSION = eINSTANCE.getBAssignmentExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl <em>B3 Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3Function()
		 * @generated
		 */
		EClass B3_FUNCTION = eINSTANCE.getB3Function();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNCTION__FUNC_EXPR = eINSTANCE.getB3Function_FuncExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl <em>BJava Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBJavaFunction()
		 * @generated
		 */
		EClass BJAVA_FUNCTION = eINSTANCE.getBJavaFunction();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BJAVA_FUNCTION__METHOD = eINSTANCE.getBJavaFunction_Method();

		/**
		 * The meta object literal for the '<em><b>Call Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BJAVA_FUNCTION__CALL_TYPE = eINSTANCE.getBJavaFunction_CallType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer <em>BFunction Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBFunctionContainer()
		 * @generated
		 */
		EClass BFUNCTION_CONTAINER = eINSTANCE.getBFunctionContainer();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BFUNCTION_CONTAINER__FUNCTIONS = eINSTANCE.getBFunctionContainer_Functions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefValueImpl <em>BDef Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefValueImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefValue()
		 * @generated
		 */
		EClass BDEF_VALUE = eINSTANCE.getBDefValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDEF_VALUE__NAME = eINSTANCE.getBDefValue_Name();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDEF_VALUE__FINAL = eINSTANCE.getBDefValue_Final();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDEF_VALUE__IMMUTABLE = eINSTANCE.getBDefValue_Immutable();

		/**
		 * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDEF_VALUE__VALUE_EXPR = eINSTANCE.getBDefValue_ValueExpr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDEF_VALUE__TYPE = eINSTANCE.getBDefValue_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BRegularExpressionImpl <em>BRegular Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BRegularExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBRegularExpression()
		 * @generated
		 */
		EClass BREGULAR_EXPRESSION = eINSTANCE.getBRegularExpression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREGULAR_EXPRESSION__PATTERN = eINSTANCE.getBRegularExpression_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterListImpl <em>BParameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterListImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterList()
		 * @generated
		 */
		EClass BPARAMETER_LIST = eINSTANCE.getBParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER_LIST__PARAMETERS = eINSTANCE.getBParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterImpl <em>BParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameter()
		 * @generated
		 */
		EClass BPARAMETER = eINSTANCE.getBParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER__NAME = eINSTANCE.getBParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER__EXPR = eINSTANCE.getBParameter_Expr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterDeclarationImpl <em>BParameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterDeclarationImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBParameterDeclaration()
		 * @generated
		 */
		EClass BPARAMETER_DECLARATION = eINSTANCE.getBParameterDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER_DECLARATION__NAME = eINSTANCE.getBParameterDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER_DECLARATION__TYPE = eINSTANCE.getBParameterDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER_DECLARATION__FINAL = eINSTANCE.getBParameterDeclaration_Final();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER_DECLARATION__IMMUTABLE = eINSTANCE.getBParameterDeclaration_Immutable();

		/**
		 * The meta object literal for the '{@link java.lang.reflect.Type <em>IType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Type
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIType()
		 * @generated
		 */
		EClass ITYPE = eINSTANCE.getIType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl <em>B3 Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3FunctionType()
		 * @generated
		 */
		EClass B3_FUNCTION_TYPE = eINSTANCE.getB3FunctionType();

		/**
		 * The meta object literal for the '<em><b>Function Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNCTION_TYPE__FUNCTION_TYPE = eINSTANCE.getB3FunctionType_FunctionType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNCTION_TYPE__RETURN_TYPE = eINSTANCE.getB3FunctionType_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNCTION_TYPE__PARAMETER_TYPES = eINSTANCE.getB3FunctionType_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_FUNCTION_TYPE__VAR_ARGS = eINSTANCE.getB3FunctionType_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Type Calculator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNCTION_TYPE__TYPE_CALCULATOR = eINSTANCE.getB3FunctionType_TypeCalculator();

		/**
		 * The meta object literal for the '{@link java.lang.reflect.ParameterizedType <em>IParameterized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.ParameterizedType
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIParameterizedType()
		 * @generated
		 */
		EClass IPARAMETERIZED_TYPE = eINSTANCE.getIParameterizedType();

		/**
		 * The meta object literal for the '{@link java.lang.reflect.GenericDeclaration <em>IGeneric Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.GenericDeclaration
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIGenericDeclaration()
		 * @generated
		 */
		EClass IGENERIC_DECLARATION = eINSTANCE.getIGenericDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl <em>B3 Parameterized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3ParameterizedTypeImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3ParameterizedType()
		 * @generated
		 */
		EClass B3_PARAMETERIZED_TYPE = eINSTANCE.getB3ParameterizedType();

		/**
		 * The meta object literal for the '<em><b>Owner Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_PARAMETERIZED_TYPE__OWNER_TYPE = eINSTANCE.getB3ParameterizedType_OwnerType();

		/**
		 * The meta object literal for the '<em><b>Raw Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_PARAMETERIZED_TYPE__RAW_TYPE = eINSTANCE.getB3ParameterizedType_RawType();

		/**
		 * The meta object literal for the '<em><b>Actual Arguments List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST = eINSTANCE.getB3ParameterizedType_ActualArgumentsList();

		/**
		 * The meta object literal for the '{@link java.lang.reflect.WildcardType <em>IWildcard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.WildcardType
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIWildcardType()
		 * @generated
		 */
		EClass IWILDCARD_TYPE = eINSTANCE.getIWildcardType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl <em>B3 Wildcard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3WildcardType()
		 * @generated
		 */
		EClass B3_WILDCARD_TYPE = eINSTANCE.getB3WildcardType();

		/**
		 * The meta object literal for the '<em><b>Lower Bounds List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST = eINSTANCE.getB3WildcardType_LowerBoundsList();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST = eINSTANCE.getB3WildcardType_UpperBoundsList();

		/**
		 * The meta object literal for the '{@link java.lang.reflect.TypeVariable <em>IType Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.TypeVariable
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getITypeVariable()
		 * @generated
		 */
		EClass ITYPE_VARIABLE = eINSTANCE.getITypeVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl <em>B3 Func Type Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3FuncTypeVariableImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3FuncTypeVariable()
		 * @generated
		 */
		EClass B3_FUNC_TYPE_VARIABLE = eINSTANCE.getB3FuncTypeVariable();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_FUNC_TYPE_VARIABLE__BOUNDS = eINSTANCE.getB3FuncTypeVariable_Bounds();

		/**
		 * The meta object literal for the '<em><b>Generic Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference B3_FUNC_TYPE_VARIABLE__GENERIC_DECLARATION = eINSTANCE.getB3FuncTypeVariable_GenericDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_FUNC_TYPE_VARIABLE__NAME = eINSTANCE.getB3FuncTypeVariable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3JavaImportImpl <em>B3 Java Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3JavaImportImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3JavaImport()
		 * @generated
		 */
		EClass B3_JAVA_IMPORT = eINSTANCE.getB3JavaImport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_JAVA_IMPORT__NAME = eINSTANCE.getB3JavaImport_Name();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_JAVA_IMPORT__QUALIFIED_NAME = eINSTANCE.getB3JavaImport_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_JAVA_IMPORT__TYPE = eINSTANCE.getB3JavaImport_Type();

		/**
		 * The meta object literal for the '<em><b>Reexport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute B3_JAVA_IMPORT__REEXPORT = eINSTANCE.getB3JavaImport_Reexport();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralTypeImpl <em>BLiteral Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralTypeImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBLiteralType()
		 * @generated
		 */
		EClass BLITERAL_TYPE = eINSTANCE.getBLiteralType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLITERAL_TYPE__TYPE = eINSTANCE.getBLiteralType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardFunctionImpl <em>BGuard Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardFunctionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBGuardFunction()
		 * @generated
		 */
		EClass BGUARD_FUNCTION = eINSTANCE.getBGuardFunction();

		/**
		 * The meta object literal for the '<em><b>Func</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BGUARD_FUNCTION__FUNC = eINSTANCE.getBGuardFunction_Func();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorImpl <em>BType Calculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTypeCalculator()
		 * @generated
		 */
		EClass BTYPE_CALCULATOR = eINSTANCE.getBTypeCalculator();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorFunctionImpl <em>BType Calculator Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BTypeCalculatorFunctionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBTypeCalculatorFunction()
		 * @generated
		 */
		EClass BTYPE_CALCULATOR_FUNCTION = eINSTANCE.getBTypeCalculatorFunction();

		/**
		 * The meta object literal for the '<em><b>Func</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTYPE_CALCULATOR_FUNCTION__FUNC = eINSTANCE.getBTypeCalculatorFunction_Func();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInstanceContextImpl <em>BInstance Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BInstanceContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBInstanceContext()
		 * @generated
		 */
		EClass BINSTANCE_CONTEXT = eINSTANCE.getBInstanceContext();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINSTANCE_CONTEXT__INSTANCE = eINSTANCE.getBInstanceContext_Instance();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefPropertyImpl <em>BDef Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefPropertyImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefProperty()
		 * @generated
		 */
		EClass BDEF_PROPERTY = eINSTANCE.getBDefProperty();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BDEF_PROPERTY__MUTABLE = eINSTANCE.getBDefProperty_Mutable();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl <em>BProperty Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertySet()
		 * @generated
		 */
		EClass BPROPERTY_SET = eINSTANCE.getBPropertySet();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPROPERTY_SET__EXTENDS = eINSTANCE.getBPropertySet_Extends();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPROPERTY_SET__OPERATIONS = eINSTANCE.getBPropertySet_Operations();

		/**
		 * The meta object literal for the '<em><b>Properties File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPROPERTY_SET__PROPERTIES_FILE = eINSTANCE.getBPropertySet_PropertiesFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefaultPropertySetImpl <em>BDefault Property Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BDefaultPropertySetImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBDefaultPropertySet()
		 * @generated
		 */
		EClass BDEFAULT_PROPERTY_SET = eINSTANCE.getBDefaultPropertySet();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyOperationImpl <em>BProperty Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyOperationImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertyOperation()
		 * @generated
		 */
		EClass BPROPERTY_OPERATION = eINSTANCE.getBPropertyOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyDefinitionOperationImpl <em>BProperty Definition Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertyDefinitionOperationImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertyDefinitionOperation()
		 * @generated
		 */
		EClass BPROPERTY_DEFINITION_OPERATION = eINSTANCE.getBPropertyDefinitionOperation();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPROPERTY_DEFINITION_OPERATION__DEFINITION = eINSTANCE.getBPropertyDefinitionOperation_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConditionalPropertyOperationImpl <em>BConditional Property Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConditionalPropertyOperationImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConditionalPropertyOperation()
		 * @generated
		 */
		EClass BCONDITIONAL_PROPERTY_OPERATION = eINSTANCE.getBConditionalPropertyOperation();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONDITIONAL_PROPERTY_OPERATION__COND_EXPR = eINSTANCE.getBConditionalPropertyOperation_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONDITIONAL_PROPERTY_OPERATION__BODY = eINSTANCE.getBConditionalPropertyOperation_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetOperationImpl <em>BProperty Set Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetOperationImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBPropertySetOperation()
		 * @generated
		 */
		EClass BPROPERTY_SET_OPERATION = eINSTANCE.getBPropertySetOperation();

		/**
		 * The meta object literal for the '<em><b>Property Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPROPERTY_SET_OPERATION__PROPERTY_SET = eINSTANCE.getBPropertySetOperation_PropertySet();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAdviceImpl <em>BAdvice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BAdviceImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBAdvice()
		 * @generated
		 */
		EClass BADVICE = eINSTANCE.getBAdvice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADVICE__NAME = eINSTANCE.getBAdvice_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl <em>BConcern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConcern()
		 * @generated
		 */
		EClass BCONCERN = eINSTANCE.getBConcern();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONCERN__DOCUMENTATION = eINSTANCE.getBConcern_Documentation();

		/**
		 * The meta object literal for the '<em><b>Super Concerns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONCERN__SUPER_CONCERNS = eINSTANCE.getBConcern_SuperConcerns();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONCERN__PROPERTY_SETS = eINSTANCE.getBConcern_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONCERN__CONTEXTS = eINSTANCE.getBConcern_Contexts();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl <em>BWith Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBWithExpression()
		 * @generated
		 */
		EClass BWITH_EXPRESSION = eINSTANCE.getBWithExpression();

		/**
		 * The meta object literal for the '<em><b>Referenced Advice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_EXPRESSION__REFERENCED_ADVICE = eINSTANCE.getBWithExpression_ReferencedAdvice();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_EXPRESSION__PROPERTY_SETS = eINSTANCE.getBWithExpression_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_EXPRESSION__CONCERNS = eINSTANCE.getBWithExpression_Concerns();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BWITH_EXPRESSION__FUNC_EXPR = eINSTANCE.getBWithExpression_FuncExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl <em>BConcern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBConcernContext()
		 * @generated
		 */
		EClass BCONCERN_CONTEXT = eINSTANCE.getBConcernContext();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONCERN_CONTEXT__DOCUMENTATION = eINSTANCE.getBConcernContext_Documentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.Visibility
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode <em>Execution Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getExecutionMode()
		 * @generated
		 */
		EEnum EXECUTION_MODE = eINSTANCE.getExecutionMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType <em>BJava Call Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getBJavaCallType()
		 * @generated
		 */
		EEnum BJAVA_CALL_TYPE = eINSTANCE.getBJavaCallType();

		/**
		 * The meta object literal for the '<em>Core Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.CoreException
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getCoreException()
		 * @generated
		 */
		EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

		/**
		 * The meta object literal for the '<em>Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Type
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getType()
		 * @generated
		 */
		EDataType TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Object Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getObjectArray()
		 * @generated
		 */
		EDataType OBJECT_ARRAY = eINSTANCE.getObjectArray();

		/**
		 * The meta object literal for the '<em>Value Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.ValueMap
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getValueMap()
		 * @generated
		 */
		EDataType VALUE_MAP = eINSTANCE.getValueMap();

		/**
		 * The meta object literal for the '<em>B3 Engine Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.B3EngineException
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3EngineException()
		 * @generated
		 */
		EDataType B3_ENGINE_EXCEPTION = eINSTANCE.getB3EngineException();

		/**
		 * The meta object literal for the '<em>B3 Expression Cache</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.B3ExpressionCache
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3ExpressionCache()
		 * @generated
		 */
		EDataType B3_EXPRESSION_CACHE = eINSTANCE.getB3ExpressionCache();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '<em>LValue</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.LValue
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getLValue()
		 * @generated
		 */
		EDataType LVALUE = eINSTANCE.getLValue();

		/**
		 * The meta object literal for the '<em>Type Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getTypeArray()
		 * @generated
		 */
		EDataType TYPE_ARRAY = eINSTANCE.getTypeArray();

		/**
		 * The meta object literal for the '<em>Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getMethod()
		 * @generated
		 */
		EDataType METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em>Type Variable Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getTypeVariableArray()
		 * @generated
		 */
		EDataType TYPE_VARIABLE_ARRAY = eINSTANCE.getTypeVariableArray();

		/**
		 * The meta object literal for the '<em>Func Store</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.B3FuncStore
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getFuncStore()
		 * @generated
		 */
		EDataType FUNC_STORE = eINSTANCE.getFuncStore();

		/**
		 * The meta object literal for the '<em>Regexp Pattern</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.regex.Pattern
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getRegexpPattern()
		 * @generated
		 */
		EDataType REGEXP_PATTERN = eINSTANCE.getRegexpPattern();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

		/**
		 * The meta object literal for the '<em>B3 Dynamic Class Loader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.b3.backend.core.B3DynamicClassLoader
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getB3DynamicClassLoader()
		 * @generated
		 */
		EDataType B3_DYNAMIC_CLASS_LOADER = eINSTANCE.getB3DynamicClassLoader();

		/**
		 * The meta object literal for the '<em>Java Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getJavaIterator()
		 * @generated
		 */
		EDataType JAVA_ITERATOR = eINSTANCE.getJavaIterator();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

	}

} //B3backendPackage
