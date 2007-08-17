package chrome.xmdl.core.templates.ui.web.taglib.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class SampleTagImpl
{
  protected static String nl;
  public static synchronized SampleTagImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SampleTagImpl result = new SampleTagImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".ui.web.taglib;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/** " + NL + " * This class is here to demonstrate a sample tag library implementation." + NL + " * @generated" + NL + " */" + NL + "public class SampleTag extends TagSupport {" + NL + "    public int doAfterBody() throws JspException {" + NL + "        return super.doAfterBody();" + NL + "    }" + NL + "" + NL + "    public int doEndTag() throws JspException {" + NL + "        return super.doEndTag();" + NL + "    }" + NL + "" + NL + "    public int doStartTag() throws JspException {" + NL + "        return super.doStartTag();" + NL + "    }" + NL + "" + NL + "    public void release() {" + NL + "        super.release();" + NL + "    }" + NL + "}";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject  xProject = (XProject) argument;
    XPackage xPackage = (XPackage) xProject.getPackages().get(0); 
     
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_3);
    importManager.addImport("javax.servlet.jsp.*");
    importManager.addImport("javax.servlet.jsp.tagext.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
