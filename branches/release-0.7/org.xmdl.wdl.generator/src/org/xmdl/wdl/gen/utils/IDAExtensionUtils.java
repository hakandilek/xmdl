/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import org.eclipse.emf.common.util.EList;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.Entity;

/**
 * Utility methods used by extensions
 * 
 * @author hakan
 * 
 */
public class IDAExtensionUtils extends ExtensionUtils {

	public static String association(Attribute attribute) {
		// TODO:
		return null;
	}

	public static String entityToString(Entity e) {
		return entityToString(e.getName(), e.getAttributes(), false);
	}

	public static String entityToString(Embed e) {
		return entityToString(e.getName(), e.getAttributes(), false);
	}

	public static String searchToString(Entity e) {
		return entityToString(e.getName(), e.getAttributes(), true);
	}

	private static String entityToString(String name,
			EList<Attribute> attributes, boolean isSearch) {
		StringBuffer sb = new StringBuffer();
		sb.append("return MessageFormat.format(\"").append(name);
		int i = 0;
		for (Attribute a : attributes) {
			if (!isReference(a.getType())) {
				if (isSearch && isComparable(a.getType())) {
					sb.append("[").append(a.getName()).append("Min={").append(
							++i).append("}").append("]");
					sb.append("[").append(a.getName()).append("Max={").append(
							++i).append("}").append("]");
				} else {
					sb.append("[").append(a.getName()).append("={").append(++i)
							.append("}").append("], ");
				}
			}
		}
		sb.append("\"");
		for (Attribute a : attributes) {
			if (!isReference(a.getType())) {
				if (isSearch && isComparable(a.getType())) {
					sb.append(", ").append(a.getName()).append("Min ");
					sb.append(", ").append(a.getName()).append("Max ");
				} else {
					sb.append(", ").append(a.getName()).append(" ");
				}
			}
		}
		sb.append(")");
		return sb.toString();
	}

	public static String columnName(Attribute attribute) {
		// TODO:
		return null;
	}

	public static String columnSize(Attribute attribute) {
		// TODO:
		return "0";
	}

	public static String tableName(Entity e) {
		// TODO:
		return null;
	}

}
