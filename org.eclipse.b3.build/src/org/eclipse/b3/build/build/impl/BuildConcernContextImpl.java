/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;

import org.eclipse.b3.backend.core.PropertyDefinitionIterator;
import org.eclipse.b3.backend.core.PropertyOperationIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BConcernContextImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildConcernContext;

import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.IProvidedCapabilityContainer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.BuildConcernContextImpl#getProvidedCapabilities <em>Provided Capabilities
 * </em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuildConcernContextImpl#getDefaultPropertiesRemovals <em>Default
 * Properties Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuildConcernContextImpl#getDefaultPropertiesAdditions <em>Default
 * Properties Additions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuildConcernContextImpl extends BConcernContextImpl implements BuildConcernContext {
	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> providedCapabilities;

	/**
	 * The cached value of the '{@link #getDefaultPropertiesRemovals() <em>Default Properties Removals</em>}' attribute
	 * list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultPropertiesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultPropertiesRemovals;

	/**
	 * The cached value of the '{@link #getDefaultPropertiesAdditions() <em>Default Properties Additions</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultPropertiesAdditions()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet defaultPropertiesAdditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuildConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefaultPropertiesAdditions(BPropertySet newDefaultPropertiesAdditions,
			NotificationChain msgs) {
		BPropertySet oldDefaultPropertiesAdditions = defaultPropertiesAdditions;
		defaultPropertiesAdditions = newDefaultPropertiesAdditions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS,
				oldDefaultPropertiesAdditions, newDefaultPropertiesAdditions);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
					return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
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
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;
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
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS:
				return getDefaultPropertiesRemovals();
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS:
				return getDefaultPropertiesAdditions();
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
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS:
				return basicSetDefaultPropertiesAdditions(null, msgs);
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
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS:
				return defaultPropertiesRemovals != null && !defaultPropertiesRemovals.isEmpty();
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS:
				return defaultPropertiesAdditions != null;
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
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>) newValue);
				return;
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS:
				getDefaultPropertiesRemovals().clear();
				getDefaultPropertiesRemovals().addAll((Collection<? extends String>) newValue);
				return;
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS:
				setDefaultPropertiesAdditions((BPropertySet) newValue);
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
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS:
				getDefaultPropertiesRemovals().clear();
				return;
			case B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS:
				setDefaultPropertiesAdditions((BPropertySet) null);
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
	public BPropertySet getDefaultPropertiesAdditions() {
		return defaultPropertiesAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getDefaultPropertiesRemovals() {
		if(defaultPropertiesRemovals == null) {
			defaultPropertiesRemovals = new EDataTypeUniqueEList<String>(
				String.class, this, B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS);
		}
		return defaultPropertiesRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(
				Capability.class, this, B3BuildPackage.BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultPropertiesAdditions(BPropertySet newDefaultPropertiesAdditions) {
		if(newDefaultPropertiesAdditions != defaultPropertiesAdditions) {
			NotificationChain msgs = null;
			if(defaultPropertiesAdditions != null)
				msgs = ((InternalEObject) defaultPropertiesAdditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS, null, msgs);
			if(newDefaultPropertiesAdditions != null)
				msgs = ((InternalEObject) newDefaultPropertiesAdditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS, null, msgs);
			msgs = basicSetDefaultPropertiesAdditions(newDefaultPropertiesAdditions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS,
				newDefaultPropertiesAdditions, newDefaultPropertiesAdditions));
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
		result.append(" (defaultPropertiesRemovals: ");
		result.append(defaultPropertiesRemovals);
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
		return B3BuildPackage.Literals.BUILD_CONCERN_CONTEXT;
	}

	/**
	 * Copies everything from originalSet to propertySet, and then removes all definitions in removals. Lastly
	 * additions are added to the propertySet.
	 * 
	 * @param propertySet
	 *            - the set that receives the result
	 * @param removals
	 *            - list of property names to remove from the definition
	 * @param originalSet
	 *            - the set to copy
	 * @param additions
	 *            - additions to set after removals have been made
	 * @returns true if the resulting copied and advised set is different than the original
	 */
	protected boolean processProperties(BPropertySet propertySet, EList<String> removals, BPropertySet originalSet,
			BPropertySet additions) {
		boolean modified = false;
		EList<BPropertyOperation> operations = propertySet.getOperations();
		PropertyOperationIterator psItor = new PropertyOperationIterator(originalSet);

		// copy everything
		while(psItor.hasNext())
			operations.add(BPropertyOperation.class.cast(EcoreUtil.copy(psItor.next())));

		// remove matching definitions
		if(getDefaultPropertiesRemovals().size() > 0) {
			PropertyDefinitionIterator psdItor = new PropertyDefinitionIterator(propertySet);
			while(psdItor.hasNext()) {
				BPropertyDefinitionOperation pd = psdItor.next();
				for(String pid : removals) {
					if(pid.equals(pd.getDefinition().getName())) {
						psdItor.remove();
						modified = true;
					}
				}
			}
		}

		// add new definitions
		psItor = new PropertyOperationIterator(additions);
		while(psItor.hasNext()) {
			operations.add(BPropertyOperation.class.cast(EcoreUtil.copy(psItor.next())));
			modified = true;
		}
		return modified;
	}

} // BuildConcernContextImpl
