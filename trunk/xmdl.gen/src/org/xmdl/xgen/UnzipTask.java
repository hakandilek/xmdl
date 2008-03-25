package org.xmdl.xgen;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.xmdl.xgen.util.IFileUtils;

public class UnzipTask implements Task {
	private final static Logger LOGGER = Logger.getLogger(UnzipTask.class);

	private static final int BUFFER_SIZE = 2048;

	private InputStream input;

	private final String destination;

	private Map<String, String> replacement;

	private List<FileCopyListener> listeners = new ArrayList<FileCopyListener>();

	public UnzipTask(InputStream input, String destination) {
		super();
		this.input = input;
		this.destination = destination;
	}

	public UnzipTask(File input, String destination)
			throws FileNotFoundException {
		this(new FileInputStream(input), destination);
	}

	public void run() {
		if (input == null) {
			LOGGER.error("no input, input=" + input);
			return;
		}

		LOGGER.debug("Extracting to destination = " + destination);

		// IFile file = workspaceRoot.getFile(new Path(targetFile));
		ZipInputStream zis = new ZipInputStream(new BufferedInputStream(input));
		ZipEntry entry;
		try {
			while ((entry = zis.getNextEntry()) != null) {
				if (entry.isDirectory())
					continue;
				LOGGER.debug("Extracting: " + entry);
				int count;

				// write the files to the disk
				String filename = destination + entry.getName();
				filename.replaceAll("\\\\", "/");
				if (replacement != null) {
					Set<String> keys = replacement.keySet();
					for (String key : keys) {
						String k = "${" + key + "}";
						String k2 = "\\$\\{" + key + "\\}";
						if (filename.indexOf(k) >= 0) {
							String rep = replacement.get(key);
							filename = filename.replaceAll(k2, rep);
						}
					}
				}

				byte buffer[] = new byte[BUFFER_SIZE];
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				while ((count = zis.read(buffer, 0, BUFFER_SIZE)) != -1) {
					out.write(buffer, 0, count);
				}
				InputStream content = new ByteArrayInputStream(out
						.toByteArray());
				out.size();
				
				try {
					IFile outFile = IFileUtils.INST.writeFile(content, filename);
					fireFileCopied("" + outFile.getFullPath());
				} catch (CoreException e) {
					LOGGER.error("Error extracting", e);
				}
			}
			zis.close();
		} catch (FileNotFoundException e) {
			LOGGER.error("Error extracting", e);
		} catch (IOException e) {
			LOGGER.error("Error extracting", e);
		}
	}

	public void setFilenameReplacement(Map<String, String> filenameReplacement) {
		this.replacement = filenameReplacement;
	}

	public void addListener(FileCopyListener l) {
		listeners.add(l);
	}

	public void removeListener(FileCopyListener l) {
		listeners.remove(l);
	}

	protected void fireFileCopied(String filePath) {
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("File copied: " + filePath);
		FileCopyEvent event = new FileCopyEvent(filePath);
		for (int i = 0; i < listeners.size(); i++) {
			FileCopyListener l = listeners.get(i);
			l.fileCopied(event);
		}
	}

}
