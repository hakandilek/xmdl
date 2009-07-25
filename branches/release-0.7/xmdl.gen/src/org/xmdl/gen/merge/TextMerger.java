package org.xmdl.gen.merge;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.xmdl.xgen.util.IFileUtils;

/**
 * Merge operation used for plain text files.
 * 
 * @author Hakan Dilek
 * 
 */
public class TextMerger extends FileMerger {

	/**
	 * file keep expression. when this expression is found in file contents,
	 * this file is now overwritten.
	 */
	public static final String KEEP_EXPRESSION = "@keep";

	@Override
	public void merge() {
		IFile outputFile = getOutputFile();
		boolean keep = false;
		if (outputFile.exists()) {
			String target = IFileUtils.readFile(outputFile);
			keep = target.indexOf(KEEP_EXPRESSION) >= 0;
		}

		if (keep) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot workspaceRoot = workspace.getRoot();
			IPath outputPath = outputFile.getFullPath();
			IPath genFilePath = outputPath.addFileExtension("gen");
			outputFile = workspaceRoot.getFile(genFilePath);
			setOutputFile(outputFile);
		}

	}

}
