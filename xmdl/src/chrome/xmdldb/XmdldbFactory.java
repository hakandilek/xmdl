/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdldb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdldb.XmdldbPackage
 * @generated
 */
public interface XmdldbFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdldbFactory eINSTANCE = chrome.xmdldb.impl.XmdldbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DModel</em>'.
	 * @generated
	 */
	DModel createDModel();

	/**
	 * Returns a new object of class '<em>DPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DPackage</em>'.
	 * @generated
	 */
	DPackage createDPackage();

	/**
	 * Returns a new object of class '<em>DTable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTable</em>'.
	 * @generated
	 */
	DTable createDTable();

	/**
	 * Returns a new object of class '<em>DField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DField</em>'.
	 * @generated
	 */
	DField createDField();

	/**
	 * Returns a new object of class '<em>XMDLDB Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMDLDB Model</em>'.
	 * @generated
	 */
	XMDLDBModel createXMDLDBModel();

	/**
	 * Returns a new object of class '<em>DIndex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DIndex</em>'.
	 * @generated
	 */
	DIndex createDIndex();

	/**
	 * Returns a new object of class '<em>DVisitor Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DVisitor Base</em>'.
	 * @generated
	 */
	DVisitorBase createDVisitorBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmdldbPackage getXmdldbPackage();

} //XmdldbFactory
