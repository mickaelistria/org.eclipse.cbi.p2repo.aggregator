/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IRequirement;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mapped Unit</b></em>'.
 * 
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.MappedUnit#getValidConfigurations <em>Valid Configurations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getMappedUnit()
 * @model abstract="true"
 * @generated
 */
public interface MappedUnit extends InstallableUnitRequest, EnabledStatusProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 *        dataType="org.eclipse.b3.aggregator.p2.IMatchExpression<org.eclipse.b3.aggregator.p2.IInstallableUnit>"
	 * @generated
	 */
	IMatchExpression<IInstallableUnit> getFilter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" type="org.eclipse.b3.aggregator.p2.IRequirement"
	 * @generated
	 */
	IRequirement getRequirement();

	/**
	 * Returns the value of the '<em><b>Valid Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Configurations</em>' reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Valid Configurations</em>' reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getMappedUnit_ValidConfigurations()
	 * @model keys="operatingSystem windowSystem architecture"
	 * @generated
	 */
	EList<Configuration> getValidConfigurations();

} // MappedUnit
