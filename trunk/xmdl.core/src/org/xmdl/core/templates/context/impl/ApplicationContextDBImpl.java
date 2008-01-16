package org.xmdl.core.templates.context.impl;

import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;

public class ApplicationContextDBImpl
{
  protected static String nl;
  public static synchronized ApplicationContextDBImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextDBImpl result = new ApplicationContextDBImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\"" + NL + "    \"http://www.springframework.org/dtd/spring-beans.dtd\">" + NL + "" + NL + "<beans>" + NL + "    <bean id=\"propertyConfigurer\" class=\"org.springframework.beans.factory.config.PropertyPlaceholderConfigurer\">" + NL + "        <property name=\"locations\">" + NL + "            <list>" + NL + "                <value>classpath:";
  protected final String TEXT_2 = "/database.properties</value>" + NL + "            </list>" + NL + "        </property>" + NL + "    </bean>" + NL + "" + NL + "    <bean id=\"dataSource\" class=\"org.springframework.jdbc.datasource.DriverManagerDataSource\">" + NL + "        <property name=\"driverClassName\" value=\"${hibernate.connection.driver_class}\"/>" + NL + "        <property name=\"url\" value=\"${hibernate.connection.url}\"/>" + NL + "        <property name=\"username\" value=\"${hibernate.connection.username}\"/>" + NL + "        <property name=\"password\" value=\"${hibernate.connection.password}\"/>" + NL + "    </bean>" + NL + "" + NL + "</beans>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getQualifiedPath(xPackage));
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
