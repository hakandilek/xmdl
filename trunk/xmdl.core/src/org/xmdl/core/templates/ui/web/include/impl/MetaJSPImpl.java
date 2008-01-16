package org.xmdl.core.templates.ui.web.include.impl;

public class MetaJSPImpl
{
  protected static String nl;
  public static synchronized MetaJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    MetaJSPImpl result = new MetaJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    <!-- HTTP 1.1 -->" + NL + "    <meta http-equiv=\"Cache-Control\" content=\"no-store\"/>" + NL + "    <!-- HTTP 1.0 -->" + NL + "    <meta http-equiv=\"Pragma\" content=\"no-cache\"/>" + NL + "    <!-- Prevents caching at the Proxy Server -->" + NL + "    <meta http-equiv=\"Expires\" content=\"0\"/>" + NL + "    " + NL + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-9\"/> " + NL + "    <c:set var=\"ctxPath\" value=\"${pageContext.request.contextPath}\" scope=\"request\"/>" + NL + "    <link rel=\"icon\" href=\"<c:url value=\"/images/favicon.ico\"/>\"/>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
