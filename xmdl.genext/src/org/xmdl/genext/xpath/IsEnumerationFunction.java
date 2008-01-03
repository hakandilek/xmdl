package org.xmdl.genext.xpath;

import java.util.List;

import org.eclipse.jet.xpath.NodeSet;
import org.eclipse.jet.xpath.XPathFunction;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XType;

/**
 * XPath function that checks if the given attribute or type is an enumeration type
 * 
 * @author Hakan Dilek
 *
 */
public class IsEnumerationFunction implements XPathFunction {

    @SuppressWarnings("unchecked")
    @Override
    public Object evaluate(List args) {

        NodeSet list = (NodeSet) args.get(0);

        if (list != null && list.size() > 0) {
            Object object = list.iterator().next();
            if (object instanceof XAttribute) {
                XAttribute att = (XAttribute) object;
                XType type = att.getType();
                return new Boolean(type instanceof XEnumeration);
            } else if (object instanceof XEnumeration) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

}
