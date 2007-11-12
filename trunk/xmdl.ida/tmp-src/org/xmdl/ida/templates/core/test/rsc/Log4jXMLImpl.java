package org.xmdl.ida.templates.core.test.rsc;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class Log4jXMLImpl
{
  protected static String nl;
  public static synchronized Log4jXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    Log4jXMLImpl result = new Log4jXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + NL + "<!DOCTYPE log4j:configuration SYSTEM \"log4j.dtd\">" + NL + "" + NL + "<log4j:configuration xmlns:log4j=\"http://jakarta.apache.org/log4j/\">" + NL + "" + NL + "    <appender name=\"CONSOLE\" class=\"org.apache.log4j.ConsoleAppender\">" + NL + "        <layout class=\"org.apache.log4j.PatternLayout\">" + NL + "            <param name=\"ConversionPattern\"" + NL + "                value=\"%p - %C{1}.%M(%L) | %m%n\"/>" + NL + "        </layout>" + NL + "    </appender>" + NL + "" + NL + "    <logger name=\"net.sf.ehcache\">" + NL + "        <level value=\"ERROR\"/>" + NL + "    </logger>" + NL + "" + NL + "    <!-- Suppress success logging from InteractiveAuthenticationSuccessEvent -->" + NL + "    <logger name=\"org.acegisecurity\">" + NL + "        <level value=\"ERROR\"/>" + NL + "    </logger>" + NL + "" + NL + "    <logger name=\"org.apache\">" + NL + "        <level value=\"WARN\"/>" + NL + "    </logger>" + NL + "" + NL + "    <logger name=\"org.hibernate\">" + NL + "        <level value=\"WARN\"/>" + NL + "    </logger>" + NL + "  " + NL + "    <!--logger name=\"org.hibernate.SQL\">" + NL + "        <level value=\"DEBUG\"/>" + NL + "    </logger-->" + NL + "" + NL + "    <logger name=\"org.springframework\">" + NL + "        <level value=\"WARN\"/>" + NL + "    </logger>" + NL + "   ";
  protected final String TEXT_2 = "%>" + NL + "    <logger name=\"";
  protected final String TEXT_3 = "\">" + NL + "        <level value=\"DEBUG\"/>" + NL + "    </logger>" + NL;
  protected final String TEXT_4 = NL + "    <root>" + NL + "        <level value=\"WARN\"/>" + NL + "        <appender-ref ref=\"CONSOLE\"/>" + NL + "    </root>" + NL + "" + NL + "</log4j:configuration>";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    List<XPackage> packages = prj.getPackages();
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    prj.getName();
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
	XPackage pack = iter.next();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(pack));
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
