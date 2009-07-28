package org.xmdl.wdl.gen.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * migrates the given JET template to Xpand by simple find/replace
 * 
 * @author Hakan Dilek
 */
public class TemplateMigrator {
	private Properties replacements = new Properties();

	/**
	 * @param args
	 *            template names
	 */
	public static void main(String[] args) {
		TemplateMigrator migrator = new TemplateMigrator();
		migrator.initialize();

		for (String arg : args) {
			try {
				migrator.migrate(arg);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void migrate(String filename) throws FileNotFoundException {
		migrate(new File(filename));
	}

	public void migrate(File file) throws FileNotFoundException {
		if (!file.exists()) {
			throw new FileNotFoundException("" + file);
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				migrate(f);
			}
		} else {
			String str = read(file);
			String rep = replace(str);
			write(file, rep);
		}
	}

	private String replace(String str) {
		Set<Object> keys = replacements.keySet();
		for (Object key : keys) {
			Object val = replacements.get(key);
			str = str.replace(""+key, ""+val);
		}
		return str;
	}

	private void write(File file, String rep) {
		try {
			FileWriter w = new FileWriter(file);
			w.write(rep);
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String read(File file) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader r = new FileReader(file);
			char[] buff = new char[8192];
			int c = r.read(buff);
			while(c>0) {
				sb.append(buff, 0, c);
				c = r.read(buff);
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public void initialize() {
		try {
			replacements.load(new FileReader("replace.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Set<Object> keys = replacements.keySet();
		for (Object key : keys) {
			System.out.println(key);
			Object val = replacements.get(key);
			System.out.println("\t" + val);
		}
	}

}
