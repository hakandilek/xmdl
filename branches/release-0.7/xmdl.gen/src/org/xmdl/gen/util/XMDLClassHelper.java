package org.xmdl.gen.util;

import java.lang.annotation.ElementType;
import java.util.Locale;

import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;

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

	/**
	 * Capitalize first character in the name of the attribute
	 * 
	 * @param attribute
	 *            the attribute
	 * @return the capitalized name
	 */
	public static String capName(XAttribute attribute) {
	    return capName(attribute.getName());
	}

	/**
	 * Capitalize first character in the name of the class
	 * 
	 * @param clazz
	 *            the class
	 * @return the capitalized name
	 */
	public static String capName(XClass clazz) {
	    return capName(clazz.getName());
	}

	/**
	 * Capitalize first character in the name of the enumeration
	 * 
	 * @param enumeration
	 *            the enumeration
	 * @return the capitalized name
	 */
	public static String capName(XEnumeration enumeration) {
	    return capName(enumeration.getName());
	}

	/**
	 * Capitalize the name of the enumeration literal
	 * 
	 * @param literal
	 *            the enumeration literal
	 * @return the capitalized name
	 */
	public static String capName(XEnumerationLiteral literal) {
	    String name = literal.getName();
	    return name == null ? "" : name.toUpperCase(Locale.US);
	}

	/**
	 * Make lower-case the first character in the name of the attribute
	 * 
	 * @param attribute
	 *            the attribute
	 * @return the capitalized name
	 */
	public static String uncapName(XAttribute attribute) {
	    return uncapName(attribute.getName());
	}

	/**
	 * Make lower-case the first character in the name of the class
	 * 
	 * @param clazz
	 *            the class
	 * @return the capitalized name
	 */
	public static String uncapName(XClass xClass) {
	    return uncapName(xClass.getName());
	}

	/**
	 * Make lower-case the first character in the name of the enumeration
	 * 
	 * @param enumeration
	 *            the enumeration
	 * @return the capitalized name
	 */
	public static String uncapName(XEnumeration xClass) {
	    return uncapName(xClass.getName());
	}

	/**
	 * Make lower-case the name of the enumeration literal
	 * 
	 * @param literal
	 *            the enumeration literal
	 * @return the capitalized name
	 */
	public static String uncapName(XEnumerationLiteral literal) {
	    String name = literal.getName();
	    return name == null ? "" : name.toLowerCase(Locale.US);
	}

	/**
	 * Return the fully qualified name of the given class. e.g. if the Class is
	 * {@link String} then, the returned string will be "java.lang.String"
	 * 
	 * @param clazz
	 *            the class
	 * @return the fully qualified name
	 */
	public static String qualifiedName(XClass clazz) {
	    String name = capName(clazz.getName());
	    XPackage package1 = clazz.getXPackage();
	    if (package1 != null) {
	        String pn = qualifiedName(package1);
	        if (!"".equals(pn))
	            name = pn + "." + name;
	    }
	    return name;
	}

	/**
	 * Return the fully qualified name of the given attribute. e.g. if the attribute is
	 * {@link String.length} then, the returned string will be "java.lang.String.length"
	 * 
	 * @param attribute
	 *            the attribute
	 * @return the fully qualified name
	 */
	public static String qualifiedName(XAttribute attribute) {
	    String name = uncapName(attribute.getName());
	    XClass clazz = attribute.getXClass();
	    if (clazz != null) {
	    	String cn = qualifiedName(clazz);
	        if (!"".equals(cn))
	            name = cn + "." + name;
	    }
	    return name;
	}

	/**
	 * Return the fully qualified name of the given enumeration. e.g. if the
	 * enumeration is {@link ElementType} then, the returned string will be
	 * "java.lang.annotation.ElementType"
	 * 
	 * @param enumeration
	 *            the enumeration
	 * @return the fully qualified name
	 */
	public static String qualifiedName(XEnumeration enumeration) {
	    String name = capName(enumeration.getName());
	    XPackage package1 = enumeration.getXPackage();
	    if (package1 != null) {
	        String pn = qualifiedName(package1);
	        if (!"".equals(pn))
	            name = pn + "." + name;
	    }
	    return name;
	}

	/**
	 * Return the fully qualified name of the given package e.g. if the package
	 * is java.lang then, the returned string will be "java.lang"
	 * 
	 * @param package1
	 *            the package
	 * @return the fully qualified name
	 */
	public static String qualifiedName(XPackage package1) {
	    String name = package1.getName();
	    name = uncapName(name);
	    name = name.replaceAll("/", ".");
	    return name;
	}

	
}
