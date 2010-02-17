/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.legacy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.util.ITransformer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Transforms scrResource to trgtResource using the same node, attribute and reference names.
 * Extend this class if there is a need for a special handling.
 * 
 * @author Karel Brezina
 */
public class ResourceTransformer implements ITransformer {
	protected static Object getFeatureValue(EObject eobject, String featureName) {
		EStructuralFeature feature = eobject.eClass().getEStructuralFeature(featureName);

		if(feature == null)
			throw new IllegalArgumentException(featureName + " is not a valid feature name of "
					+ eobject.eClass().getName() + " EClass");

		return eobject.eGet(feature);
	}

	protected Resource srcResource;

	protected Resource trgtResource;

	protected EPackage trgtPackage;

	protected EFactory trgtPackageFactory;

	protected Map<EObject, EObject> transformationMapping = new HashMap<EObject, EObject>();

	public void initTransformer(Resource srcResource, Resource trgtResource, EPackage trgtPackage) {
		this.srcResource = srcResource;
		this.trgtResource = trgtResource;
		this.trgtPackage = trgtPackage;

		trgtPackageFactory = trgtPackage.getEFactoryInstance();
	}

	/**
	 * Starts transformation
	 */
	public void startTransformation() {
		for(EObject srcEObject : srcResource.getContents())
			transform(srcEObject, new TreePath(trgtResource));

		for(EObject srcEObject : srcResource.getContents())
			transformRef(srcEObject);
	}

	protected void copyAttributes(EObject srcEObject, EObject trgtEObject) {
		for(EAttribute srcEAttr : srcEObject.eClass().getEAllAttributes()) {
			Object srcEAttrValue = srcEObject.eGet(srcEAttr);

			if(srcEAttrValue == null)
				continue;

			EAttribute trgtEAttr = (EAttribute) trgtEObject.eClass().getEStructuralFeature(srcEAttr.getName());

			if(trgtEAttr == null)
				continue;
			// throw new IllegalArgumentException(srcEObject.eClass().getName() + "." + srcEAttr.getName()
			// + " is not a valid EAttribute in the target model");

			trgtEObject.eSet(trgtEAttr, srcEAttrValue);
		}
	}

	protected Object createTrgtEEnumLiteral(String enumName, String literal) {
		EDataType trgtEDataType = (EDataType) trgtPackage.getEClassifier(enumName);

		if(enumName == null)
			throw new IllegalArgumentException(enumName + " is not a valid EEnum in the target model");

		Object enumerator = trgtPackageFactory.createFromString(trgtEDataType, literal);

		if(enumerator == null)
			throw new IllegalArgumentException(literal + " is not a valid literal for EEnum " + enumName
					+ " in the target model");

		return enumerator;
	}

	protected EObject createTrgtEObject(String className, EObject mappedFromSrcEObject) {
		EClass trgtEClass = (EClass) trgtPackage.getEClassifier(className);

		if(trgtEClass == null)
			throw new IllegalArgumentException(className + " is not a valid EClass in the target model");

		EObject trgtEObject = trgtPackageFactory.create(trgtEClass);

		if(mappedFromSrcEObject != null)
			transformationMapping.put(mappedFromSrcEObject, trgtEObject);

		return trgtEObject;
	}

	protected Object getValue(EObject eobject, String featureName) {
		EStructuralFeature feature = eobject.eClass().getEStructuralFeature(featureName);

		if(feature == null)
			throw new IllegalArgumentException(featureName + " is not a valid feature in " + eobject.eClass().getName()
					+ " EClass");

		return eobject.eGet(feature);
	}

	/**
	 * Transforms srcEObject
	 * 
	 * @param srcEObject
	 * @param trgtParentTreePath
	 *            tree path in the target structure
	 */
	@SuppressWarnings("unchecked")
	protected void transform(EObject srcEObject, TreePath trgtParentTreePath) {
		EClass scrEClass = srcEObject.eClass();
		EObject trgtEObject = createTrgtEObject(scrEClass.getName(), srcEObject);

		trgtParentTreePath.addToLastSegmentContainer(trgtEObject);

		copyAttributes(srcEObject, trgtEObject);

		for(EReference srcERef : scrEClass.getEAllContainments()) {
			Object srcERefValue = srcEObject.eGet(srcERef);

			if(srcERefValue == null)
				continue;

			EReference trgtERef = (EReference) trgtEObject.eClass().getEStructuralFeature(srcERef.getName());

			if(trgtERef == null)
				continue;
			// throw new IllegalArgumentException(srcEObject.eClass().getName() + "." + srcERef.getName()
			// + " is not a valid EReference in the target model");

			TreePath trgtTreePath = trgtParentTreePath.createChildTreePath(trgtEObject, trgtERef);

			if(!srcERef.isMany())
				transform((EObject) srcERefValue, trgtTreePath);
			else
				for(EObject srcChild : (List<EObject>) srcERefValue)
					transform(srcChild, trgtTreePath);
		}
	}

	/**
	 * Transforms references in srcEObject
	 * 
	 * @param srcEObject
	 */
	@SuppressWarnings("unchecked")
	protected void transformRef(EObject srcEObject) {
		EClass scrEClass = srcEObject.eClass();

		EObject trgtEObject = transformationMapping.get(srcEObject);

		if(trgtEObject != null) {
			EClass trgtEClass = trgtEObject.eClass();

			for(EReference srcERef : scrEClass.getEAllReferences()) {
				if(scrEClass.getEAllContainments().contains(srcERef))
					continue;

				Object srcERefValue = srcEObject.eGet(srcERef);

				if(srcERefValue == null)
					continue;

				EReference trgtERef = (EReference) trgtEClass.getEStructuralFeature(srcERef.getName());

				if(trgtERef == null)
					continue;
				// throw new IllegalArgumentException(srcEObject.eClass().getName() + "." + srcERef.getName()
				// + " is not a valid EReference in the target model");

				if(!trgtERef.isMany())
					trgtEObject.eSet(trgtERef, transformationMapping.get(srcERefValue));
				else if(srcERefValue instanceof List<?>) {
					List<EObject> trgtRefList = (List<EObject>) trgtEObject.eGet(trgtERef);

					for(EObject srcChild : (List<EObject>) srcERefValue)
						trgtRefList.add(transformationMapping.get(srcChild));
				}
			}
		}

		for(EReference srcERef : scrEClass.getEAllContainments()) {
			Object srcERefValue = srcEObject.eGet(srcERef);

			if(srcERefValue == null)
				continue;

			if(!srcERef.isMany())
				transformRef((EObject) srcERefValue);
			else
				for(EObject srcChild : (List<EObject>) srcERefValue)
					transformRef(srcChild);
		}
	}
}
