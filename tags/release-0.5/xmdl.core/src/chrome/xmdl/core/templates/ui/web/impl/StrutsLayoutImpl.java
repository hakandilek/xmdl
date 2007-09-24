package chrome.xmdl.core.templates.ui.web.impl;

public class StrutsLayoutImpl
{
  protected static String nl;
  public static synchronized StrutsLayoutImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    StrutsLayoutImpl result = new StrutsLayoutImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#skin name. Default is the first parameter or the file name (ie Struts-Layout_blue.properties -> blue.css)" + NL + "skin = " + NL + "" + NL + "# web directory in which are located the images" + NL + "directory.images = config" + NL + "" + NL + "# web directory in which are located the javascrips" + NL + "directory.config = config" + NL + "" + NL + "# web directory in which are located the css files. Default is directory.config" + NL + "directory.css =" + NL + "" + NL + "# display ot not the null fields in inspect mode" + NL + "display.null.fields = true" + NL + "" + NL + "# implementor of the PanelInterface to use" + NL + "panel.class = fr.improve.struts.taglib.layout.util.BasicPanel" + NL + "" + NL + "# implementor of the CollectionInterface to use" + NL + "collection.class = fr.improve.struts.taglib.layout.util.BasicCollection" + NL + "collection.class.datagrid = fr.improve.struts.taglib.layout.util.BasicDatagrid" + NL + "" + NL + "#implementor of the TabsInterface to use." + NL + "tabs.class = fr.improve.struts.taglib.layout.util.BasicTabs" + NL + "" + NL + "# implementor of the FieldInterface to use" + NL + "field.class = fr.improve.struts.taglib.layout.util.BasicField" + NL + "" + NL + "# implementor of the TreeviewInterface to use" + NL + "treeview.class = fr.improve.struts.taglib.layout.util.BasicTreeview" + NL + "" + NL + "# name of the formatter class" + NL + "formatter.class = chrome.xmdl.lib.ui.web.form.UniversalFormatter" + NL + "" + NL + "# name of the policy class" + NL + "policy.class = " + NL + "" + NL + "# name of the formutils class" + NL + "formutils.class = fr.improve.struts.taglib.layout.util.BasicFormUtils" + NL + "" + NL + "# name of the image in the image dir to use as the sort pictogram" + NL + "layout.sort = sort.gif" + NL + "layout.sort.forward = sort.gif" + NL + "layout.sort.reverse = sort.gif" + NL + "layout.sort.label = sort" + NL + "" + NL + "#name of the image and the label for the pager." + NL + "layout.pager.previous.label = &lt;&lt;" + NL + "layout.pager.previous.img = " + NL + "layout.pager.next.label = &gt;&gt;" + NL + "layout.pager.next.img = " + NL + "layout.pager.maxPageItems = 10" + NL + "layout.pager.maxLinks = 10" + NL + "layout.pager.displayDirect = false" + NL + "" + NL + "#name of the image to use as a (un)checked box pictogram and related labels" + NL + "layout.checkbox.checked = " + NL + "layout.checkbox.checked.label = checked" + NL + "layout.checkbox.unchecked = " + NL + "layout.checkbox.unchecked.label = unchecked" + NL + "" + NL + "#name of the image to use as a calendar pictogram" + NL + "layout.calendar = calendar.gif" + NL + "" + NL + "#if there are both a form and links in a page, follows the link if there are unsaved changes in the form" + NL + "follow.change = true" + NL + "" + NL + "#display the error message next to the error field." + NL + "error.display = true" + NL + "#format the error message using Struts properties (errors.header, errors.footer, errors.prefix, errors.suffix)" + NL + "error.format = false" + NL + "#set the focus on the first error field." + NL + "error.focus = false" + NL + "" + NL + "#require a valid transaction token to sort collection (this forbids the use of back and refresh buttons)" + NL + "sort.token.required = true" + NL + "" + NL + "#keep error messages after a sort" + NL + "sort.error.keep = true" + NL + "" + NL + "#include a token in each hyperlink." + NL + "link.token.include = false" + NL + "" + NL + "#number of menus to load at the same time" + NL + "tree.numberOfMenusLoaded=50" + NL + "" + NL + "#nested compatbility" + NL + "nested.compatibility = false" + NL + "" + NL + "# sort action" + NL + "sortutil.action = sort.do" + NL + "" + NL + "# treeview action" + NL + "treeview.action = treeview.do";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
