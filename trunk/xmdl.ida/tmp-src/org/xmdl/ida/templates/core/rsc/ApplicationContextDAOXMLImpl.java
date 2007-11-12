package org.xmdl.ida.templates.core.rsc;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class ApplicationContextDAOXMLImpl
{
  protected static String nl;
  public static synchronized ApplicationContextDAOXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationContextDAOXMLImpl result = new ApplicationContextDAOXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<beans xmlns=\"http://www.springframework.org/schema/beans\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "       xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.0.xsd\"" + NL + "       default-lazy-init=\"true\">" + NL + "" + NL + "    <!-- Hibernate SessionFactory -->" + NL + "    <bean id=\"sessionFactory\" class=\"org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean\">" + NL + "        <property name=\"dataSource\" ref=\"dataSource\"/>" + NL + "        <property name=\"annotatedClasses\">" + NL + "            <list>";
  protected final String TEXT_2 = "                <value>";
  protected final String TEXT_3 = ".model.";
  protected final String TEXT_4 = "</value>";
  protected final String TEXT_5 = NL + "            </list>" + NL + "        </property>" + NL + "        <property name=\"hibernateProperties\">" + NL + "            <value>" + NL + "                hibernate.dialect=${hibernate.dialect}" + NL + "                hibernate.query.substitutions=true 'Y', false 'N'" + NL + "                hibernate.cache.use_second_level_cache=true" + NL + "                hibernate.cache.provider_class=org.hibernate.cache.EhCacheProvider" + NL + "            </value>" + NL + "            <!-- Turn batching off for better error messages under PostgreSQL -->" + NL + "            <!-- hibernate.jdbc.batch_size=0 -->" + NL + "        </property>" + NL + "    </bean>" + NL + "" + NL + "    <!-- Transaction manager for a single Hibernate SessionFactory (alternative to JTA) -->" + NL + "    <bean id=\"transactionManager\" class=\"org.springframework.orm.hibernate3.HibernateTransactionManager\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL + "" + NL + "    <!-- UniversalDao - can be used when doing standard CRUD - made available " + NL + "        for those who don't mind casting.  If you don't want to cast, look at " + NL + "        'fooDao' below. -->" + NL + "    <bean id=\"universalDao\" class=\"org.xmdl.ida.lib.dao.hibernate.UniversalDaoHibernate\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL;
  protected final String TEXT_6 = "    <bean id=\"";
  protected final String TEXT_7 = "Dao\" class=\"";
  protected final String TEXT_8 = ".dao.hibernate.";
  protected final String TEXT_9 = "DaoHibernate\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>";
  protected final String TEXT_10 = NL + NL + NL + "    <bean id=\"productDao\" class=\"org.xmdl.taslak.dao.hibernate.ProductDaoHibernate\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL + "" + NL + "    <bean id=\"orderDao\" class=\"org.xmdl.taslak.dao.hibernate.OrderDaoHibernate\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL + "" + NL + "    <bean id=\"orderElementDao\" class=\"org.xmdl.taslak.dao.hibernate.OrderElementDaoHibernate\">" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL + "" + NL + "    <!-- If you want to be able to do simple CRUD for new domain objects without " + NL + "        having to cast, you don't have create a Dao interface and implementation " + NL + "        for that domain object, you simply have to do the following.  " + NL + "        " + NL + "        eg... 'fooDao'" + NL + "    " + NL + "    <bean id=\"fooDao\" class=\"org.xmdl.taslak.dao.hibernate.GenericDaoHibernate\">" + NL + "        <constructor-arg value=\"org.xmdl.taslak.model.Foo\"/>" + NL + "        <property name=\"sessionFactory\" ref=\"sessionFactory\"/>" + NL + "    </bean>" + NL + "    " + NL + "    You will need to create a Dao interface and implementation for that " + NL + "        domain object if you need more than simple CRUD to occur.  " + NL + "        (finders, bulk update/delete, etc.)" + NL + "    -->" + NL + "" + NL + "    <!-- Add new DAOs here -->" + NL + "" + NL + "</beans>";
  protected final String TEXT_11 = NL;

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
    stringBuffer.append(helper.getQualifiedName(pack));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(cls));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    for (Iterator<XClass> iter = classes.iterator(); iter.hasNext();) {
	XClass cls = iter.next();

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.uncapSafeName(cls));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getQualifiedName(pack));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(cls));
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
