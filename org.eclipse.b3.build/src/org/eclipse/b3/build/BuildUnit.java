/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import java.lang.reflect.Type;
import java.net.URI;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.expression.IExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getSourceLocation <em>Source Location</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getOutputLocation <em>Output Location</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getFragmentHosts <em>Fragment Hosts</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuildUnit#getPlatformFilter <em>Platform Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit()
 * @model
 * @generated
 */
public interface BuildUnit extends VersionedCapability, BFunctionContainer, IRequiredCapabilityContainer,
		IProvidedCapabilityContainer {

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.IBuilder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builders</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builders</em>' reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Builders()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<IBuilder> getBuilders();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.ContainerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerConfiguration> getContainers();

	/**
	 * Returns the value of the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Properties</em>' containment reference.
	 * @see #setDefaultProperties(BPropertySet)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_DefaultProperties()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getDefaultProperties();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EffectiveUnitFacade getEffectiveFacade(BExecutionContext ctx) throws Throwable;

	/**
	 * Returns the value of the '<em><b>Execution Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Mode</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #setExecutionMode(ExecutionMode)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_ExecutionMode()
	 * @model
	 * @generated
	 */
	ExecutionMode getExecutionMode();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.reflect.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Implements()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	EList<Type> getImplements();

	/**
	 * Returns the value of the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Required Capabilities</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_MetaRequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getMetaRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Location</em>' attribute.
	 * @see #setOutputLocation(URI)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_OutputLocation()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getOutputLocation();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(IBuildUnitContainer)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Parent()
	 * @model
	 * @generated
	 */
	IBuildUnitContainer getParent();

	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_PropertySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPropertySet> getPropertySets();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.FirstFoundUnitProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FirstFoundUnitProvider> getProviders();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' attribute.
	 * The default value is <code>"resource:/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Location</em>' attribute.
	 * @see #setSourceLocation(URI)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_SourceLocation()
	 * @model default="resource:/" dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getSourceLocation();

	/**
	 * Returns the value of the '<em><b>Synchronizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.Synchronization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronizations</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizations</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_Synchronizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Synchronization> getSynchronizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the first (and only allowed) provider from the reference "providers".
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FirstFoundUnitProvider getUnitProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Properties</em>' containment reference.
	 * @see #getDefaultProperties()
	 * @generated
	 */
	void setDefaultProperties(BPropertySet value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #getExecutionMode()
	 * @generated
	 */
	void setExecutionMode(ExecutionMode value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getOutputLocation <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Location</em>' attribute.
	 * @see #getOutputLocation()
	 * @generated
	 */
	void setOutputLocation(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IBuildUnitContainer value);

	/**
	 * Returns the value of the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.FragmentHost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment Hosts</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_FragmentHosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<FragmentHost> getFragmentHosts();

	/**
	 * Returns the value of the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Filter</em>' attribute.
	 * @see #setPlatformFilter(IExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildUnit_PlatformFilter()
	 * @model dataType="org.eclipse.b3.build.IExpression"
	 * @generated
	 */
	IExpression getPlatformFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getPlatformFilter <em>Platform Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Filter</em>' attribute.
	 * @see #getPlatformFilter()
	 * @generated
	 */
	void setPlatformFilter(IExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildUnit#getSourceLocation <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location</em>' attribute.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(URI value);
} // BuildUnit
