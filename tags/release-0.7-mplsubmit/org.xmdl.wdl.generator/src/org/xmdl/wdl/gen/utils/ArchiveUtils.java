package org.xmdl.wdl.gen.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ArchiveUtils {

	private static final int BUFFER_SIZE = 8192;

	private final static Log log = LogFactory.getLog(ArchiveUtils.class);

	public static void extract(String archiveFilename, String destinPath) throws FileNotFoundException {
		extract(new File(archiveFilename), destinPath);
	}
	
	public static void extract(File archive, String destinPath)
			throws FileNotFoundException {
		extract(new FileInputStream(archive), destinPath);
	}
	
	public static void extractResource(String resourceName, String destinPath) {
		ClassLoader cl = log.getClass().getClassLoader();
		InputStream input = cl.getResourceAsStream(resourceName);
		extract(input, destinPath);
	}

	public static void extract(InputStream archiveInput, String destination) {
		log.debug("Extracting to destination = " + destination);
		if (destination == null)
			return;

		if (!destination.endsWith("/"))
			destination += "/";
		
		// IFile file = workspaceRoot.getFile(new Path(targetFile));
		ZipInputStream zis = new ZipInputStream(new BufferedInputStream(archiveInput));
		ZipEntry entry;
		try {
			while ((entry = zis.getNextEntry()) != null) {
				if (entry.isDirectory())
					continue;
				log.debug("Extracting: " + entry);
				int count;

				// write the files to the disk
				String filename = destination + entry.getName();
				byte buffer[] = new byte[BUFFER_SIZE];
				OutputStream out = null;
				try {
					File file = new File(filename);
					File dir = file.getParentFile();
					if(dir != null && !dir.exists())
						dir.mkdirs();
					out = new FileOutputStream(file);
					while ((count = zis.read(buffer, 0, BUFFER_SIZE)) != -1) {
						out.write(buffer, 0, count);
					}
				} catch (Exception e) {
					log.error("exception occured while writing", e);
				} finally {
					try {
						if (out != null)
							out.close();
					} catch (Exception e) {
						log.error("exception occured while writing", e);
					}
				}
			}
			zis.close();
		} catch (IOException e) {
			log.error("Error extracting", e);
		}
	}
}
