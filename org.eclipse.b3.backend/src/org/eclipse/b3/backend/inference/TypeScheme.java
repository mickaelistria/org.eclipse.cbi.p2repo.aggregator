/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.b3.backend.core.IStringProvider;
import org.eclipse.b3.backend.core.adapters.TypeAdapter;
import org.eclipse.b3.backend.core.adapters.TypeAdapterFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTCBooleanLambda;
import org.eclipse.b3.backend.evaluator.b3backend.BTCFirstLambda;
import org.eclipse.b3.backend.evaluator.b3backend.BTCLastLambda;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BTCNumberImpl;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * An implementation of Type Expression interfaces used for solving type constraints.
 * 
 */
public class TypeScheme implements ITypeScheme, ITypeSchemeVariableProvider {

	/**
	 * Abstract base class for type expressions that are or can be resolved to a concrete instance of Type.
	 * 
	 */
	protected abstract class AbstractTypeExpr extends ConstraintExpr {
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
		public boolean matches(ITypeExpression expr) {
			// TODO: possibly compare using just getType()
			if(!(expr instanceof AbstractTypeExpr))
				return false;
			AbstractTypeExpr otherExpr = (AbstractTypeExpr) expr;
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
	 * Abstract implementation of ITypeExpression.
	 */
	protected abstract class ConstraintExpr implements ITypeExpression {

		public Type apply(ITypeExpression right) {
			throw new UnsupportedOperationException("apply on non identifier of type: " + getClass());
		}

		public boolean contains(ITypeExpression expr) {
			return matches(expr);
		}

		/**
		 * Throws UnsupportedOperationException - classes returning true on isSameFunction must implement
		 * this method.
		 */
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			throw new UnsupportedOperationException(
				"A Function Type Expression  should have implemented this, illegal call for others.");
		}

		public Type getType() {
			return null;
		}

		/**
		 * This default implementation returns false. (Only expressions representing a variable
		 * should return true).
		 */
		public boolean isIdentifier() {
			return false;
		}

		/**
		 * This default implementation returns true.
		 */
		public boolean isResolvable() {
			return true;
		}

		public abstract boolean isResolved();

		/**
		 * This implementation returns false. Derived classes representing a type function should return true if
		 * it and the given expr both represent the same function (i.e. same
		 * function (product, etc) with equal arity (same number of parameters)).
		 */
		public boolean isSameFunction(ITypeExpression expr) {
			return false;
		}

		public abstract boolean matches(ITypeExpression expr);

		/**
		 * This default implementation does nothing. A container should replace toBeReplaced with replacement
		 * and pass the call on to its children for all non replaced contained elements.
		 */
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			// do nothing
		}

		/**
		 * This default implementation returns an empty (immutable) list.
		 */
		public List<ITypeConstraint> resolve() {
			return NO_CONSTRAINTS;
		}
	}

	/**
	 * A ConstraintStatement describes that the right ConstraintExpr should be assignable to the left.
	 * 
	 */
	protected class ConstraintStatement implements ITypeConstraint {

		private ITypeExpression left;

		private ITypeExpression right;

		public ConstraintStatement() {
		}

