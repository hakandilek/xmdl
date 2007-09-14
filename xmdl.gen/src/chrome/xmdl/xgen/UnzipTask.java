package chrome.xmdl.xgen;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import chrome.xmdl.xgen.util.IFileUtils;

public class UnzipTask implements Task {
	private final static Logger LOGGER = Logger.getLogger(UnzipTask.class);

	private static final int BUFFER_SIZE = 2048;

	private InputStream input;

	private final String destination;

	private Map<String, String> replacement;

	public UnzipTask(InputStream input, String destination) {
		super();
		this.input = input;
		this.destination = destination;
	}

	public UnzipTask(File input, String destination)
			throws FileNotFoundException {
		super();
		this.input = new FileInputStream(input);
		this.destination = destination;
	}

	public void run() {
		if (input == null) {
			LOGGER.error("no input, input=" + input);
			return;
		}

		LOGGER.debug("Extracting to destination = " + destination);
		// BufferedOutputStream dest = null;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

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
				IFile outFile = root.getFile(new Path(filename));

				byte buffer[] = new byte[BUFFER_SIZE];
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				while ((count = zis.read(buffer, 0, BUFFER_SIZE)) != -1) {
					out.write(buffer, 0, count);
				}

				InputStream content = new ByteArrayInputStream(out
						.toByteArray());
				out.size();
				if (outFile.exists()) {
					LOGGER.debug("re writing : " + filename);
					// TODO:check file size and skip
					outFile.setContents(content, true, true, null);
				} else {
					LOGGER.debug("creating : " + filename);
					int dotIndex = filename.lastIndexOf(".");
					if (dotIndex >0){
						filename = filename.substring(0, dotIndex);
					}
					String foldername = filename;
                    int slashIndex = filename.lastIndexOf("/");
                    if (slashIndex > 0){
                        foldername = filename.substring(0, slashIndex);
                    }
					IFileUtils.INST.createFolder(foldername);
					outFile.create(content, true, null);
				}
			}
			zis.close();
		} catch (FileNotFoundException e) {
			LOGGER.error("Error extracting", e);
		} catch (IOException e) {
			LOGGER.error("Error extracting", e);
		} catch (CoreException e) {
			LOGGER.error("Error extracting", e);
		}
	}

	public void setFilenameReplacement(Map<String, String> filenameReplacement) {
		this.replacement = filenameReplacement;
	}

}
