package org.xmdl.core.templates.ui.web.include.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;

public class MenuJSPImpl
{
  protected static String nl;
  public static synchronized MenuJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    MenuJSPImpl result = new MenuJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "" + NL + "<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"styles/tabs.css\" />" + NL + "<script type=\"text/javascript\" src=\"scripts/tabs.js\"></script>" + NL + "" + NL + "<menu:useMenuDisplayer name=\"TabbedMenu\"" + NL + "    bundle=\"org.apache.struts.action.MESSAGE\">" + NL + "    <menu:displayMenu name=\"Home\"/>" + NL + "\t";
  protected final String TEXT_2 = NL + "\t\t";
  protected final String TEXT_3 = NL + "\t<menu:displayMenu name=\"";
  protected final String TEXT_4 = "Menu\"/>" + NL + "\t\t\t";
  protected final String TEXT_5 = " " + NL + "\t\t";
  protected final String TEXT_6 = " " + NL + "\t";
  protected final String TEXT_7 = NL + "    <menu:displayMenu name=\"Exit\"/>" + NL + "</menu:useMenuDisplayer>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> i = project.getPackages().iterator(); i.hasNext();) {
	    XPackage xPackage = (XPackage) i.next();
    stringBuffer.append(TEXT_2);
    for (Iterator<XClass> i2 = xPackage.getClasses().iterator(); i2.hasNext();) {
		    XClass xClass = (XClass) i2.next();
		    if (MasterChildHelper.INST.isMaster(xClass)) {
		    
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    } 
    stringBuffer.append(TEXT_5);
    } 
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