		public ConstraintStatement(ITypeExpression left, ITypeExpression right) {
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

		/**
		 * Checks if rhs contains the expr
		 */
		public boolean contains(ITypeExpression expr) {
			if(right.matches(expr) || right.contains(expr))
				return true;
			return false;
		}

		public ITypeExpression getLeft() {
			return left;
		}

		public ITypeExpression getRight() {
			return right;
		}

		public void init(ITypeExpression left, ITypeExpression right) {
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

		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
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
			return splice(left.resolve(), right.resolve());
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

	// /**
	// * A type function that when applied to a generic type produces a result being one of the
	// * generic arguments - e.g. generic(A<B>)=> B, generic(1, A<B,C>)=>C
	// * Behaves like an ExplicitTypeExpr when resolved.
	// */
	// protected class ElementExpr extends AbstractTypeExpr {
	//
	// private ITypeExpression baseTypeConstraint;
	//
	// public ElementExpr(ITypeExpression constraint) {
	// baseTypeConstraint = constraint;
	// }
	//
	// @Override
	// public boolean contains(ITypeExpression expr) {
	// return baseTypeConstraint.matches(expr) || baseTypeConstraint.contains(expr);
	// }
	//
	// @Override
	// public List<ITypeConstraint> eliminate(ITypeExpression expr) {
	// if(!isSameFunction(expr))
	// throw new IllegalArgumentException("Not an equivalent function");
	//
	// // eliminate element(A), element(B) => A = B
	// ElementExpr otherExpr = (ElementExpr) expr;
	// List<ITypeConstraint> result = Lists.newArrayList();
	// result.add(new ConstraintStatement(baseTypeConstraint, otherExpr.baseTypeConstraint));
	// return result;
	// }
	//
	// @Override
	// public boolean isResolvable() {
	// if(isResolved())
	// return true;
	// ITypeExpression t = baseTypeConstraint;
	// if(!((t.isIdentifier() && t.isResolved()) || (!t.isIdentifier() && t.isResolvable())))
	// return false;
	//
	// return true;
	// }
	//
	// @Override
	// public boolean isSameFunction(ITypeExpression expr) {
	// if(!(expr instanceof GenericArgExpr))
	// return false;
	// GenericArgExpr otherExpr = (GenericArgExpr) expr;
	// if(genericArgIndex != otherExpr.genericArgIndex)
	// return false;
	// return true;
	// }
	//
	// @Override
	// public boolean matches(ITypeExpression expr) {
	// if(isResolved()) {
	// if(expr.isResolved()) {
	// Type otherType = expr.getType();
	// if(!(otherType instanceof ParameterizedType))
	// return false;
	// ParameterizedType pt = (ParameterizedType) otherType;
	// Type[] args = pt.getActualTypeArguments();
	// if(args.length <= genericArgIndex)
	// return false;
	//
	// // match if T equals ?<,,,,U,,,,>
	// return getType().equals(args[genericArgIndex]);
	// }
	// }
	// if(!(expr instanceof GenericArgExpr))
	// return false;
	// GenericArgExpr otherExpr = (GenericArgExpr) expr;
	//
	// if(genericArgIndex != otherExpr.genericArgIndex)
	// return false;
	// if(!baseTypeConstraint.matches(otherExpr.baseTypeConstraint))
	// return false;
	// return true;
	// }
	//
	// @Override
	// public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
	// if(baseTypeConstraint.matches(toBeReplaced))
	// baseTypeConstraint = replacement;
	// else
	// baseTypeConstraint.replace(toBeReplaced, replacement);
	// }
	//
	// /**
	// * Resolves the base expression and attempts to resolve the generic type variable.
	// * If type variable is resolved, this instance will behave like an explicit type expression.
	// */
	// @Override
	// public List<ITypeConstraint> resolve() {
	// if(isResolved())
	// return NO_CONSTRAINTS;
	// List<ITypeConstraint> result = baseTypeConstraint.resolve();
	// if(baseTypeConstraint.isResolved()) {
	// Type t = baseTypeConstraint.getType();
	// if(t instanceof ParameterizedType) {
	// ParameterizedType bp = (ParameterizedType) t;
	// Type[] typeargs = bp.getActualTypeArguments();
	// if(genericArgIndex < typeargs.length)
	// setType(typeargs[genericArgIndex]);
	// }
	// }
	// return result;
	// }
	//
	// @Override
	// public String toString() {
	// StringBuffer buf = new StringBuffer();
	// if(isResolved()) {
	// buf.append("Я[");
	// buf.append(stringProvider.doToString(getType()));
	// buf.append("]");
	// }
	// else {
	// buf.append("generic(");
	// buf.append(genericArgIndex);
	// buf.append(", ");
	// buf.append(baseTypeConstraint.toString());
	// buf.append(")");
	// }
	// return buf.toString();
	// }
	// }

	/**
	 * A concrete type statement e.g. Integer.class
	 */
	protected class ExplicitTypeExpr extends AbstractTypeExpr {
		public ExplicitTypeExpr(Type t) {
			setType(t);
		}

		/**
		 * Reverses the assignment in case a constraint is in the reverse i.e. (Integer.class = a)
		 */
		@Override
		public Type apply(ITypeExpression right) {
			// if right is not an explicit type, try reversing the apply
			if(right instanceof ExplicitTypeExpr) {
				// if left is a default inferred (i.e. a guess) assign the right type
				if(TypeUtils.isDefaultInferred(getType()))
					setType(right.getType());
				else if(TypeUtils.isDefaultInferred(right.getType()))
					return getType(); // do not override a known type with an unknown
				// else there is a conflict left != right
				else if(!right.getType().equals(getType()))
					throw new IllegalStateException("TYPE == TYPE constraint found where types differ! " +
							stringProvider.doToString(getType()) + " != " + stringProvider.doToString(right.getType()));
				else
					// they where equal - do nothing, just return the type
					return getType();
			}
			// try the reverse
			return right.apply(this);
		}

		@Override
		public boolean isResolved() {
			return true;
		}

		@Override
		public boolean matches(ITypeExpression expr) {
			// TODO: should probably use assignment compatibility instead of equals
			return expr instanceof ExplicitTypeExpr && ((ExplicitTypeExpr) expr).getType().equals(getType());
		}

	}

	/**
	 * A type function that when applied to a generic type produces a result being one of the
	 * generic arguments - e.g. generic(A<B>)=> B, generic(1, A<B,C>)=>C
	 * Behaves like an ExplicitTypeExpr when resolved.
	 */
	protected class GenericArgExpr extends AbstractTypeExpr {

		private ITypeExpression baseTypeConstraint;

		private int genericArgIndex;

		public GenericArgExpr(ITypeExpression constraint) {
			baseTypeConstraint = constraint;
			genericArgIndex = 0;
		}

		public GenericArgExpr(ITypeExpression constraint, int index) {
			baseTypeConstraint = constraint;
			genericArgIndex = index;
		}

		@Override
		public boolean contains(ITypeExpression expr) {
			return baseTypeConstraint.matches(expr) || baseTypeConstraint.contains(expr);
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");

			// eliminate generic(n, A), generic(n, B) => A = B
			GenericArgExpr otherExpr = (GenericArgExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			result.add(new ConstraintStatement(baseTypeConstraint, otherExpr.baseTypeConstraint));
			return result;
		}

		@Override
		public boolean isResolvable() {
			if(isResolved())
				return true;
			ITypeExpression t = baseTypeConstraint;
			if(!((t.isIdentifier() && t.isResolved()) || (!t.isIdentifier() && t.isResolvable())))
				return false;

			return true;
		}

		@Override
		public boolean isSameFunction(ITypeExpression expr) {
			if(!(expr instanceof GenericArgExpr))
				return false;
			GenericArgExpr otherExpr = (GenericArgExpr) expr;
			if(genericArgIndex != otherExpr.genericArgIndex)
				return false;
			return true;
		}

		@Override
		public boolean matches(ITypeExpression expr) {
			if(isResolved()) {
				if(expr.isResolved()) {
					Type otherType = expr.getType();
					if(!(otherType instanceof ParameterizedType))
						return false;
					ParameterizedType pt = (ParameterizedType) otherType;
					Type[] args = pt.getActualTypeArguments();
					if(args.length <= genericArgIndex)
						return false;

					// match if T equals ?<,,,,U,,,,>
					return getType().equals(args[genericArgIndex]);
				}
			}
			if(!(expr instanceof GenericArgExpr))
				return false;
			GenericArgExpr otherExpr = (GenericArgExpr) expr;

			if(genericArgIndex != otherExpr.genericArgIndex)
				return false;
			if(!baseTypeConstraint.matches(otherExpr.baseTypeConstraint))
				return false;
			return true;
		}

		@Override
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			if(baseTypeConstraint.matches(toBeReplaced))
				baseTypeConstraint = replacement;
			else
				baseTypeConstraint.replace(toBeReplaced, replacement);
		}

		/**
		 * Resolves the base expression and attempts to resolve the generic type variable.
		 * If type variable is resolved, this instance will behave like an explicit type expression.
		 */
		@Override
		public List<ITypeConstraint> resolve() {
			if(isResolved())
				return NO_CONSTRAINTS;
			List<ITypeConstraint> result = baseTypeConstraint.resolve();
			if(baseTypeConstraint.isResolved()) {
				Type t = baseTypeConstraint.getType();
				if(t instanceof ParameterizedType) {
					ParameterizedType bp = (ParameterizedType) t;
					Type[] typeargs = bp.getActualTypeArguments();
					if(genericArgIndex < typeargs.length)
						setType(typeargs[genericArgIndex]);
				}
			}
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			if(isResolved()) {
				buf.append("Я[");
				buf.append(stringProvider.doToString(getType()));
				buf.append("]");
			}
			else {
				buf.append("generic(");
				buf.append(genericArgIndex);
				buf.append(", ");
				buf.append(baseTypeConstraint.toString());
				buf.append(")");
			}
			return buf.toString();
		}
	}

	/**
	 * A type production statement e.g. λ(ß,∂,...)=>µ
	 * 
	 */
	protected class LambdaExpr extends ConstraintExpr implements Producer {
		private List<ITypeExpression> given;

		private ITypeExpression product;

		/**
		 * λ(given)=>produces
		 * 
		 * @param given
		 * @param produces
		 */
		public LambdaExpr(ConstraintExpr given, ITypeExpression produces) {
			this.given = Lists.newArrayList();
			this.given.add(given);
			this.product = produces;
		}

		/**
		 * λ(given...)=>produces
		 * 
		 * @param given
		 * @param produces
		 */
		public LambdaExpr(ITypeExpression[] given, ITypeExpression produces) {
			this.given = Arrays.asList(given);
			this.product = produces;
		}

		/**
		 * λ(given...)=>produces
		 * 
		 * @param given
		 * @param produces
		 */
		public LambdaExpr(List<ITypeExpression> given, ITypeExpression produces) {
			this.given = given;
			this.product = produces;
		}

		@Override
		public boolean contains(ITypeExpression expr) {
			if(product.matches(expr) || product.contains(expr))
				return true;
			for(ITypeExpression e : given)
				if(e.matches(expr) || e.contains(expr))
					return true;
			return super.contains(expr);
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");
			LambdaExpr otherExpr = (LambdaExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			result.add(new ConstraintStatement(product, otherExpr.product));
			for(int i = 0; i < given.size(); i++)
				result.add(new ConstraintStatement(given.get(i), otherExpr.given.get(i)));
			return result;
		}

		public ITypeExpression getProduct() {
			return product;
		}

		/**
		 * Returns the type of what is produced
		 */
		@Override
		public Type getType() {
			return product.getType();
		}

		@Override
		public boolean isResolvable() {
			if(!product.isResolvable())
				return false;
			for(ITypeExpression e : given)
				if(!e.isResolvable())
					return false;
			return true;
		}

		@Override
		public boolean isResolved() {
			if(!product.isResolved())
				return false;
			for(ITypeExpression e : given)
				if(!e.isResolved())
					return false;
			return true;
		}

		@Override
		public boolean isSameFunction(ITypeExpression expr) {
			if(!(expr instanceof LambdaExpr))
				return false;
			LambdaExpr otherExpr = (LambdaExpr) expr;
			if(given.size() != otherExpr.given.size())
				return false;
			return true;
		}

		@Override
		public boolean matches(ITypeExpression expr) {
			if(!(expr instanceof LambdaExpr))
				return false;
			LambdaExpr otherExpr = (LambdaExpr) expr;
			if(!product.matches(otherExpr))
				return false;
			if(given.size() != otherExpr.given.size())
				return false;
			for(int i = 0; i < given.size(); i++)
				if(!given.get(i).matches(otherExpr.given.get(i)))
					return false;
			return true;
		}

		@Override
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			if(product.matches(toBeReplaced))
				product = replacement;
			else
				product.replace(toBeReplaced, replacement);
			for(int i = 0; i < given.size(); i++)
				if(given.get(i).matches(toBeReplaced))
					given.set(i, replacement);
				else
					given.get(i).replace(toBeReplaced, replacement);
		}

		@Override
		public List<ITypeConstraint> resolve() {
			List<ITypeConstraint> result = product.resolve();
			for(ITypeExpression e : given)
				result = splice(result, e.resolve());
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("(");
			boolean first = true;
			for(ITypeExpression e : given) {
				if(first)
					first = false;
				else
					buf.append(", ");
				buf.append(stringProvider.doToString(e));
			}
			buf.append(")=>");
			buf.append(stringProvider.doToString(product));
			return buf.toString();
		}
	}

	/**
	 * A type function that constructs a parameterized type out of constraints for the
	 * base type and type arguments.
	 * parameterizedType(α, ß, γ) when resolved produces type α<ß,γ>
	 */
	protected class ParameterizedTypeExpr extends AbstractTypeExpr {
		private List<ITypeExpression> parameters;

		public ParameterizedTypeExpr(ITypeExpression... params) {
			if(params.length < 2)
				throw new IllegalArgumentException(
					"A ParameterizedTypeExpression must have at least a base and one argument");
			parameters = Lists.newArrayList(params);
			if(isResolved())
				constructType();
		}

		/**
		 * Reverses the assignment in case a constraint is in the reverse i.e. (Integer.class = a)
		 * TODO: Unnown if this is correct for Parameterized type - i.e. is Default<Default,...> every used,
		 * or just a raw Object, or List<?>, Iterator<?> etc.
		 */
		@Override
		public Type apply(ITypeExpression right) {
			// if right is not an explicit type, try reversing the apply
			if(right instanceof ExplicitTypeExpr) {
				// if left is a default inferred (i.e. a guess) assign the right type
				if(TypeUtils.isDefaultInferred(getType()))
					setType(right.getType());
				else if(TypeUtils.isDefaultInferred(right.getType()))
					return getType(); // do not override a known type with an unknown
				// else there is a conflict left != right
				else if(!right.getType().equals(getType()))
					throw new IllegalStateException("TYPE == TYPE constraint found where types differ! " +
							stringProvider.doToString(getType()) + " != " + stringProvider.doToString(right.getType()));
				else
					// they where equal - do nothing, just return the type
					return getType();
			}
			// try the reverse
			return right.apply(this);
		}

		@Override
		public boolean contains(ITypeExpression expr) {
			for(int i = 0; i < parameters.size(); i++) {
				ITypeExpression e = parameters.get(i);
				if(e.matches(expr) || e.contains(expr))
					return true;
			}
			return false;
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not same type of function - can not eliminate");
			if(expr instanceof ParameterizedTypeExpr) {
				ParameterizedTypeExpr otherExpr = (ParameterizedTypeExpr) expr;
				List<ITypeConstraint> result = Lists.newArrayList();
				for(int i = 0; i < parameters.size(); i++)
					result.add(constraint(parameters.get(i), otherExpr.parameters.get(i)));
				return result;
			}
			if(expr instanceof ExplicitTypeExpr) {
				// already checked to be resolved and ParameterizedType (or isSameFunction returned false).
				ParameterizedType t = (ParameterizedType) expr.getType();
				Type[] typeArgs = t.getActualTypeArguments();
				List<ITypeConstraint> result = Lists.newArrayList();
				result.add(constraint(parameters.get(0), type(t.getRawType())));
				for(int i = 0; i < typeArgs.length; i++)
					result.add(constraint(parameters.get(1 + i), type(typeArgs[i])));
				return result;
			}
			throw new IllegalStateException("Elimination failed - no condition applicable");
		}

		@Override
		public boolean isSameFunction(ITypeExpression expr) {
			// true if same type and same arity
			if(expr instanceof ParameterizedTypeExpr &&
					((ParameterizedTypeExpr) expr).parameters.size() == parameters.size())
				return true;
			// true if parameterized type and base+args = arity
			if(expr instanceof ExplicitTypeExpr) {
				if(!expr.isResolved())
					return false;
				Type t = expr.getType();
				if(t == null || !(t instanceof ParameterizedType))
					return false;
				Type[] typeArgs = ((ParameterizedType) t).getActualTypeArguments();
				if(typeArgs.length == parameters.size() - 1)
					return true;
			}
			return false;
		}

		/**
		 * matches a ParameterizedTypeExpr with matching parameters, or an Explicit type with same
		 * parameters.
		 */
		@Override
		public boolean matches(ITypeExpression expr) {
			if(isResolved())
				return super.matches(expr);
			if(!(expr instanceof ParameterizedTypeExpr || expr instanceof ExplicitTypeExpr))
				return false;

			if(expr instanceof ParameterizedTypeExpr) {
				ParameterizedTypeExpr otherExpr = (ParameterizedTypeExpr) expr;
				if(parameters.size() != otherExpr.parameters.size())
					return false;
				for(int i = 0; i < parameters.size(); i++)
					if(!parameters.get(i).matches(otherExpr.parameters.get(i)))
						return false;
				return true;
			}
			if(expr instanceof ExplicitTypeExpr && expr.getType() instanceof ParameterizedType) {
				ParameterizedType t = (ParameterizedType) expr.getType();
				Type[] typeArgs = t.getActualTypeArguments();
				if(!parameters.get(0).matches(type(t.getRawType())))
					return false;
				for(int i = 1; i < parameters.size(); i++)
					if(!parameters.get(i).matches(type(typeArgs[i - 1])))
						return false;
				return true;
			}
			return false;
		}

		@Override
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			for(int i = 0; i < parameters.size(); i++)
				if(parameters.get(i).matches(toBeReplaced))
					parameters.set(i, replacement);
				else
					parameters.get(i).replace(toBeReplaced, replacement);
		}

		@Override
		public List<ITypeConstraint> resolve() {
			if(isResolved())
				return NO_CONSTRAINTS;
			List<ITypeConstraint> result = NO_CONSTRAINTS;
			boolean allResolved = true;
			for(ITypeExpression e : parameters) {
				result = splice(result, e.resolve());
				allResolved = e.isResolved() && allResolved;
			}
			if(allResolved)
				constructType();
			return result;
		}

		@Override
		public String toString() {
			if(isResolved())
				return super.toString();
			StringBuffer buf = new StringBuffer();
			buf.append("parameterizedType(");
			buf.append(parameters.get(0).toString());
			buf.append("<");
			for(int i = 1; i < parameters.size(); i++) {
				buf.append(i == 1
						? ""
						: ",");
				buf.append(parameters.get(i).toString());
			}
			buf.append(">)");
			return buf.toString();
		}

		/**
		 * Constructs a BParameterizedType from resolved parameters.
		 */
		private void constructType() {
			B3ParameterizedType t = B3backendFactory.eINSTANCE.createB3ParameterizedType();
			t.setRawType(parameters.get(0).getType());
			EList<Type> argList = t.getActualArgumentsList();
			for(int i = 1; i < parameters.size(); i++)
				argList.add(parameters.get(i).getType());
			setType(t);
		}
	}

	protected interface Producer {
		ITypeExpression getProduct();
	}

	/**
	 * Constrains type to what is produced by a Producer (e.g. lambda or select function)
	 * When resolved, behaves like an ExplicitTypeExpr.
	 * 
	 */
	protected class ProductExpr extends AbstractTypeExpr {

		private ITypeExpression producerConstraint;

		public ProductExpr(ITypeExpression constraint) {
			producerConstraint = constraint;
		}

		@Override
		public boolean contains(ITypeExpression expr) {
			return producerConstraint.matches(expr) || producerConstraint.contains(expr);
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");

			// eliminate product(A) = product(n, B) => A = B
			ProductExpr otherExpr = (ProductExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			result.add(new ConstraintStatement(producerConstraint, otherExpr.producerConstraint));
			return result;
		}

		@Override
		public boolean isResolvable() {
			if(isResolved())
				return true;
			ITypeExpression t = producerConstraint;
			if(!(t instanceof Producer && t.isResolvable()))
				return false;
			return true;
		}

		@Override
		public boolean isSameFunction(ITypeExpression expr) {
			return expr instanceof ProductExpr;
		}

		@Override
		public boolean matches(ITypeExpression expr) {
			if(isResolved() && expr.isResolved())
				return getType().equals(expr.getType());

			if(!(expr instanceof ProductExpr))
				return false;
			ProductExpr otherExpr = (ProductExpr) expr;

			if(!producerConstraint.matches(otherExpr.producerConstraint))
				return false;
			return true;
		}

		@Override
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			if(producerConstraint.matches(toBeReplaced))
				producerConstraint = replacement;
			else
				producerConstraint.replace(toBeReplaced, replacement);
		}

		@Override
		public List<ITypeConstraint> resolve() {
			if(isResolved())
				return NO_CONSTRAINTS; // no new constraints
			List<ITypeConstraint> result = producerConstraint.resolve();
			if(producerConstraint.isResolved())
				setType(producerConstraint.getType());
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			if(isResolved()) {
				buf.append("Я[");
				buf.append(stringProvider.doToString(getType()));
				buf.append("]");
			}
			else {
				buf.append("product(");
				buf.append(producerConstraint.toString());
				buf.append(")");
			}
			return buf.toString();
		}
	}

	/**
	 * Selects a function based on type of parameters. Result may introduce a new type constraint.
	 * When resolved, behaves like an ExplicitTypeExpr.
	 * 
	 */
	protected class SelectExpr extends ConstraintExpr implements Producer {
		private String functionName;

		private List<ITypeExpression> parameterTypes;

		private ITypeExpression produces;

		private BExpression scope; // used when finding a function

		public SelectExpr(String funcName, BExpression viewPoint, ITypeExpression[] constraintExpressions) {
			this(funcName, tmpVariable(tmpVarName(funcName)), viewPoint, Arrays.asList(constraintExpressions));
		}

		public SelectExpr(String funcName, BExpression viewPoint, List<ITypeExpression> parameterTypes) {
			this(funcName, tmpVariable(tmpVarName(funcName)), viewPoint, parameterTypes);
		}

		public SelectExpr(String funcName, ITypeExpression produces, BExpression viewPoint,
				ITypeExpression[] constraintExpressions) {
			this(funcName, produces, viewPoint, Arrays.asList(constraintExpressions));
		}

		public SelectExpr(String functionName, ITypeExpression produces, BExpression viewPoint,
				List<ITypeExpression> parameterTypes) {
			this.functionName = functionName;
			this.scope = viewPoint;
			this.parameterTypes = parameterTypes;
			this.produces = produces;
		}

		@Override
		public boolean contains(ITypeExpression expr) {
			for(ITypeExpression e : parameterTypes)
				if(e.contains(expr) || e.matches(expr))
					return true;
			if(produces.matches(expr) || produces.contains(expr))
				return true;
			return false; // was super.contains(expr)
		}

		@Override
		public List<ITypeConstraint> eliminate(ITypeExpression expr) {
			if(!isSameFunction(expr))
				throw new IllegalArgumentException("Not an equivalent function");
			SelectExpr otherExpr = (SelectExpr) expr;
			List<ITypeConstraint> result = Lists.newArrayList();
			for(int i = 0; i < parameterTypes.size(); i++)
				result.add(new ConstraintStatement(parameterTypes.get(i), otherExpr.parameterTypes.get(i)));
			result.add(new ConstraintStatement(produces, otherExpr.produces));
			return result;
		}

		public ITypeExpression getProduct() {
			return produces;
		}

		@Override
		public Type getType() {
			return produces.getType();
		}

		// @Override
		// public boolean isIdentifier() {
		// return false;
		// // return isResolved();
		// }

		@Override
		public boolean isResolvable() {
			if(isResolved())
				return true;
			for(ITypeExpression t : parameterTypes) {
				if(!((t.isIdentifier() && t.isResolved()) || (!t.isIdentifier() && t.isResolvable())))
					return false;
			}
			return true;
		}

		@Override
		public boolean isResolved() {
			if(!produces.isResolved())
				return false;
			for(ITypeExpression e : parameterTypes)
				if(!e.isResolved())
					return false;
			return true;
		}

		@Override
		public boolean isSameFunction(ITypeExpression expr) {
			if(!(expr instanceof SelectExpr))
				return false;
			SelectExpr otherExpr = (SelectExpr) expr;
			if(!functionName.equals(otherExpr.functionName))
				return false;
			if(parameterTypes.size() != otherExpr.parameterTypes.size())
				return false;
			return true;
		}

		@Override
		public boolean matches(ITypeExpression expr) {
			if(isResolved()) {
				if(expr.isResolved())
					return getType().equals(expr.getType());
			}
			if(!(expr instanceof SelectExpr))
				return false;
			SelectExpr otherExpr = (SelectExpr) expr;

			if(!functionName.equals(otherExpr.functionName))
				return false;
			if(!constraintMatch(parameterTypes, otherExpr.parameterTypes))
				return false;
			if(!produces.matches(otherExpr.produces))
				return false;
			return true;
		}

		@Override
		public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement) {
			for(int i = 0; i < parameterTypes.size(); i++)
				if(parameterTypes.get(i).matches(toBeReplaced))
					parameterTypes.set(i, replacement);
				else
					parameterTypes.get(i).replace(toBeReplaced, replacement);
			if(produces.matches(toBeReplaced))
				produces = replacement;
			else
				produces.replace(toBeReplaced, replacement);
		}

		/**
		 * Calls resolve on the parameters, and then internalResolve - which subclasses of this factory
		 * and this constraint expression can override.
		 */
		@Override
		public List<ITypeConstraint> resolve() {
			List<ITypeConstraint> result = NO_CONSTRAINTS;
			if(isResolved())
				return result;
			for(ITypeExpression e : parameterTypes)
				result = splice(result, e.resolve());
			result = splice(result, produces.resolve());
			result = splice(result, internalResolve());
			return result;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			if(isResolved())
				buf.append("Я[");
			buf.append("select('" + functionName + "'");
			for(ITypeExpression e : parameterTypes) {
				buf.append(", ");
				buf.append(stringProvider.doToString(e));
			}
			buf.append(")");
			buf.append("=>");
			buf.append(stringProvider.doToString(produces));
			if(isResolved()) {
				buf.append("]");
			}
			return buf.toString();
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
				if(types[0] != null && types[1] != null)
					return Lists.newArrayList(constraint(
						produces, type(BTCNumberImpl.numberGenericityCalculator(types))));
				return Lists.newArrayList();
			}
			// Simulation of what invoke's type calculator should do:
			if(functionName.equals("invoke")) {
				ArrayList<ITypeConstraint> result = Lists.newArrayList();
				ITypeExpression theLambda = parameterTypes.get(0);

				ITypeExpression[] exprs = new ITypeExpression[parameterTypes.size()];
				// select('invoke', (X0..Xn)=>Y, X0..Xn)
				ITypeExpression product = product(theLambda);
				exprs[0] = lambda(product, parameterTypes.subList(1, parameterTypes.size()));
				for(int i = 1; i < parameterTypes.size(); i++)
					exprs[i] = parameterTypes.get(i);
				result.add(constraint(this, select("invoke", product, scope, exprs)));
				return result;
			}
			// TODO: This simulates what a function using the tc first lambda does
			if(functionName.equals("firstLambda")) {
				ArrayList<ITypeConstraint> result = Lists.newArrayList();
				BTCFirstLambda tc = B3backendFactory.eINSTANCE.createBTCFirstLambda();
				result.addAll(tc.getConstraints("firstLambda", scope, TypeScheme.this, parameterTypes, SelectExpr.this));
				return result;
			}
			// TODO: This simulates what a function using the tc first lambda does
			if(functionName.equals("lastLambda")) {
				ArrayList<ITypeConstraint> result = Lists.newArrayList();
				BTCLastLambda tc = B3backendFactory.eINSTANCE.createBTCLastLambda();
				result.addAll(tc.getConstraints("lastLambda", scope, TypeScheme.this, parameterTypes, SelectExpr.this));
				return result;
			}
			// TODO: This simulates what a function using the tc first lambda does
			if(functionName.equals("booleanLambda")) {
				ArrayList<ITypeConstraint> result = Lists.newArrayList();
				BTCBooleanLambda tc = B3backendFactory.eINSTANCE.createBTCBooleanLambda();
				result.addAll(tc.getConstraints(
					"booleanLambda", scope, TypeScheme.this, parameterTypes, SelectExpr.this));
				return result;
			}
			return Lists.newArrayList();
		}
	}

