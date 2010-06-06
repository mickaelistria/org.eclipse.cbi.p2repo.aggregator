/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * The Engine Resource is a b3 model loaded from the environment. It can not be saved.
 * 
 */
public class B3BuildEngineResource extends ResourceImpl {

	private static BDefValue createValue(String name, Type type, boolean isFinal) {
		BDefValue var = B3backendFactory.eINSTANCE.createBDefValue();
		var.setName(name);
		var.setType(type);
		var.setImmutable(true);
		var.setFinal(isFinal);
		return var;
	}

	private static BDefValue createVariable(String name, Type type) {
		BDefValue var = B3backendFactory.eINSTANCE.createBDefValue();
		var.setName(name);
		var.setType(type);
		return var;
	}

	private BDefValue varRequest;

	/**
	 * @param uri
	 */
	public B3BuildEngineResource(URI uri) {
		super(uri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#load(java.util.Map)
	 */
	@Override
	public void load(Map<?, ?> options) throws IOException {
		EList<EObject> content = getContents();
		varRequest = createValue(B3BuildConstants.B3_VAR_REQUEST, RequiredCapability.class, true);
		content.add(varRequest);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#save(java.util.Map)
	 */
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// do nothing - saving the engine is not (yet) required

	}
}
