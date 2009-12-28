/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BuildFactoryImpl extends EFactoryImpl implements B3BuildFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static B3BuildFactory init() {
		try {
			B3BuildFactory theB3BuildFactory = (B3BuildFactory)EPackage.Registry.INSTANCE.getEFactory("http://b3build/1.0"); 
			if (theB3BuildFactory != null) {
				return theB3BuildFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new B3BuildFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case B3BuildPackage.BUILD_UNIT: return createBuildUnit();
			case B3BuildPackage.BUILDER: return createBuilder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit createBuildUnit() {
		BuildUnitImpl buildUnit = new BuildUnitImpl();
		return buildUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Builder createBuilder() {
		BuilderImpl builder = new BuilderImpl();
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildPackage getB3BuildPackage() {
		return (B3BuildPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static B3BuildPackage getPackage() {
		return B3BuildPackage.eINSTANCE;
	}

} //B3BuildFactoryImpl
