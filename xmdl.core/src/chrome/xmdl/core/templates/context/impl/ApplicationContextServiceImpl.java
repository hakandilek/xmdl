package chrome.xmdl.core.templates.context.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class ApplicationContextServiceImpl
{
  protected static String nl;
  public static synchronized ApplicationContextServiceImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextServiceImpl result = new ApplicationContextServiceImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\"" + NL + "    \"http://www.springframework.org/dtd/spring-beans.dtd\">" + NL + "" + NL + "<beans>" + NL + "" + NL + "    <!-- Transaction template for Managers, from:" + NL + "         http://blog.exis.com/colin/archives/2004/07/31/concise-transaction-definitions-spring-11/ -->" + NL + "    <bean id=\"txProxyTemplate\" abstract=\"true\"" + NL + "        class=\"org.springframework.transaction.interceptor.TransactionProxyFactoryBean\">" + NL + "        <property name=\"transactionManager\" ref=\"transactionManager\"/>" + NL + "        <property name=\"transactionAttributes\">" + NL + "            <props>" + NL + "                <prop key=\"execute*\">PROPAGATION_REQUIRED</prop>" + NL + "                <prop key=\"delete*\">PROPAGATION_REQUIRED</prop>" + NL + "                <prop key=\"edit*\">PROPAGATION_REQUIRED,readOnly</prop>" + NL + "                <prop key=\"save*\">PROPAGATION_REQUIRED</prop>" + NL + "                <prop key=\"search*\">PROPAGATION_REQUIRED,readOnly</prop>" + NL + "                <prop key=\"copy*\">PROPAGATION_REQUIRED,readOnly</prop>" + NL + "                <prop key=\"*\">PROPAGATION_REQUIRED,readOnly</prop>" + NL + "            </props>" + NL + "        </property>" + NL + "    </bean>" + NL;
  protected final String TEXT_2 = NL + "    <bean id=\"";
  protected final String TEXT_3 = "Service\" parent=\"txProxyTemplate\">" + NL + "        <property name=\"target\">" + NL + "            <bean class=\"";
  protected final String TEXT_4 = "\">" + NL + "                <property name=\"";
  protected final String TEXT_5 = "DAO\" ref=\"";
  protected final String TEXT_6 = "\"/>";
  protected final String TEXT_7 = NL + "                <property name=\"";
  protected final String TEXT_8 = "DAO\" ref=\"";
  protected final String TEXT_9 = "\"/>";
  protected final String TEXT_10 = NL + "            </bean>" + NL + "        </property>" + NL + "    </bean>";
  protected final String TEXT_11 = NL + "</beans>";
  protected final String TEXT_12 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;	

    stringBuffer.append(TEXT_1);
    for (Iterator it = xPackage.getClasses().iterator(); it.hasNext();) {
		XClass xClass = (XClass) it.next();

    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getObjectServiceImplName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectDAOName(xClass));
    stringBuffer.append(TEXT_6);
    			XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   	if (master != null) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getObjectDAOName(master));
    stringBuffer.append(TEXT_9);
    				}
			} 
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
