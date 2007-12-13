package org.xmdl.genext.xpath;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.jet.xpath.XPathFunction;

public class MethodCallFunction implements XPathFunction {

    @SuppressWarnings("unchecked")
    @Override
    public Object evaluate(List args) {
        Object result = null;
        
        //NodeSet list = (NodeSet) args.get(0);
        //String buffer = XPathUtil.xpathString(args.get(1));

        Object object = args.get(0);
        String methodName = args.get(1) + "";
        Class<?> clazz = object.getClass();
        try {
            Method method = clazz.getMethod(methodName, new Class[] {});
            result = method.invoke(object, new Object[] {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
