package org.xmdl.core.templates.dao.hbm;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.core.templates.dao.hbm.impl.AssociationHBMManyToManyImpl;
import org.xmdl.xmdldb.DField;


public class AssociationHBMManyToMany extends AssociationHBMManyToManyImpl
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
			return XAssociationType.MANY_TO_MANY == type.getValue();
		}
		return false;
	}

}
