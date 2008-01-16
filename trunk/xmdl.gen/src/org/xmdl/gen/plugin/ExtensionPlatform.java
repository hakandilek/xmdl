package org.xmdl.gen.plugin;

import java.util.List;

import org.xmdl.xgen.Platform;
import org.xmdl.xgen.TaskFactory;


public class ExtensionPlatform implements Platform {

	private String name;

	private String version;

	private Platform platform;

	public ExtensionPlatform(String name, String version, Platform platform) {
		this.name = name;
		this.version = version;
		this.platform = platform;
	}
	
	public ExtensionPlatform(Platform platform) {
		super();
		this.platform = platform;
	}


	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	public TaskFactory taskFactory() {
		return platform.taskFactory();
	}

	public String name() {
		if (name != null) return name;
		return platform.name();
	}

	public String version() {
		if (version != null) return version;
		return platform.version();
	}

	public String description() {
		return platform.description();
	}

	public List<Class<Platform>> requires() {
		return platform.requires();
	}

	public List<Class<Platform>> conflicts() {
		return platform.conflicts();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ExtensionPlatform other = (ExtensionPlatform) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

}
