package chrome.xmdl.core.templates.context.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;

public class ApplicationResourcesPropImpl
{
  protected static String nl;
  public static synchronized ApplicationResourcesPropImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationResourcesPropImpl result = new ApplicationResourcesPropImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# -- messages used in decorators & jsp files --" + NL + "application.prefix=";
  protected final String TEXT_2 = " ~" + NL + "" + NL + "## Conversion formats" + NL + "date.format=dd.MM.yyyy" + NL + "currency.format=###,###.00" + NL + "time.format=dd.MM.yyyy HH:mm" + NL;
  protected final String TEXT_3 = NL + NL + "# -- ";
  protected final String TEXT_4 = "-START" + NL + "" + NL + "# -- ";
  protected final String TEXT_5 = " form --";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = ".ID=Id" + NL + "\t";
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = ".form.";
  protected final String TEXT_10 = " = ";
  protected final String TEXT_11 = NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\t";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = ".form.";
  protected final String TEXT_15 = "Min = Min. ";
  protected final String TEXT_16 = "\t";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = ".form.";
  protected final String TEXT_19 = "Max = Max. ";
  protected final String TEXT_20 = "\t" + NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_23 = NL;
  protected final String TEXT_24 = ".form.";
  protected final String TEXT_25 = ".";
  protected final String TEXT_26 = " = ";
  protected final String TEXT_27 = NL + "\t\t\t";
  protected final String TEXT_28 = NL + "\t";
  protected final String TEXT_29 = NL + NL + "# -- ";
  protected final String TEXT_30 = "  list page --";
  protected final String TEXT_31 = NL;
  protected final String TEXT_32 = ".list.title=";
  protected final String TEXT_33 = " List";
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = ".list.heading=";
  protected final String TEXT_36 = "s" + NL;
  protected final String TEXT_37 = NL;
  protected final String TEXT_38 = ".list.";
  protected final String TEXT_39 = "=";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = ".list.COPY=Copy";
  protected final String TEXT_42 = NL;
  protected final String TEXT_43 = ".list.DELETE=Delete";
  protected final String TEXT_44 = NL;
  protected final String TEXT_45 = ".list.ID=ID" + NL + "\t";
  protected final String TEXT_46 = NL;
  protected final String TEXT_47 = ".list.";
  protected final String TEXT_48 = " = ";
  protected final String TEXT_49 = NL + "\t";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = ".list.";
  protected final String TEXT_52 = ".";
  protected final String TEXT_53 = " = ";
  protected final String TEXT_54 = NL + "\t\t\t";
  protected final String TEXT_55 = NL + "\t";
  protected final String TEXT_56 = " " + NL + "" + NL + "# -- ";
  protected final String TEXT_57 = "  CRUD messages --" + NL;
  protected final String TEXT_58 = NL;
  protected final String TEXT_59 = ".added=";
  protected final String TEXT_60 = " has been added successfully.";
  protected final String TEXT_61 = NL;
  protected final String TEXT_62 = ".updated=";
  protected final String TEXT_63 = " has been updated successfully.";
  protected final String TEXT_64 = NL;
  protected final String TEXT_65 = ".deleted=";
  protected final String TEXT_66 = " has been deleted successfully.";
  protected final String TEXT_67 = NL;
  protected final String TEXT_68 = ".notFound=";
  protected final String TEXT_69 = " not found, please select a ";
  protected final String TEXT_70 = " from list" + NL + "" + NL + "# -- ";
  protected final String TEXT_71 = "  detail page --";
  protected final String TEXT_72 = NL;
  protected final String TEXT_73 = ".detail.title=";
  protected final String TEXT_74 = " Detail";
  protected final String TEXT_75 = NL;
  protected final String TEXT_76 = ".detail.heading=";
  protected final String TEXT_77 = " Information" + NL + "" + NL + "# -- ";
  protected final String TEXT_78 = "  edit page --";
  protected final String TEXT_79 = NL;
  protected final String TEXT_80 = ".edit.title=Edit ";
  protected final String TEXT_81 = NL;
  protected final String TEXT_82 = ".edit.heading=Edit ";
  protected final String TEXT_83 = NL + NL + "# -- ";
  protected final String TEXT_84 = "-END" + NL;
  protected final String TEXT_85 = NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + NL + "##### Common Resources below here #################" + NL + "" + NL + "# -- messages used in decorators/default.jsp --" + NL + "user.status=Logged in as:" + NL + "user.logout=Logout" + NL + "" + NL + "# -- validator errors --" + NL + "errors.invalid='{0}' is invalid." + NL + "errors.maxlength='{0}' can not be greater than {1} characters." + NL + "errors.minlength='{0}' can not be less than {1} characters." + NL + "errors.range='{0}' is not in the range {1} through {2}." + NL + "errors.required='{0}' is a required field." + NL + "errors.byte='{0}' must be an byte." + NL + "errors.date='{0}' is not a date." + NL + "errors.double='{0}' must be an double." + NL + "errors.float='{0}' must be an float." + NL + "errors.integer='{0}' must be a number." + NL + "errors.long='{0}' must be an long." + NL + "errors.short='{0}' must be an short." + NL + "errors.creditcard='{0}' is not a valid credit card number." + NL + "errors.email='{0}' is an invalid e-mail address." + NL + "errors.phone='{0}' is an invalid phone number." + NL + "errors.zip='{0}' is an invalid zip code." + NL + "# -- for field level messages --" + NL + "errors.header=<span class=\"fieldError\">" + NL + "errors.footer=</span>" + NL + "" + NL + "# -- other errors --" + NL + "errors.cancel=Operation cancelled." + NL + "errors.detail={0}" + NL + "errors.general=<strong>The process did not complete. Details should follow.</strong>" + NL + "errors.token=Request could not be completed. Operation is not in sequence." + NL + "errors.none=No error message was found, check your server logs." + NL + "errors.password.mismatch=Invalid username and/or password, please try again." + NL + "errors.conversion=An error occurred while converting web values to data values." + NL + "errors.twofields=The '{0}' field has to have the same value as the '{1}' field." + NL + "errors.existing.user=This username (<strong>{0}</strong>) or e-mail address (<strong>{1}</strong>) already exists.  Please try a different username." + NL + "" + NL + "" + NL + "# -- error page messages --" + NL + "errorPage.title=An error has occurred" + NL + "errorPage.heading=Yikes!" + NL + "404.title=Page Not Found" + NL + "404.message=The page your requested was not found.  You might try returning to the <a href=\"{0}\">Main Menu</a>. While you&#39;re here, how about a pretty picture to cheer you up?" + NL + "403.title=Access Denied" + NL + "403.message=Your current role does not allow you to view this page.  Please contact your system administrator if you believe you should have access.  In the meantime, how about a pretty picture to cheer you up?" + NL + "" + NL + "# -- login --" + NL + "login.title=Login" + NL + "login.heading=Login" + NL + "login.rememberMe=Remember Me" + NL + "login.signup=Not a member? <a href=\"{0}\">Signup</a> for an account." + NL + "login.passwordHint=Forgot your password?  Have your <a href=\"?\" onmouseover=\"window.status='Have your password hint sent to you.'; return true\" onmouseout=\"window.status=''; return true\" title=\"Have your password hint sent to you.\" onclick=\"passwordHint(); return false\">password hint e-mailed to you</a>." + NL + "login.passwordHint.sent=The password hint for <strong>{0}</strong> has been sent to <strong>{1}</strong>." + NL + "login.passwordHint.error=The username <strong>{0}</strong> was not found in our database." + NL + "" + NL + "# -- welcome --" + NL + "welcome.message=This application is designed to demonstrate the use of web application security, as well as how to use Hibernate with Struts and Struts Advanced features.  Most of the persistence layer for this application is generated using XDoclet.  You can find more information on how to build your own application from this one by reading the README file below.  <span class=\"attention\">To login as a regular user (with the <strong>user</strong> role), the username/password combination is <strong>tomcat/tomcat</strong>.  To login as an <strong>admin</strong> user, use <strong>mraible/tomcat</strong>.</span>" + NL + "" + NL + "" + NL + "# -- button labels --" + NL + "button.add=Add" + NL + "button.cancel=Cancel" + NL + "button.copy=Copy" + NL + "button.delete=Delete" + NL + "button.edit=Edit" + NL + "button.register=Signup" + NL + "button.save=Save" + NL + "button.search=Search" + NL + "button.upload=Upload" + NL + "button.view=View" + NL + "button.reset=Reset" + NL + "button.login=Login" + NL + "" + NL + "# -- general values --" + NL + "icon.information=Information" + NL + "icon.information.img=/images/iconInformation.gif" + NL + "icon.email=E-Mail" + NL + "icon.email.img=/images/iconEmail.gif" + NL + "icon.warning=Warning" + NL + "icon.warning.img=/images/iconWarning.gif" + NL + "date.format=MM/dd/yyyy" + NL + "time.format=dd.MM.yyyy HH:mm" + NL + "" + NL + "# -- upload page messages --" + NL + "maxLengthExceeded=The file you are trying to upload is too big.  The maximum allowed size is 2 MB." + NL + "upload.title=File Upload" + NL + "upload.heading=Upload A File" + NL + "upload.message=Note that the maximum allowed size of an uploaded file for this application is 2 MB. See the metadata/web/struts-controller.xml file (or the generated struts-config.xml) to change this value." + NL + "uploadForm.name=Friendly Name" + NL + "uploadForm.file=File to Upload" + NL + "" + NL + "# -- display page messages --" + NL + "display.title=File Uploaded Successfully!" + NL + "display.heading=File Information" + NL + "" + NL + "# -- flushCache page --" + NL + "flushCache.title=Flush Cache" + NL + "flushCache.heading=Flush Successful!" + NL + "flushCache.message=All caches successfully flushed, returning you to your previous page in 2 seconds." + NL + "" + NL + "# -- clickstreams page --" + NL + "clickstreams.title=All Clickstreams" + NL + "clickstreams.heading=All Clickstreams" + NL + "" + NL + "# -- viewstream page --" + NL + "viewstream.title=Stream Details" + NL + "viewstream.heading=Stream Information" + NL + "" + NL + "# -- active users page --" + NL + "activeUsers.title=Active Users" + NL + "activeUsers.heading=Current Users" + NL + "activeUsers.message=The following is a list of users that have logged in and their sessions have not expired." + NL + "activeUsers.fullName=Full Name" + NL;
  protected final String TEXT_86 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XPackage xPackage = (XPackage) argument;
	//XProject xProject = xPackage.getProject();	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(xPackage.getName());
    stringBuffer.append(TEXT_2);
    for (Iterator<XClass> it = xPackage.getClasses().iterator(); it.hasNext();) {
		XClass xClass = (XClass) it.next();

    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_7);
    for (Iterator<XAttribute> it2 = xClass.getAttributes().iterator(); it2.hasNext();) {
			XAttribute attribute = (XAttribute) it2.next();
	
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_11);
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_12);
    	XType type = attribute.getType();
			boolean comparable = type.isComparable();
			if (comparable) {
		
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    if (attribute.getType() instanceof XEnumeration) {
			XEnumeration enumeration = (XEnumeration) attribute.getType();
			for (Iterator<XEnumerationLiteral> i= enumeration.getLiterals().iterator(); i.hasNext();) {
			    XEnumerationLiteral lit = (XEnumerationLiteral) i.next();
    stringBuffer.append(TEXT_23);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_27);
     }
		  } 
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_36);
     if (MasterChildHelper.INST.isMaster(xClass)) {
	  List<XClass> children = MasterChildHelper.INST.getChildren(xClass);		
	  for (Iterator<XClass> it2 = children.iterator(); it2.hasNext();) {
		  XClass child = (XClass) it2.next();

    stringBuffer.append(TEXT_37);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(child.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(child.getName());
        } 
  }
    stringBuffer.append(TEXT_40);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_45);
    for (Iterator<XAttribute> it2 = xClass.getAttributes().iterator(); it2.hasNext();) {
			XAttribute attribute = (XAttribute) it2.next();
	
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.getCapName(attribute));
    stringBuffer.append(TEXT_49);
    if (attribute.getType() instanceof XEnumeration) {
		XEnumeration enumeration = (XEnumeration) attribute.getType();
		for (Iterator<XEnumerationLiteral> i= enumeration.getLiterals().iterator(); i.hasNext();) {
		    XEnumerationLiteral lit = (XEnumerationLiteral) i.next();
    stringBuffer.append(TEXT_50);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(helper.uncapSafeName(attribute));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_54);
     }
		  } 
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(TEXT_86);
    return stringBuffer.toString();
  }
}
