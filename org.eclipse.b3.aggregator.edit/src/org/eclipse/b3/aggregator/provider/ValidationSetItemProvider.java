/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.b3.aggregator.impl.ValidationSetImpl;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.ValidationSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValidationSetItemProvider extends AggregatorItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {

	public class ValidationSetWrapperItemProvider extends DelegatingWrapperItemProvider {

		public ValidationSetWrapperItemProvider(Object value, Object owner, EStructuralFeature feature, int index,
				AdapterFactory adapterFactory) {
			super(value, owner, feature, index, adapterFactory);
		}

		@Override
		public Command createCommand(Object object, EditingDomain domain, Class<? extends Command> commandClass,
				CommandParameter commandParameter) {
			CREATE_CUSTOM_COMMAND: {
				if(commandClass == SetCommand.class) {
					if(commandParameter.getEStructuralFeature() != null)
						break CREATE_CUSTOM_COMMAND;

					List<?> valueList;
					Object setValue = commandParameter.getValue();
					if(setValue instanceof Collection) {
						Collection<?> collection = (Collection<?>) setValue;
						if(collection.isEmpty())
							break CREATE_CUSTOM_COMMAND;
						valueList = new ArrayList<Object>(collection);
					}
					else
						break CREATE_CUSTOM_COMMAND;

					CompoundCommand compoundCommand = createCompoundLinkCommand(domain, valueList, getDelegateValue());

					if(compoundCommand.isEmpty()) {
						compoundCommand.dispose();
						break CREATE_CUSTOM_COMMAND;
					}

					if(!valueList.isEmpty()) {
						compoundCommand.dispose();
						return UnexecutableCommand.INSTANCE;
					}

					return compoundCommand.unwrap();
				}
				else if(commandClass == RemoveCommand.class) {
					Collection<?> collection = commandParameter.getCollection();
					if(collection == null || collection.isEmpty())
						break CREATE_CUSTOM_COMMAND;

					List<?> valueList = new ArrayList<Object>(collection);

					CompoundCommand compoundCommand = createCompoundLinkCommand(
						domain, valueList, SetCommand.UNSET_VALUE);

					if(!valueList.isEmpty()) {
						commandParameter.collection = valueList;
						compoundCommand.append(super.createCommand(object, domain, commandClass, commandParameter));
					}

					return compoundCommand.unwrap();
				}
			}

			return super.createCommand(object, domain, commandClass, commandParameter);
		}

		public CompoundCommand createCompoundLinkCommand(EditingDomain domain, List<?> valueList, Object linkReceiver) {
			CompoundCommand compoundCommand = new CompoundCommand(CompoundCommand.MERGE_COMMAND_ALL);
			Object realLinkReceiver = unwrap(linkReceiver);

			for(Iterator<?> valueIterator = valueList.iterator(); valueIterator.hasNext();) {
				Object value = valueIterator.next();
				Object unwrappedValue = unwrap(value);

				if(unwrappedValue instanceof LinkSource) {
					if(((EObject) unwrappedValue).eGet(AggregatorPackage.Literals.LINK_SOURCE__RECEIVER) != realLinkReceiver)
						compoundCommand.append(new SetCommand(
							domain, (EObject) unwrappedValue, AggregatorPackage.Literals.LINK_SOURCE__RECEIVER,
							realLinkReceiver));
					else
						compoundCommand.append(UnexecutableCommand.INSTANCE); // disable linking to where the LinkSource is already linked

					valueIterator.remove();
				}
			}

			return compoundCommand;
		}

		@Override
		protected IWrapperItemProvider createWrapper(Object value, Object owner, AdapterFactory adapterFactory) {
			Object unwrappedValue = unwrap(value);

			if(unwrappedValue instanceof Contribution) {
				ContributionItemProvider contributionItemProvider = (ContributionItemProvider) getRootAdapterFactory().adapt(
					unwrappedValue, IEditingDomainItemProvider.class);

				return contributionItemProvider.new ContributionWrapperItemProvider(
					value, owner, null, CommandParameter.NO_INDEX, adapterFactory);
			}
			return super.createWrapper(value, owner, adapterFactory);
		}

	}

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationSetItemProvider(AdapterFactory adapterFactory) {
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
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_ValidationSet_label_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_ValidationSet_label_feature", "_UI_ValidationSet_type"),
			AggregatorPackage.Literals.VALIDATION_SET__LABEL, true, false, false,
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

	/**
	 * {@inheritDoc} <br />
	 * Please note that {@link ValidationSetItemProvider this} class can't handle all the children returned by this
	 * method but {@link ValidationSetWrapperItemProvider} can.
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		@SuppressWarnings("unchecked")
		Collection<Object> children = (Collection<Object>) super.getChildren(object);

		children.addAll(((ValidationSetImpl) object).getLinkedContributions());

		return children;
	}

	/**
	 * This returns ValidationSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
			object, getResourceLocator().getImage("full/obj16/ValidationSet" + (((ValidationSet) object).isEnabled()
					? ""
					: "Disabled")));
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
		String label = ((ValidationSet) object).getLabel();
		return label == null || label.length() == 0
				? getString("_UI_ValidationSet_type")
				: getString("_UI_ValidationSet_type") + " " + label;
	}

	/**
	 * This handles notifications sent by the validationSet object instances when other objects are
	 * linked to/unlinked from it.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		if(notification.getFeatureID(AggregatorPackage.class) == AggregatorPackage.VALIDATION_SET) {
			updateChildren(notification);

			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}

		notifyChangedGen(notification);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(ValidationSet.class)) {
			case AggregatorPackage.VALIDATION_SET__ENABLED:
			case AggregatorPackage.VALIDATION_SET__DESCRIPTION:
			case AggregatorPackage.VALIDATION_SET__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

}
