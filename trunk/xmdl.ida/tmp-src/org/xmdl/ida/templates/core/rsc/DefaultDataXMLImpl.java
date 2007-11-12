package org.xmdl.ida.templates.core.rsc;

public class DefaultDataXMLImpl
{
  protected static String nl;
  public static synchronized DefaultDataXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DefaultDataXMLImpl result = new DefaultDataXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<dataset>" + NL + "</dataset>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
