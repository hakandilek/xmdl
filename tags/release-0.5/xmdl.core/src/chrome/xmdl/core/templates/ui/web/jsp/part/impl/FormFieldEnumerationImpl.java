package chrome.xmdl.core.templates.ui.web.jsp.part.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;

public class FormFieldEnumerationImpl
{
  protected static String nl;
  public static synchronized FormFieldEnumerationImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    FormFieldEnumerationImpl result = new FormFieldEnumerationImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t<layout:select name=\"";
  protected final String TEXT_2 = "Form\" property=\"";
  protected final String TEXT_3 = "\" styleClass=\"";
  protected final String TEXT_4 = "\" " + NL + "    \tkey=\"";
  protected final String TEXT_5 = ".form.";
  protected final String TEXT_6 = "\" >" + NL + "\t";
  protected final String TEXT_7 = NL + "        <layout:option key=\"";
  protected final String TEXT_8 = ".form.";
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = "\" value=\"";
  protected final String TEXT_11 = "\" />" + NL + "\t";
  protected final String TEXT_12 = NL + "    </layout:select>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XAttribute attrib = (XAttribute) argument;
	XClass xClass = attrib.getXClass();
	XEnumeration enumeration = (XEnumeration) attrib.getType(); 	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	String formName = UIHelper.formObject(xClass);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(formName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.uncapSafeName(attrib));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_6);
    for (Iterator<XEnumerationLiteral> i= enumeration.getLiterals().iterator(); i.hasNext();) {
	    XEnumerationLiteral lit = (XEnumerationLiteral) i.next();
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(lit.getValue());
    stringBuffer.append(TEXT_11);
     } 
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
