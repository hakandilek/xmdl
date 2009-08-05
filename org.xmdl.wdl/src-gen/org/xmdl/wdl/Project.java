/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.Project#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
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
   * @see org.xmdl.wdl.WdlPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Package</em>' attribute.
   * @see #setBasePackage(String)
   * @see org.xmdl.wdl.WdlPackage#getProject_BasePackage()
   * @model
   * @generated
   */
  String getBasePackage();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Project#getBasePackage <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Package</em>' attribute.
   * @see #getBasePackage()
   * @generated
   */
  void setBasePackage(String value);

} // Project
