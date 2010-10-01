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

import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3NoSuchFeatureException;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

/**
 * A Pojo Feature consists of a feature name, a getter and a setter.
 * It is not tied to a specific instance.
 * 
 */
public class PojoFeature {

	protected Method getter;

	protected Method setter;

	protected String featureName;

	public PojoFeature(Class<?> clazz, String featureName) {
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

	public Type getDeclaredType() throws B3EngineException {
		if(getter == null)
			throw new B3NoSuchFeatureException(featureName);
		return TypeUtils.objectify(getter.getGenericReturnType());
	}

	public String getName() {
		return featureName;
	}

	public boolean isGetable() {
		return getter != null;
	}

	public boolean isSettable() {
		return setter != null;
	}
}
