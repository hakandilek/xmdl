package org.xmdl.xmdl.ui.wizard;
 
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.util.ExceptionHandler;
import org.eclipse.jdt.internal.ui.wizards.JavaProjectWizardFirstPage;
import org.eclipse.jdt.internal.ui.wizards.JavaProjectWizardSecondPage;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jdt.internal.ui.wizards.NewWizardMessages;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.xmdl.xmdl.ui.XMDLUIPlugin;


@SuppressWarnings("restriction")
public class XMDLJavaProjectWizard extends NewElementWizard implements IExecutableExtension {

	/** the logger */
	private static final Logger LOGGER = Logger.getLogger(XMDLUIPlugin.class);

    private JavaProjectWizardFirstPage fFirstPage;
    private JavaProjectWizardSecondPage fSecondPage;
    
    private IConfigurationElement fConfigElement;
    
    public XMDLJavaProjectWizard() {
    	LOGGER.debug("XMDLJavaProjectWizard()");
        setDefaultPageImageDescriptor(JavaPluginImages.DESC_WIZBAN_NEWJPRJ);
        setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
        setWindowTitle(NewWizardMessages.JavaProjectWizard_title); 
    }

    /*
     * @see Wizard#addPages
     */	
    public void addPages() {
        super.addPages();
        fFirstPage= new JavaProjectWizardFirstPage();
        addPage(fFirstPage);
        fSecondPage= new XMDLJavaProjectWizardSecondPage(fFirstPage);
        addPage(fSecondPage);
    }		
    
    /* (non-Javadoc)
     * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#finishPage(org.eclipse.core.runtime.IProgressMonitor)
     */
    protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
    	fSecondPage.performFinish(monitor); // use the full progress monitor
    }
       
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {

		boolean res= super.performFinish();
		if (res) {
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
	 		selectAndReveal(fSecondPage.getJavaProject().getProject());
		}
		
		return res;
	}
    
    protected void handleFinishException(Shell shell, InvocationTargetException e) {
        String title= NewWizardMessages.JavaProjectWizard_op_error_title; 
        String message= NewWizardMessages.JavaProjectWizard_op_error_create_message;			 
        ExceptionHandler.handle(e, getShell(), title, message);
    }	
    
    /*
     * Stores the configuration element for the wizard.  The config element will be used
     * in <code>performFinish</code> to set the result perspective.
     */
    public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
        fConfigElement= cfig;
    }
    
    /* (non-Javadoc)
     * @see IWizard#performCancel()
     */
    public boolean performCancel() {
        fSecondPage.performCancel();
        return super.performCancel();
    }
    
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.internal.ui.wizards.NewElementWizard#getCreatedElement()
	 */
	public IJavaElement getCreatedElement() {
		return JavaCore.create(fFirstPage.getProjectHandle());
	}
        
}
