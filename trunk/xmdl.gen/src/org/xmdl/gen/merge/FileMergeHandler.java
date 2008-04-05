package org.xmdl.gen.merge;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.xmdl.xgen.util.FileWriteIntegration;
import org.xmdl.xgen.util.IFileUtils;

/**
 * File merge operation is integrated into the {@linkplain IFileUtils} class
 * using this integration helper. According to the file extension, the merge
 * type is automatically decided, if it will be a java type of merge or a raw
 * text merge.
 * 
 * @author Hakan Dilek
 */
public class FileMergeHandler extends FileWriteIntegration {

	private static final Logger LOGGER = Logger
			.getLogger(FileMergeHandler.class);

	private URI javaMergerConfigurationURI;

	public FileMergeHandler() {
		super();
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
			FileMerger merger = null;
			if ("java".equals(outFile.getFileExtension())) {
				merger = new JavaMerger();
				if (javaMergerConfigurationURI != null) {
					((JavaMerger) merger)
							.setJavaMergerConfigurationURI(javaMergerConfigurationURI);
				}
			} else {
				merger = new TextMerger();
			}

			if (merger != null) {
				merger.setContent(generated);
				merger.setOutputFile(outFile);
				merger.merge();
				setContent(merger.getContent());
				setOutFile(merger.getOutputFile());
			}
		}

		// Save file
		if (LOGGER.isDebugEnabled()) {
			IPath fullPath = getOutFile().getFullPath();
			LOGGER.debug("Modifying file :" + fullPath);
		}
	}

	public URI getJavaMergerConfigurationURI() {
		return javaMergerConfigurationURI;
	}

	public void setJavaMergerConfigurationURI(URI javaMergerConfigurationURI) {
		this.javaMergerConfigurationURI = javaMergerConfigurationURI;
	}

}
