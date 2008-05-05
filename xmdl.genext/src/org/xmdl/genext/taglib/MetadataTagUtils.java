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

}
