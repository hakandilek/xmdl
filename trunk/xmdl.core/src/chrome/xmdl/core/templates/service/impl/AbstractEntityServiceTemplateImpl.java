package chrome.xmdl.core.templates.service.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class AbstractEntityServiceTemplateImpl
{
  protected static String nl;
  public static synchronized AbstractEntityServiceTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    AbstractEntityServiceTemplateImpl result = new AbstractEntityServiceTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".bo.impl;";
  protected final String TEXT_4 = "    " + NL;
  protected final String TEXT_5 = NL + "/** " + NL + " * NOT USED Since 0.4.2" + NL + " * @generated" + NL + " */" + NL + "public abstract class Abstract";
  protected final String TEXT_6 = "Service extends AbstractEntityService<";
  protected final String TEXT_7 = ">" + NL + "        implements ";
  protected final String TEXT_8 = "Service {" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    protected ";
  protected final String TEXT_9 = "DAO dao;" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_10 = "DAO get";
  protected final String TEXT_11 = "DAO() {" + NL + "        return dao;" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_12 = "DAO(";
  protected final String TEXT_13 = "DAO dao) {" + NL + "        this.dao = dao;" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public DAO<";
  protected final String TEXT_14 = "> getDAO() {" + NL + "        return get";
  protected final String TEXT_15 = "DAO();" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void putEntity(Context context, ";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = ") {" + NL + "        context.put(";
  protected final String TEXT_18 = "_KEY, ";
  protected final String TEXT_19 = ");" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_20 = " getEntity(Context context) {" + NL + "        return (";
  protected final String TEXT_21 = ") context.get(";
  protected final String TEXT_22 = "_KEY);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void putID(Context context, Long id) {" + NL + "        context.put(";
  protected final String TEXT_23 = "_ID_KEY, id);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public Long getID(Context context) {" + NL + "        return (Long) context.get(";
  protected final String TEXT_24 = "_ID_KEY);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void putEntityList(Context context, List<";
  protected final String TEXT_25 = "> ";
  protected final String TEXT_26 = "s) {" + NL + "        context.put(";
  protected final String TEXT_27 = "_LIST_KEY, ";
  protected final String TEXT_28 = "s);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public List<";
  protected final String TEXT_29 = "> getEntityList(Context context) {" + NL + "        return (List<";
  protected final String TEXT_30 = ">) context.get(";
  protected final String TEXT_31 = "_LIST_KEY);" + NL + "    }" + NL + "" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public Object getKeys(Context context) {" + NL + "        return context.get(";
  protected final String TEXT_32 = "_ID_KEY);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public SearchBean<";
  protected final String TEXT_33 = "> getSearchBean(Context context) {" + NL + "        return (SearchBean<";
  protected final String TEXT_34 = ">) context.get(";
  protected final String TEXT_35 = "_SEARCH_KEY);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    public void putSearchBean(Context context, SearchBean<";
  protected final String TEXT_36 = "> searchBean) {" + NL + "        context.put(";
  protected final String TEXT_37 = "_SEARCH_KEY, searchBean);" + NL + "    }" + NL + "" + NL + "    /** " + NL + "     * @generated" + NL + "     */" + NL + "    protected ";
  protected final String TEXT_38 = " merge(";
  protected final String TEXT_39 = " ";
  protected final String TEXT_40 = "1, ";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = "2) {";
  protected final String TEXT_43 = NL + "        ";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = " = ";
  protected final String TEXT_46 = "1;" + NL + "        //todo" + NL + "        return ";
  protected final String TEXT_47 = ";" + NL + "    }" + NL + "" + NL + "}";
  protected final String TEXT_48 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage();
    XProject  xProject = xPackage.getProject(); 
     
    DBHelper dbHelper = XMDLDBHelper.INSTANCE;    
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    stringBuffer.append(TEXT_1);
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
importManager.addImport("chrome.xmdl.lib.bo.*");
importManager.addImport("chrome.xmdl.lib.dao.*");
importManager.addImport("org.apache.commons.chain.*");
importManager.addImport(helper.getQualifiedName(xPackage) + ".bo.*");
importManager.addImport(helper.getQualifiedName(xPackage) + ".model.*");
importManager.addImport(helper.getQualifiedName(xPackage) + ".dao.*");

    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_5);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_47);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_48);
    return stringBuffer.toString();
  }
}
