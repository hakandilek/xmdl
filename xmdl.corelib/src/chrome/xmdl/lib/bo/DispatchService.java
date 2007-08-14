package chrome.xmdl.lib.bo;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author hd
 * @author mca
 */
public class DispatchService implements Service, Command {


    // ----------------------------------------------------- Instance Variables


    /**
     * The Class instance of this <code>DispatchAction</code> class.
     */
    protected Class clazz = this.getClass();


    /**
     * Commons Logging instance.
     */
    protected static Log log = LogFactory.getLog(DispatchService.class);


    /**
     * The set of Method objects we have introspected for this class,
     * keyed by method name.  This collection is populated as different
     * methods are called, so that introspection needs to occur only
     * once per method name.
     */
    protected HashMap methods = new HashMap();


    /**
     * The set of argument type classes for the reflected method call.  These
     * are the same for all calls, so calculate them only once.
     */
    protected Class[] types =
            {
                Context.class,
//                ActionForm.class,
//                HttpServletRequest.class,
//                HttpServletResponse.class
            };
    public static final String METHOD = "method";
    public static final Object SEARCH_METHOD = "search";
    public static final Object EDIT_METHOD = "edit";
    public static final Object SAVE_METHOD = "save";
    public static final Object DELETE_METHOD = "delete";
    public static final Object VIEW_METHOD = "view";



    // --------------------------------------------------------- Public Methods


    /**
     * Process the specified HTTP request, and create the corresponding HTTP
     * response (or forward to another web component that will create it).
     * Return an <code>boolean</code> instance describing where and how
     * control should be forwarded, or <code>null</code> if the response has
     * already been completed.
     *
     * @param context The Command Context
     * @throws Exception if an exception occurs
     */
    public boolean execute(Context context) throws Exception {

        // Identify the request parameter containing the method name
        String parameter = METHOD;
//        if (parameter == null) {
//            String message =
//                    messages.getMessage("dispatch.handler", mapping.getPath());
//
//            LOGGER.error(message);

//            throw new ServletException(message);
//        }

        // Get the method's name. This could be overridden in subclasses.
        String name = getMethodName(context, parameter);


        // Prevent recursive calls
        if ("execute".equals(name)) {
            String message = "Recursive Call";
//			messages.getMessage("dispatch.recursive", mapping.getPath());

            log.error(message);
            throw new ContextException(message);
        }


        // Invoke the named method, and return the result
        return dispatchMethod(context, name);

    }


    /**
     * Method which is dispatched to when there is no value for specified
     * request parameter included in the request.  Subclasses of
     * <code>DispatchAction</code> should override this method if they wish
     * to provide default behavior different than throwing a ServletException.
     */
    protected boolean unspecified(Context context)
            throws ContextException {

        String message = "Parameter Unspecified";
        log.error(message);

        throw new ContextException(message);
    }



    // ----------------------------------------------------- Protected Methods


    /**
     * Dispatch to the specified method.
     *
     * @since Struts 1.1
     */
    protected boolean dispatchMethod(Context context,
                                     String name) throws Exception {

        // Make sure we have a valid method name to call.
        // This may be null if the user hacks the query string.
        if (name == null) {
            return this.unspecified(context);
        }

        // Identify the method object to be dispatched to
        Method method = null;
        try {
            method = getMethod(name);

        } catch (NoSuchMethodException e) {
//            String message =
//                    messages.getMessage("dispatch.method", mapping.getPath(), name);
            log.error(e);
            throw e;
        }

        boolean result = false;
        try {
            Object args[] = {context};
            result = (Boolean) method.invoke(this, args);

        } catch (ClassCastException e) {
//            String message =
//                    messages.getMessage("dispatch.return", mapping.getPath(), name);
            log.error(e);
            throw e;

        } catch (IllegalAccessException e) {
//            String message =
//                    messages.getMessage("dispatch.error", mapping.getPath(), name);
            log.error(e);
            throw e;

        } catch (InvocationTargetException e) {
            // Rethrow the target exception if possible so that the
            // exception handling machinery can deal with it
            Throwable t = e.getTargetException();
            if (t instanceof Exception) {
                throw ((Exception) t);
            } else {
//                String message =
//                        messages.getMessage("dispatch.error", mapping.getPath(), name);
                log.error(/*message, */e);
                throw new ContextException(t);
            }
        }

        // Return the returned boolean instance
        return (result);
    }


    /**
     * Introspect the current class to identify a method of the specified
     * name that accepts the same parameter types as the <code>execute</code>
     * method does.
     *
     * @param name Name of the method to be introspected
     * @throws NoSuchMethodException if no such method can be found
     */
    protected Method getMethod(String name)
            throws NoSuchMethodException {

        synchronized (methods) {
            Method method = (Method) methods.get(name);
            if (method == null) {
                method = clazz.getMethod(name, types);
                methods.put(name, method);
            }
            return (method);
        }

    }


    protected String getMethodName(Context context, String name) {
        Object o = context.get(name);
        return o + "";
    }

}
