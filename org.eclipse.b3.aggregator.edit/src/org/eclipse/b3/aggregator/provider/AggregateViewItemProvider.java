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

import org.eclipse.b3.aggregator.AggregateView;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.impl.AggregateViewImpl;
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
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.AggregateView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AggregateViewItemProvider extends AggregatorItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateViewItemProvider(AdapterFactory adapterFactory) {
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
			AggregatorPackage.Literals.AGGREGATE_VIEW__CONTRIBUTIONS, AggregatorFactory.eINSTANCE.createContribution()));
	}

	// @Override
	// protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
	// // we need to wrap Contribution objects so that they appear to be children of the Aggregate instance
	// // that the object we adapt is a view of
	// if(feature == AggregatorPackage.Literals.AGGREGATE_VIEW__CONTRIBUTIONS)
	// return new DelegatingWrapperItemProvider(
	// value, ((AggregateViewImpl) object).getAggregate(), feature, index, adapterFactory);
	// return super.createWrapper(object, feature, value, index);
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection, int index) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return super.createCopyCommand(domain, (EObject) ((AggregateViewImpl) owner).getAggregate(), helper);
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Object value, int index, Collection<?> collection) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createCreateCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return super.createCreateCopyCommand(domain, (EObject) ((AggregateViewImpl) owner).getAggregate(), helper);
	}

	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return super.createDragAndDropCommand(
			domain, ((AggregateViewImpl) owner).getAggregate(), location, operations, operation, collection);
	}

	@Override
	protected Command createInitializeCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		return super.createInitializeCopyCommand(domain, (EObject) ((AggregateViewImpl) owner).getAggregate(), helper);
	}

	@Override
	protected Command createMoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value,
			int index) {
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection) {
		// TODO create unlink command
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value,
			int index) {
		return super.createSetCommand(domain, owner, feature, value, index);
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
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATE_VIEW__CONTRIBUTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns AggregateView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AggregateView"));
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
		return getString("_UI_AggregateView_type");
	}

	// @Override
	// protected boolean isWrappingNeeded(Object object) {
	// // we need to set this to true since we are wrapping the Contribution objects
	// // so that they appear to be children of the Aggregate instance that the object
	// // we adapt is a view of
	// return true;
	// }

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

		switch(notification.getFeatureID(AggregateView.class)) {
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

}
