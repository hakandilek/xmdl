package org.xmdl.ida.templates.core.test.res;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class SampleDataXMLImpl
{
  protected static String nl;
  public static synchronized SampleDataXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SampleDataXMLImpl result = new SampleDataXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<dataset>";
  protected final String TEXT_2 = NL + "    <!--";
  protected final String TEXT_3 = "-START-->" + NL + "    <table name=\"TODO:TABLE name_\">" + NL + "        <column>id</column>" + NL + "        <!--" + NL + "        <column>name</column>" + NL + "        <column>price</column>" + NL + "        <column>productType</column>" + NL + "        -->" + NL + "        <!--" + NL + "\t    <row>" + NL + "\t        <value description=\"id\">1</value>" + NL + "\t        <value description=\"name\">FjKvDlNpDw</value>" + NL + "\t        <value description=\"price\">10.5</value>" + NL + "\t        <value description=\"productType\">1</value>" + NL + "\t    </row>" + NL + "\t    <row>" + NL + "\t        <value description=\"id\">2</value>" + NL + "\t        <value description=\"name\">MxLwBxUfKd</value>" + NL + "\t        <value description=\"price\">20.5</value>" + NL + "\t        <value description=\"productType\">2</value>" + NL + "\t    </row>" + NL + "\t    <row>" + NL + "\t        <value description=\"id\">3</value>" + NL + "\t        <value description=\"name\">WuLfBwKnWa</value>" + NL + "\t        <value description=\"price\">30.6</value>" + NL + "\t        <value description=\"productType\">3</value>" + NL + "\t    </row>" + NL + "        -->" + NL + "    </table>" + NL + "    <!--";
  protected final String TEXT_4 = "-END-->" + NL + "\t\t\t";
  protected final String TEXT_5 = NL + NL + "    <!--Product-START-->" + NL + "    <table name=\"t_product\">" + NL + "        <column>id</column>" + NL + "        <column>name</column>" + NL + "        <column>price</column>" + NL + "        <column>productType</column>" + NL + "    <row>" + NL + "        <value description=\"id\">1</value>" + NL + "        <value description=\"name\">FjKvDlNpDw</value>" + NL + "        <value description=\"price\">10.5</value>" + NL + "        <value description=\"productType\">1</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">2</value>" + NL + "        <value description=\"name\">MxLwBxUfKd</value>" + NL + "        <value description=\"price\">20.5</value>" + NL + "        <value description=\"productType\">2</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">3</value>" + NL + "        <value description=\"name\">WuLfBwKnWa</value>" + NL + "        <value description=\"price\">30.6</value>" + NL + "        <value description=\"productType\">3</value>" + NL + "    </row>" + NL + "    </table>" + NL + "    <!--Product-END-->" + NL + "    <!--Order-START-->" + NL + "    <table name=\"t_order\">" + NL + "        <column>id</column>" + NL + "        <column>name</column>" + NL + "        <column>pricetotals</column>" + NL + "        <column>createdate</column>" + NL + "    <row>" + NL + "        <value description=\"id\">1</value>" + NL + "        <value description=\"name\">BqDaDtJzCf</value>" + NL + "        <value description=\"pricetotals\">100.3</value>" + NL + "        <value description=\"createdate\">2007-09-20</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">2</value>" + NL + "        <value description=\"name\">VwTdCpEfKe</value>" + NL + "        <value description=\"pricetotals\">200.3</value>" + NL + "        <value description=\"createdate\">2007-09-20</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">3</value>" + NL + "        <value description=\"name\">GxPxUrDjLf</value>" + NL + "        <value description=\"pricetotals\">300.4</value>" + NL + "        <value description=\"createdate\">2007-09-20</value>" + NL + "    </row>" + NL + "    </table>" + NL + "    <!--Order-END-->" + NL + "    <!--OrderElement-START-->" + NL + "    <table name=\"t_orderElement\">" + NL + "        <column>id</column>" + NL + "        <column>quantity</column>" + NL + "        <column>orderId</column>    " + NL + "        <column>productId</column>    " + NL + "    <row>" + NL + "        <value description=\"id\">1</value>" + NL + "        <value description=\"quantity\">6024683510166235136</value>" + NL + "        <value description=\"orderId\">1</value>" + NL + "        <value description=\"productId\">1</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">2</value>" + NL + "        <value description=\"quantity\">10</value>" + NL + "        <value description=\"orderId\">2</value>" + NL + "        <value description=\"productId\">2</value>" + NL + "    </row>" + NL + "    <row>" + NL + "        <value description=\"id\">3</value>" + NL + "        <value description=\"quantity\">20</value>" + NL + "        <value description=\"orderId\">3</value>" + NL + "        <value description=\"productId\">3</value>" + NL + "    </row>" + NL + "    </table>" + NL + "    <!--OrderElement-END-->" + NL + "</dataset>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject prj = (XProject) argument;
    List<XPackage> packages = prj.getPackages();
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    prj.getName();
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
	XPackage pack = iter.next();
	List<XClass> classes = pack.getClasses();
	for (Iterator<XClass> iter2 = classes.iterator(); iter.hasNext();) {
		XClass xClass = iter2.next();
		if (xClass != null){
			
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedName(xClass));
    stringBuffer.append(TEXT_4);
    
		}
	}
} 

    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
