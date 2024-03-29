package org.xmdl.ida.templates.core.model;

import org.xmdl.gen.util.XMDLClassHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;


/**
 * The model bean template file
 * 
 * @author Hakan Dilek
 *
 */
public class Enumeration extends EnumerationImpl implements Template {

    public String targetFile(Object object) {
        XEnumeration enm = (XEnumeration) object;
        XPackage pkg = enm.getXPackage();
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/model/");
        buffer.append(enm.getName());
        buffer.append(".java");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XEnumeration);
    }

	@Override
	public String parameterName() {
		return "enumeration";
	}

}
