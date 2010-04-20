/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.SerialIterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BFunctionWrapperImpl;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuilderInput;
import org.eclipse.b3.build.build.BuilderWrapper;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.Prerequisite;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getProvidedCapabilities <em>Provided Capabilities</em>}
 * </li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getInput <em>Input</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getOutput <em>Output</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getDefaultProperties <em>Default Properties</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getUnitType <em>Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getExplicitUnitType <em>Explicit Unit Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isInputAdvised <em>Input Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isOutputAdvised <em>Output Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isUnitTypeAdvised <em>Unit Type Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isProvidesAdvised <em>Provides Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isDefaultPropertiesAdvised <em>Default Properties
 * Advised</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderWrapperImpl#isSourceAdvised <em>Source Advised</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuilderWrapperImpl extends BFunctionWrapperImpl implements BuilderWrapper {
	/**
	 * The cached value of the '{@link #getProvidedCapabilities() <em>Provided Capabilities</em>}' containment reference
	 * list.
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
	protected Type explicitUnitType;

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
	 * The default value of the '{@link #isInputAdvised() <em>Input Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isInputAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputAdvised() <em>Input Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isInputAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean inputAdvised = INPUT_ADVISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutputAdvised() <em>Output Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isOutputAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPUT_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutputAdvised() <em>Output Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isOutputAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean outputAdvised = OUTPUT_ADVISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnitTypeAdvised() <em>Unit Type Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isUnitTypeAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIT_TYPE_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnitTypeAdvised() <em>Unit Type Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isUnitTypeAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean unitTypeAdvised = UNIT_TYPE_ADVISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isProvidesAdvised() <em>Provides Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isProvidesAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesAdvised() <em>Provides Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isProvidesAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean providesAdvised = PROVIDES_ADVISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultPropertiesAdvised() <em>Default Properties Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isDefaultPropertiesAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_PROPERTIES_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultPropertiesAdvised() <em>Default Properties Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isDefaultPropertiesAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultPropertiesAdvised = DEFAULT_PROPERTIES_ADVISED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceAdvised() <em>Source Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSourceAdvised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_ADVISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceAdvised() <em>Source Advised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSourceAdvised()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceAdvised = SOURCE_ADVISED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderWrapperImpl() {
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES, oldDefaultProperties,
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
	public NotificationChain basicSetExplicitUnitType(Type newExplicitUnitType, NotificationChain msgs) {
		Type oldExplicitUnitType = explicitUnitType;
		explicitUnitType = newExplicitUnitType;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE, oldExplicitUnitType,
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__INPUT, oldInput, newInput);
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__OUTPUT, oldOutput, newOutput);
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR, oldPostcondExpr, newPostcondExpr);
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR, oldPostinputcondExpr,
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR, oldPrecondExpr, newPrecondExpr);
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
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__SOURCE, oldSource, newSource);
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
				case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
					return B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(derivedFeatureID) {
				case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTCOND_EXPR;
				case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
					return B3BuildPackage.IBUILDER__PRECOND_EXPR;
				case B3BuildPackage.BUILDER_WRAPPER__INPUT:
					return B3BuildPackage.IBUILDER__INPUT;
				case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
					return B3BuildPackage.IBUILDER__OUTPUT;
				case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
					return B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES;
				case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
					return B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR;
				case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE:
					return B3BuildPackage.IBUILDER__UNIT_TYPE;
				case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
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
					return B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES;
				default:
					return -1;
			}
		}
		if(baseClass == IBuilder.class) {
			switch(baseFeatureID) {
				case B3BuildPackage.IBUILDER__POSTCOND_EXPR:
					return B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR;
				case B3BuildPackage.IBUILDER__PRECOND_EXPR:
					return B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR;
				case B3BuildPackage.IBUILDER__INPUT:
					return B3BuildPackage.BUILDER_WRAPPER__INPUT;
				case B3BuildPackage.IBUILDER__OUTPUT:
					return B3BuildPackage.BUILDER_WRAPPER__OUTPUT;
				case B3BuildPackage.IBUILDER__DEFAULT_PROPERTIES:
					return B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES;
				case B3BuildPackage.IBUILDER__POSTINPUTCOND_EXPR:
					return B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR;
				case B3BuildPackage.IBUILDER__UNIT_TYPE:
					return B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE;
				case B3BuildPackage.IBUILDER__EXPLICIT_UNIT_TYPE:
					return B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE;
				case B3BuildPackage.IBUILDER__SOURCE:
					return B3BuildPackage.BUILDER_WRAPPER__SOURCE;
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
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
				return getProvidedCapabilities();
			case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
				return getPostcondExpr();
			case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
				return getPrecondExpr();
			case B3BuildPackage.BUILDER_WRAPPER__INPUT:
				return getInput();
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
				return getOutput();
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
				return getDefaultProperties();
			case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
				return getPostinputcondExpr();
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE:
				return getUnitType();
			case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
				return getExplicitUnitType();
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
				return getSource();
			case B3BuildPackage.BUILDER_WRAPPER__INPUT_ADVISED:
				return isInputAdvised();
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT_ADVISED:
				return isOutputAdvised();
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE_ADVISED:
				return isUnitTypeAdvised();
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDES_ADVISED:
				return isProvidesAdvised();
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED:
				return isDefaultPropertiesAdvised();
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE_ADVISED:
				return isSourceAdvised();
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
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
				return ((InternalEList<?>) getProvidedCapabilities()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
				return basicSetPostcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
				return basicSetPrecondExpr(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__INPUT:
				return basicSetInput(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
				return basicSetOutput(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
				return basicSetPostinputcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
				return basicSetExplicitUnitType(null, msgs);
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
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
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
				return providedCapabilities != null && !providedCapabilities.isEmpty();
			case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
				return postcondExpr != null;
			case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
				return precondExpr != null;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT:
				return input != null;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
				return output != null;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
				return defaultProperties != null;
			case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
				return postinputcondExpr != null;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE:
				return unitType != null;
			case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
				return explicitUnitType != null;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
				return source != null;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT_ADVISED:
				return inputAdvised != INPUT_ADVISED_EDEFAULT;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT_ADVISED:
				return outputAdvised != OUTPUT_ADVISED_EDEFAULT;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE_ADVISED:
				return unitTypeAdvised != UNIT_TYPE_ADVISED_EDEFAULT;
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDES_ADVISED:
				return providesAdvised != PROVIDES_ADVISED_EDEFAULT;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED:
				return defaultPropertiesAdvised != DEFAULT_PROPERTIES_ADVISED_EDEFAULT;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE_ADVISED:
				return sourceAdvised != SOURCE_ADVISED_EDEFAULT;
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
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				getProvidedCapabilities().addAll((Collection<? extends Capability>) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
				setPostcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
				setPrecondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT:
				setInput((BuilderInput) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
				setOutput((PathGroup) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((Type) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
				setSource((PathGroup) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT_ADVISED:
				setInputAdvised((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT_ADVISED:
				setOutputAdvised((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE_ADVISED:
				setUnitTypeAdvised((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDES_ADVISED:
				setProvidesAdvised((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED:
				setDefaultPropertiesAdvised((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE_ADVISED:
				setSourceAdvised((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES:
				getProvidedCapabilities().clear();
				return;
			case B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR:
				setPostcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR:
				setPrecondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT:
				setInput((BuilderInput) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT:
				setOutput((PathGroup) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES:
				setDefaultProperties((BPropertySet) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE:
				setUnitType((Class<? extends BuildUnit>) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE:
				setExplicitUnitType((Type) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE:
				setSource((PathGroup) null);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__INPUT_ADVISED:
				setInputAdvised(INPUT_ADVISED_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__OUTPUT_ADVISED:
				setOutputAdvised(OUTPUT_ADVISED_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE_ADVISED:
				setUnitTypeAdvised(UNIT_TYPE_ADVISED_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__PROVIDES_ADVISED:
				setProvidesAdvised(PROVIDES_ADVISED_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED:
				setDefaultPropertiesAdvised(DEFAULT_PROPERTIES_ADVISED_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_WRAPPER__SOURCE_ADVISED:
				setSourceAdvised(SOURCE_ADVISED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: needs to support advise
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BPropertySet getDefaultProperties() {
		// if(isDefaultPropertiesAdviced())
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
	 * Returns the original's effective (provided) capabilities if {@link #isProvidesAdvised()} returns false,
	 * otherwise the effective provided capabilities from this wrapper.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<EffectiveCapabilityFacade> getEffectiveCapabilities(BExecutionContext ctx) throws Throwable {
		if(!isProvidesAdvised())
			return ((IBuilder) getOriginal()).getEffectiveCapabilities(ctx);
		ArrayList<EffectiveCapabilityFacade> list = new ArrayList<EffectiveCapabilityFacade>();
		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createOuterContext();
			defProp.evaluateDefaults(ctxToUse, true);
		}
		for(Capability cap : getProvidedCapabilities()) {
			BExpression c = cap.getCondExpr();
			if(c != null) {
				Object include = c.evaluate(ctxToUse);
				if(include != null && include instanceof Boolean && ((Boolean) include) == Boolean.FALSE)
					continue; // skip this requirement
			}
			EffectiveCapabilityFacade facade = B3BuildFactory.eINSTANCE.createEffectiveCapabilityFacade();
			facade.setContext(ctxToUse);
			facade.setProvidedCapability(cap);
			list.add(facade);
		}
		return list.iterator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the original's effective requirements if the wrapper is not InputAdviced ({@link #isInputAdvised()}.
	 * Returns and iterator over effective requirements. Applies the builder's default properties in
	 * a context before filter evaluation.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable {
		if(!isInputAdvised())
			return ((IBuilder) getOriginal()).getEffectiveRequirements(ctx);
		SerialIterator<EffectiveRequirementFacade> result = new SerialIterator<EffectiveRequirementFacade>();
		BExecutionContext ctxToUse = ctx;
		BPropertySet defProp = getDefaultProperties();
		if(defProp != null) {
			ctxToUse = ctxToUse.createInnerContext();
			defProp.evaluateDefaults(ctxToUse, true);
		}
		if(input != null) {
			for(Prerequisite p : input.getPrerequisites()) {
				result.addIterator(p.getEffectiveRequirements(ctxToUse));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type getExplicitUnitType() {
		return explicitUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the input from this wrapper if {@link #isInputAdvised()} returns true, otherwise from the wrapped
	 * original.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BuilderInput getInput() {
		if(isInputAdvised())
			return input;
		return ((IBuilder) getOriginal()).getInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the output from this wrapper if {@link #isOutputAdvised()} returns true, else from the wrapped original.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PathGroup getOutput() {
		if(isOutputAdvised())
			return output;
		return ((IBuilder) getOriginal()).getOutput();
	}

	/**
	 * If promoted, return the copied set of parameter declarations, else the original's
	 */
	@Override
	public EList<BParameterDeclaration> getParameters() {
		if(isUnitTypeAdvised())
			return super.getParametersGen(); // sneaky way around BFunctionWrapper's different treatment of
												// getParameters()
		return original.getParameters();
	}

	/**
	 * If promoted return the copied and modified parameter declarations, else the original's
	 */
	@Override
	public Type[] getParameterTypes() {
		if(isUnitTypeAdvised())
			return super.getParameterTypesGen(); // sneaky way around BFunctionWrapper's different treatment of
													// getTypes()
		return original.getParameterTypes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Note, there is no advice flag - when creating a wrapper, the actual expression should be wrapped.
	 * See {@link BuilderConcernContextImpl}.
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostcondExpr() {
		return postcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Note, there is no advice flag - when creating a wrapper, the actual expression should be wrapped.
	 * See {@link BuilderConcernContextImpl}.
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostinputcondExpr() {
		return postinputcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Note, there is no advice flag - when creating a wrapper, the actual expression should be wrapped.
	 * See {@link BuilderConcernContextImpl}.
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPrecondExpr() {
		return precondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: ADD SUPPORT FOR ADVICE
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Capability> getProvidedCapabilities() {
		// TODO: Add advice for provided capability
		if(providedCapabilities == null) {
			providedCapabilities = new EObjectContainmentEList<Capability>(
				Capability.class, this, B3BuildPackage.BUILDER_WRAPPER__PROVIDED_CAPABILITIES);
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
	public boolean isDefaultPropertiesAdvised() {
		return defaultPropertiesAdvised;
	}

	// /**
	// * <!-- begin-user-doc -->
	// * TODO: Move this to setUnitType, and change parameter to boolean...
	// * <!-- end-user-doc -->
	// * @generated NOT
	// */
	// public void setPromoted(Class<? extends BuildUnit> newPromoted) {
	// if(original == null)
	// throw new IllegalStateException("The original must be set before calling setPromoted");
	// Class<? extends BuildUnit> oldPromoted = promoted;
	// promoted = newPromoted;
	// if (eNotificationRequired())
	// eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__PROMOTED, oldPromoted,
	// promoted));
	//
	// // Must copy and process original's parameters
	// // the full parameter declarations
	// // (Must make copies as the parameter declarations are contained).
	// EList<BParameterDeclaration> myParameters = getParametersGen();
	// for(BParameterDeclaration pd : original.getParameters()) {
	// myParameters.add(BParameterDeclaration.class.cast(EcoreUtil.copy(pd)));
	// myParameters.get(0).setType(promoted);
	//
	// // The cached types (since it is not possible to delegate to original
	// Type[] types = original.getParameterTypes();
	// types[0] = promoted;
	// setParameterTypesGen(types);
	//
	// // parameter names are the same (first parameter is always called unit), but since it may not be in
	// // the map (if unmatched by type rules, it must be remapped).
	// Map<String, String> pm = getParameterMap();
	// // unit is always mapped.
	// pm.put("unit", "unit");
	// }
	// }
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isInputAdvised() {
		return inputAdvised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isOutputAdvised() {
		return outputAdvised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isProvidesAdvised() {
		return providesAdvised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSourceAdvised() {
		return sourceAdvised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isUnitTypeAdvised() {
		return unitTypeAdvised;
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
						B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES, null, msgs);
			if(newDefaultProperties != null)
				msgs = ((InternalEObject) newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES, newDefaultProperties,
				newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultPropertiesAdvised(boolean newDefaultPropertiesAdvised) {
		boolean oldDefaultPropertiesAdvised = defaultPropertiesAdvised;
		defaultPropertiesAdvised = newDefaultPropertiesAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED,
				oldDefaultPropertiesAdvised, defaultPropertiesAdvised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExplicitUnitType(Type newExplicitUnitType) {
		if(newExplicitUnitType != explicitUnitType) {
			NotificationChain msgs = null;
			if(explicitUnitType != null)
				msgs = ((InternalEObject) explicitUnitType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE, null, msgs);
			if(newExplicitUnitType != null)
				msgs = ((InternalEObject) newExplicitUnitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE, null, msgs);
			msgs = basicSetExplicitUnitType(newExplicitUnitType, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE, newExplicitUnitType,
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
						B3BuildPackage.BUILDER_WRAPPER__INPUT, null, msgs);
			if(newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInputAdvised(boolean newInputAdvised) {
		boolean oldInputAdvised = inputAdvised;
		inputAdvised = newInputAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__INPUT_ADVISED, oldInputAdvised, inputAdvised));
	}

	/**
	 * Checks that the original is an IBuilder
	 */
	@Override
	public void setOriginal(IFunction newOriginal) {
		if(!(newOriginal instanceof IBuilder))
			throw new IllegalArgumentException("A BuilderWrapper can only wrap an IBuilder was: " +
					newOriginal.getClass().toString());
		super.setOriginal(newOriginal);
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
						B3BuildPackage.BUILDER_WRAPPER__OUTPUT, null, msgs);
			if(newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutputAdvised(boolean newOutputAdvised) {
		boolean oldOutputAdvised = outputAdvised;
		outputAdvised = newOutputAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__OUTPUT_ADVISED, oldOutputAdvised, outputAdvised));
	}

	/**
	 * Enforces the mapping "unit" -> "unit"
	 */
	@Override
	public void setParameterMap(Map<String, String> newParameterMap) {
		// enforce that "unit" is mapped
		newParameterMap.put("unit", "unit");
		super.setParameterMap(newParameterMap);
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
						B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR, null, msgs);
			if(newPostcondExpr != null)
				msgs = ((InternalEObject) newPostcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR, null, msgs);
			msgs = basicSetPostcondExpr(newPostcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__POSTCOND_EXPR, newPostcondExpr, newPostcondExpr));
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
						B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR, null, msgs);
			if(newPostinputcondExpr != null)
				msgs = ((InternalEObject) newPostinputcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR, null, msgs);
			msgs = basicSetPostinputcondExpr(newPostinputcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__POSTINPUTCOND_EXPR, newPostinputcondExpr,
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
						B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR, null, msgs);
			if(newPrecondExpr != null)
				msgs = ((InternalEObject) newPrecondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR, null, msgs);
			msgs = basicSetPrecondExpr(newPrecondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__PRECOND_EXPR, newPrecondExpr, newPrecondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProvidesAdvised(boolean newProvidesAdvised) {
		boolean oldProvidesAdvised = providesAdvised;
		providesAdvised = newProvidesAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__PROVIDES_ADVISED, oldProvidesAdvised,
				providesAdvised));
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
						B3BuildPackage.BUILDER_WRAPPER__SOURCE, null, msgs);
			if(newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_WRAPPER__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceAdvised(boolean newSourceAdvised) {
		boolean oldSourceAdvised = sourceAdvised;
		sourceAdvised = newSourceAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__SOURCE_ADVISED, oldSourceAdvised, sourceAdvised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the unit type, and copies and processes parameters. (Do not forget to also call
	 * {@link #setUnitTypeAdvised(boolean)} if the wrapper should use the wrapper's unit type instead of the original's.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setUnitType(Class<? extends BuildUnit> newUnitType) {
		if(original == null)
			throw new IllegalStateException("The original must be set before calling setUnitType");

		Class<? extends BuildUnit> oldUnitType = unitType;
		unitType = newUnitType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE, oldUnitType, unitType));

		// Must copy and process original's parameters the full parameter
		// declarations
		// (Must make copies as the parameter declarations are contained).
		EList<BParameterDeclaration> originalParameters = original.getParameters();
		EList<BParameterDeclaration> parameters = getParametersGen();
		parameters.clear();
		for(BParameterDeclaration pd : originalParameters) {
			parameters.add(EcoreUtil.copy(pd));
		}

		// Must cache types (since it is not possible to delegate to original
		Type[] originalTypes = original.getParameterTypes();
		Type[] types = new Type[originalTypes.length];
		System.arraycopy(originalParameters, 0, types, 0, originalTypes.length);

		Map<String, String> parameterMap = getParameterMap();

		if(originalParameters.size() > 0) {
			parameters.get(0).setType(unitType);

			types[0] = unitType;

			// parameter names are the same (first parameter is always called
			// unit), but since it may not be in the map (if unmatched by type
			// rules, it must be re-mapped). unit is always mapped.
			parameterMap.put("unit", "unit");
		}

		setParameterTypesGen(types);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnitTypeAdvised(boolean newUnitTypeAdvised) {
		boolean oldUnitTypeAdvised = unitTypeAdvised;
		unitTypeAdvised = newUnitTypeAdvised;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_WRAPPER__UNIT_TYPE_ADVISED, oldUnitTypeAdvised,
				unitTypeAdvised));
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
		result.append(", inputAdvised: ");
		result.append(inputAdvised);
		result.append(", outputAdvised: ");
		result.append(outputAdvised);
		result.append(", unitTypeAdvised: ");
		result.append(unitTypeAdvised);
		result.append(", providesAdvised: ");
		result.append(providesAdvised);
		result.append(", defaultPropertiesAdvised: ");
		result.append(defaultPropertiesAdvised);
		result.append(", sourceAdvised: ");
		result.append(sourceAdvised);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_WRAPPER;
	}
} // BuilderWrapperImpl
