/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.AttributeManyReference;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.JAVAID;
import org.xmdl.wdl.Model;
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

	public static BasicType basicType(Type t) {
		BasicType bt = null;
		final BasicType[] bts = BasicType.values();
		for (BasicType basicType : bts) {
			if (basicType.is(t)) {
				//gotcha!
				bt = basicType;
				break;
			}
		}
		return bt;
	}
	
	public static boolean isReference(Type t) {
		boolean result = !isBasic(t) && !isEnumeration(t)
				&& !(t instanceof SimpleType) && !isEmbed(t);
		return result;
	}

	public static boolean isBasic(Type t) {
		return basicType(t) != null;
	}

	public static boolean isEnumeration(Type t) {
		return t instanceof org.xmdl.wdl.Enumeration;
	}

	public static boolean isEmbed(Type t) {
		return t instanceof Embed;
	}

	public static boolean isPrimitive(Type t) {
		return !qualifiedName(t).contains(".");
	}

	public static boolean isComparable(Type t) {
		if (isEnumeration(t))
			return true;
		BasicType basic = basicType(t);
		if (basic != null && basic.isComparable())
			return true;
		return false;
	}

	public static boolean isString(Type t) {
		return BasicType.STRING.is(t);
	}

	public static boolean isString(Attribute a) {
		return isString(a.getType());
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
		while (parent != null && !(parent instanceof Model)) {
			parent = parent.eContainer();
		}
		if (parent != null) {
			Model model = (Model) parent;
			return model.getProject();
		}
		return null;
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

	public static boolean isMany(Attribute attribute) {
		if (attribute != null) {
			AttributeManyReference manyReference = attribute.getManyReference();
			return manyReference != null && manyReference != AttributeManyReference.NONE;
		}
		return false;
	}
	
	public static AssociationType associationType(Attribute attribute) {
		if (attribute != null) {
			Attribute ref = opposite(attribute);
//			System.out.println("entity    : " + attribute.eContainer());
//			System.out.println("attribute : " + attribute);
//			System.out.println("opposite  : " + ref);
			if (isMany(attribute)) {
				if (ref != null && isMany(ref))
					return AssociationType.MANY_TO_MANY;
				else {
					return AssociationType.ONE_TO_MANY;
				}
			} else {
				if (ref != null && isMany(ref))
					return AssociationType.MANY_TO_ONE;
				else {
					return AssociationType.ONE_TO_ONE;
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
		Type master = master(t);
		return master != null;
	}
	
	/** from master-to-child */
	public static boolean isMaster(Attribute a) {
		AttributeManyReference many = a.getManyReference();
		return many != null && AttributeManyReference.STRONG == many;
	}

	/** from child-to-master */
	public static boolean isChild(Attribute a) {
		Attribute opposite = opposite(a);
		if (opposite != null)
			return isMaster(opposite);
		return false;
	}
	
	public static Type master(Type t) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		if (t instanceof Entity) {
			Entity e = (Entity) t;
			attributes.addAll(e.getAttributes());
		}
		if (t instanceof Embed) {
			Embed e = (Embed) t;
			attributes.addAll(e.getAttributes());
		}
		for (Attribute attribute : attributes) {
			Attribute opposite = opposite(attribute);
			if (opposite != null && isMaster(opposite)) {
				return (Type) opposite.eContainer();
			}
		}
		return null;
	}

	public static String qualifiedName(Attribute attrib) {
	    String name = attrib.getName();
	    EObject eContainer = attrib.eContainer();
	    Type clazz = null;
		if (eContainer != null && eContainer instanceof Type)
	    {
	    	clazz = (Type) eContainer;
	    }
	    if (clazz != null) {
	    	String cn = qualifiedName(clazz);
	        if (!"".equals(cn))
	            name = cn + "." + name;
	    }
	    return name;
	}
	
	public static boolean isFromMany(Attribute attrib) {
		Attribute opposite = opposite(attrib);
		if (opposite != null)
			return isMany(opposite);
		return false;
	}
	
	public static boolean isManyToOne(Attribute attrib) {
		AssociationType type = associationType(attrib);
		return AssociationType.MANY_TO_ONE == type;
	}

	public static Collection<Association> associations(Model model) {
		return AssociationManager.getInstance().getAssociations();
	}
	
}
