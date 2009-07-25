package org.xmdl.xgen;

import java.util.Date;

/**
 * File copy event. This event is triggered when a file is copied during
 * generation.
 * 
 * @author Hakan Dilek
 */
public class FileCopyEvent {
	private final Date time;
	private final String filePath;

	public FileCopyEvent(String filePath) {
		this.filePath = filePath;
		this.time = new Date();
	}

	/**
	 * @return Returns the time.
	 */
	public Date getTime() {
		return time;
	}

	public String getFilePath() {
		return filePath;
	}

}
