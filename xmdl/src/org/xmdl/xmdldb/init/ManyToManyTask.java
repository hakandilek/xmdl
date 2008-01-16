package org.xmdl.xmdldb.init;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.init.Task;


public class ManyToManyTask implements Task {


	private final static Logger LOGGER = Logger.getLogger(ManyToManyTask.class);
	
	private final Task createRelation;

	private List<XAttribute> opposites = new ArrayList<XAttribute>();

	public ManyToManyTask(Task createRelation) {
		this.createRelation = createRelation;
	}

	@SuppressWarnings("unchecked")
	public void initialize(Object source, Object destination) {
		if (source != null && source instanceof XClass) {
			XClass clazz = (XClass) source;
			List<XAttribute> attributes = clazz.getAttributes();
			for (XAttribute attribute : attributes) {
				XAssociationType type = attribute.getAssociationType();
				if (XAssociationType.MANY_TO_MANY == type.getValue()) {
					
					LOGGER.debug("ManyToMany: a = " + attribute);
					
					opposites.add(attribute);				
					XAttribute opposite = attribute.getOpposite();
					LOGGER.debug("opposite = " + opposite);
					
					
					if (!opposites.contains(opposite)){
						createRelation.initialize(attribute, null);

					}
					
				}
				
			}
			
		}
		
	}

}
