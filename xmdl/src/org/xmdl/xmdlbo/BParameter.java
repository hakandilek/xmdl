/**
 * <copyright>
 * </copyright>
 *
 * $Id: BParameter.java,v 1.3 2006/01/26 14:15:31 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo;


import org.eclipse.emf.ecore.EObject;
import org.xmdl.xmdl.XType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.xmdlbo.BParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BParameter#getNature <em>Nature</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BParameter#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.BParameter#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter()
 * @model
 * @generated
 */
public interface BParameter extends EObject{
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
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(XType)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	XType getType();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XType value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xmdl.xmdlbo.BParameterNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.xmdl.xmdlbo.BParameterNature
	 * @see #setNature(BParameterNature)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter_Nature()
	 * @model
	 * @generated
	 */
	BParameterNature getNature();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BParameter#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.xmdl.xmdlbo.BParameterNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(BParameterNature value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BParameter#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdl.xmdlbo.BMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(BMethod)
	 * @see org.xmdl.xmdlbo.XmdlboPackage#getBParameter_Method()
	 * @see org.xmdl.xmdlbo.BMethod#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	BMethod getMethod();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdlbo.BParameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(BMethod value);

} // BParameter
