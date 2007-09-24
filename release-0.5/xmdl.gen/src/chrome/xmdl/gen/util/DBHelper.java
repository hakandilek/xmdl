package chrome.xmdl.gen.util;

import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.Template;

public abstract class DBHelper {

	protected DBHelper() { }

	public abstract String getTableName(Object object);

	public abstract String getFieldName(Object object);
	
	public abstract String getMappingFile(XPackage pack);
	
	public abstract Template getTemplate(Object object);
	
}
