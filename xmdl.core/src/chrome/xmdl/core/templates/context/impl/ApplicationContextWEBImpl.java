package chrome.xmdl.core.templates.context.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class ApplicationContextWEBImpl
{
  protected static String nl;
  public static synchronized ApplicationContextWEBImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextWEBImpl result = new ApplicationContextWEBImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\"" + NL + "    \"http://www.springframework.org/dtd/spring-beans.dtd\">" + NL + "" + NL + "<beans>";
  protected final String TEXT_2 = NL + "    <bean name=\"/search";
  protected final String TEXT_3 = "\" class=\"";
  protected final String TEXT_4 = "\" singleton=\"false\">" + NL + "        <property name=\"";
  protected final String TEXT_5 = "Service\">" + NL + "            <ref bean=\"";
  protected final String TEXT_6 = "Service\"/>" + NL + "        </property>" + NL + "    </bean>" + NL + "    <bean name=\"/edit";
  protected final String TEXT_7 = "\" class=\"";
  protected final String TEXT_8 = "\" singleton=\"false\">" + NL + "        <property name=\"";
  protected final String TEXT_9 = "Service\">" + NL + "            <ref bean=\"";
  protected final String TEXT_10 = "Service\"/>" + NL + "        </property>" + NL + "    </bean>";
  protected final String TEXT_11 = NL + NL + "</beans>" + NL;
  protected final String TEXT_12 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

    stringBuffer.append(TEXT_1);
    for (Iterator<XClass> it = xPackage.getClasses().iterator(); it.hasNext();) {
		XClass xClass = (XClass) it.next();

    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getObjectActionName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getObjectActionName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
