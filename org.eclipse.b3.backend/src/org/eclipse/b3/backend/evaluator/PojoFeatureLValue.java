/**
 * 
 */
package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFeatureException;

public class PojoFeatureLValue extends PojoFeature implements LValue {
	Object lhs;

	/**
	 * Creates a PojoFeature for a specific instance.
	 * 
	 * @param lhs
	 * @param featureName
	 */
	public PojoFeatureLValue(Object lhs, String featureName) {
		super(lhs.getClass(), featureName);
		this.lhs = lhs;
	}

	public Object get() throws B3EngineException {
		if(getter == null)
			throw new B3NoSuchFeatureException(featureName);
		try {
			return getter.invoke(lhs);
		}
		catch(Throwable e) {
			throw new B3NoSuchFeatureException(featureName, e);
		}
	}

	public Object set(Object value) throws B3EngineException {
		if(setter == null)
			throw new B3NoSuchFeatureException(featureName);
		try {
			return setter.invoke(lhs, value);
		}
		catch(Throwable e) {
			throw new B3NoSuchFeatureException(featureName, e);
		}
	}

	public void setDeclaredType(Type t) throws B3EngineException {
		throw new B3ImmutableTypeException(lhs, getter.getGenericReturnType(), t);
	}

}
