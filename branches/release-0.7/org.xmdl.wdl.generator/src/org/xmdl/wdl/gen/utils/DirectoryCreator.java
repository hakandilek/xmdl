package org.xmdl.wdl.gen.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCreator extends AbstractWorkflowComponent2 {

	private static final String COMPONENT_NAME = "Directory Creator";

	private static final Log LOG = LogFactory.getLog(DirectoryCreator.class);

	private String directory;

	/**
	 * Sets the directory.
	 * 
	 * @param directory
	 *            name of directory
	 */
	public void setDirectory(final String directory) {
		this.directory = directory;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "cleaning directory '" + directory + "'";
	}

	@Override
	protected void invokeInternal(final WorkflowContext model,
			final ProgressMonitor monitor, final Issues issues) {
		if (directory != null) {
			final StringTokenizer st = new StringTokenizer(directory, ",");
			while (st.hasMoreElements()) {
				final String dir = st.nextToken().trim();
				final File f = new File(dir);
				if (f.exists() && f.isDirectory()) {
					LOG.info("Cleaning " + f.getAbsolutePath());
					try {
						createFolder(f.getAbsolutePath());
					} catch (FileNotFoundException e) {
						issues.addError(e.getMessage());
					}
				}
			}
		}
	}

	public void createFolder(String srcGenPath) throws FileNotFoundException {
		File f = new File(srcGenPath);
		if (!f.exists()) {
			LOG.debug("Creating folder " + f.getPath());
			f.mkdirs();
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}

	@Override
	protected void checkConfigurationInternal(final Issues issues) {
		if (directory == null) {
			issues.addWarning("No directories specified!");
		}
	}

}
