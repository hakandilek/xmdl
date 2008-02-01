package org.xmdl.xgen;

import java.util.Date;

public class FileGeneratedEvent {
	private final Date time;
	private final String filePath;

	public FileGeneratedEvent(String filePath) {
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
