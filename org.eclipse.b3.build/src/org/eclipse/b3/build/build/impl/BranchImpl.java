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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.TimeZone;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Branch;
import org.eclipse.b3.build.build.BranchPointType;
import org.eclipse.b3.build.build.UpdateStrategy;
import org.eclipse.b3.build.build.util.B3BuildValidator;
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
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getUpdateStrategy <em>Update Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getBranchPointType <em>Branch Point Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getInclude <em>Include</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getExclude <em>Exclude</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BranchImpl#getBranchPoint <em>Branch Point</em>}</li>
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
	 * The default value of the '{@link #getUpdateStrategy() <em>Update Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUpdateStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateStrategy UPDATE_STRATEGY_EDEFAULT = UpdateStrategy.BRANCH_POINT_DEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateStrategy() <em>Update Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUpdateStrategy()
	 * @generated
	 * @ordered
	 */
	protected UpdateStrategy updateStrategy = UPDATE_STRATEGY_EDEFAULT;

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
			case B3BuildPackage.BRANCH__UPDATE_STRATEGY:
				return getUpdateStrategy();
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				return getBranchPointType();
			case B3BuildPackage.BRANCH__INCLUDE:
				return getInclude();
			case B3BuildPackage.BRANCH__EXCLUDE:
				return getExclude();
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				return getDocumentation();
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				return getBranchPoint();
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
			case B3BuildPackage.BRANCH__UPDATE_STRATEGY:
				return updateStrategy != UPDATE_STRATEGY_EDEFAULT;
			case B3BuildPackage.BRANCH__BRANCH_POINT_TYPE:
				return branchPointType != BRANCH_POINT_TYPE_EDEFAULT;
			case B3BuildPackage.BRANCH__INCLUDE:
				return include != null && !include.isEmpty();
			case B3BuildPackage.BRANCH__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null
						? documentation != null
						: !DOCUMENTATION_EDEFAULT.equals(documentation);
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				return branchPoint != null;
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
			case B3BuildPackage.BRANCH__UPDATE_STRATEGY:
				setUpdateStrategy((UpdateStrategy) newValue);
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
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				setDocumentation((String) newValue);
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				setBranchPoint((BExpression) newValue);
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
			case B3BuildPackage.BRANCH__UPDATE_STRATEGY:
				setUpdateStrategy(UPDATE_STRATEGY_EDEFAULT);
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
			case B3BuildPackage.BRANCH__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case B3BuildPackage.BRANCH__BRANCH_POINT:
				setBranchPoint((BExpression) null);
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
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UpdateStrategy getEffectiveUpdateStrategy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UpdateStrategy getUpdateStrategy() {
		return updateStrategy;
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
	public void setUpdateStrategy(UpdateStrategy newUpdateStrategy) {
		UpdateStrategy oldUpdateStrategy = updateStrategy;
		updateStrategy = newUpdateStrategy == null
				? UPDATE_STRATEGY_EDEFAULT
				: newUpdateStrategy;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BRANCH__UPDATE_STRATEGY, oldUpdateStrategy, updateStrategy));
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
		result.append(", updateStrategy: ");
		result.append(updateStrategy);
		result.append(", branchPointType: ");
		result.append(branchPointType);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} // BranchImpl
