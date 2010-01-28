package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.ResolutionInfo;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class ResolutionInfoAdapter extends AdapterImpl {
	private ResolutionInfo resolutionInfo;
	public ResolutionInfo getResolutionInfo() {
		return resolutionInfo;
	}
	public void setResolutionInfo(ResolutionInfo resolutionInfo) {
		this.resolutionInfo = resolutionInfo;
	}
	@Override
	public boolean isAdapterForType(Object type) {
		return type == ResolutionInfoAdapter.class;
	}
}
