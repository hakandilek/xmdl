package org.xmdl.core.templates.test.ui.web.action.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityActionTestImpl
{
  protected static String nl;
  public static synchronized EntityActionTestImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityActionTestImpl result = new EntityActionTestImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".ui.web.action;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + NL + "/** " + NL + " * $Id$" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_7 = "ActionTest extends BaseActionTest implements Constants {" + NL + "" + NL + "    public ";
  protected final String TEXT_8 = "ActionTest(String name) {" + NL + "        super(name);" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testDelete() throws Exception {" + NL + "        //test simple delete" + NL + "        setRequestPathInfo(\"/edit";
  protected final String TEXT_9 = "\");" + NL + "        addRequestParameter(\"method\", \"Delete\");" + NL + "        actionPerform();" + NL + "" + NL + "        verifyForward(\"list\");" + NL + "" + NL + "        assertNotNull(getSession().getAttribute(";
  protected final String TEXT_10 = "_LIST));" + NL + "        ActionForm actionForm = getActionForm();" + NL + "" + NL + "        assertNotNull(actionForm);" + NL + "        assertTrue(actionForm instanceof ";
  protected final String TEXT_11 = "Form);" + NL + "" + NL + "        verifyActionMessages(new String[] {\"org.xmdl.demo.model.";
  protected final String TEXT_12 = ".deleted\"});" + NL + "        verifyNoActionErrors();" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testCancel() {" + NL + "        //test cancel" + NL + "        setRequestPathInfo(\"/edit";
  protected final String TEXT_13 = "\");" + NL + "        addRequestParameter(\"method\", \"Cancel\");" + NL + "        actionPerform();" + NL + "" + NL + "        Object entity = getSession().getAttribute(";
  protected final String TEXT_14 = "_ENTITY);" + NL + "        assertNull(entity);" + NL + "" + NL + "        verifyForward(\"list\");" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testSave() {" + NL + "        //test save" + NL + "        setRequestPathInfo(\"/edit";
  protected final String TEXT_15 = "\");" + NL + "        addRequestParameter(\"method\", \"Save\");" + NL + "        addRequestParameter(\"";
  protected final String TEXT_16 = ".ID\", \"\");" + NL + "        ";
  protected final String TEXT_17 = NL + "        addRequestParameter(\"";
  protected final String TEXT_18 = ".";
  protected final String TEXT_19 = "\", \"";
  protected final String TEXT_20 = "\");";
  protected final String TEXT_21 = "        " + NL + "" + NL + "        actionPerform();" + NL + "" + NL + "        verifyForward(\"list\");" + NL + "" + NL + "        assertNotNull(getSession().getAttribute(";
  protected final String TEXT_22 = "_LIST));" + NL + "        assertNotNull(getSession().getAttribute(";
  protected final String TEXT_23 = "_ENTITY));" + NL + "        ActionForm actionForm = getActionForm();" + NL + "" + NL + "        assertNotNull(actionForm);" + NL + "        assertTrue(actionForm instanceof ";
  protected final String TEXT_24 = "Form);" + NL + "" + NL + "        verifyActionMessages(new String[] {\"org.xmdl.demo.model.";
  protected final String TEXT_25 = ".updated\"});" + NL + "        verifyNoActionErrors();" + NL + "" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testSearch() {" + NL + "        //test search" + NL + "        setRequestPathInfo(\"/search";
  protected final String TEXT_26 = "\");" + NL + "        addRequestParameter(\"method\", \"Search\");" + NL;
  protected final String TEXT_27 = NL + "        addRequestParameter(\"";
  protected final String TEXT_28 = ".";
  protected final String TEXT_29 = "\", \"";
  protected final String TEXT_30 = "\");";
  protected final String TEXT_31 = "        " + NL + "" + NL + "        actionPerform();" + NL + "" + NL + "        verifyForward(\"success\");" + NL + "" + NL + "        assertNotNull(getRequest().getAttribute(Constants.";
  protected final String TEXT_32 = "_LIST));" + NL + "        verifyNoActionErrors();" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testEdit() {" + NL + "        //test simple edit" + NL + "        setRequestPathInfo(\"/edit";
  protected final String TEXT_33 = "\");" + NL + "        addRequestParameter(\"method\", \"Edit\");" + NL + "        actionPerform();" + NL + "" + NL + "        verifyForward(\"success\");" + NL + "" + NL + "        assertNotNull(getSession().getAttribute(";
  protected final String TEXT_34 = "_LIST));" + NL + "        ActionForm actionForm = getActionForm();" + NL + "" + NL + "        assertNotNull(actionForm);" + NL + "        assertTrue(actionForm instanceof ";
  protected final String TEXT_35 = "Form);" + NL + "" + NL + "        verifyNoActionErrors();" + NL + "    }" + NL + "}";
  protected final String TEXT_36 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage();
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    TestHelper testHelper = TestHelper.INSTANCE;    
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    ImportManager importManager=null;
    stringBuffer.append(TEXT_1);
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_4);
    importManager.addImport(xPackage.getName() + ".ui.web.form.*");
    importManager.addImport("org.xmdl.lib.test.*");
    importManager.addImport("org.apache.struts.action.*");
    stringBuffer.append(TEXT_5);
    
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
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_16);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(testHelper.randomValuePlain(attribute));
    stringBuffer.append(TEXT_20);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_26);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(testHelper.randomValuePlain(attribute));
    stringBuffer.append(TEXT_30);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_35);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_36);
    return stringBuffer.toString();
  }
}
