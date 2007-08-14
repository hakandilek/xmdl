package chrome.xmdl.core.templates.ui.web.jsp.part.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class FormFieldDefaultImpl
{
  protected static String nl;
  public static synchronized FormFieldDefaultImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    FormFieldDefaultImpl result = new FormFieldDefaultImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<layout:text name=\"";
  protected final String TEXT_2 = "Form\" property=\"";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = "\" styleClass=\"";
  protected final String TEXT_5 = "\"  " + NL + "\tkey=\"";
  protected final String TEXT_6 = ".form.";
  protected final String TEXT_7 = "\"  />";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XAttribute attrib = (XAttribute) argument;
	XClass xClass = attrib.getXClass();	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	String formName = UIHelper.formObject(xClass);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(formName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(attrib));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
