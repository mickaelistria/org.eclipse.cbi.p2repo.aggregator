/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>BCreate Expression</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getAlias <em>Alias</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getTypeExpr <em>Type Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getContextBlock <em>Context Block
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BCreateExpressionImpl extends BParameterizedExpressionImpl implements BCreateExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeExpr() <em>Type Expr</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getTypeExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression typeExpr;

	/**
	 * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContextBlock()
	 * @generated
	 * @ordered
	 */
	protected BExpression contextBlock;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BCreateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCREATE_EXPRESSION;
	}

	// /**
	// * <!-- begin-user-doc -->
	// * Type may not be an EObject, and if not, no notification is sent on change.
	// * <!-- end-user-doc -->
	// * @generated NOT
	// */
	// public void setType(Type newType) {
	// if(! (type instanceof EObject && newType instanceof EObject))
	// type = newType;
	// else {
	// if (newType != type) {
	// NotificationChain msgs = null;
	// if (type != null)
	// msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
	// B3backendPackage.BCREATE_EXPRESSION__TYPE, null, msgs);
	// if (newType != null)
	// msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
	// B3backendPackage.BCREATE_EXPRESSION__TYPE, null, msgs);
	// msgs = basicSetType(newType, msgs);
	// if (msgs != null) msgs.dispatch();
	// }
	// else if (eNotificationRequired())
	// eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE, newType,
	// newType));
	// }
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getContextBlock() {
		return contextBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextBlock(BExpression newContextBlock, NotificationChain msgs) {
		BExpression oldContextBlock = contextBlock;
		contextBlock = newContextBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, oldContextBlock, newContextBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextBlock(BExpression newContextBlock) {
		if (newContextBlock != contextBlock) {
			NotificationChain msgs = null;
			if (contextBlock != null)
				msgs = ((InternalEObject)contextBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			if (newContextBlock != null)
				msgs = ((InternalEObject)newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			msgs = basicSetContextBlock(newContextBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, newContextBlock, newContextBlock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return basicSetTypeExpr(null, msgs);
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return basicSetContextBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getTypeExpr() {
		return typeExpr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeExpr(BExpression newTypeExpr, NotificationChain msgs) {
		BExpression oldTypeExpr = typeExpr;
		typeExpr = newTypeExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, oldTypeExpr, newTypeExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeExpr(BExpression newTypeExpr) {
		if (newTypeExpr != typeExpr) {
			NotificationChain msgs = null;
			if (typeExpr != null)
				msgs = ((InternalEObject)typeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, null, msgs);
			if (newTypeExpr != null)
				msgs = ((InternalEObject)newTypeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, null, msgs);
			msgs = basicSetTypeExpr(newTypeExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, newTypeExpr, newTypeExpr));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BCREATE_EXPRESSION__ALIAS:
				return getAlias();
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return getTypeExpr();
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return getContextBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BCREATE_EXPRESSION__ALIAS:
				setAlias((String)newValue);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				setTypeExpr((BExpression)newValue);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.BCREATE_EXPRESSION__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				setTypeExpr((BExpression)null);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BCREATE_EXPRESSION__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return typeExpr != null;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return contextBlock != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

	private static class ConstructorCandidate extends TypeUtils.Candidate {

		private Constructor<?> constructor;

		public ConstructorCandidate(Constructor<?> aMethod) {
			constructor = aMethod;
		}

		@Override
		protected Class<?>[] getParameterTypes() {
			return constructor.getParameterTypes();
		}

		@Override
		protected boolean isVarArgs() {
			return constructor.isVarArgs();
		}

		public Constructor<?> getConstructor() {
			return constructor;
		}

	}

	private static class ConstructorCandidateSource implements Iterable<ConstructorCandidate> {

		private class MethodCandidateIterator implements Iterator<ConstructorCandidate> {

			private int currentIndex;

			public boolean hasNext() {
				return currentIndex < constructors.length;
			}

			public ConstructorCandidate next() {
				return new ConstructorCandidate(constructors[currentIndex++]);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		}

		private Constructor<?>[] constructors;

		public ConstructorCandidateSource(Class<?> aClass) {
			constructors = aClass.getConstructors();
		}

		public Iterator<ConstructorCandidate> iterator() {
			return new MethodCandidateIterator();
		}

	}

	/**
	 * Returns an instance of the Class represented by the type TODO: Should handle a type referring to an Ecore model.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		EList<BParameter> paramaterList = getParameterList().getParameters();
		Type[] types = new Type[paramaterList.size() + 1];
		Iterator<BParameter> parameterIterator;

		types[0] = (Type) typeExpr.evaluate(ctx);
		parameterIterator = paramaterList.iterator();
		for(int i = 1; i < types.length; ++i)
			types[i] = parameterIterator.next().getExpr().getDeclaredType(ctx);

		Constructor<?> constructor;

		{
			Class<?>[] parameterTypes = new Class<?>[types.length - 1];

			for(int i = 1; i < types.length; ++i)
				parameterTypes[i - 1] = TypeUtils.getRaw(types[i]);

			LinkedList<ConstructorCandidate> candidateConstructors = TypeUtils.Candidate
					.findMostSpecificApplicableCandidates("new", parameterTypes, new ConstructorCandidateSource(
							TypeUtils.getRaw(types[0])));

			switch(candidateConstructors.size()) {
			case 0: // no candidate constructor found
				throw new B3NoSuchFunctionSignatureException("new", types);
			case 1: // one candidate constructor found
				constructor = candidateConstructors.getFirst().getConstructor();
				break;
			default: // more than one candidate constructor found (the constructor call is ambiguous)
				throw new B3AmbiguousFunctionSignatureException("new", types);
			}
		}

		Class<?>[] constructorParameterTypes = constructor.getParameterTypes();
		Object[] callParameters = new Object[constructorParameterTypes.length];

		if(constructor.isVarArgs()
				&& (types.length - 1 != constructorParameterTypes.length || !constructorParameterTypes[constructorParameterTypes.length - 1]
						.isAssignableFrom(TypeUtils.getRaw(types[constructorParameterTypes.length])))) {

			parameterIterator = paramaterList.iterator();
			for(int i = 0; i < constructorParameterTypes.length - 1; ++i)
				callParameters[i] = parameterIterator.next().getExpr().evaluate(ctx);

			Class<?> varargComponentType = constructorParameterTypes[constructorParameterTypes.length - 1]
					.getComponentType();

			Object varargArray = Array
					.newInstance(varargComponentType, types.length - constructorParameterTypes.length);

			for(int i = 0; i < types.length - constructorParameterTypes.length; ++i)
				Array.set(varargArray, i, parameterIterator.next().getExpr().evaluate(ctx));

			callParameters[constructorParameterTypes.length - 1] = varargArray;
		} else {
			parameterIterator = paramaterList.iterator();
			for(int i = 0; i < constructorParameterTypes.length; ++i)
				callParameters[i] = parameterIterator.next().getExpr().evaluate(ctx);
		}

		Object result = constructor.newInstance(callParameters);

		// if creator has a contextBlock and alias, these needs to be processed
		BExpression cBlock = getContextBlock();
		if(cBlock != null) {
			// create a context for the object instance
			BInstanceContext iCtx = B3backendFactory.eINSTANCE.createBInstanceContext();
			iCtx.setInstance(result);
			iCtx.setParentContext(ctx);
			iCtx.setOuterContext(ctx instanceof BInnerContext
					? ((BInnerContext) ctx).getOuterContext() : ctx);
			// create an inner context for the cBlock, and define the optional alias
			// as an immutable value.
			BExecutionContext iiCtx = iCtx.createInnerContext();
			if(getAlias() != null && getAlias().length() > 0)
				iiCtx.defineValue(getAlias(), result, types[0]);
			cBlock.evaluate(iiCtx);
		}
		return result;
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return (Type) typeExpr.evaluate(ctx);

	}
} // BCreateExpressionImpl
