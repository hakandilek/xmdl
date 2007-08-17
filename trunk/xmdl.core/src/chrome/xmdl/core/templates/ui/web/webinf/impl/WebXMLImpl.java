package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class WebXMLImpl
{
  protected static String nl;
  public static synchronized WebXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    WebXMLImpl result = new WebXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<!DOCTYPE web-app PUBLIC \"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN\"" + NL + "    \"http://java.sun.com/dtd/web-app_2_3.dtd\">" + NL + "" + NL + "<web-app>" + NL + "    <display-name>xmdl.tmp</display-name>" + NL + "" + NL + "    <!-- Define the basename for a resource bundle for I18N -->" + NL + "    <context-param>" + NL + "        <param-name>javax.servlet.jsp.jstl.fmt.localizationContext</param-name>" + NL + "        <param-value>";
  protected final String TEXT_2 = NL + "        \t";
  protected final String TEXT_3 = ".ApplicationResources";
  protected final String TEXT_4 = NL + "    \t</param-value>" + NL + "    </context-param>" + NL + "    <!-- Fallback locale if no bundles found for browser's preferred locale -->" + NL + "    <!-- Force a single locale using param-name 'javax.servlet.jsp.jstl.fmt.locale' -->" + NL + "    <context-param>" + NL + "        <param-name>javax.servlet.jsp.jstl.fmt.fallbackLocale</param-name>" + NL + "        <param-value>en</param-value>" + NL + "    </context-param>" + NL + "" + NL + "    <context-param>" + NL + "        <param-name>contextConfigLocation</param-name>" + NL + "        <param-value>";
  protected final String TEXT_5 = NL + "            classpath*:/**/";
  protected final String TEXT_6 = "/applicationContext-*.xml";
  protected final String TEXT_7 = NL + "        </param-value>" + NL + "    </context-param>" + NL + "" + NL + "    <context-param>" + NL + "        <param-name>menuConfigLocation</param-name>" + NL + "        <param-value> /WEB-INF/menu-config.xml </param-value>" + NL + "    </context-param>" + NL + "" + NL + "" + NL + "    <filter>" + NL + "        <filter-name>sitemesh</filter-name>" + NL + "        <filter-class>com.opensymphony.module.sitemesh.filter.PageFilter</filter-class>" + NL + "    </filter>" + NL + "" + NL + "    <filter>" + NL + "        <filter-name>CharacterEncoding</filter-name>" + NL + "        <filter-class>chrome.xmdl.lib.ui.web.filter.CharacterEncodingFilter</filter-class>" + NL + "        <init-param>" + NL + "            <param-name>encoding</param-name>" + NL + "            <param-value>ISO-8859-9</param-value>" + NL + "        </init-param>" + NL + "        <init-param>" + NL + "            <param-name>locale</param-name>" + NL + "            <param-value>tr</param-value>" + NL + "        </init-param>" + NL + "    </filter>" + NL + "" + NL + "    <filter>" + NL + "        <filter-name>requestLogger</filter-name>" + NL + "        <filter-class>chrome.xmdl.lib.ui.web.filter.RequestLogFilter</filter-class>" + NL + "    </filter>" + NL + "" + NL + "    <filter-mapping>" + NL + "        <filter-name>sitemesh</filter-name>" + NL + "        <url-pattern>/*</url-pattern>" + NL + "        <!--dispatcher>REQUEST</dispatcher>" + NL + "        <dispatcher>FORWARD</dispatcher-->" + NL + "    </filter-mapping>" + NL + "" + NL + "    <filter-mapping>" + NL + "        <filter-name>CharacterEncoding</filter-name>" + NL + "        <url-pattern>/*</url-pattern>" + NL + "    </filter-mapping>" + NL + "" + NL + "<!--    <filter-mapping>-->" + NL + "<!--        <filter-name>requestLogger</filter-name>-->" + NL + "<!--        <url-pattern>/*</url-pattern>-->" + NL + "<!--    </filter-mapping>-->" + NL + "" + NL + "    <listener>" + NL + "        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>" + NL + "    </listener>" + NL + "" + NL + "    <listener>" + NL + "        <listener-class>net.sf.navigator.menu.MenuContextListener</listener-class>" + NL + "    </listener>" + NL + "" + NL + "    <servlet>" + NL + "        <servlet-name>action</servlet-name>" + NL + "        <servlet-class>org.apache.struts.action.ActionServlet</servlet-class>" + NL + "        <init-param>" + NL + "            <param-name>config</param-name>" + NL + "            <param-value>/WEB-INF/struts-config.xml</param-value>" + NL + "        </init-param>" + NL + "        <init-param>" + NL + "            <param-name>debug</param-name>" + NL + "            <param-value>2</param-value>" + NL + "        </init-param>" + NL + "        <init-param>" + NL + "            <param-name>detail</param-name>" + NL + "            <param-value>2</param-value>" + NL + "        </init-param>" + NL + "        <load-on-startup>2</load-on-startup>" + NL + "" + NL + "    </servlet>" + NL + "" + NL + "    <servlet-mapping>" + NL + "        <servlet-name>action</servlet-name>" + NL + "        <url-pattern>*.do</url-pattern>" + NL + "    </servlet-mapping>" + NL + "" + NL + "    <welcome-file-list>" + NL + "        <welcome-file>index.jsp</welcome-file>" + NL + "    </welcome-file-list>" + NL + "" + NL + "    <error-page>" + NL + "        <error-code>500</error-code>" + NL + "        <location>/common/error.jsp</location>" + NL + "    </error-page>" + NL + "" + NL + "\t<security-constraint>" + NL + "\t\t<web-resource-collection>" + NL + "\t\t\t<web-resource-name>no_access</web-resource-name>" + NL + "\t\t\t<url-pattern>*.jsp</url-pattern>" + NL + "\t\t</web-resource-collection>" + NL + "\t\t<auth-constraint/>" + NL + "\t</security-constraint>" + NL + "" + NL + "   <!-- Restrict access to all resources -->" + NL + "    <security-constraint>" + NL + "        <web-resource-collection>" + NL + "            <web-resource-name>Default</web-resource-name>" + NL + "            <url-pattern>/</url-pattern>" + NL + "        </web-resource-collection>" + NL + "        <auth-constraint>" + NL + "        </auth-constraint>" + NL + "    </security-constraint>" + NL + "" + NL + "    <!-- Grant public access (for non-authenticated users) -->" + NL + "    <security-constraint>" + NL + "        <web-resource-collection>" + NL + "            <web-resource-name>Public Access</web-resource-name>" + NL + "            <url-pattern>/common/*</url-pattern>" + NL + "            <url-pattern>/images/*</url-pattern>" + NL + "            <url-pattern>/config/*</url-pattern>" + NL + "            <url-pattern>/scripts/*</url-pattern>" + NL + "            <url-pattern>/styles/*</url-pattern>" + NL + "            <url-pattern>/home.do</url-pattern>" + NL + "        </web-resource-collection>" + NL + "    </security-constraint>" + NL + "" + NL + "    <security-constraint>" + NL + "        <web-resource-collection>" + NL + "            <web-resource-name>Moderator</web-resource-name>" + NL + "" + NL + "\t";
  protected final String TEXT_8 = NL + "\t\t";
  protected final String TEXT_9 = NL + "            <url-pattern>/edit";
  protected final String TEXT_10 = ".do</url-pattern>" + NL + "            <url-pattern>/search";
  protected final String TEXT_11 = ".do</url-pattern>" + NL + "\t\t";
  protected final String TEXT_12 = " " + NL + "\t";
  protected final String TEXT_13 = NL + "        </web-resource-collection>" + NL + "" + NL + "        <auth-constraint>" + NL + "            <role-name>Moderator</role-name>" + NL + "        </auth-constraint>" + NL + "    </security-constraint>" + NL + "" + NL + "    <login-config>" + NL + "\t\t<auth-method>BASIC</auth-method>" + NL + "\t</login-config>" + NL + "" + NL + "    <security-role>" + NL + "        <role-name>Moderator</role-name>" + NL + "    </security-role>" + NL + "\t" + NL + "</web-app>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    for (Iterator<XPackage> itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_2);
    stringBuffer.append(XMDLClassHelper.INSTANCE.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(itp.hasNext()? ",": "");
    }
    stringBuffer.append(TEXT_4);
    for (Iterator<XPackage> itp = project.getPackages().iterator(); itp.hasNext();) {
		XPackage xPackage = (XPackage ) itp.next();
    stringBuffer.append(TEXT_5);
    stringBuffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(xPackage));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    for (Iterator<XPackage> i = project.getPackages().iterator(); i.hasNext();) {
	    XPackage xPackage = (XPackage) i.next();
    stringBuffer.append(TEXT_8);
    for (Iterator<XClass> i2 = xPackage.getClasses().iterator(); i2.hasNext();) {
		    XClass xClass = (XClass) i2.next();
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
      } 
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
