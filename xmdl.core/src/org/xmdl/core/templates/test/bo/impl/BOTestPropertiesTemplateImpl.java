package org.xmdl.core.templates.test.bo.impl;

import java.util.*;
import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;

public class BOTestPropertiesTemplateImpl
{
  protected static String nl;
  public static synchronized BOTestPropertiesTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    BOTestPropertiesTemplateImpl result = new BOTestPropertiesTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "        ";
  protected final String TEXT_2 = NL + "# Test data for ";
  protected final String TEXT_3 = "ServiceTest    ";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = " = ";
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
      XClass xClass = (XClass) argument;
    ClassHelper helper = XMDLEntityHelper.INSTANCE;
    TestHelper testHelper = TestHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_3);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(testHelper.randomValuePlain(attribute));
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
