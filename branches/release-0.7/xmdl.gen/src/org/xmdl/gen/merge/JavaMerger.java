package org.xmdl.gen.merge;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.xmdl.gen.plugin.XMDLGenPlugin;

/**
 * Merge operation used for Java source files. This uses an advanced method to
 * merge generated methods and attributes marked.
 * 
 * @author Hakan Dilek
 * 
 */
public class JavaMerger extends FileMerger {

	private static final Logger LOGGER = Logger.getLogger(JavaMerger.class);

	private URI javaMergerConfigurationURI;

	protected JMerger createJavaMerger() {
		// build URI for merge document
		String mergeXML = null;
		try {
			URI fileURI = javaMergerConfigurationURI;
			if (javaMergerConfigurationURI == null) {
				URL baseURL = XMDLGenPlugin.getPlugin().getBaseURL();
				fileURI = URI.createURI(baseURL.toString() + "/res/merge.xml");
			}
			mergeXML = fileURI.toString();
		} catch (Throwable e) {
			LOGGER.warn("fatal res exc", e);
		}

		JControlModel controlModel = new JControlModel();
		String facadeHelperClass = JMerger.DEFAULT_FACADE_HELPER_CLASS;
		controlModel.initialize(CodeGenUtil
				.instantiateFacadeHelper(facadeHelperClass), mergeXML);
		JMerger jmerger = new JMerger(controlModel);
		return jmerger;
	}

	@Override
	public void merge() {
		IFile outputFile = getOutputFile();
		InputStream content = getContent();
		try {
			// read target file
			IPath outputLocation = outputFile.getLocation();
			File outFile = outputLocation.toFile();
			InputStream targetInput = new FileInputStream(outFile);

			// get JMerger
			JMerger merger = createJavaMerger();

			// output file path
			IPath outFilePath = outputFile.getFullPath();

			// set source
			JCompilationUnit sourceUnit = merger
					.createCompilationUnitForInputStream(content);
			merger.setSourceCompilationUnit(sourceUnit);

			// set target
			JCompilationUnit targetUnit = merger
					.createCompilationUnitForInputStream(targetInput);
			merger.setTargetCompilationUnit(targetUnit);

			LOGGER.debug("Merging file" + outFilePath);
			// merge source and target
			merger.merge();

			// extract merged contents
			JCompilationUnit target = merger.getTargetCompilationUnit();
			String mergeResult = target.getContents();
			InputStream result = new ByteArrayInputStream(mergeResult
					.getBytes());
			setContent(result);
		} catch (FileNotFoundException e) {
			LOGGER.warn("File " + outputFile + " must be present", e);
		} catch (RuntimeException e) {
			// problem occurred while merging, don't merge directly
			// write result
			LOGGER.debug("Cannot merge directly writing result."
					+ "Problem occured:" + e);
			try {
				content.reset();
			} catch (IOException e1) {
				LOGGER.debug("Cannot reset input. Problem occured:" + e1);
			}
		}
	}

	public URI getJavaMergerConfigurationURI() {
		return javaMergerConfigurationURI;
	}

	public void setJavaMergerConfigurationURI(URI javaMergerConfigurationURI) {
		this.javaMergerConfigurationURI = javaMergerConfigurationURI;
	}

}
