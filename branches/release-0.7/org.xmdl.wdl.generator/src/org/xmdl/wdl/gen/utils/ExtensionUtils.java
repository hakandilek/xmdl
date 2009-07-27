/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.JAVAID;
import org.xmdl.wdl.Project;
import org.xmdl.wdl.SimpleType;
import org.xmdl.wdl.Type;

/**
 * Utility methods used by extensions
 * 
 * @author hakan
 * 
 */
public class ExtensionUtils {

	static List<String> BASIC_TYPES = Arrays.asList(new String[] { "int",
			"void", "String", "boolean", "double", "byte", "char", "float",
			"short", "long", "Boolean", "Double", "Byte", "Character", "Float",
			"Short", "Long",

			"java.lang.String", "java.lang.Integer", "java.lang.Boolean",
			"java.lang.Double", "java.lang.Byte", "java.lang.Character",
			"java.lang.Float", "java.lang.Short", "java.lang.Long",

	});

	public static boolean isReference(Type t) {
		boolean result = !isBasic(t) && !isEnumeration(t);
		return result;
	}

	public static boolean isBasic(Type t) {
		return BASIC_TYPES.contains(qualifiedName(t));
	}

	public static boolean isEnumeration(Type t) {
		return t instanceof org.xmdl.wdl.Enum;
	}

	public static boolean isEmbed(Type t) {
		return t instanceof Embed;
	}

	public static boolean isPrimitive(Type t) {
		return !qualifiedName(t).contains(".");
	}

	public static boolean isComparable(Type t) {
		return isEnumeration(t) || isBasic(t);
	}

	public static String simpleName(Type t) {
		String name = t.getName();
		return name;
	}

	public static String qualifiedName(Type t) {
		String name = t.getName();
		if (t instanceof SimpleType) {
			SimpleType st = (SimpleType) t;
			JAVAID mappedType = st.getMappedType();
			if (mappedType != null)
				name = mappedType.getName();
		} else {
			// Embed, Entity, or Enum
			Project p = projectOf(t);
			if (p != null) {
				String basePackage = p.getBasePackage();
				name = basePackage + ".model." + t.getName();
			}
		}
		return name;
	}

	public static Project projectOf(Type selected) {
		EObject parent = selected;
		while (parent != null && !(parent instanceof Project)) {
			parent = parent.eContainer();
		}
		return (Project) parent;
	}
}
