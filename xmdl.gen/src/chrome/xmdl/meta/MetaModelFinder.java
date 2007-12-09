package chrome.xmdl.meta;

import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.XClass;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DTable;

/**
 * Helper class used to locate various meta model elements
 * 
 * @author Hakan Dilek
 * 
 */
public class MetaModelFinder {

	/**
	 * Find the corresponding table of the given class
	 * 
	 * @param clazz
	 *            the class
	 * @return corresponding table
	 */
	public static final DTable findTable(XClass clazz) {
		EObject root = MetaModelHolder.getRoot(MetaModel.XMDL_DB);
		DModel model = (DModel) root;
		LocateTableFromClass visitor = new LocateTableFromClass(clazz);
		model.accept(visitor);
		return visitor.getFound();
	}

}
