package org.xmdl.genext.taglib.xd;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;

import chrome.xmdl.XClass;
import chrome.xmdl.meta.MetaModelFinder;
import chrome.xmdldb.DTable;

/**
 * Output the name of the table from the DB model corresponding to the given
 * class
 * 
 * @author Hakan Dilek
 * 
 */
public class TableNameTag extends BaseEmptyTag {

	public TableNameTag() {
	}

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {
		Object object = fetchObject(context, "class");

		String result = "";
		if (object instanceof XClass) {
			XClass clazz = (XClass) object;
			DTable table = MetaModelFinder.findTable(clazz);
			if (table != null) {
				String name = table.getName();
				result = name;
			}
		}
		out.write(result);

	}

}
