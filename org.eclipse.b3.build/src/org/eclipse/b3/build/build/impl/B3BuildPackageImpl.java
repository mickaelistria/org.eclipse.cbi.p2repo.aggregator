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
import org.eclipse.b3.build.build.BuildResultReference;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Builder;

import org.eclipse.b3.build.build.BuilderInput;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.CompoundBuildResultReference;
import org.eclipse.b3.build.build.CompoundPathVector;
import org.eclipse.b3.build.build.DirectBuildResultReference;
import org.eclipse.b3.build.build.IndirectBuildResultReference;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.build.PathVectorElement;
import org.eclipse.b3.build.build.Prerequisite;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.UnitBuildResultReference;
import org.eclipse.b3.build.build.VersionedCapability;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.equinox.internal.provisional.p2.core.Version;
import org.eclipse.equinox.internal.provisional.p2.core.VersionRange;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundPathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathVectorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prerequisiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundBuildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directBuildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitBuildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indirectBuildResultReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

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
	public EReference getBuildUnit_UnitProvidedCapabilities() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildUnit_Builders() {
		return (EReference)buildUnitEClass.getEStructuralFeatures().get(1);
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
	public EReference getBuilder_PostcondExpr() {
		return (EReference)builderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilder_PrecondExpr() {
		return (EReference)builderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilder_ProvidedCapabilities() {
		return (EReference)builderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilder_Input() {
		return (EReference)builderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilder_Output() {
		return (EReference)builderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilder_DefaultProperties() {
		return (EReference)builderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedCapability() {
		return versionedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedCapability_Version() {
		return (EAttribute)versionedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Name() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_NameSpace() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_CondExpr() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredCapability_VersionRange() {
		return (EAttribute)requiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathVector() {
		return pathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathVector_CondExpr() {
		return (EReference)pathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathVector_BasePath() {
		return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathVector_Paths() {
		return (EAttribute)pathVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundPathVector() {
		return compoundPathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundPathVector_PathVectors() {
		return (EReference)compoundPathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathVectorElement() {
		return pathVectorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilderInput() {
		return builderInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderInput_PrecondExpr() {
		return (EReference)builderInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderInput_PostcondExpr() {
		return (EReference)builderInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuilderInput_Prerequisites() {
		return (EReference)builderInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathGroup() {
		return pathGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_Annotations() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathGroup_PathVectors() {
		return (EReference)pathGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrerequisite() {
		return prerequisiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_CondExpr() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrerequisite_Alias() {
		return (EAttribute)prerequisiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_WithExpr() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrerequisite_BuildResult() {
		return (EReference)prerequisiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildResultReference() {
		return buildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundBuildResultReference() {
		return compoundBuildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundBuildResultReference_Prerequisites() {
		return (EReference)compoundBuildResultReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectBuildResultReference() {
		return directBuildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitBuildResultReference() {
		return unitBuildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitBuildResultReference_Parameters() {
		return (EReference)unitBuildResultReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitBuildResultReference_BuilderName() {
		return (EAttribute)unitBuildResultReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitBuildResultReference_Name() {
		return (EAttribute)unitBuildResultReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitBuildResultReference_NameSpace() {
		return (EAttribute)unitBuildResultReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndirectBuildResultReference() {
		return indirectBuildResultReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndirectBuildResultReference_VersionRange() {
		return (EAttribute)indirectBuildResultReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionRange() {
		return versionRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
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
		createEReference(buildUnitEClass, BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES);
		createEReference(buildUnitEClass, BUILD_UNIT__BUILDERS);

		builderEClass = createEClass(BUILDER);
		createEReference(builderEClass, BUILDER__POSTCOND_EXPR);
		createEReference(builderEClass, BUILDER__PRECOND_EXPR);
		createEReference(builderEClass, BUILDER__PROVIDED_CAPABILITIES);
		createEReference(builderEClass, BUILDER__INPUT);
		createEReference(builderEClass, BUILDER__OUTPUT);
		createEReference(builderEClass, BUILDER__DEFAULT_PROPERTIES);

		versionedCapabilityEClass = createEClass(VERSIONED_CAPABILITY);
		createEAttribute(versionedCapabilityEClass, VERSIONED_CAPABILITY__VERSION);

		builderInputEClass = createEClass(BUILDER_INPUT);
		createEReference(builderInputEClass, BUILDER_INPUT__PRECOND_EXPR);
		createEReference(builderInputEClass, BUILDER_INPUT__POSTCOND_EXPR);
		createEReference(builderInputEClass, BUILDER_INPUT__PREREQUISITES);

		pathGroupEClass = createEClass(PATH_GROUP);
		createEReference(pathGroupEClass, PATH_GROUP__ANNOTATIONS);
		createEReference(pathGroupEClass, PATH_GROUP__PATH_VECTORS);

		prerequisiteEClass = createEClass(PREREQUISITE);
		createEReference(prerequisiteEClass, PREREQUISITE__COND_EXPR);
		createEAttribute(prerequisiteEClass, PREREQUISITE__ALIAS);
		createEReference(prerequisiteEClass, PREREQUISITE__WITH_EXPR);
		createEReference(prerequisiteEClass, PREREQUISITE__BUILD_RESULT);

		buildResultReferenceEClass = createEClass(BUILD_RESULT_REFERENCE);

		compoundBuildResultReferenceEClass = createEClass(COMPOUND_BUILD_RESULT_REFERENCE);
		createEReference(compoundBuildResultReferenceEClass, COMPOUND_BUILD_RESULT_REFERENCE__PREREQUISITES);

		directBuildResultReferenceEClass = createEClass(DIRECT_BUILD_RESULT_REFERENCE);

		unitBuildResultReferenceEClass = createEClass(UNIT_BUILD_RESULT_REFERENCE);
		createEReference(unitBuildResultReferenceEClass, UNIT_BUILD_RESULT_REFERENCE__PARAMETERS);
		createEAttribute(unitBuildResultReferenceEClass, UNIT_BUILD_RESULT_REFERENCE__BUILDER_NAME);
		createEAttribute(unitBuildResultReferenceEClass, UNIT_BUILD_RESULT_REFERENCE__NAME);
		createEAttribute(unitBuildResultReferenceEClass, UNIT_BUILD_RESULT_REFERENCE__NAME_SPACE);

		indirectBuildResultReferenceEClass = createEClass(INDIRECT_BUILD_RESULT_REFERENCE);
		createEAttribute(indirectBuildResultReferenceEClass, INDIRECT_BUILD_RESULT_REFERENCE__VERSION_RANGE);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__NAME);
		createEAttribute(capabilityEClass, CAPABILITY__NAME_SPACE);
		createEReference(capabilityEClass, CAPABILITY__COND_EXPR);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__VERSION_RANGE);

		pathVectorEClass = createEClass(PATH_VECTOR);
		createEReference(pathVectorEClass, PATH_VECTOR__COND_EXPR);
		createEAttribute(pathVectorEClass, PATH_VECTOR__BASE_PATH);
		createEAttribute(pathVectorEClass, PATH_VECTOR__PATHS);

		compoundPathVectorEClass = createEClass(COMPOUND_PATH_VECTOR);
		createEReference(compoundPathVectorEClass, COMPOUND_PATH_VECTOR__PATH_VECTORS);

		pathVectorElementEClass = createEClass(PATH_VECTOR_ELEMENT);

		// Create data types
		versionRangeEDataType = createEDataType(VERSION_RANGE);
		versionEDataType = createEDataType(VERSION);
		uriEDataType = createEDataType(URI);
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
		buildUnitEClass.getESuperTypes().add(this.getVersionedCapability());
		builderEClass.getESuperTypes().add(theB3backendPackage.getB3Function());
		versionedCapabilityEClass.getESuperTypes().add(this.getCapability());
		compoundBuildResultReferenceEClass.getESuperTypes().add(this.getBuildResultReference());
		directBuildResultReferenceEClass.getESuperTypes().add(this.getUnitBuildResultReference());
		unitBuildResultReferenceEClass.getESuperTypes().add(this.getBuildResultReference());
		indirectBuildResultReferenceEClass.getESuperTypes().add(this.getUnitBuildResultReference());
		requiredCapabilityEClass.getESuperTypes().add(this.getCapability());
		compoundPathVectorEClass.getESuperTypes().add(this.getPathVector());
		pathVectorElementEClass.getESuperTypes().add(this.getPathVector());

		// Initialize classes and features; add operations and parameters
		initEClass(buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildUnit_UnitProvidedCapabilities(), this.getVersionedCapability(), null, "unitProvidedCapabilities", null, 0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildUnit_Builders(), this.getBuilder(), null, "builders", null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderEClass, Builder.class, "Builder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilder_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilder_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilder_ProvidedCapabilities(), this.getCapability(), null, "providedCapabilities", null, 0, -1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilder_Input(), this.getBuilderInput(), null, "input", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilder_Output(), this.getPathGroup(), null, "output", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilder_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0, 1, Builder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedCapabilityEClass, VersionedCapability.class, "VersionedCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedCapability_Version(), this.getVersion(), "version", null, 0, 1, VersionedCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderInputEClass, BuilderInput.class, "BuilderInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuilderInput_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0, 1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderInput_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null, 0, 1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuilderInput_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, BuilderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathGroupEClass, PathGroup.class, "PathGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathGroup_Annotations(), theB3backendPackage.getBPropertySet(), null, "annotations", null, 0, 1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathGroup_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, -1, PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prerequisiteEClass, Prerequisite.class, "Prerequisite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrerequisite_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrerequisite_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_WithExpr(), theB3backendPackage.getBWithExpression(), null, "withExpr", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrerequisite_BuildResult(), this.getBuildResultReference(), null, "buildResult", null, 0, 1, Prerequisite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildResultReferenceEClass, BuildResultReference.class, "BuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compoundBuildResultReferenceEClass, CompoundBuildResultReference.class, "CompoundBuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundBuildResultReference_Prerequisites(), this.getPrerequisite(), null, "prerequisites", null, 0, -1, CompoundBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directBuildResultReferenceEClass, DirectBuildResultReference.class, "DirectBuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitBuildResultReferenceEClass, UnitBuildResultReference.class, "UnitBuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitBuildResultReference_Parameters(), theB3backendPackage.getBParameterList(), null, "parameters", null, 0, 1, UnitBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitBuildResultReference_BuilderName(), ecorePackage.getEString(), "builderName", null, 0, 1, UnitBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitBuildResultReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitBuildResultReference_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, UnitBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indirectBuildResultReferenceEClass, IndirectBuildResultReference.class, "IndirectBuildResultReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndirectBuildResultReference_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1, IndirectBuildResultReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredCapability_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1, RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathVectorEClass, PathVector.class, "PathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathVector_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathVector_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathVector_Paths(), ecorePackage.getEString(), "paths", null, 0, -1, PathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundPathVectorEClass, CompoundPathVector.class, "CompoundPathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundPathVector_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, -1, CompoundPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathVectorElementEClass, PathVectorElement.class, "PathVectorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(versionRangeEDataType, VersionRange.class, "VersionRange", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //B3BuildPackageImpl
