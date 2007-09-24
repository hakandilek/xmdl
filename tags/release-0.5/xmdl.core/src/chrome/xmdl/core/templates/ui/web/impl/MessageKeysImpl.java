package chrome.xmdl.core.templates.ui.web.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class MessageKeysImpl
{
  protected static String nl;
  public static synchronized MessageKeysImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    MessageKeysImpl result = new MessageKeysImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.action;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "/**" + NL + " * $Id$" + NL + " * Created: 17.?ub.2006 13:28:22" + NL + " *" + NL + " * @author hd" + NL + " * @generated" + NL + " */" + NL + "public interface MessageKeys {" + NL;
  protected final String TEXT_5 = NL + NL + "    /**" + NL + "     * Message Key for displayed when {@link ";
  protected final String TEXT_6 = "} added" + NL + "     * @generated" + NL + "     */" + NL + "    public static final String MK_";
  protected final String TEXT_7 = "_ADDED = \"";
  protected final String TEXT_8 = ".added\";" + NL + "" + NL + "    /**" + NL + "     * Message Key for displayed when {@link ";
  protected final String TEXT_9 = "} updated" + NL + "     * @generated" + NL + "     */" + NL + "    public static final String MK_";
  protected final String TEXT_10 = "_UPDATED = \"";
  protected final String TEXT_11 = ".updated\";" + NL + "" + NL + "    /**" + NL + "     * Message Key for displayed when {@link ";
  protected final String TEXT_12 = "} deleted" + NL + "     * @generated" + NL + "     */" + NL + "    public static final String MK_";
  protected final String TEXT_13 = "_DELETED = \"";
  protected final String TEXT_14 = ".deleted\";" + NL + "" + NL + "    /**" + NL + "     * Message Key for displayed when {@link ";
  protected final String TEXT_15 = "} not found in context" + NL + "     * @generated" + NL + "     */" + NL + "    public static final String MK_";
  protected final String TEXT_16 = "_NOT_FOUND = \"";
  protected final String TEXT_17 = ".notFound\";";
  protected final String TEXT_18 = NL + NL + "}" + NL + " ";
  protected final String TEXT_19 = NL;

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
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
