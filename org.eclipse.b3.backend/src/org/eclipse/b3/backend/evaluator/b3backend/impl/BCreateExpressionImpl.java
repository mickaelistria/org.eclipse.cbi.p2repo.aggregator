/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValue;
import org.eclipse.b3.backend.evaluator.typesystem.ConstructorCandidate;
import org.eclipse.b3.backend.evaluator.typesystem.ConstructorCandidateSource;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCreate Expression</b></em>'.
 * <!-- end-user-doc-->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getTypeExpr <em>Type Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCreateExpressionImpl#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BCreateExpressionImpl extends BParameterizedExpressionImpl implements BCreateExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

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

	private static Type[] getAllParameterTypes(Type objectType, Type[] parameterTypes) {
		Type[] allParameterTypes = new Type[parameterTypes.length + 1];

		allParameterTypes[0] = objectType;
		System.arraycopy(parameterTypes, 0, allParameterTypes, 1, parameterTypes.length);

		return allParameterTypes;
	}

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
	 * The cached value of the '{@link #getTypeExpr() <em>Type Expr</em>}' containment reference.
	 * <!-- begin-user-doc-->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypeExpr()
	 * @generated
	 * @ordered
	 */
	protected BLiteralType typeExpr;

	/**
	 * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference.
	 * <!--begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContextBlock()
	 * @generated
	 * @ordered
	 */
	protected BExpression contextBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BCreateExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContextBlock(BExpression newContextBlock, NotificationChain msgs) {
		BExpression oldContextBlock = contextBlock;
		contextBlock = newContextBlock;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, oldContextBlock,
				newContextBlock);
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
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE, oldType, newType);
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
	public NotificationChain basicSetTypeExpr(BLiteralType newTypeExpr, NotificationChain msgs) {
		BLiteralType oldTypeExpr = typeExpr;
		typeExpr = newTypeExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, oldTypeExpr, newTypeExpr);
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
		if(baseClass == INamedValue.class) {
			switch(derivedFeatureID) {
				case B3backendPackage.BCREATE_EXPRESSION__NAME:
					return B3backendPackage.INAMED_VALUE__NAME;
				default:
					return -1;
			}
		}
		if(baseClass == ITypedValue.class) {
			switch(derivedFeatureID) {
				case B3backendPackage.BCREATE_EXPRESSION__TYPE:
					return B3backendPackage.ITYPED_VALUE__TYPE;
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
		if(baseClass == INamedValue.class) {
			switch(baseFeatureID) {
				case B3backendPackage.INAMED_VALUE__NAME:
					return B3backendPackage.BCREATE_EXPRESSION__NAME;
				default:
					return -1;
			}
		}
		if(baseClass == ITypedValue.class) {
			switch(baseFeatureID) {
				case B3backendPackage.ITYPED_VALUE__TYPE:
					return B3backendPackage.BCREATE_EXPRESSION__TYPE;
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
			case B3backendPackage.BCREATE_EXPRESSION__NAME:
				return getName();
			case B3backendPackage.BCREATE_EXPRESSION__TYPE:
				return getType();
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return getTypeExpr();
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return getContextBlock();
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
			case B3backendPackage.BCREATE_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return basicSetTypeExpr(null, msgs);
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return basicSetContextBlock(null, msgs);
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
			case B3backendPackage.BCREATE_EXPRESSION__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case B3backendPackage.BCREATE_EXPRESSION__TYPE:
				return type != null;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				return typeExpr != null;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				return contextBlock != null;
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
			case B3backendPackage.BCREATE_EXPRESSION__NAME:
				setName((String) newValue);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE:
				setType((Type) newValue);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				setTypeExpr((BLiteralType) newValue);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression) newValue);
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
		return B3backendPackage.Literals.BCREATE_EXPRESSION;
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
			case B3backendPackage.BCREATE_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE:
				setType((Type) null);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR:
				setTypeExpr((BLiteralType) null);
				return;
			case B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Returns an instance of the Class represented by the type
	 * TODO: Should handle a type referring to an Ecore model.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Type objectType = (Type) typeExpr.evaluate(ctx);
		Type[] parameterTypes;
		Object[] parameters;

		{
			EList<BParameter> paramaterList = getParameterList().getParameters();
			Iterator<BParameter> parameterIterator = paramaterList.iterator();
			int parameterCount = paramaterList.size();

			parameterTypes = new Type[parameterCount];
			parameters = new Object[parameterCount];

			for(int i = 0; i < parameterCount; ++i) {
				BExpression expression = parameterIterator.next().getExpr();

				parameterTypes[i] = expression.getDeclaredType(ctx);
				parameters[i] = expression.evaluate(ctx);
			}
		}
		Class<?> clazz = TypeUtils.getRaw(objectType);

		// if trying to create an instance from an interface see if there is a guice binding for it.
		//
		if(clazz.isInterface()) {
			ctx.getInjector().getInstance(clazz);
		}

		ConstructorCandidate constructorCandidate;
		{
			LinkedList<ConstructorCandidate> candidateConstructors = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
				parameterTypes, new ConstructorCandidateSource(clazz));

			switch(candidateConstructors.size()) {
				case 0: // no candidate constructor found
					throw new B3NoSuchFunctionSignatureException(
						"new", getAllParameterTypes(objectType, parameterTypes));
				case 1: // one candidate constructor found
					constructorCandidate = candidateConstructors.getFirst();
					break;
				default: // more than one candidate constructor found (the constructor call is ambiguous)
					throw new B3AmbiguousFunctionSignatureException("new", getAllParameterTypes(
						objectType, parameterTypes));
			}
		}

		Object[] callParameters = constructorCandidate.prepareJavaCallParameters(parameterTypes, parameters);
		Object result = constructorCandidate.getConstructor().newInstance(callParameters);

		// if creator has a contextBlock and alias, these needs to be processed
		BExpression cBlock = getContextBlock();
		if(cBlock != null) {
			// // create a context for the object instance
			// BInstanceContext iCtx = B3backendFactory.eINSTANCE.createBInstanceContext();
			// iCtx.setInstance(result);
			// iCtx.setParentContext(ctx);
			// iCtx.setOuterContext(ctx instanceof BInnerContext
			// ? ((BInnerContext) ctx).getOuterContext()
			// : ctx);
			// create an inner context for the cBlock, and define "this", and the optional alias
			// as immutable values.
			// BExecutionContext iiCtx = iCtx.createInnerContext();
			BExecutionContext iiCtx = ctx.createInnerContext();
			iiCtx.defineValue(B3BackendConstants.B3BACKEND_THIS, result, objectType);
			if(getName() != null && getName().length() > 0)
				iiCtx.defineValue(getName(), result, objectType);
			cBlock.evaluate(iiCtx);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getContextBlock() {
		return contextBlock;
	}

	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return (Type) typeExpr.evaluate(ctx);

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
	public Type getType() {
		if(typeExpr != null)
			return typeExpr.getType();
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BLiteralType getTypeExpr() {
		return typeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContextBlock(BExpression newContextBlock) {
		if(newContextBlock != contextBlock) {
			NotificationChain msgs = null;
			if(contextBlock != null)
				msgs = ((InternalEObject) contextBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			if(newContextBlock != null)
				msgs = ((InternalEObject) newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			msgs = basicSetContextBlock(newContextBlock, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__CONTEXT_BLOCK, newContextBlock,
				newContextBlock));
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
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setType(Type newType) {
		/* Do nothing - the type is virtual */
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypeExpr(BLiteralType newTypeExpr) {
		if(newTypeExpr != typeExpr) {
			NotificationChain msgs = null;
			if(typeExpr != null)
				msgs = ((InternalEObject) typeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, null, msgs);
			if(newTypeExpr != null)
				msgs = ((InternalEObject) newTypeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, null, msgs);
			msgs = basicSetTypeExpr(newTypeExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BCREATE_EXPRESSION__TYPE_EXPR, newTypeExpr, newTypeExpr));
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
} // BCreateExpressionImpl
