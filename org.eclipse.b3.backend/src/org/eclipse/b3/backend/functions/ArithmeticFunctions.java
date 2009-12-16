package org.eclipse.b3.backend.functions;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class ArithmeticFunctions {

	@B3Backend (funcNames={"+"})
	public static Number add(@B3Backend(name="op1") Number a, @B3Backend(name="op2") Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue()  + b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() + b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() + b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() + b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() + b.shortValue()));
		throw new IllegalArgumentException("Addition of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	
	@B3Backend (funcNames={"-"})
	public static Number sub(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue()  - b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() - b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() - b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() - b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() - b.shortValue()));
		throw new IllegalArgumentException("Subtraction of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	
	@B3Backend (funcNames={"-"})
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
		throw new IllegalArgumentException("Unary minus on unsupported Number subclass: "
					+a.getClass().toString());
	}

	@B3Backend (funcNames={"/"})
	public static Number div(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue()  / b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() / b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() / b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() / b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() / b.shortValue()));
		throw new IllegalArgumentException("Division of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"*"})
	public static Number mul(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.doubleValue()  * b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.floatValue() * b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() * b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() * b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() * b.shortValue()));
		throw new IllegalArgumentException("Multiplication of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	@B3Backend (funcNames={"++"})
	public static Number increment(Number a) {
		if(a instanceof Double)
			return new Double(a.doubleValue()+1);
		if(a instanceof Float)
			return new Float(a.floatValue() + 1);
		if(a instanceof Long)
			return new Long(a.longValue() + 1);
		if(a instanceof Integer)
			return new Integer(a.intValue() +1);
		if(a instanceof Short)
			return new Short((short) (a.shortValue() +1));
		throw new IllegalArgumentException("Increment of unsupported Number subclass: "
					+a.getClass().toString());
	}
	@B3Backend (funcNames={"--"})
	public static Number decrement(Number a) {
		if(a instanceof Double)
			return new Double(a.doubleValue() - 1.0);
		if(a instanceof Float)
			return new Float(a.floatValue() - 1.0f);
		if(a instanceof Long)
			return new Long(a.longValue() - 1);
		if(a instanceof Integer)
			return new Integer(a.intValue() -1);
		if(a instanceof Short)
			return new Short((short) (a.shortValue() -1));
		throw new IllegalArgumentException("Decrement of unsupported Number subclass: "
					+a.getClass().toString());
	}

	@B3Backend (funcNames={"%"})
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
		throw new IllegalArgumentException("Modulo of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"&"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseAnd(Number a, Number b) {
		if(a instanceof BigInteger && alwaysTrue(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && alwaysTrue(a = convertToBigInteger(a)))
			return ((BigInteger)a).and((BigInteger)b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() & b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() & b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() & b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() & b.byteValue()));
		throw new IllegalArgumentException("Bitwise AND of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"|"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseOr(Number a, Number b) {
		if(a instanceof BigInteger && alwaysTrue(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && alwaysTrue(a = convertToBigInteger(a)))
			return ((BigInteger)a).or((BigInteger)b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() | b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() | b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() | b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() | b.byteValue()));
		throw new IllegalArgumentException("Bitwise OR of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"^"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseXor(Number a, Number b) {
		if(a instanceof BigInteger && alwaysTrue(b = convertToBigIntegerIfNeeded(b)) ||
				b instanceof BigInteger && alwaysTrue(a = convertToBigInteger(a)))
			return ((BigInteger)a).xor((BigInteger)b);
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() ^ b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() ^ b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() ^ b.shortValue()));
		if(a instanceof Byte || b instanceof Byte)
			return new Byte((byte) (a.byteValue() ^ b.byteValue()));
		throw new IllegalArgumentException("Bitwise XOR of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"<<"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseLeftShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger)a).shiftLeft(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() << b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() << b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() << b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() << b.intValue()));
		throw new IllegalArgumentException("Bitwise LSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	@B3Backend (funcNames={">>"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseRightShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger)a).shiftRight(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() >> b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() >> b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() >> b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() >> b.intValue()));
		throw new IllegalArgumentException("Bitwise RSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={">>>"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseUnsignedRightShift(Number a, Number b) {
		if(a instanceof BigInteger)
			return ((BigInteger)a).shiftRight(b.intValue());
		if(a instanceof Long)
			return new Long(a.longValue() >>> b.intValue());
		if(a instanceof Integer)
			return new Integer(a.intValue() >>> b.intValue());
		if(a instanceof Short)
			return new Short((short) (a.shortValue() >>> b.intValue()));
		if(a instanceof Byte)
			return new Byte((byte) (a.byteValue() >>> b.intValue()));
		throw new IllegalArgumentException("Bitwise Unsigned RSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	@B3Backend (funcNames={"~"}, guardFunction="permitIntegralOnlyGuard")
	public static Number bitwiseComplement(Number a) {
		if(a instanceof BigInteger)
			return ((BigInteger)a).not();
		if(a instanceof Long)
			return new Long(~a.longValue());
		if(a instanceof Integer)
			return new Integer(~a.intValue());
		if(a instanceof Short)
			return new Short((short) ~(a.shortValue()));
		if(a instanceof Byte)
			return new Byte((byte) ~(a.byteValue()));
		throw new IllegalArgumentException("Unary bitwize complement (~) on unsupported Number subclass: "
					+a.getClass().toString());
	}

	@B3Backend (funcNames={"-"})
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
		throw new IllegalArgumentException("Unary minus on unsupported Number subclass: "
					+a.getClass().toString());
	}
	
	@B3Backend (guard=true)
	public static Boolean permitIntegralOnlyGuard(BExecutionContext ctx, Object[] parameters, Type[] types) {
		if(types == null)
			return Boolean.TRUE; // don't mind no parameters
		for(int i = 0; i < types.length; i++) {
			if(parameters[i] != null) {
				// TODO: TYPESYSTEM IMPROVEMENT - checking the types of the actual arguments is a hack we want to check
				// the types passed in the types parameter directly but we need them to be accurate first
				Class<?> clazz = parameters[i].getClass();
				if(!(clazz == Byte.class || clazz == Short.class || clazz == Integer.class || clazz == Long.class || clazz == BigInteger.class))
					return Boolean.FALSE;
			} else {
				Class<?> clazz = TypeUtils.getRaw(types[i]);
				if(clazz == Float.class || clazz == Double.class || clazz == BigDecimal.class)
					return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private static boolean alwaysTrue(Object ignored)
	{
		return true;
	}

	private static BigInteger convertToBigIntegerIfNeeded(Number n)
	{
		return (n instanceof BigInteger) ? (BigInteger)n : convertToBigInteger(n);
	}

	private static BigInteger convertToBigInteger(Number n)
	{
		return BigInteger.valueOf(n.longValue());
	}
}
