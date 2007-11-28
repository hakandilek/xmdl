package chrome.xmdl.xgen;

/**
 * common template configuration interface
 * 
 * @author Hakan Dilek
 * 
 */
public interface TemplateConfiguration {

    /**
     * target file name
     * 
     * @param object
     *            geneartion argument
     * @return file name
     */
    public String targetFile(Object object);

    /**
     * accept object
     * 
     * @param object
     */
    public boolean accept(Object object);

}
