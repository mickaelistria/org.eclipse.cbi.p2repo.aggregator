/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderReference;
import org.eclipse.b3.build.CompoundBuildResultReference;
import org.eclipse.b3.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.Prerequisite;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Build Result Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.CompoundBuildResultReferenceImpl#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompoundBuildResultReferenceImpl extends BuildResultReferenceImpl implements CompoundBuildResultReference {
	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> prerequisites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompoundBuildResultReferenceImpl() {
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
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES:
				return getPrerequisites();
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
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES:
				return ((InternalEList<?>) getPrerequisites()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES:
				return prerequisites != null && !prerequisites.isEmpty();
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
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends Prerequisite>) newValue);
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
		return B3BuildPackage.Literals.COMPOUND_BUILD_RESULT_REFERENCE;
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
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES:
				getPrerequisites().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<BuilderReference> getBuilderReferences() throws Throwable {
		List<BuilderReference> result = new ArrayList<BuilderReference>();
		for(Prerequisite p : getPrerequisites())
			result.addAll(p.getBuilderReferences());

		// TODO: ISSUE - IS IT OK TO REUSE THE UNFILTERED FEATURE WHEN THERE IS NO DERIVED FEATURE ?
		return new EcoreEList.UnmodifiableEList<BuilderReference>(
			this, B3BuildPackage.Literals.PREREQUISITE__BUILD_RESULT, result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Iterator<EffectiveBuilderReferenceFacade> getEffectiveBuilderReferences(BExecutionContext ctx)
			throws Throwable {
		SerialIterator<EffectiveBuilderReferenceFacade> result = new SerialIterator<EffectiveBuilderReferenceFacade>();
		for(Prerequisite p : getPrerequisites())
			result.addIterator(p.getEffectiveBuilderReferences(ctx));
		return result;
	}

	@Override
	public Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		SerialIterator<EffectiveRequirementFacade> result = new SerialIterator<EffectiveRequirementFacade>();
		for(Prerequisite p : getPrerequisites())
			result.addIterator(p.getEffectiveRequirements(ctx));

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Prerequisite> getPrerequisites() {
		if(prerequisites == null) {
			prerequisites = new EObjectContainmentEList<Prerequisite>(
				Prerequisite.class, this, B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES);
		}
		return prerequisites;
	}

} // CompoundBuildResultReferenceImpl
