/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cbi.p2repo.aggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getWindowSystem <em>Window System</em>}</li>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EnabledStatusProvider {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cbi.p2repo.aggregator.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.Architecture
	 * @see #setArchitecture(Architecture)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getConfiguration_Architecture()
	 * @model required="true"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cbi.p2repo.aggregator.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.OperatingSystem
	 * @see #setOperatingSystem(OperatingSystem)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getConfiguration_OperatingSystem()
	 * @model required="true"
	 * @generated
	 */
	OperatingSystem getOperatingSystem();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getOSGiEnvironmentString();

	/**
	 * Returns the value of the '<em><b>Window System</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cbi.p2repo.aggregator.WindowSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window System</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window System</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.WindowSystem
	 * @see #setWindowSystem(WindowSystem)
	 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage#getConfiguration_WindowSystem()
	 * @model required="true"
	 * @generated
	 */
	WindowSystem getWindowSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.Architecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getOperatingSystem <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.OperatingSystem
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OperatingSystem value);

	/**
	 * Sets the value of the '{@link org.eclipse.cbi.p2repo.aggregator.Configuration#getWindowSystem <em>Window System</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window System</em>' attribute.
	 * @see org.eclipse.cbi.p2repo.aggregator.WindowSystem
	 * @see #getWindowSystem()
	 * @generated
	 */
	void setWindowSystem(WindowSystem value);

} // Configuration
