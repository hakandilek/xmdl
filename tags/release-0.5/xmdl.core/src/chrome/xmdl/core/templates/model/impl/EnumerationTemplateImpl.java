package chrome.xmdl.core.templates.model.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EnumerationTemplateImpl
{
  protected static String nl;
  public static synchronized EnumerationTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EnumerationTemplateImpl result = new EnumerationTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".model;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "/** " + NL + " * $Id$" + NL + " * Created: 15.?ub.2006 08:22:32" + NL + " *" + NL + " * @author hd" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = " extends PersistentEnum {" + NL;
  protected final String TEXT_6 = NL + "    /**" + NL + "     * @generated" + NL + "     */ " + NL + "    public static final ";
  protected final String TEXT_7 = " ";
  protected final String TEXT_8 = " = new ";
  protected final String TEXT_9 = "(\"";
  protected final String TEXT_10 = "\", ";
  protected final String TEXT_11 = ");" + NL;
  protected final String TEXT_12 = NL + NL + "    /**" + NL + "     * @generated" + NL + "     */ " + NL + "    private ";
  protected final String TEXT_13 = "(String name, int ordinal) {" + NL + "        super(name, ordinal);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */ " + NL + "    public static ";
  protected final String TEXT_14 = " valueOf(String name) {";
  protected final String TEXT_15 = NL + "        ";
  protected final String TEXT_16 = " enm = (";
  protected final String TEXT_17 = ") get(";
  protected final String TEXT_18 = ".class, name);" + NL + "        if (enm == null) {" + NL + "            throw new Error(\"";
  protected final String TEXT_19 = " for Name = \" + name + \" not defined\");" + NL + "        }" + NL + "        return enm;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */ " + NL + "    public static ";
  protected final String TEXT_20 = " valueOf(int value) {";
  protected final String TEXT_21 = NL + "        ";
  protected final String TEXT_22 = " enm = (";
  protected final String TEXT_23 = ") get(";
  protected final String TEXT_24 = ".class, value);" + NL + "        if (enm == null) {" + NL + "            throw new Error(\"";
  protected final String TEXT_25 = " for Value = \" + value + \" not defined\");" + NL + "        }" + NL + "        return enm;" + NL + "    }    " + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */ " + NL + "    static {" + NL + "        ConvertUtils.register(new EnumerationConverter(), ";
  protected final String TEXT_26 = ".class);" + NL + "    }" + NL + "" + NL + "} ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XEnumeration enumeration = (XEnumeration) argument;
    XPackage xPackage = enumeration.getXPackage(); 
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
    importManager.addImport("org.apache.commons.beanutils.ConvertUtils");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    importManager.addImport("chrome.xmdl.lib.helper.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_5);
    for (Iterator<XEnumerationLiteral> i= enumeration.getLiterals().iterator(); i.hasNext();) {
    XEnumerationLiteral l = (XEnumerationLiteral) i.next();
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(l.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(l.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(l.getValue());
    stringBuffer.append(TEXT_11);
    }//for
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getCapName(enumeration));
    stringBuffer.append(TEXT_26);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
