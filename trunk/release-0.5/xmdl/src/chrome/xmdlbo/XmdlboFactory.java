/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlboFactory.java,v 1.2 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdlbo.XmdlboPackage
 * @generated
 */
public interface XmdlboFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdlboFactory eINSTANCE = chrome.xmdlbo.impl.XmdlboFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BModel</em>'.
	 * @generated
	 */
	BModel createBModel();

	/**
	 * Returns a new object of class '<em>XMDLBO Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMDLBO Model</em>'.
	 * @generated
	 */
	XMDLBOModel createXMDLBOModel();

	/**
	 * Returns a new object of class '<em>BPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPackage</em>'.
	 * @generated
	 */
	BPackage createBPackage();

	/**
	 * Returns a new object of class '<em>BService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BService</em>'.
	 * @generated
	 */
	BService createBService();

	/**
	 * Returns a new object of class '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BParameter</em>'.
	 * @generated
	 */
	BParameter createBParameter();

	/**
	 * Returns a new object of class '<em>BMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BMethod</em>'.
	 * @generated
	 */
	BMethod createBMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmdlboPackage getXmdlboPackage();

} //XmdlboFactory
