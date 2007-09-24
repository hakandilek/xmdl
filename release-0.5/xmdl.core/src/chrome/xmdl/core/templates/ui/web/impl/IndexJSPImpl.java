package chrome.xmdl.core.templates.ui.web.impl;

import java.util.*;

public class IndexJSPImpl
{
  protected static String nl;
  public static synchronized IndexJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    IndexJSPImpl result = new IndexJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "<logic:forward name=\"home\"/>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
