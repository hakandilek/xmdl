package chrome.xmdl.core.templates.dao.hbm.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import chrome.xmdl.core.templates.dao.hbm.*;
import chrome.xmdldb.*;

public class PackageHBMTemplateImpl
{
  protected static String nl;
  public static synchronized PackageHBMTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    PackageHBMTemplateImpl result = new PackageHBMTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\"?>" + NL + "<!DOCTYPE hibernate-mapping PUBLIC  \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" \"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd\">" + NL + "<hibernate-mapping>";
  protected final String TEXT_2 = NL + NL + "</hibernate-mapping>";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    	
	DPackage xPackage = (DPackage )argument;
	

    stringBuffer.append(TEXT_1);
    EntityHBMTemplatePart part = new EntityHBMTemplatePart();
    for (Iterator iter = xPackage.getDTables().iterator(); iter.hasNext();) {
	DTable element = (DTable) iter.next();
	XClass xClass = element.getXClass();
	if (xClass != null){
		
    stringBuffer.append(part.generate(element));
    
	}
} 

    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
