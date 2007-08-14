package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class ValidationXMLImpl
{
  protected static String nl;
  public static synchronized ValidationXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ValidationXMLImpl result = new ValidationXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + NL + "<!DOCTYPE form-validation PUBLIC \"-//Apache Software Foundation//DTD Commons Validator Rules Configuration 1.1//EN\" \"http://jakarta.apache.org/commons/dtds/validator_1_1.dtd\">" + NL + "" + NL + "<form-validation>" + NL + "    <global>" + NL + "        <constant>" + NL + "            <constant-name>phone</constant-name>" + NL + "            <constant-value>^\\(?(\\d{3})\\)?[-| ]?(\\d{3})[-| ]?(\\d{4})$</constant-value>" + NL + "        </constant>" + NL + "        <constant>" + NL + "            <constant-name>zip</constant-name>" + NL + "            <constant-value>^\\d{5}\\d*$</constant-value>" + NL + "        </constant>" + NL + "        <constant>" + NL + "            <constant-name>currency</constant-name>" + NL + "            <constant-value>^\\d{1,3}(,?\\d{1,3})*\\.?(\\d{1,2})?$</constant-value>" + NL + "        </constant>" + NL + "    </global>" + NL + "        <!--" + NL + "          Define form validation config in validation-forms.xml" + NL + "        -->" + NL + "" + NL + "    <formset>" + NL + "\t";
  protected final String TEXT_2 = NL + "        <form name=\"";
  protected final String TEXT_3 = "Form\">" + NL + "\t\t    ";
  protected final String TEXT_4 = NL + "            <field property=\"";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = "\" depends=\"required\">" + NL + "                <msg name=\"required\" key=\"errors.required\"/>" + NL + "" + NL + "                <arg0 key=\"";
  protected final String TEXT_7 = ".form.";
  protected final String TEXT_8 = "\"/>" + NL + "            </field>            " + NL + "        \t  ";
  protected final String TEXT_9 = NL + "        </form>";
  protected final String TEXT_10 = NL + "    </formset>" + NL + "\t" + NL + "</form-validation>";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    for (Iterator i = project.getPackages().iterator(); i.hasNext();) {
	    XPackage xPackage = (XPackage) i.next();
		for (Iterator i2 = xPackage.getClasses().iterator(); i2.hasNext();) {
		    XClass xClass = (XClass) i2.next();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_3);
    for (Iterator i3= xClass.getAttributes().iterator(); i3.hasNext();) {
	    		XAttribute attribute = (XAttribute) i3.next();
	    		XType type = attribute.getType();
	    		if (!(type instanceof XEnumeration 
	    			|| attribute.isReference()
	    			|| type == XmdlTypes.BOOLEAN
	    			|| type == XmdlTypes.JAVA_BOOLEAN)){
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_8);
    }
        	}
    stringBuffer.append(TEXT_9);
    }  
	  } 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
