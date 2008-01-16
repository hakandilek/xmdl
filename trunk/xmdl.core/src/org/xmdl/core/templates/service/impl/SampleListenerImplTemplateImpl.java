package org.xmdl.core.templates.service.impl;

import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class SampleListenerImplTemplateImpl
{
  protected static String nl;
  public static synchronized SampleListenerImplTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SampleListenerImplTemplateImpl result = new SampleListenerImplTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".bo.impl;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "/**" + NL + " * SampleListenerImpl." + NL + " *" + NL + " * @author mca" + NL + " * @author hd" + NL + " * @version 1.0" + NL + " * @generated" + NL + " */" + NL + "public class SampleListenerImpl implements SampleListener{" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    private static final Log LOGGER = LogFactory.getLog(SampleListenerImpl.class);" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public SampleListenerImpl() {" + NL + "        onInitialize();" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    protected void onInitialize() {" + NL + "        LOGGER.debug(getClass().getName() + \" initialized.\");" + NL + "        //do nothing" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XProject xProject = (XProject) argument;
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
    importManager.addImport("org.xmdl.lib.bo.*");
    importManager.addImport("org.apache.commons.logging.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".bo.SampleListener");
    stringBuffer.append(TEXT_4);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_5);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
