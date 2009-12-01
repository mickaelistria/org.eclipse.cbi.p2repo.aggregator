/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public interface B3backendFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	B3backendFactory eINSTANCE = org.eclipse.b3.backend.evaluator.b3backend.impl.B3backendFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BFile Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BFile Reference</em>'.
	 * @generated
	 */
	BFileReference createBFileReference();

	/**
	 * Returns a new object of class '<em>BLine Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BLine Reference</em>'.
	 * @generated
	 */
	BLineReference createBLineReference();

	/**
	 * Returns a new object of class '<em>BIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BIf Expression</em>'.
	 * @generated
	 */
	BIfExpression createBIfExpression();

	/**
	 * Returns a new object of class '<em>BSwitch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSwitch Expression</em>'.
	 * @generated
	 */
	BSwitchExpression createBSwitchExpression();

	/**
	 * Returns a new object of class '<em>BCase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCase</em>'.
	 * @generated
	 */
	BCase createBCase();

	/**
	 * Returns a new object of class '<em>BTry Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTry Expression</em>'.
	 * @generated
	 */
	BTryExpression createBTryExpression();

	/**
	 * Returns a new object of class '<em>BCatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCatch</em>'.
	 * @generated
	 */
	BCatch createBCatch();

	/**
	 * Returns a new object of class '<em>BOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOr Expression</em>'.
	 * @generated
	 */
	BOrExpression createBOrExpression();

	/**
	 * Returns a new object of class '<em>BAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAnd Expression</em>'.
	 * @generated
	 */
	BAndExpression createBAndExpression();

	/**
	 * Returns a new object of class '<em>BChained Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BChained Expression</em>'.
	 * @generated
	 */
	BChainedExpression createBChainedExpression();

	/**
	 * Returns a new object of class '<em>BThrow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BThrow Expression</em>'.
	 * @generated
	 */
	BThrowExpression createBThrowExpression();

	/**
	 * Returns a new object of class '<em>BUnary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BUnary Op Expression</em>'.
	 * @generated
	 */
	BUnaryOpExpression createBUnaryOpExpression();

	/**
	 * Returns a new object of class '<em>BUnary Post Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BUnary Post Op Expression</em>'.
	 * @generated
	 */
	BUnaryPostOpExpression createBUnaryPostOpExpression();

	/**
	 * Returns a new object of class '<em>BBinary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBinary Op Expression</em>'.
	 * @generated
	 */
	BBinaryOpExpression createBBinaryOpExpression();

	/**
	 * Returns a new object of class '<em>BCached Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCached Expression</em>'.
	 * @generated
	 */
	BCachedExpression createBCachedExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BLiteral Expression</em>'.
	 * @generated
	 */
	BLiteralExpression createBLiteralExpression();

	/**
	 * Returns a new object of class '<em>BLiteral List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BLiteral List Expression</em>'.
	 * @generated
	 */
	BLiteralListExpression createBLiteralListExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BLiteral Map Expression</em>'.
	 * @generated
	 */
	BLiteralMapExpression createBLiteralMapExpression();

	/**
	 * Returns a new object of class '<em>BMap Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BMap Entry</em>'.
	 * @generated
	 */
	BMapEntry createBMapEntry();

	/**
	 * Returns a new object of class '<em>BFeature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BFeature Expression</em>'.
	 * @generated
	 */
	BFeatureExpression createBFeatureExpression();

	/**
	 * Returns a new object of class '<em>BAt Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAt Expression</em>'.
	 * @generated
	 */
	BAtExpression createBAtExpression();

	/**
	 * Returns a new object of class '<em>BVariable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BVariable Expression</em>'.
	 * @generated
	 */
	BVariableExpression createBVariableExpression();

	/**
	 * Returns a new object of class '<em>BCall Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCall Expression</em>'.
	 * @generated
	 */
	BCallExpression createBCallExpression();

	/**
	 * Returns a new object of class '<em>BLiteral Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BLiteral Any</em>'.
	 * @generated
	 */
	BLiteralAny createBLiteralAny();

	/**
	 * Returns a new object of class '<em>BCreate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BCreate Expression</em>'.
	 * @generated
	 */
	BCreateExpression createBCreateExpression();

	/**
	 * Returns a new object of class '<em>BGuard Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGuard Instance</em>'.
	 * @generated
	 */
	BGuardInstance createBGuardInstance();

	/**
	 * Returns a new object of class '<em>BGuard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BGuard Expression</em>'.
	 * @generated
	 */
	BGuardExpression createBGuardExpression();

	/**
	 * Returns a new object of class '<em>BSystem Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSystem Context</em>'.
	 * @generated
	 */
	BSystemContext createBSystemContext();

	/**
	 * Returns a new object of class '<em>BContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BContext</em>'.
	 * @generated
	 */
	BContext createBContext();

	/**
	 * Returns a new object of class '<em>BInner Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BInner Context</em>'.
	 * @generated
	 */
	BInnerContext createBInnerContext();

	/**
	 * Returns a new object of class '<em>BInvocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BInvocation Context</em>'.
	 * @generated
	 */
	BInvocationContext createBInvocationContext();

	/**
	 * Returns a new object of class '<em>BUnary Pre Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BUnary Pre Op Expression</em>'.
	 * @generated
	 */
	BUnaryPreOpExpression createBUnaryPreOpExpression();

	/**
	 * Returns a new object of class '<em>BAssignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAssignment Expression</em>'.
	 * @generated
	 */
	BAssignmentExpression createBAssignmentExpression();

	/**
	 * Returns a new object of class '<em>B3 Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Function</em>'.
	 * @generated
	 */
	B3Function createB3Function();

	/**
	 * Returns a new object of class '<em>BJava Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BJava Function</em>'.
	 * @generated
	 */
	BJavaFunction createBJavaFunction();

	/**
	 * Returns a new object of class '<em>BDef Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BDef Function</em>'.
	 * @generated
	 */
	BDefFunction createBDefFunction();

	/**
	 * Returns a new object of class '<em>BDef Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BDef Value</em>'.
	 * @generated
	 */
	BDefValue createBDefValue();

	/**
	 * Returns a new object of class '<em>BRegular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BRegular Expression</em>'.
	 * @generated
	 */
	BRegularExpression createBRegularExpression();

	/**
	 * Returns a new object of class '<em>BParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BParameter List</em>'.
	 * @generated
	 */
	BParameterList createBParameterList();

	/**
	 * Returns a new object of class '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BParameter</em>'.
	 * @generated
	 */
	BParameter createBParameter();

	/**
	 * Returns a new object of class '<em>BParameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BParameter Declaration</em>'.
	 * @generated
	 */
	BParameterDeclaration createBParameterDeclaration();

	/**
	 * Returns a new object of class '<em>B3 Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Function Type</em>'.
	 * @generated
	 */
	B3FunctionType createB3FunctionType();

	/**
	 * Returns a new object of class '<em>B3 Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Parameterized Type</em>'.
	 * @generated
	 */
	B3ParameterizedType createB3ParameterizedType();

	/**
	 * Returns a new object of class '<em>B3 Wildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Wildcard Type</em>'.
	 * @generated
	 */
	B3WildcardType createB3WildcardType();



	/**
	 * Returns a new object of class '<em>B3 Func Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Func Type Variable</em>'.
	 * @generated
	 */
	B3FuncTypeVariable createB3FuncTypeVariable();

	/**
	 * Returns a new object of class '<em>B3 Java Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B3 Java Import</em>'.
	 * @generated
	 */
	B3JavaImport createB3JavaImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	B3backendPackage getB3backendPackage();

} //B3backendFactory
