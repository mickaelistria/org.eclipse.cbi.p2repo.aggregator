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

import java.lang.reflect.Type;
import java.net.URI;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathGroupPredicate;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.core.PathIterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Group Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathGroupPredicateImpl#getPathVector <em>Path Vector</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathGroupPredicateImpl#getPathPattern <em>Path Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathGroupPredicateImpl extends BExpressionImpl implements PathGroupPredicate {
	/**
	 * The cached value of the '{@link #getPathVector() <em>Path Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVector()
	 * @generated
	 * @ordered
	 */
	protected PathVector pathVector;

	/**
	 * The cached value of the '{@link #getPathPattern() <em>Path Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern()
	 * @generated
	 * @ordered
	 */
	protected BExpression pathPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathGroupPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.PATH_GROUP_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVector getPathVector() {
		return pathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathVector(PathVector newPathVector, NotificationChain msgs) {
		PathVector oldPathVector = pathVector;
		pathVector = newPathVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, oldPathVector, newPathVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathVector(PathVector newPathVector) {
		if (newPathVector != pathVector) {
			NotificationChain msgs = null;
			if (pathVector != null)
				msgs = ((InternalEObject)pathVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, null, msgs);
			if (newPathVector != null)
				msgs = ((InternalEObject)newPathVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, null, msgs);
			msgs = basicSetPathVector(newPathVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR, newPathVector, newPathVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getPathPattern() {
		return pathPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathPattern(BExpression newPathPattern, NotificationChain msgs) {
		BExpression oldPathPattern = pathPattern;
		pathPattern = newPathPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, oldPathPattern, newPathPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPattern(BExpression newPathPattern) {
		if (newPathPattern != pathPattern) {
			NotificationChain msgs = null;
			if (pathPattern != null)
				msgs = ((InternalEObject)pathPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, null, msgs);
			if (newPathPattern != null)
				msgs = ((InternalEObject)newPathPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, null, msgs);
			msgs = basicSetPathPattern(newPathPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN, newPathPattern, newPathPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return basicSetPathVector(null, msgs);
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return basicSetPathPattern(null, msgs);
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
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return getPathVector();
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return getPathPattern();
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
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				setPathVector((PathVector)newValue);
				return;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression)newValue);
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
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				setPathVector((PathVector)null);
				return;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression)null);
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
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_VECTOR:
				return pathVector != null;
			case B3BuildPackage.PATH_GROUP_PREDICATE__PATH_PATTERN:
				return pathPattern != null;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeMatching(PathGroup pathGroup) {
		if(pathPattern == null && pathVector == null)
			throw new B3InternalError("PathGroupPredicate has neither pattern nor path vector");

		// optimize for "remove all" (no need to iterate, just delete everything)
		if(pathPattern != null && pathPattern instanceof BLiteralAny) {
			if(pathGroup.getPathVectors().size() == 0)
				return false; // already empty
			pathGroup.getPathVectors().clear();
			return true;
		}
		
		// iterate over output paths, match and remove
		PathIterator pitor = new PathIterator(pathGroup);
		boolean modified = false;
		
		NEXTPATH: while(pitor.hasNext()) {
			URI p = pitor.next();
			// strategy choice - either apply a pattern on each path, or match each against paths from a path vector

			// choice 1 - match against a path vector
			if(pathPattern == null) {
				PathIterator mItor = new PathIterator(getPathVector());
				while(mItor.hasNext()) {
					if(mItor.next().equals(p)) {
						modified = true;
						pitor.remove();
						continue NEXTPATH;
					}
				}
			}
			else {
				// choice 2 - compare against a regexp (wildcard already optimized)
				BExpression expr = getPathPattern();
				if(expr instanceof BRegularExpression) {
					if(((BRegularExpression)expr).getPattern().matcher(p.toString()).matches()) {
						pitor.remove();
						modified = true;
					}
				}
			}
		}
		return modified;
	}
	
	/**
	 * Evaluates the output of the IBuilder assigned to the context variable "@test" and matches that against
	 * either the path vector or pathPattern (a literal any or literal regexp). In the case of a path vector,
	 * the output specification must contain all paths in the predicate path vector (i.e. containsAll semantics).
	 * 
	 * Note: Matching is performed on unfiltered output.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// pick up "@test.pathgroup" parameter from context
		Object test = ctx.getValue("@test.pathgroup");
		// if the value is null (as opposed to not defined at all) this means there is nothing to match against
		// so result can never be true.
		if(test == null)
			return Boolean.FALSE; 

		if(!(test instanceof PathGroup))
			throw new B3InternalError("Attempt to evaluate PathGroupPredicate against non PathGroup");
		
		PathGroup pg = (PathGroup)test;		
		// strategy choice - either apply a pattern on all paths, or have a set of paths which must all be available
		
		// choice 1 - compare against a path vector
		if(pathPattern == null) {
			if(pathVector == null)
				throw new B3InternalError("OutputPredicate has neither pattern nor path vector");
				
			List<URI> predicates = new PathIterator(getPathVector()).toList();
			List<URI> candidate = new PathIterator(pg).toList();
			return Boolean.valueOf(candidate.containsAll(predicates));
		}
		// choice 2 - compare against a regexp or wildcard == ANY
		BExpression p = getPathPattern();
		if(p instanceof BLiteralAny)
			return Boolean.TRUE;
		if(p instanceof BRegularExpression) {
			Pattern pattern = ((BRegularExpression)p).getPattern();
			PathIterator paths = new PathIterator(pg);
			while(paths.hasNext()) {
				if(pattern.matcher(paths.next().toString()).matches())
					return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	/**
	 * Always returns Boolean.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return Boolean.class;
	}

} //PathGroupPredicateImpl
