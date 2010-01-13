/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getMetaRequiredCapabilities <em>Meta Required Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildUnit#getContainers <em>Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit()
 * @model
 * @generated
 */
public interface BuildUnit extends VersionedCapability, BFunctionContainer, IRequiredCapabilityContainer, IProvidedCapabilityContainer {

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Builder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builders</em>' reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Builders()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Builder> getBuilders();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildUnit#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Execution Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #setExecutionMode(ExecutionMode)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_ExecutionMode()
	 * @model
	 * @generated
	 */
	ExecutionMode getExecutionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Mode</em>' attribute.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode
	 * @see #getExecutionMode()
	 * @generated
	 */
	void setExecutionMode(ExecutionMode value);

	/**
	 * Returns the value of the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Required Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_MetaRequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredCapability> getMetaRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.reflect.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Implements()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	EList<Type> getImplements();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Properties</em>' containment reference.
	 * @see #setDefaultProperties(BPropertySet)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_DefaultProperties()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getDefaultProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Properties</em>' containment reference.
	 * @see #getDefaultProperties()
	 * @generated
	 */
	void setDefaultProperties(BPropertySet value);

	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_PropertySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPropertySet> getPropertySets();

	/**
	 * Returns the value of the '<em><b>Synchronizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Synchronization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizations</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Synchronizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Synchronization> getSynchronizations();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RepositoryConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepositoryConfiguration> getRepositories();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.ContainerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildUnit_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerConfiguration> getContainers();
} // BuildUnit
