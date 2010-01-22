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

import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3FuncStore;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BFunction Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionNamePredicateImpl#getNamePredicate <em>Name Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BFunctionNamePredicateImpl extends BExpressionImpl implements BFunctionNamePredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePredicate()
	 * @generated
	 * @ordered
	 */
	protected BNamePredicate namePredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BFunctionNamePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BFUNCTION_NAME_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNamePredicate getNamePredicate() {
		return namePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BNamePredicate newNamePredicate, NotificationChain msgs) {
		BNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE, oldNamePredicate, newNamePredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePredicate(BNamePredicate newNamePredicate) {
		if (newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if (namePredicate != null)
				msgs = ((InternalEObject)namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE, null, msgs);
			if (newNamePredicate != null)
				msgs = ((InternalEObject)newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE, newNamePredicate, newNamePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE:
				return basicSetNamePredicate(null, msgs);
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
			case B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE:
				return getNamePredicate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate)newValue);
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
			case B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate)null);
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
			case B3backendPackage.BFUNCTION_NAME_PREDICATE__NAME_PREDICATE:
				return namePredicate != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * Returns an Iterator<IFunction> for matching functions.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		String name = namePredicate.getName();
		if(name != null)
			return ctx.getFunctionIterator(name);
		
		// this is a name pattern of some sort
		// currently supporting ANY, or Regexp - pattern matching not done as
		// full expressions.
		BExpression expr = namePredicate.getNamePattern();
		if(expr instanceof BLiteralAny)
			return ctx.getFunctionIterator();
		
		if(expr instanceof BRegularExpression)
			return new RegexpIterator(ctx.getFunctionIterator(), ((BRegularExpression)expr).getPattern());
		
		throw new B3InternalError("Attempt to evaluate a BFunctionNamePredicate without a valid pattern type");
	}
	
	private class RegexpIterator implements Iterator<IFunction> {
		Iterator<IFunction> itor;
		Pattern pattern;
		IFunction theNext;
		private RegexpIterator(Iterator<IFunction> itor, Pattern pattern) {
			this.itor = itor;
			this.pattern = pattern;
		}
		public boolean hasNext() {
			if(theNext != null)
				return true;
			if(!itor.hasNext())
				return false;
			while(itor.hasNext()) {
				IFunction candidate = itor.next();
				if(pattern.matcher(candidate.getName()).matches()) {
					theNext = candidate;
					return true;
				}
			}
			return false;
		}

		public IFunction next() {
			IFunction tmp = theNext;
			theNext = null;
			return tmp;
		}

		public void remove() {
			throw new UnsupportedOperationException("Remove is not supported on this iterator");			
		}
		
	}
} //BFunctionNamePredicateImpl
