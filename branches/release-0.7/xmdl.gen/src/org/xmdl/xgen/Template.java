package org.xmdl.xgen;

import org.eclipse.jet.JET2Template;

/**
 * Common template interface
 * 
 * @author Hakan Dilek
 * 
 */
public interface Template extends TemplateConfiguration, JET2Template {

	/**
	 * target file name
	 * 
	 * @param object
	 *            geneartion argument
	 * @return file name
	 */
	String targetFile(Object object);

	/**
	 * accept object
	 * 
	 * @param object
	 */
	boolean accept(Object object);

	/**
	 * @return the default parameter name that will be called as the default
	 *         element from the template context on code generation
	 */
	String parameterName();

}
