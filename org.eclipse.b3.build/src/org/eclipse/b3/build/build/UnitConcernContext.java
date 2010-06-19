/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import java.net.URI;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getBuilderContexts <em>Builder Contexts</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getQuery <em>Query</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getRequiresRemovals <em>Requires Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getProvidesRemovals <em>Provides Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getSourceLocation <em>Source Location</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.UnitConcernContext#getOutputLocation <em>Output Location</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext()
 * @model
 * @generated
 */
public interface UnitConcernContext extends BuildConcernContext, IRequiredCapabilityContainer {
	/**
	 * Returns the value of the '<em><b>Builder Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.BuilderConcernContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Contexts</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Builder Contexts</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_BuilderContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuilderConcernContext> getBuilderContexts();

	/**
	 * Returns the value of the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Location</em>' attribute.
	 * @see #setOutputLocation(URI)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_OutputLocation()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getOutputLocation();

	/**
	 * Returns the value of the '<em><b>Provides Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.ProvidesPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_ProvidesRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidesPredicate> getProvidesRemovals();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_Query()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getQuery();

	/**
	 * Returns the value of the '<em><b>Requires Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RequiresPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requires Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_RequiresRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiresPredicate> getRequiresRemovals();

	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Location</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Location</em>' attribute.
	 * @see #setSourceLocation(URI)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getUnitConcernContext_SourceLocation()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getSourceLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.UnitConcernContext#getOutputLocation <em>Output Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output Location</em>' attribute.
	 * @see #getOutputLocation()
	 * @generated
	 */
	void setOutputLocation(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.UnitConcernContext#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.UnitConcernContext#getSourceLocation <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Location</em>' attribute.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(URI value);

} // UnitConcernContext
