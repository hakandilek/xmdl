package chrome.xmdl.core.templates.dao.hbm;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.core.templates.dao.hbm.impl.AssociationHBMManyToManyImpl;
import chrome.xmdl.xgen.Template;
import chrome.xmdldb.DField;

public class AssociationHBMManyToMany extends AssociationHBMManyToManyImpl
		implements Template {

	public String targetFile(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean accept(Object object) {
		if (object instanceof DField) {
			DField field = (DField) object;
			XAttribute attribute = field.getXAttribute();
			XAssociationType type = attribute.getAssociationType();
			return XAssociationType.MANY_TO_MANY == type.getValue();
		}
		return false;
	}

}
