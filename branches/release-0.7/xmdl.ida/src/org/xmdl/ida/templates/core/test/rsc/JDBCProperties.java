package org.xmdl.ida.templates.core.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * JDBC properties (jdbc.properties) template file
 * 
 * @author Hakan Dilek
 * 
 */
public class JDBCProperties extends JDBCPropertiesImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("core/src/test/resources/jdbc.properties");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

	@Override
	public String parameterName() {
		return "project";
	}

}
