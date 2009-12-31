/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAdvice;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWith Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getReferencedAdvice <em>Referenced Advice</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getConcerns <em>Concerns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BWithExpressionImpl extends BExpressionImpl implements BWithExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getReferencedAdvice() <em>Referenced Advice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<BAdvice> referencedAdvice;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BWithExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BWITH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAdvice> getReferencedAdvice() {
		if (referencedAdvice == null) {
			referencedAdvice = new EObjectResolvingEList<BAdvice>(BAdvice.class, this, B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE);
		}
		return referencedAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if (propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(BPropertySet.class, this, B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if (concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(BConcern.class, this, B3backendPackage.BWITH_EXPRESSION__CONCERNS);
		}
		return concerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				return getReferencedAdvice();
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return getPropertySets();
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return getConcerns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				getReferencedAdvice().clear();
				getReferencedAdvice().addAll((Collection<? extends BAdvice>)newValue);
				return;
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>)newValue);
				return;
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				getReferencedAdvice().clear();
				return;
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				getConcerns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				return referencedAdvice != null && !referencedAdvice.isEmpty();
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return concerns != null && !concerns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BWithExpressionImpl
