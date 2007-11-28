package chrome.xmdl.xgen;

import org.eclipse.jet.JET2Template;

/**
 * Common template interface
 * @author Hakan Dilek 
 *
 */
public interface Template extends TemplateConfiguration, JET2Template {

    /**
	 * target file name
	 * @param object geneartion argument
	 * @return file name
	 */
	public String targetFile(Object object);
	
	/**
	 * accept object
	 * @param object
	 */
	public boolean accept(Object object);

}
