/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlgenFactory.java,v 1.1 2006/01/16 11:34:20 tr001\tr1d2643 Exp $
 */
package chrome.xmdlgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdlgen.XmdlgenPackage
 * @generated
 */
public interface XmdlgenFactory extends EFactory {
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
	XmdlgenFactory eINSTANCE = new chrome.xmdlgen.impl.XmdlgenFactoryImpl();

	/**
	 * Returns a new object of class '<em>GModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GModel</em>'.
	 * @generated
	 */
	GModel createGModel();

	/**
	 * Returns a new object of class '<em>GPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPackage</em>'.
	 * @generated
	 */
	GPackage createGPackage();

	/**
	 * Returns a new object of class '<em>GClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GClass</em>'.
	 * @generated
	 */
	GClass createGClass();

	/**
	 * Returns a new object of class '<em>GAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAttribute</em>'.
	 * @generated
	 */
	GAttribute createGAttribute();

	/**
	 * Returns a new object of class '<em>XMDL Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMDL Gen Model</em>'.
	 * @generated
	 */
	XMDLGenModel createXMDLGenModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmdlgenPackage getXmdlgenPackage();

} //XmdlgenFactory
