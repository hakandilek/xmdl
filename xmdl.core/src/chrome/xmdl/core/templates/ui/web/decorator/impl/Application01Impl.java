package chrome.xmdl.core.templates.ui.web.decorator.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class Application01Impl
{
  protected static String nl;
  public static synchronized Application01Impl create(String lineSeparator)
  {
    nl = lineSeparator;
    Application01Impl result = new Application01Impl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"" + NL + "    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" + NL + "" + NL + "<%--@generated $Id$ --%>" + NL + "<%-- Include common set of tag library declarations for each layout --%>" + NL + "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "" + NL + "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">" + NL + "    <head>" + NL + "        <%-- Include common set of meta tags for each layout --%>" + NL + "        <%@ include file=\"/include/meta.jsp\" %>" + NL + "        <title><fmt:message key=\"application.prefix\"/>&nbsp;<decorator:title/></title>" + NL + "" + NL + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"<c:url value='/styles/screen.css'/>\"></link>" + NL + "" + NL + "        <script type=\"text/javascript\" src=\"<c:url value='/scripts/prototype.js'/>\"></script>" + NL + "        <script type=\"text/javascript\" src=\"<c:url value='/scripts/scriptaculous.js'/>\"></script>" + NL + "        <script type=\"text/javascript\" src=\"<c:url value='/scripts/helptip.js'/>\"></script>" + NL + "        <script type=\"text/javascript\" src=\"<c:url value='/scripts/global.js'/>\"></script>" + NL + "" + NL + "        <layout:skin includeScript=\"true\"/>" + NL + "        <decorator:head/>" + NL + "    </head>" + NL + "" + NL + "    <body<decorator:getProperty property=\"body.id\" writeEntireProperty=\"true\"/>>" + NL + "" + NL + "        <div id=\"screen\">" + NL + "" + NL + "            <div id=\"header\">" + NL + "                <c:import url=\"/include/header.jsp\"/>" + NL + "            </div>" + NL + "" + NL + "            <div id=\"content\">" + NL + "                <h1><decorator:getProperty property=\"page.heading\"/></h1>" + NL + "                <%@ include file=\"/common/messages.jsp\" %>" + NL + "                <decorator:body/>" + NL + "            </div>" + NL + "" + NL + "            <div id=\"footer\">" + NL + "                <c:import url=\"/include/footer.jsp\"/>" + NL + "            </div>" + NL + "        </div>" + NL + "    </body>" + NL + "</html>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
