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

import java.util.Iterator;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.build.ExecutionStackRepository;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.core.EffectiveUnitIterator;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Stack Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ExecutionStackRepositoryImpl extends BuildUnitRepositoryImpl implements ExecutionStackRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExecutionStackRepositoryImpl() {
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
		return B3BuildPackage.Literals.EXECUTION_STACK_REPOSITORY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.BuildUnitRepositoryImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.
	 * BExecutionContext, org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		BuildContext bctx = ctx.getContext(BuildContext.class);
		EffectiveUnitIterator uItor = new EffectiveUnitIterator(bctx);
		while(uItor.hasNext()) {
			BuildUnit u = uItor.next();
			Iterator<EffectiveCapabilityFacade> pcItor = u.getEffectiveFacade(bctx).getProvidedCapabilities().iterator();
			while(pcItor.hasNext()) {
				Capability pc = pcItor.next().getProvidedCapability();
				if(pc.satisfies(requiredCapability))
					return u;
			}
		}
		return null;
	}
} // ExecutionStackRepositoryImpl