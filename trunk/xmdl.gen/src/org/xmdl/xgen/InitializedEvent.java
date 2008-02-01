package org.xmdl.xgen;

import java.util.Date;

public class InitializedEvent {
	private Date time;

	public InitializedEvent() {
		this.time = new Date();
	}

	/**
	 * @return Returns the time.
	 */
	public Date getTime() {
		return time;
	}

}
