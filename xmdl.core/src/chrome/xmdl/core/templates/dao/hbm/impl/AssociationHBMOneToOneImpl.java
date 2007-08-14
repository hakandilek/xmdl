package chrome.xmdl.core.templates.dao.hbm.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.core.util.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import chrome.xmdldb.*;

public class AssociationHBMOneToOneImpl
{
  protected static String nl;
  public static synchronized AssociationHBMOneToOneImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    AssociationHBMOneToOneImpl result = new AssociationHBMOneToOneImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<one-to-one" + NL + "\tname=\"";
  protected final String TEXT_2 = "\" " + NL + "\tclass=\"";
  protected final String TEXT_3 = "\"" + NL + "\tcascade=\"";
  protected final String TEXT_4 = "\"" + NL + "\t/>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	AttributePair pair = (AttributePair) argument;	
	DField f = pair.getField();	
	XAttribute a = pair.getAttribute();
	XAssociationBehaviour b = a.getAssociationBehaviour();
	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(a.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getObjectImplName(a.getType()));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(XAssociationBehaviour.COMPOSITION == b.getValue() ? "delete" : "none" );
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
