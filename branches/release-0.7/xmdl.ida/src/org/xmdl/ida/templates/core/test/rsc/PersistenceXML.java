package org.xmdl.ida.templates.core.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * Persistence configuration template file
 * 
 * @author Hakan Dilek
 *
 */
public class PersistenceXML extends PersistenceXMLImpl implements Template {

    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/test/resources/META-INF/persistence.xml");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XProject);
    }

	@Override
	public String parameterName() {
		return "project";
	}

}
