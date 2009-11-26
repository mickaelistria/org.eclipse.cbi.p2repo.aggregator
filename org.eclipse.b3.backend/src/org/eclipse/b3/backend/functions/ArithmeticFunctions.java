package org.eclipse.b3.backend.functions;

import org.eclipse.b3.backend.core.B3Backend;

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
			return new Double(a.doubleValue()  % b.doubleValue());
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

	@B3Backend (funcNames={"&"})
	public static Number bitwiseAnd(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  & b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() & b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() & b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() & b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() & b.shortValue()));
		throw new IllegalArgumentException("Bitwise AND of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"|"})
	public static Number bitwiseOr(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  | b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() | b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() | b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() | b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() | b.shortValue()));
		throw new IllegalArgumentException("Bitwise OR of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"^"})
	public static Number bitwiseXor(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  ^ b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() ^ b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() ^ b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() ^ b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() ^ b.shortValue()));
		throw new IllegalArgumentException("Bitwise XOR of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={"<<"})
	public static Number bitwiseLeftShift(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  << b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() << b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() << b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() << b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() << b.shortValue()));
		throw new IllegalArgumentException("Bitwise LSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	@B3Backend (funcNames={">>"})
	public static Number bitwiseRightShift(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  >> b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() >> b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() >> b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() >> b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() << b.shortValue()));
		throw new IllegalArgumentException("Bitwise RSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}

	@B3Backend (funcNames={">>>"})
	public static Number bitwiseUnsignedRightShift(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return new Double(a.longValue()  >>> b.longValue());
		if(a instanceof Float || b instanceof Float)
			return new Float(a.longValue() >>> b.longValue());
		if(a instanceof Long || b instanceof Long)
			return new Long(a.longValue() >>> b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return new Integer(a.intValue() >>> b.intValue());
		if(a instanceof Short || b instanceof Short)
			return new Short((short) (a.shortValue() >>> b.shortValue()));
		throw new IllegalArgumentException("Bitwise Unsigned RSHIFT of unsupported Number subclass: "
					+a.getClass().toString()
					+","+ b.getClass().toString());
	}
	@B3Backend (funcNames={"~"})
	public static Number bitwiseComplement(Number a) {
		if(a instanceof Double)
			return new Double(~a.longValue());
		if(a instanceof Float)
			return new Float(~a.longValue());
		if(a instanceof Long)
			return new Long(~a.longValue());
		if(a instanceof Integer)
			return new Integer(~a.intValue());
		if(a instanceof Short)
			return new Short((short) ~(a.shortValue()));
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
	
}
