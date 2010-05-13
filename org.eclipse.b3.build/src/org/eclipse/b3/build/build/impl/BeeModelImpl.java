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
import java.util.Collection;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.UnitProvider;
import org.eclipse.b3.build.core.B3BuildConstants;
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
 * An implementation of the model object '<em><b>Bee Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getImports <em>Imports</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getFunctions <em>Functions</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getConcerns <em>Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getBuildUnits <em>Build Units</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getPropertySets <em>Property Sets</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getRepositories <em>Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.BeeModelImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BeeModelImpl extends BChainedExpressionImpl implements BeeModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> imports;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunction> functions;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;

	/**
	 * The cached value of the '{@link #getBuildUnits() <em>Build Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuildUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildUnit> buildUnits;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected FirstFoundUnitProvider provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BeeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProvider(FirstFoundUnitProvider newProvider, NotificationChain msgs) {
		FirstFoundUnitProvider oldProvider = provider;
		provider = newProvider;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BEE_MODEL__PROVIDER, oldProvider, newProvider);
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return getImports();
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return getFunctions();
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return getConcerns();
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return getBuildUnits();
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return getPropertySets();
			case B3BuildPackage.BEE_MODEL__REPOSITORIES:
				return getRepositories();
			case B3BuildPackage.BEE_MODEL__PROVIDER:
				return getProvider();
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return ((InternalEList<?>) getConcerns()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return ((InternalEList<?>) getBuildUnits()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return ((InternalEList<?>) getPropertySets()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__REPOSITORIES:
				return ((InternalEList<?>) getRepositories()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BEE_MODEL__PROVIDER:
				return basicSetProvider(null, msgs);
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				return concerns != null && !concerns.isEmpty();
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				return buildUnits != null && !buildUnits.isEmpty();
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3BuildPackage.BEE_MODEL__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case B3BuildPackage.BEE_MODEL__PROVIDER:
				return provider != null;
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Type>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IFunction>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				getBuildUnits().clear();
				getBuildUnits().addAll((Collection<? extends BuildUnit>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>) newValue);
				return;
			case B3BuildPackage.BEE_MODEL__PROVIDER:
				setProvider((FirstFoundUnitProvider) newValue);
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
		return B3BuildPackage.Literals.BEE_MODEL;
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
			case B3BuildPackage.BEE_MODEL__IMPORTS:
				getImports().clear();
				return;
			case B3BuildPackage.BEE_MODEL__FUNCTIONS:
				getFunctions().clear();
				return;
			case B3BuildPackage.BEE_MODEL__CONCERNS:
				getConcerns().clear();
				return;
			case B3BuildPackage.BEE_MODEL__BUILD_UNITS:
				getBuildUnits().clear();
				return;
			case B3BuildPackage.BEE_MODEL__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3BuildPackage.BEE_MODEL__REPOSITORIES:
				getRepositories().clear();
				return;
			case B3BuildPackage.BEE_MODEL__PROVIDER:
				setProvider((FirstFoundUnitProvider) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Evaluates the BeeModel.
	 * Defines all imports.
	 * Defines all functions.
	 * Evaluates all repositories
	 * Sets up resolution.
	 * 
	 * @param ctx
	 *            Must be an instance of BuildContext
	 * @see org.eclipse.b3.backend.evaluator.b3backend.impl.BChainedExpressionImpl#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// A BeeModel is a BChainedExpression, and can this contain any type of expression
		// evaluate these first. Return value is ignored.
		super.evaluate(ctx);

		if(!(ctx instanceof BuildContext))
			throw new B3InternalError("A BeeModel must be defined in a BuildContext - got a context of class: " +
					ctx.getClass().toString());

		BuildContext bctx = (BuildContext) ctx;

		// Define all IMPORTS as constants
		for(Type t : getImports()) {
			if(t instanceof B3JavaImport) {
				Class<?> x = TypeUtils.getRaw(t);
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(x);
				bctx.defineValue(((B3JavaImport) t).getName(), x, metaClass);
			}
		}

		// Define all FUNCTIONS
		for(IFunction f : getFunctions())
			bctx.defineFunction(f);

		// Evaluate REPOSITORIES
		// (This will create the repository impl instances
		// Resolvers using the repositories links to the repository instances and will pick up
		// the impl instances).
		for(Repository r : getRepositories())
			r.evaluate(bctx);

		// Define PROVIDERS
		// if model defines providers, define them in the outer context
		//
		FirstFoundUnitProvider up = getProvider();
		if(up != null) {
			EList<UnitProvider> reposDecls = up.getProviders();
			if(reposDecls.size() > 0) {
				// wrap in a first found
				// TODO: Consider default repositories (workspace, target platform, etc)
				// TODO: Control default repositories used via preferences

				// if evaluating this in root context, there may be a default already defined - check and
				// reassign it.
				if(bctx.containsValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS))
					bctx.getLValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS).set(up);
				else
					bctx.defineValue(B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS, up, FirstFoundUnitProvider.class);

			}
		}
		// Define all BUILD UNITS (currently only one - could easily have more than one)
		for(BuildUnit u : getBuildUnits())
			if(u != null)
				bctx.defineBuildUnit(u, false);

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BuildUnit> getBuildUnits() {
		if(buildUnits == null) {
			buildUnits = new EObjectContainmentEList<BuildUnit>(
				BuildUnit.class, this, B3BuildPackage.BEE_MODEL__BUILD_UNITS);
		}
		return buildUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if(concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(BConcern.class, this, B3BuildPackage.BEE_MODEL__CONCERNS);
		}
		return concerns;
	}

	/**
	 * Returns BeeModel.class
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return BeeModel.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IFunction> getFunctions() {
		if(functions == null) {
			functions = new EObjectContainmentEList<IFunction>(
				IFunction.class, this, B3BuildPackage.BEE_MODEL__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Type> getImports() {
		if(imports == null) {
			imports = new EObjectContainmentEList<Type>(Type.class, this, B3BuildPackage.BEE_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if(propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(
				BPropertySet.class, this, B3BuildPackage.BEE_MODEL__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FirstFoundUnitProvider getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if(repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(
				Repository.class, this, B3BuildPackage.BEE_MODEL__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProvider(FirstFoundUnitProvider newProvider) {
		if(newProvider != provider) {
			NotificationChain msgs = null;
			if(provider != null)
				msgs = ((InternalEObject) provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BEE_MODEL__PROVIDER, null, msgs);
			if(newProvider != null)
				msgs = ((InternalEObject) newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BEE_MODEL__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BEE_MODEL__PROVIDER, newProvider, newProvider));
	}
} // BeeModelImpl
