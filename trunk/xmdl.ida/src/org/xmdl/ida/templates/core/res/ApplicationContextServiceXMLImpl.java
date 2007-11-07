package org.xmdl.ida.templates.core.res;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class ApplicationContextServiceXMLImpl
{
  protected static String nl;
  public static synchronized ApplicationContextServiceXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextServiceXMLImpl result = new ApplicationContextServiceXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<beans xmlns=\"http://www.springframework.org/schema/beans\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "       xmlns:aop=\"http://www.springframework.org/schema/aop\" xmlns:tx=\"http://www.springframework.org/schema/tx\"" + NL + "       xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.0.xsd" + NL + "            http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-2.0.xsd" + NL + "            http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-2.0.xsd\"" + NL + "       default-lazy-init=\"true\">" + NL + "" + NL + "    <tx:annotation-driven/>" + NL + "    " + NL + "    <!-- Fix bug in Spring 2.0.6: http://issues.appfuse.org/browse/APF-887 -->" + NL + "    <bean class=\"org.springframework.transaction.aspectj.AnnotationTransactionAspect\" factory-method=\"aspectOf\" dependency-check=\"none\" lazy-init=\"false\">" + NL + "        <property name=\"transactionManager\" ref=\"transactionManager\"/>" + NL + "    </bean>" + NL + "    " + NL + "    <!-- Enable @AspectJ support -->" + NL + "    <aop:aspectj-autoproxy/>" + NL + "" + NL + "    <!-- Enable @Configured support -->" + NL + "    <aop:spring-configured/>" + NL + "    " + NL + "    <tx:advice id=\"txAdvice\">" + NL + "        <tx:attributes>" + NL + "            <!-- Read-only commented out to make things easier for end-users -->" + NL + "            <!-- http://issues.appfuse.org/browse/APF-556 -->" + NL + "            <!--tx:method name=\"get*\" read-only=\"true\"/-->" + NL + "            <tx:method name=\"*\"/>" + NL + "        </tx:attributes>" + NL + "    </tx:advice>" + NL + "    " + NL + "    <!-- Fix bug in Spring 2.0.6: http://issues.appfuse.org/browse/APF-887 -->" + NL + "    <bean class=\"org.springframework.transaction.aspectj.AnnotationTransactionAspect\" factory-method=\"aspectOf\" dependency-check=\"none\" lazy-init=\"false\">" + NL + "        <property name=\"transactionManager\" ref=\"transactionManager\"/>" + NL + "    </bean>" + NL + "    " + NL + "    <!-- =================================================================== -->" + NL + "    <!-- Managers: For accessing DAOs                                        -->" + NL + "    <!-- =================================================================== -->" + NL + "    " + NL + "    <bean id=\"manager\" class=\"org.xmdl.ida.lib.service.impl.UniversalManagerImpl\">" + NL + "        <property name=\"dao\" ref=\"universalDao\"/>" + NL + "    </bean>" + NL;
  protected final String TEXT_2 = "    <bean id=\"";
  protected final String TEXT_3 = "Manager\" class=\"";
  protected final String TEXT_4 = ".service.impl.";
  protected final String TEXT_5 = "ManagerImpl\">" + NL + "        <constructor-arg ref=\"";
  protected final String TEXT_6 = "DAO\"/>" + NL + "    </bean>";
  protected final String TEXT_7 = NL + NL + "</beans>" + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL;
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XPackage pack = (XPackage) argument;
    List<XClass> classes = pack.getClasses();
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    for (Iterator<XClass> iter = classes.iterator(); iter.hasNext();) {
	XClass cls = iter.next();

    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.uncapSafeName(cls));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedName(pack));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(cls));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.uncapSafeName(cls));
    stringBuffer.append(TEXT_6);
    
} 

    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
