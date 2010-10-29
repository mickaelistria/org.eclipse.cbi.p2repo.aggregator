/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for a factory of Type-Constraints
 * The TypeConstraints can be solved by a constraints solver.
 * 
 */
public interface ITypeScheme {
	/**
	 * Construct a constraint on the form A == B
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public ITypeConstraint constraint(ITypeConstraintExpression a, ITypeConstraintExpression b);

	/**
	 * Constructs a function selection constraint - given a function name, and a set of parameter types / constraints,
	 * produces a return value.
	 * Example : 1 + 1 becomes:
	 * constraint(variable(thePlusExpression), function("+", variable(theLiteral1), variable(theLiteral2)))
	 * 
	 * @param funcName
	 * @param scope
	 *            - the scope the funcName is looked up in - typically the reference to an expression
	 * @param constraintExpressions
	 * @return
	 */
	public ITypeConstraintExpression function(String funcName, EObject scope,
			ITypeConstraintExpression... constraintExpressions);

	/**
	 * The Scheme Key is any object that identifies a set of type variables. It's identity is used as a key.
	 * 
	 * When used within b3 this is typically a ITypeScheme instance, but may for testing purposes be any
	 * object. This key uniquely identifies the value of an EObject's inferred type. (Or put differently: An EObject may at any time have
	 * multiple inferred types associated with it, differentiated by the SchemeKey).
	 * 
	 * A typical use of the factory is:
	 * constraint(variable(a), type(Integer.class))
	 * i.e. constrain the type of 'a' to Integer.class.
	 * 
	 * @param key
	 */
	public Object getSchemeKey();

	/**
	 * Returns the key for the variable representing the EObject var.
	 * 
	 * @param var
	 * @return
	 */
	public Object getVariableKey(EObject var);

	/**
	 * Makes the variable for 'x' generic in this scheme - i.e. it will have an individual value in this scheme.
	 * Its initial value is that in the parent scheme.
	 * The constraint for the variable is returned as the typical is to use this in a constraint.
	 * 
	 * @param x
	 * @return
	 */
	public ITypeConstraintExpression makeGeneric(EObject x);

	/**
	 * Construct a constraint expression stating (x,y)=>z - i.e. given the constraints x and y, z is produced.
	 * This is the description of a lambda. Example aLambda = {String x | x.length() } :
	 * constraint(variable(aLambda), produces(type(Integer.class), type(String)));
	 * 
	 * @param product
	 *            - i.e. the "return value"
	 * @param given
	 *            - the parameters
	 * @return
	 */
	public ITypeConstraintExpression produces(ITypeConstraintExpression product, ITypeConstraintExpression... given);

	/**
	 * Create a sub scheme useful for solving sub problems. Also see {@link #makeGeneric(EObject)}.
	 * 
	 * @return
	 */
	public ITypeScheme subScheme();

	/**
	 * Construct a constraint expression being an explicit type.
	 * 
	 * @param x
	 * @return
	 */
	public ITypeConstraintExpression type(Type x);

	/**
	 * Construct a constraint expression being the type of an EObject - a type variable.
	 * 
	 * @param o
	 * @return
	 */
	public ITypeConstraintExpression variable(EObject o);

}
