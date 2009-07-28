/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.Entity;
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
		boolean result = !isBasic(t) && !isEnumeration(t)
				&& !(t instanceof SimpleType);
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

	/**
	 * @param a
	 *            the attribute
	 * @return true if this is an embedded attribute
	 */
	public static boolean isEmbedded(Attribute a) {
		if (a == null)
			return false;
		AssociationType type = associationType(a);
		Type t = a.getType();
		if (!AssociationType.ONE_TO_ONE.equals(type))
			return false;
		if (t instanceof Embed) {
			return true;
		}
		return false;
	}

	public static AssociationType associationType(Attribute attribute) {
		if (attribute != null) {
			if (attribute.isMany()) {
				Attribute ref = opposite(attribute);
				if (ref != null && ref.isMany())
					return AssociationType.ONE_TO_MANY;
				else {
					return AssociationType.ONE_TO_ONE;
				}
			} else {
				Attribute ref = opposite(attribute);
				if (ref != null && ref.isMany())
					return AssociationType.MANY_TO_MANY;
				else {
					return AssociationType.MANY_TO_ONE;
				}
			}
		}
		return AssociationType.ONE_TO_ONE;
	}

	public static Attribute opposite(Attribute attribute) {
		Type type = attribute.getType();
		if (type instanceof Entity) {
			Entity entity = (Entity) type;
			return referenceFor(entity, attribute);
		}
		return null;
	}

	/**
	 * TODO:This method should be revisited when model supports real attribute
	 * references among entities
	 * 
	 * @param entity
	 *            The entity
	 * @param attribute
	 *            referencing attribute
	 * @return the attribute in the given entity that references to the given
	 *         attribute.
	 */
	private static Attribute referenceFor(Entity entity, Attribute attribute) {
		if (entity != null && attribute != null) {
			EObject container = attribute.eContainer();
			if (container instanceof Entity) {
				Entity parentEntity = (Entity) container;
				List<Attribute> attributes = entity.getAttributes();
				for (Attribute a : attributes) {
					Type type = a.getType();
					if (type.equals(parentEntity))
						return a;
				}
			}
		}
		return null;
	}

	public static boolean isChild(Type t) {
		//TODO
		return false;
	}
	
	public static Type master(Type t) {
		//TODO
		return null;
	}	
}
