package org.xmdl.genext.taglib.xc;

import java.util.List;

import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.jet.taglib.java.JavaActionsUtil;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;

/**
 * This tag imports the virtual class definitions in the given project or
 * package element.
 * 
 * @author Hakan Dilek
 * 
 */
public class ImportVirtualTag extends BaseEmptyTag {

	public ImportVirtualTag() {
	}

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {

		ImportManager importManager = JavaActionsUtil
				.getImportManager(getOut());
		Object element = fetchObject(context, "element");
		if (element instanceof XClass) {
			XClass xClass = (XClass) element;
			if (isVirtual(xClass)) {
				String name = ClassTagUtils.qualifiedName(xClass);
				importManager.addImport(name);
			}
		}

		if (element instanceof XPackage) {
			XPackage xPackage = (XPackage) element;
			List<XClass> classes = xPackage.getClasses();
			for (XClass cls : classes) {
				if (isVirtual(cls)) {
					String name = ClassTagUtils.qualifiedName(cls);
					importManager.addImport(name);
				}
			}
		}

		if (element instanceof XProject) {
			XProject proj = (XProject) element;
			List<XPackage> packages = proj.getPackages();
			for (XPackage pack : packages) {
				List<XClass> classes = pack.getClasses();
				for (XClass cls : classes) {
					if (isVirtual(cls)) {
						String name = ClassTagUtils.qualifiedName(cls);
						importManager.addImport(name);
					}
				}
			}
		}
	}

	private boolean isVirtual(XClass cls) {
		XClassBehavior b = cls.getBehavior();
		if (b != null && b == XClassBehavior.VIRTUAL) {
			return true;
		}
		return false;
	}

}
