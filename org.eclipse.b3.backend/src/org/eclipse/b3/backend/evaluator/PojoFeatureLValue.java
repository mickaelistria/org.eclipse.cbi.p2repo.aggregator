/**
 * 
 */
package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFeatureException;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class PojoFeatureLValue implements LValue {
	Object lhs;

	Method getter;

	Method setter;

	private String featureName;

	/**
	 ** TODO: this produces a PojoLValue that has a null reference to an instance
	 * This constructor is only used to find the types of the LValue operation.
	 */
	public PojoFeatureLValue(Class<?> clazz, String featureName) {
		this.featureName = featureName;
		String beanFeature = BackendHelper.getGetter(featureName);
		getter = null;
		try {
			getter = clazz.getMethod(beanFeature);
		}
		catch(NoSuchMethodException e) { /* ignore */
		}
		beanFeature = BackendHelper.getIsGetter(featureName);
		try {
			getter = clazz.getMethod(beanFeature);
		}
		catch(NoSuchMethodException e) { /* ignore */
		}
		try {
			getter = clazz.getMethod(featureName);
		}
		catch(NoSuchMethodException e) { /* ignore */
		}

		beanFeature = BackendHelper.getSetter(featureName);
		setter = null;
		if(getter == null)
			return;
		try {
			setter = clazz.getMethod(beanFeature, getter.getReturnType());
		}
		catch(NoSuchMethodException e) { /* ignore */
		}

	}

	public PojoFeatureLValue(Object lhs, String featureName) {
		this(lhs.getClass(), featureName);
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

	public Type getDeclaredType() throws B3EngineException {
		if(getter == null)
			throw new B3NoSuchFeatureException(featureName);
		return TypeUtils.objectify(getter.getGenericReturnType());
	}

	public boolean isGetable() {
		return getter != null;
	}

	public boolean isSettable() {
		return setter != null;
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
