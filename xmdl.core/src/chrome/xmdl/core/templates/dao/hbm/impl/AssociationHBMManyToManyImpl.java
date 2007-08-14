package chrome.xmdl.core.templates.dao.hbm.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import chrome.xmdl.core.util.*;
import org.eclipse.emf.codegen.util.*;
import chrome.xmdldb.*;

public class AssociationHBMManyToManyImpl
{
  protected static String nl;
  public static synchronized AssociationHBMManyToManyImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    AssociationHBMManyToManyImpl result = new AssociationHBMManyToManyImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "  <list " + NL + "\t\tname=\"";
  protected final String TEXT_2 = "\"" + NL + "\t\ttable=\"??\">" + NL + "" + NL + "        <key column=\"??\"/>" + NL + "\t\t<index column=\"??\"/>" + NL + "        <many-to-many " + NL + "\t\t\tclass=\"";
  protected final String TEXT_3 = "\"" + NL + "\t\t\tcolumn=\"??\"" + NL + "    \t/>" + NL + "    </list>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    	
	AttributePair pair = (AttributePair) argument;
	ClassHelper helper = XMDLClassHelper.INSTANCE;	
	//DField f = XmdldbUtils.getField();	
	XAttribute a = pair.getAttribute();
//	DTable rel = XmdldbUtils.findRelationTable(f);	
//	XAttribute a = f.getXAttribute();
//	DField of = XmdldbUtils.getOpposite(f);
	//DTable ot = of.getDTable();
	XAssociationBehaviour b = a.getAssociationBehaviour();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(a.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getObjectImplName(a.getType()));
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
