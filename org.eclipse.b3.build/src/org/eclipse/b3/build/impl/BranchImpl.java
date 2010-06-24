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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.TimeZone;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.Branch;
import org.eclipse.b3.build.BranchPointType;
import org.eclipse.b3.build.MergeConflictStrategy;
import org.eclipse.b3.build.TriState;
import org.eclipse.b3.build.util.B3BuildValidator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getBranchPointType <em>Branch Point Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getInclude <em>Include</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getExclude <em>Exclude</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getBranchPoint <em>Branch Point</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getMergeStrategy <em>Merge Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getCheckout <em>Checkout</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getAcceptDirty <em>Accept Dirty</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getUpdate <em>Update</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BranchImpl#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BranchImpl extends EObjectImpl implements Branch {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

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
	 * The default value of the '{@link #getBranchPointType() <em>Branch Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBranchPointType()
	 * @generated
	 * @ordered
	 */
	protected static final BranchPointType BRANCH_POINT_TYPE_EDEFAULT = BranchPointType.LATEST;

	/**
	 * The cached value of the '{@link #getBranchPointType() <em>Branch Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBranchPointType()
	 * @generated
	 * @ordered
	 */
	protected BranchPointType branchPointType = BRANCH_POINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<BNamePredicate> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<BNamePredicate> exclude;

	/**
	 * The cached value of the '{@link #getBranchPoint() <em>Branch Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBranchPoint()
	 * @generated
	 * @ordered
	 */
	protected BExpression branchPoint;

	/**
	 * The default value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final MergeConflictStrategy MERGE_STRATEGY_EDEFAULT = MergeConflictStrategy.DEFAULT;

	/**
	 * The cached value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected MergeConflictStrategy mergeStrategy = MERGE_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckout() <em>Checkout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCheckout()
	 * @generated
	 * @ordered
	 */
	protected static final TriState CHECKOUT_EDEFAULT = TriState.DEFAULT;

	/**
	 * The cached value of the '{@link #getCheckout() <em>Checkout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCheckout()
	 * @generated
	 * @ordered
	 */
	protected TriState checkout = CHECKOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptDirty() <em>Accept Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAcceptDirty()
	 * @generated
	 * @ordered
	 */
	protected static final TriState ACCEPT_DIRTY_EDEFAULT = TriState.DEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptDirty() <em>Accept Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAcceptDirty()
	 * @generated
	 * @ordered
	 */
	protected TriState acceptDirty = ACCEPT_DIRTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final TriState UPDATE_EDEFAULT = TriState.DEFAULT;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected TriState update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected static final TriState REPLACE_EDEFAULT = TriState.DEFAULT;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected TriState replace = REPLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBranchPoint(BExpression newBranchPoint, NotificationChain msgs) {
		BExpression oldBranchPoint = branchPoint;
		branchPoint = newBranchPoint;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__BRANCH_POINT, oldBranchPoint, newBranchPoint);
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
			case B3BuildPackage.BRANCH__NAME:
				return getName();
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				return getBranchPointType();
			case B3BuildPackage.BRANCH__INCLUDE:
				return getInclude();
			case B3BuildPackage.BRANCH__EXCLUDE:
				return getExclude();
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				return getBranchPoint();
			case B3BuildPackage.BRANCH__MERGE_STRATEGY:
				return getMergeStrategy();
			case B3BuildPackage.BRANCH__CHECKOUT:
				return getCheckout();
			case B3BuildPackage.BRANCH__ACCEPT_DIRTY:
				return getAcceptDirty();
			case B3BuildPackage.BRANCH__UPDATE:
				return getUpdate();
			case B3BuildPackage.BRANCH__REPLACE:
				return getReplace();
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
			case B3BuildPackage.BRANCH__INCLUDE:
				return ((InternalEList<?>) getInclude()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BRANCH__EXCLUDE:
				return ((InternalEList<?>) getExclude()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				return basicSetBranchPoint(null, msgs);
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
			case B3BuildPackage.BRANCH__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				return branchPointType != BRANCH_POINT_TYPE_EDEFAULT;
			case B3BuildPackage.BRANCH__INCLUDE:
				return include != null && !include.isEmpty();
			case B3BuildPackage.BRANCH__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				return branchPoint != null;
			case B3BuildPackage.BRANCH__MERGE_STRATEGY:
				return mergeStrategy != MERGE_STRATEGY_EDEFAULT;
			case B3BuildPackage.BRANCH__CHECKOUT:
				return checkout != CHECKOUT_EDEFAULT;
			case B3BuildPackage.BRANCH__ACCEPT_DIRTY:
				return acceptDirty != ACCEPT_DIRTY_EDEFAULT;
			case B3BuildPackage.BRANCH__UPDATE:
				return update != UPDATE_EDEFAULT;
			case B3BuildPackage.BRANCH__REPLACE:
				return replace != REPLACE_EDEFAULT;
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
			case B3BuildPackage.BRANCH__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				setBranchPointType((BranchPointType) newValue);
				return;
			case B3BuildPackage.BRANCH__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends BNamePredicate>) newValue);
				return;
			case B3BuildPackage.BRANCH__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends BNamePredicate>) newValue);
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				setBranchPoint((BExpression) newValue);
				return;
			case B3BuildPackage.BRANCH__MERGE_STRATEGY:
				setMergeStrategy((MergeConflictStrategy) newValue);
				return;
			case B3BuildPackage.BRANCH__CHECKOUT:
				setCheckout((TriState) newValue);
				return;
			case B3BuildPackage.BRANCH__ACCEPT_DIRTY:
				setAcceptDirty((TriState) newValue);
				return;
			case B3BuildPackage.BRANCH__UPDATE:
				setUpdate((TriState) newValue);
				return;
			case B3BuildPackage.BRANCH__REPLACE:
				setReplace((TriState) newValue);
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
		return B3BuildPackage.Literals.BRANCH;
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
			case B3BuildPackage.BRANCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				setBranchPointType(BRANCH_POINT_TYPE_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__INCLUDE:
				getInclude().clear();
				return;
			case B3BuildPackage.BRANCH__EXCLUDE:
				getExclude().clear();
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				setBranchPoint((BExpression) null);
				return;
			case B3BuildPackage.BRANCH__MERGE_STRATEGY:
				setMergeStrategy(MERGE_STRATEGY_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__CHECKOUT:
				setCheckout(CHECKOUT_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__ACCEPT_DIRTY:
				setAcceptDirty(ACCEPT_DIRTY_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__UPDATE:
				setUpdate(UPDATE_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__REPLACE:
				setReplace(REPLACE_EDEFAULT);
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
	public TriState getAcceptDirty() {
		return acceptDirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getBranchPoint() {
		return branchPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BranchPointType getBranchPointType() {
		return branchPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TriState getCheckout() {
		return checkout;
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
	 * @generated NOT
	 */
	public boolean getEffectiveAcceptDirty() {
		if(getAcceptDirty().getValue() != TriState.DEFAULT_VALUE)
			return triStateToBoolean(getAcceptDirty());
		// the default is to accept dirty if type is latest on any branch
		if(getBranchPointType().getValue() == BranchPointType.LATEST_VALUE)
			return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean getEffectiveCheckout() {
		if(getCheckout().getValue() != TriState.DEFAULT_VALUE)
			return triStateToBoolean(getCheckout());
		// default is to check out
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public MergeConflictStrategy getEffectiveMergeStrategy() {
		if(getMergeStrategy().getValue() != TriState.DEFAULT_VALUE)
			return getMergeStrategy();
		return MergeConflictStrategy.FAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean getEffectiveReplace() {
		if(getReplace().getValue() != TriState.DEFAULT_VALUE)
			return triStateToBoolean(getAcceptDirty());
		// no branch point type has true as replace strategy
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean getEffectiveUpdate() {
		// If replace is on, do not update
		if(getReplace().getValue() == TriState.TRUE_VALUE)
			return false;

		if(getUpdate().getValue() != TriState.DEFAULT_VALUE)
			return triStateToBoolean(getUpdate());
		// the default is to update if latest on any branch
		if(getBranchPointType().getValue() == BranchPointType.LATEST_VALUE)
			return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BNamePredicate> getExclude() {
		if(exclude == null) {
			exclude = new EObjectContainmentEList<BNamePredicate>(
				BNamePredicate.class, this, B3BuildPackage.BRANCH__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BNamePredicate> getInclude() {
		if(include == null) {
			include = new EObjectContainmentEList<BNamePredicate>(
				BNamePredicate.class, this, B3BuildPackage.BRANCH__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MergeConflictStrategy getMergeStrategy() {
		return mergeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TriState getReplace() {
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TriState getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValidState(DiagnosticChain chain, Map<Object, Object> map) {
		// TODO: refactor this method into private sub validators
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		boolean result = true;
		if(getBranchPointType() == BranchPointType.LATEST && getBranchPoint() != null) {
			if(chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
				B3BuildValidator.BRANCH__HAS_VALID_STATE, //
					EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
						new Object[] { //
						"hasValidState", EObjectValidator.getObjectLabel(this, map) //
						}), //
					new Object[] { this }));
			}
			result &= false;
		}
		// --Validate that update and replace are not true at the same time (ignore if update set to default
		// of false.
		//
		if(getUpdate().getValue() == TriState.TRUE_VALUE && getReplace().getValue() == TriState.TRUE_VALUE) {
			if(chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
				B3BuildValidator.BRANCH__HAS_VALID_STATE, //
					EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
						new Object[] { //
						"hasValidUpdateReplace", EObjectValidator.getObjectLabel(this, map) //
						}), //
					new Object[] { this }));
			}
			result &= false;
		}
		// -- Validate time stamp
		// TODO: check that a valid TS does not have trailing text (the parser just skips extra chars).
		// TODO: add support for more formats (long, short, day (no time) etc. and provide matching quick fix
		VALIDATE_TIMESTAMP: if(getBranchPointType() == BranchPointType.TIMESTAMP) {
			// get date format for message
			final DateFormat defFmt = DateFormat.getDateTimeInstance();
			final String defaultFormat = (defFmt instanceof SimpleDateFormat)
					? ((SimpleDateFormat) defFmt).toLocalizedPattern()
					: ""; // should not really be possible.
			// get date formats supported for conversion (passed as diagnostic data)
			final String[] defaultFormats = new String[] { defaultFormat };
			final BExpression expr = getBranchPoint();
			if(expr == null) {
				if(chain != null) {
					chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
					B3BuildValidator.BRANCH__HAS_NO_TIMESTAMP, //
						EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
							new Object[] { //
							"hasNoTimestampExpression", EObjectValidator.getObjectLabel(this, map) //
							}), //
						new Object[] { this, B3BuildPackage.BRANCH__BRANCH_POINT, defaultFormats }));
				}
				result &= false;
			}
			else if(expr instanceof BLiteralExpression) {
				// TODO: should check if it is a constant expression instead, and do constant evaluation
				final BLiteralExpression litExpr = (BLiteralExpression) expr;
				if(!(litExpr.getValue() instanceof String)) {
					if(chain != null) {
						chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
						B3BuildValidator.BRANCH__HAS_INVALID_TIMESTAMP, //
							EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
								new Object[] { //
								"hasInvalidTimestamp", EObjectValidator.getObjectLabel(this, map) //
								}), //
							new Object[] { this, B3BuildPackage.BRANCH__BRANCH_POINT, defaultFormats }));
					}
					result &= false;
					break VALIDATE_TIMESTAMP;

				}
				final String dateString = (String) litExpr.getValue();
				// first choice - try the wanted format
				try {
					SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssZ");
					fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
					fmt.parse(dateString);
					break VALIDATE_TIMESTAMP;
				}
				catch(ParseException e) {
					// ignore and try timestamp format
				}
				// Second choice - if using java default for the locale
				// Needs special processing as it probably does not contain TZ in the string)
				try {
					// try the default locale style of Date Time and see if it parses
					defFmt.parse(dateString);
					// if this parsed, it is not likely that the default is the full
					// format with timezone offset, so flag this as a special error :)
					// that is fixable
					// Although simple, it makes sense from a user perspective, a time in
					// local format can be entered and transformed to a timestamp.
					if(chain != null) {
						chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
						B3BuildValidator.BRANCH__HAS_TRANSFORMABLE_TIMESTAMP, //
							EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
								new Object[] { "hasTransformableTimestamp", EObjectValidator.getObjectLabel(this, map) //
								}), //
							new Object[] { this, B3BuildPackage.BRANCH__BRANCH_POINT, defaultFormats }));
					}
					result &= false;
				}
				catch(ParseException e) {
					if(chain != null) {
						chain.add(new BasicDiagnostic(Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE, //
						B3BuildValidator.BRANCH__HAS_INVALID_TIMESTAMP, //
							EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
								new Object[] { //
								"hasInvalidTimestamp", EObjectValidator.getObjectLabel(this, map) //
								}), //
							new Object[] { this, B3BuildPackage.BRANCH__BRANCH_POINT, defaultFormats }));
					}
					result &= false;

					// throw new ValueConverterException("Not in valid format: Use 'yyyyMMddHHmmssZ' or " + defaultFormat +
					// "Parse error:" + e.getMessage(), node, null);
				}
			} // end literal string test
			else {
				// this is an expression that must wait until runtime - issue a warning
				// TODO: Validate type - must result in a String at least (possibly a date)
				if(chain != null) {
					chain.add(new BasicDiagnostic(Diagnostic.WARNING, B3BuildValidator.DIAGNOSTIC_SOURCE, //
					B3BuildValidator.BRANCH__HAS_EXPRESSION_TIMESTAMP, //
						EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //
							new Object[] { //
							"hasExpressionTimestamp - validate in runtime", EObjectValidator.getObjectLabel(this, map) //
							}), //
						new Object[] { this, B3BuildPackage.BRANCH__BRANCH_POINT, defaultFormats }));
				}

			}
		} // end timestamp check
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAcceptDirty(TriState newAcceptDirty) {
		TriState oldAcceptDirty = acceptDirty;
		acceptDirty = newAcceptDirty == null
				? ACCEPT_DIRTY_EDEFAULT
				: newAcceptDirty;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__ACCEPT_DIRTY, oldAcceptDirty, acceptDirty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBranchPoint(BExpression newBranchPoint) {
		if(newBranchPoint != branchPoint) {
			NotificationChain msgs = null;
			if(branchPoint != null)
				msgs = ((InternalEObject) branchPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BRANCH__BRANCH_POINT, null, msgs);
			if(newBranchPoint != null)
				msgs = ((InternalEObject) newBranchPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BRANCH__BRANCH_POINT, null, msgs);
			msgs = basicSetBranchPoint(newBranchPoint, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__BRANCH_POINT, newBranchPoint, newBranchPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBranchPointType(BranchPointType newBranchPointType) {
		BranchPointType oldBranchPointType = branchPointType;
		branchPointType = newBranchPointType == null
				? BRANCH_POINT_TYPE_EDEFAULT
				: newBranchPointType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__BRANCH_POINT_TYPE, oldBranchPointType, branchPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckout(TriState newCheckout) {
		TriState oldCheckout = checkout;
		checkout = newCheckout == null
				? CHECKOUT_EDEFAULT
				: newCheckout;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__CHECKOUT, oldCheckout, checkout));
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
				this, Notification.SET, B3BuildPackage.BRANCH__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMergeStrategy(MergeConflictStrategy newMergeStrategy) {
		MergeConflictStrategy oldMergeStrategy = mergeStrategy;
		mergeStrategy = newMergeStrategy == null
				? MERGE_STRATEGY_EDEFAULT
				: newMergeStrategy;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__MERGE_STRATEGY, oldMergeStrategy, mergeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BRANCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReplace(TriState newReplace) {
		TriState oldReplace = replace;
		replace = newReplace == null
				? REPLACE_EDEFAULT
				: newReplace;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BRANCH__REPLACE, oldReplace, replace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUpdate(TriState newUpdate) {
		TriState oldUpdate = update;
		update = newUpdate == null
				? UPDATE_EDEFAULT
				: newUpdate;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BRANCH__UPDATE, oldUpdate, update));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", branchPointType: ");
		result.append(branchPointType);
		result.append(", mergeStrategy: ");
		result.append(mergeStrategy);
		result.append(", checkout: ");
		result.append(checkout);
		result.append(", acceptDirty: ");
		result.append(acceptDirty);
		result.append(", update: ");
		result.append(update);
		result.append(", replace: ");
		result.append(replace);
		result.append(')');
		return result.toString();
	}

	private boolean triStateToBoolean(TriState triState) {
		if(triState.getValue() == TriState.DEFAULT_VALUE)
			throw new IllegalArgumentException("Can not convert a tri state <DEFAULT> to boolean.");
		return triState.getValue() == TriState.TRUE_VALUE;
	}

} // BranchImpl
