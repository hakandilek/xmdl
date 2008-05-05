package org.xmdl.genext.taglib;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.taglib.AbstractEmptyTag;

/**
 * Base empty-tag with support methods.
 * 
 * @author Hakan Dilek
 *
 */
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
    	return BaseTagHelper.fetchObject(this, context, name);
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
    	return BaseTagHelper.fetchAttribute(this, attribute);
    }

}
