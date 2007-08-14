package chrome.xmdl.core.templates.service.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class SampleListenerTemplateImpl
{
  protected static String nl;
  public static synchronized SampleListenerTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SampleListenerTemplateImpl result = new SampleListenerTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".bo;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * SampleListener." + NL + " *" + NL + " * @author tr1a3571" + NL + " * @version 1.0" + NL + " * @generated" + NL + " */" + NL + "public interface SampleListener {" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject xProject = (XProject) argument;
    XPackage xPackage = (XPackage) xProject.getPackages().get(0);
     
    //DBHelper dbHelper = XMDLDBHelper.INSTANCE;    
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
    importManager.addImport("java.util.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_4);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
