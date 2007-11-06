package org.xmdl.ida.templates.service;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityServiceIMPLImpl
{
  protected static String nl;
  public static synchronized EntityServiceIMPLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityServiceIMPLImpl result = new EntityServiceIMPLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".service.impl;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".service.impl;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_8 = " Service implementation" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public class ";
  protected final String TEXT_9 = "ManagerImpl extends GenericManagerImpl<";
  protected final String TEXT_10 = ", Long> implements ";
  protected final String TEXT_11 = "Manager {" + NL;
  protected final String TEXT_12 = NL + "    ";
  protected final String TEXT_13 = "DAO ";
  protected final String TEXT_14 = "Dao;" + NL + "" + NL + "    public ";
  protected final String TEXT_15 = "ManagerImpl(";
  protected final String TEXT_16 = "DAO ";
  protected final String TEXT_17 = "DAO) {" + NL + "        super(";
  protected final String TEXT_18 = "DAO);" + NL + "        this.";
  protected final String TEXT_19 = "DAO = ";
  protected final String TEXT_20 = "DAO;" + NL + "    }" + NL + "" + NL + "    public Collection<";
  protected final String TEXT_21 = "> search(";
  protected final String TEXT_22 = "Search ";
  protected final String TEXT_23 = "Search) {" + NL + "        return ";
  protected final String TEXT_24 = "DAO.search(";
  protected final String TEXT_25 = "Search);" + NL + "    }" + NL + "" + NL + "}";

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
    importManager.addImport("org.xmdl.ida.lib.service.impl.GenericManager");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.search.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".service.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".dao.*");
    stringBuffer.append(TEXT_6);
    importManager.addImport("java.util.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_25);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
