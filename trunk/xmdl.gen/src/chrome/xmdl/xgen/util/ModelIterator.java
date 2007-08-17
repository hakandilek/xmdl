package chrome.xmdl.xgen.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;

public class ModelIterator implements Iterator<EObject>{
	private Iterator<EObject> iterator=null; 
	
	public ModelIterator(XProject root) {
		
		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(root);
		List<XPackage> packages = root.getPackages();
		for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
			XPackage element = iter.next();
			list.add(element);
			List<XClass> classes = element.getClasses();
			for (Iterator<XClass> iterator = classes.iterator(); iterator.hasNext();) {
				XClass class1 =  iterator.next();
				list.add(class1);
			}
			List<XEnumeration> enumerations = element.getEnumerations();
			for (Iterator<XEnumeration> iterator = enumerations.iterator(); iterator.hasNext();) {
				XEnumeration enumer= iterator.next();
				list.add(enumer);
			}
		}
		iterator=list.iterator();
	}
	public ModelIterator(DModel root) {
		
		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(root);
		List<DPackage> packages = root.getDPackages();
		for (Iterator<DPackage> iter = packages.iterator(); iter.hasNext();) {
			DPackage element = (DPackage) iter.next();
			list.add(element);
			List<DTable> tables = element.getDTables();
			for (Iterator<DTable> iterator = tables.iterator(); iterator.hasNext();) {
				DTable class1 = (DTable) iterator.next();
				list.add(class1);
			}
		}
		iterator=list.iterator();
	}
	public boolean hasNext() {
		return iterator.hasNext();
	}

	public EObject next() {
		return iterator.next();
	}

	public void remove() {
		iterator.remove();
	}

}
