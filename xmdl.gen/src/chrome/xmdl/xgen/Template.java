package chrome.xmdl.xgen;

/**
 * generator common interface
 * @author tr1a3571 
 *
 */
public interface Template {
	/**
	 * generate target file  from fiven source 
	 * @param object argument
	 * @return file content
	 */
	public String generate(Object object);
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
