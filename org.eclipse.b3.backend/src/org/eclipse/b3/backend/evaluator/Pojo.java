/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;

import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFeatureException;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import com.google.inject.internal.Lists;

/**
 * Support for Java Pojo Features, FeatureLValue and Operations
 * 
 */
public class Pojo {
	/**
	 * A Pojo Feature consists of a feature name, a getter and a setter.
	 * It is not tied to a specific instance.
	 * 
	 */
	public static class Feature extends Member {

		protected Method getter;

		protected Method setter;

		public Feature(Class<?> clazz, String name) {
			super(name);
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
	}

	public static class FeatureLValue extends Pojo.Feature implements LValue {
		Object lhs;

		/**
		 * Creates a Feature for a specific instance.
		 * 
		 * @param lhs
		 * @param featureName
		 */
		public FeatureLValue(Object lhs, String featureName) {
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

	public static class Member {

		protected final String featureName;

		public Member(String name) {
			featureName = name;
		}

		public String getName() {
			return featureName;
		}

	}

	public static class Operation extends Member {
		protected Method method;

		public Operation(Class<?> clazz, String name) {
			super(name);
			try {
				method = clazz.getMethod(featureName);
			}
			catch(NoSuchMethodException e) { /* ignore */
			}
		}

		public Operation(Method m) {
			super(m.getName());
			method = m;
		}

		public Method getMethod() {
			return method;
		}

		public void getParameters() {
		}
	}

	/**
	 * Returns a list of public features (that are at least get-able).
	 * 
	 * @param clazz
	 * @return
	 */
	public static List<Pojo.Feature> getFeatures(Class<?> clazz) {
		List<Pojo.Feature> result = Lists.newArrayList();
		Method[] methods = clazz.getMethods();
		// find all methods following the pattern getXXX(), and boolean/Boolean isXXX() - these are
		// considered to be features, let the Feature figure out the matching getter/setter.
		for(Method m : methods) {
			String name = m.getName();
			if(name.startsWith("get") && name.length() > 3 && m.getParameterTypes().length == 0)
				result.add(new Pojo.Feature(clazz, initialLowerCase(name, 3)));
			else if(name.startsWith("is") && name.length() > 2 && m.getParameterTypes().length == 0)
				result.add(new Pojo.Feature(clazz, initialLowerCase(name, 2)));
		}
		return result;
	}

	public static List<Pojo.Member> getMembers(Class<?> clazz) {
		List<Pojo.Member> result = Lists.newArrayList();
		// Add all the features
		result.addAll(getFeatures(clazz));
		result.addAll(getOperations(clazz));
		return result;
	}

	public static List<Pojo.Operation> getOperations(Class<?> clazz) {
		List<Pojo.Operation> result = Lists.newArrayList();

		// add all the methods
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			String name = m.getName();
			if(name.startsWith("get") && name.length() > 3 && m.getParameterTypes().length == 0)
				continue;
			else if(name.startsWith("is") && name.length() > 2 && m.getParameterTypes().length == 0)
				continue;
			result.add(new Pojo.Operation(m));
		}
		return result;

	}

	/**
	 * Returns a new string with the start character in lower case.
	 * 
	 * @param s
	 * @param start
	 * @return
	 */
	private static String initialLowerCase(String s, int start) {
		return s.substring(start, start + 1).toLowerCase(Locale.ENGLISH) + s.substring(start + 1);
	}
}
