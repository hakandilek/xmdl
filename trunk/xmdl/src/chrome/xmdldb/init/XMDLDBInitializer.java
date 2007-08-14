package chrome.xmdldb.init;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.init.Assertion;
import chrome.xmdl.init.Initializer;
import chrome.xmdl.init.IsReference;
import chrome.xmdldb.XmdldbFactory;

public class XMDLDBInitializer extends Initializer {

	public XMDLDBInitializer() {
		super();
		addSetPropertyIfDifferent(XProject.class, "name");
		addSetReference(XProject.class, "XProject");
		addCopyChildren(XProject.class, "packages", "DPackages", "XPackage", XmdldbFactory.eINSTANCE.createDPackage());

		addSetPropertyIfDifferent(XPackage.class, "name");
		addSetReference(XPackage.class, "XPackage");
		addCopyChildren(XPackage.class, "classes", "DTables", "XClass", XmdldbFactory.eINSTANCE.createDTable());
		
		Assertion consider = new ConsiderField();
		addSetPropertyStringUppercaseWithPrefixIfDifferent(XClass.class, "name", "TBL_");
		addSetReference(XClass.class, "XClass");
		addCopyChildren(XClass.class, "attributes", "DFields", "XAttribute", XmdldbFactory.eINSTANCE.createDField(), consider);
		//addIDField(XClass.class);
		
		Assertion isReference = new IsReference();
		//Assertion isManyToOne = new IsManyToOne();
		addSetPropertyStringUppercaseWithPrefixAndSuffixIfDifferent(XAttribute.class, "name",
				"F_", TRUE, "_ID", isReference);
		addSetProperty(XAttribute.class, "length");		
		addSetReference(XAttribute.class, "XAttribute");
		//addAssertionTask(XAttribute.class, new SetManyToOneForeign(), isManyToOne);

		Assertion isManyToMany = new IsManyToMany();
		CreateRelationTableTask createRelationTableTask = new CreateRelationTableTask("TBL_", "_ID");
		addAssertionTask(XAttribute.class, createRelationTableTask, isManyToMany);
	}



}
