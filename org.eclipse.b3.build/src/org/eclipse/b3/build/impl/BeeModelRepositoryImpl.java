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

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BeeModelRepository;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BeeModelRepositoryImpl#getBeeModels <em>Bee Models</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BeeModelRepositoryImpl extends BuildUnitRepositoryImpl implements BeeModelRepository {
	/**
	 * The cached value of the '{@link #getBeeModels() <em>Bee Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBeeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<BeeModel> beeModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BeeModelRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BEE_MODEL_REPOSITORY__BEE_MODELS:
				return getBeeModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BEE_MODEL_REPOSITORY__BEE_MODELS:
				return beeModels != null && !beeModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BEE_MODEL_REPOSITORY__BEE_MODELS:
				getBeeModels().clear();
				getBeeModels().addAll((Collection<? extends BeeModel>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BEE_MODEL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BEE_MODEL_REPOSITORY__BEE_MODELS:
				getBeeModels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BeeModel> getBeeModels() {
		if(beeModels == null) {
			beeModels = new EObjectResolvingEList<BeeModel>(
				BeeModel.class, this, B3BuildPackage.BEE_MODEL_REPOSITORY__BEE_MODELS);
		}
		return beeModels;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.impl.BuildUnitRepositoryImpl#initialize(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.Repository, java.util.Map)
	 */
	@Override
	public void initialize(BExecutionContext ctx, Repository repository, Map<String, Object> options) throws Throwable {
		// TODO: "Please implement this method - it should load a b3 model containing BuildUnits"
		throw new UnsupportedOperationException(
			"Please implement this method - it should load a b3 model containing BuildUnits");
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
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		// BRUTE FORCE IMPLMENTATION TODO: Optimize this
		// This implementation create a new context for each bee model as the evaluation of capabilities
		// etc. may require concerns, functions, etc.
		// Each build unit in the bee model is then evaluated to get its effective facade. (This computes
		// a lot more than just the capabilities).
		// Lastly a check is made if one the unit's capabilities satisfies the request.
		// The unit is returned - it is however again undefined as the context in which it was defined
		// is dropped.

		for(BeeModel beeModel : getBeeModels()) {
			// create a new context for each candidate unit
			BContext bctx = B3backendFactory.eINSTANCE.createBContext();
			bctx.setParentContext(ctx);
			evaluator.doEvaluate(beeModel, bctx); // define units, functions etc
			for(BuildUnit u : beeModel.getBuildUnits()) {
				Iterator<EffectiveCapabilityFacade> pcItor = u.getEffectiveFacade(bctx).getProvidedCapabilities().iterator();
				while(pcItor.hasNext()) {
					Capability pc = pcItor.next().getProvidedCapability();
					if(pc.satisfies(requiredCapability))
						return u;
				}
			}
		}
		return null;
	}

} // SimpleRepositoryImpl
