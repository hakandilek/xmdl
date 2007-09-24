package chrome.xmdl.xgen.util;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public class IFileUtils {
	public static final IFileUtils INST = new IFileUtils();
	
	private final static Logger LOGGER = Logger.getLogger(IFileUtils.class);

	protected IFileUtils() {
		super();
	}

	public void createFolder(String target) throws CoreException {
		LOGGER.debug("create Folder:" + target);
		// File folder = new Path(targetDirectory).toFile();
		// folder.mkdirs();
		IFolder folder = null;
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			folder = root.getFolder(new Path(target));
		} catch (Exception e) {

			LOGGER.debug("Exception :" + target, e);
		}
		if (folder != null && !folder.exists()) {
			int i = target.lastIndexOf("/");

			String folderName = target.substring(0, i);
			createFolder(folderName);
			folder.create(true, true, null);
		}
	}

}
