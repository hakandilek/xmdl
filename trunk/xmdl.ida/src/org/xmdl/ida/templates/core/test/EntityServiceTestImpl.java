package org.xmdl.ida.templates.core.test;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityServiceTestImpl
{
  protected static String nl;
  public static synchronized EntityServiceTestImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityServiceTestImpl result = new EntityServiceTestImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".service.impl;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".service.impl;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_7 = " Service Implementation Test" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "//TODO:from here" + NL + "public class ";
  protected final String TEXT_8 = "ManagerImplTest extends BaseManagerMockTestCase {" + NL + "" + NL + "    private ";
  protected final String TEXT_9 = "ManagerImpl manager = null;" + NL + "    private Mock dao = null;" + NL + "    private ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = " = null;" + NL + "" + NL + "    protected void setUp() throws Exception {" + NL + "        dao = new Mock(";
  protected final String TEXT_12 = "Dao.class);" + NL + "        manager = new ";
  protected final String TEXT_13 = "ManagerImpl((";
  protected final String TEXT_14 = "Dao) dao.proxy());" + NL + "    }" + NL + "" + NL + "    protected void tearDown() throws Exception {" + NL + "        manager = null;" + NL + "    }" + NL + "" + NL + "    public void testGet() {" + NL + "        log.debug(\"testing get\");" + NL + "" + NL + "        Long id = 7L;";
  protected final String TEXT_15 = NL + "        ";
  protected final String TEXT_16 = " = new ";
  protected final String TEXT_17 = "();" + NL + "" + NL + "        // set expected behavior on dao" + NL + "        dao.expects(once()).method(\"get\")" + NL + "                .with(eq(id))" + NL + "                .will(returnValue(";
  protected final String TEXT_18 = "));" + NL;
  protected final String TEXT_19 = NL + "        ";
  protected final String TEXT_20 = " result = manager.get(id);" + NL + "        assertSame(";
  protected final String TEXT_21 = ", result);" + NL + "    }" + NL + "" + NL + "    public void testGetAll() {" + NL + "        log.debug(\"testing getAll\");" + NL + "" + NL + "        List<";
  protected final String TEXT_22 = "> list = new ArrayList<";
  protected final String TEXT_23 = ">();" + NL + "" + NL + "        // set expected behavior on dao" + NL + "        dao.expects(once()).method(\"getAll\")" + NL + "                .will(returnValue(list));" + NL + "" + NL + "        List<";
  protected final String TEXT_24 = "> result = manager.getAll();" + NL + "        assertSame(list, result);" + NL + "    }" + NL + "" + NL + "    public void testSearch() {" + NL + "        log.debug(\"testing search\");" + NL + "" + NL + "        List<";
  protected final String TEXT_25 = "> list = new ArrayList<";
  protected final String TEXT_26 = ">();";
  protected final String TEXT_27 = NL + "        ";
  protected final String TEXT_28 = "Search searchBean=new ";
  protected final String TEXT_29 = "Search();" + NL + "" + NL + "        // set expected behavior on dao" + NL + "        dao.expects(once()).method(\"search\")" + NL + "                .with(eq(searchBean))" + NL + "                .will(returnValue(list));" + NL + "" + NL + "        Collection<";
  protected final String TEXT_30 = "> result = manager.search(searchBean);" + NL + "        assertSame(list, result);" + NL + "    }" + NL + "" + NL + "    public void testSave() {" + NL + "        log.debug(\"testing save\");" + NL;
  protected final String TEXT_31 = NL + "        ";
  protected final String TEXT_32 = " = new ";
  protected final String TEXT_33 = "();" + NL + "" + NL + "        // set expected behavior on dao" + NL + "        dao.expects(once()).method(\"save\")" + NL + "                .with(same(";
  protected final String TEXT_34 = "))" + NL + "                .will(returnValue(";
  protected final String TEXT_35 = "));" + NL + "" + NL + "        manager.save(";
  protected final String TEXT_36 = ");" + NL + "    }" + NL + "" + NL + "    public void testRemove() {" + NL + "        log.debug(\"testing remove\");" + NL + "" + NL + "        Long id = 11L;";
  protected final String TEXT_37 = NL + "        ";
  protected final String TEXT_38 = " = new ";
  protected final String TEXT_39 = "();" + NL + "" + NL + "        // set expected behavior on dao" + NL + "        dao.expects(once()).method(\"remove\")" + NL + "                .with(eq(id))" + NL + "                .isVoid();" + NL + "" + NL + "        manager.remove(id);" + NL + "    }" + NL + "" + NL + "}";

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
    importManager.addImport("java.util.ArrayList");
    importManager.addImport("java.util.List");
    importManager.addImport("java.util.Collection");
    importManager.addImport("org.jmock.Mock");
    importManager.addImport("org.springframework.dao.DataAccessException");
    importManager.addImport("org.xmdl.ida.lib.test.BaseManagerMockTestCase");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.search.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".dao.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_39);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
