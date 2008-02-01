package org.xmdl.xgen;

import java.util.Date;

public class GenerationFinishedEvent {
	private Date time;

	public GenerationFinishedEvent() {
		this.time = new Date();
	}

	/**
	 * @return Returns the time.
	 */
	public Date getTime() {
		return time;
	}

}
