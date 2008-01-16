package org.xmdl.core.templates.model.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityImplTemplateImpl
{
  protected static String nl;
  public static synchronized EntityImplTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityImplTemplateImpl result = new EntityImplTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".model.impl;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/** " + NL + " * $Id$       " + NL + " * @generated" + NL + " */ " + NL + "public class ";
  protected final String TEXT_7 = "Impl extends AbstractEntity implements ";
  protected final String TEXT_8 = " {" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_9 = "Impl() { }" + NL + "        ";
  protected final String TEXT_10 = NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = " = ";
  protected final String TEXT_13 = ";";
  protected final String TEXT_14 = NL + NL;
  protected final String TEXT_15 = NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = "() {" + NL + "        return ";
  protected final String TEXT_18 = ";" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = " new";
  protected final String TEXT_21 = ")    {" + NL + "        this.";
  protected final String TEXT_22 = " = new";
  protected final String TEXT_23 = ";" + NL + "    }";
  protected final String TEXT_24 = NL + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public String toString() {" + NL + "        StringBuffer sb = new StringBuffer();" + NL + "        sb.append(getClass().toString());" + NL + "        sb.append(\"(\");" + NL + "        sb.append(getID());" + NL + "        sb.append(\")\");";
  protected final String TEXT_25 = NL + "        sb.append(\"[";
  protected final String TEXT_26 = ":\");" + NL + "        sb.append(";
  protected final String TEXT_27 = "());" + NL + "        sb.append(\"]\");";
  protected final String TEXT_28 = NL + "        return sb.toString();" + NL + "    }" + NL + "" + NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
    ClassHelper helper = XMDLEntityHelper.INSTANCE;    
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");
    
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_4);
    importManager.addImport("java.util.*");
    importManager.addImport("org.xmdl.lib.dao.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
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
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_13);
    }
    }
    stringBuffer.append(TEXT_14);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_23);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_24);
    for (Iterator<XAttribute> i= xClass.getSimpleAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_27);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getCapName(xClass));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
