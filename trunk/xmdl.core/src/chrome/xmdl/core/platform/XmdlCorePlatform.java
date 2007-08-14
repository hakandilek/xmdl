package chrome.xmdl.core.platform;

import org.apache.log4j.Logger;

import chrome.xmdl.xgen.AbstractPlatform;
import chrome.xmdl.xgen.Platform;
import chrome.xmdl.xgen.TaskFactory;

public class XmdlCorePlatform extends AbstractPlatform implements Platform {

	private final static Logger LOGGER = Logger
			.getLogger(XmdlCorePlatform.class);

	private TaskFactory taskFactory = new XmdlTaskFactory();

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
