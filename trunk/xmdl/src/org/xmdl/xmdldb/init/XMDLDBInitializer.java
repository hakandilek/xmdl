package org.xmdl.xmdldb.init;

import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.init.Assertion;
import org.xmdl.xmdl.init.Initializer;
import org.xmdl.xmdl.init.IsReference;
import org.xmdl.xmdldb.XmdldbFactory;


public class XMDLDBInitializer extends Initializer {

	public XMDLDBInitializer() {
		super();
		addSetPropertyIfDifferent(XProject.class, "name");
		addSetReference(XProject.class, "XProject");
		addCopyChildren(XProject.class, "packages", "DPackages", "XPackage", XmdldbFactory.eINSTANCE.createDPackage());

		addSetPropertyIfMissing(XPackage.class, "name");
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
