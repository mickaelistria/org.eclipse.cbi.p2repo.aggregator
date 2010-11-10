/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import java.util.List;

import org.eclipse.b3.backend.inference.ITypeConstraint;
import org.eclipse.b3.backend.inference.ITypeExpression;
import org.eclipse.b3.backend.inference.ITypeScheme;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BType Calculator</b></em>'.
 * A TypeCalculator allows a BJavaFunction to calculate the return type of a function based on the static
 * parameter types.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTypeCalculator()
 * @model abstract="true"
 * @generated
 */
public interface BTypeCalculator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns a List of ITypeConstraint that describe the constraints imposed by a call to a function
	 * using this type calculator. The implementor of the type calculator should produce the constraints via
	 * the given ITypeScheme parameter.
	 * 
	 * As an example, a select(+ Integer Double)=>σ+ leads to a call to a numeric type calculator. This
	 * type calculator would produce select(+ Integer Double)=>σ+ = select(+ Integer Double)=>Double
	 * 
	 * @param funcName
	 *            the name of the selected function
	 * @param expr
	 *            the scope in which the function was looked up in (this is the call expression)
	 * @param typeScheme
	 *            the constraint factory that must be used to produce constraints
	 * @param parameterConstraints
	 *            the known constraints of the parameters in the call to funcName
	 * @param funcSelectConstraint
	 *            the entire lhs type expression that produced constraints should eliminate/unite. No
	 *            assumptions should be made regarding this expression except is should be the lhs in
	 *            a produced constraint.
	 * 
	 *            <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaList<org.eclipse.b3.backend.evaluator.b3backend.ITypeConstraint>" many="false"
	 *        typeSchemeDataType="org.eclipse.b3.backend.evaluator.b3backend.ITypeScheme" parameterConstraintsDataType=
	 *        "org.eclipse.b3.backend.evaluator.b3backend.JavaList<org.eclipse.b3.backend.evaluator.b3backend.ITypeExpression>"
	 *        parameterConstraintsMany="false" funcSelectConstraintDataType="org.eclipse.b3.backend.evaluator.b3backend.ITypeExpression"
	 * @generated
	 */
	List<ITypeConstraint> getConstraints(String funcName, BExpression expr, ITypeScheme typeScheme,
			List<ITypeExpression> parameterConstraints, ITypeExpression funcSelectConstraint);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a B3FunctionType with parameter types and produces type.
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @model typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	B3FunctionType getSignature(Type[] types);

} // BTypeCalculator
