package org.xmdl.ida.xpath;

import java.util.List;

import org.eclipse.jet.xpath.NodeSet;
import org.eclipse.jet.xpath.XPathFunction;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdldb.DTable;


/**
 * XPath function that checks if the given table is an association table
 * 
 * @author Hakan Dilek
 *
 */
public class IsAssociationFunction implements XPathFunction {

    @SuppressWarnings("unchecked")
    @Override
    public Object evaluate(List args) {

        NodeSet list = (NodeSet) args.get(0);

        if (list != null && list.size() > 0) {
            Object object = list.iterator().next();
            if (object instanceof DTable) {
            	DTable table = (DTable) object;
            	XClass clazz = table.getXClass();
            	return new Boolean(clazz == null);
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

}
