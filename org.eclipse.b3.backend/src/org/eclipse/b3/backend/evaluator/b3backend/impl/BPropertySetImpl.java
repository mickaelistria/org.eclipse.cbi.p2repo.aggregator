/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collection;
import java.util.Properties;
import java.util.Map.Entry;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BDefProperty;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

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
 * An implementation of the model object '<em><b>BProperty Set</b></em>'.
 * TODO: Serialization does not work when properties are loaded - the PropertyOperations should be transient then.
 * TODO: Validation should ensure that not both of propertiesFile and PropertyOperations are set at the same time
 * 		Alternativly, the model should change to have a BPropertySetFile with different serialization - but
 * 		this also requires changes in the parser (but can be done without syntax changes as concrete syntax
 * 		does not allow both to be used at the same time).
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BPropertySetImpl#getPropertiesFile <em>Properties File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPropertySetImpl extends BAdviceImpl implements BPropertySet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet extends_;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertyOperation> operations;

	/**
	 * The default value of the '{@link #getPropertiesFile() <em>Properties File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesFile()
	 * @generated
	 * @ordered
	 */
	protected static final URI PROPERTIES_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertiesFile() <em>Properties File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesFile()
	 * @generated
	 * @ordered
	 */
	protected URI propertiesFile = PROPERTIES_FILE_EDEFAULT;

	/**
	 * Private flag indicating if the property set pointed to by propertiesFile URI has been loaded
	 */
	private boolean propertiesFileLoaded = false;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPropertySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BPROPERTY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (BPropertySet)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BPROPERTY_SET__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(BPropertySet newExtends) {
		BPropertySet oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BPROPERTY_SET__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BPropertyOperation> getOperations() {
		try {
			loadProperties();
		} catch (IOException e) {
			// TODO: Don't know how to handle IOExceptions here
			throw new B3InternalError("IOException while loading properties file", e);
		}
		if (operations == null) {
			operations = new EObjectContainmentEList<BPropertyOperation>(BPropertyOperation.class, this, B3backendPackage.BPROPERTY_SET__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getPropertiesFile() {
		return propertiesFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesFile(URI newPropertiesFile) {
		URI oldPropertiesFile = propertiesFile;
		propertiesFile = newPropertiesFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BPROPERTY_SET__PROPERTIES_FILE, oldPropertiesFile, propertiesFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object evaluateDefaults(BExecutionContext ctx, boolean allVisible) throws Throwable {
		loadProperties();
		// start by populating context with extended sets
		BPropertySet ps = getExtends();
		if(ps != null)
			ps.evaluateDefaults(ctx, allVisible);
		for(BPropertyOperation po : getOperations()) {
			po.evaluateDefaults(ctx, allVisible);
		}
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BPROPERTY_SET__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case B3backendPackage.BPROPERTY_SET__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case B3backendPackage.BPROPERTY_SET__OPERATIONS:
				return getOperations();
			case B3backendPackage.BPROPERTY_SET__PROPERTIES_FILE:
				return getPropertiesFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BPROPERTY_SET__EXTENDS:
				setExtends((BPropertySet)newValue);
				return;
			case B3backendPackage.BPROPERTY_SET__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BPropertyOperation>)newValue);
				return;
			case B3backendPackage.BPROPERTY_SET__PROPERTIES_FILE:
				setPropertiesFile((URI)newValue);
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
			case B3backendPackage.BPROPERTY_SET__EXTENDS:
				setExtends((BPropertySet)null);
				return;
			case B3backendPackage.BPROPERTY_SET__OPERATIONS:
				getOperations().clear();
				return;
			case B3backendPackage.BPROPERTY_SET__PROPERTIES_FILE:
				setPropertiesFile(PROPERTIES_FILE_EDEFAULT);
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
			case B3backendPackage.BPROPERTY_SET__EXTENDS:
				return extends_ != null;
			case B3backendPackage.BPROPERTY_SET__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case B3backendPackage.BPROPERTY_SET__PROPERTIES_FILE:
				return PROPERTIES_FILE_EDEFAULT == null ? propertiesFile != null : !PROPERTIES_FILE_EDEFAULT.equals(propertiesFile);
		}
		return super.eIsSet(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertiesFile: ");
		result.append(propertiesFile);
		result.append(')');
		return result.toString();
	}

	/**
	 * Populates the context with values from the property set.
	 * Returns this.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		loadProperties();
		// start by populating context with extended sets
		BPropertySet ps = getExtends();
		if(ps != null)
			ps.evaluate(ctx);
		for(BPropertyOperation po : getOperations()) {
			po.evaluate(ctx);
		}
		return this;
	}
	
	/**
	 * Loads properties by transforming them into property operations (for later evaluation).
	 * TODO: This is a very simple implementation using toURL().openStream() to read from a URL.
	 * @throws IOException
	 */
	private void loadProperties() throws IOException {
		if(propertiesFile == null || propertiesFileLoaded)
			return;
		InputStream inputStream = null;
		Properties p = new Properties();
		try {
			inputStream = propertiesFile.toURL().openStream();
			p.load(propertiesFile.toURL().openStream());
			EList<BPropertyOperation> ops = getOperations();
			for( Entry<Object,Object> e : p.entrySet()) {
				String key = "$" + String.class.cast(e.getKey());
				String value = String.class.cast(e.getValue());
				BPropertyDefinitionOperation propDef = B3backendFactory.eINSTANCE.createBPropertyDefinitionOperation();
				BDefProperty valueDef = B3backendFactory.eINSTANCE.createBDefProperty();
				BLiteralExpression valueLiteral = B3backendFactory.eINSTANCE.createBLiteralExpression();
				valueLiteral.setValue(value);
				valueDef.setName(key);
				valueDef.setValueExpr(valueLiteral);
				propDef.setDefinition(valueDef);
				ops.add(propDef);
			}
		} finally {
			propertiesFileLoaded = true; // don't try again if there are errors (TODO: too simplistic handling of errors)
			if(inputStream != null)
				try {
					inputStream.close();
				} catch(IOException e) {
					// ignored 
				}
		}
	}
} //BPropertySetImpl
