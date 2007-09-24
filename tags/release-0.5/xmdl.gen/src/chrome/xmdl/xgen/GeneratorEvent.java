package chrome.xmdl.xgen;

import java.util.Date;

public class GeneratorEvent {
	private Date time;
	private int size;

	public GeneratorEvent() {
		this(0);
	}
	
	public GeneratorEvent (int size) {
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
	
	
	
}
