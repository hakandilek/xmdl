package chrome.xmdl.xgen;

import java.util.List;

public interface Platform {

	/**
	 * @return Returns the Task Factory.
	 */
	TaskFactory taskFactory();

	/**
	 * @return Returns the name.
	 */
	String name();

	/**
	 * @return Returns the version.
	 */
	String version();

	/**
	 * @return Returns the description.
	 */
	String description();

	/**
	 * @return Returns the list of other platforms this platform requires
	 */
	List<Class<Platform>> requires();

	/**
	 * @return Returns the list of other platforms this platform has conflict
	 *         with
	 */
	List<Class<Platform>> conflicts();

}
