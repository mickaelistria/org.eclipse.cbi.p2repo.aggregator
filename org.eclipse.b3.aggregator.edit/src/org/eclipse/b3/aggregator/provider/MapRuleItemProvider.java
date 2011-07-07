/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.ExclusionRule;
import org.eclipse.b3.aggregator.InstallableUnitRequest;
import org.eclipse.b3.aggregator.MapRule;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.util.SpecialQueries;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.QueryUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.MapRule} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MapRuleItemProvider extends InstallableUnitRequestItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	protected List<? extends InstallableUnitRequest> getContainerChildren(MappedRepository container) {
		List<InstallableUnitRequest> featureRefs = new ArrayList<InstallableUnitRequest>();
		featureRefs.addAll(container.getMapRules());
		featureRefs.addAll(container.getFeatures());

		return featureRefs;
	}

	@Override
	protected IQuery<IInstallableUnit> getInstallableUnitQuery() {
		return QueryUtil.createCompoundQuery(
			SpecialQueries.createProductQuery(), SpecialQueries.createFeatureQuery(), false);
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		MapRule self = (MapRule) object;
		String name = self.getName();
		StringBuilder bld = new StringBuilder(getString("_UI_MapRule_type")).append(" : ");
		if(name != null)
			bld.append(name);
		return bld.toString();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		notifyChangedGen(notification);

		if(notification.getEventType() != Notification.SET)
			return;
		MapRule notifier = ((MapRule) notification.getNotifier());
		switch(notification.getFeatureID(ExclusionRule.class)) {
			case AggregatorPackage.EXCLUSION_RULE__NAME:
			case AggregatorPackage.EXCLUSION_RULE__VERSION_RANGE:
				fireNotifyChanged(new ViewerNotification(notification, notifier, true, false));

				Set<Object> affectedNodes = new HashSet<Object>();
				affectedNodes.add(notifier);

				// Go through all direct ancestors first
				EObject container = ((EObject) notifier).eContainer();
				affectedNodes.add(((EObject) notifier).eResource());
				while(container != null) {
					affectedNodes.add(container);
					container = container.eContainer();
				}
				for(Object affectedNode : affectedNodes)
					fireNotifyChanged(new ViewerNotification(notification, affectedNode, false, true));
				return;
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
		super.notifyChanged(notification);
	}
}
