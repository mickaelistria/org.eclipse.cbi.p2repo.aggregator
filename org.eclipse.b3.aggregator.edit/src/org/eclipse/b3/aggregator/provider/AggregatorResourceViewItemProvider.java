/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AggregatorResourceView;
import org.eclipse.b3.aggregator.impl.AggregatorResourceViewImpl;
import org.eclipse.b3.aggregator.util.NotificationForwardingAdapter;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.AggregatorResourceView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AggregatorResourceViewItemProvider extends AggregatorItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource, IItemColorProvider, IItemFontProvider {

	protected class ViewerRefreshForwardingAdapter extends NotificationForwardingAdapter {

		public ViewerRefreshForwardingAdapter(Object forwardingTarget) {
			super(
				forwardingTarget, AggregatorPackage.Literals.AGGREGATOR,
				Collections.singleton((EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES));
		}

		@Override
		protected void forwardNotification(Notification notification) {
			fireNotifyChanged(new ViewerNotification(notification, getForwardingTarget(), true, false));
		}

	}

	protected ViewerRefreshForwardingAdapter viewerRefreshForwarder;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregatorResourceViewItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES,
			AggregatorFactory.eINSTANCE.createAggregate()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value) {
		// disable unsetting/deletion of the Aggregator node
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR)
			return UnexecutableCommand.INSTANCE;
		return super.createSetCommand(domain, owner, feature, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if(childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES);
		}
		return childrenFeatures;
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
		return getString("_UI_AggregatorResourceView_type");
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

		switch(notification.getFeatureID(AggregatorResourceView.class)) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	public void setTarget(Notifier target) {
		if(target != null) {
			if(getTarget() != null)
				throw new IllegalStateException();

			super.setTarget(target);

			viewerRefreshForwarder = new ViewerRefreshForwardingAdapter(
				((AggregatorResourceViewImpl) target).getAggregatorResource());

			((Notifier) ((AggregatorResourceView) target).getAggregator()).eAdapters().add(viewerRefreshForwarder);
		}
		else {
			if(getTarget() == null)
				throw new IllegalStateException();

			target = getTarget();

			((Notifier) ((AggregatorResourceView) target).getAggregator()).eAdapters().remove(viewerRefreshForwarder);

			viewerRefreshForwarder = null;

			super.setTarget(null);
		}
	}
}
