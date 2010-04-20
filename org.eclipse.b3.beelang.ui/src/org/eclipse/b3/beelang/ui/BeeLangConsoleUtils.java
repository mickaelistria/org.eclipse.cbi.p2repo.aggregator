package org.eclipse.b3.beelang.ui;

import java.io.PrintStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class BeeLangConsoleUtils {

	public static final String BEE_LANG_CONSOLE = "B3 Console";

	public static MessageConsole getBeeLangConsole() {
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		IConsole[] existing = consoleManager.getConsoles();

		for(int i = 0; i < existing.length; i++)
			if(BEE_LANG_CONSOLE.equals(existing[i].getName()))
				return (MessageConsole) existing[i];

		// no console found, so create a new one
		MessageConsole beeLangConsole = new MessageConsole(BEE_LANG_CONSOLE, null);
		// TODO: preference page defining the console colors
		// beeLangConsole.setBackground(???);
		consoleManager.addConsoles(new IConsole[] { beeLangConsole });
		return beeLangConsole;
	}

	public static PrintStream getConsoleErrorStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();
		// TODO: preference page defining the console colors
		Display display = PlatformUI.getWorkbench().getDisplay();
		stream.setColor(display.getSystemColor(SWT.COLOR_RED));
		return new PrintStream(stream);
	}

	public static PrintStream getConsoleOutputStream(MessageConsole console) {
		MessageConsoleStream stream = console.newMessageStream();
		// TODO: preference page defining the console colors
		// stream.setColor(???);
		return new PrintStream(stream);
	}

}
