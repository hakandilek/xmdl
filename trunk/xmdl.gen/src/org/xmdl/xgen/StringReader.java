package org.xmdl.xgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.log4j.Logger;

public class StringReader {
	private final static Logger LOGGER = Logger.getLogger(StringReader.class);

	public static final StringReader INST = new StringReader();

	protected StringReader() {
		super();
	}

	public String read(InputStream is) {
		Reader r = new BufferedReader(new InputStreamReader(is));
		StringBuffer sb = new StringBuffer();
		try {
			//r.reset();
			char[] buf = new char[8192];
			int i = r.read(buf);
			while (i > 0){
				sb.append(buf, 0, i);
				i = r.read(buf);
			}
		} catch (IOException e) {
			LOGGER.error("Cannot read from stream ", e);
		}
		
		return sb.toString();
	}
}
