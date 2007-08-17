package chrome.xmdl.core.templates.ui.web.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class ParameterKeysImpl
{
  protected static String nl;
  public static synchronized ParameterKeysImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ParameterKeysImpl result = new ParameterKeysImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.action;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * $Id$" + NL + " * Created: 17.?ub.2006 13:28:22" + NL + " *" + NL + " * @author hd" + NL + " * @generated" + NL + " */" + NL + "public interface ParameterKeys {" + NL + NL;
  protected final String TEXT_5 = NL + "   /**" + NL + "     * The request scope attribute that holds the {@link ";
  protected final String TEXT_6 = "} form." + NL + "\t * @generated " + NL + "     */" + NL + "    public static final String ";
  protected final String TEXT_7 = "_FORM = \"";
  protected final String TEXT_8 = "Form\";" + NL + "" + NL + "    /**" + NL + "     * The request scope attribute that holds the {@link ";
  protected final String TEXT_9 = "} list" + NL + "\t * @generated " + NL + "     */" + NL + "    public static final String ";
  protected final String TEXT_10 = "_LIST = \"";
  protected final String TEXT_11 = "List\";" + NL + "" + NL + "    /**" + NL + "     * The request scope attribute that holds the {@link ";
  protected final String TEXT_12 = "} entity." + NL + "\t * @generated " + NL + "     */" + NL + "    public static final String ";
  protected final String TEXT_13 = "_ENTITY = \"";
  protected final String TEXT_14 = "Entity\";" + NL + "    " + NL + "    /**" + NL + "     * The request scope attribute that holds the {@link Book} ID." + NL + "\t * @generated" + NL + "     */" + NL + "    public static final String ";
  protected final String TEXT_15 = "_ID = \"";
  protected final String TEXT_16 = "ID\";" + NL + "    ";
  protected final String TEXT_17 = NL + NL + " " + NL + "}";
  protected final String TEXT_18 = NL;

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
    for (Object xo : xPackage.getClasses()) {
XClass xClass=(XClass)xo;
    stringBuffer.append(TEXT_5);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
