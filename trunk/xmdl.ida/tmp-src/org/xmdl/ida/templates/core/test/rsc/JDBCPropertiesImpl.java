package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.*;

public class JDBCPropertiesImpl
{
  protected static String nl;
  public static synchronized JDBCPropertiesImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    JDBCPropertiesImpl result = new JDBCPropertiesImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "jdbc.driverClassName=${jdbc.driverClassName}" + NL + "jdbc.url=${jdbc.url}" + NL + "jdbc.username=${jdbc.username}" + NL + "jdbc.password=${jdbc.password}" + NL + "" + NL + "hibernate.dialect=${hibernate.dialect}" + NL + "" + NL + "# Needed by Hibernate3 Maven Plugin defined in pom.xml" + NL + "hibernate.connection.username=${jdbc.username}" + NL + "hibernate.connection.password=${jdbc.password}" + NL + "hibernate.connection.url=${jdbc.url}" + NL + "hibernate.connection.driver_class=${jdbc.driverClassName}";
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
