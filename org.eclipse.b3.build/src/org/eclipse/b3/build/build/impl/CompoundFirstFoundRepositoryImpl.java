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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.CompoundFirstFoundRepository;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.core.IBuildUnitRepository;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.BuildUnitRepositoryImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.
	 * BExecutionContext, org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, String unitPath)
			throws Throwable {
		BuildUnit result = null;
		for(IBuildUnitRepository repo : getRepositories())
			if((result = repo.resolve(ctx, requiredCapability, unitPath)) != null)
				return result;
		return null;
	}

} // CompoundFirstFoundRepositoryImpl
