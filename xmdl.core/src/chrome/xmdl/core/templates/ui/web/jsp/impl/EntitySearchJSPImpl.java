package chrome.xmdl.core.templates.ui.web.jsp.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.xgen.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class EntitySearchJSPImpl
{
  protected static String nl;
  public static synchronized EntitySearchJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntitySearchJSPImpl result = new EntitySearchJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "" + NL + "<title><fmt:message key=\"";
  protected final String TEXT_2 = ".list.title\"/></title>" + NL + "" + NL + "<fmt:message key=\"";
  protected final String TEXT_3 = ".list.heading\"/>" + NL + "" + NL + "<%-- For linking to edit screen --%>" + NL + "<bean:struts id=\"editURL\" forward=\"edit";
  protected final String TEXT_4 = "\"/>" + NL + "" + NL + "" + NL + "<layout:form align=\"left\" action=\"search";
  protected final String TEXT_5 = "\" method=\"post\"" + NL + "    styleClass=\"";
  protected final String TEXT_6 = "Form\" ";
  protected final String TEXT_7 = " " + NL + "    onsubmit=\"return validate";
  protected final String TEXT_8 = "Form(this)\">" + NL + "    " + NL + "\t";
  protected final String TEXT_9 = NL + "\t";
  protected final String TEXT_10 = NL + "\t\t";
  protected final String TEXT_11 = NL + "\t";
  protected final String TEXT_12 = " " + NL + "\t";
  protected final String TEXT_13 = "    " + NL + "    <tr>" + NL + "        <td></td>" + NL + "        <td class=\"buttonBar\">" + NL + "            <html:submit styleClass=\"button\" property=\"method.search\" onclick=\"bCancel=false\">" + NL + "                <bean:message key=\"button.search\"/>" + NL + "            </html:submit>" + NL + "" + NL + "            <html:cancel styleClass=\"button\" onclick=\"bCancel=true\">" + NL + "                <bean:message key=\"button.cancel\"/>" + NL + "            </html:cancel>" + NL + "        </td>" + NL + "    </tr>" + NL + "</layout:form>" + NL + "" + NL + "<hr />" + NL + "" + NL + "<display:table name=\"${";
  protected final String TEXT_14 = "List}\" cellspacing=\"0\" cellpadding=\"0\"" + NL + "    requestURI=\"\" defaultsort=\"1\" export=\"true\" id=\"";
  protected final String TEXT_15 = "s\"" + NL + "    pagesize=\"25\" styleClass=\"list ";
  protected final String TEXT_16 = "List\">" + NL + "  " + NL + "    <%-- Table columns --%>" + NL + "    <display:column property=\"ID\" sort=\"true\"" + NL + "    \theaderClass=\"sortable\" width=\"17%\"" + NL + "        url=\"${editURL.path}?from=list\" " + NL + "        paramId=\"ID\" paramProperty=\"ID\"" + NL + "        titleKey=\"";
  protected final String TEXT_17 = ".list.ID\"/>" + NL + "        " + NL + "\t";
  protected final String TEXT_18 = NL + "    <display:column property=\"";
  protected final String TEXT_19 = "\" " + NL + "    \t";
  protected final String TEXT_20 = " sort=\"true\"  headerClass=\"sortable\" ";
  protected final String TEXT_21 = " " + NL + "    \twidth=\"20%\"" + NL + "    \tautolink=\"true\"" + NL + "        titleKey=\"";
  protected final String TEXT_22 = ".list.";
  protected final String TEXT_23 = "\" " + NL + "        />\t\t" + NL + "\t";
  protected final String TEXT_24 = " " + NL + "\t";
  protected final String TEXT_25 = NL + "        " + NL + "    <display:setProperty name=\"paging.banner.item_name\" value=\"";
  protected final String TEXT_26 = "\"/>" + NL + "    <display:setProperty name=\"paging.banner.items_name\" value=\"";
  protected final String TEXT_27 = "s\"/>" + NL + "" + NL + "    <display:setProperty name=\"export.excel.filename\" value=\"";
  protected final String TEXT_28 = "List.xls\"/>" + NL + "    <display:setProperty name=\"export.csv.filename\" value=\"";
  protected final String TEXT_29 = "List.csv\"/>" + NL + "    <display:setProperty name=\"export.pdf.filename\" value=\"";
  protected final String TEXT_30 = "List.pdf\"/>" + NL + "</display:table>" + NL + "" + NL + "<%--<c:out value=\"${buttons}\" escapeXml=\"false\" />--%>" + NL + "            " + NL + "<script type=\"text/javascript\">" + NL + "<!--" + NL + "highlightTableRows(\"";
  protected final String TEXT_31 = "s\");" + NL + "//-->" + NL + "</script>";
  protected final String TEXT_32 = NL;

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
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(firstAttribute != null ? "focus=\""+ helper.uncapSafeName(xClass) + "." + helper.uncapSafeName(firstAttribute)  +"\"" : "" );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	    XAttribute attribute = (XAttribute) i.next();
    stringBuffer.append(TEXT_9);
      if (!attribute.isReference()) {  
		Template t = UIHelper.getSearchFormFieldTemplate(attribute);
		
    stringBuffer.append(TEXT_10);
    stringBuffer.append(t.generate(attribute));
    stringBuffer.append(TEXT_11);
      } 
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_17);
    for (Iterator i= xClass.getAttributes().iterator(); i.hasNext();) {
	    XAttribute attribute = (XAttribute) i.next();
	    XType t = attribute.getType();
	    boolean comp = t.isComparable();
	    if (!attribute.isReference()) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_19);
     if (comp) { 
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_23);
      } 
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(TEXT_32);
    return stringBuffer.toString();
  }
}
