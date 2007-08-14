package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class DecoratorsXMLImpl
{
  protected static String nl;
  public static synchronized DecoratorsXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DecoratorsXMLImpl result = new DecoratorsXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<decorators defaultdir=\"/decorators\">" + NL + "    <excludes>" + NL + "        <pattern>/include/*</pattern>" + NL + "        <pattern>/common/*</pattern>" + NL + "        <pattern>/config/*</pattern>" + NL + "        <pattern>/decorators/*</pattern>" + NL + "        <pattern>/images/*</pattern>" + NL + "    </excludes> " + NL + "    <decorator name=\"default\" page=\"application01.jsp\">" + NL + "        <pattern>/*</pattern>" + NL + "    </decorator>" + NL + "</decorators>";
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
