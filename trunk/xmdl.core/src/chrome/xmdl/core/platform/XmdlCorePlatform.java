package chrome.xmdl.core.platform;

import chrome.xmdl.xgen.AbstractPlatform;
import chrome.xmdl.xgen.TaskFactory;

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


	
}
