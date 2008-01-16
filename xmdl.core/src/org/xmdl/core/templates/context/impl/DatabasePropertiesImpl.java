package org.xmdl.core.templates.context.impl;

import org.xmdl.xmdl.*;

public class DatabasePropertiesImpl
{
  protected static String nl;
  public static synchronized DatabasePropertiesImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DatabasePropertiesImpl result = new DatabasePropertiesImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#Hibernate Configuration for JUnit tests" + NL + "#Tue Dec 20 18:55:34 EET 2005" + NL + "dao.type=hibernate" + NL + "" + NL + "# HSQL is the default database driver. Please change it if you'd like to use another database engine." + NL + "hibernate.connection.username=sa" + NL + "hibernate.connection.password=" + NL + "hibernate.connection.url=jdbc:hsqldb:mem:";
  protected final String TEXT_2 = NL + "hibernate.connection.driver_class=org.hsqldb.jdbcDriver" + NL + "hibernate.dialect=org.hibernate.dialect.HSQLDialect" + NL + "" + NL + "# temporary connection definitions" + NL + "#hibernate.connection.username=chrome" + NL + "#hibernate.connection.password=chrometest" + NL + "#hibernate.connection.url=jdbc\\:firebirdsql\\://localhost/E\\:\\\\\\\\db\\\\\\\\";
  protected final String TEXT_3 = ".gdb" + NL + "#hibernate.connection.url=jdbc:firebirdsql:localhost:/org.xmdl/db/";
  protected final String TEXT_4 = ".gdb" + NL + "#hibernate.connection.driver_class=org.firebirdsql.jdbc.FBDriver" + NL + "#hibernate.dialect=org.hibernate.dialect.FirebirdDialect" + NL + "" + NL + "hibernate.hbm2ddl.auto=update" + NL + "hibernate.show_sql=true" + NL + "" + NL + "hibernate.query.substitutions=false" + NL + "hibernate.generate_statistics=true" + NL + "" + NL + "hibernate.cglib.use_reflection_optimizer=false" + NL + "" + NL + "hibernate.cache.provider_class=org.hibernate.cache.EhCacheProvider" + NL + "hibernate.cache.use_query_cache=false" + NL + "hibernate.cache.use_minimal_puts=false";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	//ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
