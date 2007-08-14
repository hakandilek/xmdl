package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class ValidatorRulesCustomXMLImpl
{
  protected static String nl;
  public static synchronized ValidatorRulesCustomXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ValidatorRulesCustomXMLImpl result = new ValidatorRulesCustomXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE form-validation PUBLIC" + NL + "     \"-//Apache Software Foundation//DTD Commons Validator Rules Configuration 1.2.0//EN\"" + NL + "     \"http://jakarta.apache.org/commons/dtds/validator_1_2_0.dtd\">" + NL + "" + NL + "<form-validation>" + NL + "    <global>" + NL + "    </global>" + NL + "</form-validation>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
