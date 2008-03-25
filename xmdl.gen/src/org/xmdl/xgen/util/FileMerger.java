package org.xmdl.xgen.util;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.xmdl.xgen.StringReader;

public class FileMerger extends IFileWriteIntegration {

	/** file keep expression. when this expression is found in file contents, this file is now overwritten. */
	public static final String KEEP_EXPRESSION = "@keep";

	private static final Logger LOGGER = Logger.getLogger(FileMerger.class);
	
	private final JMerger merger;

	
	public FileMerger(JMerger merger) {
		super();
		this.merger = merger;
	}

	@Override
	public void afterWrite() {
		// do nothing
	}

	@Override
	public void beforeWrite() {
		IFile outFile = getOutFile();
		InputStream generated = getContent();
		
		if (outFile.exists()) {
			boolean keep = false;
			InputStream targetIn = null;
			try {
				targetIn = new FileInputStream(outFile.getLocation()
						.toFile());
				// targetIn = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				LOGGER.fatal("File " + outFile + " must be present", e);
			}

			IPath outFilePath = outFile.getFullPath();
			if ("java".equals(outFile.getFileExtension())) {
				try {
					// use merging

					// set source
					JCompilationUnit compilationUnit = merger.createCompilationUnitForInputStream(generated);
					merger.setSourceCompilationUnit(compilationUnit);

					// set target
					merger.setTargetCompilationUnit(merger
							.createCompilationUnitForInputStream(targetIn));

					LOGGER.debug("Merging file" + outFilePath);
					// merge source and target
					merger.merge();

					// extract merged contents
					JCompilationUnit target = merger
							.getTargetCompilationUnit();
					String mergeResult = target.getContents();
					InputStream result = new ByteArrayInputStream(mergeResult.getBytes());
					setContent(result);
				} catch (RuntimeException e) {
					//problem occurred while merging, don't merge directly write result
					LOGGER.debug("Cannot merge directly writing result. Problem occured:" + e);
				}

			} else {
				String target = StringReader.INST.read(targetIn);					
				keep = target.indexOf(KEEP_EXPRESSION) >=0;
			}

			if (keep){
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				IPath genFilePath = outFilePath.addFileExtension("gen");
				IFile file = workspaceRoot.getFile(genFilePath);
				setOutFile(file);
			}
			
			// Save file
			LOGGER.debug("Modifying file :" + getOutFile().getFullPath().toString());
		}
		
		setOutFile(outFile);
	}

}
