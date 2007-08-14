package chrome.xmdl.core.templates.ui.web.include.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class FooterJSPImpl
{
  protected static String nl;
  public static synchronized FooterJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    FooterJSPImpl result = new FooterJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "&copy; ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(new GregorianCalendar().get(Calendar.YEAR));
    return stringBuffer.toString();
  }
}
