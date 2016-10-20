/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class IOUtils {

	/**
	 * @param is
	 */
	public static void close(Closeable is) {
		if(is != null)
			try {
				is.close();
			}
			catch(IOException e) {
				// ignore
			}
	}

	public static void copyStream(InputStream is, OutputStream os) throws IOException {
		copyStream(is, os, true, true);
	}

	public static void copyStream(InputStream is, OutputStream os, boolean closeInput, boolean closeOutput)
			throws IOException {
		byte[] buffer = new byte[1024];
		int len;

		try {
			while((len = is.read(buffer)) != -1) {
				os.write(buffer, 0, len);
			}
		}
		finally {
			try {
				if(closeInput)
					is.close();
			}
			catch(IOException e) {
				// ignore
			}

			if(closeOutput)
				os.close();
		}
	}

	/**
	 * @param is
	 *            source
	 * @return string initialized by input stream content
	 * @throws IOException
	 */
	public static String readString(InputStream is) throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		copyStream(is, os);
		return new String(os.toByteArray());
	}
}
