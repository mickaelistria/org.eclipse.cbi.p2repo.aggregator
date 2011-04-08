/**
 * 
 */
package org.eclipse.b3.aggregator.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.edit.provider.ComposedImage;

/**
 * @author Antonin Slezacek, slezicz@gmail.com
 * 
 */
public class OverlaidImage extends ComposedImage {
	public static final int BASIC = 0;

	public static final int OVERLAY_TOP_LEFT = 1;

	public static final int OVERLAY_TOP_RIGHT = 2;

	public static final int OVERLAY_BOTTOM_LEFT = 3;

	public static final int OVERLAY_BOTTOM_RIGHT = 4;

	public static final int OVERLAY_CENTER = 5;

	public static final int[] BASIC_TOP_LEFT = new int[] { BASIC, OVERLAY_TOP_LEFT };

	public static final int[] BASIC_TOP_RIGHT = new int[] { BASIC, OVERLAY_TOP_RIGHT };

	public static final int[] BASIC_BOTTOM_LEFT = new int[] { BASIC, OVERLAY_BOTTOM_LEFT };

	public static final int[] BASIC_BOTTOM_RIGHT = new int[] { BASIC, OVERLAY_BOTTOM_RIGHT };

	public static final int[] BASIC_CENTER = new int[] { BASIC, OVERLAY_CENTER };

	private int[] positions;

	public OverlaidImage(Object[] images, int[] positions) {
		super(Arrays.asList(images));
		this.positions = positions;
	}

	@Override
	public List<Point> getDrawPoints(Size size) {
		List<Point> results = new ArrayList<Point>();

		int i = 0;
		for(Size imageSize : imageSizes) {
			Point point = new Point();

			if(i < positions.length)
				switch(positions[i]) {
					case OVERLAY_TOP_RIGHT:
						point.x = size.width - imageSize.width;
						point.y = 0;
						break;
					case OVERLAY_BOTTOM_LEFT:
						point.x = 0;
						point.y = size.height - imageSize.height;
						break;
					case OVERLAY_BOTTOM_RIGHT:
						point.x = size.width - imageSize.width;
						point.y = size.height - imageSize.height;
						break;
					case OVERLAY_CENTER:
						point.x = (size.width - imageSize.width) / 2;
						point.y = (size.height - imageSize.height) / 2;
						break;
					default:
						point.x = 0;
						point.y = 0;
				}

			results.add(point);

			i++;
		}

		return results;
	}
}
