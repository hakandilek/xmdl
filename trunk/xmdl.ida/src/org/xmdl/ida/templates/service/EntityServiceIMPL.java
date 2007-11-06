package org.xmdl.ida.templates.service;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * The Service implementation template file
 * 
 * @author Hakan Dilek
 *
 */
public class EntityServiceIMPL extends EntityServiceIMPLImpl implements Template {

    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/service/impl/");
        buffer.append(cls.getName());
        buffer.append(".java");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XClass);
    }

}
