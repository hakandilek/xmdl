package org.xmdl.core.templates.context.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.xmdl.core.util.*;

public class ApplicationContextDAOImpl
{
  protected static String nl;
  public static synchronized ApplicationContextDAOImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextDAOImpl result = new ApplicationContextDAOImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\"" + NL + "    \"http://www.springframework.org/dtd/spring-beans.dtd\">" + NL + "" + NL + "<beans>" + NL + "    <!-- Hibernate SessionFactory -->" + NL + "    <bean id=\"sessionFactory\" class=\"org.springframework.orm.hibernate3.LocalSessionFactoryBean\">" + NL + "        <property name=\"dataSource\" ref=\"dataSource\"/>" + NL + "" + NL + "        <property name=\"mappingResources\">" + NL + "            <list>" + NL + "\t\t\t\t<value>";
  protected final String TEXT_2 = "</value>" + NL + "            </list>" + NL + "        </property>" + NL + "        <!-- The property below is commented out b/c it doesn't work when run via" + NL + "             Ant in Eclipse.  It works fine for indivakidual JUnit tests and in IDEA ??" + NL + "        <property name=\"mappingJarLocations\">" + NL + "            <list><value>file:dist/appfuse-dao.jar</value></list>" + NL + "        </property>" + NL + "        -->" + NL + "        <property name=\"hibernateProperties\">" + NL + "            <props>" + NL + "                <prop key=\"hibernate.connection.username\">${hibernate.connection.username}</prop>" + NL + "                <prop key=\"hibernate.connection.password\">${hibernate.connection.password}</prop>" + NL + "                <prop key=\"hibernate.connection.url\">${hibernate.connection.url}</prop>" + NL + "                <prop key=\"hibernate.connection.driver_class\">${hibernate.connection.driver_class}</prop>" + NL + "                <prop key=\"hibernate.dialect\">${hibernate.dialect}</prop>" + NL + "" + NL + "                <prop key=\"hibernate.hbm2ddl.auto\">${hibernate.hbm2ddl.auto}</prop>" + NL + "                <prop key=\"hibernate.show_sql\">${hibernate.show_sql}</prop>" + NL + "                <prop key=\"hibernate.query.substitutions\">${hibernate.query.substitutions}</prop>" + NL + "                <prop key=\"hibernate.cglib.use_reflection_optimizer\">${hibernate.cglib.use_reflection_optimizer}</prop>" + NL + "                <prop key=\"hibernate.generate_statistics\">${hibernate.generate_statistics}</prop>" + NL + "" + NL + "                <prop key=\"hibernate.cache.provider_class\">${hibernate.cache.provider_class}</prop>" + NL + "                <prop key=\"hibernate.cache.use_query_cache\">${hibernate.cache.use_query_cache}</prop>" + NL + "                <prop key=\"hibernate.cache.use_minimal_puts\">${hibernate.cache.use_minimal_puts}</prop>" + NL + "" + NL + "            </props>" + NL + "        </property>" + NL + "    </bean>" + NL + "" + NL + "    <!-- Transaction manager for a single Hibernate SessionFactory (alternative to JTA) -->" + NL + "    <bean id=\"transactionManager\" class=\"org.springframework.orm.hibernate3.HibernateTransactionManager\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL;
  protected final String TEXT_3 = NL + "    <!-- ";
  protected final String TEXT_4 = "DAO: Hibernate implementation -->" + NL + "    <bean id=\"";
  protected final String TEXT_5 = "\" class=\"";
  protected final String TEXT_6 = "\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>";
  protected final String TEXT_7 = NL + "</beans>";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(XMDLDBHelper.INSTANCE.getMappingFile(xPackage));
    stringBuffer.append(TEXT_2);
    for (Iterator<XClass> it = xPackage.getClasses().iterator(); it.hasNext();) {
		XClass xClass = (XClass) it.next();

    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getObjectDAOName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectDAOImplName(xClass));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
