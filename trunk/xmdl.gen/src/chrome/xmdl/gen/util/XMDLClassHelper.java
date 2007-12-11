package chrome.xmdl.gen.util;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XPackage;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlTypes;

public class XMDLClassHelper extends ClassHelper {
	private final static org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(XMDLClassHelper.class);
	
	public static final ClassHelper INSTANCE = new XMDLClassHelper();

	protected XMDLClassHelper() {
		super();
	}

	public String getQualifiedName(Object object) {
		return getQualifiedName((XPackage) object);
	}

	public String getQualifiedPath(Object object) {
		return getQualifiedName((XPackage) object).replace(".", "/");
	}

	protected String getQualifiedName(XPackage xPackage) {
		return xPackage.getName();
	}

	public String getCapName(Object object) {
		if (object instanceof XClass) {
			XClass xClass = (XClass) object;
			return getCapName(xClass);
		}

		if (object instanceof XAttribute) {
			XAttribute xAttribute = (XAttribute) object;
			return getCapName(xAttribute);
		}
		
		if (object instanceof XEnumeration) {
			XEnumeration enumeration = (XEnumeration) object;
			return getCapName(enumeration);
		}
		return null;
	}

	public String getCapName(XEnumeration xClass) {
		return capName(xClass.getName());
	}

	public String getCapName(XClass xClass) {
		return capName(xClass.getName());
	}

	public String getCapName(XAttribute attribute) {
		return capName(attribute.getName());
	}

	public String getExtendsAndImplementsLitteral(Object object) {
		return getExtendsAndImplementsLitteral((XClass) object);
	}

	public String getExtendsAndImplementsLitteral(XClass xClass) {
		return "";
	}

	public String getExtendsLitteral(Object object) {
		return getExtendsAndImplementsLitteral((XClass) object);
	}

	public String getExtendsLitteral(XClass xClass) {
		return "";
	}

	public String getImportedAttributeType(Object object) {
		return getImportedAttributeType((XAttribute) object);
	}

	public String getImportedAttributeType(XAttribute xAttribute) {
		XAssociationType associationType = xAttribute.getAssociationType();
		if (XAssociationType.ONE_TO_MANY_LITERAL == associationType
				|| XAssociationType.MANY_TO_MANY_LITERAL == associationType) {
			return MANY_TYPE_FULL;
		}
		XType type = xAttribute.getType();
		return type.getName();
	}

	public String uncapSafeName(Object object) {
		if (object instanceof XAttribute) {
			return uncapSafeName((XAttribute) object);
		}
		if (object instanceof XClass) {
			return uncapSafeName((XClass) object);
		}
		return "Not implemented!";
	}

	public String uncapSafeName(XAttribute xAttribute) {
		return safeName(uncapPrefixedName(xAttribute.getName()));
	}

	public String uncapSafeName(XClass xClass) {
		return safeName(uncapPrefixedName(xClass.getName()));
	}

	public String getDefaultValue(Object object) {
		return getDefaultValue((XAttribute) object);
	}

	public String getDefaultValue(XAttribute xAttribute) {
		XType type = xAttribute.getType();
		if (XmdlTypes.LONG.equals(type))
			return "0L";
		if (XmdlTypes.INT.equals(type))
			return "0";
		if (XmdlTypes.DOUBLE.equals(type))
			return "0d";
		if (XmdlTypes.BOOLEAN.equals(type))
			return "false";
		if (type instanceof XEnumeration) {
			XEnumeration xenum = (XEnumeration) type;
			XEnumerationLiteral defaultLiteral = xenum.getDefaultLiteral();
			if (defaultLiteral != null){
				return getCapName(xenum) + "." + defaultLiteral.getName();
			}
		}
		return xAttribute.getDefaultValue() + "";
	}

	public String getAccessorName(Object object) {
		return getAccessorName((XAttribute) object);
	}

	public String getAccessorName(XAttribute attribute) {
		return getCapName(attribute);
	}

	public String getGetAccessor(XAttribute attribute) {
		String capName = getCapName(attribute);
		String result = isBooleanType(attribute.getType()) ? "is" + capName
				: "get" + ("Class".equals(capName) ? "Class_" : capName);
		return result;
	}

	public boolean isBooleanType(XType modelType) {
		return modelType == XmdlTypes.BOOLEAN
				|| modelType == XmdlTypes.JAVA_BOOLEAN;
	}

	public boolean isBooleanType(XAttribute attribute) {
		return isBooleanType(attribute.getType());
	}

	public boolean isBooleanType(Object object) {
		return isBooleanType((XAttribute) object);
	}

	public String getGetAccessor(Object object) {
		return getGetAccessor((XAttribute) object);
	}

	@Override
	public String getObjectDAOName(XClass clz) {
		return clz.getXPackage().getName() + ".dao." + clz.getName() + "DAO";
	}

	@Override
	public String getObjectDAOImplName(XClass clz) {
		return clz.getXPackage().getName() + ".dao.impl." + clz.getName()
				+ "DAOImpl";
	}

	@Override
	public String getObjectActionName(XClass clz) {
		return clz.getXPackage().getName() + ".ui.web.action." + clz.getName()
				+ "Action";
	}

	@Override
	public String getObjectFormName(XClass clz) {
		return clz.getXPackage().getName() + ".ui.web.form." + clz.getName()
				+ "Form";
	}

	@Override
	public String getObjectServiceImplName(XClass clz) {
		return clz.getXPackage().getName() + ".bo.impl." + clz.getName()
				+ "ServiceImpl";
	}

	@Override
	public String getObjectName(XClass clz) {
		return clz.getXPackage().getName() + ".model." + clz.getName();
	}

	public String getObjectName(XType type) {
		String className = type.getClassName();
		int last = className.lastIndexOf('.');
		StringBuffer sb = new StringBuffer();
		sb.append(className.substring(0, last));
		sb.append(".model");
		sb.append(className.substring(last, className.length()));
		return sb.toString();
	}

	public String getObjectImplName(XType type) {
		LOGGER.info(type);
		String className = type.getClassName();
		int last = className.lastIndexOf('.');
		StringBuffer sb = new StringBuffer();
		sb.append(className.substring(0, last));
		sb.append(".model.impl");
		sb.append(className.substring(last, className.length()));
		sb.append("Impl");
		return sb.toString();
	}

	@Override
	public String getObjectImplName(XClass clz) {
		XPackage p = clz.getXPackage();
		String pName = p.getName();
		String cName = clz.getName();
		return pName + ".model.impl." + cName
				+ "Impl";

	}

}