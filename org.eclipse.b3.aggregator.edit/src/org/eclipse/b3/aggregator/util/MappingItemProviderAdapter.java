/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AttributeValueWrapperItemProvider;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.emf.edit.provider.FeatureMapEntryWrapperItemProvider;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * @author michal.ruzicka@cloudsmith.com
 * 
 */
public class MappingItemProviderAdapter extends ItemProviderAdapter {

	public interface MappedEObjectAccessor {
		EObject getMappedObject(Object mappingObject);
	}

	protected Map<EStructuralFeature, MappedEObjectAccessor> mappedChildrenFeaturesMap;

	public MappingItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		for(EStructuralFeature mappedChildFeature : getMappedChildrenFeatures(object).keySet()) {
			newChildDescriptors.add(createChildParameter(
				mappedChildFeature, EcoreUtil.create(mappedChildFeature.getEContainingClass())));
		}
	}

	protected Object createWrapper(Object object, EStructuralFeature feature, Object value, int index) {
		if(!isWrappingNeeded(object))
			return value;

		if(getMappedChildrenFeatures(object).containsKey(feature)) {
			value = new DelegatingWrapperItemProvider(value, object, feature, index, adapterFactory);
		}
		else if(FeatureMapUtil.isFeatureMap(feature)) {
			value = new FeatureMapEntryWrapperItemProvider(
				(FeatureMap.Entry) value, (EObject) object, (EAttribute) feature, index, adapterFactory,
				getResourceLocator());
		}
		else if(feature instanceof EAttribute) {
			value = new AttributeValueWrapperItemProvider(
				value, (EObject) object, (EAttribute) feature, index, adapterFactory, getResourceLocator());
		}
		else if(!((EReference) feature).isContainment() || getMappedChildrenFeatures(object).containsKey(feature)) {
			value = new DelegatingWrapperItemProvider(value, object, feature, index, adapterFactory);
		}

		return value;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		ChildrenStore store = getChildrenStore(object);
		if(store != null) {
			return store.getChildren();
		}

		store = createChildrenStore(object);
		List<Object> result = store != null
				? null
				: new ArrayList<Object>();

		for(EStructuralFeature feature : getChildrenFeatures(object)) {
			if(feature.isMany()) {
				List<?> children = (List<?>) getFeatureValue(object, feature);
				int index = 0;
				for(Object unwrappedChild : children) {
					Object child = wrap(object, feature, unwrappedChild, index);
					if(store != null) {
						store.getList(feature).add(child);
					}
					else {
						result.add(child);
					}
					index++;
				}
			}
			else {
				Object child = getFeatureValue(object, feature);
				if(child != null) {
					child = wrap(object, feature, child, CommandParameter.NO_INDEX);
					if(store != null) {
						store.setValue(feature, child);
					}
					else {
						result.add(child);
					}
				}
			}
		}
		return store != null
				? store.getChildren()
				: result;
	}

	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if(childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.addAll(getMappedChildrenFeatures(object).keySet());
		}
		return childrenFeatures;
	}

	protected Object getFeatureValue(Object object, EStructuralFeature childFeature) {
		MappedEObjectAccessor accessor = getMappedChildrenFeatures(childFeature).get(childFeature);
		EObject eObject = accessor != null
				? accessor.getMappedObject(object)
				: (EObject) object;
		return getFeatureValue(eObject, childFeature);
	}

	public Map<? extends EStructuralFeature, ? extends MappedEObjectAccessor> getMappedChildrenFeatures(Object object) {
		if(mappedChildrenFeaturesMap == null) {
			mappedChildrenFeaturesMap = new LinkedHashMap<EStructuralFeature, MappedEObjectAccessor>();
		}
		return mappedChildrenFeaturesMap;
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain, Object sibling) {
		// Build the collection of new child descriptors.
		//
		Collection<Object> newChildDescriptors = new ArrayList<Object>();
		collectNewChildDescriptors(newChildDescriptors, object);

		// Add child descriptors contributed by extenders.
		//
		if(adapterFactory instanceof IChildCreationExtender) {
			newChildDescriptors.addAll(((IChildCreationExtender) adapterFactory).getNewChildDescriptors(
				object, editingDomain));
		}

		// If a sibling has been specified, add the best index possible to each CommandParameter.
		//
		if(sibling != null) {
			sibling = unwrap(sibling);

			// Find the index of a feature containing the sibling, or an equivalent value, in the collection of children
			// features.
			//
			Collection<? extends EStructuralFeature> childrenFeatures = getChildrenFeatures(object);
			int siblingFeatureIndex = -1;
			int i = 0;

			FEATURES_LOOP: for(EStructuralFeature feature : childrenFeatures) {
				Object featureValue = getFeatureValue(object, feature);
				if(feature.isMany()) {
					for(Object value : (Collection<?>) featureValue) {
						if(isEquivalentValue(sibling, value)) {
							siblingFeatureIndex = i;
							break FEATURES_LOOP;
						}
					}
				}
				else if(isEquivalentValue(sibling, featureValue)) {
					siblingFeatureIndex = i;
					break FEATURES_LOOP;
				}
				++i;
			}

			// For each CommandParameter with a non-null, multi-valued structural feature...
			//
			DESCRIPTORS_LOOP: for(Object descriptor : newChildDescriptors) {
				if(descriptor instanceof CommandParameter) {
					CommandParameter parameter = (CommandParameter) descriptor;
					EStructuralFeature childFeature = parameter.getEStructuralFeature();
					if(childFeature == null || !childFeature.isMany()) {
						continue DESCRIPTORS_LOOP;
					}

					// Look for the sibling value or an equivalent in the new child's feature. If it is found, the child should
					// immediately follow it.
					//
					i = 0;
					for(Object v : (Collection<?>) getFeatureValue(object, childFeature)) {
						if(isEquivalentValue(sibling, v)) {
							parameter.index = i + 1;
							continue DESCRIPTORS_LOOP;
						}
						++i;
					}

					// Otherwise, if a sibling feature was found, iterate through the children features to find the index of
					// the child feature...
					//
					if(siblingFeatureIndex != -1) {
						i = 0;
						for(EStructuralFeature feature : childrenFeatures) {
							if(feature == childFeature) {
								// If the child feature follows the sibling feature, the child should be first in its feature.
								//
								if(i > siblingFeatureIndex) {
									parameter.index = 0;
								}
								continue DESCRIPTORS_LOOP;
							}
							++i;
						}
					}
				}
			}
		}
		return newChildDescriptors;
	}

	@Override
	protected boolean hasChildren(Object object, boolean optimized) {
		if(!optimized)
			return !getChildren(object).isEmpty();

		for(EStructuralFeature feature : getChildrenFeatures(object)) {
			if(feature.isMany()) {
				List<?> children = (List<?>) getFeatureValue(object, feature);
				if(!children.isEmpty()) {
					return true;
				}
			}
			else if(getFeatureValue(object, feature) != null) {
				return true;
			}
		}

		return false;
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		if(wrappingNeeded == null) {
			if(getMappedChildrenFeatures(object).isEmpty()) {
				wrappingNeeded = Boolean.FALSE;

				for(EStructuralFeature f : getChildrenFeatures(object)) {
					if(f instanceof EAttribute) {
						wrappingNeeded = Boolean.TRUE;
					}
				}
			}
			else
				wrappingNeeded = Boolean.TRUE;
		}
		return wrappingNeeded;
	}

	@Override
	public void setTarget(Notifier target) {
		super.setTarget(target);
		// listen to notifications of changes in the mapped objects
		if(target != null) {
			for(MappedEObjectAccessor mappedObjectAccessor : getMappedChildrenFeatures(target).values()) {
				mappedObjectAccessor.getMappedObject(target).eAdapters().add(this);
			}
		}
	}

	@Override
	public void unsetTarget(Notifier target) {
		super.unsetTarget(target);
		// stop listening to notifications of changes in the mapped objects
		if(target != null) {
			for(MappedEObjectAccessor mappedObjectAccessor : getMappedChildrenFeatures(target).values()) {
				mappedObjectAccessor.getMappedObject(target).eAdapters().remove(this);
			}
		}
	}

	protected Object wrap(Object object, EStructuralFeature feature, Object value, int index) {
		if(!feature.isMany() && index != CommandParameter.NO_INDEX) {
			System.out.println("Bad wrap index.");
			System.out.println("  object: " + object);
			System.out.println("  feature: " + feature);
			System.out.println("  value: " + value);
			System.out.println("  index: " + index);
			(new IllegalArgumentException("Bad wrap index.")).printStackTrace();
		}

		Object wrapper = createWrapper(object, feature, value, index);
		if(wrapper == null) {
			wrapper = value;
		}
		else if(wrapper != value) {
			if(wrappers == null) {
				wrappers = new Disposable();
			}
			wrappers.add(wrapper);
		}
		return wrapper;
	}

}
