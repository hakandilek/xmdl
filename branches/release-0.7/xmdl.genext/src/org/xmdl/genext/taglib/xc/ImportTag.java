package org.xmdl.genext.taglib.xc;

import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.taglib.java.JavaActionsUtil;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;


/**
 * This tag replaces the given elements qualified name in the given pattern. If
 * the pattern does not contain an $element variable, then pattern is directly
 * imported.
 * 
 * @author Hakan Dilek
 * 
 */
public class ImportTag extends BaseEmptyTag {

    /** element variable to be replaced qualified name */
    private static final String ELEMENT = "\\$element";

    /** element pattern */
    private static final String ELEMENT_PATTERN = ".*" + ELEMENT + ".*";

    public ImportTag() {
    }

    @Override
    public void doAction(TagInfo td, JET2Context context, JET2Writer out)
            throws JET2TagException {

        String pattern = fetchAttribute("pattern");
        String name = "";
        if (pattern.matches(ELEMENT_PATTERN)) {
            String s = "";
            Object object = fetchObject(context, "element");
            if (object instanceof XClass) {
                XClass xClass = (XClass) object;
                s = ClassTagUtils.qualifiedName(xClass);
            }

            if (object instanceof XPackage) {
                XPackage xPackage = (XPackage) object;
                s = ClassTagUtils.qualifiedName(xPackage);
            }

            if (object instanceof XEnumeration) {
                XEnumeration enumeration = (XEnumeration) object;
                s = ClassTagUtils.qualifiedName(enumeration);
            }
            name = pattern.replaceAll(ELEMENT, s);
        } else {
            name = pattern;
        }

        ImportManager importManager = JavaActionsUtil
                .getImportManager(getOut());
        importManager.addImport(name);
    }

}
