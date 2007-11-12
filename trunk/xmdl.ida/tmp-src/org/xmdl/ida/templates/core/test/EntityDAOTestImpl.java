package org.xmdl.ida.templates.core.test;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityDAOTestImpl
{
  protected static String nl;
  public static synchronized EntityDAOTestImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityDAOTestImpl result = new EntityDAOTestImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".dao;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_7 = " DAO Test Case" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public class ";
  protected final String TEXT_8 = "DAOTest extends BaseDaoTestCase {" + NL + "" + NL + "    private ";
  protected final String TEXT_9 = "DAO ";
  protected final String TEXT_10 = "DAO = null;" + NL + "" + NL + "    public void set";
  protected final String TEXT_11 = "DAO(";
  protected final String TEXT_12 = "DAO ";
  protected final String TEXT_13 = "DAO) {" + NL + "        this.";
  protected final String TEXT_14 = "DAO = ";
  protected final String TEXT_15 = "DAO;" + NL + "    }" + NL + "" + NL + "    public void testAddAndRemove";
  protected final String TEXT_16 = "() throws Exception {";
  protected final String TEXT_17 = NL + "        ";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = " = new ";
  protected final String TEXT_20 = "();" + NL + "        //TODO: iterate attributes" + NL + "        //";
  protected final String TEXT_21 = ".setName(\"abcd\");" + NL + "        //";
  protected final String TEXT_22 = ".setPrice(10d);" + NL + "        //";
  protected final String TEXT_23 = ".setProductType(ProductType.PRODUCT);" + NL;
  protected final String TEXT_24 = NL + "        ";
  protected final String TEXT_25 = " = ";
  protected final String TEXT_26 = "DAO.save(";
  protected final String TEXT_27 = ");" + NL + "        flush();" + NL;
  protected final String TEXT_28 = NL + "        ";
  protected final String TEXT_29 = " = ";
  protected final String TEXT_30 = "DAO.get(";
  protected final String TEXT_31 = ".getId());" + NL + "" + NL + "        //TODO: iterate attributes" + NL + "        //assertEquals(\"abcd\", ";
  protected final String TEXT_32 = ".getName());" + NL + "        //assertEquals(ProductType.PRODUCT, ";
  protected final String TEXT_33 = ".getProductType());" + NL + "        assertNotNull(";
  protected final String TEXT_34 = ".getId());" + NL + "" + NL + "        log.debug(\"removing ";
  protected final String TEXT_35 = "...\");" + NL;
  protected final String TEXT_36 = NL + "        ";
  protected final String TEXT_37 = "DAO.remove(";
  protected final String TEXT_38 = ".getId());" + NL + "        flush();" + NL + "" + NL + "        try {";
  protected final String TEXT_39 = NL + "            ";
  protected final String TEXT_40 = "DAO.get(";
  protected final String TEXT_41 = ".getId());" + NL + "            fail(\"";
  protected final String TEXT_42 = " found in database\");" + NL + "        } catch (DataAccessException dae) {" + NL + "            log.debug(\"Expected exception: \" + dae.getMessage());" + NL + "            assertNotNull(dae);" + NL + "        }" + NL + "    }" + NL + "" + NL + "    public void testSearch() throws Exception {" + NL + "        Collection<";
  protected final String TEXT_43 = "> ";
  protected final String TEXT_44 = "s = ";
  protected final String TEXT_45 = "DAO.search(\"abcd\",9d,11d,null);" + NL + "        assertTrue(";
  protected final String TEXT_46 = "s.size() > 0);" + NL + "    }" + NL + "" + NL + "    protected void onSetUpBeforeTransaction() throws Exception {" + NL + "        super.onSetUpBeforeTransaction();" + NL;
  protected final String TEXT_47 = NL + "        ";
  protected final String TEXT_48 = " ";
  protected final String TEXT_49 = " = new ";
  protected final String TEXT_50 = "();" + NL + "        //TODO: iterate attributes" + NL + "        //";
  protected final String TEXT_51 = ".setName(\"abcd\");" + NL + "        //";
  protected final String TEXT_52 = ".setPrice(10d);";
  protected final String TEXT_53 = NL + "        ";
  protected final String TEXT_54 = "DAO.save(";
  protected final String TEXT_55 = ");" + NL + "    }" + NL + "" + NL + "}";

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
    importManager.addImport("org.springframework.dao.DataAccessException");
    importManager.addImport("org.xmdl.ida.lib.test.BaseDaoTestCase");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport("java.util.*");
    
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
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_55);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
