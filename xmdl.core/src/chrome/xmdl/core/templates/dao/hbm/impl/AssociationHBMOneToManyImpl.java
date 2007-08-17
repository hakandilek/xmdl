package chrome.xmdl.core.templates.dao.hbm.impl;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import chrome.xmdldb.*;

public class AssociationHBMOneToManyImpl
{
  protected static String nl;
  public static synchronized AssociationHBMOneToManyImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    AssociationHBMOneToManyImpl result = new AssociationHBMOneToManyImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "  <list " + NL + "\t\tname=\"";
  protected final String TEXT_2 = "\"" + NL + "\t\ttable=\"";
  protected final String TEXT_3 = "\" " + NL + "\t\tcascade=\"";
  protected final String TEXT_4 = "\">" + NL + "" + NL + "        <key column=\"";
  protected final String TEXT_5 = "\"/>" + NL + "\t\t<index column=\"ID\"/>" + NL + "        <one-to-many " + NL + "\t\t\tclass=\"";
  protected final String TEXT_6 = "\"" + NL + "    \t/>" + NL + "    </list>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    	
	AttributePair pair = (AttributePair) argument;	
	//DField f = pair.getField();	
	XAttribute a = pair.getAttribute();
	DTable t = pair.getTable();
	DField of = XmdldbUtils.findOneToManyOppositeField(t, a);
	DTable ot = of.getDTable();
	XAssociationBehaviour b = a.getAssociationBehaviour();
	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(a.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(ot.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(XAssociationBehaviour.COMPOSITION == b.getValue() ? "delete" : "none" );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(of.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectImplName(a.getType()));
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
