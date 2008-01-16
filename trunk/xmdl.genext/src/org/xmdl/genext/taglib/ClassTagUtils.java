package org.xmdl.genext.taglib;

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


/**
 * Utility methods used in the tag library
 * 
 * @author Hakan Dilek
 */
public class ClassTagUtils {

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
     * Capitalize first character in the string
     * 
     * @param attribute
     *            the string
     * @return the capitalized name
     */
    public static String capName(String name) {
        if (name == null)
            return "";
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toUpperCase(Locale.US)
                    + name.substring(1);
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
     * Return the fully qualified path of the given class. e.g. if the Class is
     * {@link String} then, the returned string will be "java/lang/String"
     * 
     * @param clazz
     *            the class
     * @return the fully qualified path
     */
    public static String qualifiedPath(XClass clazz) {
        String name = capName(clazz.getName());
        XPackage package1 = clazz.getXPackage();
        if (package1 != null) {
            String pn = qualifiedPath(package1);
            if (!"".equals(pn))
                name = pn + "/" + name;
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

    /**
     * Return the fully qualified path of the given package e.g. if the package
     * is java.lang then, the returned string will be "java/lang"
     * 
     * @param package1
     *            the package
     * @return the fully qualified path
     */
    public static String qualifiedPath(XPackage package1) {
        String name = package1.getName();
        name = uncapName(name);
        name = name.replaceAll("\\.", "/");
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
     * Return the fully qualified path of the given enumeration. e.g. if the
     * enumeration is {@link ElementType} then, the returned string will be
     * "java.lang.annotation.ElementType"
     * 
     * @param enumeration
     *            the enumeration
     * @return the fully qualified path
     */
    public static String qualifiedPath(XEnumeration enumeration) {
        String name = capName(enumeration.getName());
        XPackage package1 = enumeration.getXPackage();
        if (package1 != null) {
            String pn = qualifiedPath(package1);
            if (!"".equals(pn))
                name = pn + "/" + name;
        }
        return name;
    }

    /**
     * Make lower-case the first character in the string
     * 
     * @param attribute
     *            the string
     * @return the capitalized name
     */
    public static String uncapName(String name) {
        if (name == null)
            return "";
        if (name.length() == 0)
            return name;
        else
            return name.substring(0, 1).toLowerCase(Locale.US)
                    + name.substring(1);
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
     * @param type
     *            the type
     * @return true if the given type is boolean
     */
    public static boolean isBooleanType(XType type) {
        return XmdlTypes.BOOLEAN.equals(type)
                || XmdlTypes.JAVA_BOOLEAN.equals(type);
    }

	public static String importType(XAttribute attribute) {
		return importType(attribute, false);
	}
	
	public static String importType(XAttribute attribute, boolean advance) {
		StringBuffer out = new StringBuffer();
		XAssociationType associationType = attribute.getAssociationType();
		boolean association = (XAssociationType.ONE_TO_MANY_LITERAL == associationType || XAssociationType.MANY_TO_MANY_LITERAL == associationType);
		if (association) {
			out.append("Set<");
		}
		XType type = attribute.getType();
		if (advance) {
			type = XmdlTypes.advance(type); 
		}
		String name = type.getName();
		out.append(name);
		if (association) {
			out.append(">");
		}
		return out.toString();
	}

}
