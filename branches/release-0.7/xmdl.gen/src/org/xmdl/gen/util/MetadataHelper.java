package org.xmdl.gen.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;


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

	/**
	 * Return the project, traversing the metadata tree upwards from the
	 * selected element.
	 * 
	 * @param selected
	 *            the selected element
	 * @return the project element
	 */
	public XProject getProject(EObject selected) {
		EObject parent = selected;
		while (parent != null && !(parent instanceof XProject)) {
			parent = parent.eContainer();
		}
		return (XProject) parent;
	}

}
