package org.xmdl.ida.templates.core.test.res;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class PersistenceXMLImpl
{
  protected static String nl;
  public static synchronized PersistenceXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    PersistenceXMLImpl result = new PersistenceXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<persistence xmlns=\"http://java.sun.com/xml/ns/persistence\" version=\"1.0\">" + NL + "" + NL + "    <persistence-unit name=\"ApplicationEntityManager\" transaction-type=\"RESOURCE_LOCAL\">" + NL + "        <provider>org.hibernate.ejb.HibernatePersistence</provider>" + NL + "        <class>org.xmdl.mesken.model.User</class>" + NL + "        <class>org.xmdl.mesken.model.Role</class>";
  protected final String TEXT_2 = "        <class>";
  protected final String TEXT_3 = ".model.";
  protected final String TEXT_4 = "</class>";
  protected final String TEXT_5 = NL + "    </persistence-unit>" + NL + "" + NL + "</persistence>";
  protected final String TEXT_6 = NL;

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
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
