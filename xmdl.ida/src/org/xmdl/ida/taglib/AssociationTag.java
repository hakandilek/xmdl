package org.xmdl.ida.taglib;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.meta.MetaModelFinder;
import chrome.xmdldb.DField;

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
			StringBuffer sb = new StringBuffer();
			if (att.isReference()) {
				XAssociationType type = att.getAssociationType();
				switch (type.getValue()) {
				case XAssociationType.ONE_TO_ONE:
					// TODO:how is this defined?

					break;
				case XAssociationType.ONE_TO_MANY:
					// Sample:
					// @OneToMany(cascade = CascadeType.REMOVE, mappedBy =
					// ("product"))

					String fieldName = "";
					XAttribute opposite = att.getOpposite();
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

					String columnName = "";
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
					// TODO:how is this defined?

					break;
				default:
					break;
				}

			}
			out.write(sb);
		}
	}
}
