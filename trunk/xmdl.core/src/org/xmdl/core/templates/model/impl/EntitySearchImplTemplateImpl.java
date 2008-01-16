package org.xmdl.core.templates.model.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntitySearchImplTemplateImpl
{
  protected static String nl;
  public static synchronized EntitySearchImplTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntitySearchImplTemplateImpl result = new EntitySearchImplTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".model.impl;";
  protected final String TEXT_3 = NL + "/**" + NL + " * Search bean implementation for ";
  protected final String TEXT_4 = "  " + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = "SearchImpl" + NL + "        extends AbstractSearchBean implements ";
  protected final String TEXT_6 = "Search {" + NL + " " + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_7 = "SearchImpl() { }" + NL + "    ";
  protected final String TEXT_8 = NL + "\t";
  protected final String TEXT_9 = NL + "\t";
  protected final String TEXT_10 = NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "Min = ";
  protected final String TEXT_13 = ";" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = "Max = ";
  protected final String TEXT_16 = ";" + NL + "\t";
  protected final String TEXT_17 = NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = " = ";
  protected final String TEXT_20 = ";" + NL + "\t";
  protected final String TEXT_21 = NL + "    " + NL + " ";
  protected final String TEXT_22 = NL + "\t";
  protected final String TEXT_23 = NL + "\t";
  protected final String TEXT_24 = NL + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_25 = " ";
  protected final String TEXT_26 = "Min() {" + NL + "        return ";
  protected final String TEXT_27 = "Min;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_28 = "Min(";
  protected final String TEXT_29 = " new";
  protected final String TEXT_30 = "Min)    {" + NL + "        this.";
  protected final String TEXT_31 = "Min = new";
  protected final String TEXT_32 = "Min;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = "Max() {" + NL + "        return ";
  protected final String TEXT_35 = "Max;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_36 = "Max(";
  protected final String TEXT_37 = " new";
  protected final String TEXT_38 = "Max)    {" + NL + "        this.";
  protected final String TEXT_39 = "Max = new";
  protected final String TEXT_40 = "Max;" + NL + "    }" + NL + "" + NL + "\t";
  protected final String TEXT_41 = NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = "() {" + NL + "        return ";
  protected final String TEXT_44 = ";" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = " new";
  protected final String TEXT_47 = ")    {" + NL + "        this.";
  protected final String TEXT_48 = " = new";
  protected final String TEXT_49 = ";" + NL + "    }" + NL + "\t" + NL + "\t";
  protected final String TEXT_50 = NL + NL + "} //";

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
    
importManager.addImport("java.util.*");
importManager.addImport("org.xmdl.lib.dao.*");
importManager.addImport(helper.getQualifiedName(xPackage) + ".model.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    stringBuffer.append(TEXT_8);
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_9);
    	XType type = attribute.getType();
		boolean comparable = type.isComparable();
		if (comparable) {
	
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_16);
      } else {  
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_20);
      }  
    }
    }
    stringBuffer.append(TEXT_21);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    stringBuffer.append(TEXT_22);
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_23);
    	XType type = attribute.getType();
		boolean comparable = type.isComparable();
		if (comparable) {
	
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_40);
    } else {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_49);
    }
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_50);
    stringBuffer.append(helper.getCapName(xClass));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
