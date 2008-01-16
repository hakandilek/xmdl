package org.xmdl.meta;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdldb.DField;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdldb.DTable;


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

    /**
     * Find the corresponding column of the given attribute
     * 
     * @param attribute
     *            the attribute
     * @return corresponding column
     */
    public static DField findColumn(XAttribute attribute) {
        EObject root = MetaModelHolder.getRoot(MetaModel.XMDL_DB);
        DModel model = (DModel) root;
        LocateColumnFromAttribute visitor = new LocateColumnFromAttribute(attribute);
        model.accept(visitor);
        return visitor.getFound();
    }

}
