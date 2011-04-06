/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.presentation;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorPlugin;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.StatusCode;
import org.eclipse.b3.aggregator.p2.util.MetadataRepositoryResourceImpl;
import org.eclipse.b3.aggregator.util.AggregatorResource;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

class MdrResourceItemProvider extends BaseAggregatorResourceItemProvider implements IItemFontProvider {

	public MdrResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getFont(Object object) {
		MetadataRepositoryResourceImpl mdr = (MetadataRepositoryResourceImpl) object;

		return (mdr.getStatus().getCode() == StatusCode.WAITING)
				? IItemFontProvider.ITALIC_FONT
				: null;
	}

	@Override
	public Object getImage(Object object) {
		Object baseImage = delegateItemProviderAdapter.getImage("full/obj16/MetadataRepository");

		if(baseImage != null) {
			MetadataRepositoryResourceImpl mdr = (MetadataRepositoryResourceImpl) object;
			Object overlayImage;

			if(mdr.getLastException() != null)
				overlayImage = delegateItemProviderAdapter.getImage("full/ovr16/Error");
			else if(mdr.getStatus().getCode() == StatusCode.WAITING)
				overlayImage = delegateItemProviderAdapter.getImage("full/ovr16/Loading");
			else
				return baseImage;

			return getOverlaidImage(baseImage, overlayImage);
		}

		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		return super.getText(object).substring(AggregatorPlugin.B3AGGR_URI_SCHEME.length() + 1);
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		if(notification.getEventType() == Notification.SET &&
				notification.getFeatureID(Resource.class) == Resource.RESOURCE__IS_LOADED) {
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));

			ResourceSet resourceSet = ((Resource) notification.getNotifier()).getResourceSet();

			// if the resource is already excluded from the resource set, ignore this notification
			if(resourceSet == null)
				return;

			Aggregator aggregator = ((AggregatorResource) resourceSet.getResources().get(0)).getAggregator();

			for(MetadataRepositoryReference mdr : aggregator.getAllMetadataRepositoryReferences(true))
				fireNotifyChanged(new ViewerNotification(notification, mdr, false, true));
		}
	}

}
