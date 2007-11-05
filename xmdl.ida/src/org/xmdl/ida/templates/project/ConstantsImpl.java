package org.xmdl.ida.templates.project;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.common.util.*;

public class ConstantsImpl
{
  protected static String nl;
  public static synchronized ConstantsImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ConstantsImpl result = new ConstantsImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".model;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * Constant values used throughout the application." + NL + " * " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public interface ApplicationConstants extends BaseConstants {" + NL + "" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    EList<XPackage> packages = prj.getPackages();
    XPackage xPackage = packages.get(0);
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
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
