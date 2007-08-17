package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class MenuConfigXMLImpl
{
  protected static String nl;
  public static synchronized MenuConfigXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    MenuConfigXMLImpl result = new MenuConfigXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<MenuConfig>" + NL + "    <Displayers>" + NL + "        <Displayer name=\"DropDown\" type=\"net.sf.navigator.displayer.DropDownMenuDisplayer\"/>" + NL + "        <Displayer name=\"Simple\" type=\"net.sf.navigator.displayer.SimpleMenuDisplayer\"/>" + NL + "        <Displayer name=\"CoolMenu\" type=\"net.sf.navigator.displayer.CoolMenuDisplayer\"/>" + NL + "        <Displayer name=\"CoolMenu4\" type=\"net.sf.navigator.displayer.CoolMenuDisplayer4\"/>" + NL + "        <Displayer name=\"MenuForm\" type=\"net.sf.navigator.example.PermissionsFormMenuDisplayer\"/>" + NL + "        <Displayer name=\"ListMenu\" type=\"net.sf.navigator.displayer.ListMenuDisplayer\"/>" + NL + "        <Displayer name=\"TabbedMenu\" type=\"net.sf.navigator.displayer.TabbedMenuDisplayer\"/>" + NL + "        <Displayer name=\"Velocity\" type=\"net.sf.navigator.displayer.VelocityMenuDisplayer\"/>" + NL + "    </Displayers>" + NL + "" + NL + "    <Menus>" + NL + "" + NL + "        <Menu name=\"Home\" title=\"Home\" location=\"home.do\" />" + NL + "" + NL + "\t";
  protected final String TEXT_2 = NL + "\t\t";
  protected final String TEXT_3 = NL + "        <Menu name=\"";
  protected final String TEXT_4 = "Menu\" title=\"";
  protected final String TEXT_5 = "\">" + NL + "            <Item name=\"";
  protected final String TEXT_6 = "Edit\" title=\"";
  protected final String TEXT_7 = "Edit\" location=\"edit";
  protected final String TEXT_8 = ".do\"/>" + NL + "            <Item name=\"";
  protected final String TEXT_9 = "Search\" title=\"";
  protected final String TEXT_10 = "Search\" location=\"search";
  protected final String TEXT_11 = ".do\" />" + NL + "        </Menu>" + NL + "\t\t";
  protected final String TEXT_12 = " " + NL + "\t";
  protected final String TEXT_13 = NL + NL + "        <Menu name=\"Exit\" title=\"Exit\" location=\"logout.do\" />" + NL + "" + NL + "    </Menus>" + NL + "</MenuConfig>";
  protected final String TEXT_14 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> i = project.getPackages().iterator(); i.hasNext();) {
	    XPackage xPackage = (XPackage) i.next();
    stringBuffer.append(TEXT_2);
    for (Iterator<XClass> i2 = xPackage.getClasses().iterator(); i2.hasNext();) {
		    XClass xClass = (XClass) i2.next();
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
      } 
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}
