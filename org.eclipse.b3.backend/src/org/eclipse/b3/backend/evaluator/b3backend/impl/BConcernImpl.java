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

import java.util.Iterator;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BConcern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getFunctions <em>Functions</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getSuperConcerns <em>Super Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getPropertySets <em>Property Sets</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BConcernImpl extends BAdviceImpl implements BConcern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunction> functions;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperConcerns() <em>Super Concerns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSuperConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> superConcerns;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcernContext> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BConcernImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == BFunctionContainer.class) {
			switch(derivedFeatureID) {
				case B3backendPackage.BCONCERN__FUNCTIONS:
					return B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if(baseClass == BFunctionContainer.class) {
			switch(baseFeatureID) {
				case B3backendPackage.BFUNCTION_CONTAINER__FUNCTIONS:
					return B3backendPackage.BCONCERN__FUNCTIONS;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return getFunctions();
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				return getDocumentation();
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				return getSuperConcerns();
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return getPropertySets();
			case B3backendPackage.BCONCERN__CONTEXTS:
				return getContexts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return ((InternalEList<?>) getPropertySets()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BCONCERN__CONTEXTS:
				return ((InternalEList<?>) getContexts()).basicRemove(otherEnd, msgs);
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				return superConcerns != null && !superConcerns.isEmpty();
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3backendPackage.BCONCERN__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
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
			case B3backendPackage.BCONCERN__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IFunction>) newValue);
				return;
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				getSuperConcerns().clear();
				getSuperConcerns().addAll((Collection<? extends BConcern>) newValue);
				return;
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>) newValue);
				return;
			case B3backendPackage.BCONCERN__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends BConcernContext>) newValue);
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
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BCONCERN__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3backendPackage.BCONCERN__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3backendPackage.BCONCERN__SUPER_CONCERNS:
				getSuperConcerns().clear();
				return;
			case B3backendPackage.BCONCERN__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3backendPackage.BCONCERN__CONTEXTS:
				getContexts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		for(BConcern c : getSuperConcerns())
			c.evaluate(ctx);
		for(BPropertySet ps : getPropertySets())
			ps.evaluate(ctx);
		for(IFunction f : getFunctions())
			ctx.defineFunction(f);
		for(BConcernContext cc : getContexts())
			cc.evaluate(ctx);
		// record this concern into the context - for bequests
		ctx.getEffectiveConcerns().add(this);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx) throws Throwable {
		Boolean result = false;
		for(BConcern c : getSuperConcerns())
			if(c.evaluateIfMatching(candidate, ctx))
				result = true;
		for(BConcernContext cc : getContexts())
			if(cc.evaluateIfMatching(candidate, ctx))
				result = true;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an iterator over all concern contexts from first super-most context, over all super concerns, ending
	 * with the last context in the 'this' concern.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<BConcernContext> getConcernContextIterator() {
		SerialIterator<BConcernContext> itor = new SerialIterator<BConcernContext>();
		for(BConcern c : getSuperConcerns())
			itor.addIterator(c.getConcernContextIterator());
		itor.addIterator(getContexts().iterator());
		return itor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcernContext> getContexts() {
		if(contexts == null) {
			contexts = new EObjectContainmentEList<BConcernContext>(
				BConcernContext.class, this, B3backendPackage.BCONCERN__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IFunction> getFunctions() {
		if(functions == null) {
			functions = new EObjectContainmentWithInverseEList<IFunction>(
				IFunction.class, this, B3backendPackage.BCONCERN__FUNCTIONS, B3backendPackage.IFUNCTION__CONTAINER);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if(propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(
				BPropertySet.class, this, B3backendPackage.BCONCERN__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcern> getSuperConcerns() {
		if(superConcerns == null) {
			superConcerns = new EObjectResolvingEList<BConcern>(
				BConcern.class, this, B3backendPackage.BCONCERN__SUPER_CONCERNS);
		}
		return superConcerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCONCERN__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCONCERN;
	}
} // BConcernImpl
