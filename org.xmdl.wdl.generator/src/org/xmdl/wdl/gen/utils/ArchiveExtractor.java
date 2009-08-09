package org.xmdl.wdl.gen.utils;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class ArchiveExtractor extends AbstractWorkflowComponent2 {

	private static final String COMPONENT_NAME = "Archive Extractor";

	private static final Log LOG = LogFactory.getLog(ArchiveExtractor.class);

	private String archive;
	
	private String targetDirectory;

	public void setArchive(String archive) {
		this.archive = archive;
	}

	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "Extracting archive to directory '" + targetDirectory + "'";
	}

	@Override
	protected void invokeInternal(final WorkflowContext model,
			final ProgressMonitor monitor, final Issues issues) {
		if (archive != null && targetDirectory != null) {
			ArchiveUtils.extractResource(archive, targetDirectory);
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
		if (targetDirectory == null) {
			issues.addWarning("No target directories specified!");
		}
		if (archive == null) {
			issues.addWarning("No archives specified!");
		}
	}

}
