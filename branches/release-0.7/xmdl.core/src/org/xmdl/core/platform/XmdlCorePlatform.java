package org.xmdl.core.platform;

import org.xmdl.xgen.AbstractPlatform;
import org.xmdl.xgen.TaskFactory;

public class XmdlCorePlatform extends AbstractPlatform {

	private TaskFactory taskFactory = new CoreTaskFactory();

	public TaskFactory taskFactory() {
		return taskFactory;
	}

	public String name() {
		return "Cekirdek";
	}

	public String description() {
		return "@author hd, mca";
	}

	public String version() {
		return "1.0.0";
	}

	@Override
	public String id() {
		return "org.xmdl.core";
	}


	
}
