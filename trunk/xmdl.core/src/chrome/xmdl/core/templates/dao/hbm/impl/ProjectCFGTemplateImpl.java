package chrome.xmdl.core.templates.dao.hbm.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.xgen.util.*;
import org.eclipse.emf.ecore.EObject;

public class ProjectCFGTemplateImpl
{
  protected static String nl;
  public static synchronized ProjectCFGTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ProjectCFGTemplateImpl result = new ProjectCFGTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version='1.0' encoding='utf-8'?>" + NL + "<!DOCTYPE hibernate-configuration PUBLIC" + NL + "\t\"-//Hibernate/Hibernate Configuration DTD//EN\"" + NL + "\t\"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">" + NL + "" + NL + "<hibernate-configuration>" + NL + "\t<session-factory>" + NL + "" + NL + "" + NL + "" + NL + "\t\t<property name=\"dialect\">org.hibernate.dialect.MySQLMyISAMDialect</property>" + NL + "\t\t<property name=\"connection.driver_class\">org.gjt.mm.mysql.Driver</property>" + NL + "\t\t<property name=\"connection.url\">jdbc:mysql://localhost/";
  protected final String TEXT_2 = "</property>" + NL + "\t\t<property name=\"connection.username\">root</property>" + NL + "\t\t<property name=\"connection.password\"></property>" + NL + "" + NL + "\t\t<property name=\"c3p0.min_size\">3</property>" + NL + "\t\t<property name=\"c3p0.max_size\">5</property>" + NL + "\t\t<property name=\"c3p0.timeout\">1800</property>" + NL + "\t\t<!-- Use the C3P0 connection pool." + NL + "\t\t-->" + NL + "" + NL + "\t\t<!-- Use the Hibernate built-in pool for tests." + NL + "\t\t<property name=\"connection.pool_size\">10</property>" + NL + "         -->" + NL + "\t\t<!-- Use EHCache but not the query cache. -->" + NL + "\t\t<property name=\"cache.provider_class\">org.hibernate.cache.EhCacheProvider</property>" + NL + "\t\t<property name=\"cache.use_query_cache\">false</property>" + NL + "\t\t<property name=\"cache.use_minimal_puts\">false</property>" + NL + "" + NL + "\t\t<!-- Print SQL to stdout. -->" + NL + "\t\t<property name=\"show_sql\">true</property>" + NL + "\t\t<!--property name=\"hbm2ddl.auto\">create</property-->" + NL + "" + NL + "\t\t<!-- CaveatEmptor mapping files. -->";
  protected final String TEXT_3 = NL + "\t\t<mapping resource=\"";
  protected final String TEXT_4 = "/model/package.hbm.xml\"/>";
  protected final String TEXT_5 = NL + "\t\t" + NL + "" + NL + "\t</session-factory>" + NL + "" + NL + "</hibernate-configuration>";
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;
	Iterator<EObject> iterator=new ModelIterator(project);
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_2);
     while (iterator.hasNext()) {
	EObject  o = (EObject) iterator.next();
	if (o instanceof XPackage) {
		XPackage cls = (XPackage) o;
		
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedPath(cls));
    stringBuffer.append(TEXT_4);
    
	}
}
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