	/**
	 * A constraint variable is a reference to an element's type adapter.
	 * The type adapter's value is tied to an instance of the type provider.
	 */
	protected class VariableExpr extends ConstraintExpr {
		final private TypeAdapter variable;

		final private EObject obj;

		public VariableExpr(EObject element) {
			TypeAdapter ta = TypeAdapterFactory.eINSTANCE.adapt(element);
			if(ta == null)
				throw new IllegalArgumentException("Can not associate a type constraint with a: " + element.getClass());
			variable = ta;
			obj = element;
		}

		@Override
		public Type apply(ITypeExpression right) {
			if(!right.isResolved())
				throw new IllegalStateException("the right expression is not resolved");
			Type t = right.getType();
			if(t == null)
				throw new IllegalStateException("the resolved type lied, and returned null: " +
						stringProvider.doToString(right));

			variable.setAssociatedType(getVariableKey(obj), t);
			return t;
		}

		@Override
		public Type getType() {
			return variable.getAssociatedType(getVariableKey(obj));
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
		public boolean matches(ITypeExpression expr) {
			if(!(expr instanceof VariableExpr))
				return false;
			VariableExpr otherExpr = (VariableExpr) expr;
			// the identity of a type adapter *is* the variable "name"
			return variable == otherExpr.variable;
		}

		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			if(obj instanceof INamedValue)
				buf.append(((INamedValue) obj).getName());
			else {
				buf.append("v#");
				buf.append(variable.hashCode()); // the only available identifier
			}
			return buf.toString();
		}

	}

