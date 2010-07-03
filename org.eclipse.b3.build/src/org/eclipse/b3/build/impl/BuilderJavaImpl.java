package org.eclipse.b3.build.impl;

import java.util.Collection;

import java.util.Iterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BJavaFunctionImpl;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderJava;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.PathGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Java</b></em>'.
 * TODO: This implementation is 100% generated at the moment, once the b3 Builder is working, copy
 * methods (or refactor impl) for things like getting the effective provided and required capabilities.
 * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getDefaultProperties <em>Default Properties</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getUnitType <em>Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getExplicitUnitType <em>Explicit Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderJavaImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuilderJavaImpl extends BJavaFunctionImpl implements BuilderJava {
	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> providedCapabilities;

	/**
	 * The cached value of the '{@link #getPostcondExpr() <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postcondExpr;

	/**
	 * The cached value of the '{@link #getPrecondExpr() <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrecondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression precondExpr;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected BuilderInput input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected PathGroup output;

	/**
	 * The cached value of the '{@link #getDefaultProperties() <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefaultProperties()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet defaultProperties;

	/**
	 * The cached value of the '{@link #getPostinputcondExpr() <em>Postinputcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostinputcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postinputcondExpr;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected Class<? extends BuildUnit> unitType;

	/**
	 * The cached value of the '{@link #getExplicitUnitType() <em>Explicit Unit Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExplicitUnitType()
	 * @generated
	 * @ordered
	 */
	protected BParameterDeclaration explicitUnitType;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PathGroup source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderJavaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefaultProperties(BPropertySet newDefaultProperties, NotificationChain msgs) {
		BPropertySet oldDefaultProperties = defaultProperties;
		defaultProperties = newDefaultProperties;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES, oldDefaultProperties,
				newDefaultProperties);
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
	public NotificationChain basicSetExplicitUnitType(BParameterDeclaration newExplicitUnitType, NotificationChain msgs) {
		BParameterDeclaration oldExplicitUnitType = explicitUnitType;
		explicitUnitType = newExplicitUnitType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE, oldExplicitUnitType,
				newExplicitUnitType);
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
	public NotificationChain basicSetInput(BuilderInput newInput, NotificationChain msgs) {
		BuilderInput oldInput = input;
		input = newInput;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__INPUT, oldInput, newInput);
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
	public NotificationChain basicSetOutput(PathGroup newOutput, NotificationChain msgs) {
		PathGroup oldOutput = output;
		output = newOutput;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__OUTPUT, oldOutput, newOutput);
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
	public NotificationChain basicSetPostcondExpr(BExpression newPostcondExpr, NotificationChain msgs) {
		BExpression oldPostcondExpr = postcondExpr;
		postcondExpr = newPostcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR, oldPostcondExpr, newPostcondExpr);
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
	public NotificationChain basicSetPostinputcondExpr(BExpression newPostinputcondExpr, NotificationChain msgs) {
		BExpression oldPostinputcondExpr = postinputcondExpr;
		postinputcondExpr = newPostinputcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR, oldPostinputcondExpr,
				newPostinputcondExpr);
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
	public NotificationChain basicSetPrecondExpr(BExpression newPrecondExpr, NotificationChain msgs) {
		BExpression oldPrecondExpr = precondExpr;
		precondExpr = newPrecondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR, oldPrecondExpr, newPrecondExpr);
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
	public NotificationChain basicSetSource(PathGroup newSource, NotificationChain msgs) {
		PathGroup oldSource = source;
		source = newSource;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__SOURCE, oldSource, newSource);
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
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
					return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTCOND_EXPR;
				case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
					return B3BuildPackage.IBUILDER__PRECOND_EXPR;
				case B3BuildPackage.BUILDER_JAVA__INPUT:
					return B3BuildPackage.IBUILDER__INPUT;
				case B3BuildPackage.BUILDER_JAVA__OUTPUT:
					return B3BuildPackage.IBUILDER__OUTPUT;
				case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
					return B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES;
				case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR;
				case B3BuildPackage.BUILDER_JAVA__UNIT_TYPE:
					return B3BuildPackage.IBUILDER__UNIT_TYPE;
				case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.BUILDER_JAVA__SOURCE:
					return B3BuildPackage.IBUILDER__SOURCE;
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
		if(baseClass == IProvidedCapabilityContainer.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IBUILDER__POSTCOND_EXPR:
					return B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR;
				case B3BuildPackage.IBUILDER__PRECOND_EXPR:
					return B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR;
				case B3BuildPackage.IBUILDER__INPUT:
					return B3BuildPackage.BUILDER_JAVA__INPUT;
				case B3BuildPackage.IBUILDER__OUTPUT:
					return B3BuildPackage.BUILDER_JAVA__OUTPUT;
				case B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES:
					return B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES;
				case B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR:
					return B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR;
				case B3BuildPackage.IBUILDER__UNIT_TYPE:
					return B3BuildPackage.BUILDER_JAVA__UNIT_TYPE;
				case B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.IBUILDER__SOURCE:
					return B3BuildPackage.BUILDER_JAVA__SOURCE;
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
			case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
				return getPostcondExpr();
			case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
				return getPrecondExpr();
			case B3BuildPackage.BUILDER_JAVA__INPUT:
				return getInput();
			case B3BuildPackage.BUILDER_JAVA__OUTPUT:
				return getOutput();
			case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
				return getDefaultProperties();
			case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
				return getPostinputcondExpr();
			case B3BuildPackage.BUILDER_JAVA__UNIT_TYPE:
				return getUnitType();
			case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
				return getExplicitUnitType();
			case B3BuildPackage.BUILDER_JAVA__SOURCE:
				return getSource();
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
			case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
				return basicSetPostcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
				return basicSetPrecondExpr(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__INPUT:
				return basicSetInput(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__OUTPUT:
				return basicSetOutput(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
				return basicSetPostinputcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
				return basicSetExplicitUnitType(null, msgs);
			case B3BuildPackage.BUILDER_JAVA__SOURCE:
				return basicSetSource(null, msgs);
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
			case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
				return postcondExpr != null;
			case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
				return precondExpr != null;
			case B3BuildPackage.BUILDER_JAVA__INPUT:
				return input != null;
			case B3BuildPackage.BUILDER_JAVA__OUTPUT:
				return output != null;
			case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
				return defaultProperties != null;
			case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
				return postinputcondExpr != null;
			case B3BuildPackage.BUILDER_JAVA__UNIT_TYPE:
				return unitType != null;
			case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
				return explicitUnitType != null;
			case B3BuildPackage.BUILDER_JAVA__SOURCE:
				return source != null;
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
			case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
				setPostcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
				setPrecondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__INPUT:
				setInput((BuilderInput) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__OUTPUT:
				setOutput((PathGroup) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((BParameterDeclaration) newValue);
				return;
			case B3BuildPackage.BUILDER_JAVA__SOURCE:
				setSource((PathGroup) newValue);
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
		return B3BuildPackage.Literals.BUILDER_JAVA;
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
			case B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR:
				setPostcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR:
				setPrecondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__INPUT:
				setInput((BuilderInput) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__OUTPUT:
				setOutput((PathGroup) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((BParameterDeclaration) null);
				return;
			case B3BuildPackage.BUILDER_JAVA__SOURCE:
				setSource((PathGroup) null);
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
	public BPropertySet getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Iterator<EffectiveBuilderReferenceFacade> getEffectiveBuilderReferences(BExecutionContext ctx)
			throws Throwable {
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
	public Iterator<EffectiveCapabilityFacade> getEffectiveCapabilities(BExecutionContext ctx) throws Throwable {
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
	public Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
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
	public BParameterDeclaration getExplicitUnitType() {
		return explicitUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuilderInput getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PathGroup getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostcondExpr() {
		return postcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostinputcondExpr() {
		return postinputcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPrecondExpr() {
		return precondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Capability> getProvidedCapabilities() {
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(
				Capability.class, this, B3BuildPackage.BUILDER_JAVA__PROVIDED_CAPABILITIES);
		}
		return providedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PathGroup getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Class<? extends BuildUnit> getUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultProperties(BPropertySet newDefaultProperties) {
		if(newDefaultProperties != defaultProperties) {
			NotificationChain msgs = null;
			if(defaultProperties != null)
				msgs = ((InternalEObject) defaultProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES, null, msgs);
			if(newDefaultProperties != null)
				msgs = ((InternalEObject) newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__DEFAULT_PROPERTIES, newDefaultProperties,
				newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExplicitUnitType(BParameterDeclaration newExplicitUnitType) {
		if(newExplicitUnitType != explicitUnitType) {
			NotificationChain msgs = null;
			if(explicitUnitType != null)
				msgs = ((InternalEObject) explicitUnitType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE, null, msgs);
			if(newExplicitUnitType != null)
				msgs = ((InternalEObject) newExplicitUnitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE, null, msgs);
			msgs = basicSetExplicitUnitType(newExplicitUnitType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__EXPLICIT_UNIT_TYPE, newExplicitUnitType,
				newExplicitUnitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInput(BuilderInput newInput) {
		if(newInput != input) {
			NotificationChain msgs = null;
			if(input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__INPUT, null, msgs);
			if(newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutput(PathGroup newOutput) {
		if(newOutput != output) {
			NotificationChain msgs = null;
			if(output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__OUTPUT, null, msgs);
			if(newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostcondExpr(BExpression newPostcondExpr) {
		if(newPostcondExpr != postcondExpr) {
			NotificationChain msgs = null;
			if(postcondExpr != null)
				msgs = ((InternalEObject) postcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR, null, msgs);
			if(newPostcondExpr != null)
				msgs = ((InternalEObject) newPostcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR, null, msgs);
			msgs = basicSetPostcondExpr(newPostcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__POSTCOND_EXPR, newPostcondExpr, newPostcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostinputcondExpr(BExpression newPostinputcondExpr) {
		if(newPostinputcondExpr != postinputcondExpr) {
			NotificationChain msgs = null;
			if(postinputcondExpr != null)
				msgs = ((InternalEObject) postinputcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR, null, msgs);
			if(newPostinputcondExpr != null)
				msgs = ((InternalEObject) newPostinputcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR, null, msgs);
			msgs = basicSetPostinputcondExpr(newPostinputcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__POSTINPUTCOND_EXPR, newPostinputcondExpr,
				newPostinputcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrecondExpr(BExpression newPrecondExpr) {
		if(newPrecondExpr != precondExpr) {
			NotificationChain msgs = null;
			if(precondExpr != null)
				msgs = ((InternalEObject) precondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR, null, msgs);
			if(newPrecondExpr != null)
				msgs = ((InternalEObject) newPrecondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR, null, msgs);
			msgs = basicSetPrecondExpr(newPrecondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__PRECOND_EXPR, newPrecondExpr, newPrecondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(PathGroup newSource) {
		if(newSource != source) {
			NotificationChain msgs = null;
			if(source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__SOURCE, null, msgs);
			if(newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_JAVA__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnitType(Class<? extends BuildUnit> newUnitType) {
		Class<? extends BuildUnit> oldUnitType = unitType;
		unitType = newUnitType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_JAVA__UNIT_TYPE, oldUnitType, unitType));
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
		result.append(" (unitType: ");
		result.append(unitType);
		result.append(')');
		return result.toString();
	}

} // BuilderJavaImpl
