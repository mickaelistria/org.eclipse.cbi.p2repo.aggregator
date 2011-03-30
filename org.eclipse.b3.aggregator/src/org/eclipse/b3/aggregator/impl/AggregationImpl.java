/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.impl;

import java.util.Collection;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.ContributionView;
import org.eclipse.b3.aggregator.DescriptionProvider;
import org.eclipse.b3.aggregator.InfosProvider;
import org.eclipse.b3.aggregator.Status;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.aggregator.StatusProvider;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getStatus <em>Status</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getErrors <em>Errors</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getWarnings <em>Warnings</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getInfos <em>Infos</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AggregationImpl extends MinimalEObjectImpl.Container implements Aggregation {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected int eFlags = 0;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final int ENABLED_EFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errors;

	/**
	 * The cached value of the '{@link #getWarnings() <em>Warnings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWarnings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> warnings;

	/**
	 * The cached value of the '{@link #getInfos() <em>Infos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> infos;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregationImpl() {
		super();
		eFlags |= ENABLED_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == DescriptionProvider.class) {
			switch(derivedFeatureID) {
				case AggregatorPackage.AGGREGATION__DESCRIPTION:
					return AggregatorPackage.DESCRIPTION_PROVIDER__DESCRIPTION;
				default:
					return -1;
			}
		}
		if(baseClass == StatusProvider.class) {
			switch(derivedFeatureID) {
				case AggregatorPackage.AGGREGATION__STATUS:
					return AggregatorPackage.STATUS_PROVIDER__STATUS;
				default:
					return -1;
			}
		}
		if(baseClass == InfosProvider.class) {
			switch(derivedFeatureID) {
				case AggregatorPackage.AGGREGATION__ERRORS:
					return AggregatorPackage.INFOS_PROVIDER__ERRORS;
				case AggregatorPackage.AGGREGATION__WARNINGS:
					return AggregatorPackage.INFOS_PROVIDER__WARNINGS;
				case AggregatorPackage.AGGREGATION__INFOS:
					return AggregatorPackage.INFOS_PROVIDER__INFOS;
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
		if(baseClass == DescriptionProvider.class) {
			switch(baseFeatureID) {
				case AggregatorPackage.DESCRIPTION_PROVIDER__DESCRIPTION:
					return AggregatorPackage.AGGREGATION__DESCRIPTION;
				default:
					return -1;
			}
		}
		if(baseClass == StatusProvider.class) {
			switch(baseFeatureID) {
				case AggregatorPackage.STATUS_PROVIDER__STATUS:
					return AggregatorPackage.AGGREGATION__STATUS;
				default:
					return -1;
			}
		}
		if(baseClass == InfosProvider.class) {
			switch(baseFeatureID) {
				case AggregatorPackage.INFOS_PROVIDER__ERRORS:
					return AggregatorPackage.AGGREGATION__ERRORS;
				case AggregatorPackage.INFOS_PROVIDER__WARNINGS:
					return AggregatorPackage.AGGREGATION__WARNINGS;
				case AggregatorPackage.INFOS_PROVIDER__INFOS:
					return AggregatorPackage.AGGREGATION__INFOS;
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
			case AggregatorPackage.AGGREGATION__ENABLED:
				return isEnabled();
			case AggregatorPackage.AGGREGATION__DESCRIPTION:
				return getDescription();
			case AggregatorPackage.AGGREGATION__STATUS:
				return getStatus();
			case AggregatorPackage.AGGREGATION__ERRORS:
				return getErrors();
			case AggregatorPackage.AGGREGATION__WARNINGS:
				return getWarnings();
			case AggregatorPackage.AGGREGATION__INFOS:
				return getInfos();
			case AggregatorPackage.AGGREGATION__LABEL:
				return getLabel();
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
			case AggregatorPackage.AGGREGATION__ENABLED:
				return ((eFlags & ENABLED_EFLAG) != 0) != ENABLED_EDEFAULT;
			case AggregatorPackage.AGGREGATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null
						? description != null
						: !DESCRIPTION_EDEFAULT.equals(description);
			case AggregatorPackage.AGGREGATION__STATUS:
				return getStatus() != null;
			case AggregatorPackage.AGGREGATION__ERRORS:
				return errors != null && !errors.isEmpty();
			case AggregatorPackage.AGGREGATION__WARNINGS:
				return warnings != null && !warnings.isEmpty();
			case AggregatorPackage.AGGREGATION__INFOS:
				return infos != null && !infos.isEmpty();
			case AggregatorPackage.AGGREGATION__LABEL:
				return LABEL_EDEFAULT == null
						? label != null
						: !LABEL_EDEFAULT.equals(label);
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
			case AggregatorPackage.AGGREGATION__ENABLED:
				setEnabled((Boolean) newValue);
				return;
			case AggregatorPackage.AGGREGATION__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case AggregatorPackage.AGGREGATION__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.AGGREGATION__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.AGGREGATION__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.AGGREGATION__LABEL:
				setLabel((String) newValue);
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
		return AggregatorPackage.Literals.AGGREGATION;
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
			case AggregatorPackage.AGGREGATION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case AggregatorPackage.AGGREGATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AggregatorPackage.AGGREGATION__ERRORS:
				getErrors().clear();
				return;
			case AggregatorPackage.AGGREGATION__WARNINGS:
				getWarnings().clear();
				return;
			case AggregatorPackage.AGGREGATION__INFOS:
				getInfos().clear();
				return;
			case AggregatorPackage.AGGREGATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	public Aggregator getAggregator() {
		return (Aggregator) eContainer();
	}

	public EList<ContributionView> getContributionViews() {
		EList<Contribution> allContributions = getAggregator().getContributions();

		BasicEList<ContributionView> separatedContributions = new BasicEList<ContributionView>(allContributions.size());

		for(Contribution contribution : allContributions)
			if(contribution.getAggregation() == this)
				separatedContributions.add(new ContributionViewImpl(contribution));

		return separatedContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getErrors() {
		if(errors == null) {
			errors = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.AGGREGATION__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getInfos() {
		if(infos == null) {
			infos = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.AGGREGATION__INFOS);
		}
		return infos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Status getStatus() {
		// TODO composite - loop through contained contributions and propagate their status
		return AggregatorFactory.eINSTANCE.createStatus(StatusCode.OK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getWarnings() {
		if(warnings == null) {
			warnings = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.AGGREGATION__WARNINGS);
		}
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnabled() {
		return (eFlags & ENABLED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.AGGREGATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = (eFlags & ENABLED_EFLAG) != 0;
		if(newEnabled)
			eFlags |= ENABLED_EFLAG;
		else
			eFlags &= ~ENABLED_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.AGGREGATION__ENABLED, oldEnabled, newEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatorPackage.AGGREGATION__LABEL, oldLabel, label));
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
		result.append(" (enabled: ");
		result.append((eFlags & ENABLED_EFLAG) != 0);
		result.append(", description: ");
		result.append(description);
		result.append(", errors: ");
		result.append(errors);
		result.append(", warnings: ");
		result.append(warnings);
		result.append(", infos: ");
		result.append(infos);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // AggregationImpl
