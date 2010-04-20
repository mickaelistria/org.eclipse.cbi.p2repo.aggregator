package org.eclipse.b3.internal.core;

import java.io.OutputStream;

import org.eclipse.core.runtime.CoreException;

public interface ILogReceiver {
	OutputStream start(String title, String type, boolean activateOnWrite, boolean errorStream) throws CoreException;
}
