package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class CustomTLDImpl
{
  protected static String nl;
  public static synchronized CustomTLDImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    CustomTLDImpl result = new CustomTLDImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "" + NL + "<!DOCTYPE taglib PUBLIC" + NL + "    \"-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN\"" + NL + "    \"http://java.sun.com/dtd/web-jsptaglibrary_1_2.dtd\">" + NL + "" + NL + "<taglib>" + NL + "" + NL + "    <tlib-version>1.0</tlib-version>" + NL + "    <jsp-version>1.2</jsp-version>" + NL + "    <short-name>";
  protected final String TEXT_2 = "-custom tld</short-name>" + NL + "" + NL + "    <description><![CDATA[Custom tag library for this application]]></description>" + NL + "" + NL + "" + NL + "" + NL + "    <tag>" + NL + "" + NL + "       <name>sample</name>" + NL + "       <tag-class>";
  protected final String TEXT_3 = ".ui.web.taglib.SampleTag</tag-class>" + NL + "" + NL + "    </tag>" + NL + "" + NL + "</taglib>";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
    XPackage xPackage = (XPackage) project.getPackages().get(0); 

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
