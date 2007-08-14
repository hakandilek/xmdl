package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class StrutsConfigXMLImpl
{
  protected static String nl;
  public static synchronized StrutsConfigXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    StrutsConfigXMLImpl result = new StrutsConfigXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + NL + "<!DOCTYPE struts-config PUBLIC" + NL + " \"-//Apache Software Foundation//DTD Struts Configuration 1.2//EN\"" + NL + " \"http://jakarta.apache.org/struts/dtds/struts-config_1_2.dtd\">" + NL + "" + NL + "<struts-config>" + NL + "" + NL + "    <!-- ========== Data Sources Definitions =================================== -->" + NL + "    <!--" + NL + "      Define your Struts data sources in a file called struts-data-sources.xml and place" + NL + "      it in your merge directory." + NL + "    -->" + NL + "" + NL + "    <!-- ========== Form Bean Definitions =================================== -->" + NL + "    <form-beans>";
  protected final String TEXT_2 = NL + "\t";
  protected final String TEXT_3 = NL + "        <form-bean" + NL + "            name=\"";
  protected final String TEXT_4 = "Form\"" + NL + "            type=\"";
  protected final String TEXT_5 = "\"" + NL + "            />" + NL + "\t";
  protected final String TEXT_6 = NL + "    </form-beans>" + NL + "" + NL + "    <!-- ========== Global Exceptions Definitions =================================== -->" + NL + "    <global-exceptions>" + NL + "        <exception type=\"java.lang.Exception\"" + NL + "            key=\"errors.general\"" + NL + "            handler=\"chrome.xmdl.lib.ui.web.action.ExceptionHandleAction\"/>" + NL + "    </global-exceptions>" + NL + "" + NL + "    <!-- ========== Global Forward Definitions =================================== -->" + NL + "    <global-forwards>" + NL + "        <forward name=\"mainMenu\" path=\"/mainMenu.do\" redirect=\"true\"/>" + NL + "" + NL + "        <!-- Logout by forward to a JSP, I do this b/c if I forward to an" + NL + "             an action, and the users session is expired - they'll be prompted" + NL + "             to login - just to logout!  Seems silly to me." + NL + "        -->" + NL + "        <forward name=\"home\" path=\"/include/home.jsp\"/>" + NL + "        " + NL + "        <forward name=\"logout\" path=\"/logout.jsp\"/>        " + NL + "        ";
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = NL + "        <forward name=\"edit";
  protected final String TEXT_9 = "\" path=\"/edit";
  protected final String TEXT_10 = ".do\"/>" + NL + "\t";
  protected final String TEXT_11 = NL + NL + NL + "    </global-forwards>" + NL + "" + NL + "    <!-- ========== Action Mapping Definitions =================================== -->" + NL + "    <action-mappings>";
  protected final String TEXT_12 = NL + "\t";
  protected final String TEXT_13 = NL + "        <action" + NL + "            path=\"/search";
  protected final String TEXT_14 = "\"" + NL + "            type=\"chrome.xmdl.lib.ui.web.action.DelegatingAction\"" + NL + "            name=\"";
  protected final String TEXT_15 = "Form\"" + NL + "            scope=\"request\"" + NL + "            input=\"home\"" + NL + "            parameter=\"method\"" + NL + "            unknown=\"false\"" + NL + "            validate=\"false\"" + NL + "            >" + NL + "            <forward" + NL + "                name=\"success\"" + NL + "                path=\"/";
  protected final String TEXT_16 = "/search.jsp\"" + NL + "                redirect=\"false\"" + NL + "                />" + NL + "        </action>" + NL + "        <action" + NL + "            path=\"/edit";
  protected final String TEXT_17 = "\"" + NL + "            type=\"chrome.xmdl.lib.ui.web.action.DelegatingAction\"" + NL + "            name=\"";
  protected final String TEXT_18 = "Form\"" + NL + "            scope=\"request\"" + NL + "            input=\"home\"" + NL + "            parameter=\"method\"" + NL + "            unknown=\"false\"" + NL + "            validate=\"false\"" + NL + "            >" + NL + "            <forward" + NL + "                name=\"success\"" + NL + "                path=\"/";
  protected final String TEXT_19 = "/edit.jsp\"" + NL + "                redirect=\"false\"" + NL + "                />" + NL + "            <forward" + NL + "                name=\"list\"" + NL + "                path=\"/edit";
  protected final String TEXT_20 = ".do\"" + NL + "                redirect=\"true\"" + NL + "                />" + NL + "\t\t";
  protected final String TEXT_21 = NL + "            <forward" + NL + "                name=\"master\"" + NL + "                path=\"/edit";
  protected final String TEXT_22 = ".do\"" + NL + "                redirect=\"false\"" + NL + "                />" + NL + "\t\t\t   ";
  protected final String TEXT_23 = NL + "                " + NL + "        </action>" + NL + "\t";
  protected final String TEXT_24 = NL + NL + "        <!-- Forwards to the mainMenu tile definition -->" + NL + "        <action path=\"/mainMenu\" type=\"org.apache.struts.actions.ForwardAction\"" + NL + "            parameter=\"/WEB-INF/common/mainMenu.jsp\"/>" + NL + "" + NL + "        <!-- Action to flush cache -->" + NL + "        <action path=\"/flush\" type=\"org.apache.struts.actions.ForwardAction\"" + NL + "            parameter=\"/WEB-INF/common/flushCache.jsp\" roles=\"admin\"/>" + NL + "" + NL + "    </action-mappings>" + NL + "" + NL + "    <controller nocache=\"true\" inputForward=\"true\" maxFileSize=\"2M\"/>" + NL;
  protected final String TEXT_25 = NL + "    <message-resources parameter=\"";
  protected final String TEXT_26 = ".ApplicationResources\"/>";
  protected final String TEXT_27 = NL + "<!--" + NL + "    <message-resources parameter=\"CommonResources\" key=\"common\" id=\"common\" />" + NL + "-->" + NL + "" + NL + "    <!-- ========== Validator plugin ===================  -->" + NL + "    <plug-in className=\"org.apache.struts.validator.ValidatorPlugIn\">" + NL + "        <set-property property=\"pathnames\"" + NL + "            value=\"/WEB-INF/validator-rules.xml," + NL + "                   /WEB-INF/validator-rules-custom.xml," + NL + "                   /WEB-INF/validation.xml\"/>" + NL + "    </plug-in>" + NL + "" + NL + "" + NL + "</struts-config>";
  protected final String TEXT_28 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

    stringBuffer.append(TEXT_1);
    for (Iterator itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_2);
    for (Iterator it = xPackage.getClasses().iterator(); it.hasNext();) {
			XClass xClass = (XClass) it.next();
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getObjectFormName(xClass));
    stringBuffer.append(TEXT_5);
    }
    }
    stringBuffer.append(TEXT_6);
    for (Iterator itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_7);
    for (Iterator it = xPackage.getClasses().iterator(); it.hasNext();) {
			XClass xClass = (XClass) it.next();
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    }
    }
    stringBuffer.append(TEXT_11);
    for (Iterator itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_12);
    for (Iterator it = xPackage.getClasses().iterator(); it.hasNext();) {
			XClass xClass = (XClass) it.next();
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_20);
    	XClass master = null;
			if (MasterChildHelper.INST.isChild(xClass)) { 
			   master = MasterChildHelper.INST.getMaster(xClass);
			   if (master != null) { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getCapName(master));
    stringBuffer.append(TEXT_22);
    }
		   } 
    stringBuffer.append(TEXT_23);
    }
    }
    stringBuffer.append(TEXT_24);
    for (Iterator itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_25);
    stringBuffer.append(xPackage.getName());
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
