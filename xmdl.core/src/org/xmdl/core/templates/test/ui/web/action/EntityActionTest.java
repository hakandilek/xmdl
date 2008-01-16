package org.xmdl.core.templates.test.ui.web.action;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.core.templates.test.ui.web.action.impl.EntityActionTestImpl;


public class EntityActionTest extends EntityActionTestImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XClass class1 = (XClass) object;
		StringBuffer buffer = new StringBuffer("test/src");
		XPackage package1 = class1.getXPackage();
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/ui/web/action/");
		buffer.append(class1.getName());
		buffer.append("ActionTest.java");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
