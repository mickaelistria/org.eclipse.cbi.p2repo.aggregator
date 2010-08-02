/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildResultContext;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Result Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BuildResultContextImpl extends BInnerContextImpl implements BuildResultContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuildResultContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_RESULT_CONTEXT;
	}

	/**
	 * Does not check if parent has final value if the value is a property reference.
	 */
	@Override
	public boolean isFinal(String name) {
		if(name.startsWith("$"))
			return getValueMap().isFinal(name);
		return super.isFinal(name);
	}

	/**
	 * Does not check if parent has immutable value if the value is a property reference.
	 */
	@Override
	public boolean isImmutable(String name) {
		if(name.startsWith("$"))
			return getValueMap().isImmutable(name);
		return super.isFinal(name);
	}

	@Override
	public boolean isPropertyScope() {
		return true;
	}
} // BuildResultContextImpl
