package org.xmdl.xgen.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdldb.DPackage;
import org.xmdl.xmdldb.DTable;

/**
 * This class is used by the generator to iterate model elements.
 * 
 * @author Hakan Dilek
 */
public class ModelIterator implements Iterator<EObject> {

	/** inner iterator */
	private Iterator<EObject> iterator = null;

	/**
	 * public constructor
	 * 
	 * @param root
	 *            the class model root
	 */
	public ModelIterator(XProject root) {

		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(root);
		List<XPackage> packages = root.getPackages();
		for (Iterator<XPackage> iter = packages.iterator(); iter.hasNext();) {
			XPackage element = iter.next();
			list.add(element);
			List<XClass> classes = element.getClasses();
			for (Iterator<XClass> it = classes.iterator(); it.hasNext();) {
				XClass class1 = it.next();
				list.add(class1);
			}
			List<XEnumeration> enumerations = element.getEnumerations();
			for (Iterator<XEnumeration> iterator = enumerations.iterator(); iterator
					.hasNext();) {
				XEnumeration enumer = iterator.next();
				list.add(enumer);
			}
		}
		iterator = list.iterator();
	}

	/**
	 * public constructor
	 * 
	 * @param root
	 *            the database model root
	 */
	public ModelIterator(DModel root) {

		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(root);
		List<DPackage> packages = root.getDPackages();
		for (Iterator<DPackage> iter = packages.iterator(); iter.hasNext();) {
			DPackage element = (DPackage) iter.next();
			list.add(element);
			List<DTable> tables = element.getDTables();
			for (Iterator<DTable> iterator = tables.iterator(); iterator
					.hasNext();) {
				DTable class1 = (DTable) iterator.next();
				list.add(class1);
			}
		}
		iterator = list.iterator();
	}

	/**
	 * Returns <tt>true</tt> if the iteration has more elements. (In other
	 * words, returns <tt>true</tt> if <tt>next</tt> would return an element
	 * rather than throwing an exception.)
	 * 
	 * @return <tt>true</tt> if the iterator has more elements.
	 */
	public boolean hasNext() {
		return iterator.hasNext();
	}

	/**
	 * Returns the next element in the iteration.
	 * 
	 * @return the next element in the iteration.
	 * @exception NoSuchElementException
	 *                iteration has no more elements.
	 */
	public EObject next() {
		return iterator.next();
	}

	/**
	 * 
	 * Removes from the underlying collection the last element returned by the
	 * iterator (optional operation). This method can be called only once per
	 * call to <tt>next</tt>. The behavior of an iterator is unspecified if the
	 * underlying collection is modified while the iteration is in progress in
	 * any way other than by calling this method.
	 * 
	 * @exception UnsupportedOperationException
	 *                if the <tt>remove</tt> operation is not supported by this
	 *                Iterator.
	 * 
	 * @exception IllegalStateException
	 *                if the <tt>next</tt> method has not yet been called, or
	 *                the <tt>remove</tt> method has already been called after
	 *                the last call to the <tt>next</tt> method.
	 */
	public void remove() {
		iterator.remove();
	}

}