	private static int tmpVarCounter = 0;

	private static boolean constraintMatch(List<ITypeExpression> a, List<ITypeExpression> b) {
		int limit = a.size();
		if(limit != b.size())
			return false;
		for(int i = 0; i < limit; i++)
			if(!a.get(i).matches(b.get(i)))
				return false;
		return true;
	}

	private static String tmpVarName(String s) {
		return "σ(" + s + tmpVarCounter++ + ")";
	}

	@Inject
	private IStringProvider stringProvider;

	private ITypeSchemeVariableProvider parent;

	private Set<EObject> genericVariables;

	@Inject
	public TypeScheme(IStringProvider stringProvider) {
		this.stringProvider = stringProvider;
		this.genericVariables = Sets.newHashSet();
	}

	public ITypeConstraint constraint(ITypeExpression a, ITypeExpression b) {
		return new ConstraintStatement(a, b);
	}

	public ITypeExpression generic(EObject a) {
		return generic(0, a);
	}

	public ITypeExpression generic(int index, EObject a) {
		return new GenericArgExpr(variable(a), index);
	}

	public ITypeExpression generic(int index, ITypeExpression a) {
		return new GenericArgExpr(a, index);
	}

	public ITypeExpression generic(ITypeExpression a) {
		return new GenericArgExpr(a, 0);
	}

