package org.xmdl.lib.ui.web.form;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;
import org.apache.struts.validator.ValidatorForm;
import org.xmdl.lib.dao.Bean;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;


/**
 * Base ActionForm bean. Used to give child classes readable
 * representation of their properties using toString() method.</p>
 *
 * <p>Also has a validate() method to cancel validation on cancel actions.</p>
 * 
 * <p><a href="AbstractForm.java.html"><i>View Source</i></a></p>
 *
 * @author hd
 */
public abstract class AbstractForm<B extends Bean> extends ValidatorForm implements Serializable, Form {
	private static final long serialVersionUID = 3257005453799404851L;

    public AbstractForm() {
//        initialize();
    }

//    /**
//     * initialize the bean element of the form
//     */
//    protected abstract void initialize();

	public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * This validation method is designed to be a parent of all other Form's
     * validate methods - this allows the cancel and delete buttons to bypass
     * validation.
     *
     * @param mapping The <code>ActionMapping</code> used to select this
     *   instance
     * @param request The servlet request we are processing
     * @return <code>ActionErrors</code> object that encapsulates any
     *   validation errors
     */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        // Identify the request parameter containing the method name
        String parameter = mapping.getParameter();

        if (parameter != null) {
            // Identify the method name to be dispatched to.
            String method = request.getParameter(parameter);
            MessageResources resources =
                (MessageResources) request.getAttribute(Globals.MESSAGES_KEY);

            // Identify the localized message for the cancel button
            String cancel = resources.getMessage("button.cancel");
            String delete = resources.getMessage("button.delete");

            // if message resource matches the cancel button then no
            // need to validate
            if ((method != null) &&
                    (method.equalsIgnoreCase(cancel) ||
                    method.equalsIgnoreCase(delete))) {
                return null;
            }
        }

        // perform regular validation
        return super.validate(mapping, request);
    }

//    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
//        initialize();
//    }
}
