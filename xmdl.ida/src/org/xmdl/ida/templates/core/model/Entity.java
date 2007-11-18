package org.xmdl.ida.templates.core.model;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * The model bean template file
 * 
 * @author Hakan Dilek
 *
 */
public class Entity extends EntityImpl implements Template2 {

    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/model/");
        buffer.append(cls.getName());
        buffer.append(".java");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XClass);
    }

}
