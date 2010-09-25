package org.eclipse.b3.backend.functions;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.datatypes.DoubleSequence;
import org.eclipse.b3.backend.core.datatypes.IntegerSequence;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class ArithmeticFunctions {

	@B3Backend(funcNames = { "+" })
	public static Number add(@B3Backend(name = "op1") Number a, @B3Backend(name = "op2") Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue() + b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() + b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() + b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() + b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() + b.shortValue()));
		throw new IllegalArgumentException("Addition of unsupported Number subclass: " + a.getClass().toString() + "," +
				b.getClass().toString());
	}

	@B3Backend(funcNames = { "&" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseAnd(Number a, Number b) {
		if(a instanceof BigInteger && trueWithSideEffect(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && trueWithSideEffect(a = convertToBigInteger(a)))
			return ((BigInteger) a).and((BigInteger) b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() & b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() & b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() & b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() & b.byteValue()));
		throw new IllegalArgumentException("Bitwise AND of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "~" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseComplement(Number a) {
		if(a instanceof BigInteger)
			return ((BigInteger) a).not();
		if(a instanceof Long)
			return new Long(~a.longValue());
		if(a instanceof Integer)
			return new Integer(~a.intValue());
		if(a instanceof Short)
			return new Short((short) ~(a.shortValue()));
		if(a instanceof Byte)
			return new Byte((byte) ~(a.byteValue()));
		throw new IllegalArgumentException("Unary bitwize complement (~) on unsupported Number subclass: " +
				a.getClass().toString());
	}

	@B3Backend(funcNames = { "<<" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseLeftShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger) a).shiftLeft(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() << b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() << b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() << b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() << b.intValue()));
		throw new IllegalArgumentException("Bitwise LSHIFT of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "|" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseOr(Number a, Number b) {
		if(a instanceof BigInteger && trueWithSideEffect(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && trueWithSideEffect(a = convertToBigInteger(a)))
			return ((BigInteger) a).or((BigInteger) b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() | b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() | b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() | b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() | b.byteValue()));
		throw new IllegalArgumentException("Bitwise OR of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { ">>" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseRightShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger) a).shiftRight(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() >> b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() >> b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() >> b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() >> b.intValue()));
		throw new IllegalArgumentException("Bitwise RSHIFT of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { ">>>" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseUnsignedRightShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger) a).shiftRight(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() >>> b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() >>> b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() >>> b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() >>> b.intValue()));
		throw new IllegalArgumentException("Bitwise Unsigned RSHIFT of unsupported Number subclass: " +
				a.getClass().toString() + "," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "^" }, guardFunction = "permitIntegralOnlyGuard")
	public static Number bitwiseXor(Number a, Number b) {
		if(a instanceof BigInteger && trueWithSideEffect(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && trueWithSideEffect(a = convertToBigInteger(a)))
			return ((BigInteger) a).xor((BigInteger) b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() ^ b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() ^ b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() ^ b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() ^ b.byteValue()));
		throw new IllegalArgumentException("Bitwise XOR of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "--" })
	public static Number decrement(Number a) {
		if(a instanceof Double)
			return new Double(a.doubleValue() - 1.0);
		if(a instanceof Float)
			return new Float(a.floatValue() - 1.0f);
		if(a instanceof Long)
			return new Long(a.longValue() - 1);
		if(a instanceof Integer)
			return new Integer(a.intValue() - 1);
		if(a instanceof Short)
			return new Short((short) (a.shortValue() - 1));
		throw new IllegalArgumentException("Decrement of unsupported Number subclass: " + a.getClass().toString());
	}

	@B3Backend(funcNames = { "/" })
	public static Number div(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue() / b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() / b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() / b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() / b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() / b.shortValue()));
		throw new IllegalArgumentException("Division of unsupported Number subclass: " + a.getClass().toString() + "," +
				b.getClass().toString());
	}

	@B3Backend(funcNames = "..")
	public static DoubleSequence doubleSequence(@B3Backend(name = "from") Double from, @B3Backend(name = "to") Double to) {
		return new DoubleSequence(from, to);
	}

	public static DoubleSequence doubleSequence(@B3Backend(name = "from") Double from,
			@B3Backend(name = "to") Double to, @B3Backend(name = "to") Double step,
			@B3Backend(name = "fromInclusive") Boolean fromInclusive,
			@B3Backend(name = "toInclusive") Boolean toInclusive) {
		return new DoubleSequence(from, to, step, fromInclusive, toInclusive);
	}

	@B3Backend(funcNames = { "++" })
	public static Number increment(Number a) {
		if(a instanceof Double)
			return new Double(a.doubleValue() + 1);
		if(a instanceof Float)
			return new Float(a.floatValue() + 1);
		if(a instanceof Long)
			return new Long(a.longValue() + 1);
		if(a instanceof Integer)
			return new Integer(a.intValue() + 1);
		if(a instanceof Short)
			return new Short((short) (a.shortValue() + 1));
		throw new IllegalArgumentException("Increment of unsupported Number subclass: " + a.getClass().toString());
	}

	@B3Backend(funcNames = "..")
	public static IntegerSequence integerSequence(@B3Backend(name = "from") Integer from,
			@B3Backend(name = "to") Integer to) {
		return new IntegerSequence(from, to);
	}

	public static IntegerSequence integerSequence(@B3Backend(name = "from") Integer from,
			@B3Backend(name = "to") Integer to, @B3Backend(name = "to") Integer step,
			@B3Backend(name = "fromInclusive") Boolean fromInclusive,
			@B3Backend(name = "toInclusive") Boolean toInclusive) {
		return new IntegerSequence(from, to, step, fromInclusive, toInclusive);
	}

	@B3Backend(funcNames = { "%" })
	public static Number modulo(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue() % b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() % b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() % b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() % b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() % b.shortValue()));
		throw new IllegalArgumentException("Modulo of unsupported Number subclass: " + a.getClass().toString() + "," +
				b.getClass().toString());
	}

	@B3Backend(funcNames = { "*" })
	public static Number mul(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue() * b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() * b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() * b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() * b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() * b.shortValue()));
		throw new IllegalArgumentException("Multiplication of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "-" })
	public static Number negate(Number a) {
		if(a instanceof Double)
			return new Double(-a.doubleValue());
		if(a instanceof Float)
			return new Float(-a.floatValue());
		if(a instanceof Long)
			return new Long(-a.longValue());
		if(a instanceof Integer)
			return new Integer(-a.intValue());
		if(a instanceof Short)
			return new Short((short) -(a.shortValue()));
		throw new IllegalArgumentException("Unary minus on unsupported Number subclass: " + a.getClass().toString());
	}

	@B3Backend(typeCalculator = true)
	public static B3FunctionType numberGenericityCalculator(Type[] types) {
		B3FunctionType result = B3backendFactory.eINSTANCE.createB3FunctionType();
		result.setFunctionType(BFunction.class);
		result.setReturnType(numberGenericityCalculatorInternal(types));
		return result;
	}

	@B3Backend(guard = true)
	public static Boolean permitIntegralOnlyGuard(BExecutionContext ctx, Object[] parameters, Type[] types) {
		if(types == null)
			return Boolean.TRUE; // don't mind no parameters
		for(int i = 0; i < types.length; i++) {
			// note that parameters are guaranteed to be Type instances in guard functions
			Class<?> clazz = TypeUtils.getRaw(((Type[]) parameters)[i]);
			if(clazz == Float.class || clazz == Double.class || clazz == BigDecimal.class)
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@B3Backend(funcNames = { "-" })
	public static Number sub(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue() - b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() - b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() - b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() - b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() - b.shortValue()));
		throw new IllegalArgumentException("Subtraction of unsupported Number subclass: " + a.getClass().toString() +
				"," + b.getClass().toString());
	}

	@B3Backend(funcNames = { "-" }, typeFunction = "numberGenericityCalculator")
	public static Number unaryMinus(Number a) {
		if(a instanceof Double)
			return new Double(-a.doubleValue());
		if(a instanceof Float)
			return new Float(-a.floatValue());
		if(a instanceof Long)
			return new Long(-a.longValue());
		if(a instanceof Integer)
			return new Integer(-a.intValue());
		if(a instanceof Short)
			return new Short((short) -(a.shortValue()));
		throw new IllegalArgumentException("Unary minus on unsupported Number subclass: " + a.getClass().toString());
	}

	private static BigInteger convertToBigInteger(Number n) {
		return BigInteger.valueOf(n.longValue());
	}

	private static BigInteger convertToBigIntegerIfNeeded(Number n) {
		return (n instanceof BigInteger)
				? (BigInteger) n
				: convertToBigInteger(n);
	}

	@B3Backend(typeCalculator = true)
	private static Type numberGenericityCalculatorInternal(Type[] types) {
		if(types.length == 1) {
			return types[0];
		}
		if(types.length == 2) {
			Type at = types[0];
			Type bt = types[1];
			Class<?> a = TypeUtils.getRaw(at);
			Class<?> b = TypeUtils.getRaw(bt);
			if(a == BigDecimal.class)
				return at;
			if(b == BigDecimal.class)
				return bt;
			if(a == Double.class)
				return at;
			if(b == Double.class)
				return bt;
			if(a == Float.class)
				return at;
			if(b == Float.class)
				return bt;
			if(a == BigInteger.class)
				return at;
			if(b == BigInteger.class)
				return bt;
			if(a == Long.class)
				return at;
			if(b == Long.class)
				return bt;
			if(a == Integer.class)
				return at;
			if(b == Integer.class)
				return bt;
			if(a == Short.class)
				return at;
			if(b == Short.class)
				return bt;
			if(a == Byte.class)
				return at;
			if(b == Byte.class)
				return bt;
		}
		// give up...
		return Number.class;
	}

	private static boolean trueWithSideEffect(Object ignored) {
		return true;
	}
}
