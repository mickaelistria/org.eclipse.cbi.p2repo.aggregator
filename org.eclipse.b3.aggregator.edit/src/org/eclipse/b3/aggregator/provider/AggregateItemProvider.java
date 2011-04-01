/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.b3.aggregator.Aggregate;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.impl.AggregateImpl;
import org.eclipse.b3.aggregator.util.NotificationForwardingAdapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.Aggregate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AggregateItemProvider extends AggregatorItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DescriptionProvider_description_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_DescriptionProvider_description_feature",
				"_UI_DescriptionProvider_type"), AggregatorPackage.Literals.DESCRIPTION_PROVIDER__DESCRIPTION, true,
			true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_EnabledStatusProvider_enabled_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_EnabledStatusProvider_enabled_feature",
				"_UI_EnabledStatusProvider_type"), AggregatorPackage.Literals.ENABLED_STATUS_PROVIDER__ENABLED, true,
			false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Aggregate_label_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregate_label_feature", "_UI_Aggregate_type"),
			AggregatorPackage.Literals.AGGREGATE__LABEL, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	public Collection<?> getChildren(Object object) {

		return ((AggregateImpl) object).getContributionViews();
	}

	/**
	 * This returns Aggregate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aggregate"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.aggregator.provider.AggregatorItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		Object parent = super.getParent(object);

		if(parent instanceof EObject) {
			EStructuralFeature containingFeature = ((EObject) object).eContainingFeature();

			for(Adapter adapter : ((EObject) parent).eAdapters()) {
				if(adapter instanceof NotificationForwardingAdapter) {
					NotificationForwardingAdapter notificationForwardingAdapter = (NotificationForwardingAdapter) adapter;
					Collection<EStructuralFeature> forwardedFeatures = notificationForwardingAdapter.getForwardedFeatures();

					if(forwardedFeatures == null || forwardedFeatures.contains(containingFeature))
						return notificationForwardingAdapter.getForwardingTarget();
				}
			}
		}

		return parent;
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if(itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEnabledPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AggregatorEditPlugin.INSTANCE;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Aggregate) object).getLabel();
		return label == null || label.length() == 0
				? getString("_UI_Aggregate_type")
				: getString("_UI_Aggregate_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(Aggregate.class)) {
			case AggregatorPackage.AGGREGATE__ENABLED:
			case AggregatorPackage.AGGREGATE__DESCRIPTION:
			case AggregatorPackage.AGGREGATE__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

}
