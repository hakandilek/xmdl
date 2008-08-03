package org.xmdl.genext.xpath;

import java.util.List;

import org.eclipse.jet.xpath.NodeSet;
import org.eclipse.jet.xpath.XPathFunction;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;


/**
 * XPath function that checks if the given type is a persisted class
 * 
 * @author Hakan Dilek
 *
 */
public class IsPersistedFunction implements XPathFunction {

    @SuppressWarnings("unchecked")
    @Override
    public Object evaluate(List args) {

        NodeSet list = (NodeSet) args.get(0);

        if (list != null && list.size() > 0) {
            Object object = list.iterator().next();
            if (object instanceof XClass) {
            	XClass cls = (XClass) object;
            	XClassBehavior behavior = cls.getBehavior();
            	if (behavior == null)
            		return Boolean.TRUE;//default value 
            	if (XClassBehavior.PERSISTED == behavior)
            		return Boolean.TRUE;
            	else 
            		return Boolean.FALSE;
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

}
