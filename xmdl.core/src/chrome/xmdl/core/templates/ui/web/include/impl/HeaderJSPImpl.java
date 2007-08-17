package chrome.xmdl.core.templates.ui.web.include.impl;

public class HeaderJSPImpl
{
  protected static String nl;
  public static synchronized HeaderJSPImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    HeaderJSPImpl result = new HeaderJSPImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<%@ include file=\"/include/taglibs.jsp\"%>" + NL + "            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >" + NL + "" + NL + "                <tr>" + NL + "                    <td width=\"144\"  height=\"90\" bgcolor=\"#336699\" rowspan=\"2\"><img src=\"/include/images/topleft/web1.jpg\"/></td>" + NL + "                    <td width=\"100%\" height=\"18\" bgcolor=\"#336699\" >&nbsp;</td>" + NL + "                    <td width=\"130\"  height=\"18\" bgcolor=\"#336699\" align=\"right\" ><font size=\"2\"><img src=\"/include/siemensLogo/336699.gif\"/></font></td>" + NL + "                </tr>" + NL + "" + NL + "                <tr>" + NL + "                    <td height=\"72\" colspan=\"3\" bgColor=\"#6699CC\" align=\"left\" valign=\"top\" >" + NL + "                        <div id=\"menu\">" + NL + "                            <jsp:include page=\"/include/menu.jsp\" flush=\"true\"/>" + NL + "                        </div>" + NL + "                    </td>" + NL + "                </tr>" + NL + "            </table>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
