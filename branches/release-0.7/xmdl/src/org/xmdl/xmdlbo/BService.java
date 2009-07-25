/**
 * <copyright>
 * </copyright>
 *
 * $Id: BService.java,v 1.3 2006/01/26 14:15:31 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo;


import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdlbo.BService#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BService#getBPackage <em>BPackage</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BService#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BService#getXClass <em>XClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdlbo.XmdlboPackage#getBService()
 * @model
 * @generated
 */
public interface BService extends EObject{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>BPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlbo.BPackage#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPackage</em>' container reference.
	 * @see #setBPackage(BPackage)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBService_BPackage()
	 * @see org.xmdl.xmdlbo.BPackage#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	BPackage getBPackage();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BService#getBPackage <em>BPackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPackage</em>' container reference.
	 * @see #getBPackage()
	 * @generated
	 */
	void setBPackage(BPackage value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdl.xmdlbo.BMethod}.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlbo.BMethod#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBService_Methods()
	 * @see org.xmdl.xmdlbo.BMethod#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<BMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>XClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XClass</em>' reference.
	 * @see #setXClass(XClass)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBService_XClass()
	 * @model required="true"
	 * @generated
	 */
	XClass getXClass();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BService#getXClass <em>XClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XClass</em>' reference.
	 * @see #getXClass()
	 * @generated
	 */
	void setXClass(XClass value);

} // BService
