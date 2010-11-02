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
import org.eclipse.b3.backend.inference.ITypeConstraintExpression;
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
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaList<org.eclipse.b3.backend.evaluator.b3backend.ITypeConstraint>" many="false"
	 *        typeSchemeDataType="org.eclipse.b3.backend.evaluator.b3backend.ITypeScheme" parameterConstraintsDataType=
	 *        "org.eclipse.b3.backend.evaluator.b3backend.JavaList<org.eclipse.b3.backend.evaluator.b3backend.ITypeConstraintExpression>"
	 *        parameterConstraintsMany="false"
	 * @generated
	 */
	List<ITypeConstraint> getConstraints(String funcName, BExpression expr, ITypeScheme typeScheme,
			List<ITypeConstraintExpression> parameterConstraints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	B3FunctionType getSignature(Type[] types);

} // BTypeCalculator
