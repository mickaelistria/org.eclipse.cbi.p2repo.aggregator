/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.CompositeChild;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MavenMapping;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.util.FilteringCollection;
import org.eclipse.b3.aggregator.util.ResourceUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.Aggregator} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AggregatorItemProvider extends DescriptionProviderItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Buildmaster feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBuildmasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Aggregator_buildmaster_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_buildmaster_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__BUILDMASTER, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Build Root feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBuildRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Aggregator_buildRoot_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_buildRoot_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__BUILD_ROOT, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Aggregator_label_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_label_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__LABEL, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Maven Mappings feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMavenMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Aggregator_mavenMappings_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Aggregator_mavenMappings_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__MAVEN_MAPPINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Maven Result feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMavenResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Aggregator_mavenResult_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_mavenResult_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__MAVEN_RESULT, true, false, false,
			ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Packed Strategy feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPackedStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_Aggregator_packedStrategy_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_Aggregator_packedStrategy_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__PACKED_STRATEGY, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sendmail feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSendmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Aggregator_sendmail_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_sendmail_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__SENDMAIL, true, false, false,
			ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
			getString("_UI_Aggregator_type_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_Aggregator_type_feature", "_UI_Aggregator_type"),
			AggregatorPackage.Literals.AGGREGATOR__TYPE, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(new FilteringCollection<Object>() {
			@Override
			public boolean add(Object e) {
				if(e instanceof CommandParameter) {
					Object newChildValue = ((CommandParameter) e).getValue();

					// filter these out
					if(newChildValue instanceof CompositeChild || newChildValue instanceof MappedRepository)
						return false;
				}
				return super.add(e);
			}
		}.setDelegate(newChildDescriptors), object);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void collectNewChildDescriptorsGen(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__COMPOSITE_CHILDS, AggregatorFactory.eINSTANCE.createCompositeChild()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__CONFIGURATIONS, AggregatorFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__CONTRIBUTIONS, AggregatorFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__CUSTOM_CATEGORIES,
			AggregatorFactory.eINSTANCE.createCustomCategory()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__CONTACTS, AggregatorFactory.eINSTANCE.createContact()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__VALIDATION_REPOSITORIES,
			AggregatorFactory.eINSTANCE.createMetadataRepositoryReference()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__VALIDATION_REPOSITORIES,
			AggregatorFactory.eINSTANCE.createMappedRepository()));

		newChildDescriptors.add(createChildParameter(
			AggregatorPackage.Literals.AGGREGATOR__MAVEN_MAPPINGS, AggregatorFactory.eINSTANCE.createMavenMapping()));
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
			Collection<?> collection, int index) {
		if(feature == AggregatorPackage.Literals.AGGREGATOR__VALIDATION_REPOSITORIES) {
			// disable drag & drop of Mapped Repositories to Aggregator's validation repositories list;
			// although - given the class hierarchy - this should be theoretically possible in reality
			// it isn't as the code in MappedRepositoryImpl expects its container to be a "Contribution"
			for(Object object : collection) {
				if(unwrap(object) instanceof MappedRepository)
					return UnexecutableCommand.INSTANCE;
			}
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
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

				CompoundCommand compoundCommand = createCompoundLinkCommand(domain, valueList);

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
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	}

	public CompoundCommand createCompoundLinkCommand(EditingDomain domain, List<?> valueList) {
		CompoundCommand compoundCommand = new CompoundCommand(CompoundCommand.MERGE_COMMAND_ALL);

		for(Iterator<?> valueIterator = valueList.iterator(); valueIterator.hasNext();) {
			Object value = valueIterator.next();
			Object unwrappedValue = unwrap(value);

			// only allow linking of objects parented by some other objects then their natural parents
			if(unwrappedValue instanceof LinkSource && getObjectParent(value) != getObjectParent(unwrappedValue)) {
				compoundCommand.append(new SetCommand(
					domain, (EObject) unwrappedValue, AggregatorPackage.Literals.LINK_SOURCE__RECEIVER,
					SetCommand.UNSET_VALUE));
				valueIterator.remove();
			}
		}

		return compoundCommand;
	}

	@Override
	protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
		Object unwrappedValue = unwrap(value);

		if(unwrappedValue instanceof Contribution) {
			ContributionItemProvider contributionItemProvider = (ContributionItemProvider) getRootAdapterFactory().adapt(
				unwrappedValue, IEditingDomainItemProvider.class);

			return contributionItemProvider.new HidingContributionWrapperItemProvider(
				value, object, feature, index, adapterFactory);
		}
		return super.createWrapper(object, feature, value, index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if(childrenFeatures == null) {
			getChildrenFeaturesGen(object);
			childrenFeatures.remove(AggregatorPackage.Literals.AGGREGATOR__COMPOSITE_CHILDS);
		}
		return childrenFeatures;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Collection<? extends EStructuralFeature> getChildrenFeaturesGen(Object object) {
		if(childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__COMPOSITE_CHILDS);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__CONFIGURATIONS);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__CONTRIBUTIONS);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__CUSTOM_CATEGORIES);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__CONTACTS);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__VALIDATION_REPOSITORIES);
			childrenFeatures.add(AggregatorPackage.Literals.AGGREGATOR__MAVEN_MAPPINGS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns Aggregator.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aggregator"));
	}

	public Object getObjectParent(Object object) {
		IEditingDomainItemProvider objectItemProvider = (IEditingDomainItemProvider) getRootAdapterFactory().adapt(
			object, IEditingDomainItemProvider.class);

		return objectItemProvider.getParent(object);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if(itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBuildmasterPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addBuildRootPropertyDescriptor(object);
			addPackedStrategyPropertyDescriptor(object);
			addSendmailPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addMavenResultPropertyDescriptor(object);
			addMavenMappingsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Aggregator) object).getLabel();
		return label == null || label.length() == 0
				? getString("_UI_Aggregator_type")
				: getString("_UI_Aggregator_type") + " " + label;
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		// we need to set this to true since we are wrapping the Contribution objects
		// so that they can be collapsed when linked to an CompositeChild
		return true;
	}

	@Override
	public void notifyChanged(Notification notification) {
		notifyChangedGen(notification);

		if(notification.getEventType() == Notification.REMOVE) {
			Object oldV = notification.getOldValue();
			if(oldV instanceof Contribution || oldV instanceof MetadataRepositoryReference)
				ResourceUtils.cleanUpResources((Aggregator) notification.getNotifier());
			if(oldV instanceof MetadataRepositoryReference || oldV instanceof MavenMapping)
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
		}
		else if(notification.getEventType() == Notification.ADD) {
			Object newV = notification.getNewValue();
			if(newV instanceof Contribution) {
				for(MappedRepository mappedRepository : ((Contribution) newV).getRepositories(true))
					ResourceUtils.loadResourceForMappedRepository(mappedRepository);
			}
			else if(newV instanceof MetadataRepositoryReference) {
				ResourceUtils.loadResourceForMappedRepository((MetadataRepositoryReference) newV);
			}

			if(newV instanceof MetadataRepositoryReference || newV instanceof MavenMapping)
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
		}
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(Aggregator.class)) {
			case AggregatorPackage.AGGREGATOR__BUILDMASTER:
			case AggregatorPackage.AGGREGATOR__LABEL:
			case AggregatorPackage.AGGREGATOR__BUILD_ROOT:
			case AggregatorPackage.AGGREGATOR__PACKED_STRATEGY:
			case AggregatorPackage.AGGREGATOR__SENDMAIL:
			case AggregatorPackage.AGGREGATOR__TYPE:
			case AggregatorPackage.AGGREGATOR__MAVEN_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AggregatorPackage.AGGREGATOR__COMPOSITE_CHILDS:
			case AggregatorPackage.AGGREGATOR__CONFIGURATIONS:
			case AggregatorPackage.AGGREGATOR__CONTRIBUTIONS:
			case AggregatorPackage.AGGREGATOR__CUSTOM_CATEGORIES:
			case AggregatorPackage.AGGREGATOR__CONTACTS:
			case AggregatorPackage.AGGREGATOR__VALIDATION_REPOSITORIES:
			case AggregatorPackage.AGGREGATOR__MAVEN_MAPPINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

}
