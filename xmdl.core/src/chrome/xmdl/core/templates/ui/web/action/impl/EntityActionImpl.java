package chrome.xmdl.core.templates.ui.web.action.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityActionImpl
{
  protected static String nl;
  public static synchronized EntityActionImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityActionImpl result = new EntityActionImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.action;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * @author hd" + NL + " * @generated " + NL + " */" + NL + "public final class ";
  protected final String TEXT_7 = "Action extends BaseAction implements Constants {" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    private static final Log LOGGER = LogFactory.getLog(";
  protected final String TEXT_8 = "Action.class);" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    private Command ";
  protected final String TEXT_9 = "Service= null;" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public void set";
  protected final String TEXT_10 = "Service(Command ";
  protected final String TEXT_11 = "Service) {" + NL + "        this.";
  protected final String TEXT_12 = "Service = ";
  protected final String TEXT_13 = "Service;" + NL + "    }" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public ActionForward cancel(ActionMapping mapping, ActionForm actionForm," + NL + "                                HttpServletRequest request, HttpServletResponse response) throws Exception {" + NL + "        LOGGER.debug(\"Entering '";
  protected final String TEXT_14 = "Action.cancel' method\");" + NL + "" + NL + "        HttpSession session = request.getSession();" + NL + "        session.removeAttribute(";
  protected final String TEXT_15 = "_ENTITY);" + NL + "" + NL + "        return mapping.findForward(\"list\");" + NL + "    }" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public ActionForward edit(ActionMapping mapping, ActionForm actionForm," + NL + "                              HttpServletRequest request, HttpServletResponse response) throws Exception {" + NL + "        LOGGER.debug(\"Entering '";
  protected final String TEXT_16 = "Action.edit' method\");" + NL + "" + NL + "        HttpSession session = request.getSession();";
  protected final String TEXT_17 = NL + "        ";
  protected final String TEXT_18 = "Form form = (";
  protected final String TEXT_19 = "Form) actionForm;" + NL + "        ActionMessages messages = new ActionMessages();" + NL + "" + NL + "\t\t";
  protected final String TEXT_20 = NL + "        Long ";
  protected final String TEXT_21 = "ID = form.get";
  protected final String TEXT_22 = "ID();" + NL + "        if (";
  protected final String TEXT_23 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_24 = "ID <= 0){";
  protected final String TEXT_25 = NL + "            ";
  protected final String TEXT_26 = "ID = (Long) session.getAttribute(";
  protected final String TEXT_27 = "_ID);" + NL + "        }" + NL + "        if (";
  protected final String TEXT_28 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_29 = "ID <= 0){" + NL + "            messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                    new ActionMessage(MK_";
  protected final String TEXT_30 = "_NOT_FOUND));" + NL + "            // save messages in request" + NL + "            saveMessages(request, messages);" + NL + "            return mapping.findForward(\"master\");" + NL + "        }\t\t\t    " + NL + "\t\t\t   ";
  protected final String TEXT_31 = NL + NL + "        List<";
  protected final String TEXT_32 = "> prevList = (List<";
  protected final String TEXT_33 = ">) session.getAttribute(";
  protected final String TEXT_34 = "_LIST);" + NL;
  protected final String TEXT_35 = NL + "        ";
  protected final String TEXT_36 = " ";
  protected final String TEXT_37 = " = form.get";
  protected final String TEXT_38 = "();" + NL + "        LOGGER.debug(\"";
  protected final String TEXT_39 = " = \" + ";
  protected final String TEXT_40 = ");" + NL + "        " + NL + "        /** " + NL + "         * Uncomment for sticky edit" + NL + "         * if (";
  protected final String TEXT_41 = ".getID() <= 0) {" + NL + "         *    Object attribute = session.getAttribute(";
  protected final String TEXT_42 = "_ENTITY);" + NL + "         *    LOGGER.debug(\"attribute = \" + attribute);" + NL + "         *    if (attribute != null) ";
  protected final String TEXT_43 = " = (";
  protected final String TEXT_44 = ") attribute;" + NL + "         * }" + NL + "         */" + NL + "" + NL + "        String copyParam = request.getParameter(\"copy\");" + NL + "        boolean copy = \"true\".equalsIgnoreCase(copyParam) || \"1\".equals(copyParam) || \"yes\".equalsIgnoreCase(copyParam);" + NL + "        LOGGER.debug(\"copy = \" + copy);" + NL + "" + NL + "        Context ctx = new ContextBase();" + NL + "" + NL + "\t\t";
  protected final String TEXT_45 = NL + "        ctx.put(";
  protected final String TEXT_46 = "Service.";
  protected final String TEXT_47 = "_ID_KEY, ";
  protected final String TEXT_48 = "ID);" + NL + "\t\t";
  protected final String TEXT_49 = NL + "        ctx.put(EntityService.COPY_KEY, copy);" + NL + "        ctx.put(";
  protected final String TEXT_50 = "Service.";
  protected final String TEXT_51 = "_LIST_KEY, prevList);" + NL + "        ctx.put(";
  protected final String TEXT_52 = "Service.";
  protected final String TEXT_53 = "_KEY, ";
  protected final String TEXT_54 = ");" + NL + "        ctx.put(DispatchService.METHOD, DispatchService.EDIT_METHOD);";
  protected final String TEXT_55 = NL + "        ";
  protected final String TEXT_56 = "Service.execute(ctx);" + NL + "        ";
  protected final String TEXT_57 = NL + "        ";
  protected final String TEXT_58 = " out";
  protected final String TEXT_59 = " = (";
  protected final String TEXT_60 = ") ctx.get(";
  protected final String TEXT_61 = "Service.";
  protected final String TEXT_62 = "_KEY);" + NL + "        LOGGER.debug(\"out";
  protected final String TEXT_63 = " = \" + out";
  protected final String TEXT_64 = ");" + NL + "        " + NL + "\t\t";
  protected final String TEXT_65 = NL + "        ";
  protected final String TEXT_66 = " out";
  protected final String TEXT_67 = " = (";
  protected final String TEXT_68 = ") ctx.get(";
  protected final String TEXT_69 = "Service.";
  protected final String TEXT_70 = "_KEY);" + NL + "        LOGGER.debug(\"out";
  protected final String TEXT_71 = " = \" + out";
  protected final String TEXT_72 = ");" + NL + "        request.setAttribute(";
  protected final String TEXT_73 = "_ENTITY, out";
  protected final String TEXT_74 = ");" + NL + "        session.setAttribute(";
  protected final String TEXT_75 = "_ID, ";
  protected final String TEXT_76 = "ID);" + NL + "        ctx.put(";
  protected final String TEXT_77 = "Service.";
  protected final String TEXT_78 = "_ID_KEY, ";
  protected final String TEXT_79 = "ID);" + NL + "\t\t";
  protected final String TEXT_80 = NL + "        " + NL + "        //bean to form" + NL + "        form.set";
  protected final String TEXT_81 = "(out";
  protected final String TEXT_82 = ");" + NL + "        LOGGER.debug(\"form = \" + form);" + NL + "" + NL + "        List<";
  protected final String TEXT_83 = "> postList = (List<";
  protected final String TEXT_84 = ">) ctx.get(";
  protected final String TEXT_85 = "Service.";
  protected final String TEXT_86 = "_LIST_KEY);" + NL + "        " + NL + "\t\t";
  protected final String TEXT_87 = NL + "        request.setAttribute(";
  protected final String TEXT_88 = "_LIST, postList);" + NL + "\t\t";
  protected final String TEXT_89 = NL + "        session.setAttribute(";
  protected final String TEXT_90 = "_LIST, postList);" + NL + "\t\t";
  protected final String TEXT_91 = NL + "        updateFormBean(mapping, request, form);" + NL + "        LOGGER.debug(\"postList = \" + postList);" + NL + "" + NL + "        saveMessages(request, messages);       " + NL + "        return mapping.findForward(\"success\");" + NL + "    }" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public ActionForward save(ActionMapping mapping, ActionForm actionForm," + NL + "                              HttpServletRequest request, HttpServletResponse response) throws Exception {" + NL + "        LOGGER.debug(\"Entering '";
  protected final String TEXT_92 = "Action.save' method\");" + NL + "" + NL + "        HttpSession session = request.getSession();";
  protected final String TEXT_93 = NL + "        ";
  protected final String TEXT_94 = "Form form = (";
  protected final String TEXT_95 = "Form) actionForm;" + NL + "        ActionMessages messages = new ActionMessages();" + NL + "" + NL + "\t\t";
  protected final String TEXT_96 = NL + "        Long ";
  protected final String TEXT_97 = "ID = form.get";
  protected final String TEXT_98 = "ID();" + NL + "        if (";
  protected final String TEXT_99 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_100 = "ID <= 0){";
  protected final String TEXT_101 = NL + "            ";
  protected final String TEXT_102 = "ID = (Long) session.getAttribute(";
  protected final String TEXT_103 = "_ID);" + NL + "        }" + NL + "        if (";
  protected final String TEXT_104 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_105 = "ID <= 0){" + NL + "            messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                    new ActionMessage(MK_";
  protected final String TEXT_106 = "_NOT_FOUND));" + NL + "            // save messages in request" + NL + "            saveMessages(request, messages);" + NL + "            return mapping.findForward(\"master\");" + NL + "        }\t\t\t    " + NL + "\t\t";
  protected final String TEXT_107 = NL;
  protected final String TEXT_108 = NL + "        ";
  protected final String TEXT_109 = " ";
  protected final String TEXT_110 = " = form.get";
  protected final String TEXT_111 = "();" + NL + "        LOGGER.debug(\"";
  protected final String TEXT_112 = " = \" + ";
  protected final String TEXT_113 = ");" + NL + "        " + NL + "        boolean isNew = (0 == ";
  protected final String TEXT_114 = ".getID());" + NL + "" + NL + "        Context ctx = new ContextBase();" + NL + "\t\t";
  protected final String TEXT_115 = NL + "        ctx.put(";
  protected final String TEXT_116 = "Service.";
  protected final String TEXT_117 = "_ID_KEY, ";
  protected final String TEXT_118 = "ID);" + NL + "\t\t";
  protected final String TEXT_119 = NL + "        ctx.put(";
  protected final String TEXT_120 = "Service.";
  protected final String TEXT_121 = "_KEY,form.get";
  protected final String TEXT_122 = "());" + NL + "        ctx.put(DispatchService.METHOD, DispatchService.SAVE_METHOD);";
  protected final String TEXT_123 = NL + "        ";
  protected final String TEXT_124 = "Service.execute(ctx);" + NL + "        ";
  protected final String TEXT_125 = NL + "        ";
  protected final String TEXT_126 = " out";
  protected final String TEXT_127 = " = (";
  protected final String TEXT_128 = ") ctx.get(";
  protected final String TEXT_129 = "Service.";
  protected final String TEXT_130 = "_KEY);" + NL + "        List<";
  protected final String TEXT_131 = "> resultList = (List<";
  protected final String TEXT_132 = ">) ctx.get(";
  protected final String TEXT_133 = "Service.";
  protected final String TEXT_134 = "_LIST_KEY);" + NL + "        session.setAttribute(";
  protected final String TEXT_135 = "_LIST, resultList);" + NL + "" + NL + "        /** " + NL + "         * Uncomment for sticky edit" + NL + "         * session.setAttribute(";
  protected final String TEXT_136 = "_ENTITY, out";
  protected final String TEXT_137 = ");" + NL + "         */" + NL + "        " + NL + "\t\t";
  protected final String TEXT_138 = NL + "        ";
  protected final String TEXT_139 = " out";
  protected final String TEXT_140 = " = (";
  protected final String TEXT_141 = ") ctx.get(";
  protected final String TEXT_142 = "Service.";
  protected final String TEXT_143 = "_KEY);" + NL + "        LOGGER.debug(\"out";
  protected final String TEXT_144 = " = \" + out";
  protected final String TEXT_145 = ");" + NL + "        request.setAttribute(";
  protected final String TEXT_146 = "_ENTITY, out";
  protected final String TEXT_147 = ");" + NL + "        session.setAttribute(";
  protected final String TEXT_148 = "_ID, ";
  protected final String TEXT_149 = "ID);" + NL + "        ctx.put(";
  protected final String TEXT_150 = "Service.";
  protected final String TEXT_151 = "_ID_KEY, ";
  protected final String TEXT_152 = "ID);" + NL + "\t\t";
  protected final String TEXT_153 = NL + NL + "        // add success messages" + NL + "        if (isNew) {" + NL + "            LOGGER.debug(\"";
  protected final String TEXT_154 = " added: \" + out";
  protected final String TEXT_155 = ");" + NL + "            messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                    new ActionMessage(MK_";
  protected final String TEXT_156 = "_ADDED));" + NL + "" + NL + "        } else {" + NL + "            LOGGER.debug(\"";
  protected final String TEXT_157 = " updated: \" + out";
  protected final String TEXT_158 = ");" + NL + "            messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                    new ActionMessage(MK_";
  protected final String TEXT_159 = "_UPDATED));" + NL + "        }" + NL + "        " + NL + "        updateFormBean(mapping, request, form);" + NL + "        " + NL + "        // save messages in session to survive a redirect" + NL + "        saveMessages(request.getSession(), messages);" + NL + "        // save messages in request" + NL + "        saveMessages(request, messages);        " + NL + "        return mapping.findForward(\"list\");" + NL + "    }" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public ActionForward delete(ActionMapping mapping, ActionForm actionForm," + NL + "                                HttpServletRequest request, HttpServletResponse response) throws Exception {" + NL + "        LOGGER.debug(\"Entering '";
  protected final String TEXT_160 = "Action.delete' method\");" + NL + "        HttpSession session = request.getSession();" + NL + "        ActionMessages messages = new ActionMessages();";
  protected final String TEXT_161 = NL + "        ";
  protected final String TEXT_162 = "Form form = (";
  protected final String TEXT_163 = "Form) actionForm;" + NL + "" + NL + "\t\t";
  protected final String TEXT_164 = NL + "        Long ";
  protected final String TEXT_165 = "ID = form.get";
  protected final String TEXT_166 = "ID();" + NL + "        if (";
  protected final String TEXT_167 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_168 = "ID <= 0){";
  protected final String TEXT_169 = NL + "            ";
  protected final String TEXT_170 = "ID = (Long) session.getAttribute(";
  protected final String TEXT_171 = "_ID);" + NL + "        }" + NL + "        if (";
  protected final String TEXT_172 = "ID == null " + NL + "        \t|| ";
  protected final String TEXT_173 = "ID <= 0){" + NL + "            messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                    new ActionMessage(MK_";
  protected final String TEXT_174 = "_NOT_FOUND));" + NL + "            // save messages in request" + NL + "            saveMessages(request, messages);" + NL + "            return mapping.findForward(\"master\");" + NL + "        }\t\t\t    " + NL + "\t\t";
  protected final String TEXT_175 = NL;
  protected final String TEXT_176 = NL + "        ";
  protected final String TEXT_177 = " session";
  protected final String TEXT_178 = " = (";
  protected final String TEXT_179 = ") session.getAttribute(";
  protected final String TEXT_180 = "_ENTITY);" + NL + "        LOGGER.debug(\"session";
  protected final String TEXT_181 = " = \" + session";
  protected final String TEXT_182 = ");" + NL + "" + NL + "        Context ctx = new ContextBase();" + NL + "        Long[] ids = form.getDeleteID();" + NL + "\t\t";
  protected final String TEXT_183 = NL + "        ctx.put(";
  protected final String TEXT_184 = "Service.";
  protected final String TEXT_185 = "_ID_KEY, ";
  protected final String TEXT_186 = "ID);" + NL + "\t\t";
  protected final String TEXT_187 = NL + "        ctx.put(";
  protected final String TEXT_188 = "Service.";
  protected final String TEXT_189 = "_ID_KEY, ids);" + NL + "        ctx.put(DispatchService.METHOD, DispatchService.DELETE_METHOD);";
  protected final String TEXT_190 = NL + "        ";
  protected final String TEXT_191 = "Service.execute(ctx);" + NL + "        " + NL + "        if (session";
  protected final String TEXT_192 = " != null) {" + NL + "            //if deleted item is in session, clean session" + NL + "            long sessionID = session";
  protected final String TEXT_193 = ".getID();" + NL + "            if (ArrayUtil.contains(ids, sessionID)) {" + NL + "                session.removeAttribute(";
  protected final String TEXT_194 = "_ENTITY);" + NL + "            }" + NL + "        }" + NL + "" + NL + "        messages.add(ActionMessages.GLOBAL_MESSAGE," + NL + "                new ActionMessage(MK_";
  protected final String TEXT_195 = "_DELETED));" + NL + "" + NL + "        List<";
  protected final String TEXT_196 = "> resultList = (List<";
  protected final String TEXT_197 = ">)  ctx.get(";
  protected final String TEXT_198 = "Service.";
  protected final String TEXT_199 = "_LIST_KEY);" + NL + "        session.setAttribute(";
  protected final String TEXT_200 = "_LIST, resultList);" + NL + "" + NL + "        saveMessages(request, messages);" + NL + "        return mapping.findForward(\"list\");" + NL + "    }" + NL + "" + NL + "\t/**" + NL + "\t * @generated " + NL + "\t */" + NL + "    public ActionForward search(ActionMapping mapping, ActionForm actionForm," + NL + "                                HttpServletRequest request, HttpServletResponse response) throws Exception {" + NL + "        LOGGER.debug(\"Entering '";
  protected final String TEXT_201 = "Action.search' method\");" + NL;
  protected final String TEXT_202 = NL + "        ";
  protected final String TEXT_203 = "Form form = (";
  protected final String TEXT_204 = "Form) actionForm;";
  protected final String TEXT_205 = NL + "        ";
  protected final String TEXT_206 = "Search searchBean = form.get";
  protected final String TEXT_207 = "Search();" + NL + "" + NL + "        Context ctx = new ContextBase();" + NL + "        ctx.put(";
  protected final String TEXT_208 = "Service.";
  protected final String TEXT_209 = "_SEARCH_KEY, searchBean);" + NL + "        // Exceptions are caught by ExceptionHandleAction" + NL + "        ctx.put(DispatchService.METHOD, DispatchService.SEARCH_METHOD);";
  protected final String TEXT_210 = NL + "        ";
  protected final String TEXT_211 = "Service.execute(ctx);" + NL + "" + NL + "        List<";
  protected final String TEXT_212 = "> ";
  protected final String TEXT_213 = "List = (List<";
  protected final String TEXT_214 = ">)ctx.get(";
  protected final String TEXT_215 = "Service.";
  protected final String TEXT_216 = "_LIST_KEY);" + NL + "        request.setAttribute(Constants.";
  protected final String TEXT_217 = "_LIST, ";
  protected final String TEXT_218 = "List);" + NL + "" + NL + "        // return a forward to the ";
  protected final String TEXT_219 = " list definition" + NL + "        return mapping.findForward(\"success\");" + NL + "    }" + NL + "}";
  protected final String TEXT_220 = NL;

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
    importManager.addImport(xPackage.getName() + ".model.*");
    importManager.addImport(xPackage.getName() + ".bo.*");
    importManager.addImport(xPackage.getName() + ".ui.web.form.*");
    stringBuffer.append(TEXT_4);
    importManager.addImport("chrome.xmdl.lib.bo.*");
    importManager.addImport("chrome.xmdl.lib.helper.*");
    importManager.addImport("chrome.xmdl.lib.ui.web.action.*");
    importManager.addImport("chrome.xmdl.lib.bo.DispatchService");
    importManager.addImport("org.apache.commons.chain.*");
    importManager.addImport("org.apache.commons.chain.impl.*");
    importManager.addImport("org.apache.commons.logging.*");
    importManager.addImport("org.apache.struts.action.*");
    importManager.addImport("javax.servlet.http.*");
    importManager.addImport("java.util.*");
    stringBuffer.append(TEXT_5);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_19);
    	XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   if (master != null) { 
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_30);
    }
		   } 
    stringBuffer.append(TEXT_31);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_44);
     if (master != null) { 
    stringBuffer.append(TEXT_45);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_48);
     } 
    stringBuffer.append(TEXT_49);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_64);
     if (master != null) { 
    stringBuffer.append(TEXT_65);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_79);
     } 
    stringBuffer.append(TEXT_80);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append((xClass.getName()));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_86);
     if (master != null) { 
    stringBuffer.append(TEXT_87);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_88);
     } else { 
    stringBuffer.append(TEXT_89);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_90);
     } 
    stringBuffer.append(TEXT_91);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_95);
     if (master != null) { 
    stringBuffer.append(TEXT_96);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_102);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_106);
     } 
    stringBuffer.append(TEXT_107);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_114);
     if (master != null) { 
    stringBuffer.append(TEXT_115);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_118);
     } 
    stringBuffer.append(TEXT_119);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append((xClass.getName()));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_137);
     if (master != null) { 
    stringBuffer.append(TEXT_138);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_148);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_152);
     } 
    stringBuffer.append(TEXT_153);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(TEXT_161);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_163);
     if (master != null) { 
    stringBuffer.append(TEXT_164);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(master.getName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_171);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_174);
     } 
    stringBuffer.append(TEXT_175);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_182);
     if (master != null) { 
    stringBuffer.append(TEXT_183);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(helper.capAllName(master.getName()));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(helper.uncapSafeName(master));
    stringBuffer.append(TEXT_186);
     } 
    stringBuffer.append(TEXT_187);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_189);
    stringBuffer.append(TEXT_190);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_195);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append((xClass.getName()));
    stringBuffer.append(TEXT_197);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(TEXT_202);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(TEXT_210);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_213);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(helper.capName(xClass.getName()));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(helper.capAllName(xClass.getName()));
    stringBuffer.append(TEXT_217);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_219);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_220);
    return stringBuffer.toString();
  }
}