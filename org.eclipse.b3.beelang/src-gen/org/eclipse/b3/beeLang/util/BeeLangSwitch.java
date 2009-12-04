/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang.util;

import java.util.List;

import org.eclipse.b3.beeLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.beeLang.BeeLangPackage
 * @generated
 */
public class BeeLangSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BeeLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BeeLangPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BeeLangPackage.BEE_MODEL:
      {
        BeeModel beeModel = (BeeModel)theEObject;
        T result = caseBeeModel(beeModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.BUILD_UNIT:
      {
        BuildUnit buildUnit = (BuildUnit)theEObject;
        T result = caseBuildUnit(buildUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PROVIDED_CAPABILITY:
      {
        ProvidedCapability providedCapability = (ProvidedCapability)theEObject;
        T result = caseProvidedCapability(providedCapability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.REQUIRED_CAPABILITY:
      {
        RequiredCapability requiredCapability = (RequiredCapability)theEObject;
        T result = caseRequiredCapability(requiredCapability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.FILTERED_CAPABILITY:
      {
        FilteredCapability filteredCapability = (FilteredCapability)theEObject;
        T result = caseFilteredCapability(filteredCapability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CAPABILITY:
      {
        Capability capability = (Capability)theEObject;
        T result = caseCapability(capability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.NAMED_PROPERTY_SET:
      {
        NamedPropertySet namedPropertySet = (NamedPropertySet)theEObject;
        T result = caseNamedPropertySet(namedPropertySet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PROPERTY_SET:
      {
        PropertySet propertySet = (PropertySet)theEObject;
        T result = casePropertySet(propertySet);
        if (result == null) result = casePropertyOperation(propertySet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PROPERTY_OPERATION:
      {
        PropertyOperation propertyOperation = (PropertyOperation)theEObject;
        T result = casePropertyOperation(propertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.FILTERED_PROPERTY_OPERATION:
      {
        FilteredPropertyOperation filteredPropertyOperation = (FilteredPropertyOperation)theEObject;
        T result = caseFilteredPropertyOperation(filteredPropertyOperation);
        if (result == null) result = casePropertyOperation(filteredPropertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.SET_PROPERTY_OPERATION:
      {
        SetPropertyOperation setPropertyOperation = (SetPropertyOperation)theEObject;
        T result = caseSetPropertyOperation(setPropertyOperation);
        if (result == null) result = casePropertyOperation(setPropertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.UNSET_PROPERTY_OPERATION:
      {
        UnsetPropertyOperation unsetPropertyOperation = (UnsetPropertyOperation)theEObject;
        T result = caseUnsetPropertyOperation(unsetPropertyOperation);
        if (result == null) result = casePropertyOperation(unsetPropertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.SYNCHRONIZATION:
      {
        Synchronization synchronization = (Synchronization)theEObject;
        T result = caseSynchronization(synchronization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PATH_GROUP:
      {
        PathGroup pathGroup = (PathGroup)theEObject;
        T result = casePathGroup(pathGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PATH_VECTOR_ELEMENT:
      {
        PathVectorElement pathVectorElement = (PathVectorElement)theEObject;
        T result = casePathVectorElement(pathVectorElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.FILTERED_PATH_VECTOR:
      {
        FilteredPathVector filteredPathVector = (FilteredPathVector)theEObject;
        T result = caseFilteredPathVector(filteredPathVector);
        if (result == null) result = casePathVectorElement(filteredPathVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PATH_VECTOR:
      {
        PathVector pathVector = (PathVector)theEObject;
        T result = casePathVector(pathVector);
        if (result == null) result = casePathVectorElement(pathVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.COMPOUND_PATH_VECTOR:
      {
        CompoundPathVector compoundPathVector = (CompoundPathVector)theEObject;
        T result = caseCompoundPathVector(compoundPathVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PREREQUISITE:
      {
        Prerequisite prerequisite = (Prerequisite)theEObject;
        T result = casePrerequisite(prerequisite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.WITH_CLAUSE:
      {
        WithClause withClause = (WithClause)theEObject;
        T result = caseWithClause(withClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PREREQUISITE_ENTRY:
      {
        PrerequisiteEntry prerequisiteEntry = (PrerequisiteEntry)theEObject;
        T result = casePrerequisiteEntry(prerequisiteEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.DIRECT_PART_REFEREMCE:
      {
        DirectPartReferemce directPartReferemce = (DirectPartReferemce)theEObject;
        T result = caseDirectPartReferemce(directPartReferemce);
        if (result == null) result = casePrerequisiteEntry(directPartReferemce);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CAPABILITY_REFERENCED_PART:
      {
        CapabilityReferencedPart capabilityReferencedPart = (CapabilityReferencedPart)theEObject;
        T result = caseCapabilityReferencedPart(capabilityReferencedPart);
        if (result == null) result = casePrerequisiteEntry(capabilityReferencedPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.COMPOUND_REFERENCES:
      {
        CompoundReferences compoundReferences = (CompoundReferences)theEObject;
        T result = caseCompoundReferences(compoundReferences);
        if (result == null) result = casePrerequisiteEntry(compoundReferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.BUILDER:
      {
        Builder builder = (Builder)theEObject;
        T result = caseBuilder(builder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PARAMETER_DECLARATION_LIST:
      {
        ParameterDeclarationList parameterDeclarationList = (ParameterDeclarationList)theEObject;
        T result = caseParameterDeclarationList(parameterDeclarationList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PARAMETER_DECLARATION:
      {
        ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
        T result = caseParameterDeclaration(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.BUILDER_OUTPUT:
      {
        BuilderOutput builderOutput = (BuilderOutput)theEObject;
        T result = caseBuilderOutput(builderOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.BUILDER_INPUT:
      {
        BuilderInput builderInput = (BuilderInput)theEObject;
        T result = caseBuilderInput(builderInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.REPOSITORY_CONFIGURATION:
      {
        RepositoryConfiguration repositoryConfiguration = (RepositoryConfiguration)theEObject;
        T result = caseRepositoryConfiguration(repositoryConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.REPOSITORY_DECLARATION:
      {
        RepositoryDeclaration repositoryDeclaration = (RepositoryDeclaration)theEObject;
        T result = caseRepositoryDeclaration(repositoryDeclaration);
        if (result == null) result = caseRepositoryConfiguration(repositoryDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.RESOLUTION_STRATEGY:
      {
        ResolutionStrategy resolutionStrategy = (ResolutionStrategy)theEObject;
        T result = caseResolutionStrategy(resolutionStrategy);
        if (result == null) result = caseRepositoryConfiguration(resolutionStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CONTAINER_CONFIGURATION:
      {
        ContainerConfiguration containerConfiguration = (ContainerConfiguration)theEObject;
        T result = caseContainerConfiguration(containerConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CONCERN:
      {
        Concern concern = (Concern)theEObject;
        T result = caseConcern(concern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CONCERN_BLOCK:
      {
        ConcernBlock concernBlock = (ConcernBlock)theEObject;
        T result = caseConcernBlock(concernBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.QUERY_PATH:
      {
        QueryPath queryPath = (QueryPath)theEObject;
        T result = caseQueryPath(queryPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.SELECTOR:
      {
        Selector selector = (Selector)theEObject;
        T result = caseSelector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.PRE_CONDITION:
      {
        PreCondition preCondition = (PreCondition)theEObject;
        T result = casePreCondition(preCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.POST_CONDITION:
      {
        PostCondition postCondition = (PostCondition)theEObject;
        T result = casePostCondition(postCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.ASSERTION_EXPRESSION:
      {
        AssertionExpression assertionExpression = (AssertionExpression)theEObject;
        T result = caseAssertionExpression(assertionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.CONTEXT_SELECTOR:
      {
        ContextSelector contextSelector = (ContextSelector)theEObject;
        T result = caseContextSelector(contextSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.EXPRESSION_SELECTOR:
      {
        ExpressionSelector expressionSelector = (ExpressionSelector)theEObject;
        T result = caseExpressionSelector(expressionSelector);
        if (result == null) result = caseContextSelector(expressionSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.UNIT_SELECTOR:
      {
        UnitSelector unitSelector = (UnitSelector)theEObject;
        T result = caseUnitSelector(unitSelector);
        if (result == null) result = caseContextSelector(unitSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.VERSION_RANGE:
      {
        VersionRange versionRange = (VersionRange)theEObject;
        T result = caseVersionRange(versionRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.COMPOUNDD_REFERENCES:
      {
        CompounddReferences compounddReferences = (CompounddReferences)theEObject;
        T result = caseCompounddReferences(compounddReferences);
        if (result == null) result = caseCompoundReferences(compounddReferences);
        if (result == null) result = casePrerequisiteEntry(compounddReferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BeeLangPackage.VARARG_PARAMETER_DECLARATION:
      {
        VarargParameterDeclaration varargParameterDeclaration = (VarargParameterDeclaration)theEObject;
        T result = caseVarargParameterDeclaration(varargParameterDeclaration);
        if (result == null) result = caseParameterDeclaration(varargParameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bee Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bee Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeeModel(BeeModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Build Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Build Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuildUnit(BuildUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedCapability(ProvidedCapability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredCapability(RequiredCapability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredCapability(FilteredCapability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapability(Capability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Property Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Property Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedPropertySet(NamedPropertySet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertySet(PropertySet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyOperation(PropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredPropertyOperation(FilteredPropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetPropertyOperation(SetPropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unset Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unset Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsetPropertyOperation(UnsetPropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSynchronization(Synchronization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathGroup(PathGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Vector Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Vector Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathVectorElement(PathVectorElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Path Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Path Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredPathVector(FilteredPathVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathVector(PathVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Path Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Path Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundPathVector(CompoundPathVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrerequisite(Prerequisite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>With Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>With Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithClause(WithClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prerequisite Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prerequisite Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrerequisiteEntry(PrerequisiteEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Part Referemce</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Part Referemce</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectPartReferemce(DirectPartReferemce object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability Referenced Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability Referenced Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapabilityReferencedPart(CapabilityReferencedPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundReferences(CompoundReferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilder(Builder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Declaration List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDeclarationList(ParameterDeclarationList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDeclaration(ParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builder Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builder Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilderOutput(BuilderOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builder Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builder Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilderInput(BuilderInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryConfiguration(RepositoryConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryDeclaration(RepositoryDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolution Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolution Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResolutionStrategy(ResolutionStrategy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerConfiguration(ContainerConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcern(Concern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concern Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concern Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcernBlock(ConcernBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryPath(QueryPath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelector(Selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreCondition(PreCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostCondition(PostCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertionExpression(AssertionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextSelector(ContextSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionSelector(ExpressionSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitSelector(UnitSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersionRange(VersionRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compoundd References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compoundd References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompounddReferences(CompounddReferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vararg Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vararg Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarargParameterDeclaration(VarargParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BeeLangSwitch
