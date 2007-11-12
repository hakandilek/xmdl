package org.xmdl.ida.templates.core.test;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class HibernateConfigurationTestImpl
{
  protected static String nl;
  public static synchronized HibernateConfigurationTestImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    HibernateConfigurationTestImpl result = new HibernateConfigurationTestImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.hibernate;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".dao.hibernate;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * '";
  protected final String TEXT_7 = "' package Hibernate Configuration Test Case" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public class HibernateConfigurationTest extends BaseDaoTestCase {" + NL + "    private SessionFactory sessionFactory;" + NL + "" + NL + "    public void setSessionFactory(SessionFactory sessionFactory) {" + NL + "        this.sessionFactory = sessionFactory;" + NL + "    }" + NL + "" + NL + "    public void testColumnMapping() throws Exception {" + NL + "        Session session = sessionFactory.openSession();" + NL + "        try {" + NL + "            Map<?, ?> metadata = sessionFactory.getAllClassMetadata();" + NL + "            for (Object o : metadata.values()) {" + NL + "                EntityPersister persister = (EntityPersister) o;" + NL + "                String className = persister.getEntityName();" + NL + "                log.debug(\"Trying select * from: \" + className);" + NL + "                Query q = session.createQuery(\"from \" + className + \" c\");" + NL + "                q.iterate();" + NL + "                log.debug(\"ok: \" + className);" + NL + "            }" + NL + "        } finally {" + NL + "            session.close();" + NL + "        }" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XPackage xPackage = (XPackage) argument;
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_4);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_5);
    importManager.addImport("org.xmdl.ida.lib.test.BaseDaoTestCase");
    importManager.addImport("org.hibernate.*");
    importManager.addImport("org.hibernate.persister.entity.EntityPersister");
    importManager.addImport("java.util.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xPackage));
    stringBuffer.append(TEXT_7);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
