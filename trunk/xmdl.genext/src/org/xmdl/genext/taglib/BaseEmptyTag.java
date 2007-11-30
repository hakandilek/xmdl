package org.xmdl.genext.taglib;

import java.util.Set;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractEmptyTag;

public abstract class BaseEmptyTag extends AbstractEmptyTag {

    /**
     * fetch an XPATH object from the context
     * 
     * @param context
     *            template context
     * @param name
     *            name of the XPATH object
     * @return the object
     */
    public Object fetchObject(JET2Context context, String name)
            throws MissingAttributeException {
        String attribute = fetchAttribute(name);
        XPathContextExtender xpathContext = XPathContextExtender
                .getInstance(context);
        Object object = xpathContext.resolveAsObject(xpathContext
                .currentXPathContextObject(), attribute);

        if (object instanceof Set) {
            Set<?> set = (Set<?>) object;
            if (!set.isEmpty()) {
                Object next = set.iterator().next();
                object = next;
            }
        }
        return object;
    }

    /**
     * fetch an tag attribute
     * 
     * @param attribute
     *            attribute name
     * @return value
     */
    protected String fetchAttribute(String attribute)
            throws MissingAttributeException {
        String a = getAttribute(attribute);
        if (a == null) {
            throw new MissingAttributeException(attribute);
        }
        return a;
    }

}
