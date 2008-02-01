package org.xmdl.xgen;

/**
 * A listener used to track copied files
 * 
 * @author Hakan Dilek
 */
public interface FileCopyListener {
	/**
	 * called when a file is copied
	 * 
	 * @param event
	 *            the event
	 */
	void fileCopied(FileCopyEvent event);
}
