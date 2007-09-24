package chrome.xmdl.core.util;

import java.util.Locale;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.core.templates.dao.hbm.*;
import chrome.xmdl.gen.util.DBHelper;
import chrome.xmdl.xgen.Template;

public class XMDLDBHelper extends DBHelper {
	public static final DBHelper INSTANCE = new XMDLDBHelper();

	protected XMDLDBHelper() {
		super();
	}

	public String getTableName(Object object) {
		return getTableName((XClass) object);
	}

	public String getTableName(XClass xClass) {
		String name = xClass.getName();
		String upper = name.toUpperCase(Locale.ENGLISH);
		return "TBL_" + upper;
	}

	public String getFieldName(Object object) {
		return getFieldName((XAttribute) object);
	}

	public String getFieldName(XAttribute attribute) {
		String name = attribute.getName();
		String upper = name.toUpperCase(Locale.ENGLISH);
		return upper;
	}

	@Override
	public String getMappingFile(XPackage pack) {
		String t = pack.getName().replace(".", "/");
		StringBuffer buffer = new StringBuffer();
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/model/");
		// buffer.append(class1.getName());
		buffer.append("package.hbm.xml");
		return buffer.toString();
	}
	
	@Override
	public Template getTemplate(Object object) {
		return getTemplate((XAttribute) object);
	}

	protected Template getTemplate(XAttribute attribute) {
		XAssociationType type = attribute.getAssociationType();
		switch (type.getValue()) {
		case XAssociationType.ONE_TO_ONE:
			return new AssociationHBMOneToOne();

		case XAssociationType.ONE_TO_MANY:
			return new AssociationHBMOneToMany();

		case XAssociationType.MANY_TO_ONE:
			return new AssociationHBMManyToOne();

		case XAssociationType.MANY_TO_MANY:
			return new AssociationHBMManyToMany();

		default:
			return null;
		}
	}

}
