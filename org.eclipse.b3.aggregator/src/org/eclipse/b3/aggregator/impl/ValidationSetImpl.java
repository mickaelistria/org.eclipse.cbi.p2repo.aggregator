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
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.DescriptionProvider;
import org.eclipse.b3.aggregator.InfosProvider;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.Status;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.aggregator.StatusProvider;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.util.GeneralUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ValidationSet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getStatus <em>Status</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getErrors <em>Errors</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getWarnings <em>Warnings</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getInfos <em>Infos</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getContributions <em>Contributions</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getValidationRepositories <em>Validation Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.ValidationSetImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValidationSetImpl extends MinimalEObjectImpl.Container implements ValidationSet {
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final int ABSTRACT_EFLAG = 1 << 1;

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
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contributions;

	/**
	 * The cached value of the '{@link #getValidationRepositories() <em>Validation Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValidationRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataRepositoryReference> validationRepositories;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationSet> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidationSetImpl() {
		super();
		eFlags |= ENABLED_EFLAG;
	}

	private void addContributions(EList<Contribution> receiver) {
		for(Contribution contrib : getContributions()) {
			if(!contrib.isEnabled() || receiver.contains(contrib))
				continue;
			receiver.add(contrib);
		}
		for(ValidationSet ex : getExtends())
			if(ex.isEnabled())
				((ValidationSetImpl) ex).addContributions(receiver);
	}

	private void addValidationRepositories(EList<MetadataRepositoryReference> receiver) {
		for(MetadataRepositoryReference repo : getValidationRepositories()) {
			if(!repo.isEnabled() || receiver.contains(repo))
				continue;
			receiver.add(repo);
		}
		for(ValidationSet ex : getExtends())
			if(ex.isEnabled())
				((ValidationSetImpl) ex).addValidationRepositories(receiver);
	}

	void clearStatus() {
		Status oldStatus = getStatus();
		for(Contribution contribution : getContributions())
			((ContributionImpl) contribution).setStatus(null);
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.VALIDATION_SET__STATUS, oldStatus, null));
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
				case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
					return AggregatorPackage.DESCRIPTION_PROVIDER__DESCRIPTION;
				default:
					return -1;
			}
		}
		if(baseClass == StatusProvider.class) {
			switch(derivedFeatureID) {
				case AggregatorPackage.VALIDATION_SET__STATUS:
					return AggregatorPackage.STATUS_PROVIDER__STATUS;
				default:
					return -1;
			}
		}
		if(baseClass == InfosProvider.class) {
			switch(derivedFeatureID) {
				case AggregatorPackage.VALIDATION_SET__ERRORS:
					return AggregatorPackage.INFOS_PROVIDER__ERRORS;
				case AggregatorPackage.VALIDATION_SET__WARNINGS:
					return AggregatorPackage.INFOS_PROVIDER__WARNINGS;
				case AggregatorPackage.VALIDATION_SET__INFOS:
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
					return AggregatorPackage.VALIDATION_SET__DESCRIPTION;
				default:
					return -1;
			}
		}
		if(baseClass == StatusProvider.class) {
			switch(baseFeatureID) {
				case AggregatorPackage.STATUS_PROVIDER__STATUS:
					return AggregatorPackage.VALIDATION_SET__STATUS;
				default:
					return -1;
			}
		}
		if(baseClass == InfosProvider.class) {
			switch(baseFeatureID) {
				case AggregatorPackage.INFOS_PROVIDER__ERRORS:
					return AggregatorPackage.VALIDATION_SET__ERRORS;
				case AggregatorPackage.INFOS_PROVIDER__WARNINGS:
					return AggregatorPackage.VALIDATION_SET__WARNINGS;
				case AggregatorPackage.INFOS_PROVIDER__INFOS:
					return AggregatorPackage.VALIDATION_SET__INFOS;
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
			case AggregatorPackage.VALIDATION_SET__ENABLED:
				return isEnabled();
			case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
				return getDescription();
			case AggregatorPackage.VALIDATION_SET__STATUS:
				return getStatus();
			case AggregatorPackage.VALIDATION_SET__ERRORS:
				return getErrors();
			case AggregatorPackage.VALIDATION_SET__WARNINGS:
				return getWarnings();
			case AggregatorPackage.VALIDATION_SET__INFOS:
				return getInfos();
			case AggregatorPackage.VALIDATION_SET__ABSTRACT:
				return isAbstract();
			case AggregatorPackage.VALIDATION_SET__LABEL:
				return getLabel();
			case AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS:
				return getContributions();
			case AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES:
				return getValidationRepositories();
			case AggregatorPackage.VALIDATION_SET__EXTENDS:
				return getExtends();
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
			case AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS:
				return ((InternalEList<?>) getContributions()).basicRemove(otherEnd, msgs);
			case AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES:
				return ((InternalEList<?>) getValidationRepositories()).basicRemove(otherEnd, msgs);
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
			case AggregatorPackage.VALIDATION_SET__ENABLED:
				return ((eFlags & ENABLED_EFLAG) != 0) != ENABLED_EDEFAULT;
			case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null
						? description != null
						: !DESCRIPTION_EDEFAULT.equals(description);
			case AggregatorPackage.VALIDATION_SET__STATUS:
				return getStatus() != null;
			case AggregatorPackage.VALIDATION_SET__ERRORS:
				return errors != null && !errors.isEmpty();
			case AggregatorPackage.VALIDATION_SET__WARNINGS:
				return warnings != null && !warnings.isEmpty();
			case AggregatorPackage.VALIDATION_SET__INFOS:
				return infos != null && !infos.isEmpty();
			case AggregatorPackage.VALIDATION_SET__ABSTRACT:
				return ((eFlags & ABSTRACT_EFLAG) != 0) != ABSTRACT_EDEFAULT;
			case AggregatorPackage.VALIDATION_SET__LABEL:
				return LABEL_EDEFAULT == null
						? label != null
						: !LABEL_EDEFAULT.equals(label);
			case AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS:
				return contributions != null && !contributions.isEmpty();
			case AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES:
				return validationRepositories != null && !validationRepositories.isEmpty();
			case AggregatorPackage.VALIDATION_SET__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
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
			case AggregatorPackage.VALIDATION_SET__ENABLED:
				setEnabled((Boolean) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends String>) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__ABSTRACT:
				setAbstract((Boolean) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__LABEL:
				setLabel((String) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contribution>) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES:
				getValidationRepositories().clear();
				getValidationRepositories().addAll((Collection<? extends MetadataRepositoryReference>) newValue);
				return;
			case AggregatorPackage.VALIDATION_SET__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends ValidationSet>) newValue);
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
		return AggregatorPackage.Literals.VALIDATION_SET;
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
			case AggregatorPackage.VALIDATION_SET__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AggregatorPackage.VALIDATION_SET__ERRORS:
				getErrors().clear();
				return;
			case AggregatorPackage.VALIDATION_SET__WARNINGS:
				getWarnings().clear();
				return;
			case AggregatorPackage.VALIDATION_SET__INFOS:
				getInfos().clear();
				return;
			case AggregatorPackage.VALIDATION_SET__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case AggregatorPackage.VALIDATION_SET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS:
				getContributions().clear();
				return;
			case AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES:
				getValidationRepositories().clear();
				return;
			case AggregatorPackage.VALIDATION_SET__EXTENDS:
				getExtends().clear();
				return;
		}
		super.eUnset(featureID);
	}

	public Aggregation getAggregation() {
		return (Aggregation) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Contribution> getAllContributions() {
		if(getExtends().isEmpty())
			return getDeclaredContributions();
		BasicEList<Contribution> all = new BasicEList<Contribution>();
		addContributions(all);
		return all;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<MetadataRepositoryReference> getAllValidationRepositories() {
		if(getExtends().isEmpty())
			return getDeclaredValidationRepositories();
		BasicEList<MetadataRepositoryReference> all = new BasicEList<MetadataRepositoryReference>();
		addValidationRepositories(all);
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Contribution> getContributions() {
		if(contributions == null) {
			contributions = new EObjectContainmentEList.Resolving<Contribution>(
				Contribution.class, this, AggregatorPackage.VALIDATION_SET__CONTRIBUTIONS);
		}
		return contributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Contribution> getDeclaredContributions() {
		return GeneralUtils.getEnabled(getContributions());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<MetadataRepositoryReference> getDeclaredValidationRepositories() {
		return GeneralUtils.getEnabled(getValidationRepositories());
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
			errors = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.VALIDATION_SET__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ValidationSet> getExtends() {
		if(extends_ == null) {
			extends_ = new EObjectResolvingEList<ValidationSet>(
				ValidationSet.class, this, AggregatorPackage.VALIDATION_SET__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getInfos() {
		if(infos == null) {
			infos = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.VALIDATION_SET__INFOS);
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
		StatusCode statusCode;
		for(ValidationSet ex : getExtends()) {
			if(!ex.isEnabled())
				continue;
			if((statusCode = ex.getStatus().getCode()) != StatusCode.OK && statusCode != StatusCode.WAITING)
				return AggregatorFactory.eINSTANCE.createStatus(StatusCode.BROKEN);
		}
		for(Contribution contribution : getDeclaredContributions()) {
			if((statusCode = contribution.getStatus().getCode()) != StatusCode.OK && statusCode != StatusCode.WAITING)
				return AggregatorFactory.eINSTANCE.createStatus(StatusCode.BROKEN);
		}
		for(MetadataRepositoryReference repo : getDeclaredValidationRepositories()) {
			if((statusCode = repo.getStatus().getCode()) != StatusCode.OK && statusCode != StatusCode.WAITING)
				return AggregatorFactory.eINSTANCE.createStatus(StatusCode.BROKEN);
		}
		return AggregatorFactory.eINSTANCE.createStatus(StatusCode.OK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MetadataRepositoryReference> getValidationRepositories() {
		if(validationRepositories == null) {
			validationRepositories = new EObjectContainmentEList.Resolving<MetadataRepositoryReference>(
				MetadataRepositoryReference.class, this, AggregatorPackage.VALIDATION_SET__VALIDATION_REPOSITORIES);
		}
		return validationRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getWarnings() {
		if(warnings == null) {
			warnings = new EDataTypeUniqueEList<String>(String.class, this, AggregatorPackage.VALIDATION_SET__WARNINGS);
		}
		return warnings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isAbstract() {
		return (eFlags & ABSTRACT_EFLAG) != 0;
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
	 * @generated NOT
	 */
	public boolean isExtensionOf(ValidationSet validationSet) {
		if(validationSet == null)
			return false;
		if(validationSet == this)
			return true;
		for(ValidationSet vs : getExtends()) {
			if(vs.isExtensionOf(validationSet))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = (eFlags & ABSTRACT_EFLAG) != 0;
		if(newAbstract)
			eFlags |= ABSTRACT_EFLAG;
		else
			eFlags &= ~ABSTRACT_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.VALIDATION_SET__ABSTRACT, oldAbstract, newAbstract));
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
				this, Notification.SET, AggregatorPackage.VALIDATION_SET__DESCRIPTION, oldDescription, description));
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
				this, Notification.SET, AggregatorPackage.VALIDATION_SET__ENABLED, oldEnabled, newEnabled));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.VALIDATION_SET__LABEL, oldLabel, label));
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
		result.append(", abstract: ");
		result.append((eFlags & ABSTRACT_EFLAG) != 0);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} // ValidationSetImpl
