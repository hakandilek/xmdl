package org.xmdl.xgen.util;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public class IFileUtils {
	public static final IFileUtils INST = new IFileUtils();

	private final static Logger LOGGER = Logger.getLogger(IFileUtils.class);

	protected IFileUtils() {
		super();
	}

	public void createFolder(String target) throws CoreException {
		LOGGER.debug("create Folder:" + target);
		// File folder = new Path(targetDirectory).toFile();
		// folder.mkdirs();
		IFolder folder = null;
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			folder = root.getFolder(new Path(target));
		} catch (Exception e) {

			LOGGER.debug("Exception :" + target, e);
		}
		if (folder != null && !folder.exists()) {
			int i = target.lastIndexOf("/");

			String folderName = target.substring(0, i);
			createFolder(folderName);
			folder.create(true, true, null);
		}
	}

	/**
	 * Writes the given stream to the file specified by name. output file name
	 * is relative to the workspace root.
	 * 
	 * @param content
	 *            content of the file to write
	 * @param outFileName
	 *            the output file name
	 * @return the file if writing is successful
	 * @throws CoreException
	 *             if an error occurs
	 */
	public IFile writeFile(InputStream content, String outFileName) throws CoreException {
		return writeFile(content, outFileName, null);
	}

	/**
	 * Writes the given stream to the file specified by name. output file name
	 * is relative to the workspace root.
	 * 
	 * @param content
	 *            content of the file to write
	 * @param outFileName
	 *            the output file name
	 * @return the file if writing is successful
	 * @throws CoreException
	 *             if an error occurs
	 */
	public IFile writeFile(InputStream content, String outFileName,
			IFileWriteIntegration integration) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile outFile = root.getFile(new Path(outFileName));
		return writeFile(content, outFile);
	}

	/**
	 * Writes the given stream to the file specified by name.
	 * 
	 * @param content
	 *            content of the file to write
	 * @param outFile
	 *            the output file
	 * @return the file if writing is successful
	 * @throws CoreException
	 *             if an error occurs
	 */
	public IFile writeFile(InputStream content, IFile outFile)
			throws CoreException {
		return writeFile(content, outFile, null);
	}

	/**
	 * Writes the given stream to the file specified by name.
	 * 
	 * @param content
	 *            content of the file to write
	 * @param outFile
	 *            the output file
	 * @return the file if writing is successful
	 * @throws CoreException
	 *             if an error occurs
	 */
	public IFile writeFile(InputStream content, IFile outFile,
			IFileWriteIntegration integration) throws CoreException {
		String filename = outFile.getName();
		String fullFilename = outFile.getFullPath().toString();
		
		if (integration != null) {
			integration.setContent(content);
			integration.setOutFile(outFile);
			integration.beforeWrite();
			content = integration.getContent();
			outFile = integration.getOutFile();
		}
		
		if (outFile.exists()) {
			LOGGER.debug("re writing : " + filename);
			// TODO:check file size and skip
			outFile.setContents(content, true, true, null);
		} else {
			LOGGER.debug("creating : " + filename);
			int dotIndex = filename.lastIndexOf(".");
			if (dotIndex > 0) {
				filename = filename.substring(0, dotIndex);
			}
			
			int slashIndex = fullFilename.lastIndexOf("/");
			if (slashIndex > 0) {
				String foldername = fullFilename.substring(0, slashIndex);
				LOGGER.debug("creating folder: " + foldername);
				createFolder(foldername);
			}

			outFile.create(content, true, null);
		}

		if (integration != null) {
			integration.setContent(content);
			integration.setOutFile(outFile);
			integration.afterWrite();
			content = integration.getContent();
			outFile = integration.getOutFile();
		}
		
		return outFile;
	}

}
