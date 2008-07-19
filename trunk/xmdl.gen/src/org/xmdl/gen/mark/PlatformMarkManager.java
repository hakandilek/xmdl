package org.xmdl.gen.mark;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.xmdl.xgen.Generator;
import org.xmdl.xgen.Task;
import org.xmdl.xgen.UnzipTask;
import org.xmdl.xgen.util.IFileUtils;

/**
 * Facade class for platform mark elements.
 * 
 * @author Hakan Dilek
 */
public class PlatformMarkManager {

	private final static Logger LOGGER = Logger.getLogger(PlatformMarkManager.class);

	private static final String PLATFORM_MARK_PATH = "/model/platform.xml";

	/** reference to the listener */
	private PlatformMarkingListener listener;

	/** list of registered tasks */
	private List<UnzipTask> registeredTasks;

	private final String projectPath;

	public PlatformMarkManager(String projectPath) {
		super();
		this.projectPath = projectPath;
		listener = new PlatformMarkingListener();
		registeredTasks = new ArrayList<UnzipTask>();
	}

	/**
	 * Registers the {@link PlatformMarkingListener} for the given generator.
	 * 
	 * @param generator
	 *            the generator
	 */
	public void initialize(Generator generator) {
		generator.addListener(listener);
	}

	/**
	 * registers the {@link PlatformMarkingListener} for the tasks that change
	 * (copy) files.
	 * 
	 * @param tasks
	 *            list of tasks
	 */
	public void processTasks(List<Task> tasks) {
		for (Task task : tasks) {
			if (task instanceof UnzipTask) {
				UnzipTask fileTask = (UnzipTask) task;
				fileTask.addListener(listener);
				registeredTasks.add(fileTask);
			}
		}
	}

	/**
	 * Clears the listeners and their associations.
	 * 
	 * @param generator
	 *            the generator
	 */
	public void finish(Generator generator) {
		writeMark();
		clear(generator);
	}

	protected void writeMark() {
		IFile outFile = getFile(); 
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		listener.writeMark(out);
		byte[] bytes = out.toByteArray();
		InputStream content = new ByteArrayInputStream(bytes);
		try {
			IFileUtils.INST.writeFile(content, outFile);
		} catch (CoreException e) {
			LOGGER.error("Error writing mark", e);
		}
	}

	private IFile getFile() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String filename = projectPath + PLATFORM_MARK_PATH;
		IFile file = root.getFile(new Path(filename));
		return file;
	}

	public MarkElement readMark() {
		MarkElement mark = null;
		try {
			IFile markFile = getFile();
			if (markFile.exists()) {
				InputStream contents = markFile.getContents();
				mark = PlatformMark.fromXML(contents);
			}
		} catch (CoreException e) {
			LOGGER.error("Error reading mark", e);
		}
		return mark;
	}
	
	protected void clear(Generator generator) {
		generator.removeListener(listener);
		for (UnzipTask task : registeredTasks) {
			task.removeListener(listener);
		}
		registeredTasks.clear();
		listener = null;
	}

}
