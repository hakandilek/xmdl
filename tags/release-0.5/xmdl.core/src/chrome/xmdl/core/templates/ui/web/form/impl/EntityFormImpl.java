package chrome.xmdl.core.templates.ui.web.form.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityFormImpl
{
  protected static String nl;
  public static synchronized EntityFormImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityFormImpl result = new EntityFormImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.form;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/** " + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = "Form extends AbstractForm" + NL + "        implements Serializable{" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    private Long[] deleteID = new Long[0];" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    private ";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = " = new ";
  protected final String TEXT_8 = "Impl();" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    private ";
  protected final String TEXT_9 = "Search ";
  protected final String TEXT_10 = "Search = new ";
  protected final String TEXT_11 = "SearchImpl();" + NL + "" + NL + "\t";
  protected final String TEXT_12 = NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    private long ";
  protected final String TEXT_13 = "ID = 0;" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public long get";
  protected final String TEXT_14 = "ID() {" + NL + "        return ";
  protected final String TEXT_15 = "ID;" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void set";
  protected final String TEXT_16 = "ID(long ";
  protected final String TEXT_17 = "ID) {" + NL + "        this.";
  protected final String TEXT_18 = "ID = ";
  protected final String TEXT_19 = "ID;" + NL + "    }" + NL + "\t\t   ";
  protected final String TEXT_20 = NL + NL + "\t";
  protected final String TEXT_21 = NL + "\t";
  protected final String TEXT_22 = NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public int ";
  protected final String TEXT_23 = "() {" + NL + "        return get";
  protected final String TEXT_24 = "().";
  protected final String TEXT_25 = "().getOrdinal();" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void set";
  protected final String TEXT_26 = "(int value) {" + NL + "        get";
  protected final String TEXT_27 = "().set";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = ".valueOf(value));" + NL + "    }" + NL + "\t";
  protected final String TEXT_30 = NL + "\t" + NL + "    /**" + NL + "     * Default empty constructor." + NL + "\t * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_31 = "Form() {" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public ";
  protected final String TEXT_32 = " get";
  protected final String TEXT_33 = "() {" + NL + "        return ";
  protected final String TEXT_34 = ";" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void set";
  protected final String TEXT_35 = "(";
  protected final String TEXT_36 = " ";
  protected final String TEXT_37 = ") {" + NL + "        this.";
  protected final String TEXT_38 = " = ";
  protected final String TEXT_39 = ";" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public ";
  protected final String TEXT_40 = "Search get";
  protected final String TEXT_41 = "Search() {" + NL + "        return ";
  protected final String TEXT_42 = "Search;" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void set";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = "Search ";
  protected final String TEXT_45 = "Search) {" + NL + "        this.";
  protected final String TEXT_46 = "Search = ";
  protected final String TEXT_47 = "Search;" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public Long[] getDeleteID() {" + NL + "        return deleteID;" + NL + "    }" + NL + "" + NL + "\t/** " + NL + "\t * @generated" + NL + "\t */" + NL + "    public void setDeleteID(Long[] deleteID) {" + NL + "        this.deleteID = deleteID;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping," + NL + "     *      javax.servlet.http.HttpServletRequest)" + NL + "\t * @generated" + NL + "     */" + NL + "    public void reset(ActionMapping mapping, HttpServletRequest request) {" + NL + "        // reset any boolean data types to false";
  protected final String TEXT_48 = NL + "        ";
  protected final String TEXT_49 = " = new ";
  protected final String TEXT_50 = "Impl();";
  protected final String TEXT_51 = NL + "        ";
  protected final String TEXT_52 = "Search = new ";
  protected final String TEXT_53 = "SearchImpl();" + NL + "        deleteID = null;" + NL + "    }" + NL + "}";
  protected final String TEXT_54 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage();
     
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
    importManager.addImport(xPackage.getName() + ".model.impl.*");
    importManager.addImport("chrome.xmdl.lib.ui.web.form.*");
    importManager.addImport("org.apache.struts.action.*");
    importManager.addImport("javax.servlet.http.*");
    importManager.addImport("java.io.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_11);
     if (MasterChildHelper.INST.isChild(xClass)) { 
		   XClass master = MasterChildHelper.INST.getMaster(xClass);
		   if (master != null) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_19);
    }
	   } 
    stringBuffer.append(TEXT_20);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() instanceof XEnumeration) {
    stringBuffer.append(TEXT_21);
    XEnumeration xenum = (XEnumeration ) attribute.getType();
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getCapName(xenum));
    stringBuffer.append(TEXT_29);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_30);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_53);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_54);
    return stringBuffer.toString();
  }
}
