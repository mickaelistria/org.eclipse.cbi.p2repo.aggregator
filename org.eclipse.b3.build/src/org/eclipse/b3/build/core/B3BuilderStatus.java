package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.BuildSet;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class B3BuilderStatus extends Status {

	public final static B3BuilderStatus CANCEL_STATUS = new B3BuilderStatus(
		IStatus.CANCEL, B3BuildActivator.instance.getBundle().getSymbolicName(), IStatus.CANCEL, "", null);

	public static B3BuilderStatus error(String message, Throwable t) {
		return new B3BuilderStatus(
			IStatus.ERROR, B3BuildActivator.instance.getBundle().getSymbolicName(), IStatus.ERROR, message, t);
	}

	private BuildSet buildResult;

	/**
	 * Creates a Builder status in OK state where the passed PathGroup can be obtained using {@link #getBuildResult()}.
	 * 
	 * @param result
	 */
	public B3BuilderStatus(BuildSet result) {
		this(IStatus.OK, B3BuildActivator.instance.getBundle().getSymbolicName(), IStatus.OK, "ok", null);
		buildResult = result;
	}

	public B3BuilderStatus(int severity, String pluginId, int code, String message, Throwable exception) {
		super(severity, pluginId, code, message, exception);
	}

	/**
	 * Returns the PathGroup that is the result of a B3BuilderJob. The returned value is only valid
	 * if the status of this B3BuilderStatus is OK (In all other cases, the value will be null).
	 * 
	 * @return
	 */
	public BuildSet getBuildResult() {
		return buildResult;
	}

}
