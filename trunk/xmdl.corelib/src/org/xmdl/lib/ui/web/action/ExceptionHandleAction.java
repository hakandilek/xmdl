package org.xmdl.lib.ui.web.action;

import org.apache.commons.logging.*;
import org.apache.struts.Globals;
import org.apache.struts.action.*;
import org.apache.struts.config.ExceptionConfig;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


/**
 * Implementation of <strong>ExceptionHandler</strong> that
 * handles any Exceptions that are bubbled up to the Action
 * layer.  This allows us to remove generic try/catch statements
 * from our Action Classes.
 * <p/>
 * <p/>
 * <a href="ExceptionHandleAction.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author hd
 */
public final class ExceptionHandleAction extends ExceptionHandler {
    //~ Instance fields ========================================================

    private transient final Log log = LogFactory.getLog(ExceptionHandleAction.class);

    //~ Methods ================================================================

    /**
     * This method handles any java.lang.Exceptions that are not
     * caught in previous classes.  It will loop through and get
     * all the causes (exception chain), create ActionErrors,
     * add them to the request and then forward to the input.
     *
     * @see org.apache.struts.action.ExceptionHandler#execute
     *      (
     *      java.lang.Exception,
     *      org.apache.struts.config.ExceptionConfig,
     *      org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse
     *      )
     */
    public ActionForward execute(Exception ex, ExceptionConfig ae,
                                 ActionMapping mapping,
                                 ActionForm formInstance,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws ServletException {
        // if there's already errors in the request, don't process
        ActionErrors errors =
                (ActionErrors) request.getAttribute(Globals.ERROR_KEY);
        System.out.println("ExceptionHandleAction.execute");
        if (errors != null) {
            return null;
        }

        ActionForward forward =
                super.execute(ex, ae, mapping, formInstance, request, response);

        ActionMessage error = null;
        String property = null;

        // LOGGER the exception to the default logger
        logException(ex);

//        if (ex instanceof AccessDeniedException && forward == null) {
//            storeException(request, "", new ActionMessage("errors.detail", ex.getMessage()), forward);
//            try {
//                response.sendError(HttpServletResponse.SC_FORBIDDEN);
//                return null;
//            } catch (IOException io) {
//                io.printStackTrace();
//                LOGGER.error(io.getMessage());
//            }
//        }
        
        // Get the chained exceptions (causes) and add them to the
        // list of errors as well
        while (ex != null) {
            String msg = ex.getMessage();
            error = new ActionMessage("errors.detail", msg);
            property = error.getKey();
            ex = (Exception) ex.getCause();

            if ((ex != null) && (ex.getMessage() != null)) {
                // check to see if the child message is the same
                // if so, don't store it
                if (msg.indexOf(ex.getMessage()) == -1) {
                    storeException(request, property, error, forward);
                }
            } else {
                storeException(request, property, error, forward);
            }
        }

        return forward;
    }

    /**
     * This method overrides the the ExceptionHandler's storeException
     * method in order to create more than one error message.
     *
     * @param request  - The request we are handling
     * @param property - The property name to use for this error
     * @param error    - The error generated from the exception mapping
     * @param forward  - The forward generated from the input path
     *                 (from the form or exception mapping)
     */
    protected void storeException(HttpServletRequest request, String property,
                                  ActionMessage error, ActionForward forward) {
        ActionMessages errors =
                (ActionMessages) request.getAttribute(Globals.ERROR_KEY);

        if (errors == null) {
            errors = new ActionMessages();
        }

        errors.add(property, error);

        request.setAttribute(Globals.ERROR_KEY, errors);
    }

    /**
     * Overrides logException method in ExceptionHandler to print the stackTrace
     *
     * @see org.apache.struts.action.ExceptionHandler#logException(java.lang.Exception)
     */
    protected void logException(Exception ex) {
        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw));
        log.error(sw.toString());
    }
}
