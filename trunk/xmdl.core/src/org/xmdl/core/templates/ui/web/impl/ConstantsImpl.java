package org.xmdl.core.templates.ui.web.impl;

import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

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
  protected final String TEXT_2 = ".ui.web.action;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * $Id$" + NL + " * Created: 17.?ub.2006 13:28:22" + NL + " *" + NL + " * @author hd" + NL + " * @generated" + NL + " */" + NL + "public interface Constants extends MessageKeys, ParameterKeys{" + NL + "" + NL + " " + NL + "}";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

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
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
