package chrome.xmdl.lib.bo;

/**
 * @author hd
 * @author mca
 */
public class ContextException extends Exception{
    public ContextException() {
    }

    public ContextException(String message) {
        super(message);
    }

    public ContextException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContextException(Throwable cause) {
        super(cause);
    }
}
