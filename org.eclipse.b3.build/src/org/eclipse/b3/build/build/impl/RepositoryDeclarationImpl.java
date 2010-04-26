/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;
import java.net.URI;

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnitRepository;
import org.eclipse.b3.build.build.RepositoryDeclaration;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.IBuildUnitRepository;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl#getResolverType <em>Resolver Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RepositoryDeclarationImpl#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RepositoryDeclarationImpl extends RepositoryConfigurationImpl implements RepositoryDeclaration {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected URI location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolverType() <em>Resolver Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolverType()
	 * @generated
	 * @ordered
	 */
	protected Type resolverType;

	/**
	 * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
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
	protected RepositoryDeclarationImpl() {
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
				this, Notification.SET, B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK, oldContextBlock,
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
	public NotificationChain basicSetResolverType(Type newResolverType, NotificationChain msgs) {
		Type oldResolverType = resolverType;
		resolverType = newResolverType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE, oldResolverType,
				newResolverType);
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
			case B3BuildPackage.REPOSITORY_DECLARATION__LOCATION:
				return getLocation();
			case B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE:
				return getResolverType();
			case B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK:
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
			case B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE:
				return basicSetResolverType(null, msgs);
			case B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK:
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
			case B3BuildPackage.REPOSITORY_DECLARATION__LOCATION:
				return LOCATION_EDEFAULT == null
						? location != null
						: !LOCATION_EDEFAULT.equals(location);
			case B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE:
				return resolverType != null;
			case B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK:
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
			case B3BuildPackage.REPOSITORY_DECLARATION__LOCATION:
				setLocation((URI) newValue);
				return;
			case B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE:
				setResolverType((Type) newValue);
				return;
			case B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK:
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
		return B3BuildPackage.Literals.REPOSITORY_DECLARATION;
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
			case B3BuildPackage.REPOSITORY_DECLARATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE:
				setResolverType((Type) null);
				return;
			case B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK:
				setContextBlock((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl#evaluate(org.eclipse.b3.backend.evaluator.b3backend
	 * .BExecutionContext)
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		BCreateExpression createExpr = B3backendFactory.eINSTANCE.createBCreateExpression();
		createExpr.setAlias(B3BuildConstants.B3REPO_CREATE_CTX_ALIAS); // for use in context block

		// If type is specified, create new using this type, else use the location URI to find
		// a factory (both are not defined at the same time)
		if(resolverType != null) {
			BLiteralType litType = B3backendFactory.eINSTANCE.createBLiteralType();
			litType.setType(TypeUtils.getRaw(resolverType)); // ensure a copy is made (due to containment)
			createExpr.setTypeExpr(litType);
			// call create without parameters
		}
		else {
			if(location == null)
				throw new B3InternalError("Invalid RepositoryDeclaration found - has no type and no location.");
			String scheme = location.getScheme();
			if(scheme == null || scheme.length() < 1)
				throw new B3InternalError("Invalid scheme - null or empty string in location: " + location.toString());
			BVariableExpression varExpr = B3backendFactory.eINSTANCE.createBVariableExpression();
			varExpr.setName(B3BuildConstants.B3ENGINE_VAR_REPOSCHEMECLASS + "." + scheme);
			createExpr.setTypeExpr(varExpr);

			// if the remaining uri is empty, the default constructor is used, else
			// an unwrapped uri is used as parameter in the call.
			String uriString = location.toString().substring(scheme.length() + 1);
			if(uriString.length() > 0) {
				URI unwrappedUri = URI.create(uriString);
				BParameter param = B3backendFactory.eINSTANCE.createBParameter();
				BLiteralExpression uriLiteral = B3backendFactory.eINSTANCE.createBLiteralExpression();
				uriLiteral.setValue(unwrappedUri);
				param.setExpr(uriLiteral);
				BParameterList paramList = B3backendFactory.eINSTANCE.createBParameterList();
				EList<BParameter> params = paramList.getParameters();
				params.add(param);
				createExpr.setParameterList(paramList);
			}
		}
		if(contextBlock != null)
			createExpr.setContextBlock(EcoreUtil.copy(contextBlock)); // must use a copy due to containment

		Object result = createExpr.evaluate(ctx);

		// assert result
		if(result == null)
			throw new B3InternalError("Repository creation evaluation returned null");
		if(!(result instanceof IBuildUnitRepository))
			throw new B3IncompatibleTypeException(BuildUnitRepository.class, result.getClass());

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type getResolverType() {
		return resolverType;
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
						B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK, null, msgs);
			if(newContextBlock != null)
				msgs = ((InternalEObject) newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK, null, msgs);
			msgs = basicSetContextBlock(newContextBlock, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_DECLARATION__CONTEXT_BLOCK, newContextBlock,
				newContextBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocation(URI newLocation) {
		URI oldLocation = location;
		location = newLocation;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_DECLARATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolverType(Type newResolverType) {
		if(newResolverType != resolverType) {
			NotificationChain msgs = null;
			if(resolverType != null)
				msgs = ((InternalEObject) resolverType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE, null, msgs);
			if(newResolverType != null)
				msgs = ((InternalEObject) newResolverType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE, null, msgs);
			msgs = basicSetResolverType(newResolverType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REPOSITORY_DECLARATION__RESOLVER_TYPE, newResolverType,
				newResolverType));
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
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} // RepositoryDeclarationImpl
