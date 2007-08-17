package chrome.xmdl.core.templates.model.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityTemplateImpl
{
  protected static String nl;
  public static synchronized EntityTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityTemplateImpl result = new EntityTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".model;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "/** " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public interface ";
  protected final String TEXT_5 = " extends Entity { " + NL;
  protected final String TEXT_6 = NL + "    /** " + NL + "     * @generated" + NL + "     */";
  protected final String TEXT_7 = NL + "    ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = "();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    void set";
  protected final String TEXT_10 = "(";
  protected final String TEXT_11 = " new";
  protected final String TEXT_12 = ");" + NL;
  protected final String TEXT_13 = NL + NL + "} //";

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
    importManager.addImport("java.util.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_12);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
