package org.xmdl.xgen.util;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;

/**
 * Integration helper class for file write operation. This class is used to
 * change the path of output file, or content to be written, by supporting
 * injection methods called before or after file write operation.
 * 
 * @see #beforeWrite()
 * @see #afterWrite()
 * 
 * @author Hakan Dilek
 */
public abstract class FileWriteIntegration {

	/** content to be written */
	private InputStream content;

	/** output file */
	private IFile outFile;

	/**
	 * injection method called before write operation
	 */
	public abstract void beforeWrite();

	/**
	 * injection method called after write operation
	 */
	public abstract void afterWrite();

	/**
	 * @return the content
	 */
	public InputStream getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(InputStream content) {
		this.content = content;
	}

	/**
	 * @return the outFile
	 */
	public IFile getOutFile() {
		return outFile;
	}

	/**
	 * @param outFile
	 *            the outFile to set
	 */
	public void setOutFile(IFile outFile) {
		this.outFile = outFile;
	}

}
