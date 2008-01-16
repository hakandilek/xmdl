/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdl.impl;

import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;

class XTypeHelper {

	protected static final XTypeHelper INST = new XTypeHelper();

	protected XTypeHelper() {
		super();
	}

	public String getClassName(XType t) {
		boolean primitive = t.isPrimitive();
		String prefix = primitive ? "" : t.getXPackage().getName() + ".";
		return prefix + t.getName();
	}

	public void setClassName(XType t, String newClassName) {
	}

	public void unsetClassName(XType t) {
	}

	public boolean isSetClassName(XType t) {
		return true;
	}

	public boolean isPrimitive(XType t) {
		XPackage p = t.getXPackage();
		if (p != null) {
			String name = p.getName();
			if (name != null && name.length() > 0 && !name.startsWith("<")
					&& !name.endsWith(">")) {
				return false;
			}
		}
		return true;
	}

	public boolean isBasic(XType t) {
		return XmdlTypes.contains(t);
//		XPackage pack = t.getXPackage();
//		if (pack==null)return false;
//		String name = pack.getName();
//		return isPrimitive(t)
//				|| (pack != null && name.startsWith("java."));
	}

	public int compareTo(XType t, Object o) {
		if (o != null && o instanceof XType) {
			XType type = (XType) o;
			String s1 = getClassName(t);
			String s2 = type.getClassName();
			return s1.compareTo(s2);
		}
		return 0;
	}

} //XTypeHelperImpl
