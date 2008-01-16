package org.xmdl.ida.templates.web.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * Template file used to create folder web/target/classes
 * 
 * @author Hakan Dilek
 * 
 */
public class Dummy extends DummyImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/target/classes/dummy.txt");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        return object instanceof XProject;
    }

    @Override
    public String parameterName() {
        return "project";
    }

}
