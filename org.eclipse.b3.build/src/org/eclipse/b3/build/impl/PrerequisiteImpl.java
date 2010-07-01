/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.core.SingletonIterator;
import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildResultReference;
import org.eclipse.b3.build.BuilderReference;
import org.eclipse.b3.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.Prerequisite;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.PrerequisiteImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PrerequisiteImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PrerequisiteImpl#getCondExpr <em>Cond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PrerequisiteImpl#getWithExpr <em>With Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.PrerequisiteImpl#getBuildResult <em>Build Result</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PrerequisiteImpl extends EObjectImpl implements Prerequisite {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getCondExpr() <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression condExpr;

	/**
	 * The cached value of the '{@link #getWithExpr() <em>With Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getWithExpr()
	 * @generated
	 * @ordered
	 */
	protected BWithExpression withExpr;

	/**
	 * The cached value of the '{@link #getBuildResult() <em>Build Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuildResult()
	 * @generated
	 * @ordered
	 */
	protected BuildResultReference buildResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PrerequisiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBuildResult(BuildResultReference newBuildResult, NotificationChain msgs) {
		BuildResultReference oldBuildResult = buildResult;
		buildResult = newBuildResult;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__BUILD_RESULT, oldBuildResult, newBuildResult);
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
	public NotificationChain basicSetCondExpr(BExpression newCondExpr, NotificationChain msgs) {
		BExpression oldCondExpr = condExpr;
		condExpr = newCondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__COND_EXPR, oldCondExpr, newCondExpr);
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
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__TYPE, oldType, newType);
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
	public NotificationChain basicSetWithExpr(BWithExpression newWithExpr, NotificationChain msgs) {
		BWithExpression oldWithExpr = withExpr;
		withExpr = newWithExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__WITH_EXPR, oldWithExpr, newWithExpr);
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
			case B3BuildPackage.PREREQUISITE__NAME:
				return getName();
			case B3BuildPackage.PREREQUISITE__TYPE:
				return getType();
			case B3BuildPackage.PREREQUISITE__COND_EXPR:
				return getCondExpr();
			case B3BuildPackage.PREREQUISITE__WITH_EXPR:
				return getWithExpr();
			case B3BuildPackage.PREREQUISITE__BUILD_RESULT:
				return getBuildResult();
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
			case B3BuildPackage.PREREQUISITE__TYPE:
				return basicSetType(null, msgs);
			case B3BuildPackage.PREREQUISITE__COND_EXPR:
				return basicSetCondExpr(null, msgs);
			case B3BuildPackage.PREREQUISITE__WITH_EXPR:
				return basicSetWithExpr(null, msgs);
			case B3BuildPackage.PREREQUISITE__BUILD_RESULT:
				return basicSetBuildResult(null, msgs);
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
			case B3BuildPackage.PREREQUISITE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3BuildPackage.PREREQUISITE__TYPE:
				return type != null;
			case B3BuildPackage.PREREQUISITE__COND_EXPR:
				return condExpr != null;
			case B3BuildPackage.PREREQUISITE__WITH_EXPR:
				return withExpr != null;
			case B3BuildPackage.PREREQUISITE__BUILD_RESULT:
				return buildResult != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.PREREQUISITE__NAME:
				setName((String) newValue);
				return;
			case B3BuildPackage.PREREQUISITE__TYPE:
				setType((Type) newValue);
				return;
			case B3BuildPackage.PREREQUISITE__COND_EXPR:
				setCondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.PREREQUISITE__WITH_EXPR:
				setWithExpr((BWithExpression) newValue);
				return;
			case B3BuildPackage.PREREQUISITE__BUILD_RESULT:
				setBuildResult((BuildResultReference) newValue);
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
		return B3BuildPackage.Literals.PREREQUISITE;
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
			case B3BuildPackage.PREREQUISITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3BuildPackage.PREREQUISITE__TYPE:
				setType((Type) null);
				return;
			case B3BuildPackage.PREREQUISITE__COND_EXPR:
				setCondExpr((BExpression) null);
				return;
			case B3BuildPackage.PREREQUISITE__WITH_EXPR:
				setWithExpr((BWithExpression) null);
				return;
			case B3BuildPackage.PREREQUISITE__BUILD_RESULT:
				setBuildResult((BuildResultReference) null);
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
	public EList<BuilderReference> getBuilderReferences() throws Throwable {
		List<BuilderReference> result = new ArrayList<BuilderReference>();
		BuildResultReference br = getBuildResult();
		if(br != null) {
			result.addAll(br.getBuilderReferences());
		}
		// TODO: ISSUE - IS IT OK TO REUSE THE UNFILTERED FEATURE WHEN THERE IS NO DERIVED FEATURE ?
		return new EcoreEList.UnmodifiableEList<BuilderReference>(
			this, B3BuildPackage.Literals.PREREQUISITE__BUILD_RESULT, result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildResultReference getBuildResult() {
		return buildResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getCondExpr() {
		return condExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<EffectiveBuilderReferenceFacade> getEffectiveBuilderReferences(BExecutionContext ctx)
			throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		SerialIterator<EffectiveBuilderReferenceFacade> itor = new SerialIterator<EffectiveBuilderReferenceFacade>();
		BuildResultReference br = getBuildResult();
		if(br != null) {
			BExpression cond = getCondExpr();
			Object r = (cond == null)
					? null
					: evaluator.doEvaluate(cond, ctx);
			if(r == null || !(r instanceof Boolean) || r != Boolean.FALSE)
				itor.addIterator(br.getEffectiveBuilderReferences(withExpr == null
						? ctx
						: evaluator.doGetInnerContext(withExpr, ctx)));
		}
		return itor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the effective requirements by evaluating the optional conditional expression - if it returns false, the
	 * requirements are not included. If the prerequisite has a withExpression, the advice is evaluated and the
	 * advised context is used to obtain the effective requirements of the contained requirements.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		IB3Evaluator evaluator = ctx.getInjector().getInstance(IB3Evaluator.class);
		BuildResultReference br = getBuildResult();
		if(br != null) {
			BExpression cond = getCondExpr();
			Object r = (cond == null)
					? null
					: evaluator.doEvaluate(cond, ctx);
			if(r == null || !(r instanceof Boolean) || r != Boolean.FALSE)
				return br.getEffectiveRequirements(withExpr == null
						? ctx
						: evaluator.doGetInnerContext(withExpr, ctx));
		}

		return new SingletonIterator<EffectiveRequirementFacade>(null);
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
	 * @generated NOT
	 */
	public EList<RequiredCapability> getRequirements() throws Throwable {
		List<RequiredCapability> result = new ArrayList<RequiredCapability>();
		BuildResultReference br = getBuildResult();
		if(br != null)
			return br.getRequirements();

		// if there were no buildResults, return an empty list.
		// TODO: ISSUE - IS IT OK TO REUSE THE UNFILTERED FEATURE WHEN THERE IS NO DERIVED FEATURE ?
		return new EcoreEList.UnmodifiableEList<RequiredCapability>(
			this, B3BuildPackage.Literals.IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES, result.size(),
			result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BWithExpression getWithExpr() {
		return withExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBuildResult(BuildResultReference newBuildResult) {
		if(newBuildResult != buildResult) {
			NotificationChain msgs = null;
			if(buildResult != null)
				msgs = ((InternalEObject) buildResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__BUILD_RESULT, null, msgs);
			if(newBuildResult != null)
				msgs = ((InternalEObject) newBuildResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__BUILD_RESULT, null, msgs);
			msgs = basicSetBuildResult(newBuildResult, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__BUILD_RESULT, newBuildResult, newBuildResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCondExpr(BExpression newCondExpr) {
		if(newCondExpr != condExpr) {
			NotificationChain msgs = null;
			if(condExpr != null)
				msgs = ((InternalEObject) condExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__COND_EXPR, null, msgs);
			if(newCondExpr != null)
				msgs = ((InternalEObject) newCondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__COND_EXPR, null, msgs);
			msgs = basicSetCondExpr(newCondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__COND_EXPR, newCondExpr, newCondExpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PREREQUISITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(Type newType) {
		if(newType != type) {
			NotificationChain msgs = null;
			if(type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__TYPE, null, msgs);
			if(newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PREREQUISITE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWithExpr(BWithExpression newWithExpr) {
		if(newWithExpr != withExpr) {
			NotificationChain msgs = null;
			if(withExpr != null)
				msgs = ((InternalEObject) withExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__WITH_EXPR, null, msgs);
			if(newWithExpr != null)
				msgs = ((InternalEObject) newWithExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PREREQUISITE__WITH_EXPR, null, msgs);
			msgs = basicSetWithExpr(newWithExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PREREQUISITE__WITH_EXPR, newWithExpr, newWithExpr));
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
		result.append(')');
		return result.toString();
	}

} // PrerequisiteImpl
