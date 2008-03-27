package org.xmdl.ida.taglib;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.meta.MetaModelFinder;
import org.xmdl.xgen.AssociationManager;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdldb.DField;
import org.xmdl.xmdldb.DTable;

/**
 * 
 * Outputs association annotations for the given reference attribute
 * 
 * @author Hakan Dilek
 * 
 */
public class AssociationTag extends BaseEmptyTag {

	public AssociationTag() {
	}

	@Override
	public void doAction(TagInfo info, JET2Context context, JET2Writer out)
			throws JET2TagException {
		Object object = fetchObject(context, "attribute");

		if (object instanceof XAttribute) {
			XAttribute att = (XAttribute) object;

			String columnName = "";
			String fieldName = "";
			XAttribute opposite = null;
			
			StringBuffer sb = new StringBuffer();
			if (att.isReference()) {
				XAssociationType type = att.getAssociationType();
				AssociationManager associationManager = AssociationManager.getInstance();
				switch (type.getValue()) {
				case XAssociationType.ONE_TO_ONE:
					// TODO:how is this defined?

					break;
				case XAssociationType.ONE_TO_MANY:
					// Sample:
					// @OneToMany(cascade = CascadeType.REMOVE, mappedBy =
					// ("product"))

					opposite = att.getOpposite();
					if (opposite != null) {
						fieldName = opposite.getName();
					}
					sb.append("@OneToMany(");
					sb.append("cascade = CascadeType.REMOVE, ");
					sb.append("mappedBy = (\"");
					sb.append(fieldName);
					sb.append("\"))");

					break;
				case XAssociationType.MANY_TO_ONE:
					// Sample:
					// @ManyToOne()
					// @JoinColumn(name = ("orderId"), nullable = false)

					DField col = MetaModelFinder.findColumn(att);
					if (col != null) {
						columnName = col.getName();
					}
					sb.append("@ManyToOne()");
					sb.append(System.getProperty("line.separator"));
					sb.append("\t@JoinColumn(");
					sb.append("name = (\"");
					sb.append(columnName);
					sb.append("\"))");

					break;
				case XAssociationType.MANY_TO_MANY:
					if (!associationManager.isRegistered(att)) {
						/**
						 * sample:
						 * <code>
						 * @ManyToMany(targetEntity = Supplier.class, cascade = {
						 *                          CascadeType.PERSIST,
						 *                          CascadeType.MERGE })
						 * @JoinTable(name = "t_product_supplier", 
						 * 		joinColumns = {
						 * 			@JoinColumn(name = "product_id") },
						 *                  inverseJoinColumns = {
						 * 			@JoinColumn(name = "supplier_id") })
						 * private Set<Supplier> suppliers = new HashSet<Supplier>();
						 * </code>
						 */

						associationManager.register(att);
						String columnName1 = "";
						String columnName2 = "";
						String assocTableName = "";
						String typeName = att.getType().getName();
						DField column1 = MetaModelFinder
								.findAssociateColumn(att);
						DField column2 = MetaModelFinder
								.findAssociateOppositeColumn(att);
						if (column1 != null) {
							columnName1 = column1.getName();
							DTable table = column1.getDTable();
							if (table != null)
								assocTableName = table.getName();
						}
						if (column2 != null) {
							columnName2 = column2.getName();
							if ("".equals(assocTableName)) {
								DTable table = column2.getDTable();
								if (table != null)
									assocTableName = table.getName();
							}
						}

						sb.append("@ManyToMany(");
						sb.append("targetEntity = ").append(typeName).append(
								".class").append(", ");
						sb.append("cascade = {CascadeType.PERSIST, ");
						sb.append("CascadeType.MERGE })");
						sb.append(System.getProperty("line.separator"));
						sb.append("    ");
						sb.append("@JoinTable(name = \"")
								.append(assocTableName).append("\",");
						sb.append("    joinColumns = { @JoinColumn(name = \"")
								.append(columnName2).append("\") },");
						sb.append("    inverseJoinColumns = { ");
						sb.append("@JoinColumn(name = \"").append(columnName1)
								.append("\") })");
					} else {
						/**
						 * sample:
						 * <code>
						 * @ManyToMany(cascade = { CascadeType.PERSIST,
						 *                     CascadeType.MERGE }, 
						 *             mappedBy = "suppliers", 
						 *             targetEntity = Product.class)
						 * private Set<Product> products = new HashSet<Product>();
						 * </code>
						 */
						String typeName = att.getType().getName();
						opposite = att.getOpposite();
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
			out.write(sb);
		}
	}
}
