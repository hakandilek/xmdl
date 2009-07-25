package org.xmdl.core.templates.dao.hbm;

import org.xmdl.xgen.*;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.core.templates.dao.hbm.impl.AssociationHBMOneToManyImpl;
import org.xmdl.xmdldb.DField;


public class AssociationHBMOneToMany extends AssociationHBMOneToManyImpl 
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
			return XAssociationType.ONE_TO_MANY == type.getValue();
		}
		return false;
	}

}
