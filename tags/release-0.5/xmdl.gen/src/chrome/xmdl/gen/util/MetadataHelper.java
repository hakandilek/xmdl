package chrome.xmdl.gen.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;

public class MetadataHelper {

	public MetadataHelper() {
		super();
	}

	public Set<XAttribute> allAttributes(XProject project) {
		Set<XAttribute> list = new HashSet<XAttribute>();
		List<XPackage> packages = project.getPackages();
		for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
			XPackage xPackage = (XPackage) iter.next();
			Set<XAttribute> set = allAttributes(xPackage);
			list.addAll(set);
		}
		return list;
	}

	public Set<XAttribute> allAttributes(XPackage package1) {
		Set<XAttribute> list = new HashSet<XAttribute>();
		List<XClass> classes = package1.getClasses();
		for (Iterator<XClass> iter = classes.iterator(); iter.hasNext();) {
			XClass clazz = (XClass) iter.next();
			List<XAttribute> attributes = clazz.getAttributes();
			list.addAll(attributes);

		}
		return list;
	}

}
