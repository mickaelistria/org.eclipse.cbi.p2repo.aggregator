/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.util.Collections;

import org.eclipse.b3.backend.core.datatypes.Any;
import org.eclipse.b3.backend.core.datatypes.IntegerWithRadix;
import org.eclipse.b3.backend.evaluator.b3backend.BAndExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralInteger;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BOrExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BLiteralExpressionImpl;
import org.eclipse.b3.backend.functions.ArithmeticFunctions;
import org.eclipse.b3.backend.functions.RelationalFunctions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * A simple constant evaluator
 * 
 */
public class B3ConstantEvaluator {
	public static class ConstantEvaluationResult {
		private Object result;

		private boolean constant;

		private ConstantEvaluationResult(Object result, boolean constant) {
			this.result = result;
			this.constant = constant;
		}

		public Object getResult() {
			return result;
		}

		public boolean isConstant() {
			return constant;
		}
	}

	private final PolymorphicDispatcher<ConstantEvaluationResult> evalDispatcher = new PolymorphicDispatcher<ConstantEvaluationResult>(
		"evalConstant", 1, 1, Collections.singletonList(this), new ErrorHandler<ConstantEvaluationResult>() {
			public ConstantEvaluationResult handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	public static final ConstantEvaluationResult VARIABLE_RESULT = new ConstantEvaluationResult(null, false);

	public static final ConstantEvaluationResult CONSTANT_TRUE = new ConstantEvaluationResult(Boolean.TRUE, true);

	public static final ConstantEvaluationResult CONSTANT_FALSE = new ConstantEvaluationResult(Boolean.FALSE, true);

	public ConstantEvaluationResult doEvalConstant(Object o) {
		return evalDispatcher.invoke(o);
	}

	protected ConstantEvaluationResult handleError(Object[] params, Throwable e) {
		return VARIABLE_RESULT;
	}

	ConstantEvaluationResult evalConstant(BAndExpression o) {
		ConstantEvaluationResult left = doEvalConstant(o.getLeftExpr());
		if(!left.isConstant())
			return VARIABLE_RESULT;
		if(Boolean.FALSE.equals(left.getResult()))
			return CONSTANT_FALSE;
		ConstantEvaluationResult right = doEvalConstant(o.getRightExpr());
		if(!right.isConstant())
			return VARIABLE_RESULT;
		if(Boolean.FALSE.equals(right.getResult()))
			return CONSTANT_FALSE;
		return CONSTANT_TRUE;
	}

	ConstantEvaluationResult evalConstant(BBinaryOpExpression o) {
		String f = o.getFunctionName();
		ConstantEvaluationResult left = doEvalConstant(o.getLeftExpr());
		if(!left.isConstant())
			return VARIABLE_RESULT;
		ConstantEvaluationResult right = doEvalConstant(o.getRightExpr());
		if(!left.isConstant())
			return VARIABLE_RESULT;
		Object leftR = left.getResult();
		Object rightR = right.getResult();
		if("+".equals(f)) {
			// Number + Number
			if(leftR instanceof Number && rightR instanceof Number)
				return new ConstantEvaluationResult(ArithmeticFunctions.add((Number) leftR, (Number) rightR), true);
			// String concatenation (any string or number combination)
			if((leftR instanceof String || leftR instanceof Number) &&
					(rightR instanceof String || rightR instanceof Number))
				return new ConstantEvaluationResult(left.getResult().toString() + right.getResult().toString(), true);
		}
		// Relational
		if("===".equals(f))
			return new ConstantEvaluationResult(RelationalFunctions.isIdentical(leftR, rightR), true);
		else if("==".equals(f)) {
			if(leftR instanceof CharSequence && rightR instanceof CharSequence)
				return new ConstantEvaluationResult(RelationalFunctions.equals(
					(CharSequence) leftR, (CharSequence) rightR), true);
			if(leftR instanceof Number && rightR instanceof Number)
				return new ConstantEvaluationResult(RelationalFunctions.equals((Number) leftR, (Number) rightR), true);
			// equals Object, Object works because List and Map are not considered constants
			return new ConstantEvaluationResult(RelationalFunctions.equals(leftR, rightR), true);
		}
		else if("!=".equals(f)) {
			ConstantEvaluationResult r = null;
			if(leftR instanceof CharSequence && rightR instanceof CharSequence)
				r = new ConstantEvaluationResult(
					RelationalFunctions.equals((CharSequence) leftR, (CharSequence) rightR), true);
			else if(leftR instanceof Number && rightR instanceof Number)
				r = new ConstantEvaluationResult(RelationalFunctions.equals((Number) leftR, (Number) rightR), true);
			// equals Object, Object works because List and Map are not considered constants
			else
				r = new ConstantEvaluationResult(RelationalFunctions.equals(leftR, rightR), true);
			return new ConstantEvaluationResult((r.getResult() instanceof Boolean && r.getResult() == Boolean.FALSE)
					? Boolean.TRUE
					: Boolean.FALSE, true);
		}
		else if("<".equals(f)) {
			if(leftR instanceof Comparable && rightR instanceof Comparable)
				return new ConstantEvaluationResult(RelationalFunctions.isLessThan(
					(Comparable<?>) leftR, (Comparable<?>) rightR), true);
			return VARIABLE_RESULT;
		}
		if("<=".equals(f)) {
			if(leftR instanceof Comparable && rightR instanceof Comparable)
				return new ConstantEvaluationResult(RelationalFunctions.isLessThanOrEqualTo(
					(Comparable<?>) leftR, (Comparable<?>) rightR), true);
			return VARIABLE_RESULT;
		}
		else if(">".equals(f)) {
			if(leftR instanceof Comparable && rightR instanceof Comparable)
				return new ConstantEvaluationResult(RelationalFunctions.isGreaterThan(
					(Comparable<?>) leftR, (Comparable<?>) rightR), true);
			return VARIABLE_RESULT;
		}
		else if(">=".equals(f)) {
			if(leftR instanceof Comparable && rightR instanceof Comparable)
				return new ConstantEvaluationResult(RelationalFunctions.isGreaterThanOrEqualTo(
					(Comparable<?>) leftR, (Comparable<?>) rightR), true);
			return VARIABLE_RESULT;
		}

		// Arithmetic
		if(!(leftR instanceof Number && rightR instanceof Number))
			return VARIABLE_RESULT;
		if("-".equals(f))
			return new ConstantEvaluationResult(ArithmeticFunctions.sub((Number) leftR, (Number) rightR), true);
		else if("*".equals(f))
			return new ConstantEvaluationResult(ArithmeticFunctions.mul((Number) leftR, (Number) rightR), true);
		else if("/".equals(f))
			return new ConstantEvaluationResult(ArithmeticFunctions.div((Number) leftR, (Number) rightR), true);

		return VARIABLE_RESULT;
	}

	ConstantEvaluationResult evalConstant(BDefValue o) {
		if(!o.isImmutable())
			return VARIABLE_RESULT;
		return doEvalConstant(o.getValueExpr());
	}

	ConstantEvaluationResult evalConstant(BLiteralAny o) {
		return new ConstantEvaluationResult(Any.ANY, true);
	}

	ConstantEvaluationResult evalConstant(BLiteralExpressionImpl o) {
		return new ConstantEvaluationResult(o.getValue(), true);
	}

	ConstantEvaluationResult evalConstant(BLiteralInteger o) {
		Object i = o.getValue();
		if(i instanceof IntegerWithRadix)
			i = ((IntegerWithRadix) i).getValue();
		return new ConstantEvaluationResult(i, true);
	}

	ConstantEvaluationResult evalConstant(BLiteralType o) {
		return new ConstantEvaluationResult(o.getType(), true);
	}

	ConstantEvaluationResult evalConstant(BOrExpression o) {
		ConstantEvaluationResult left = doEvalConstant(o.getLeftExpr());
		if(!left.isConstant())
			return VARIABLE_RESULT;
		if(Boolean.TRUE.equals(left.getResult()))
			return CONSTANT_TRUE;
		ConstantEvaluationResult right = doEvalConstant(o.getRightExpr());
		if(!right.isConstant())
			return VARIABLE_RESULT;
		if(Boolean.TRUE.equals(right.getResult()))
			return CONSTANT_TRUE;
		return CONSTANT_FALSE;
	}

	ConstantEvaluationResult evalConstant(BUnaryOpExpression o) {
		String f = o.getFunctionName();
		ConstantEvaluationResult left = doEvalConstant(o.getExpr());
		if(!left.isConstant())
			return VARIABLE_RESULT;
		if("!".equals(f)) {
			if(left.getResult() instanceof Boolean)
				return new ConstantEvaluationResult(((Boolean) left.getResult()) == Boolean.TRUE
						? Boolean.FALSE
						: Boolean.TRUE, true);
		}
		else if("-".equals(f)) {
			if(left.getResult() instanceof Number) {
				return new ConstantEvaluationResult(ArithmeticFunctions.negate((Number) left.getResult()), true);
			}
		}
		return VARIABLE_RESULT;
	}

	ConstantEvaluationResult evalConstant(BVariableExpression o) {
		INamedValue nv = o.getNamedValue();
		if(nv == null)
			return VARIABLE_RESULT;
		return this.doEvalConstant(nv);
	}
}
