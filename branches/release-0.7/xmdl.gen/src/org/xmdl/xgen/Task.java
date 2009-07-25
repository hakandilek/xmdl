package org.xmdl.xgen;

import org.xmdl.xgen.util.FileWriteIntegration;

public interface Task {

	/**
	 * Runs the task
	 * 
	 * @param writeIntegration
	 *            write integration component when needed
	 */
	void run(FileWriteIntegration writeIntegration);

}
