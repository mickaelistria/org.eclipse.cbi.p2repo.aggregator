/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.impl;

import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.CompoundFirstFoundRepository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound First Found Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class CompoundFirstFoundRepositoryImpl extends CompoundBuildUnitRepositoryImpl implements
		CompoundFirstFoundRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompoundFirstFoundRepositoryImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.impl.BuildUnitRepositoryImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.
	 * BExecutionContext, org.eclipse.b3.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, Map<String, Object> options)
			throws Throwable {
		BuildUnit result = null;
		for(IBuildUnitRepository repo : getRepositories())
			if((result = repo.resolve(ctx, requiredCapability, options)) != null)
				return result;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.COMPOUND_FIRST_FOUND_REPOSITORY;
	}

} // CompoundFirstFoundRepositoryImpl
