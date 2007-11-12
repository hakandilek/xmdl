package org.xmdl.ida.templates.core.rsc;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class HibernateCFGImpl
{
  protected static String nl;
  public static synchronized HibernateCFGImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    HibernateCFGImpl result = new HibernateCFGImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE hibernate-configuration PUBLIC \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\"" + NL + "    \"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">" + NL + "" + NL + "<hibernate-configuration>" + NL + "    <session-factory>";
  protected final String TEXT_2 = "<mapping class=\"";
  protected final String TEXT_3 = ".model.";
  protected final String TEXT_4 = "\"/>";
  protected final String TEXT_5 = NL + "    </session-factory>" + NL + "</hibernate-configuration>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    List<XPackage> packages = prj.getPackages();
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
	XPackage pack = iter.next();
	List<XClass> classes = pack.getClasses();
	for (Iterator<XClass> iter2 = classes.iterator(); iter.hasNext();) {
		XClass xClass = iter2.next();
		if (xClass != null){
			
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(pack));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedName(xClass));
    stringBuffer.append(TEXT_4);
    
		}
	}
} 

    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
