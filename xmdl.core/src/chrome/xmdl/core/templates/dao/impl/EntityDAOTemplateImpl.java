package chrome.xmdl.core.templates.dao.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityDAOTemplateImpl
{
  protected static String nl;
  public static synchronized EntityDAOTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityDAOTemplateImpl result = new EntityDAOTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "     ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".dao;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "import ";
  protected final String TEXT_7 = ";" + NL + "/** " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public interface ";
  protected final String TEXT_8 = "DAO " + NL + "extends DAO <";
  protected final String TEXT_9 = "> {" + NL;
  protected final String TEXT_10 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "   public List<";
  protected final String TEXT_11 = "> findBy(";
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = ", Identifier identifier);" + NL + "\t";
  protected final String TEXT_14 = NL + NL + NL + "} //";
  protected final String TEXT_15 = "DAO";

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
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    stringBuffer.append(TEXT_5);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    			XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   if (master != null) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_13);
                 }
		    } 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