	/**
	 * @return the parent
	 */
	public ITypeSchemeVariableProvider getParent() {
		return parent;
	}

	public ITypeSchemeVariableProvider getParentScheme() {
		return parent;
	}

	public Object getSchemeKey() {
		return this;
	}

	public Object getVariableKey(EObject var) {
		if(genericVariables.contains(var))
			return getSchemeKey();
		return parent != null
				? parent.getVariableKey(var)
				: getSchemeKey();
	}

	public ITypeExpression lambda(ITypeExpression producerConstraint) {
		return new ProductExpr(producerConstraint);
	}

	public ITypeExpression lambda(ITypeExpression product, ITypeExpression... given) {
		return new LambdaExpr(given, product);
	}

	public ITypeExpression lambda(ITypeExpression product, List<ITypeExpression> given) {
		return new LambdaExpr(given, product);
	}

	/**
	 * Makes the variable x generic by getting its value in the parent scheme, and setting it in this scheme
	 * with the same value. Subsequent access to the variable x via this scheme will manipulate the
	 * unique variable value of x for this scheme.
	 * 
	 * Throws IllegalStateException if this scheme does not have a parent scheme.
	 * 
	 * @param x
	 * @return
	 */
	public ITypeExpression makeSchemeScopedVariable(EObject x) {
		if(parent == null)
			throw new IllegalStateException(
				"Variables can only be made generic in a sub scheme - this scheme has no parent");
		VariableExpr xConstraint = new VariableExpr(x);
		TypeAdapter xVar = xConstraint.getVariable();
		// Copy value from parent's view of variable to this view.
		xVar.setAssociatedType(getSchemeKey(), xVar.getAssociatedType(parent.getVariableKey(x)));
		genericVariables.add(x);
		return xConstraint;
	}

