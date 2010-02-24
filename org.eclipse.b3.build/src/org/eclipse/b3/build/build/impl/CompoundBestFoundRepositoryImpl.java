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
import org.eclipse.b3.build.build.CompoundBestFoundRepository;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.core.IBuildUnitRepository;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compund Best Found Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompoundBestFoundRepositoryImpl extends CompoundBuildUnitRepositoryImpl implements
		CompoundBestFoundRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundBestFoundRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.COMPOUND_BEST_FOUND_REPOSITORY;
	}

	/**
	 * TODO: THIS IS A FAKE IMPLEMENTATION OF BEST FOUND - IT IS IDENTICAL TO FIRST FOUND
	 * The implementation should obtain all possible resolutions and then use the unit that best
	 * resembles the preference for source, binary, etc.
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		BuildUnit result = null;
		for(IBuildUnitRepository repo : getRepositories())
			if((result = repo.resolve(ctx, requiredCapability)) != null)
				return result;
		return null;
	}

} // CompoundBestFoundRepositoryImpl
