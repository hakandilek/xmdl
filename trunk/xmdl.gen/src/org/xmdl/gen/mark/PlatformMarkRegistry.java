package org.xmdl.gen.mark;

import java.util.HashMap;
import java.util.Map;

import org.xmdl.gen.util.MetadataHelper;
import org.xmdl.xmdl.XBase;
import org.xmdl.xmdl.XProject;

public class PlatformMarkRegistry {

	private static final PlatformMarkRegistry INSTANCE = new PlatformMarkRegistry();;

	private Map<String, PlatformMarkManager> managers;

	public PlatformMarkRegistry() {
		super();
		managers = new HashMap<String, PlatformMarkManager>();
	}

	public static PlatformMarkRegistry getInstance() {
		return INSTANCE;
	}

	public PlatformMarkManager getManagerFor(String projectPath) {
		PlatformMarkManager manager = managers.get(projectPath);
		if (manager == null) {
			manager = new PlatformMarkManager(projectPath);
			managers.put(projectPath, manager);
		}
		return manager;
	}

	public MarkElement getMarkFor(String projectPath) {
		PlatformMarkManager manager = getManagerFor(projectPath);
		if (manager != null) {
			MarkElement mark = manager.readMark();
			return mark;
		}
		return null;
	}

	public MarkElement getMarkFor(XBase selected) {
		MetadataHelper helper = new MetadataHelper();
		XProject project = helper.getProject(selected);
		String name = project.getName();
		String path = "/" + name + "/";
		MarkElement mark = getMarkFor(path);
		return mark;
	}
}
