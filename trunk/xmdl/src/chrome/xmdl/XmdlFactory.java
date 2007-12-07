/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlFactory.java,v 1.6 2006/02/10 09:32:57 tr001\tr1d2643 Exp $
 */
package chrome.xmdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage
 * @generated
 */
public interface XmdlFactory extends EFactory {
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
    XmdlFactory eINSTANCE = chrome.xmdl.impl.XmdlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>XAttribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XAttribute</em>'.
     * @generated
     */
    XAttribute createXAttribute();

    /**
     * Returns a new object of class '<em>XClass</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XClass</em>'.
     * @generated
     */
    XClass createXClass();

    /**
     * Returns a new object of class '<em>XPackage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XPackage</em>'.
     * @generated
     */
    XPackage createXPackage();

    /**
     * Returns a new object of class '<em>XProject</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XProject</em>'.
     * @generated
     */
    XProject createXProject();

    /**
     * Returns a new object of class '<em>XMethod</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XMethod</em>'.
     * @generated
     */
    XMethod createXMethod();

    /**
     * Returns a new object of class '<em>XParameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XParameter</em>'.
     * @generated
     */
    XParameter createXParameter();

    /**
     * Returns a new object of class '<em>XException</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XException</em>'.
     * @generated
     */
    XException createXException();

    /**
     * Returns a new object of class '<em>XVisitor Base</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XVisitor Base</em>'.
     * @generated
     */
    XVisitorBase createXVisitorBase();

    /**
     * Returns a new object of class '<em>XMDL Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XMDL Model</em>'.
     * @generated
     */
    XMDLModel createXMDLModel();

    /**
     * Returns a new object of class '<em>XEnumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XEnumeration</em>'.
     * @generated
     */
    XEnumeration createXEnumeration();

    /**
     * Returns a new object of class '<em>XEnumeration Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XEnumeration Literal</em>'.
     * @generated
     */
    XEnumerationLiteral createXEnumerationLiteral();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    XmdlPackage getXmdlPackage();

} //XmdlFactory
