package org.xmdl.ida.templates.core.rsc;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * Hibernate configuration template file
 * 
 * @author Hakan Dilek
 *
 */
public class HibernateCFG extends HibernateCFGImpl implements Template {

    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/main/resources/hibernate.cfg.xml");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XProject);
    }

}
