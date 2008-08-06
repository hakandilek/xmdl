package org.xmdl.xgen.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.log4j.Logger;

/**
 * This is the utility class used to read strings from various resources
 * 
 * @author Hakan Dilek
 */
public class StringReader {

	/** the logger */
	private final static Logger LOGGER = Logger.getLogger(StringReader.class);

	/** singleton instance */
	public static final StringReader INST = new StringReader();

	/** hidden constructor */
	protected StringReader() {
		super();
	}

	/**
	 * reads the string from a given input stream
	 * 
	 * @param is
	 *            the nput stream
	 * @return read string
	 */
	public String read(InputStream is) {
		StringBuffer sb = new StringBuffer();
		if (is != null) {
			Reader r = new BufferedReader(new InputStreamReader(is));
			try {
				char[] buf = new char[8192];
				int i = r.read(buf);
				while (i > 0) {
					sb.append(buf, 0, i);
					i = r.read(buf);
				}
			} catch (IOException e) {
				LOGGER.error("Cannot read from stream ", e);
			}
		}
		return sb.toString();
	}
}
