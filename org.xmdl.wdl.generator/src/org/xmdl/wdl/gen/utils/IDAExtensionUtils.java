/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.Locale;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.Type;

/**
 * Utility methods used by extensions
 * 
 * @author hakan
 * 
 */
public class IDAExtensionUtils extends ExtensionUtils {

	public static String associationAnnotation(Attribute attribute) {
		StringBuffer sb = new StringBuffer();

		String columnName = "";
		String fieldName = "";
		Attribute opposite = null;

		Type type = attribute.getType();
		if (isReference(type)) {
			AssociationManager associationManager = AssociationManager
					.getInstance();
			AssociationType assType = associationType(attribute);
			switch (assType) {
			case ONE_TO_ONE:
				if (isEmbedded(attribute)) {
					// Sample:
					// @Embedded
					sb.append("@Embedded");
				} else {
					// Sample:
					// @OneToOne(cascade = CascadeType.ALL)
					// @PrimaryKeyJoinColumn
					sb.append("@OneToOne(cascade = CascadeType.ALL)");
					sb.append(System.getProperty("line.separator"));
					sb.append("@PrimaryKeyJoinColumn");
				}

				break;
			case ONE_TO_MANY:
				// @OneToMany(cascade = CascadeType.REMOVE, mappedBy =
				// ("product"))

				opposite = opposite(attribute);
				if (opposite != null) {
					fieldName = opposite.getName();
				}
				sb.append("@OneToMany(");
				sb.append("cascade = CascadeType.REMOVE, ");
				sb.append("mappedBy = (\"");
				sb.append(fieldName);
				sb.append("\"))");

				break;
			case MANY_TO_ONE:
				// Sample:
				// @ManyToOne()
				// @JoinColumn(name = ("orderId"), nullable = false)

				columnName = columnName(attribute);

				sb.append("@ManyToOne()");
				sb.append(System.getProperty("line.separator"));
				sb.append("\t@JoinColumn(");
				sb.append("name = (\"");
				sb.append(columnName);
				sb.append("\"), nullable = false)");

				break;
			case MANY_TO_MANY:
				if (!associationManager.isRegistered(attribute)) {
					/**
					 * sample:
					 * 
					 * @ManyToMany(targetEntity = Supplier.class, cascade = {
					 *                          CascadeType.PERSIST,
					 *                          CascadeType.MERGE })
					 * @JoinTable(name = "t_product_supplier", joinColumns = {
					 * @JoinColumn(name = "product_id") }, inverseJoinColumns =
					 *                  {
					 * @JoinColumn(name = "supplier_id") }) private
					 *                  Set<Supplier> suppliers = new
					 *                  HashSet<Supplier>();
					 */

					associationManager.register(attribute);
					opposite = opposite(attribute);

					String columnName1 = associateColumnName(attribute);
					String columnName2 = associateColumnName(opposite);
					String assocTableName = associateTableName(opposite);
					String typeName = attribute.getType().getName();

					sb.append("@ManyToMany(");
					sb.append("targetEntity = ").append(typeName).append(
							".class").append(", ");
					sb.append("cascade = {CascadeType.PERSIST, ");
					sb.append("CascadeType.MERGE })");
					sb.append(System.getProperty("line.separator"));
					sb.append("    ");
					sb.append("@JoinTable(name = \"").append(assocTableName)
							.append("\",");
					sb.append("    joinColumns = { @JoinColumn(name = \"")
							.append(columnName2).append("\") },");
					sb.append("    inverseJoinColumns = { ");
					sb.append("@JoinColumn(name = \"").append(columnName1)
							.append("\") })");
				} else {
					/**
					 * sample: <code>
					 * 
					 * @ManyToMany(cascade = { CascadeType.PERSIST,
					 *                     CascadeType.MERGE }, mappedBy =
					 *                     "suppliers", targetEntity =
					 *                     Product.class) private Set<Product>
					 *                     products = new HashSet<Product>();
					 *                     </code>
					 */
					String typeName = attribute.getType().getName();
					opposite = opposite(attribute);
					fieldName = "";
					if (opposite != null) {
						fieldName = opposite.getName();
					}
					sb.append("@ManyToMany(cascade = { ").append(
							"CascadeType.PERSIST,").append(
							"CascadeType.MERGE },");
					sb.append("mappedBy = \"").append(fieldName).append("\", ");
					sb.append("targetEntity = ").append(typeName).append(
							".class").append(")");
				}

				break;
			default:
				break;
			}

		}
		return sb.toString();
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
		return "F_" + attribute.getName().toUpperCase(Locale.ENGLISH);
	}

	public static String columnSize(Attribute attribute) {
		// TODO:
		return "15";
	}

	public static String tableName(Entity e) {
		return "TBL_" + e.getName().toUpperCase(Locale.ENGLISH);
	}

	public static String associateTableName(Attribute attribute) {
		String name = "TBL_";
		name += attribute.getType().getName().toUpperCase(Locale.ENGLISH);
		EObject container = attribute.eContainer();
		if (container instanceof Entity) {
			Entity e = (Entity) container;
			name += e.getName().toUpperCase(Locale.ENGLISH);
		}
		return name;
	}

	public static String associateColumnName(Attribute attribute) {
		return columnName(attribute);
	}

}
