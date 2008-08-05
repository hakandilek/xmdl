package org.xmdl.genext.xpath;

import java.util.List;

import org.eclipse.jet.xpath.NodeSet;
import org.eclipse.jet.xpath.XPathFunction;
import org.xmdl.gen.util.AttributeHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;


/**
 * XPath function that checks if the given type is an embedded class
 * 
 * @author Hakan Dilek
 *
 */
public class IsEmbededFunction implements XPathFunction {

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
            		return Boolean.FALSE;//default value 
            	if (XClassBehavior.EMBEDDABLE == behavior)
            		return Boolean.TRUE;
            	else 
            		return Boolean.FALSE;
            } else if (object instanceof XAttribute){
            	XAttribute att = (XAttribute) object;
            	return AttributeHelper.getInstance().isEmbeded(att);
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

}
