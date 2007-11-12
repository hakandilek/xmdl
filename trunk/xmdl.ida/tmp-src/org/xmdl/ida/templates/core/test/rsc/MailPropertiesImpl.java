package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.*;

public class MailPropertiesImpl
{
  protected static String nl;
  public static synchronized MailPropertiesImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    MailPropertiesImpl result = new MailPropertiesImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# This properties file is used to configure mail settings in " + NL + "# /WEB-INF/applicationContext-service.xml." + NL + "" + NL + "mail.default.from=";
  protected final String TEXT_2 = " <xmdl@googlegroups.com>" + NL + "mail.debug=false" + NL + "mail.transport.protocol=smtp" + NL + "mail.host=localhost" + NL + "mail.username=" + NL + "mail.password=";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    String name = prj.getName();
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
