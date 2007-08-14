package chrome.xmdl.core.templates.ui.web.include.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class TaglibsJSPImpl
{
  protected static String nl;
  public static synchronized TaglibsJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    TaglibsJSPImpl result = new TaglibsJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ page language=\"java\" errorPage=\"/common/error.jsp\" pageEncoding=\"ISO-8859-9\" contentType=\"text/html;charset=ISO-8859-9\" %>" + NL + "" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-bean\" prefix=\"bean\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-bean-el\" prefix=\"bean-el\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-html\" prefix=\"html\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-html-el\" prefix=\"html-el\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-logic\" prefix=\"logic\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-logic-el\" prefix=\"logic-el\" %>" + NL + "<%@ taglib uri=\"http://struts.apache.org/tags-nested\" prefix=\"nested\" %>" + NL + "<%@ taglib uri=\"http://struts.application-servers.com/layout\" prefix=\"layout\" %>" + NL + "<%@ taglib uri=\"http://displaytag.sf.net/el\" prefix=\"display\" %>" + NL + "<%@ taglib uri=\"http://struts-menu.sf.net/tag-el\" prefix=\"menu\" %>" + NL + "<%@ taglib uri=\"http://java.sun.com/jstl/core\" prefix=\"c\" %>" + NL + "<%@ taglib uri=\"http://java.sun.com/jstl/fmt\" prefix=\"fmt\" %>" + NL + "<%@ taglib uri=\"http://java.sun.com/jstl/sql\" prefix=\"sql\" %>" + NL + "<%--<%@ taglib uri=\"http://www.opensymphony.com/oscache\" prefix=\"cache\" %>--%>" + NL + "<%@ taglib uri=\"http://www.opensymphony.com/sitemesh/decorator\" prefix=\"decorator\"%>" + NL + "<%@ taglib uri=\"http://www.opensymphony.com/sitemesh/page\" prefix=\"page\"%>" + NL + "<%@ taglib uri=\"/WEB-INF/";
  protected final String TEXT_2 = "-custom.tld\" prefix=\"";
  protected final String TEXT_3 = "\" %>" + NL + "" + NL + "<%-- Set all pages that include this page (particularly tiles) to use XHTML --%>" + NL + "<html:xhtml />";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(project.getName());
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
