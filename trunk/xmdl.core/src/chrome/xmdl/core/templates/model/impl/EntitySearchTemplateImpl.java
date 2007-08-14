package chrome.xmdl.core.templates.model.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntitySearchTemplateImpl
{
  protected static String nl;
  public static synchronized EntitySearchTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntitySearchTemplateImpl result = new EntitySearchTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".model;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * Search bean for ";
  protected final String TEXT_5 = NL + " *   " + NL + " * @generated" + NL + " */" + NL + "public interface ";
  protected final String TEXT_6 = "Search extends SearchBean { " + NL;
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = NL + "\t";
  protected final String TEXT_9 = NL + NL + "    /** " + NL + "     * @generated" + NL + "     */";
  protected final String TEXT_10 = NL + "    ";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "Min();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    void set";
  protected final String TEXT_13 = "Min(";
  protected final String TEXT_14 = " new";
  protected final String TEXT_15 = ");" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */";
  protected final String TEXT_16 = NL + "    ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = "Max();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    void set";
  protected final String TEXT_19 = "Max(";
  protected final String TEXT_20 = " new";
  protected final String TEXT_21 = ");" + NL + "" + NL + "\t";
  protected final String TEXT_22 = NL + "\t" + NL + "    /** " + NL + "     * @generated" + NL + "     */";
  protected final String TEXT_23 = NL + "    ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = "();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    void set";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = " new";
  protected final String TEXT_28 = ");" + NL + "\t" + NL + "\t";
  protected final String TEXT_29 = NL + NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
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
    importManager.addImport("java.util.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_6);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    stringBuffer.append(TEXT_7);
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_8);
    	XType type = attribute.getType();
		boolean comparable = type.isComparable();
		if (comparable) {
	
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
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_21);
    } else {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_28);
    }
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getCapName(xClass));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
