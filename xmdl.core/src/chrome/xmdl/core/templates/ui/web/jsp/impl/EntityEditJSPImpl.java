package chrome.xmdl.core.templates.ui.web.jsp.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class EntityEditJSPImpl
{
  protected static String nl;
  public static synchronized EntityEditJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityEditJSPImpl result = new EntityEditJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "" + NL + "<title><fmt:message key=\"";
  protected final String TEXT_2 = ".edit.title\"/></title>" + NL + "<fmt:message key=\"";
  protected final String TEXT_3 = ".edit.heading\"/>" + NL + "" + NL + "<layout:form align=\"left\" action=\"edit";
  protected final String TEXT_4 = "\" method=\"post\"  " + NL + "    styleClass=\"";
  protected final String TEXT_5 = "Form\" ";
  protected final String TEXT_6 = " " + NL + "    onsubmit=\"return validate";
  protected final String TEXT_7 = "Form(this)\">" + NL + "" + NL + "    <html:hidden property=\"";
  protected final String TEXT_8 = ".ID\"/>" + NL + "" + NL + "\t";
  protected final String TEXT_9 = NL + "\t";
  protected final String TEXT_10 = NL + "\t\t";
  protected final String TEXT_11 = NL + "\t";
  protected final String TEXT_12 = " " + NL + "\t";
  protected final String TEXT_13 = NL + NL + "    <tr>" + NL + "        <td></td>" + NL + "        <td class=\"buttonBar\">" + NL + "            <html:submit styleClass=\"button\" property=\"method.save\" onclick=\"bCancel=false\">" + NL + "                <bean:message key=\"button.save\"/>" + NL + "            </html:submit>" + NL + "" + NL + "            <html:cancel styleClass=\"button\" onclick=\"bCancel=true\">" + NL + "                <bean:message key=\"button.cancel\"/>" + NL + "            </html:cancel>" + NL + "        </td>" + NL + "    </tr>" + NL + "</layout:form>" + NL + "" + NL + "<hr />" + NL + "" + NL + "<bean:struts id=\"editURL\" forward=\"edit";
  protected final String TEXT_14 = "\"/>" + NL;
  protected final String TEXT_15 = NL + "<bean:struts id=\"";
  protected final String TEXT_16 = "EditURL\" forward=\"edit";
  protected final String TEXT_17 = "\"/>";
  protected final String TEXT_18 = NL + NL + "<html:form action=\"edit";
  protected final String TEXT_19 = "\" method=\"post\" styleId=\"";
  protected final String TEXT_20 = "Form\" >" + NL + "<display:table name=\"${";
  protected final String TEXT_21 = "List}\" cellspacing=\"0\" cellpadding=\"0\"" + NL + "    requestURI=\"\" defaultsort=\"1\" export=\"true\" id=\"";
  protected final String TEXT_22 = "s\"" + NL + "    pagesize=\"25\" styleClass=\"list ";
  protected final String TEXT_23 = "List\">" + NL + "" + NL + "    <%-- Table columns --%>" + NL + "    <display:column property=\"ID\" sort=\"true\"" + NL + "    \theaderClass=\"sortable\" width=\"10%\"" + NL + "        url=\"${editURL.path}?from=list\"" + NL + "        paramId=\"";
  protected final String TEXT_24 = ".ID\" paramProperty=\"ID\"" + NL + "        titleKey=\"";
  protected final String TEXT_25 = ".list.ID\"/>" + NL + "        " + NL + "\t";
  protected final String TEXT_26 = NL + "    <display:column property=\"";
  protected final String TEXT_27 = "\" " + NL + "    \t";
  protected final String TEXT_28 = " sort=\"true\"  headerClass=\"sortable\" ";
  protected final String TEXT_29 = " " + NL + "    \twidth=\"20%\"" + NL + "    \tautolink=\"true\"" + NL + "        titleKey=\"";
  protected final String TEXT_30 = ".list.";
  protected final String TEXT_31 = "\" " + NL + "        />\t\t" + NL + "\t";
  protected final String TEXT_32 = " " + NL + "\t";
  protected final String TEXT_33 = NL + "        " + NL + "    <display:column width=\"6%\"" + NL + "        titleKey=\"";
  protected final String TEXT_34 = ".list.DELETE\">" + NL + "        <html-el:multibox  property=\"deleteID\" value=\"${";
  protected final String TEXT_35 = "s.ID}\"    />" + NL + "    </display:column>" + NL + "" + NL + "    <display:column property=\"ID\" sort=\"true\"" + NL + "    \theaderClass=\"sortable\" width=\"10%\"" + NL + "        url=\"${editURL.path}?copy=true\"" + NL + "        paramId=\"";
  protected final String TEXT_36 = ".ID\" paramProperty=\"ID\"" + NL + "        titleKey=\"";
  protected final String TEXT_37 = ".list.COPY\"/>" + NL + "" + NL + "\t";
  protected final String TEXT_38 = NL + "    <display:column property=\"ID\" sort=\"true\"" + NL + "    \theaderClass=\"sortable\" width=\"10%\"" + NL + "        url=\"${";
  protected final String TEXT_39 = "EditURL.path}\"" + NL + "        paramId=\"";
  protected final String TEXT_40 = "ID\" paramProperty=\"ID\"" + NL + "        titleKey=\"";
  protected final String TEXT_41 = ".list.";
  protected final String TEXT_42 = "\"/>" + NL + "\t";
  protected final String TEXT_43 = NL + NL + "    <display:setProperty name=\"paging.banner.item_name\" value=\"";
  protected final String TEXT_44 = "\"/>" + NL + "    <display:setProperty name=\"paging.banner.items_name\" value=\"";
  protected final String TEXT_45 = "s\"/>" + NL + "" + NL + "    <display:setProperty name=\"export.excel.filename\" value=\"";
  protected final String TEXT_46 = "List.xls\"/>" + NL + "    <display:setProperty name=\"export.csv.filename\" value=\"";
  protected final String TEXT_47 = "List.csv\"/>" + NL + "    <display:setProperty name=\"export.pdf.filename\" value=\"";
  protected final String TEXT_48 = "List.pdf\"/>" + NL + "    <display:footer>" + NL + "        <tr>" + NL + "            <td colspan=\"5\">&nbsp;</td>" + NL + "            <td>" + NL + "                <html:submit styleClass=\"button\" property=\"method.delete\" onclick=\"bCancel=false\">" + NL + "                    <bean:message key=\"button.delete\"/>" + NL + "                </html:submit>" + NL + "            </td>" + NL + "        </tr>" + NL + "    </display:footer>" + NL + "</display:table>" + NL + "</html:form>" + NL + "" + NL + "<html:javascript formName=\"";
  protected final String TEXT_49 = "Form\" cdata=\"false\"" + NL + "    dynamicJavascript=\"true\" staticJavascript=\"false\"/>" + NL + "<script type=\"text/javascript\"" + NL + "    src=\"<html:rewrite page=\"/scripts/validator.jsp\"/>\"></script>" + NL + " ";
  protected final String TEXT_50 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XClass xClass = (XClass) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	XAttribute firstAttribute = null;
	List attributes = xClass.getAttributes();
	if (attributes != null && attributes.size() >0 ){
		firstAttribute = (XAttribute) attributes.get(0);
	}

    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(firstAttribute != null ? "focus=\""+ helper.uncapSafeName(xClass) + "." + helper.uncapSafeName(firstAttribute)  +"\"" : "" );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_8);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	    XAttribute attribute = (XAttribute) i.next();
    stringBuffer.append(TEXT_9);
      if (!attribute.isReference()) {  
		Template t = UIHelper.getEditFormFieldTemplate(attribute);
		
    stringBuffer.append(TEXT_10);
    stringBuffer.append(t.generate(attribute));
    stringBuffer.append(TEXT_11);
      } 
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
     if (MasterChildHelper.INST.isMaster(xClass)) {
	  List children = MasterChildHelper.INST.getChildren(xClass);		
	  for (Iterator it = children.iterator(); it.hasNext();) {
		  XClass child = (XClass) it.next();

    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapSafeName(child));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(child.getName());
    stringBuffer.append(TEXT_17);
        } 
  }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_25);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	    XAttribute attribute = (XAttribute) i.next();
	    XType t = attribute.getType();
	    boolean comp = t.isComparable();
	    if (!attribute.isReference()) { 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_27);
     if (comp) { 
    stringBuffer.append(TEXT_28);
     } 
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_31);
      } 
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_37);
     if (MasterChildHelper.INST.isMaster(xClass)) {
		  List children = MasterChildHelper.INST.getChildren(xClass);		
		  for (Iterator it = children.iterator(); it.hasNext();) {
			  XClass child = (XClass) it.next();
	
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.uncapSafeName(child));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(child.getName());
    stringBuffer.append(TEXT_42);
        } 
	  }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(TEXT_50);
    return stringBuffer.toString();
  }
}
