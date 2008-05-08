package org.xmdl.genext.taglib;

import org.xmdl.gen.util.MasterChildHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;

/**
 * Utility methods used to access metadataq properties.
 * 
 * @author Hakan Dilek
 * 
 */
public class MetadataTagUtils {

	public static boolean isChild(XAttribute attribute) {
		return MasterChildHelper.INST.isChild(attribute);
	}

	public static boolean isChild(XClass class1) {
		return MasterChildHelper.INST.isChild(class1);
	}

	public static boolean isMaster(XAttribute attribute) {
		return MasterChildHelper.INST.isMaster(attribute);
	}

	public static boolean isMaster(XClass class1) {
		return MasterChildHelper.INST.isMaster(class1);
	}

	public static XClass getMaster(XClass class1) {
		return MasterChildHelper.INST.getMaster(class1);
	}

	public static XClass getMaster(XAttribute attribute) {
		return MasterChildHelper.INST.getMaster(attribute);
	}

	public static XAttribute getMasterPointerAttribute(XClass class1) {
		return MasterChildHelper.INST.getMasterPointerAttribute(class1);
	}

}
