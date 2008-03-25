package org.xmdl.xgen.util;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;

public abstract class IFileWriteIntegration {

	private InputStream content;
	private IFile outFile;

	public abstract void beforeWrite();

	public abstract void afterWrite();

	/**
	 * @return the content
	 */
	public InputStream getContent() {
		return content;
	}

	/**
	 * @param content the content to set
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
	 * @param outFile the outFile to set
	 */
	public void setOutFile(IFile outFile) {
		this.outFile = outFile;
	}

}
