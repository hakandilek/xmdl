/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.xmdl.wdl.Attribute#getManyReference <em>Many Reference</em>}</li>
 *   <li>{@link org.xmdl.wdl.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.xmdl.wdl.WdlPackage#getAttribute_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Attribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Many Reference</b></em>' attribute.
   * The literals are from the enumeration {@link org.xmdl.wdl.AttributeManyReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many Reference</em>' attribute.
   * @see org.xmdl.wdl.AttributeManyReference
   * @see #setManyReference(AttributeManyReference)
   * @see org.xmdl.wdl.WdlPackage#getAttribute_ManyReference()
   * @model
   * @generated
   */
  AttributeManyReference getManyReference();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Attribute#getManyReference <em>Many Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many Reference</em>' attribute.
   * @see org.xmdl.wdl.AttributeManyReference
   * @see #getManyReference()
   * @generated
   */
  void setManyReference(AttributeManyReference value);

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
   * @see org.xmdl.wdl.WdlPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
