package chrome.xmdl.core.templates.service.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityServiceTemplateImpl
{
  protected static String nl;
  public static synchronized EntityServiceTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityServiceTemplateImpl result = new EntityServiceTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".bo;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "import chrome.xmdl.lib.bo.EntityService;" + NL + "import ";
  protected final String TEXT_6 = ";" + NL + "" + NL + "/** " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public interface ";
  protected final String TEXT_7 = "Service " + NL + "extends EntityService <";
  protected final String TEXT_8 = "> {" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_9 = "DAO get";
  protected final String TEXT_10 = "DAO();" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_11 = "DAO(";
  protected final String TEXT_12 = "DAO dao);" + NL + "" + NL + "    /**" + NL + "     * Key used to identify a ";
  protected final String TEXT_13 = " entity" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_14 = "_KEY = ";
  protected final String TEXT_15 = ".class.getName() + \".entity\";" + NL + "" + NL + "    /** " + NL + "     * Key used to identify a ";
  protected final String TEXT_16 = " entity ID" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_17 = "_ID_KEY = ";
  protected final String TEXT_18 = ".class.getName() + \".key\";" + NL + "" + NL + "    /** " + NL + "     * Key used to identify a ";
  protected final String TEXT_19 = " entity list" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_20 = "_LIST_KEY = ";
  protected final String TEXT_21 = ".class.getName() + \".list\";" + NL + "" + NL + "    /** " + NL + "     * Key used to identify a ";
  protected final String TEXT_22 = " entity search bean" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_23 = "_SEARCH_KEY = ";
  protected final String TEXT_24 = ".class.getName() + \".searchEntity\";" + NL + "    " + NL + "\t\t";
  protected final String TEXT_25 = NL + "    /** " + NL + "     * Key used to identify a ";
  protected final String TEXT_26 = " entity search bean" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_27 = "_ID_KEY = ";
  protected final String TEXT_28 = "Service.";
  protected final String TEXT_29 = "_ID_KEY;" + NL + "" + NL + "    /** " + NL + "     * Key used to identify a ";
  protected final String TEXT_30 = " entity search bean" + NL + "     * @generated" + NL + "     */" + NL + "    static final Object ";
  protected final String TEXT_31 = "_KEY = ";
  protected final String TEXT_32 = "Service.";
  protected final String TEXT_33 = "_KEY;    " + NL + "\t\t\t   ";
  protected final String TEXT_34 = NL + NL + "}";

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
    importManager.addImport(helper.getQualifiedName(xPackage) + ".dao.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    importManager.addImport("java.io.Serializable");
    importManager.addImport("org.apache.commons.beanutils.BeanUtils");
    stringBuffer.append(TEXT_4);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_24);
    	XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   if (master != null) { 
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_33);
    }
		   } 
    stringBuffer.append(TEXT_34);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
