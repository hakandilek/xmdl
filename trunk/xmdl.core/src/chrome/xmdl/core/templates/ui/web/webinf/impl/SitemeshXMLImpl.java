package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class SitemeshXMLImpl
{
  protected static String nl;
  public static synchronized SitemeshXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SitemeshXMLImpl result = new SitemeshXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<sitemesh>" + NL + "    <property name=\"decorators-file\" value=\"/WEB-INF/decorators.xml\"/>" + NL + "    <excludes file=\"${decorators-file}\"/> " + NL + "    <page-parsers>" + NL + "        <parser default=\"true\" class=\"com.opensymphony.module.sitemesh.parser.HTMLPageParser\"/>" + NL + "        <parser content-type=\"text/html\" class=\"com.opensymphony.module.sitemesh.parser.HTMLPageParser\"/>" + NL + "        <parser content-type=\"text/html;charset=ISO-8859-9\" class=\"com.opensymphony.module.sitemesh.parser.HTMLPageParser\"/>" + NL + "    </page-parsers>" + NL + "" + NL + "    <decorator-mappers>" + NL + "        <mapper class=\"com.opensymphony.module.sitemesh.mapper.ConfigDecoratorMapper\">" + NL + "            <param name=\"config\" value=\"${decorators-file}\"/> " + NL + "        </mapper>" + NL + "    </decorator-mappers>" + NL + "</sitemesh>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
