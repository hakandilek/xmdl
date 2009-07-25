package org.xmdl.gen.merge;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;

/**
 * File merger interface that defined the merge operation.
 * 
 * @author Hakan Dilek
 * 
 */
public abstract class FileMerger {

	/**
	 * content to be merged
	 */
	private InputStream content;

	/**
	 * the output file to merge into.
	 */
	private IFile outputFile;

	/**
	 * merge operation implementation.
	 * 
	 */
	public abstract void merge();

	public InputStream getContent() {
		return content;
	}

	public void setContent(InputStream content) {
		this.content = content;
	}

	public IFile getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(IFile outputFile) {
		this.outputFile = outputFile;
	}
}
