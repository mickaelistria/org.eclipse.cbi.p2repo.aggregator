/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuildUnitWrapper;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.ContainerConfiguration;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.RepositoryConfiguration;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.Synchronization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.equinox.internal.provisional.p2.core.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Unit Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitWrapperImpl#getOriginal <em>Original</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildUnitWrapperImpl extends BuildUnitImpl implements BuildUnitWrapper {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected BuildUnit original;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildUnitWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_UNIT_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit getOriginal() {
		if (original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject)original;
			original = (BuildUnit)eResolveProxy(oldOriginal);
			if (original != oldOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL, oldOriginal, original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Original can only be set once
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOriginal(BuildUnit newOriginal) {
		if(original != null)
			throw new IllegalStateException("A BuildUnitWrapper can only have its original set once.");
		BuildUnit oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL:
				if (resolve) return getOriginal();
				return basicGetOriginal();
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
			case B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL:
				setOriginal((BuildUnit)newValue);
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
			case B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL:
				setOriginal((BuildUnit)null);
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
			case B3BuildPackage.BUILD_UNIT_WRAPPER__ORIGINAL:
				return original != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * wrapping method
	 */
	@Override
	public EList<IBuilder> getBuilders() {
		return original.getBuilders();
	}

	/**
	 * wrapping method
	 */
	@Override
	public EList<BConcern> getConcerns() {
		return original.getConcerns();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public BExpression getCondExpr() {
		return original.getCondExpr();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<ContainerConfiguration> getContainers() {
		return original.getContainers();
	}
		
	/**
	 * wrapping method
	 */
	@Override
	public BPropertySet getDefaultProperties() {
		return original.getDefaultProperties();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public String getDocumentation() {
		return original.getDocumentation();
	}

	/**
	 * wrapping method
	 */
	@Override
	public EList<RequiredCapability> getEffectiveMetaRequirements(BExecutionContext ctx) throws Throwable {
		return original.getEffectiveMetaRequirements(ctx);
	}

	/**
	 * wrapping method
	 */
	@Override
	public EList<RequiredCapability> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		return original.getEffectiveRequirements(ctx);
	}

	/**
	 * wrapping method
	 */
	@Override
	public ExecutionMode getExecutionMode() {
		return original.getExecutionMode();
	}

	/**
	 * wrapping method
	 */
	@Override
	public EList<IFunction> getFunctions() {
		return original.getFunctions();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<Type> getImplements() {
		return original.getImplements();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<RequiredCapability> getMetaRequiredCapabilities() {
		return original.getMetaRequiredCapabilities();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public String getName() {
		return original.getName();
	}
	/**
	 * wrapping method
	 */
	@Override
	public String getNameSpace() {
		return original.getNameSpace();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<BPropertySet> getPropertySets() {
		return original.getPropertySets();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<Capability> getProvidedCapabilities() {
		return original.getProvidedCapabilities();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<RepositoryConfiguration> getRepositories() {
		return original.getRepositories();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<RequiredCapability> getRequiredCapabilities() {
		return original.getRequiredCapabilities();
	}
	
	/**
	 * wrapping method
	 */
	@Override
	public EList<Synchronization> getSynchronizations() {
		return original.getSynchronizations();
	}
	
	/**
	 * wrapping method
	 */
	@SuppressWarnings("restriction")
	@Override
	public Version getVersion() {
		return original.getVersion();
	}
} //BuildUnitWrapperImpl
