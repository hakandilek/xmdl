package org.xmdl.ida.templates.dao;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityDAOHibernateImpl
{
  protected static String nl;
  public static synchronized EntityDAOHibernateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityDAOHibernateImpl result = new EntityDAOHibernateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".dao.hibernate;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_9 = " DAO Hibernate implementation" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public class ";
  protected final String TEXT_10 = "DAOHibernate extends GenericDaoHibernate<";
  protected final String TEXT_11 = ", Long> implements ";
  protected final String TEXT_12 = "Dao {" + NL + "" + NL + "    public ";
  protected final String TEXT_13 = "DAOHibernate() {" + NL + "        super(";
  protected final String TEXT_14 = ".class);" + NL + "    }" + NL + "" + NL + "    public Collection<";
  protected final String TEXT_15 = "> search(";
  protected final String TEXT_16 = "Search ";
  protected final String TEXT_17 = "Search) {" + NL + "    \tif (log.isDebugEnabled()) {" + NL + "    \t\tlog.debug(\"search(";
  protected final String TEXT_18 = "Search ";
  protected final String TEXT_19 = "Search) <-\");" + NL + "        \tlog.debug(\"";
  protected final String TEXT_20 = "Search: \" + ";
  protected final String TEXT_21 = "Search);" + NL + "    \t}" + NL + "    \t" + NL + "\t\tCollection<";
  protected final String TEXT_22 = "> list = null;" + NL + "\t\tif (";
  protected final String TEXT_23 = "Search == null) {" + NL + "\t\t\tlist = new ArrayList<";
  protected final String TEXT_24 = ">();" + NL + "\t\t} else {" + NL + "\t\t//TODO:iterate fields" + NL + "\t\t\tString name = ";
  protected final String TEXT_25 = "Search.getName();" + NL + "\t\t\tDouble fromPrice = ";
  protected final String TEXT_26 = "Search.getFromPrice();" + NL + "\t\t\tDouble toPrice = ";
  protected final String TEXT_27 = "Search.getToPrice();" + NL + "\t\t\tProductType productType = ";
  protected final String TEXT_28 = "Search.getProductType();" + NL + "" + NL + "\t\t\tlist = search(name, fromPrice, toPrice, productType);" + NL + "\t\t}" + NL + "" + NL + "\t\tif (log.isDebugEnabled())" + NL + "\t\t\tlog.debug(\"search(";
  protected final String TEXT_29 = "Search ";
  protected final String TEXT_30 = "Search) ->\");" + NL + "    \treturn list;" + NL + "    }" + NL + "" + NL + "    public Collection<";
  protected final String TEXT_31 = "> search(String name, Double fromPrice, Double toPrice, ProductType productType) {" + NL + "    \tif (log.isDebugEnabled()) {" + NL + "\t\t//TODO:iterate fields" + NL + "    \t\tlog.debug(\"search(String name, Double fromPrice, Double toPrice) <-\");" + NL + "\t\t//TODO:iterate fields" + NL + "        \tlog.debug(\"name       : \" + name);" + NL + "        \tlog.debug(\"fromPrice  : \" + fromPrice);" + NL + "        \tlog.debug(\"toPrice    : \" + toPrice);" + NL + "            log.debug(\"productType: \" + productType);" + NL + "    \t}" + NL + "    \t" + NL + "        Criteria criteria = getSession().createCriteria(";
  protected final String TEXT_32 = ".class);" + NL + "" + NL + "\t\t//TODO:iterate fields" + NL + "        if (name != null && !name.equals(\"\"))" + NL + "            criteria.add(Restrictions.like(\"name\", \"%\" + name + \"%\"));" + NL + "        if (fromPrice != null)" + NL + "            criteria.add(Restrictions.ge(\"price\", fromPrice));" + NL + "        if (toPrice != null)" + NL + "            criteria.add(Restrictions.le(\"price\", toPrice));" + NL + "        if (productType != null){" + NL + "            criteria.add(Restrictions.eq(\"productType\", productType));" + NL + "        }" + NL + "" + NL + "        List<";
  protected final String TEXT_33 = "> list = criteria.list();" + NL + "        " + NL + "\t\t//TODO:iterate fields" + NL + "        if (log.isDebugEnabled()) log.debug(\"search(String name, Double fromPrice, Double toPrice, ProductType productType) <-\");" + NL + "\t\treturn list;" + NL + "    }" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
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
    importManager.addImport("org.xmdl.ida.lib.dao.hibernate.GenericDaoHibernate");
    importManager.addImport(helper.getQualifiedName(xPackage)+".dao.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.search.*");
    stringBuffer.append(TEXT_6);
    importManager.addImport("org.hibernate.*");
    importManager.addImport("org.hibernate.criterion.*");
    stringBuffer.append(TEXT_7);
    importManager.addImport("java.util.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_33);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
