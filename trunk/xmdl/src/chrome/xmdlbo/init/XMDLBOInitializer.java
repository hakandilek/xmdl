package chrome.xmdlbo.init;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.init.Initializer;
import chrome.xmdlbo.XmdlboFactory;

public class XMDLBOInitializer extends Initializer {

	public XMDLBOInitializer() {
		super();
		addSetPropertyIfDifferent(XProject.class, "name");
		addSetReference(XProject.class, "XProject");
		addCopyChildren(XProject.class, "packages", "BPackages", "XPackage",
				XmdlboFactory.eINSTANCE.createBPackage());

		addSetPropertyIfDifferent(XPackage.class, "name");
		addSetReference(XPackage.class, "XPackage");
		addCopyChildren(XPackage.class, "classes", "services", "XClass",
				XmdlboFactory.eINSTANCE.createBService());

		addSetPropertyWithPrefixIfDifferent(XClass.class, "name", "", "Service");
		addSetReference(XClass.class, "XClass");

//		addTask(XClass.class, new AddEditMethodTask());
	}

}
