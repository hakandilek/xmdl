package chrome.xmdl.core.templates.dao.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityDAOImplTemplateImpl
{
  protected static String nl;
  public static synchronized EntityDAOImplTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityDAOImplTemplateImpl result = new EntityDAOImplTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "    ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".dao.impl;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_7 = "DAOImpl extends HibernateDAO<";
  protected final String TEXT_8 = "> implements ";
  protected final String TEXT_9 = "DAO {" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate static final Log LOGGER = LogFactory.getLog(";
  protected final String TEXT_10 = "DAOImpl.class);" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public static final ";
  protected final String TEXT_11 = "DAO INSTANCE = new  ";
  protected final String TEXT_12 = "DAOImpl();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    protected void ";
  protected final String TEXT_13 = "() { }" + NL + "    " + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    protected Class getEntityClass(){" + NL + "        return ";
  protected final String TEXT_14 = "Impl.class;" + NL + "    }" + NL + "    " + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public ";
  protected final String TEXT_15 = " newEntity(){" + NL + "        return  new  ";
  protected final String TEXT_16 = "Impl();" + NL + "        " + NL + "    }" + NL + "    " + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public List<";
  protected final String TEXT_17 = "> search(SearchBean<";
  protected final String TEXT_18 = "> searchBean, Identifier identifier) {" + NL + "        LOGGER.debug(\"";
  protected final String TEXT_19 = "DAOImpl.search\");" + NL + "        Criteria _criteria = getSession().createCriteria(";
  protected final String TEXT_20 = ".class);" + NL;
  protected final String TEXT_21 = NL + "        ";
  protected final String TEXT_22 = "Search _search =  (";
  protected final String TEXT_23 = "Search) searchBean;" + NL + "" + NL + "        int _firstResult = _search.getFirstResult_();" + NL + "        int _maxResults = _search.getMaxResults_();" + NL + "        String _orderProperty = _search.getOrderProperty_();" + NL + "        boolean _ascending = _search.isAscending_();" + NL + "" + NL + "" + NL + "        if (_orderProperty != null) {" + NL + "            if (_ascending) _criteria.addOrder(Order.asc(_orderProperty));" + NL + "            else _criteria.addOrder(Order.desc(_orderProperty));" + NL + "        }" + NL + "" + NL + "        if (_firstResult > 0) _criteria.setFirstResult(_firstResult);" + NL + "        if (_maxResults > 0) _criteria.setMaxResults(_maxResults);" + NL + "" + NL + "" + NL + "        long ID = _search.getID();";
  protected final String TEXT_24 = NL + "\t\t";
  protected final String TEXT_25 = NL + "\t";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = "Min = _search.";
  protected final String TEXT_28 = "Min();" + NL + "\t";
  protected final String TEXT_29 = " ";
  protected final String TEXT_30 = "Max = _search.";
  protected final String TEXT_31 = "Max();" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = " = _search.";
  protected final String TEXT_35 = "();" + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t";
  protected final String TEXT_37 = NL + NL + "        if (ID != 0) {" + NL + "            _criteria.add(Expression.eq(\"ID\", ID));" + NL + "        }" + NL;
  protected final String TEXT_38 = NL + "\t\t";
  protected final String TEXT_39 = NL + "        if (";
  protected final String TEXT_40 = "Min != ";
  protected final String TEXT_41 = ") {" + NL + "            _criteria.add(Expression.ge(\"";
  protected final String TEXT_42 = "\", ";
  protected final String TEXT_43 = "Min ));" + NL + "        }" + NL + "" + NL + "        if (";
  protected final String TEXT_44 = "Max != ";
  protected final String TEXT_45 = ") {" + NL + "            _criteria.add(Expression.le(\"";
  protected final String TEXT_46 = "\", ";
  protected final String TEXT_47 = "Max ));" + NL + "        }" + NL + "\t\t";
  protected final String TEXT_48 = NL + "\t\tif (";
  protected final String TEXT_49 = " != ";
  protected final String TEXT_50 = ") {" + NL + "            _criteria.add(Expression.eq(\"";
  protected final String TEXT_51 = "\", ";
  protected final String TEXT_52 = " ));" + NL + "        }\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_53 = NL + "        if (";
  protected final String TEXT_54 = " != ";
  protected final String TEXT_55 = ") {" + NL + "            _criteria.add(Expression.like(\"";
  protected final String TEXT_56 = "\", \"%\" + ";
  protected final String TEXT_57 = " + \"%\"));" + NL + "        }" + NL + "\t\t";
  protected final String TEXT_58 = NL + "\t";
  protected final String TEXT_59 = "\t\t";
  protected final String TEXT_60 = NL + NL + "        List list = _criteria.list();" + NL + "        return list;" + NL + "    }" + NL + "    ";
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * Find by certain master entity" + NL + "\t * @generated" + NL + "\t */" + NL + "    public List<";
  protected final String TEXT_62 = "> findBy(";
  protected final String TEXT_63 = " ";
  protected final String TEXT_64 = ", Identifier identifier) {" + NL + "        LOGGER.debug(\"";
  protected final String TEXT_65 = "DAOImpl.findBy\");" + NL + "        Class entityClass = getEntityClass();" + NL + "        String className = entityClass.getName();" + NL + "        Query query = getSession()" + NL + "                .createQuery(\"from \" + className + \" as o where o.";
  protected final String TEXT_66 = " = :";
  protected final String TEXT_67 = " \");" + NL + "        query.setParameter(\"";
  protected final String TEXT_68 = "\", ";
  protected final String TEXT_69 = ".getID(), Hibernate.LONG);" + NL + "        return (List<";
  protected final String TEXT_70 = ">) query.list();    \t" + NL + "    }" + NL + "\t";
  protected final String TEXT_71 = "    " + NL + "" + NL + "} //";
  protected final String TEXT_72 = "DAO";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");
    ClassHelper helper = XMDLEntityHelper.INSTANCE;    
    
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
importManager.addImport(helper.getQualifiedName(xPackage)+".model.impl.*");
importManager.addImport(helper.getQualifiedName(xPackage)+".dao.*");

importManager.addImport("chrome.xmdl.lib.dao.*");
importManager.addImport("chrome.xmdl.lib.dao.hib.*");
importManager.addImport("org.apache.commons.logging.*");
importManager.addImport("org.hibernate.*");
importManager.addImport("org.hibernate.criterion.*");

    stringBuffer.append(TEXT_5);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

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
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_23);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	XAttribute attribute = (XAttribute) i.next();
	if (!attribute.isReference()) {
		XType type = attribute.getType();
		boolean comparable = type.isComparable();
    stringBuffer.append(TEXT_24);
    if (comparable){
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_31);
    } else {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
    }
    }//for
    stringBuffer.append(TEXT_37);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	XAttribute attribute = (XAttribute) i.next();
	if (!attribute.isReference()) {
		XType type = attribute.getType();
		boolean comparable = type.isComparable();
    stringBuffer.append(TEXT_38);
    if (comparable){
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_47);
    } else  if(type.equals(XmdlTypes.BOOLEAN)||type.equals(XmdlTypes.JAVA_BOOLEAN)) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_52);
    }else{
    stringBuffer.append(TEXT_53);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(helper.getDefaultValue(attribute));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(TEXT_58);
    }
    stringBuffer.append(TEXT_59);
    }//for
    stringBuffer.append(TEXT_60);
    			XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   if (master != null) { 
    stringBuffer.append(TEXT_61);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(helper.uncapName(master.getName()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_70);
                 }
		    } 
    stringBuffer.append(TEXT_71);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_72);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
