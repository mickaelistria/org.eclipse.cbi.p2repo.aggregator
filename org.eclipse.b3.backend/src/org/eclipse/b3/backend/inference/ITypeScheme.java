/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

/**
 * Interface for a factory of Type-Constraints
 * The TypeConstraints can be solved by a constraints solver.
 * 
 */
@ImplementedBy(TypeScheme.class)
public interface ITypeScheme {
	public final static List<ITypeConstraint> NO_CONSTRAINTS = Collections.emptyList();

	/**
	 * Construct a constraint on the form A == B
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public ITypeConstraint constraint(ITypeExpression a, ITypeExpression b);

	public ITypeExpression generic(EObject a);

	public ITypeExpression generic(int index, EObject a);

	public ITypeExpression generic(int index, ITypeExpression a);

	public ITypeExpression generic(ITypeExpression a);

	public ITypeSchemeVariableProvider getParent();

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

	public ITypeExpression lambda(ITypeExpression producerConstraint);

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
	public ITypeExpression lambda(ITypeExpression product, ITypeExpression... given);

	public ITypeExpression lambda(ITypeExpression product, List<ITypeExpression> given);

	/**
	 * Makes the variable for 'x' "local" in this scheme - i.e. it will have an individual value in this scheme.
	 * Its initial value is that in the parent scheme.
	 * The constraint for the variable is returned as the typical is to use this in a constraint.
	 * 
	 * @param x
	 * @return
	 */
	public ITypeExpression makeSchemeScopedVariable(EObject x);

	/**
	 * Construct a constraint expression for a parameterized type, the first constraint is for the base
	 * type, and any additional expressions are the type arguments.
	 * A List<Double> is constructed by the expression: parameterizedType(type(List.class), type(Double.class))
	 * 
	 * @param given
	 * @return
	 */
	public abstract ITypeExpression parameterizedType(ITypeExpression... given);

	/**
	 * A type expression taking the product of a producer - i.e. product((A B)=>C) results in C.
	 * This is a type function used for "calls" / "evaluation with parameters".
	 * 
	 * @param producerConstraint
	 *            - a lambda or select expression (or a constraint that will be unified to one)
	 * @return
	 */
	public ITypeExpression product(ITypeExpression producerConstraint);

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
	public ITypeExpression select(String funcName, BExpression scope, ITypeExpression... constraintExpressions);

	public abstract ITypeExpression select(String funcName, BExpression callExpr,
			List<ITypeExpression> constraintExpressions);

	public abstract ITypeExpression select(String funcName, ITypeExpression producesConstraint, BExpression callExpr,
			ITypeExpression... constraintExpressions);

	public abstract ITypeExpression select(String funcName, ITypeExpression producesConstraint, BExpression callExpr,
			List<ITypeExpression> constraintExpressions);

	public void setParent(ITypeSchemeVariableProvider parent);

	/**
	 * Constructs a new List of Constraints being the combination of two lists.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public List<ITypeConstraint> splice(List<ITypeConstraint> a, List<ITypeConstraint> b);

	/**
	 * Create a sub scheme useful for solving sub problems. Also see {@link #makeSchemeScopedVariable(EObject)}.
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
	public ITypeExpression type(Type x);

	/**
	 * Construct a constraint expression being the type of an EObject - a type variable.
	 * 
	 * @param o
	 * @return
	 */
	public ITypeExpression variable(EObject o);

}
