package org.xmdl.validation;

import org.eclipse.xtext.validation.Check;
import org.xmdl.wdl.Type;
import org.xmdl.wdl.WdlPackage;
 

public class WDLJavaValidator extends AbstractWDLJavaValidator {

	@Check
	public void checkTypeNameStartsWithCapital(Type type) {
		if (!Character.isUpperCase(type.getName().charAt(0))) {
			warning("Name should start with a capital", WdlPackage.TYPE__NAME);
		}
	}
}
