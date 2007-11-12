package org.xmdl.ida.templates.core.model;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityImpl
{
  protected static String nl;
  public static synchronized EntityImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityImpl result = new EntityImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".model;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".model;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_7 = " entity bean" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "@Entity (name=(\"TODO:\"))" + NL + "public interface ";
  protected final String TEXT_8 = " extends BaseObject implements Serializable {" + NL;
  protected final String TEXT_9 = NL + "    /** " + NL + "     * @generated" + NL + "     */";
  protected final String TEXT_10 = NL + "    ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    void set";
  protected final String TEXT_13 = "(";
  protected final String TEXT_14 = " new";
  protected final String TEXT_15 = ");" + NL;
  protected final String TEXT_16 = NL + NL + NL + "}";

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
    importManager.addImport("org.xmdl.ida.lib.BaseConstants");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_15);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_16);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
