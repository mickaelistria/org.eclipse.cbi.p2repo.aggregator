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

import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AggregatorResourceView;
import org.eclipse.b3.aggregator.impl.AggregatorResourceViewImpl;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
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
			AggregatorFactory.eINSTANCE.createCompositeChild()));
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection, int index) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createAddCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, collection, index);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Object value, int index, Collection<?> collection) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createCreateChildCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, value, index, collection);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createCreateCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return super.createDragAndDropCommand(
			domain, ((AggregatorResourceViewImpl) owner).getAggregatorResource(), location, operations, operation,
			collection);
	}

	@Override
	protected Command createInitializeCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createMoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value,
			int index) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createMoveCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, value, index);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createRemoveCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, collection);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createReplaceCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			EObject value, Collection<?> collection) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createReplaceCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, value, collection);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createSetCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, value);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value,
			int index) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			return super.createSetCommand(
				domain, (EObject) ((AggregatorResourceViewImpl) owner).getAggregator(),
				(EStructuralFeature) AggregatorPackage.Literals.AGGREGATOR__AGGREGATES, value, index);
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
		// we need to wrap CompositeChild objects so that they appear to be children of the AggregatorResource instance
		// that the object we adapt is a view of
		if(feature == AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW__AGGREGATES) {
			CompositeChildItemProvider compositeChildItemProvider = (CompositeChildItemProvider) getRootAdapterFactory().adapt(
				value, IEditingDomainItemProvider.class);

			return compositeChildItemProvider.new CompositeChildWrapperItemProvider(
				value, ((AggregatorResourceViewImpl) object).getAggregatorResource(), feature, index, adapterFactory);
		}
		return super.createWrapper(object, feature, value, index);
	}

	@Override
	public void fireNotifyChanged(Notification notification) {
		// send ViewerNotification targeted at AggregatorResourceViewImpl instances to the respective
		// AggregatorResource instances instead
		if(notification instanceof ViewerNotification) {
			ViewerNotification viewerNotification = (ViewerNotification) notification;
			Object element = viewerNotification.getElement();

			if(element instanceof AggregatorResourceViewImpl)
				notification = new ViewerNotification(
					viewerNotification, ((AggregatorResourceViewImpl) element).getAggregatorResource());
		}
		super.fireNotifyChanged(notification);
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

	@Override
	protected boolean isWrappingNeeded(Object object) {
		// we need to set this to true since we are wrapping the CompositeChild objects
		// so that they appear to be children of the AggregatorResource instance
		// that the object we adapt is a view of
		return true;
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

}
