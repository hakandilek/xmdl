package org.xmdl.xmdl.ui.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPageTwo;
import org.eclipse.jface.wizard.IWizardPage;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XmdlFactory;

public class XMDLJavaProjectWizardSecondPage extends
		NewJavaProjectWizardPageTwo implements IWizardPage {

	public XMDLJavaProjectWizardSecondPage(
			XMDLJavaProjectWizardFirstPage firstPage) {
		super(firstPage);
	}

	@Override
	public void performFinish(IProgressMonitor monitor) throws CoreException,
			InterruptedException {
		super.performFinish(monitor);
		IJavaProject jProject = getJavaProject();
		IProject project = jProject.getProject();
		String name = project.getName();

		IFile xmdlFile = project.getFile("model/" + name + ".xmdl");
		java.net.URI xmdlURI = xmdlFile.getLocationURI();
		URI uri = URI.createURI(xmdlURI.toString());

		XmdlFactory factory = XmdlFactory.eINSTANCE;
		XProject xProject = factory.createXProject();
		xProject.setName(name);

		try {
			ResourceHelper.saveResource(uri, xProject);
		} catch (IOException e) {
			e.printStackTrace();
		}

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}
