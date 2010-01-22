package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class ValueMap {
	private static int IMMUTABLE = 0x1;
	private static int FINAL = 0x2;
	private int paramCount = 0;
	private LinkedHashMap<String, ValueEntry> values = null;
	
	public ValueMap() {	
	}
	public ValueMap(String initialization) {
		// argument ignored - is there just to allow default initialization by EMF.
	}
	public void defineVariable(String name, Object value) throws B3VariableRedefinitionException {
		defineVariable(name, value, value.getClass());
	}
	public void defineVariable(String name, Object value, Type type) throws B3VariableRedefinitionException {
		checkMapExists();
		if(containsKey(name)) throw new B3VariableRedefinitionException(name);
		values.put(name, new ValueEntry(value, type));
	}
	public void defineFinalVariable(String name, Object value) throws B3VariableRedefinitionException {
		defineFinalVariable(name, value, value.getClass());
	}
	public void defineFinalVariable(String name, Object value, Type type) throws B3VariableRedefinitionException {
		checkMapExists();
		if(containsKey(name)) throw new B3VariableRedefinitionException(name);
		values.put(name, new ValueEntry(FINAL, value, type));
	}
	public void defineValue(String name, Object value) throws B3VariableRedefinitionException{
		defineValue(name, value, value.getClass());
	}
	public void defineValue(String name, Object value, Type t) throws B3VariableRedefinitionException{
		checkMapExists();
		if(containsKey(name)) throw new B3VariableRedefinitionException(name);
		values.put(name, new ValueEntry(IMMUTABLE, value, t));
	}
	public void defineFinalValue(String name, Object value) throws B3VariableRedefinitionException {
		defineFinalValue(name, value, value.getClass());
	}
	public void defineFinalValue(String name, Object value, Type type) throws B3VariableRedefinitionException {
		checkMapExists();
		if(containsKey(name)) throw new B3VariableRedefinitionException(name);
		values.put(name, new ValueEntry(FINAL|IMMUTABLE, value, type));		
	}
	public boolean isFinal(String key) {
		if(values == null)
			return false;
		ValueEntry ve = values.get(key);
		if(ve == null)
			return false;
		return ve.isFinal();
	}
	public boolean isImmutable(String key) {
		if(values == null)
			return false;
		ValueEntry ve = values.get(key);
		if(ve == null)
			return false;
		return ve.isImmutable();
	}
	public Object get(String key) throws B3NoSuchVariableException
	{
		isDefined : {
			if(values == null)
				break isDefined;
			ValueEntry ve = values.get(key);
			if(ve == null)
				break isDefined;
			return ve.value;
		}
		throw new B3NoSuchVariableException(key);
	}
	public Type getType(String key) throws B3NoSuchVariableException {
		isDefined : {
		if(values == null)
			break isDefined;
		ValueEntry ve = values.get(key);
		if(ve == null)
			break isDefined;
		return ve.type;
	}
	throw new B3NoSuchVariableException(key);
		
	}
	public void setType(String key, Type t) throws B3NoSuchVariableException {
		isDefined : {
		if(values == null)
			break isDefined;
		ValueEntry ve = values.get(key);
		if(ve == null)
			break isDefined;
		ve.type = t;
		return;
		}
	throw new B3NoSuchVariableException(key);	
	}
	
	/**
	 * Sets the value for a particular key. The type must be compatible.
	 * was not defined.
	 * @param key
	 * @param value
	 * @return value
	 * @throws B3EngineException 
	 */
	public Object set(String key, Object value) throws B3EngineException {
		isDefined: {
			if(values == null)
				break isDefined;
			ValueEntry ve = values.get(key);
			if(ve == null)
				break isDefined;
			if(ve.isImmutable())
				throw new B3ImmutableVariableException(key);
			if(!ve.isAssignableFrom(value))
				throw new B3IncompatibleTypeException(ve.type, value.getClass());
			ve.value = value;
			return ve.value;
		}
		throw new B3NoSuchVariableException(key);
	}
	public boolean containsKey(String key) {
		if(values == null)
			return false;
		return values.containsKey(key);
	}
	public void markParametersDone(boolean lastWasVararg) {
		int size = values == null ? 0 : values.size();
		paramCount = lastWasVararg ? - size : size;
	}
	@SuppressWarnings("unchecked")
	public Object[] getParameterArray() {
		int limit = paramCount;
		boolean isVarargs = false;
		if(paramCount < 0) { limit = -limit; isVarargs = true; }
		
		List<Object> result = new ArrayList<Object>();
		int count = 0;
		for(ValueEntry e : values.values()) {
			if(count++ > limit)
				break;
			result.add(e.value);
			}
		if(isVarargs) {
			List<Object> varargs = (List<Object>)result.remove(result.size()-1);
			for(Object o : varargs) 
				result.add(o);
		}
		return result.toArray();
	}
//	public Object getVarargsParameter() {
//		if(paramCount >= 0)
//			return null;
//	}
	private void checkMapExists() {
		if(values == null)
			values = new LinkedHashMap<String, ValueEntry>();
	}
	private static class ValueEntry {
		int markers;
		Object value;
		Type type;
		ValueEntry(Object val, Type t)
		{ markers = 0; value = val; type = t; }
		ValueEntry(int marks, Object val, Type t)
		{ markers = marks; value = val; type = t; }
		boolean isFinal() { return (markers & FINAL) != 0; }
		boolean isImmutable() { return (markers & IMMUTABLE) != 0; }
		boolean isAssignableFrom(Object value) {
			if(value instanceof B3Function)
				return TypeUtils.isAssignableFrom(type, ((B3Function)value).getSignature());
			return TypeUtils.isAssignableFrom(type, value);
		}
	}
}
