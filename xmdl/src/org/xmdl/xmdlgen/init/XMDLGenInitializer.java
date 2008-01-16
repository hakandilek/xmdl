package org.xmdl.xmdlgen.init;

import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.init.Initializer;
import org.xmdl.xmdlgen.XmdlgenFactory;


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
