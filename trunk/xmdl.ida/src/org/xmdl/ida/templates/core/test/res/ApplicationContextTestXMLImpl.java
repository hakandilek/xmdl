package org.xmdl.ida.templates.core.test.res;

import chrome.xmdl.*;

public class ApplicationContextTestXMLImpl
{
  protected static String nl;
  public static synchronized ApplicationContextTestXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextTestXMLImpl result = new ApplicationContextTestXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<beans xmlns=\"http://www.springframework.org/schema/beans\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "       xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.0.xsd\">" + NL + "" + NL + "</beans>    ";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    prj.getName();
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
