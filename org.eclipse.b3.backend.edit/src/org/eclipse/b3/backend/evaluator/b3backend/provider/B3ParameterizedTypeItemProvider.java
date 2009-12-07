/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class B3ParameterizedTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3ParameterizedTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRawTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Raw Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRawTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_B3ParameterizedType_rawType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_B3ParameterizedType_rawType_feature", "_UI_B3ParameterizedType_type"),
				 B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__RAW_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE);
			childrenFeatures.add(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns B3ParameterizedType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/B3ParameterizedType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_B3ParameterizedType_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(B3ParameterizedType.class)) {
			case B3backendPackage.B3_PARAMETERIZED_TYPE__OWNER_TYPE:
			case B3backendPackage.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE,
				 B3backendFactory.eINSTANCE.createB3FunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE,
				 B3backendFactory.eINSTANCE.createB3ParameterizedType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE,
				 B3backendFactory.eINSTANCE.createB3WildcardType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE,
				 B3backendFactory.eINSTANCE.createB3FuncTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE,
				 B3backendFactory.eINSTANCE.createB3JavaImport()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST,
				 B3backendFactory.eINSTANCE.createB3FunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST,
				 B3backendFactory.eINSTANCE.createB3ParameterizedType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST,
				 B3backendFactory.eINSTANCE.createB3WildcardType()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST,
				 B3backendFactory.eINSTANCE.createB3FuncTypeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST,
				 B3backendFactory.eINSTANCE.createB3JavaImport()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__OWNER_TYPE ||
			childFeature == B3backendPackage.Literals.B3_PARAMETERIZED_TYPE__ACTUAL_ARGUMENTS_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return B3BackendEditPlugin.INSTANCE;
	}

}
