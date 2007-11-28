package chrome.xmdl.core.templates.dao.hbm;

import chrome.xmdl.XAssociationType;
import chrome.xmdl.XAttribute;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.dao.hbm.impl.AssociationHBMManyToOneImpl;
import chrome.xmdldb.DField;

public class AssociationHBMManyToOne extends AssociationHBMManyToOneImpl 
		implements TemplateConfiguration {

	public String targetFile(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean accept(Object object) {
		if (object instanceof DField) {
			DField field = (DField) object;
			XAttribute attribute = field.getXAttribute();
			XAssociationType type = attribute.getAssociationType();
			return XAssociationType.MANY_TO_ONE == type.getValue();
		}
		return false;
	}

}
