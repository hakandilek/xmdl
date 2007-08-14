package chrome.xmdl.core.templates.context.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class Log4JPropImpl
{
  protected static String nl;
  public static synchronized Log4JPropImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    Log4JPropImpl result = new Log4JPropImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "log4j.rootLogger=WARN,AP, RFA" + NL + "#log4j.rootLogger=INFO, AP " + NL + "log4j.appender.AP=org.apache.log4j.ConsoleAppender" + NL + "log4j.appender.AP.layout=org.apache.log4j.PatternLayout" + NL + "log4j.appender.AP.layout.ConversionPattern=[%-5p - %d{HH:mm}] %-15c{1}:%-3L - %m%n" + NL + "#log4j.appender.AP.layout.ConversionPattern=[%-5p] %-20c{1} - %m%n" + NL + "" + NL + "log4j.appender.RFA=org.apache.log4j.RollingFileAppender" + NL + "log4j.appender.RFA.layout=org.apache.log4j.PatternLayout" + NL + "log4j.appender.RFA.layout.ConversionPattern=[%-5p - %d{HH:mm}] %-15c{1}:%-3L - %m%n" + NL + "#log4j.appender.RFA.layout.ConversionPattern=%d [%-5p] %c - %m%n" + NL + "log4j.appender.RFA.File=${catalina.home}/logs/";
  protected final String TEXT_2 = ".log" + NL + "log4j.appender.RFA.Append=true" + NL + "" + NL + "# Control the maximum log file size" + NL + "log4j.appender.RFA.MaxFileSize=1MB" + NL + "# Archive log files (one backup file here)" + NL + "log4j.appender.RFA.MaxBackupIndex=1000" + NL + "" + NL + "### Hibernate Loggers ###" + NL + "### Hibernate Core ###" + NL + "log4j.logger.net.sf.hibernate=info" + NL + "### log schema exportate ###" + NL + "log4j.logger.net.sf.hibernate.tool.hbm2ddl=info" + NL + "### log cache activity ###" + NL + "log4j.logger.net.sf.hibernate.cache=WARN" + NL + "### log JDBC bind parameters ###" + NL + "log4j.logger.net.sf.hibernate.type=WARN" + NL + "### log SQL output ### " + NL + "log4j.logger.org.hibernate.SQL=DEBUG" + NL + "" + NL + "" + NL + "# Print only messages of level DEBUG or above in the package com.foo." + NL;
  protected final String TEXT_3 = NL + "log4j.logger.";
  protected final String TEXT_4 = "=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_5 = ".bo=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_6 = ".bo.impl=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_7 = ".dao=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_8 = ".dao.impl=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_9 = ".model=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_10 = ".model.impl=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_11 = ".ui.web=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_12 = ".ui.web.action=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_13 = ".ui.web.form=DEBUG" + NL + "log4j.logger.";
  protected final String TEXT_14 = ".ui.web.listener=DEBUG";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;	

    stringBuffer.append(TEXT_1);
    stringBuffer.append((project).getName());
    stringBuffer.append(TEXT_2);
    for (Object pack : project.getPackages()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(((XPackage)pack).getName());
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
