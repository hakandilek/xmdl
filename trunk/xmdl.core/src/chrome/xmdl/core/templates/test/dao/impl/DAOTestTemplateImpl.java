package chrome.xmdl.core.templates.test.dao.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class DAOTestTemplateImpl
{
  protected static String nl;
  public static synchronized DAOTestTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DAOTestTemplateImpl result = new DAOTestTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "    ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".dao;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * DAO test for ";
  protected final String TEXT_7 = NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_8 = "DAOTest extends BaseDAOTestCase<";
  protected final String TEXT_9 = "> {" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_10 = "DAO dao;" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void setDAO(";
  protected final String TEXT_11 = "DAO dao) {" + NL + "        this.dao = dao;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testLoad() throws Exception {";
  protected final String TEXT_12 = NL + "        ";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = " = dao.newEntity();";
  protected final String TEXT_15 = NL + "        ";
  protected final String TEXT_16 = " = populate(";
  protected final String TEXT_17 = ");" + NL + "" + NL + "        dao.dbModify(";
  protected final String TEXT_18 = ", identifier);" + NL + "        assertNotNull(";
  protected final String TEXT_19 = ".getID());" + NL;
  protected final String TEXT_20 = NL + "        ";
  protected final String TEXT_21 = " = dao.load(";
  protected final String TEXT_22 = ".getID(), identifier);" + NL;
  protected final String TEXT_23 = NL + "        assertEquals(";
  protected final String TEXT_24 = ".";
  protected final String TEXT_25 = "(), ";
  protected final String TEXT_26 = ");";
  protected final String TEXT_27 = NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testLoadLazy() throws Exception {";
  protected final String TEXT_28 = NL + "        ";
  protected final String TEXT_29 = " ";
  protected final String TEXT_30 = " = dao.newEntity();" + NL;
  protected final String TEXT_31 = NL + "        ";
  protected final String TEXT_32 = " = dao.loadLazy(new Long(Integer.MIN_VALUE), identifier);" + NL + "" + NL + "        //should not be null" + NL + "        assertNotNull(";
  protected final String TEXT_33 = ");" + NL + "" + NL + "        try {";
  protected final String TEXT_34 = NL + "            ";
  protected final String TEXT_35 = ".";
  protected final String TEXT_36 = "();";
  protected final String TEXT_37 = NL + "            fail(\"Must fall into exception, because entity is lazy-loaded\");" + NL + "        } catch (ObjectNotFoundException e) {" + NL + "            assertNotNull(e);" + NL + "        }" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testInsert() throws Exception {";
  protected final String TEXT_38 = NL + "        ";
  protected final String TEXT_39 = " ";
  protected final String TEXT_40 = " = dao.newEntity();";
  protected final String TEXT_41 = NL + "        ";
  protected final String TEXT_42 = " = populate(";
  protected final String TEXT_43 = ");" + NL + "        dao.dbInsert(";
  protected final String TEXT_44 = ", identifier);" + NL + "" + NL + "        if (LOGGER.isDebugEnabled()) {" + NL + "            LOGGER.debug(\"inserted ";
  protected final String TEXT_45 = ": \" + ";
  protected final String TEXT_46 = ");" + NL + "        }" + NL + "" + NL + "        assertTrue(";
  protected final String TEXT_47 = ".getID() > 0);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testUpdate() throws Exception {";
  protected final String TEXT_48 = NL + "        ";
  protected final String TEXT_49 = " ";
  protected final String TEXT_50 = " = dao.newEntity();";
  protected final String TEXT_51 = NL + "        ";
  protected final String TEXT_52 = " = populate(";
  protected final String TEXT_53 = ");" + NL + "        dao.dbInsert(";
  protected final String TEXT_54 = ", identifier);" + NL + "" + NL + "        long id = ";
  protected final String TEXT_55 = ".getID();" + NL;
  protected final String TEXT_56 = NL + "        ";
  protected final String TEXT_57 = " = dao.load(id, identifier);" + NL;
  protected final String TEXT_58 = NL + "\t\t";
  protected final String TEXT_59 = " test";
  protected final String TEXT_60 = " = ";
  protected final String TEXT_61 = ";";
  protected final String TEXT_62 = NL + "        ";
  protected final String TEXT_63 = ".set";
  protected final String TEXT_64 = "(test";
  protected final String TEXT_65 = ");\t\t";
  protected final String TEXT_66 = NL + NL + "        dao.dbUpdate(";
  protected final String TEXT_67 = ", identifier);" + NL + "" + NL + "        if (LOGGER.isDebugEnabled()) {" + NL + "            LOGGER.debug(\"updated ";
  protected final String TEXT_68 = ": \" + ";
  protected final String TEXT_69 = ");" + NL + "        }" + NL;
  protected final String TEXT_70 = NL + "        assertEquals(";
  protected final String TEXT_71 = ".";
  protected final String TEXT_72 = "(), test";
  protected final String TEXT_73 = ");";
  protected final String TEXT_74 = NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testModify() throws Exception {";
  protected final String TEXT_75 = NL + "        ";
  protected final String TEXT_76 = " ";
  protected final String TEXT_77 = " = dao.newEntity();";
  protected final String TEXT_78 = NL + "        ";
  protected final String TEXT_79 = " = populate(";
  protected final String TEXT_80 = ");" + NL + "        dao.dbInsert(";
  protected final String TEXT_81 = ", identifier);" + NL + "" + NL + "        long id = ";
  protected final String TEXT_82 = ".getID();" + NL;
  protected final String TEXT_83 = NL + "        ";
  protected final String TEXT_84 = " = dao.load(id, identifier);" + NL + "        ";
  protected final String TEXT_85 = NL + "\t\t";
  protected final String TEXT_86 = " test";
  protected final String TEXT_87 = " = ";
  protected final String TEXT_88 = ";";
  protected final String TEXT_89 = NL + "        ";
  protected final String TEXT_90 = ".set";
  protected final String TEXT_91 = "(test";
  protected final String TEXT_92 = ");\t\t";
  protected final String TEXT_93 = NL + "        " + NL + "        //update" + NL + "        dao.dbModify(";
  protected final String TEXT_94 = ", identifier);" + NL + "" + NL + "        if (LOGGER.isDebugEnabled()) {" + NL + "            LOGGER.debug(\"modified ";
  protected final String TEXT_95 = ": \" + ";
  protected final String TEXT_96 = ");" + NL + "        }" + NL;
  protected final String TEXT_97 = NL + "        assertEquals(";
  protected final String TEXT_98 = ".";
  protected final String TEXT_99 = "(), test";
  protected final String TEXT_100 = ");";
  protected final String TEXT_101 = NL;
  protected final String TEXT_102 = NL + "        ";
  protected final String TEXT_103 = " = dao.newEntity();";
  protected final String TEXT_104 = NL + "        ";
  protected final String TEXT_105 = " = populate(";
  protected final String TEXT_106 = ");" + NL + "        " + NL + "        //insert";
  protected final String TEXT_107 = NL + "        ";
  protected final String TEXT_108 = ".set";
  protected final String TEXT_109 = "(test";
  protected final String TEXT_110 = ");\t\t";
  protected final String TEXT_111 = NL + "        dao.dbModify(";
  protected final String TEXT_112 = ", identifier);" + NL + "" + NL + "        if (LOGGER.isDebugEnabled()) {" + NL + "            LOGGER.debug(\"modified ";
  protected final String TEXT_113 = ": \" + ";
  protected final String TEXT_114 = ");" + NL + "        }" + NL + NL;
  protected final String TEXT_115 = NL + "        assertEquals(";
  protected final String TEXT_116 = ".";
  protected final String TEXT_117 = "(), test";
  protected final String TEXT_118 = ");";
  protected final String TEXT_119 = NL + "        assertTrue(";
  protected final String TEXT_120 = ".getID() > 0);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testDelete() throws Exception {";
  protected final String TEXT_121 = NL + "        ";
  protected final String TEXT_122 = " ";
  protected final String TEXT_123 = " = dao.newEntity();";
  protected final String TEXT_124 = NL + "        ";
  protected final String TEXT_125 = " = populate(";
  protected final String TEXT_126 = ");" + NL + "" + NL + "        dao.dbModify(";
  protected final String TEXT_127 = ", identifier);" + NL + "" + NL + "        assertNotNull(";
  protected final String TEXT_128 = ".getID());";
  protected final String TEXT_129 = NL + "        assertEquals(";
  protected final String TEXT_130 = ".";
  protected final String TEXT_131 = "(), ";
  protected final String TEXT_132 = ");";
  protected final String TEXT_133 = NL + NL + "        if (LOGGER.isDebugEnabled()) {" + NL + "            LOGGER.debug(\"removing ";
  protected final String TEXT_134 = ":\" + ";
  protected final String TEXT_135 = ");" + NL + "        }" + NL + "" + NL + "        dao.dbDelete(";
  protected final String TEXT_136 = ", identifier);" + NL + "" + NL + "        try {";
  protected final String TEXT_137 = NL + "            ";
  protected final String TEXT_138 = " = dao.load(";
  protected final String TEXT_139 = ".getID(), identifier);" + NL + "            fail(\"Entity found in database\");" + NL + "        } catch (DataAccessException dae) {" + NL + "            LOGGER.debug(\"Expected exception: \" + dae.getMessage());" + NL + "            assertNotNull(dae);" + NL + "        }" + NL + "    }" + NL + "" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testFindAll() throws Exception {" + NL + "        int size = 10;" + NL + "        for (int i = 0; i < size; i++) {";
  protected final String TEXT_140 = NL + "            ";
  protected final String TEXT_141 = " ";
  protected final String TEXT_142 = " = dao.newEntity();";
  protected final String TEXT_143 = NL + "            ";
  protected final String TEXT_144 = " = populate(";
  protected final String TEXT_145 = ");" + NL + "            dao.dbInsert(";
  protected final String TEXT_146 = ", identifier);" + NL + "        }" + NL + "" + NL + "        List<";
  protected final String TEXT_147 = "> results = dao.findAll(identifier);" + NL + "        assertTrue(results.size() >= size);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testFindByExample() throws Exception {" + NL + "        int size = 10;" + NL + "        for (int i = 0; i < size; i++) {";
  protected final String TEXT_148 = NL + "            ";
  protected final String TEXT_149 = " ";
  protected final String TEXT_150 = " = dao.newEntity();";
  protected final String TEXT_151 = NL + "            ";
  protected final String TEXT_152 = " = populate(";
  protected final String TEXT_153 = ");" + NL + "            dao.dbInsert(";
  protected final String TEXT_154 = ", identifier);" + NL + "        }" + NL;
  protected final String TEXT_155 = NL + "        ";
  protected final String TEXT_156 = " example = dao.newEntity();" + NL + "        example = populate(example);" + NL + "" + NL + "        List<";
  protected final String TEXT_157 = "> results = dao.findByExample(example, identifier);" + NL + "        assertTrue(results.size() >= size);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testFindByPrimaryKey() throws Exception {" + NL + "        int size = 10;" + NL + "        Long[] pKeys = new Long[10];" + NL + "        for (int i = 0; i < size; i++) {";
  protected final String TEXT_158 = NL + "            ";
  protected final String TEXT_159 = " ";
  protected final String TEXT_160 = " = dao.newEntity();";
  protected final String TEXT_161 = NL + "            ";
  protected final String TEXT_162 = " = populate(";
  protected final String TEXT_163 = ");" + NL + "            dao.dbInsert(";
  protected final String TEXT_164 = ", identifier);" + NL + "            pKeys[i] = ";
  protected final String TEXT_165 = ".getID();" + NL + "        }" + NL + "" + NL + "        List<";
  protected final String TEXT_166 = "> results = dao.findAll(pKeys, identifier);" + NL + "        assertTrue(results.size() >= size);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testSearch() throws Exception {" + NL + "        int size = 10;" + NL + "        for (int i = 0; i < size; i++) {";
  protected final String TEXT_167 = NL + "            ";
  protected final String TEXT_168 = " ";
  protected final String TEXT_169 = " = dao.newEntity();";
  protected final String TEXT_170 = NL + "            ";
  protected final String TEXT_171 = " = populate(";
  protected final String TEXT_172 = ");" + NL + "            dao.dbInsert(";
  protected final String TEXT_173 = ", identifier);" + NL + "        }" + NL;
  protected final String TEXT_174 = NL + "        ";
  protected final String TEXT_175 = "Search searchBean = new ";
  protected final String TEXT_176 = "SearchImpl();" + NL + "        ";
  protected final String TEXT_177 = NL + "        searchBean.set";
  protected final String TEXT_178 = "(";
  protected final String TEXT_179 = ");";
  protected final String TEXT_180 = "        " + NL + "" + NL + "        List<";
  protected final String TEXT_181 = "> results = dao.search(searchBean, identifier);" + NL + "        assertTrue(results.size() >= size);" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
    DBHelper dbHelper = XMDLDBHelper.INSTANCE;    
    ClassHelper helper = XMDLEntityHelper.INSTANCE;
    TestHelper testHelper = TestHelper.INSTANCE;
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
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.impl.*");
    importManager.addImport("chrome.xmdl.lib.test.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    importManager.addImport("org.hibernate.*");
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
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_22);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(testHelper.randomValueString(attribute));
    stringBuffer.append(TEXT_26);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_33);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_36);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_37);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_57);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(testHelper.randomValueString(attribute));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_65);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_66);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_69);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_73);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_74);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_84);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(helper.getImportedAttributeType(attribute));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(testHelper.randomValueString(attribute));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_92);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_93);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_96);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_100);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_101);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_106);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_110);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_111);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_114);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_118);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_119);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(TEXT_121);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(TEXT_124);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_128);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_129);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(testHelper.randomValueString(attribute));
    stringBuffer.append(TEXT_132);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_133);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_152);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(TEXT_158);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(TEXT_161);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(TEXT_167);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_169);
    stringBuffer.append(TEXT_170);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_171);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_176);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference() && !attribute.getType().isComparable()) {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(testHelper.randomValueStringTrimmed(attribute, 2));
    stringBuffer.append(TEXT_179);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_180);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_181);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
