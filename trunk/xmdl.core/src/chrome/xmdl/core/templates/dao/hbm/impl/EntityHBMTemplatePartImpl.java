package chrome.xmdl.core.templates.dao.hbm.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdldb.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.xgen.*;

public class EntityHBMTemplatePartImpl
{
  protected static String nl;
  public static synchronized EntityHBMTemplatePartImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityHBMTemplatePartImpl result = new EntityHBMTemplatePartImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t<class name=\"";
  protected final String TEXT_2 = "\"" + NL + "\t\t   table=\"";
  protected final String TEXT_3 = "\"" + NL + "\t\t   lazy=\"true\"" + NL + "\t\t   proxy=\"";
  protected final String TEXT_4 = "\"" + NL + "\t\t   >" + NL + "" + NL + "\t\t<id name=\"ID\"" + NL + "\t\t\ttype=\"long\"" + NL + "\t\t\tcolumn=\"ID\"" + NL + "\t\t\tunsaved-value=\"0\"" + NL + "\t\t\t>" + NL + "\t\t\t<generator class=\"hilo\"/>" + NL + "\t\t</id>\t\t" + NL + "\t\t " + NL + "\t";
  protected final String TEXT_5 = NL + "\t    <property name=\"";
  protected final String TEXT_6 = "\" >" + NL + "\t        <column name=\"";
  protected final String TEXT_7 = "\"/>" + NL + "\t        <type name=\"chrome.xmdl.lib.dao.hib.PersistentEnumType\">" + NL + "\t            <param name=\"targetClass\">";
  protected final String TEXT_8 = "</param>" + NL + "\t        </type>" + NL + "        </property>" + NL + "\t\t";
  protected final String TEXT_9 = " " + NL + "\t\t<property name=\"";
  protected final String TEXT_10 = "\"" + NL + "\t\t\t\ttype=\"";
  protected final String TEXT_11 = "\"" + NL + "\t\t\t\tcolumn=\"";
  protected final String TEXT_12 = "\"" + NL + "\t\t\t\tlength=\"";
  protected final String TEXT_13 = "\"" + NL + "\t\t\t\tnot-null=\"false\"/>" + NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t";
  protected final String TEXT_15 = NL + "\t\t\t";
  protected final String TEXT_16 = NL + "\t\t";
  protected final String TEXT_17 = NL + "\t";
  protected final String TEXT_18 = "\t\t\t " + NL + "\t" + NL + "\t" + NL + "\t</class>";
  protected final String TEXT_19 = NL;
  protected final String TEXT_20 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	DTable dTable =(DTable) argument;
	
	XClass xClass = dTable.getXClass();
	
	ClassHelper helper = XMDLEntityHelper.INSTANCE;	
	DBHelper dbHelper = XMDLDBHelper.INSTANCE;	
	

      if (xClass != null) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getObjectImplName(xClass));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(dTable.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_4);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
		XAttribute attribute = (XAttribute) i.next();
		DField field = XmdldbUtils.findField(attribute, dTable);		
		XType type = attribute.getType();
		if (type instanceof XEnumeration) {
			XEnumeration enumeration = (XEnumeration) type;
    stringBuffer.append(TEXT_5);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(field.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getObjectName(enumeration));
    stringBuffer.append(TEXT_8);
    } else {
			if (!attribute.isReference()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(attribute.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(attribute.getType().getClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(field.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(field.getLength());
    stringBuffer.append(TEXT_13);
    } else {
			AttributePair pair = new AttributePair(attribute, field, dTable);
			Template t = dbHelper.getTemplate(attribute);
			
    stringBuffer.append(TEXT_14);
    stringBuffer.append(Generator.runTemplate(t, pair));
    stringBuffer.append(TEXT_15);
    } //if
    stringBuffer.append(TEXT_16);
    } //if-else
    stringBuffer.append(TEXT_17);
    }//for
    stringBuffer.append(TEXT_18);
      } 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
