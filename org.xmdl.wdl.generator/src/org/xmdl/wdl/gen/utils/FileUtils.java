package org.xmdl.wdl.gen.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileUtils {

	public static void writeFile(InputStream content, File file)
			throws IOException {
		Writer writer = new FileWriter(file);
		Reader reader = new InputStreamReader(content);
		char[] buff = new char[8192];
		int c = reader.read(buff);
		while (c > 0) {
			writer.write(buff, 0, c);
			c = reader.read(buff);
		}
		writer.close();
		reader.close();
	}

	public static Properties loadProperties(File file) throws IOException {
		Properties p = new Properties();
		FileReader reader = new FileReader(file);
		p.load(reader);
		reader.close();
		return p;
	}

}
