package chrome.xmdl.core.templates.test.ui.web.action;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.core.templates.test.ui.web.action.impl.EntityActionTestImpl;
import chrome.xmdl.xgen.Template;

public class EntityActionTest extends EntityActionTestImpl implements Template {

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
