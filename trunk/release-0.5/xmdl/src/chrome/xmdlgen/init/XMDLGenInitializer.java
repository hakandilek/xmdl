package chrome.xmdlgen.init;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.init.Initializer;
import chrome.xmdlgen.XmdlgenFactory;

public class XMDLGenInitializer extends Initializer {

	public XMDLGenInitializer() {
		super();
		addSetPropertyIfDifferent(XProject.class, "name");
		addSetReference(XProject.class, "XProject");
		addCopyChildren(XProject.class, "packages", "GPackages", "XPackage", XmdlgenFactory.eINSTANCE.createGPackage());
		
		addSetPropertyIfDifferent(XPackage.class, "name");
		addSetReference(XPackage.class, "XPackage");
		addCopyChildren(XPackage.class, "classes", "GClasses", "XClass", XmdlgenFactory.eINSTANCE.createGClass());
		
		addSetPropertyIfDifferent(XClass.class, "name");
		addSetConstantPropertyIfDifferent(XClass.class, "persistent", Boolean.TRUE);		
		addSetReference(XClass.class, "XClass");
		addCopyChildren(XClass.class, "attributes", "GAttributes", "XAttribute", XmdlgenFactory.eINSTANCE.createGAttribute());
		
		addSetPropertyIfDifferent(XAttribute.class, "name");
		addSetConstantPropertyIfDifferent(XAttribute.class, "persistent", Boolean.TRUE);		
		addSetReference(XAttribute.class, "XAttribute");
		
	}


}
