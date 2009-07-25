package org.xmdl.xgen;

import java.util.Date;

public class GenerationStartedEvent {
	private final Date time;
	private final int size;
	private final Platform platform;

	public GenerationStartedEvent(Platform platform) {
		this(platform, 0);
	}
	
	public GenerationStartedEvent (Platform platform, int size) {
		this.platform = platform;
		time = new Date();
		this.size = size;
	}

	/**
	 * @return Returns the time.
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @return Returns the progress.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the platform
	 */
	public Platform getPlatform() {
		return platform;
	}
	
	
	
}
