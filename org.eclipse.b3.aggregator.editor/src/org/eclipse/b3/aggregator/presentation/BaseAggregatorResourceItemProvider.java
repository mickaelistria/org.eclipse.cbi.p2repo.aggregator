/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.presentation;

import org.eclipse.b3.aggregator.provider.AggregatorItemProviderAdapter;
import org.eclipse.b3.aggregator.provider.TooltipTextProvider;
import org.eclipse.b3.aggregator.util.OverlaidImage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProvider;

/**
 * @author michal.ruzicka@cloudsmith.com
 * 
 */
class BaseAggregatorResourceItemProvider extends ResourceItemProvider implements TooltipTextProvider {

	protected static final int[] OVERLAY_POSITIONS = new int[] {
			OverlaidImage.BASIC, OverlaidImage.OVERLAY_BOTTOM_RIGHT };

	protected final AggregatorItemProviderAdapter delegateItemProviderAdapter = new AggregatorEditorItemProviderAdapter(
		getAdapterFactory());

	public BaseAggregatorResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getOverlaidImage(Object baseImage, Object overlayImage) {
		if(overlayImage != null)
			return new OverlaidImage(new Object[] { baseImage, overlayImage }, OVERLAY_POSITIONS);

		return baseImage;
	}

	public String getTooltipText(Object object) {
		return AggregatorItemProviderAdapter.getTooltipText(object, this);
	}

}
