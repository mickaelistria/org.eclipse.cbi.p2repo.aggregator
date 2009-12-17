package org.eclipse.b3.backend.functions;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.SimplePattern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

public class RelationalFunctions {

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"=="})
	public static Boolean equals(Object left, Object right) {
		if(left == right || left.equals(right))
			return Boolean.TRUE;
		try {
			if(left instanceof Comparable) {
				if(((Comparable)left).compareTo(right) == 0)
					return Boolean.TRUE;
			}
		} catch(ClassCastException e) {
			// ignore - since comparison other way may work
		}
		try {
			if(right instanceof Comparable && ((Comparable)right).compareTo(left) == 0)
				return Boolean.TRUE;
		} catch(ClassCastException e) {
			// since Comparable is unchecked and comparison may try coercion
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}
	@B3Backend(funcNames={"=="}, systemFunction="_listEquals")
	public static Boolean equals(@B3Backend(name="op1") List<?> left, @B3Backend(name="op2")List<?> right) 
	{ return null; }
	
	@B3Backend(system=true)
	public static Object _listEquals(BExecutionContext ctx, Object[] params, Type[] types) throws Throwable {
		List<?> left = (List<?>)params[0];
		List<?> right = (List<?>)params[1];
		if(left == right)
			return Boolean.TRUE;
		if(left == null || right == null)
			return Boolean.FALSE;
		if(left.size() != right.size())
			return Boolean.FALSE;
		try {
			if(left.equals(right))
				return Boolean.TRUE;
		} catch(ClassCastException e) {
			// ignore and compare using different method
		}
		Object p[] = new Object[2];
		Type t[] = new Type[2];
		for(int i = 0; i < left.size(); i++) {
			p[0] = left.get(i);
			p[1] = right.get(i);
			t[0] = p[0].getClass();
			t[1] = p[1].getClass();
			if(ctx.callFunction("equals", p, t) != Boolean.TRUE)
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	@B3Backend(funcNames={"=="}, systemFunction="_mapEquals")
	public static Boolean equals(@B3Backend(name="op1") Map<?,?> left, @B3Backend(name="op2")Map<?,?> right) 
	{ return null; }
	
	@B3Backend(system=true)
	public static Object _mapEquals(BExecutionContext ctx, Object[] params, Type[] types) throws Throwable {
		Map<?,?> left = (Map<?,?>)params[0];
		Map<?,?> right = (Map<?,?>)params[1];
		if(left == right)
			return Boolean.TRUE;
		if(left == null || right == null)
			return Boolean.FALSE;
		if(left.size() != right.size())
			return Boolean.FALSE;
		try {
			if(left.equals(right))
				return Boolean.TRUE;
		} catch(ClassCastException e) {
			// ignore and compare using different method
		}
		Object p[] = new Object[2];
		Type t[] = new Type[2];
		for(Object k : left.keySet()) {
			p[0] = left.get(k);
			p[1] = right.get(k);
			t[0] = p[0].getClass();
			t[1] = p[1].getClass();
			if(ctx.callFunction("equals", p, t) != Boolean.TRUE)
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"=="})
	public static Boolean equals(Number a, Number b) {
		if(a == b || a.equals(b))
			return Boolean.TRUE;
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() == b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() == b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() == b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() == b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() == b.shortValue());
		if(a instanceof Comparable) {
			if(((Comparable)a).compareTo(b) == 0)
				return Boolean.TRUE;
		} else if(b instanceof Comparable) {
			if(((Comparable)b).compareTo(a) == 0)
				return Boolean.TRUE;
		}

		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!="})
	public static Boolean notEquals(Object left, Object right) {
		return equals(left,right) == Boolean.TRUE ? Boolean.FALSE : Boolean.TRUE;
	}

	@B3Backend(funcNames={"===", "eq"}, hideOriginal=true)
	public static Boolean isIdentical(Object left, Object right) {
		if(left == right)
			return Boolean.TRUE;		
		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!==", "neq"}, hideOriginal=true)
	public static Boolean isNotIdentical(Object left, Object right) {
		if(left != right)
			return Boolean.TRUE;
		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"<"})
	public static Boolean isLessThan(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isLessThan((Number)left, (Number)right);
		return left.compareTo(right) < 0 ? Boolean.TRUE : Boolean.FALSE;
	}

	@B3Backend(funcNames={"<"})
	public static Boolean isLessThan(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() < b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() < b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() < b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() < b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() < b.shortValue());

		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={"<="})
	public static Boolean isLessThanOrEqualTo(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isLessThanOrEqualTo((Number)left, (Number)right);
		return left.compareTo(right) <= 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={"<="})
	public static Boolean isLessThanOrEqualTo(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() <= b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() <= b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() <= b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() <= b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() <= b.shortValue());

		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={">"})
	public static Boolean isGreaterThan(Comparable left, Comparable right) {
		if(left instanceof Number && right instanceof Number)
			return isGreaterThan((Number)left, (Number)right);
		return left.compareTo(right) > 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={">"})
	public static Boolean isGreaterThan(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() > b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() > b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() > b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() > b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() > b.shortValue());

		return Boolean.FALSE;
	}

	@SuppressWarnings("unchecked")
	@B3Backend(funcNames={">="})
	public static Boolean isGreaterThanOrEqualTo(Comparable left, Comparable right){
		if(left instanceof Number && right instanceof Number)
			return isGreaterThanOrEqualTo((Number)left, (Number)right);

		return left.compareTo(right) >= 0 ? Boolean.TRUE : Boolean.FALSE;
	}
	@B3Backend(funcNames={">="})
	public static Boolean isGreaterThanOrEqualTo(Number a, Number b) {
		if(a instanceof Double || b instanceof Double)
			return Boolean.valueOf(a.doubleValue() >= b.doubleValue());
		if(a instanceof Float || b instanceof Float)
			return Boolean.valueOf(a.floatValue() >= b.floatValue());
		if(a instanceof Long || b instanceof Long)
			return Boolean.valueOf(a.longValue() >= b.longValue());
		if(a instanceof Integer || b instanceof Integer)
			return Boolean.valueOf(a.intValue() >= b.intValue());
		if(a instanceof Short || b instanceof Short)
			return Boolean.valueOf(a.shortValue() >= b.shortValue());

		return Boolean.FALSE;
	}

	@B3Backend(funcNames={"!"})
	public static Boolean not(Boolean left) {
		return left.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
	}
	@B3Backend(funcNames={"~="})
	public static Boolean matches(Pattern pattern, CharSequence string) {
		return pattern.matcher(string).matches() ? Boolean.TRUE : Boolean.FALSE;
	}

	@B3Backend(funcNames={"~="})
	public static Boolean matches(CharSequence string, Pattern pattern) {
		return pattern.matcher(string).matches() ? Boolean.TRUE : Boolean.FALSE;
	}

	@B3Backend(funcNames={"~="})
	public static Boolean matches(CharSequence string, CharSequence pattern) {
		return SimplePattern.compile(pattern).isMatch(string) ? Boolean.TRUE : Boolean.FALSE;
	}

}
