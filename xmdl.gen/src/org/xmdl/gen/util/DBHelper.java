package org.xmdl.gen.util;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XPackage;


public abstract class DBHelper {

	protected DBHelper() { }

	public abstract String getTableName(Object object);

	public abstract String getFieldName(Object object);
	
	public abstract String getMappingFile(XPackage pack);
	
	public abstract Template getTemplate(Object object);
	
}
