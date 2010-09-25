/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class ConstructorCandidate extends TypeUtils.AdaptingJavaCandidate<Constructor<?>> {

	public ConstructorCandidate(Constructor<?> aConstructor) {
		super(aConstructor);
	}

	public Constructor<?> getConstructor() {
		return adaptedObject;
	}

	public boolean isVarArgs() {
		return adaptedObject.isVarArgs();
	}

	@Override
	protected Type[] getJavaParameterTypes() {
		return adaptedObject.getGenericParameterTypes();
	}

}
