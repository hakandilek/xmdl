package chrome.xmdl.core.templates.ui.web.webinf.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.EObject;

public class ValidatorRulesXMLImpl
{
  protected static String nl;
  public static synchronized ValidatorRulesXMLImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ValidatorRulesXMLImpl result = new ValidatorRulesXMLImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE form-validation PUBLIC" + NL + "     \"-//Apache Software Foundation//DTD Commons Validator Rules Configuration 1.2.0//EN\"" + NL + "     \"http://jakarta.apache.org/commons/dtds/validator_1_2_0.dtd\">" + NL + "" + NL + "<form-validation>" + NL + "" + NL + "   <global>" + NL + "" + NL + "      <validator name=\"required\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateRequired\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "                  msg=\"errors.required\"/>" + NL + "" + NL + "      <validator name=\"requiredif\"" + NL + "                 classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "                 method=\"validateRequiredIf\"" + NL + "                 methodParams=\"java.lang.Object," + NL + "                               org.apache.commons.validator.ValidatorAction," + NL + "                               org.apache.commons.validator.Field," + NL + "                               org.apache.struts.action.ActionMessages," + NL + "                               org.apache.commons.validator.Validator," + NL + "                               javax.servlet.http.HttpServletRequest\"" + NL + "                 msg=\"errors.required\"/>" + NL + "" + NL + "      <validator name=\"validwhen\"" + NL + "          msg=\"errors.required\"" + NL + "                 classname=\"org.apache.struts.validator.validwhen.ValidWhen\"" + NL + "                 method=\"validateValidWhen\"" + NL + "                 methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"minlength\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateMinLength\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.minlength\"" + NL + "           jsFunction=\"org.apache.commons.validator.javascript.validateMinLength\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"maxlength\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateMaxLength\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.maxlength\"" + NL + "           jsFunction=\"org.apache.commons.validator.javascript.validateMaxLength\"/>" + NL + "" + NL + "" + NL + "" + NL + "      <validator name=\"mask\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateMask\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.invalid\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"byte\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateByte\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.byte\"" + NL + "       jsFunctionName=\"ByteValidations\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"short\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateShort\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.short\"" + NL + "       jsFunctionName=\"ShortValidations\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"integer\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateInteger\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.integer\"" + NL + "       jsFunctionName=\"IntegerValidations\"/>" + NL + "" + NL + "" + NL + "" + NL + "      <validator name=\"long\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateLong\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.long\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"float\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateFloat\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.float\"" + NL + "       jsFunctionName=\"FloatValidations\"/>" + NL + "" + NL + "      <validator name=\"double\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateDouble\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.double\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"date\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateDate\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.date\"" + NL + "       jsFunctionName=\"DateValidations\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"intRange\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateIntRange\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"integer\"" + NL + "                  msg=\"errors.range\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"floatRange\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateFloatRange\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"float\"" + NL + "                  msg=\"errors.range\"/>" + NL + "" + NL + "      <validator name=\"doubleRange\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateDoubleRange\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"double\"" + NL + "                  msg=\"errors.range\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"creditCard\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateCreditCard\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.creditcard\"/>" + NL + "" + NL + "" + NL + "      <validator name=\"email\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateEmail\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.email\"/>" + NL + "" + NL + "      <validator name=\"url\"" + NL + "            classname=\"org.apache.struts.validator.FieldChecks\"" + NL + "               method=\"validateUrl\"" + NL + "         methodParams=\"java.lang.Object," + NL + "                       org.apache.commons.validator.ValidatorAction," + NL + "                       org.apache.commons.validator.Field," + NL + "                       org.apache.struts.action.ActionMessages," + NL + "                       org.apache.commons.validator.Validator," + NL + "                       javax.servlet.http.HttpServletRequest\"" + NL + "              depends=\"\"" + NL + "                  msg=\"errors.url\"/>" + NL + "" + NL + "     <!--" + NL + "       This simply allows struts to include the validateUtilities into a page, it should" + NL + "       not be used as a validation rule." + NL + "     -->" + NL + "     <validator name=\"includeJavaScriptUtilities\"" + NL + "            classname=\"\"" + NL + "               method=\"\"" + NL + "         methodParams=\"\"" + NL + "              depends=\"\"" + NL + "                  msg=\"\"" + NL + "           jsFunction=\"org.apache.commons.validator.javascript.validateUtilities\"/>" + NL + "" + NL + "   </global>" + NL + "" + NL + "</form-validation>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XProject project = (XProject) argument;	
	ClassHelper helper = XMDLClassHelper.INSTANCE;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
