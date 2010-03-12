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

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuildUnitRepository;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.SwitchRepository;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.SwitchRepositoryImpl#getRepoSwitch <em>Repo Switch</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SwitchRepositoryImpl extends BuildUnitRepositoryImpl implements SwitchRepository {
	/**
	 * The cached value of the '{@link #getRepoSwitch() <em>Repo Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepoSwitch()
	 * @generated
	 * @ordered
	 */
	protected BSwitchExpression repoSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SwitchRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRepoSwitch(BSwitchExpression newRepoSwitch, NotificationChain msgs) {
		BSwitchExpression oldRepoSwitch = repoSwitch;
		repoSwitch = newRepoSwitch;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH, oldRepoSwitch, newRepoSwitch);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
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
		case B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH:
			return getRepoSwitch();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH:
			return basicSetRepoSwitch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH:
			return repoSwitch != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH:
			setRepoSwitch((BSwitchExpression) newValue);
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
		return B3BuildPackage.Literals.SWITCH_REPOSITORY;
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
		case B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH:
			setRepoSwitch((BSwitchExpression) null);
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
	public BSwitchExpression getRepoSwitch() {
		return repoSwitch;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.BuildUnitRepositoryImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.
	 * BExecutionContext, org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineFinalValue("request", requiredCapability, RequiredCapability.class);
		Object repoObject = repoSwitch.evaluate(ictx);
		// a null repo signals "not found"
		if(repoObject == null)
			return null;

		if(!(repoObject instanceof BuildUnitRepository))
			throw new B3IncompatibleTypeException(BuildUnitRepository.class, repoObject.getClass());

		return BuildUnitRepository.class.cast(repoObject).resolve(ctx, requiredCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRepoSwitch(BSwitchExpression newRepoSwitch) {
		if(newRepoSwitch != repoSwitch) {
			NotificationChain msgs = null;
			if(repoSwitch != null)
				msgs = ((InternalEObject) repoSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH, null, msgs);
			if(newRepoSwitch != null)
				msgs = ((InternalEObject) newRepoSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH, null, msgs);
			msgs = basicSetRepoSwitch(newRepoSwitch, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.SWITCH_REPOSITORY__REPO_SWITCH,
					newRepoSwitch, newRepoSwitch));
	}

} // SwitchRepositoryImpl
