package chrome.xmdl.core.templates.ui.web.jsp.part.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class SearchFormFieldDateImpl
{
  protected static String nl;
  public static synchronized SearchFormFieldDateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SearchFormFieldDateImpl result = new SearchFormFieldDateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<layout:row>" + NL + "    <layout:date name=\"";
  protected final String TEXT_2 = "Form\" property=\"";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = "Min\" styleClass=\"";
  protected final String TEXT_5 = "Min\"  " + NL + "    \tkey=\"";
  protected final String TEXT_6 = ".form.";
  protected final String TEXT_7 = "Min\" editType=\"date\" patternKey=\"date.format\" />" + NL + "    <layout:date name=\"";
  protected final String TEXT_8 = "Form\" property=\"";
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = "Max\" styleClass=\"";
  protected final String TEXT_11 = "Max\"  " + NL + "    \tkey=\"";
  protected final String TEXT_12 = ".form.";
  protected final String TEXT_13 = "Max\" editType=\"date\" patternKey=\"date.format\" />" + NL + "</layout:row>" + NL + "" + NL + "   \t";

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
    stringBuffer.append(formName);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.uncapSafeName(attrib));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
