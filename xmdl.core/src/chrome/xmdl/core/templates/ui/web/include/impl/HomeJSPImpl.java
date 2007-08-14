package chrome.xmdl.core.templates.ui.web.include.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class HomeJSPImpl
{
  protected static String nl;
  public static synchronized HomeJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    HomeJSPImpl result = new HomeJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Welcome to ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getName());
    return stringBuffer.toString();
  }
}
