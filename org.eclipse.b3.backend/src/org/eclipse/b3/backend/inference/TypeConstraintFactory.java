/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import org.eclipse.b3.backend.core.IStringProvider;
import org.eclipse.b3.backend.core.adapters.TypeAdapter;
import org.eclipse.b3.backend.core.adapters.TypeAdapterFactory;
import org.eclipse.b3.backend.functions.ArithmeticFunctions;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Implementation of Type Constraint interfaces.
 * 
 */
public class TypeConstraintFactory implements ITypeConstraintFactory {
	protected abstract class ConstraintExpr implements ITypeConstraintExpression {

		public Type apply(ITypeConstraintExpression right) {
			throw new UnsupportedOperationException("apply on non identifier");
		}

		public boolean contains(ITypeConstraintExpression expr) {
			return matches(expr);
		}

		/**
		 * Throws UnsupportedOperationException - classes returning true on isSameFunction must implement
		 * this method.
		 */
		public List<ITypeConstraint> eliminate(ITypeConstraintExpression expr) {
			throw new UnsupportedOperationException(
				"TypeFunction should have implemented this, illegal call for others.");
		}

		public Type getType() {
			return null;
		}

		/**
		 * This default implementation returns false.
		 */
		public boolean isIdentifier() {
			return false;
		}

		public boolean isResolvable() {
			return true;
		}

		public abstract boolean isResolved();

		/**
		 * This implementation returns false. Derived classes that represent functions should return if
		 * it both functions represent the same thing - i.e. same function (produces, etc) and have the same
		 * arity (same number of parameters).
		 */
		public boolean isSameFunction(ITypeConstraintExpression expr) {
			return false;
		}

		public abstract boolean matches(ITypeConstraintExpression expr);

		public void replace(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement) {
			// do nothing
		}

		public List<ITypeConstraint> resolve() {
			return Lists.newArrayList();
		}
	}

	/**
	 * A concrete type statement e.g. Integer.class
	 */
	protected class ExplicitTypeConstraintExpr extends TypeConstraintExpr {
		public ExplicitTypeConstraintExpr(Type t) {
			setType(t);
		}

		/**
		 * Reverses the assignment in case a constraint is in the reverse i.e. (Integer.class = a)
		 */
		@Override
		public Type apply(ITypeConstraintExpression right) {
			if(right instanceof ExplicitTypeConstraintExpr) {
				if(!right.getType().equals(this.getType()))
					throw new IllegalStateException("TYPE == TYPE constraint found where types differ!");
				// not meaningful to apply this... it is sort of a surprising result, but should have been
				// eliminated from a solution - better safe and throw an exception.
				throw new IllegalStateException("Attempt to apply TYPE x  == TYPE x - meaningsless");
			}
			return right.apply(this);
		}

		@Override
		public boolean isIdentifier() {
			return true;
		}

		@Override
		public boolean isResolved() {
			return true;
		}

		@Override
		public boolean matches(ITypeConstraintExpression expr) {
			return expr instanceof ExplicitTypeConstraintExpr &&
					((ExplicitTypeConstraintExpr) expr).getType().equals(getType());
		}

	}

	/**
	 * A type production statement e.g. (ß,∂,...)=>µ
	 * 
	 */
	protected class ProducesExpr extends ConstraintExpr {
		private List<ITypeConstraintExpression> given;

		private ITypeConstraintExpression produces;

		public ProducesExpr(ConstraintExpr given, ITypeConstraintExpression produces) {
			this.given = Lists.newArrayList();
			this.given.add(given);
			this.produces = produces;
		}

		public ProducesExpr(ITypeConstraintExpression[] given, ITypeConstraintExpression produces) {
			this.given = Arrays.asList(given);
			this.produces = produces;
		}

		public ProducesExpr(List<ITypeConstraintExpression> given, ITypeConstraintExpression produces) {
			this.given = given;
			this.produces = produces;
		}

