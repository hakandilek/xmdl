package chrome.xmdl.xgen;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlatform implements Platform {

	private List<Class<Platform>> requireList = new ArrayList<Class<Platform>>();

	private List<Class<Platform>> conflictList = new ArrayList<Class<Platform>>();

	public AbstractPlatform() {
		super();
	}

	public List<Class<Platform>> requires() {
		return requireList;
	}

	public List<Class<Platform>> conflicts() {
		return conflictList;
	}

	protected void addConclict(Class<Platform> conflict) {
		conflictList.add(conflict);
	}

	protected void removeConclict(Class<Platform> conflict) {
		conflictList.remove(conflict);
	}

	protected void addRequire(Class<Platform> require) {
		requireList.add(require);
	}

	protected void removeRequire(Class<Platform> require) {
		requireList.remove(require);
	}

	/**
	 * @return Returns the conflictList.
	 */
	protected List<Class<Platform>> getConflictList() {
		return conflictList;
	}

	/**
	 * @param conflictList
	 *            The conflictList to set.
	 */
	protected void setConflictList(List<Class<Platform>> conflictList) {
		this.conflictList = conflictList;
	}

	/**
	 * @return Returns the requireList.
	 */
	protected List<Class<Platform>> getRequireList() {
		return requireList;
	}

	/**
	 * @param requireList
	 *            The requireList to set.
	 */
	protected void setRequireList(List<Class<Platform>> requireList) {
		this.requireList = requireList;
	}

	protected String key() {
		StringBuffer sb = new StringBuffer();
		sb.append(name()).append(" ").append(version());
		return sb.toString();
	}


}