	public ITypeExpression parameterizedType(ITypeExpression... given) {
		return new ParameterizedTypeExpr(given);
	}

	public ITypeExpression product(ITypeExpression producerConstraint) {
		return new ProductExpr(producerConstraint);
	}

	public ITypeExpression select(String funcName, BExpression callExpr, ITypeExpression... constraintExpressions) {
		return new SelectExpr(funcName, callExpr, constraintExpressions);
	}

	public ITypeExpression select(String funcName, BExpression callExpr, List<ITypeExpression> constraintExpressions) {
		return new SelectExpr(funcName, callExpr, constraintExpressions);
	}

	public ITypeExpression select(String funcName, ITypeExpression producesConstraint, BExpression callExpr,
			ITypeExpression... constraintExpressions) {
		return new SelectExpr(funcName, producesConstraint, callExpr, constraintExpressions);
	}

	public ITypeExpression select(String funcName, ITypeExpression producesConstraint, BExpression callExpr,
			List<ITypeExpression> constraintExpressions) {
		return new SelectExpr(funcName, producesConstraint, callExpr, constraintExpressions);
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(ITypeSchemeVariableProvider parent) {
		this.parent = parent;
	}

	public List<ITypeConstraint> splice(List<ITypeConstraint> a, List<ITypeConstraint> b) {
		if(a == NO_CONSTRAINTS || a.size() == 0) {
			if(b == NO_CONSTRAINTS || b.size() == 0)
				return NO_CONSTRAINTS;
			return b;
		}
		if(b.size() > 0) {
			List<ITypeConstraint> result = new ArrayList<ITypeConstraint>(a.size() + b.size());
			result.addAll(a);
			result.addAll(b);
			return result;
		}
		return a;

	}

	/**
	 * Create a subScheme for solving a sub problem.
	 * 
	 * @return
	 */
	public ITypeScheme subScheme() {
		TypeScheme subScheme = new TypeScheme(stringProvider);
		subScheme.parent = this;
		return subScheme;
	}

	/**
	 * Sets the values of all variables made generic in this scheme in the corresponding variable in
	 * the parent type scheme. See {@link #subScheme()}.
	 * 
	 */
	public void supplant() {
		if(parent == null)
			return; // nothing to supplant to
		for(EObject x : genericVariables)
			supplant(x);
	}

	public ITypeExpression type(Type x) {
		return new ExplicitTypeExpr(x);
	}

	public ITypeExpression variable(EObject x) {
		return new VariableExpr(x);
	}

	/**
	 * Sets the value of x in this scheme in the parent scheme.
	 * 
	 * @param x
	 */
	private void supplant(EObject x) {
		VariableExpr xConstraint = new VariableExpr(x);
		TypeAdapter xVar = xConstraint.getVariable();

		xVar.setAssociatedType(parent.getVariableKey(x), xVar.getAssociatedType(getSchemeKey()));
	}

	/**
	 * Note that name is for debugging only.
	 * 
	 * @param name
	 * @return
	 */
	private ITypeExpression tmpVariable(String name) {
		BDefValue tmp = B3backendFactory.eINSTANCE.createBDefValue();
		tmp.setName(name);
		return variable(tmp);
	}

}
