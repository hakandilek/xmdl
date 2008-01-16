package org.xmdl.gen.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.xmdl.xmdl.XAssociationBehaviour;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XType;


/**
 * This class contains helper methods for needed for master/child pattern
 * operations.
 * 
 * $Id$
 * 
 * @author hd
 * 
 */
public class MasterChildHelper {
	private final static Logger LOGGER = Logger.getLogger(MasterChildHelper.class);

	public static final MasterChildHelper INST = new MasterChildHelper();

	protected MasterChildHelper() {
		super();
		LOGGER.debug("MasterChildHelper()");
	}

	/**
	 * Checks if a class is a child class.
	 * 
	 * @param xClass
	 *            class to be checked
	 * @return true if child, false otherwise
	 */
	public boolean isChild(XClass xClass) {
		LOGGER.debug("isChild(xClass)");
		List<XAttribute> attributes = xClass.getAttributes();
		for (Iterator<XAttribute> it = attributes.iterator(); it.hasNext();) {
			XAttribute attribute = (XAttribute) it.next();
			XAssociationType associationType = attribute.getAssociationType();
			if (XAssociationType.MANY_TO_ONE_LITERAL == associationType) {
				XAttribute opposite = attribute.getOpposite();
				if (opposite != null) {
					XAssociationBehaviour oppositeBehaviour = opposite
							.getAssociationBehaviour();
					XAssociationType oppositeType = opposite
							.getAssociationType();
					return (XAssociationBehaviour.COMPOSITION_LITERAL == oppositeBehaviour && XAssociationType.ONE_TO_MANY_LITERAL == oppositeType);
				}
			}
		}
		return false;
	}

	/**
	 * Checks if a class is a master class.
	 * 
	 * @param xClass
	 *            class to be checked
	 * @return true if master, false otherwise
	 */
	public boolean isMaster(XClass xClass) {
		LOGGER.debug("isMaster(xClass)");
		List<XAttribute> attributes = xClass.getAttributes();	
		for (Iterator<XAttribute> it = attributes.iterator(); it.hasNext();) {
			XAttribute attribute = (XAttribute) it.next();
			if(isChild(attribute)){
				return true;
			}		 
		}
		
		MetadataHelper helper = new MetadataHelper();
		XProject project = xClass.getXPackage().getProject();
		Set<XAttribute> allAttributes = helper.allAttributes(project);
		for (XAttribute attribute : allAttributes) {
			if (xClass.equals(attribute.getType()) 
					&& isChild(attribute)) {
				return false;
			}			
		}
		return true;
	}

	/**
	 * Returns master class of the given class if that class is a child class
	 * 
	 * @param xClass
	 *            child class
	 * @return master class
	 * @see #isChild(XClass);
	 */
	public XClass getMaster(XClass xClass) {
		LOGGER.debug("getMaster(xClass)");
		if (isChild(xClass)) {
			
			List<XAttribute> attributes = xClass.getAttributes();
			for (Iterator<XAttribute> it = attributes.iterator(); it.hasNext();) {
				XAttribute attribute = (XAttribute) it.next();
				XAssociationType associationType = attribute.getAssociationType();
				if (XAssociationType.MANY_TO_ONE_LITERAL == associationType) {
					XAttribute opposite = attribute.getOpposite();
					if (opposite != null) {
						XAssociationBehaviour oppositeBehaviour = opposite
								.getAssociationBehaviour();
						XAssociationType oppositeType = opposite
								.getAssociationType();
						if( (XAssociationBehaviour.COMPOSITION_LITERAL == oppositeBehaviour && XAssociationType.ONE_TO_MANY_LITERAL == oppositeType))
							return opposite.getXClass();
					}
				}
			}
		}
		return null;
	}

    /**
     * Returns the pointing out attribute to master class of the given class if that class is a child class
     * 
     * @param xClass
     *            child class
     * @return the pointing out attribute to master class
     * @see #getMaster(XClass);
     */
    public XAttribute getMasterPointerAttribute(XClass xClass) {
        LOGGER.debug("getMaster(xClass)");
        if (isChild(xClass)) {
            
            List<XAttribute> attributes = xClass.getAttributes();
            for (Iterator<XAttribute> it = attributes.iterator(); it.hasNext();) {
                XAttribute attribute = (XAttribute) it.next();
                XAssociationType associationType = attribute.getAssociationType();
                if (XAssociationType.MANY_TO_ONE_LITERAL == associationType) {
                    XAttribute opposite = attribute.getOpposite();
                    if (opposite != null) {
                        XAssociationBehaviour oppositeBehaviour = opposite
                                .getAssociationBehaviour();
                        XAssociationType oppositeType = opposite
                                .getAssociationType();
                        if( (XAssociationBehaviour.COMPOSITION_LITERAL == oppositeBehaviour && XAssociationType.ONE_TO_MANY_LITERAL == oppositeType))
                            return attribute;
                    }
                }
            }
        }
        return null;
    }

    /**
	 * Returns children of a master class
	 * 
	 * @param xClass
	 *            master class
	 * @return child classes as a list
	 */
	public List<XClass> getChildren(XClass xClass) {
		LOGGER.debug("getChildren(xClass)");
		List<XClass> list = new ArrayList<XClass>();
		List<XAttribute> attributes = xClass.getAttributes();
		for (Iterator<XAttribute> it = attributes.iterator(); it.hasNext();) {
			XAttribute attribute = (XAttribute) it.next();
			XType type = attribute.getType();
			if (type instanceof XClass) {
				XClass clazz = (XClass) type;
				if (clazz != null && isChild(clazz)) {
					list.add(clazz);
				}				
			}
		}
		return list;
	}

	/**
	 * Test an attribute if it is from master to child.
	 * 
	 * @param attribute
	 * @return true is the pointing target attribute is child
	 */
	public boolean isChild(XAttribute attribute) {
		XType type = attribute.getType();
		XAttribute opposite = attribute.getOpposite();
		if (type instanceof XClass && opposite != null) {
			XAssociationType associationType = attribute.getAssociationType();
			XAssociationBehaviour behaviour = attribute
					.getAssociationBehaviour();
			return XAssociationBehaviour.COMPOSITION_LITERAL == behaviour
					&& XAssociationType.ONE_TO_MANY_LITERAL == associationType;
		}

		return false;
	}

}
