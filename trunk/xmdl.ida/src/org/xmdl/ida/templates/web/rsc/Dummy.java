package org.xmdl.ida.templates.web.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

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
