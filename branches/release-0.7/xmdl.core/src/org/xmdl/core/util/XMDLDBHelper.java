package org.xmdl.core.util;

import java.util.Locale;

import org.xmdl.core.templates.dao.hbm.AssociationHBMManyToMany;
import org.xmdl.core.templates.dao.hbm.AssociationHBMManyToOne;
import org.xmdl.core.templates.dao.hbm.AssociationHBMOneToMany;
import org.xmdl.core.templates.dao.hbm.AssociationHBMOneToOne;
import org.xmdl.gen.util.DBHelper;
import org.xmdl.xgen.Template;
import org.xmdl.xgen.TemplateAdapter;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;


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
			return new TemplateAdapter(new AssociationHBMOneToOne());

		case XAssociationType.ONE_TO_MANY:
			return new TemplateAdapter(new AssociationHBMOneToMany());

		case XAssociationType.MANY_TO_ONE:
			return new TemplateAdapter(new AssociationHBMManyToOne());

		case XAssociationType.MANY_TO_MANY:
			return new TemplateAdapter(new AssociationHBMManyToMany());

		default:
			return null;
		}
	}

}
