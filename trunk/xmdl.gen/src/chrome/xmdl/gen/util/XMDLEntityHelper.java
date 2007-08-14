package chrome.xmdl.gen.util;

import chrome.xmdl.XClass;

public class XMDLEntityHelper extends XMDLClassHelper {

	public static final ClassHelper INSTANCE = new XMDLEntityHelper(); 
	
	protected XMDLEntityHelper() {
		super();
	}
	
	public String getExtendsAndImplementsLitteral(XClass xClass) {
		String s = super.getExtendsAndImplementsLitteral(xClass);
		//find "implements" expression and insert just after it.
		int idx = s.indexOf("implements");
		if (idx >= 0) {
			int idx2 = idx + "implements".length();
			s = new StringBuffer(s.substring(0, idx2))
			.append(" Entity, ")
			.append(s.substring(idx2+1, s.length())).toString();
		}else {
			s += " implements Entity ";
		}
		return s;
	}


}
