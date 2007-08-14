package chrome.xmdl.core.templates.test.ui.web.form.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityFormTestImpl
{
  protected static String nl;
  public static synchronized EntityFormTestImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityFormTestImpl result = new EntityFormTestImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.form;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "/** " + NL + " * $Id$" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_6 = "FormTest extends TestCase {" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testBean() {";
  protected final String TEXT_7 = NL + "        ";
  protected final String TEXT_8 = "Form form = new ";
  protected final String TEXT_9 = "Form();";
  protected final String TEXT_10 = NL + "        ";
  protected final String TEXT_11 = " bean = form.get";
  protected final String TEXT_12 = "();" + NL + "" + NL + "        assertNotNull(bean);        ";
  protected final String TEXT_13 = NL + "    \tassertEquals(";
  protected final String TEXT_14 = ", bean.";
  protected final String TEXT_15 = "());";
  protected final String TEXT_16 = NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testSearchBean() {";
  protected final String TEXT_17 = NL + "        ";
  protected final String TEXT_18 = "Form form = new ";
  protected final String TEXT_19 = "Form();";
  protected final String TEXT_20 = NL + "        ";
  protected final String TEXT_21 = "Search search = form.get";
  protected final String TEXT_22 = "Search();" + NL + "" + NL + "        assertNotNull(search);" + NL + "        ";
  protected final String TEXT_23 = NL + "\t";
  protected final String TEXT_24 = NL + "    \tassertEquals(";
  protected final String TEXT_25 = ", search.";
  protected final String TEXT_26 = "Min());" + NL + "    \tassertEquals(";
  protected final String TEXT_27 = ", search.";
  protected final String TEXT_28 = "Max());" + NL + "\t";
  protected final String TEXT_29 = NL + "    \tassertEquals(";
  protected final String TEXT_30 = ", search.";
  protected final String TEXT_31 = "());" + NL + "\t";
  protected final String TEXT_32 = NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testDelete() {";
  protected final String TEXT_33 = NL + "        ";
  protected final String TEXT_34 = "Form form = new ";
  protected final String TEXT_35 = "Form();" + NL + "        Long[] deleteID = form.getDeleteID();" + NL + "" + NL + "        assertNotNull(deleteID);" + NL + "        assertEquals(0, deleteID.length);" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void testReset() {" + NL + "        testBean();" + NL + "        testSearchBean();" + NL + "        testDelete();" + NL + "    }" + NL + "    " + NL + "}";
  protected final String TEXT_36 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage();
    XProject  xProject = xPackage.getProject(); 
     
    DBHelper dbHelper = XMDLDBHelper.INSTANCE;    
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_3);
    importManager.addImport(xPackage.getName() + ".model.*");
    importManager.addImport("junit.framework.*");
    stringBuffer.append(TEXT_4);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    XType type = attribute.getType();
    
    if (type != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_23);
    if (type.isComparable()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_31);
    }
    }
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_35);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_36);
    return stringBuffer.toString();
  }
}
