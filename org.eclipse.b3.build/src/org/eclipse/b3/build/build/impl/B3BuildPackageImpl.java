/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Builder;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BuildPackageImpl extends EPackageImpl implements B3BuildPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.b3.build.build.B3BuildPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private B3BuildPackageImpl() {
		super(eNS_URI, B3BuildFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link B3BuildPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static B3BuildPackage init() {
		if (isInited) return (B3BuildPackage)EPackage.Registry.INSTANCE.getEPackage(B3BuildPackage.eNS_URI);

		// Obtain or create and register package
		B3BuildPackageImpl theB3BuildPackage = (B3BuildPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof B3BuildPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new B3BuildPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		B3backendPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theB3BuildPackage.createPackageContents();

		// Initialize created meta-data
		theB3BuildPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theB3BuildPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(B3BuildPackage.eNS_URI, theB3BuildPackage);
		return theB3BuildPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildUnit() {
		return buildUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilder() {
		return builderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildFactory getB3BuildFactory() {
		return (B3BuildFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buildUnitEClass = createEClass(BUILD_UNIT);

		builderEClass = createEClass(BUILDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		B3backendPackage theB3backendPackage = (B3backendPackage)EPackage.Registry.INSTANCE.getEPackage(B3backendPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		builderEClass.getESuperTypes().add(theB3backendPackage.getB3Function());

		// Initialize classes and features; add operations and parameters
		initEClass(buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builderEClass, Builder.class, "Builder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //B3BuildPackageImpl
