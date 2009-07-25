package org.xmdl.xmdl;

public class XmdlUtils {

	public static XProject findProjectOf(XClass xClass){
		XPackage xPackage = xClass.getXPackage();
		XProject project = xPackage.getProject();
		return project;
	}

}
