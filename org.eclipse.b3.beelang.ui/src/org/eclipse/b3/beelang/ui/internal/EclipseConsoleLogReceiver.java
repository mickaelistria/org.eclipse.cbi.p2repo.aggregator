package org.eclipse.b3.beelang.ui.internal;

import java.io.OutputStream;

import org.eclipse.b3.internal.core.ILogReceiver;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsoleOutputStream;

/**
 * @author ken1
 */
public class EclipseConsoleLogReceiver implements ILogReceiver
{
	public OutputStream start(String title, String type, boolean activateOnWrite, boolean errorStream)
	{
		IConsoleManager mgr = ConsolePlugin.getDefault().getConsoleManager();
		BuckminsterIOConsole ourConsole = null;
		for(IConsole console : mgr.getConsoles())
		{
			if(console instanceof BuckminsterIOConsole && title.equals(console.getName())
					&& type.equals(console.getType()))
			{
				ourConsole = (BuckminsterIOConsole)console;
				break;
			}
		}
		if(ourConsole == null)
		{
			ourConsole = new BuckminsterIOConsole(title, type);
			mgr.addConsoles(new IConsole[] { ourConsole });

			// Don't activate the console. It will be activated on
			// first write.
		}

		final IOConsoleOutputStream stream = ourConsole.newOutputStream(errorStream);
		return stream;
	}
}