		@Override
		public boolean contains(ITypeConstraintExpression expr) {
			if(!produces.contains(expr))
				return false;
			for(ITypeConstraintExpression e : given)
				if(!e.contains(expr))
					return false;
			return super.contains(expr);
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeConstraintExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");
			ProducesExpr otherExpr = (ProducesExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			result.add(new TypeConstraint(produces, otherExpr.produces));
			for(int i = 0; i < given.size(); i++)
				result.add(new TypeConstraint(given.get(i), otherExpr.given.get(i)));
			return result;
		}

		/**
		 * Returns the type of what is produced
		 */
		@Override
		public Type getType() {
			return produces.getType();
		}

		@Override
		public boolean isResolvable() {
			if(!produces.isResolvable())
				return false;
			for(ITypeConstraintExpression e : given)
				if(!e.isResolvable())
					return false;
			return true;
		}

		@Override
		public boolean isResolved() {
			if(!produces.isResolved())
				return false;
			for(ITypeConstraintExpression e : given)
				if(!e.isResolved())
					return false;
			return true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.b3.backend.inference.ITypeConstraintExpression#isSameFunction(org.eclipse.b3.backend.inference.ITypeConstraintExpression)
		 */
		@Override
		public boolean isSameFunction(ITypeConstraintExpression expr) {
			if(!(expr instanceof ProducesExpr))
				return false;
			ProducesExpr otherExpr = (ProducesExpr) expr;
			if(given.size() != otherExpr.given.size())
				return false;
			return true;
		}

		@Override
		public boolean matches(ITypeConstraintExpression expr) {
			if(!(expr instanceof ProducesExpr))
				return false;
			ProducesExpr otherExpr = (ProducesExpr) expr;
			if(!produces.matches(otherExpr))
				return false;
			if(given.size() != otherExpr.given.size())
				return false;
			for(int i = 0; i < given.size(); i++)
				if(!given.get(i).matches(otherExpr.given.get(i)))
					return false;
			return true;
		}

		@Override
		public void replace(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement) {
			if(produces.matches(toBeReplaced))
				produces = replacement;
			for(int i = 0; i < given.size(); i++)
				if(given.get(i).matches(toBeReplaced))
					given.set(i, replacement);
		}

		@Override
		public List<ITypeConstraint> resolve() {
			List<ITypeConstraint> result = produces.resolve();
			for(ITypeConstraintExpression e : given)
				result.addAll(e.resolve());
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("(");
			boolean first = true;
			for(ITypeConstraintExpression e : given) {
				if(first)
					first = false;
				else
					buf.append(", ");
				buf.append(stringProvider.doToString(e));
			}
			buf.append(")=>");
			buf.append(stringProvider.doToString(produces));
			return buf.toString();
		}
	}

	/**
	 * Selects a function based on type of parameters. Result may introduce a new type constraint.
	 * When resolved, behaves like an ExplicitTypeConstraintExpr.
	 * 
	 */
	protected class SelectFunctionExpr extends TypeConstraintExpr {
		private String functionName;

		private List<ITypeConstraintExpression> parameterTypes;

		private EObject scope; // used when finding a function

		/**
		 * @param funcName
		 * @param scope2
		 * @param constraintExpressions
		 */
		public SelectFunctionExpr(String funcName, EObject aScope, ITypeConstraintExpression[] constraintExpressions) {
			this(funcName, aScope, Arrays.asList(constraintExpressions));
		}

		public SelectFunctionExpr(String functionName, EObject scope, List<ITypeConstraintExpression> parameterTypes) {
			this.functionName = functionName;
			this.scope = scope;
			this.parameterTypes = parameterTypes;
		}

		@Override
		public boolean contains(ITypeConstraintExpression expr) {
			for(ITypeConstraintExpression e : parameterTypes)
				if(!e.contains(expr))
					return false;
			return super.contains(expr);
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeConstraintExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");
			SelectFunctionExpr otherExpr = (SelectFunctionExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			for(int i = 0; i < parameterTypes.size(); i++)
				result.add(new TypeConstraint(parameterTypes.get(i), otherExpr.parameterTypes.get(i)));
			return result;
		}

		@Override
		public boolean isIdentifier() {
			return isResolved();
		}

		@Override
		public boolean isResolvable() {
			if(isResolved())
				return true;
			for(ITypeConstraintExpression t : parameterTypes) {
				if(!((t.isIdentifier() && t.isResolved()) || (!t.isIdentifier() && t.isResolvable())))
					return false;
			}
			return true;
		}

		@Override
		public boolean isSameFunction(ITypeConstraintExpression expr) {
			if(!(expr instanceof SelectFunctionExpr))
				return false;
			SelectFunctionExpr otherExpr = (SelectFunctionExpr) expr;
			if(!functionName.equals(otherExpr.functionName))
				return false;
			if(parameterTypes.size() != otherExpr.parameterTypes.size())
				return false;
			return true;
		}

		@Override
		public boolean matches(ITypeConstraintExpression expr) {
			if(!(expr instanceof SelectFunctionExpr))
				return false;
			SelectFunctionExpr otherExpr = (SelectFunctionExpr) expr;
			if(isResolved()) {
				if(!otherExpr.isResolved())
					return false;
				return getType().equals(otherExpr.getType());
			}

			if(!functionName.equals(otherExpr.functionName))
				return false;
			if(!constraintMatch(parameterTypes, otherExpr.parameterTypes))
				return false;
			return true;
		}

		@Override
		public void replace(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement) {
			for(int i = 0; i < parameterTypes.size(); i++)
				if(parameterTypes.get(i).matches(toBeReplaced))
					parameterTypes.set(i, replacement);
		}

		/**
		 * Calls resolve on the parameters, and then internalResolve - which subclasses of this factory
		 * and this constraint expression can override.
		 */
		@Override
		public List<ITypeConstraint> resolve() {
			List<ITypeConstraint> result = Lists.newArrayList();
			for(ITypeConstraintExpression e : parameterTypes)
				result.addAll(e.resolve());

			result.addAll(internalResolve());
			return result;
		}

		/**
		 * TODO: This should not be in the base class !!! The current code is for testing only.
		 * 
		 * @return
		 */
		protected List<ITypeConstraint> internalResolve() {
			if(functionName.equals("+") && parameterTypes.size() == 2) {
				Type[] types = new Type[2];
				types[0] = parameterTypes.get(0).getType();
				types[1] = parameterTypes.get(1).getType();
				setType(ArithmeticFunctions.numberGenericityCalculatorInternal(types));
				return Lists.newArrayList();
			}
			if(functionName.equals("invoke")) {
				Lists.newArrayList();
				ITypeConstraintExpression theLambda = parameterTypes.get(0);
				if(!(theLambda instanceof TypeVariableConstraintExpr))
					throw new IllegalStateException(
						"A function constraint must have a variable constraint as its first parameter");

				// DIFFICULT : invoke( x1=(arity but types not known)=>y1, x2, x3)
				// resulting type = y1 - don't have a variable for that !!
				// TODO: !!!!
				// result.add(constraint(new TypeVariableConstraintExpr(var.getVariable()),
				// produces()
			}
			return Lists.newArrayList();
		}
	}

	/**
	 * A TypeConstraint describes that the right ConstraintExpr should be assignable to the left.
	 * 
	 */
	protected class TypeConstraint implements ITypeConstraint {

		private ITypeConstraintExpression left;

		private ITypeConstraintExpression right;

		public TypeConstraint() {
		}

		public TypeConstraint(ITypeConstraintExpression left, ITypeConstraintExpression right) {
			this.left = left;
			this.right = right;
			// Not very likely, but just in case an already resolved constraint is added
			if(isResolved())
				apply();
		}

		public Type apply() {
			if(!isResolved())
				throw new IllegalStateException("Can not aply an unresolved constraint");
			if(left.isIdentifier() && right.isResolved())
				return left.apply(right);
			if(right.isIdentifier() && left.isResolved())
				return right.apply(left);

			throw new IllegalStateException("isResolved() should have returned false - apply can't do its job");
		}

		public boolean contains(ITypeConstraintExpression expr) {
			if(right.contains(expr))
				return true;
			return false;
		}

		public ITypeConstraintExpression getLeft() {
			return left;
		}

		public ITypeConstraintExpression getRight() {
			return right;
		}

		public void init(ITypeConstraintExpression left, ITypeConstraintExpression right) {
			this.left = left;
			this.right = right;
		}

		public boolean isResolvable() {
			return left.isResolvable() && right.isResolvable();
		}

		public boolean isResolved() {
			if(left.isIdentifier() && right.isResolved())
				return true;
			if(right.isIdentifier() && left.isResolved())
				return true;
			return false;
		}

		public void replace(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement) {
			if(left.matches(toBeReplaced))
				left = replacement;
			else
				left.replace(toBeReplaced, replacement);
			if(right.matches(toBeReplaced))
				right = replacement;
			else
				right.replace(toBeReplaced, replacement);

			// the replacement may have made it resolved.
			if(isResolved())
				apply();
		}

		public List<ITypeConstraint> resolve() {
			List<ITypeConstraint> result = left.resolve();
			result.addAll(right.resolve());
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append(stringProvider.doToString(left));
			buf.append(" = ");
			buf.append(stringProvider.doToString(right));
			return buf.toString();
		}
	}

	/**
	 * For subtypes that have or can be resolved to concrete type.
	 * 
	 */
	protected abstract class TypeConstraintExpr extends ConstraintExpr {
		private Type type;

		@Override
		public Type getType() {
			return type;
		}

		@Override
		public boolean isResolved() {
			return type != null;
		}

		@Override
		public boolean matches(ITypeConstraintExpression expr) {
			if(!(expr instanceof TypeConstraintExpr))
				return false;
			TypeConstraintExpr otherExpr = (TypeConstraintExpr) expr;
			if(type == null && otherExpr.type != null)
				return false;
			return type.equals(otherExpr.type);
		}

		/**
		 * Prints instantiated type in short form (as decided by the stringProvider).
		 */
		@Override
		public String toString() {
			return stringProvider.doToString(type);
		}

		protected void setType(Type t) {
			type = t;
		}

	}

	/**
	 * A constraint variable is a reference to an element's type adapter.
	 * The type adapter's value is tied to an instance of the type provider.
	 */
	protected class TypeVariableConstraintExpr extends ConstraintExpr {
		final private TypeAdapter variable;

		public TypeVariableConstraintExpr(EObject element) {
			TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt(element);
			if(ta == null)
				throw new IllegalArgumentException("Can not associate a type constraint with a: " + element.getClass());
			variable = ta;
		}

		public TypeVariableConstraintExpr(TypeAdapter a) {
			variable = a;
		}

		@Override
		public Type apply(ITypeConstraintExpression right) {
			if(!right.isResolved())
				throw new IllegalStateException("the right expression is not resolved");
			Type t = right.getType();
			if(t == null)
				throw new IllegalStateException("the resolved type lied, and returned null: " +
						stringProvider.doToString(right));

			variable.setAssociatedInfo(getVariableViewKey(), t);
			return t;
		}

		@Override
		public Type getType() {
			return variable.getAssociatedInfo(getVariableViewKey());
		}

		public TypeAdapter getVariable() {
			return variable;
		}

		@Override
		public boolean isIdentifier() {
			return true;
		}

		@Override
		public boolean isResolved() {
			return getType() != null;
		}

		@Override
		public boolean matches(ITypeConstraintExpression expr) {
			if(!(expr instanceof TypeVariableConstraintExpr))
				return false;
			TypeVariableConstraintExpr otherExpr = (TypeVariableConstraintExpr) expr;
			// the identity of a type adapter *is* the variable "name"
			return variable == otherExpr.variable;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("v#");
			buf.append(variable.hashCode()); // the only available identifier
			return buf.toString();
		}

	}

	private static boolean constraintMatch(List<ITypeConstraintExpression> a, List<ITypeConstraintExpression> b) {
		int limit = a.size();
		if(limit != b.size())
			return false;
		for(int i = 0; i < limit; i++)
			if(!a.get(i).matches(b.get(i)))
				return false;
		return true;
	}

	@Inject
	private IStringProvider stringProvider;

	public ITypeConstraint constraint(ITypeConstraintExpression a, ITypeConstraintExpression b) {
		return new TypeConstraint(a, b);
	}

	public ITypeConstraintExpression function(String funcName, EObject scope,
			ITypeConstraintExpression... constraintExpressions) {
		return new SelectFunctionExpr(funcName, scope, constraintExpressions);
	}

	public Object getVariableViewKey() {
		return this;
	}

	public ITypeConstraintExpression produces(ITypeConstraintExpression product, ITypeConstraintExpression... given) {
		return new ProducesExpr(given, product);
	}

	public ITypeConstraintExpression type(Type x) {
		return new ExplicitTypeConstraintExpr(x);
	}

	public ITypeConstraintExpression variable(EObject x) {
		return new TypeVariableConstraintExpr(x);
	}

}
